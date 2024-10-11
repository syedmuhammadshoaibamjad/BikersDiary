package com.example.bikersdiary

import android.view.View
    import android.widget.ImageView
    import android.widget.TextView
    import androidx.recyclerview.widget.RecyclerView
import com.example.bikersdiary.R

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView=itemView.findViewById(R.id.image)
        val title:TextView=itemView.findViewById(R.id.title)
    }
