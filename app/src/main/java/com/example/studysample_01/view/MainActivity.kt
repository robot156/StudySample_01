package com.example.studysample_01.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.studysample_01.R
import com.example.studysample_01.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            viewModel = mainViewModel
            lifecycleOwner = this@MainActivity
        }
        initObserve()
    }

    private fun initObserve() {
        mainViewModel.openEvent.eventObserve(this) { keyword ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.BOOK_SEARCH_KEYWORD, keyword)
            startActivity(intent)
        }
    }
}