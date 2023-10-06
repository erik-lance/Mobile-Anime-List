package com.mobdeve.s13.tiongquico.erik.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper
import com.mobdeve.s13.tiongquico.erik.exercise2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Perform View Binding
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        // Anime Titles
        viewBinding.titlesRv.adapter = AnimeAdapter(DataGenerator.generateAnimeTitleData())

        val animeLinearLayoutManager = LinearLayoutManager(this)
        animeLinearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        viewBinding.titlesRv.layoutManager = animeLinearLayoutManager

        // Reviews

        // Set the adapter (logic has been compressed into one line)
        viewBinding.episodesRv.adapter = ReviewAdapter(DataGenerator.generateRecentReviewsData())

        // Create a LinearLayoutManager with a horizontal orientation
        val episodesLinearLayoutManager = LinearLayoutManager(this)
        episodesLinearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        // Set the LayoutManager
        viewBinding.episodesRv.layoutManager = episodesLinearLayoutManager

    }
}