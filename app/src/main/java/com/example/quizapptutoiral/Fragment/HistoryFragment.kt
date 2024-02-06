package com.example.quizapptutoiral.Fragment

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapptutoiral.R
import com.example.quizapptutoiral.Withdrawal
import com.example.quizapptutoiral.adapter.HistoryAdaptor
import com.example.quizapptutoiral.databinding.FragmentHistoryBinding
import com.example.quizapptutoiral.modle.HistoryModelClass
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class HistoryFragment : Fragment() {
    val binding by lazy {
        FragmentHistoryBinding.inflate(layoutInflater)
    }
    private var ListHistory = ArrayList<HistoryModelClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ListHistory.add(HistoryModelClass("12:03", "200"))
        ListHistory.add(HistoryModelClass("05:46", "200"))
        ListHistory.add(HistoryModelClass("11:50", "500"))
        ListHistory.add(HistoryModelClass("09:03", "100"))

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding.CoinWithdrawal.setOnClickListener{
        val bottomSheetDialog: BottomSheetDialogFragment = Withdrawal()
        bottomSheetDialog.show(requireActivity().supportFragmentManager,"TEST")
        bottomSheetDialog.enterTransition
    }
        binding.CoinWithdrawal1.setOnClickListener{
            val bottomSheetDialog: BottomSheetDialogFragment = Withdrawal()
            bottomSheetDialog.show(requireActivity().supportFragmentManager,"TEST")
            bottomSheetDialog.enterTransition
        }
        binding.HistoryRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        var adaptor = HistoryAdaptor(ListHistory)
        binding.HistoryRecyclerView.adapter = adaptor
        binding.HistoryRecyclerView.setHasFixedSize(true)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
    }
}