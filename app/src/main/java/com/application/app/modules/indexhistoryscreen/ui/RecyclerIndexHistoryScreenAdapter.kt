package com.application.app.modules.indexhistoryscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexHistoryScreen1Binding
import com.application.app.modules.indexhistoryscreen.`data`.model.IndexHistoryScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerIndexHistoryScreenAdapter(
  public var list: List<IndexHistoryScreen1RowModel>
) : RecyclerView.Adapter<RecyclerIndexHistoryScreenAdapter.RowIndexHistoryScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIndexHistoryScreen1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_history_screen1,parent,false)
    return RowIndexHistoryScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexHistoryScreen1VH, position: Int): Unit {
    val indexHistoryScreen1RowModel = IndexHistoryScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val indexHistoryScreen1RowModel = list[position]
    holder.binding.indexHistoryScreen1RowModel = indexHistoryScreen1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexHistoryScreen1RowModel>): Unit {
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
      item: IndexHistoryScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowIndexHistoryScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexHistoryScreen1Binding = RowIndexHistoryScreen1Binding.bind(itemView)
  }
}
