package com.application.app.modules.indexhistoryscreen.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class IndexHistoryScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtBerhasil: String? = MyApp.getInstance().resources.getString(R.string.lbl_berhasil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGagal: String? = MyApp.getInstance().resources.getString(R.string.lbl_gagal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMenunggu: String? = MyApp.getInstance().resources.getString(R.string.lbl_menunggu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRiwayatTransak: String? =
      MyApp.getInstance().resources.getString(R.string.msg_riwayat_transak)
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
  public var etCariTransaksiValue: String? = null
)
