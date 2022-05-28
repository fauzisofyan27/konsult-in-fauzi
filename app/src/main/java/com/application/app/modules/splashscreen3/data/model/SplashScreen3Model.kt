package com.application.app.modules.splashscreen3.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashScreen3Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtKonsultasiApa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_konsultasi_apa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTersediaBerbag: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tersedia_berbag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
