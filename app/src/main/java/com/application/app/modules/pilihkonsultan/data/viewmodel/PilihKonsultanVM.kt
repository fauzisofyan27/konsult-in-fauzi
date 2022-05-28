package com.application.app.modules.pilihkonsultan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.pilihkonsultan.`data`.model.PilihKonsultan1RowModel
import com.application.app.modules.pilihkonsultan.`data`.model.PilihKonsultanModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class PilihKonsultanVM : ViewModel(), KoinComponent {
  public val pilihKonsultanModel: MutableLiveData<PilihKonsultanModel> =
      MutableLiveData(PilihKonsultanModel())

  public var navArguments: Bundle? = null

  public val recyclerPilihKonsultanList: MutableLiveData<MutableList<PilihKonsultan1RowModel>> =
      MutableLiveData(mutableListOf())
}
