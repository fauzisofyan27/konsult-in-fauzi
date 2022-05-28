package com.application.app.modules.indexshopscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexShopScreen1Binding
import com.application.app.modules.indexshopscreen.`data`.model.IndexShopScreen1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerIndexShopScreenAdapter(
  public var list: List<IndexShopScreen1RowModel>
) : RecyclerView.Adapter<RecyclerIndexShopScreenAdapter.RowIndexShopScreen1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIndexShopScreen1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_shop_screen1,parent,false)
    return RowIndexShopScreen1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexShopScreen1VH, position: Int): Unit {
    val indexShopScreen1RowModel = IndexShopScreen1RowModel()
    // TODO uncomment following line after integration with data source
    // val indexShopScreen1RowModel = list[position]
    holder.binding.indexShopScreen1RowModel = indexShopScreen1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexShopScreen1RowModel>): Unit {
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
      item: IndexShopScreen1RowModel
    ): Unit {
    }
  }

  public inner class RowIndexShopScreen1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexShopScreen1Binding = RowIndexShopScreen1Binding.bind(itemView)
  }
}
