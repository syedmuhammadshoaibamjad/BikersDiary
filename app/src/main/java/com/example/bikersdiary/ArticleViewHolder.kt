package com.example.bikersdiary

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image: ImageView = itemView.findViewById(R.id.image)
    val title: TextView = itemView.findViewById(R.id.title)
    val details: TextView = itemView.findViewById(R.id.details)
    val date: TextView = itemView.findViewById(R.id.date)
}
