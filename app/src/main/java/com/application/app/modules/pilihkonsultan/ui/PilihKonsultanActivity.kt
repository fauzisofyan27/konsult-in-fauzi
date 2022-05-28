package com.application.app.modules.pilihkonsultan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPilihKonsultanBinding
import com.application.app.modules.indexfiturkarirplanning.ui.IndexFiturKarirPlanningActivity
import com.application.app.modules.pilihkonsultan.`data`.model.PilihKonsultan1RowModel
import com.application.app.modules.pilihkonsultan.`data`.viewmodel.PilihKonsultanVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PilihKonsultanActivity :
    BaseActivity<ActivityPilihKonsultanBinding>(R.layout.activity_pilih_konsultan) {
  private val viewModel: PilihKonsultanVM by viewModels<PilihKonsultanVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerPilihKonsultanAdapter =
    RecyclerPilihKonsultanAdapter(viewModel.recyclerPilihKonsultanList.value?:mutableListOf())
    binding.recyclerPilihKonsultan.adapter = recyclerPilihKonsultanAdapter
    recyclerPilihKonsultanAdapter.setOnItemClickListener(
    object : RecyclerPilihKonsultanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PilihKonsultan1RowModel) {
        onClickRecyclerPilihKonsultan(view, position, item)
      }
    }
    )
    viewModel.recyclerPilihKonsultanList.observe(this) {
      recyclerPilihKonsultanAdapter.updateData(it)
    }
    binding.pilihKonsultanVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.imageGroup65.setOnClickListener {
      val destIntent = IndexFiturKarirPlanningActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerPilihKonsultan(
    view: View,
    position: Int,
    item: PilihKonsultan1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "PILIH_KONSULTAN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PilihKonsultanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
