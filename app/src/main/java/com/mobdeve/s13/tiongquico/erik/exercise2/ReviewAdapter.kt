package com.mobdeve.s13.tiongquico.erik.exercise2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.tiongquico.erik.exercise2.databinding.ReviewItemLayoutBinding

class ReviewAdapter(private val data: ArrayList<Review>) : RecyclerView.Adapter<ReviewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val itemViewBinding: ReviewItemLayoutBinding = ReviewItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return ReviewViewHolder(itemViewBinding)
    }

    override fun getItemCount(): Int {
        return this.data.size
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.bindData(this.data[position])
    }

}