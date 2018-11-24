package jp.satorufujiwara.flux.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.reflect.KClass

interface StoreProvider : ViewModelProvider.Factory {

  fun <T : ViewModel> get(activity: FragmentActivity, storeClass: KClass<T>): T

  fun <T : ViewModel> get(fragment: Fragment, storeClass: KClass<T>): T

}