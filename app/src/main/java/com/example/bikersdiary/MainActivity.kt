package com.example.bikersdiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        val adapter = ArticlesAdapter(getArticles())
        recyclerview.adapter=adapter
        val manager= LinearLayoutManager(this)
        recyclerview.layoutManager= manager
    }

    fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()

        articles.add(
            Article(
                "2000 Suzuki GSX1300R Hayabusa",
                "September 24, 2024",
                R.drawable.one,
                "I’ve never been one of those travelers who goes crazy for gear. I like to pack light and keep things simple."
            )
        )
        articles.add(
            Article(
                "2014 KTM 1290 Super Duke R\n",
                "Date 2, 2024",
                R.drawable.two,
                "This is a dummy article content for article 2. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2013 BMW R 1200 GS\n",
                "Date 3, 2024",
                R.drawable.tree,
                "This is a dummy article content for article 3. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2005 Suzuki GSX-R1000\n",
                "Date 4, 2024",
                R.drawable.four,
                "This is a dummy article content for article 4. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2006 KTM 950 Adventure\n",
                "Date 5, 2024",
                R.drawable.five,
                "This is a dummy article content for article 5. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2006 Ducati Desmosedici GP16 RR\n",
                "Date 6, 2024",
                R.drawable.six,
                "This is a dummy article content for article 6. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2006 Yamaha YZF-R6\n",
                "Date 7, 2024",
                R.drawable.seven,
                "This is a dummy article content for article 7. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2008 Kawasaki Concours 14\n",
                "Date 8, 2024",
                R.drawable.eight,
                "This is a dummy article content for article 8. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2009 Aprilia RSV4 Factory\n",
                "Date 9, 2024",
                R.drawable.nine,
                "This is a dummy article content for article 9. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2010 Honda VFR1200F DCT\n",
                "Date 10, 2024",
                R.drawable.ten,
                "This is a dummy article content for article 10. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2010 Honda VFR1200F DCT\n",
                "Date 11, 2024",
                R.drawable.eleven,
                "This is a dummy article content for article 11. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2010 Honda VFR1200F DCT\n",
                "Date 12, 2024",
                R.drawable.twelve,
                "This is a dummy article content for article 12. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2010 BMW S 1000 RR\n",
                "Date 13, 2024",
                R.drawable.thirteen,
                "This is a dummy article content for article 13. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2013 BMW R 1200 GS\n",
                "Date 14, 2024",
                R.drawable.fourteen,
                "This is a dummy article content for article 14. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2014 KTM 1290 Super Duke R\n",
                "Date 15, 2024",
                R.drawable.fifteen,
                "This is a dummy article content for article 15. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2015 Yamaha YZF-R1\n",
                "Date 16, 2024",
                R.drawable.sixteen,
                "This is a dummy article content for article 16. It has some placeholder text for testing purposes."
            )
        )
        return articles
    }

}