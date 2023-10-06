package com.mobdeve.s13.tiongquico.erik.exercise2

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.tiongquico.erik.exercise2.databinding.ReviewItemLayoutBinding

class ReviewViewHolder(private val viewBinding: ReviewItemLayoutBinding): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindData(model: Review) {
        val author = " " + model.username
        val score = model.rating.toString() + "/5.0"
        this.viewBinding.reviewAuthorTv.text = author
        this.viewBinding.reviewScoreTv.text = score
        this.viewBinding.reviewEpisodeTv.text = model.episode.title
        this.viewBinding.reviewIv.setImageResource(model.episode.anime.imageId)
        this.viewBinding.reviewTitleTv.text = model.episode.anime.name
    }
}