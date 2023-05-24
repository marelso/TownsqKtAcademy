package com.example.townsqktacademy.ui.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import coil.load
import com.example.townsqktacademy.R

class UnitCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val imageView: ImageView
    private val titleTextView: TextView
    private val descriptionTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.unit_card, this, true)

        // Get references to the child views
        imageView = findViewById(R.id.unitImageView)
        titleTextView = findViewById(R.id.titleTextView)
        descriptionTextView = findViewById(R.id.descriptionTextView)
    }

    // Method to set image link
    fun setImageLink(imageLink: String) {
        imageView.load(imageLink) {
            // Optional: You can customize image loading options here
        }
    }

    // Methods to set data for the views
    fun setTitle(title: String) {
        titleTextView.text = title
    }

    fun setDescription(description: String) {
        descriptionTextView.text = description
    }
}