package com.example.townsqktacademy.ui.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.townsqktacademy.R
import com.example.townsqktacademy.data.CondoUnit

class UnitAdapter(private var _dataList: MutableList<CondoUnit>) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.unit_card, parent, false)
        return UnitViewHolder(view)
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        holder.bind(_dataList[position])
    }

    override fun getItemCount(): Int = _dataList.size

    inner class UnitViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private var condoUnit: CondoUnit? = null

        private val titleTextView: TextView = view.findViewById(R.id.titleTextView)
        private val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
        private val unitImageView: ImageView = view.findViewById(R.id.unitImageView)

        fun bind(condoUnit: CondoUnit) {
            this.condoUnit = condoUnit

            titleTextView.text = condoUnit.title
            descriptionTextView.text = condoUnit.description
            unitImageView.load(condoUnit.imageSource)
        }

    }
}