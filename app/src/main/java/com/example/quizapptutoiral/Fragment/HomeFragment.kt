package com.example.quizapptutoiral.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.quizapptutoiral.R
import com.example.quizapptutoiral.adapter.categoryadaptor
import com.example.quizapptutoiral.databinding.FragmentHomeBinding
import com.example.quizapptutoiral.modle.categoryModelClass
import com.example.quizapptutoiral.Withdrawal
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class HomeFragment : Fragment() {
    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    private var categoryList = ArrayList<categoryModelClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.CoinWithdrawal.setOnClickListener{
            val bottomSheetDialog:BottomSheetDialogFragment = Withdrawal()
            bottomSheetDialog.show(requireActivity().supportFragmentManager,"TEST")
            bottomSheetDialog.enterTransition
        }
        binding.CoinWithdrawal1.setOnClickListener{
            val bottomSheetDialog:BottomSheetDialogFragment = Withdrawal()
            bottomSheetDialog.show(requireActivity().supportFragmentManager,"TEST")
            bottomSheetDialog.enterTransition
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        categoryList.add(categoryModelClass(R.drawable.scince, "Scince"))
        categoryList.add(categoryModelClass(R.drawable.englishs, "English"))
        categoryList.add(categoryModelClass(R.drawable.englishs, "History"))
        categoryList.add(categoryModelClass(R.drawable.mathmetic, "mathmetic"))
        binding.categoryRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        var adapter = categoryadaptor(categoryList,requireActivity())
        binding.categoryRecyclerView.adapter = adapter
        binding.categoryRecyclerView.setHasFixedSize(true)

    }
    companion object {
    }
}