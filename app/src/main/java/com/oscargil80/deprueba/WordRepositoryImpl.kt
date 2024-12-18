package com.oscargil80.deprueba

import com.oscargil80.deprueba.database.WordDAO
import com.oscargil80.deprueba.model.Word
import javax.inject.Inject

class WordRepositoryImpl (
    private  val wordDAO: WordDAO)
    : WordRepository {

    override suspend fun insertWords(word: Word) {
       return wordDAO.insertWord(word)

    }

    override suspend fun getAllWords(): List<Word> {
       return wordDAO.getAllWords()
    }
}