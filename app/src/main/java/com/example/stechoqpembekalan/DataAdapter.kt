package com.example.stechoqpembekalan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {
    private var dataList = mutableListOf<DataModel>()

    fun setData(dataList: List<DataModel>) {
        this.dataList.clear()
        this.dataList.addAll(dataList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_data, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val idTextView: TextView = itemView.findViewById(R.id.idTextView)
        private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)

        fun bind(data: DataModel) {
            idTextView.text = "ID: ${data.id}"
            titleTextView.text = "Title: ${data.title}"
        }
    }
}
