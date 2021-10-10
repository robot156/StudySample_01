package com.example.studysample_01.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.studysample_01.R
import com.example.studysample_01.adapter.BookAdapter
import com.example.studysample_01.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    private val detailViewModel: DetailViewModel by viewModels()

    companion object {
        const val BOOK_SEARCH_KEYWORD = "keyword"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        binding.lifecycleOwner = this

        initView()
    }

    private fun initView() {
        detailViewModel.documentData.observe(this) {
            binding.recyclerviewList.adapter = BookAdapter(it)
        }
    }

}