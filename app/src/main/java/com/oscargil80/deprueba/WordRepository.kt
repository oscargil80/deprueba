package com.oscargil80.deprueba

import com.oscargil80.deprueba.model.Word

interface WordRepository {
    suspend fun insertWords(word: Word)
    suspend fun getAllWords(): List<Word>
}