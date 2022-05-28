package com.application.app.modules.pilihkonsultan.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class PilihKonsultan1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBiayaKonsultas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_biaya_konsultas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRp5000060: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rp_50_000_60)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersiapanKarir: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_persiapan_karir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRicardArchiSa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ricard_archi_sa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUniversitasIst: String? =
      MyApp.getInstance().resources.getString(R.string.msg_universitas_ist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt4929: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_9_29)

)
