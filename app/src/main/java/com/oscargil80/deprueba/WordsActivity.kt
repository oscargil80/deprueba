package com.oscargil80.deprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.oscargil80.deprueba.databinding.ActivityMainBinding

class WordsActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    val viewmodel: WordsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.btnWords.setOnClickListener {
            Log.d("HOla", "Hola")

        }
    }
}