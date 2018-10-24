package jp.satorufujiwara.flux.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import jp.satorufujiwara.flux.R
import jp.satorufujiwara.flux.databinding.MainActivityBinding
import jp.satorufujiwara.flux.di.StoreProvider
import jp.satorufujiwara.flux.util.ext.observe
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

  @Inject lateinit var androidInjector: DispatchingAndroidInjector<Fragment>
  @Inject lateinit var storeProvider: StoreProvider
  @Inject lateinit var actionCreator: MainActionCreator
  private val store by lazy { storeProvider.get(this, MainStore::class) }
  private val binding by lazy { DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity) }
  private val adapter = MainAdapter()
  private val ownerName = "satorufujiwara"

  override fun supportFragmentInjector() = androidInjector

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding.recyclerView.adapter = adapter
    binding.recyclerView.layoutManager = LinearLayoutManager(this)
    adapter.onItemClicked = {
      actionCreator.showRepoDetailDialog(this, ownerName, it.name)
    }

    store.repos.observe(this) {
      it ?: return@observe
      adapter.run {
        items.clear()
        items.addAll(it)
        notifyDataSetChanged()
      }
    }
    actionCreator.fetchRepo(ownerName)
  }
}


