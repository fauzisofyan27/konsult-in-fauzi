package com.application.app.modules.indexhomescreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexHomeScreen2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDataCenterAda: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_center_ada)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDataCenterPal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_center_pal)

)
