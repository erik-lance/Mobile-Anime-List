package com.mobdeve.s13.tiongquico.erik.exercise2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s13.tiongquico.erik.exercise2.databinding.AnimeItemLayoutBinding

class AnimeAdapter(private val data: ArrayList<AnimeTitle>) : RecyclerView.Adapter<AnimeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val itemViewBinding: AnimeItemLayoutBinding = AnimeItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return AnimeViewHolder(itemViewBinding)
    }

    override fun getItemCount(): Int {
        return this.data.size
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindData(this.data[position])
    }
}