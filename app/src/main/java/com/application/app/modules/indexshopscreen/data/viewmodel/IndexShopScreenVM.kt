package com.application.app.modules.indexshopscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.indexshopscreen.`data`.model.IndexShopScreen1RowModel
import com.application.app.modules.indexshopscreen.`data`.model.IndexShopScreenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class IndexShopScreenVM : ViewModel(), KoinComponent {
  public val indexShopScreenModel: MutableLiveData<IndexShopScreenModel> =
      MutableLiveData(IndexShopScreenModel())

  public var navArguments: Bundle? = null

  public val recyclerIndexShopScreenList: MutableLiveData<MutableList<IndexShopScreen1RowModel>> =
      MutableLiveData(mutableListOf())
}
