package com.application.app.modules.splashscreen2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashscreen2.`data`.model.SplashScreen2Model
import org.koin.core.KoinComponent

public class SplashScreen2VM : ViewModel(), KoinComponent {
  public val splashScreen2Model: MutableLiveData<SplashScreen2Model> =
      MutableLiveData(SplashScreen2Model())

  public var navArguments: Bundle? = null
}
