package com.application.app.modules.indexfiturkarirplanning.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexFiturKarirPlanningModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRekomendasiHar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rekomendasi_har)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtikel: String? = MyApp.getInstance().resources.getString(R.string.lbl_artikel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersiapanKarir: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_persiapan_karir)

)
