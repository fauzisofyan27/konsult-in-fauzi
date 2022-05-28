package com.application.app.modules.splashscreen3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.application.app.R
import com.application.app.databinding.RowSplashScreen4Binding
import com.application.app.modules.splashscreen3.`data`.model.SplashScreen4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerGroup262Adapter(
  public var list: List<SplashScreen4RowModel>
) : RecyclerView.Adapter<RecyclerGroup262Adapter.RowSplashScreen4VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSplashScreen4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_splash_screen_4,parent,false)
    return RowSplashScreen4VH(view)
  }

  public override fun onBindViewHolder(holder: RowSplashScreen4VH, position: Int): Unit {
    val splashScreen4RowModel = SplashScreen4RowModel()
    // TODO uncomment following line after integration with data source
    // val splashScreen4RowModel = list[position]
    holder.binding.splashScreen4RowModel = splashScreen4RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SplashScreen4RowModel>): Unit {
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
      item: SplashScreen4RowModel
    ): Unit {
    }
  }

  public inner class RowSplashScreen4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSplashScreen4Binding = RowSplashScreen4Binding.bind(itemView)
  }
}
