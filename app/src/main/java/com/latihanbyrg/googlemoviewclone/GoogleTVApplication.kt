package com.latihanbyrg.googlemoviewclone

import android.app.Application

class GoogleTVApplication: Application() {
    private val database by lazy { MoviesDatabase.getDatabase(this) }
    val repository by lazy { MovieRepository(database.movieDao()) }

}