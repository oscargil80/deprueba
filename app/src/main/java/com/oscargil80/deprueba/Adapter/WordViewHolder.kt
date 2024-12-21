package com.oscargil80.deprueba.Adapter

import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.deprueba.databinding.ItemWordBinding
import com.oscargil80.deprueba.model.Word

class WordViewHolder(val view: ItemWordBinding) : RecyclerView.ViewHolder(view.root) {

    fun render(
        word: Word
    ) {
       view.word = word
        }
    }
