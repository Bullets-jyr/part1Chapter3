package kr.co.bullets.part1chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.bullets.part1chapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val outputTextView = binding.outputTextView
        val outputUnitTextView = binding.outputUnitTextView
        val inputEditText = binding.inputEditText
        val inputUnitTextView = binding.inputUnitTextView
    }
}