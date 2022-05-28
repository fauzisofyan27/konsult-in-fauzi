package com.application.app.modules.indexshopscreen.ui

import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIndexShopScreenBinding
import com.application.app.modules.indexshopscreen.`data`.model.IndexShopScreen1RowModel
import com.application.app.modules.indexshopscreen.`data`.viewmodel.IndexShopScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IndexShopScreenActivity :
    BaseActivity<ActivityIndexShopScreenBinding>(R.layout.activity_index_shop_screen) {
  private val viewModel: IndexShopScreenVM by viewModels<IndexShopScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerIndexShopScreenAdapter =
    RecyclerIndexShopScreenAdapter(viewModel.recyclerIndexShopScreenList.value?:mutableListOf())
    binding.recyclerIndexShopScreen.adapter = recyclerIndexShopScreenAdapter
    recyclerIndexShopScreenAdapter.setOnItemClickListener(
    object : RecyclerIndexShopScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IndexShopScreen1RowModel) {
        onClickRecyclerIndexShopScreen(view, position, item)
      }
    }
    )
    viewModel.recyclerIndexShopScreenList.observe(this) {
      recyclerIndexShopScreenAdapter.updateData(it)
    }
    binding.indexShopScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerIndexShopScreen(
    view: View,
    position: Int,
    item: IndexShopScreen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INDEX_SHOP_SCREEN_ACTIVITY"
  }
}
