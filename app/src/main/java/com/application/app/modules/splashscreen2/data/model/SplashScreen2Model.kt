package com.application.app.modules.splashscreen2.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashScreen2Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKamiSangatSen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kami_sangat_sen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)

)
