package com.latihanbyrg.googlemoviewclone

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movie_table")
class Movie(
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "description") var description: String,
    @ColumnInfo(name = "starring") var starring: String,
    @ColumnInfo(name = "director") var director: String,
    @ColumnInfo(name = "price") var price: String,
    @ColumnInfo(name = "imageURL") var imageURL: String,
    @ColumnInfo(name = "yearOfRelease") var yearOfRelease: String,
    @ColumnInfo(name = "rating") var rating: String?,
    @ColumnInfo(name = "isInUserWatchlist") var isInUserWatchlist: Boolean = false,
    @PrimaryKey(autoGenerate = true) var id: Int = 0
) {

    fun tappedOnWatchlistIcon(context: Context) {
        isInUserWatchlist = !isInUserWatchlist
    }


}