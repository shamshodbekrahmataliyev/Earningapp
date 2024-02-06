package com.example.quizapptutoiral.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quizapptutoiral.R
import com.example.quizapptutoiral.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    val binding by lazy {
        FragmentProfileBinding.inflate(layoutInflater)
    }
    var isExpand = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (isExpand)
        {
            binding.expadableconstraintlayout.visibility = View.VISIBLE
            binding.imageButton.setImageResource(R.drawable.arrowup)
        }
        else{
            binding.expadableconstraintlayout.visibility = View.GONE
            binding.imageButton.setImageResource(R.drawable.downarrow)
            isExpand =! isExpand
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    companion object {
    }
}