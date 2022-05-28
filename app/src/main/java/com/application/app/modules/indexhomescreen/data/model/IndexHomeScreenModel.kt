package com.application.app.modules.indexhomescreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexHomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPilihKonsultas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilih_konsultas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtikel: String? = MyApp.getInstance().resources.getString(R.string.lbl_artikel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRekomendasiHar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rekomendasi_har)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBeranda: String? = MyApp.getInstance().resources.getString(R.string.lbl_beranda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRiwayat: String? = MyApp.getInstance().resources.getString(R.string.lbl_riwayat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtikel1: String? = MyApp.getInstance().resources.getString(R.string.lbl_artikel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBeliin: String? = MyApp.getInstance().resources.getString(R.string.lbl_beli_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAkun: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHaloLeonardo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_halo_leonardo)

)
