package com.application.app.modules.splashscreen2.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashScreen2Binding
import com.application.app.modules.splashscreen2.`data`.viewmodel.SplashScreen2VM
import kotlin.String
import kotlin.Unit

public class SplashScreen2Activity :
    BaseActivity<ActivitySplashScreen2Binding>(R.layout.activity_splash_screen_2) {
  private val viewModel: SplashScreen2VM by viewModels<SplashScreen2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreen2VM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "SPLASH_SCREEN2ACTIVITY"
  }
}
