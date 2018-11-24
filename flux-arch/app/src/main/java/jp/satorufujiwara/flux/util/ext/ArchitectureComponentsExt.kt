package jp.satorufujiwara.flux.util.ext

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*

fun <T> LiveData<T>.observe(owner: LifecycleOwner, observer: (T?) -> Unit) = observe(owner, Observer<T> {
  observer.invoke(it)
})

fun <X, Y> LiveData<X>.switchMap(func: (X) -> LiveData<Y>)
    = Transformations.switchMap(this, func)

operator fun ViewModelProvider.Factory.get(activity: FragmentActivity)
    = ViewModelProviders.of(activity, this)

operator fun ViewModelProvider.Factory.get(fragment: Fragment)
    = ViewModelProviders.of(fragment, this)