package com.oscargil80.deprueba

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class WordsViewModel @Inject constructor(
    private val wordsRepository: WordRepository
): ViewModel() {



}