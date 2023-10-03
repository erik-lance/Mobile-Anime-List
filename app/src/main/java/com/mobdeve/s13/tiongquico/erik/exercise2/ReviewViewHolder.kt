package com.mobdeve.s13.tiongquico.erik.exercise2

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.tiongquico.erik.exercise2.databinding.ReviewItemLayoutBinding

class ReviewViewHolder(private val viewBinding: ReviewItemLayoutBinding): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindData(model: Review) {
        this.viewBinding.reviewAuthorTv.text = model.username
        this.viewBinding.reviewScoreTv.text = model.rating.toString()
        this.viewBinding.reviewEpisodeTv.text = model.episode.title
        this.viewBinding.reviewIv.setImageResource(model.episode.anime.imageId)
        this.viewBinding.reviewTitleTv.text = model.episode.anime.name
    }
}