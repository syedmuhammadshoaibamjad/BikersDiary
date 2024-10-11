package com.example.bikersdiary

import android.content.Intent
    import android.util.Log
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bikersdiary.R

class ArticlesAdapter(val articles:List<Article>):RecyclerView.Adapter<ArticleViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
            Log.d("testingg", "onCreateViewHolder: View holder created")
            val view: View =LayoutInflater.from(parent.context)
                .inflate(R.layout.item_article,parent,false)
            return ArticleViewHolder(view)
        }

        override fun getItemCount(): Int {
            return articles.size
        }

        override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
            Log.d("testingg", "onBindViewHolder: Binding item# "+position)
            val article=articles.get(position)
            holder.title.text=article.title
            holder.image.setImageResource(article.image)
            holder.date.text=article.date
            holder.details.text=article.details
            holder.itemView.setOnClickListener{
//                val intent= Intent(holder.itemView.context,ArticleDetailsActivity::class.java)
//                intent.putExtra("title",article.title)
//                intent.putExtra("image",article.image)
//                intent.putExtra("date",article.date)
//                intent.putExtra("details",article.details)
//                holder.itemView.context.startActivity(intent)
            }
        }
    }