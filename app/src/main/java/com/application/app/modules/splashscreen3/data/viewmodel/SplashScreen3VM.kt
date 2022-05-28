package com.application.app.modules.splashscreen3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.splashscreen3.`data`.model.SplashScreen3Model
import com.application.app.modules.splashscreen3.`data`.model.SplashScreen4RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class SplashScreen3VM : ViewModel(), KoinComponent {
  public val splashScreen3Model: MutableLiveData<SplashScreen3Model> =
      MutableLiveData(SplashScreen3Model())

  public var navArguments: Bundle? = null

  public val recyclerGroup262List: MutableLiveData<MutableList<SplashScreen4RowModel>> =
      MutableLiveData(mutableListOf())
}
