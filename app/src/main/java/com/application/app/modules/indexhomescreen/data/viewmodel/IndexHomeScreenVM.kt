package com.application.app.modules.indexhomescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen1RowModel
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen2RowModel
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen3RowModel
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class IndexHomeScreenVM : ViewModel(), KoinComponent {
  public val indexHomeScreenModel: MutableLiveData<IndexHomeScreenModel> =
      MutableLiveData(IndexHomeScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerIndexHomeScreenList: MutableLiveData<MutableList<IndexHomeScreen1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup98List: MutableLiveData<MutableList<IndexHomeScreen2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerKatalogList: MutableLiveData<MutableList<IndexHomeScreen3RowModel>> =
      MutableLiveData(mutableListOf())
}
