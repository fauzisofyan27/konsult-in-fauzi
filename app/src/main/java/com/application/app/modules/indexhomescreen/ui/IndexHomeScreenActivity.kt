package com.application.app.modules.indexhomescreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIndexHomeScreenBinding
import com.application.app.modules.indexfiturkarirplanning.ui.IndexFiturKarirPlanningActivity
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen1RowModel
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen2RowModel
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen3RowModel
import com.application.app.modules.indexhomescreen.`data`.viewmodel.IndexHomeScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IndexHomeScreenActivity :
    BaseActivity<ActivityIndexHomeScreenBinding>(R.layout.activity_index_home_screen) {
  private val viewModel: IndexHomeScreenVM by viewModels<IndexHomeScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerIndexHomeScreenAdapter =
    RecyclerIndexHomeScreenAdapter(viewModel.recyclerIndexHomeScreenList.value?:mutableListOf())
    binding.recyclerIndexHomeScreen.adapter = recyclerIndexHomeScreenAdapter
    recyclerIndexHomeScreenAdapter.setOnItemClickListener(
    object : RecyclerIndexHomeScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IndexHomeScreen1RowModel) {
        onClickRecyclerIndexHomeScreen(view, position, item)
      }
    }
    )
    viewModel.recyclerIndexHomeScreenList.observe(this) {
      recyclerIndexHomeScreenAdapter.updateData(it)
    }
    val recyclerGroup98Adapter =
    RecyclerGroup98Adapter(viewModel.recyclerGroup98List.value?:mutableListOf())
    binding.recyclerGroup98.adapter = recyclerGroup98Adapter
    recyclerGroup98Adapter.setOnItemClickListener(
    object : RecyclerGroup98Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IndexHomeScreen2RowModel) {
        onClickRecyclerGroup98(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup98List.observe(this) {
      recyclerGroup98Adapter.updateData(it)
    }
    val recyclerKatalogAdapter =
    RecyclerKatalogAdapter(viewModel.recyclerKatalogList.value?:mutableListOf())
    binding.recyclerKatalog.adapter = recyclerKatalogAdapter
    recyclerKatalogAdapter.setOnItemClickListener(
    object : RecyclerKatalogAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IndexHomeScreen3RowModel) {
        onClickRecyclerKatalog(view, position, item)
      }
    }
    )
    viewModel.recyclerKatalogList.observe(this) {
      recyclerKatalogAdapter.updateData(it)
    }
    binding.indexHomeScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerIndexHomeScreen(
    view: View,
    position: Int,
    item: IndexHomeScreen1RowModel
  ): Unit {
    when(view.id) {
      R.id.constraintMenuPersiapan ->  {
        val destIntent = IndexFiturKarirPlanningActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public fun onClickRecyclerGroup98(
    view: View,
    position: Int,
    item: IndexHomeScreen2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerKatalog(
    view: View,
    position: Int,
    item: IndexHomeScreen3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INDEX_HOME_SCREEN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IndexHomeScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
