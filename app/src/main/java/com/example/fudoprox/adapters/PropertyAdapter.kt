package com.example.fudoprox.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fudoprox.R
import com.example.fudoprox.model.Property

class PropertyAdapter(private val propertyList:ArrayList<Property>)
    : RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder>(){

    class PropertyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val propHeader: TextView = itemView.findViewById(R.id.propHeader)
        val propPrice: TextView = itemView.findViewById(R.id.propPrice)
        val propArea: TextView = itemView.findViewById(R.id.propArea)
        val propLoc: TextView = itemView.findViewById(R.id.propLocation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return PropertyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return propertyList.size
    }

    override fun onBindViewHolder(holder: PropertyViewHolder, position: Int) {
        val property = propertyList[position]
        holder.imageView.setImageResource(property.img)
        holder.propHeader.text = property.header
        holder.propPrice.text = property.price
        holder.propLoc.text = property.loc
        holder.propArea.text = property.area
    }

}