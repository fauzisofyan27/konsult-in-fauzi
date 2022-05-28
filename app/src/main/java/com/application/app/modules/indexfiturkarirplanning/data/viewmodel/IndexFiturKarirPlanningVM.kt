package com.application.app.modules.indexfiturkarirplanning.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning1RowModel
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning2RowModel
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning3RowModel
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanningModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

public class IndexFiturKarirPlanningVM : ViewModel(), KoinComponent {
  public val indexFiturKarirPlanningModel: MutableLiveData<IndexFiturKarirPlanningModel> =
      MutableLiveData(IndexFiturKarirPlanningModel())

  public var navArguments: Bundle? = null

  public val recyclerMenuBarisPertList:
      MutableLiveData<MutableList<IndexFiturKarirPlanning1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup134List: MutableLiveData<MutableList<IndexFiturKarirPlanning2RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerGroup137List: MutableLiveData<MutableList<IndexFiturKarirPlanning3RowModel>> =
      MutableLiveData(mutableListOf())
}
