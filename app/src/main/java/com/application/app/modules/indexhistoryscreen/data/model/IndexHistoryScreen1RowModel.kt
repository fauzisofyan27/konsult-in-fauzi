package com.application.app.modules.indexhistoryscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexHistoryScreen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtOlehRicardArc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_oleh_ricard_arc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKonsultasiPers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_konsultasi_pers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSenin9Mei20: String? =
      MyApp.getInstance().resources.getString(R.string.msg_senin_9_mei_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTotalHarga: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_total_harga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRp50000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_50_000)

)
