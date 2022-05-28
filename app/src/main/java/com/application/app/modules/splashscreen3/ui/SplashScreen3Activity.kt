package com.application.app.modules.splashscreen3.ui

import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashScreen3Binding
import com.application.app.modules.splashscreen3.`data`.model.SplashScreen4RowModel
import com.application.app.modules.splashscreen3.`data`.viewmodel.SplashScreen3VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SplashScreen3Activity :
    BaseActivity<ActivitySplashScreen3Binding>(R.layout.activity_splash_screen_3) {
  private val viewModel: SplashScreen3VM by viewModels<SplashScreen3VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerGroup262Adapter =
    RecyclerGroup262Adapter(viewModel.recyclerGroup262List.value?:mutableListOf())
    binding.recyclerGroup262.adapter = recyclerGroup262Adapter
    recyclerGroup262Adapter.setOnItemClickListener(
    object : RecyclerGroup262Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SplashScreen4RowModel) {
        onClickRecyclerGroup262(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup262List.observe(this) {
      recyclerGroup262Adapter.updateData(it)
    }
    binding.splashScreen3VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup262(
    view: View,
    position: Int,
    item: SplashScreen4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "SPLASH_SCREEN3ACTIVITY"
  }
}
