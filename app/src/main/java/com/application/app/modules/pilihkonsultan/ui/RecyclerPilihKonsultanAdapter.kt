package com.application.app.modules.pilihkonsultan.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowPilihKonsultan1Binding
import com.application.app.modules.pilihkonsultan.`data`.model.PilihKonsultan1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerPilihKonsultanAdapter(
  public var list: List<PilihKonsultan1RowModel>
) : RecyclerView.Adapter<RecyclerPilihKonsultanAdapter.RowPilihKonsultan1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPilihKonsultan1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pilih_konsultan1,parent,false)
    return RowPilihKonsultan1VH(view)
  }

  public override fun onBindViewHolder(holder: RowPilihKonsultan1VH, position: Int): Unit {
    val pilihKonsultan1RowModel = PilihKonsultan1RowModel()
    // TODO uncomment following line after integration with data source
    // val pilihKonsultan1RowModel = list[position]
    holder.binding.pilihKonsultan1RowModel = pilihKonsultan1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PilihKonsultan1RowModel>): Unit {
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
      item: PilihKonsultan1RowModel
    ): Unit {
    }
  }

  public inner class RowPilihKonsultan1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPilihKonsultan1Binding = RowPilihKonsultan1Binding.bind(itemView)
  }
}
