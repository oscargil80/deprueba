package com.oscargil80.deprueba.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.oscargil80.deprueba.model.Word

@Dao
interface WordDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWord(word:Word)

    @Query("SELECT * FROM word")
    fun getAllWords(): LiveData<List<Word>>




}