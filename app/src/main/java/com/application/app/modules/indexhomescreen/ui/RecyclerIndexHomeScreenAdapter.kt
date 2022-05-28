package com.application.app.modules.indexhomescreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexHomeScreen1Binding
import com.application.app.modules.indexhomescreen.`data`.model.IndexHomeScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerIndexHomeScreenAdapter(
  public var list: List<IndexHomeScreen1RowModel>
) : RecyclerView.Adapter<RecyclerIndexHomeScreenAdapter.RowIndexHomeScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIndexHomeScreen1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_home_screen1,parent,false)
    return RowIndexHomeScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexHomeScreen1VH, position: Int): Unit {
    val indexHomeScreen1RowModel = IndexHomeScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val indexHomeScreen1RowModel = list[position]
    holder.binding.indexHomeScreen1RowModel = indexHomeScreen1RowModel
  }

  public override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexHomeScreen1RowModel>): Unit {
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
      item: IndexHomeScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowIndexHomeScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexHomeScreen1Binding = RowIndexHomeScreen1Binding.bind(itemView)
    init {
      binding.constraintMenuPersiapan.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, IndexHomeScreen1RowModel())
      }
    }
  }
}
