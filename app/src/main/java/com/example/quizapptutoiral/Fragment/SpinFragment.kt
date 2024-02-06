package com.example.quizapptutoiral.Fragment

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.quizapptutoiral.Withdrawal
import com.example.quizapptutoiral.databinding.FragmentSpinBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.util.Random

class SpinFragment : Fragment() {
    private lateinit var binding: FragmentSpinBinding
    private lateinit var timer: CountDownTimer
    private val itemTitles = arrayOf("100", "Try Again", "500", "Try Again", "200", "Try Again")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        binding = FragmentSpinBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun showResult(itemTitle: String){
        Toast.makeText(requireContext(), itemTitle, Toast.LENGTH_SHORT).show()
        binding.Spin.isEnabled = true //Enabled the button again
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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

        binding.Spin.setOnClickListener {
            binding.Spin.isEnabled = false //Disabled the button wheel is spinning

            val spin  = Random().nextInt(6)//Generate a random value between 0 and 5
            val degrees = 60f * spin //Calculate the rotation degrees based  on

            timer = object : CountDownTimer(5000, 50){
                var rotation = 0f
                override fun onTick(millisUntilFinished: Long) {
                    rotation += 5f // Rotate the wheel
                    if(rotation >= degrees){
                        rotation = degrees
                        timer.cancel()
                        showResult(itemTitles[spin])
                    }
                    binding.wheel.rotation = rotation
                }

                override fun onFinish(){}
            }.start()
        }
    }
}