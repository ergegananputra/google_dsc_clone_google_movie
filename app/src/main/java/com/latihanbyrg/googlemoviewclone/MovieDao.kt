package com.latihanbyrg.googlemoviewclone

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface MovieDao {

    @Query("SELECT * FROM movie_table ORDER BY id ASC")
    fun allMovies(): Flow<List<Movie>>

    @Query("SELECT * FROM movie_table ORDER BY yearOfRelease DESC LIMIT 10")
    fun latestMoviews(): Flow<List<Movie>>

    @Query("SELECT * FROM movie_table ORDER BY rating DESC LIMIT 10")
    fun bestRatingMovies(): Flow<List<Movie>>

    @Query("SELECT * FROM movie_table WHERE id = :id")
    fun getMovie(id: Int): Flow<Movie>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: Movie)

    @Update
    suspend fun updateMovie(movie: Movie)
}