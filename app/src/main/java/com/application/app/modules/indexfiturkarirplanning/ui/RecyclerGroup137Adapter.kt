package com.application.app.modules.indexfiturkarirplanning.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexFiturKarirPlanning3Binding
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup137Adapter(
  public var list: List<IndexFiturKarirPlanning3RowModel>
) : RecyclerView.Adapter<RecyclerGroup137Adapter.RowIndexFiturKarirPlanning3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIndexFiturKarirPlanning3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_fitur_karir_planning3,parent,false)
    return RowIndexFiturKarirPlanning3VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexFiturKarirPlanning3VH, position: Int): Unit {
    val indexFiturKarirPlanning3RowModel = IndexFiturKarirPlanning3RowModel()
    // TODO uncomment following line after integration with data source
    // val indexFiturKarirPlanning3RowModel = list[position]
    holder.binding.indexFiturKarirPlanning3RowModel = indexFiturKarirPlanning3RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexFiturKarirPlanning3RowModel>): Unit {
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
      item: IndexFiturKarirPlanning3RowModel
    ): Unit {
    }
  }

  public inner class RowIndexFiturKarirPlanning3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexFiturKarirPlanning3Binding =
        RowIndexFiturKarirPlanning3Binding.bind(itemView)
  }
}
