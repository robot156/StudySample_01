package com.example.studysample_01.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.studysample_01.R

@BindingAdapter("bind_url")
fun bindImageUrl(imageView: ImageView, imageUrl: String?) {

    Glide.with(imageView.context)
        .load(imageUrl)
        .error(R.color.black)
        .placeholder(R.color.teal_700)
        .centerCrop()
        .into(imageView)
}