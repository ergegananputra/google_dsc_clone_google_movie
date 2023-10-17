package com.latihanbyrg.googlemoviewclone

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.latihanbyrg.googlemoviewclone.databinding.MovieCardBinding

class MovieCardAdapter(
    private val movieCard: List<Movie>,
    private val clickListener: MovieCardClickListener
) : RecyclerView.Adapter<MovieCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = MovieCardBinding.inflate(from, parent, false)
        Log.d("Card", "MovieCardViewHolder : ${MovieCardViewHolder(binding, clickListener, parent.context)}")
        return MovieCardViewHolder(binding, clickListener, parent.context)
    }

    override fun getItemCount(): Int = movieCard.size

    override fun onBindViewHolder(holder: MovieCardViewHolder, position: Int) {
        holder.bindMovieCard(movieCard[position])
    }


}

