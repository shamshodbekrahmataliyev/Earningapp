package com.example.quizapptutoiral.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapptutoiral.databinding.HistoryitemBinding
import com.example.quizapptutoiral.modle.HistoryModelClass

class HistoryAdaptor(var ListHistory:ArrayList<HistoryModelClass>): RecyclerView.Adapter<HistoryAdaptor.HistoryCoinViewHolder>() {
    class HistoryCoinViewHolder(var binding: HistoryitemBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryCoinViewHolder {
        return HistoryCoinViewHolder(HistoryitemBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount() = ListHistory.size

    override fun onBindViewHolder(holder: HistoryCoinViewHolder, position: Int) {
        holder.binding.Time.text = ListHistory[position].timaAndDate
        holder.binding.Coin.text = ListHistory[position].coin
    }
}