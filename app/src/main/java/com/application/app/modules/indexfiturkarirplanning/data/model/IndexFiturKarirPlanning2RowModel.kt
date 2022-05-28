package com.application.app.modules.indexfiturkarirplanning.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexFiturKarirPlanning2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBukuMindPlatt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buku_mind_platt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRp100000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp100_000)

)
