package com.application.app.modules.indexhomescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexHomeScreen2Binding
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup98Adapter(
  public var list: List<IndexHomeScreen2RowModel>
) : RecyclerView.Adapter<RecyclerGroup98Adapter.RowIndexHomeScreen2VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIndexHomeScreen2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_home_screen2,parent,false)
    return RowIndexHomeScreen2VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexHomeScreen2VH, position: Int): Unit {
    val indexHomeScreen2RowModel = IndexHomeScreen2RowModel()
    // TODO uncomment following line after integration with data source
    // val indexHomeScreen2RowModel = list[position]
    holder.binding.indexHomeScreen2RowModel = indexHomeScreen2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexHomeScreen2RowModel>): Unit {
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
      item: IndexHomeScreen2RowModel
    ): Unit {
    }
  }

  public inner class RowIndexHomeScreen2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexHomeScreen2Binding = RowIndexHomeScreen2Binding.bind(itemView)
  }
}
