package com.application.app.modules.indexshopscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexShopScreenModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBeliin: String? = MyApp.getInstance().resources.getString(R.string.lbl_beli_in)
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
  public var txtArtikel: String? = MyApp.getInstance().resources.getString(R.string.lbl_artikel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBeliin1: String? = MyApp.getInstance().resources.getString(R.string.lbl_beli_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAkun: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etCariBarangValue: String? = null
)
