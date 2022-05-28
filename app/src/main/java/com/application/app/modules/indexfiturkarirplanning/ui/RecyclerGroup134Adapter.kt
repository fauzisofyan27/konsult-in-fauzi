package com.application.app.modules.indexfiturkarirplanning.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexFiturKarirPlanning2Binding
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup134Adapter(
  public var list: List<IndexFiturKarirPlanning2RowModel>
) : RecyclerView.Adapter<RecyclerGroup134Adapter.RowIndexFiturKarirPlanning2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIndexFiturKarirPlanning2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_fitur_karir_planning2,parent,false)
    return RowIndexFiturKarirPlanning2VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexFiturKarirPlanning2VH, position: Int): Unit {
    val indexFiturKarirPlanning2RowModel = IndexFiturKarirPlanning2RowModel()
    // TODO uncomment following line after integration with data source
    // val indexFiturKarirPlanning2RowModel = list[position]
    holder.binding.indexFiturKarirPlanning2RowModel = indexFiturKarirPlanning2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexFiturKarirPlanning2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: IndexFiturKarirPlanning2RowModel
    ): Unit {
    }
  }

  public inner class RowIndexFiturKarirPlanning2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexFiturKarirPlanning2Binding =
        RowIndexFiturKarirPlanning2Binding.bind(itemView)
  }
}
