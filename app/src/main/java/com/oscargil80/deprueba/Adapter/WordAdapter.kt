package com.oscargil80.deprueba.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.oscargil80.deprueba.databinding.ItemWordBinding
import com.oscargil80.deprueba.model.Word


class WordAdapter(

) : ListAdapter<Word, WordViewHolder>(WordDiffUtill()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
       return WordViewHolder(ItemWordBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.render(getItem(position))
    }
}



/* fun setData(newList: List<Word>){
        val WordList =  newList
        notifyDataSetChanged()
    }*/

    /* fun UpdateList(newList: List<Word>){
        val PaieseAmericaDiff = PaisesAmericaDiffUtill(PaisesAmericaList, newList)
        val result = DiffUtil.calculateDiff(PaieseAmericaDiff)
        PaisesAmericaList = newList
        result.dispatchUpdatesTo(this)
    }*/


