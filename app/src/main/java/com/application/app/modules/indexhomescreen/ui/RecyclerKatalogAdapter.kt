package com.application.app.modules.indexhomescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexHomeScreen3Binding
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen3RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerKatalogAdapter(
  public var list: List<IndexHomeScreen3RowModel>
) : RecyclerView.Adapter<RecyclerKatalogAdapter.RowIndexHomeScreen3VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIndexHomeScreen3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_home_screen3,parent,false)
    return RowIndexHomeScreen3VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexHomeScreen3VH, position: Int): Unit {
    val indexHomeScreen3RowModel = IndexHomeScreen3RowModel()
    // TODO uncomment following line after integration with data source
    // val indexHomeScreen3RowModel = list[position]
    holder.binding.indexHomeScreen3RowModel = indexHomeScreen3RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexHomeScreen3RowModel>): Unit {
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
      item: IndexHomeScreen3RowModel
    ): Unit {
    }
  }

  public inner class RowIndexHomeScreen3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexHomeScreen3Binding = RowIndexHomeScreen3Binding.bind(itemView)
  }
}
