package com.oscargil80.deprueba.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.oscargil80.deprueba.model.Word

@Database(entities = [Word::class], exportSchema = false, version = 1)
abstract class WordsDatabase : RoomDatabase(){

    abstract  fun wordDao():WordDAO


}