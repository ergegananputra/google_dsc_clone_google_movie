package com.latihanbyrg.googlemoviewclone

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class MoviesDatabase: RoomDatabase() {

        abstract fun movieDao(): MovieDao

        companion object{
            @Volatile
            private var INSTANCE: MoviesDatabase? = null

            fun getDatabase(context: Context): MoviesDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        MoviesDatabase::class.java,
                        "movies_database"
                    ).build()
                    INSTANCE = instance
                    instance
                }
            }
        }

}