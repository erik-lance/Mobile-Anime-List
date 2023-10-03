package com.mobdeve.s13.tiongquico.erik.exercise2

import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.tiongquico.erik.exercise2.databinding.AnimeItemLayoutBinding

class AnimeViewHolder(private val viewBinding: AnimeItemLayoutBinding): RecyclerView.ViewHolder(viewBinding.root) {
    fun bindData(model: AnimeTitle) {
        this.viewBinding.animeTitleTv.text = model.name
        this.viewBinding.animeImgIv.setImageResource(model.imageId)
    }
}