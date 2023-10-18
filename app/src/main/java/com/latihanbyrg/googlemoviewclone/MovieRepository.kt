package com.latihanbyrg.googlemoviewclone

import android.util.Log
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.flow.Flow

class MovieRepository(private val movieDao: MovieDao) {
    val allMovies: Flow<List<Movie>> = movieDao.allMovies()
//    val bestRatingMovies: Flow<List<Movie>> = movieDao.bestRatingMovies()
//    val latestMovies: Flow<List<Movie>> = movieDao.latestMoviews()

    @WorkerThread
    suspend fun insertMovie(movie: Movie) {
        movieDao.insertMovie(movie)
        Log.d("CardDatabase", "insertMovie: ${movie.title}")
    }

    @WorkerThread
    suspend fun  updateMovie(movie: Movie) {
        movieDao.updateMovie(movie)
        Log.d("CardDatabase", "updateMovie: ${movie.title}")
    }

    @WorkerThread
    fun getMovie(id: Int): Flow<Movie> {
        return movieDao.getMovie(id)
    }
}