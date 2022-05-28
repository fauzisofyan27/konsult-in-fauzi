package com.application.app.modules.indexhistoryscreen.ui

import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIndexHistoryScreenBinding
import com.application.app.modules.indexhistoryscreen.`data`.model.IndexHistoryScreen1RowModel
import com.application.app.modules.indexhistoryscreen.`data`.viewmodel.IndexHistoryScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IndexHistoryScreenActivity :
    BaseActivity<ActivityIndexHistoryScreenBinding>(R.layout.activity_index_history_screen) {
  private val viewModel: IndexHistoryScreenVM by viewModels<IndexHistoryScreenVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerIndexHistoryScreenAdapter =
    RecyclerIndexHistoryScreenAdapter(viewModel.recyclerIndexHistoryScreenList.value?:mutableListOf())
    binding.recyclerIndexHistoryScreen.adapter = recyclerIndexHistoryScreenAdapter
    recyclerIndexHistoryScreenAdapter.setOnItemClickListener(
    object : RecyclerIndexHistoryScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IndexHistoryScreen1RowModel) {
        onClickRecyclerIndexHistoryScreen(view, position, item)
      }
    }
    )
    viewModel.recyclerIndexHistoryScreenList.observe(this) {
      recyclerIndexHistoryScreenAdapter.updateData(it)
    }
    binding.indexHistoryScreenVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerIndexHistoryScreen(
    view: View,
    position: Int,
    item: IndexHistoryScreen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INDEX_HISTORY_SCREEN_ACTIVITY"
  }
}
