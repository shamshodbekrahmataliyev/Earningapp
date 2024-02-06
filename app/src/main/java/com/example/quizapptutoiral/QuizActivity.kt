package com.example.quizapptutoiral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapptutoiral.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityQuizBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var image = intent.getIntExtra("categoryimg",0)

        binding.categoryimg.setImageResource(image)
    }
}