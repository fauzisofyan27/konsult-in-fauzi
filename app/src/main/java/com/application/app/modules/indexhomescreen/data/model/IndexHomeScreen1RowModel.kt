package com.application.app.modules.indexhomescreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexHomeScreen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersiapanKarir: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_persiapan_karir)

)
