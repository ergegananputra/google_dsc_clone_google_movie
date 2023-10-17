package com.latihanbyrg.googlemoviewclone

import android.content.Context
import android.util.Log
import android.view.View
import androidx.annotation.WorkerThread
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.latihanbyrg.googlemoviewclone.databinding.MovieCardBinding

class MovieCardViewHolder(
    private val binding: MovieCardBinding,
    private val clickListener: MovieCardClickListener,
    private val context: Context

) : RecyclerView.ViewHolder(
    binding.root
) {
    fun bindMovieCard(movie: Movie) {

        // TODO: Load image from URL into ImageView
        loadImageFromURL(movie.imageURL)

        binding.title.text = movie.title
        binding.price.text = movie.price
        binding.rating.text = movie.rating


        binding.askMovieCardContainer.setOnClickListener {
            clickListener.onMovieCardClicked(movie)
        }

        if (binding.buttonBookmark.visibility == View.VISIBLE) {
            clickListener.onRemoveMovieFromWatchlistClicked(movie)
        }
    }

    @WorkerThread
    fun loadImageFromURL(url: String) {
        binding.image.load(url)
        Log.d("Card", "Image created from URL: $url")
    }
}
