package com.application.app.modules.indexhistoryscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.indexhistoryscreen.`data`.model.IndexHistoryScreen1RowModel
import com.application.app.modules.indexhistoryscreen.`data`.model.IndexHistoryScreenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class IndexHistoryScreenVM : ViewModel(), KoinComponent {
  public val indexHistoryScreenModel: MutableLiveData<IndexHistoryScreenModel> =
      MutableLiveData(IndexHistoryScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerIndexHistoryScreenList:
      MutableLiveData<MutableList<IndexHistoryScreen1RowModel>> = MutableLiveData(mutableListOf())
}
