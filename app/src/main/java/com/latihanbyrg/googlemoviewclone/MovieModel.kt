package com.latihanbyrg.googlemoviewclone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MovieModel(private val repository: MovieRepository): ViewModel()  {

    val factorySeeder: MovieModelSeeder = MovieModelSeeder(this)
    var movieLists : LiveData<List<Movie>> = repository.allMovies.asLiveData()

//    var popularMovies : LiveData<List<Movie>> = repository.bestRatingMovies.asLiveData()
//    var latestMovies : LiveData<List<Movie>> = repository.latestMovies.asLiveData()




    // CRUD
    fun insertMovie(newMovie: Movie) = viewModelScope.launch {
        repository.insertMovie(newMovie)
    }

    fun updateMovie(movie: Movie) = viewModelScope.launch {
        repository.updateMovie(movie)
    }

}

class MovieModelFactory(private val repository: MovieRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieModel::class.java)) {
            return MovieModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}