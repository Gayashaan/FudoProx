package com.example.fudoprox.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fudoprox.R

class PropertyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val propHeader: TextView = itemView.findViewById(R.id.propHeader)
    val propPrice: TextView = itemView.findViewById(R.id.propPrice)
    val propArea: TextView = itemView.findViewById(R.id.propArea)
    val propLoc: TextView = itemView.findViewById(R.id.propLocation)
}