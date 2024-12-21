package com.oscargil80.deprueba

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oscargil80.deprueba.model.Word
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.launch
import javax.inject.Inject


/*@HiltViewModel
class WordsViewModel @Inject constructor(
    private val wordsRepository: WordRepository
) : ViewModel() {

    lateinit var listWords :  MutableLiveData<Word>


    fun saveWord(text: String): Boolean {
        var paso: Boolean = false
        viewModelScope.launch {
            try {
                wordsRepository.insertWords(Word(0, text))
                paso = true
            } catch (e: Exception) {
                paso = false
            }
        }
        return paso
    }

    fun getAllWords(): LiveData<List<Word>> = wordsRepository.getAllWords()*/

   /* fun getAllWords() {
        viewModelScope.launch {
            listWords = wordsRepository.getAllWords()
        }
    }*/
//}