package com.application.app.modules.indexfiturkarirplanning.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowIndexFiturKarirPlanning1Binding
import com.application.app.modules.indexfiturkarirplanning.`data`.model.IndexFiturKarirPlanning1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerMenuBarisPertAdapter(
  public var list: List<IndexFiturKarirPlanning1RowModel>
) : RecyclerView.Adapter<RecyclerMenuBarisPertAdapter.RowIndexFiturKarirPlanning1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowIndexFiturKarirPlanning1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_index_fitur_karir_planning1,parent,false)
    return RowIndexFiturKarirPlanning1VH(view)
  }

  public override fun onBindViewHolder(holder: RowIndexFiturKarirPlanning1VH, position: Int): Unit {
    val indexFiturKarirPlanning1RowModel = IndexFiturKarirPlanning1RowModel()
    // TODO uncomment following line after integration with data source
    // val indexFiturKarirPlanning1RowModel = list[position]
    holder.binding.indexFiturKarirPlanning1RowModel = indexFiturKarirPlanning1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndexFiturKarirPlanning1RowModel>): Unit {
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
      item: IndexFiturKarirPlanning1RowModel
    ): Unit {
    }
  }

  public inner class RowIndexFiturKarirPlanning1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowIndexFiturKarirPlanning1Binding =
        RowIndexFiturKarirPlanning1Binding.bind(itemView)
    init {
      binding.constraintMenuPersiapan.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, IndexFiturKarirPlanning1RowModel())
      }
    }
  }
}
