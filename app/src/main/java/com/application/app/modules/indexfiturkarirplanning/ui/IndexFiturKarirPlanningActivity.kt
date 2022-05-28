package com.application.app.modules.indexfiturkarirplanning.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIndexFiturKarirPlanningBinding
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning1RowModel
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning2RowModel
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning3RowModel
import com.application.app.modules.indexfiturkarirplanning.`data`.viewmodel.IndexFiturKarirPlanningVM
import com.application.app.modules.indexhomescreen.ui.IndexHomeScreenActivity
import com.application.app.modules.pilihkonsultan.ui.PilihKonsultanActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IndexFiturKarirPlanningActivity :
    BaseActivity<ActivityIndexFiturKarirPlanningBinding>(R.layout.activity_index_fitur_karir_planning)
    {
  private val viewModel: IndexFiturKarirPlanningVM by viewModels<IndexFiturKarirPlanningVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerMenuBarisPertAdapter =
    RecyclerMenuBarisPertAdapter(viewModel.recyclerMenuBarisPertList.value?:mutableListOf())
    binding.recyclerMenuBarisPert.adapter = recyclerMenuBarisPertAdapter
    recyclerMenuBarisPertAdapter.setOnItemClickListener(
    object : RecyclerMenuBarisPertAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IndexFiturKarirPlanning1RowModel) {
        onClickRecyclerMenuBarisPert(view, position, item)
      }
    }
    )
    viewModel.recyclerMenuBarisPertList.observe(this) {
      recyclerMenuBarisPertAdapter.updateData(it)
    }
    val recyclerGroup134Adapter =
    RecyclerGroup134Adapter(viewModel.recyclerGroup134List.value?:mutableListOf())
    binding.recyclerGroup134.adapter = recyclerGroup134Adapter
    recyclerGroup134Adapter.setOnItemClickListener(
    object : RecyclerGroup134Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IndexFiturKarirPlanning2RowModel) {
        onClickRecyclerGroup134(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup134List.observe(this) {
      recyclerGroup134Adapter.updateData(it)
    }
    val recyclerGroup137Adapter =
    RecyclerGroup137Adapter(viewModel.recyclerGroup137List.value?:mutableListOf())
    binding.recyclerGroup137.adapter = recyclerGroup137Adapter
    recyclerGroup137Adapter.setOnItemClickListener(
    object : RecyclerGroup137Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IndexFiturKarirPlanning3RowModel) {
        onClickRecyclerGroup137(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup137List.observe(this) {
      recyclerGroup137Adapter.updateData(it)
    }
    binding.indexFiturKarirPlanningVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageGroup65.setOnClickListener {
      val destIntent = IndexHomeScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerMenuBarisPert(
    view: View,
    position: Int,
    item: IndexFiturKarirPlanning1RowModel
  ): Unit {
    when(view.id) {
      R.id.constraintMenuPersiapan -> {
        val destIntent = PilihKonsultanActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public fun onClickRecyclerGroup134(
    view: View,
    position: Int,
    item: IndexFiturKarirPlanning2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup137(
    view: View,
    position: Int,
    item: IndexFiturKarirPlanning3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INDEX_FITUR_KARIR_PLANNING_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IndexFiturKarirPlanningActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
