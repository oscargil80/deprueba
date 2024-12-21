package com.oscargil80.deprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.oscargil80.deprueba.Adapter.WordAdapter
import com.oscargil80.deprueba.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WordsActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var adapter:WordAdapter

   // val viewModel: WordsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
      /*  setRecyclerView()

        binding.btnWords.setOnClickListener {   showAddWords()    }
        viewModel.getAllWords().observe(this, Observer {
          adapter.submitList(it)
        })
*/

    }

   /* private fun setRecyclerView() {
        binding.rvWords.apply {
            adapter = WordAdapter()
            layoutManager = LinearLayoutManager(this@WordsActivity)
                adapter = adapter
        }

    }*/

/*    private fun showAddWords() {
        MaterialDialog(this).show {
            input { dialog, text ->
                viewModel.saveWord(text.toString())
            }
            positiveButton( text = "Submit")
        }
    }*/
}