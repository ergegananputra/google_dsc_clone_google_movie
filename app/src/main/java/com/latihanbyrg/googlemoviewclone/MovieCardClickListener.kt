package com.latihanbyrg.googlemoviewclone

interface MovieCardClickListener {
    fun onMovieCardClicked(movie: Movie)
    fun onRemoveMovieFromWatchlistClicked(movie: Movie)

}