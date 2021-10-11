package com.example.studysample_01.data.model

import com.example.studysample_01.data.Model
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchBookModel(
    @Json(name = "total_count")
    var totalCount: Int = 0,
    @Json(name = "pageable_count")
    var pageableCount: Int = 0,
    @Json(name = "is_end")
    var isEnd: Boolean = false,
    @Json(name = "items")
    var items: List<BookInfoModel>? = null
) : Model()

@JsonClass(generateAdapter = true)
data class BookInfoModel(
    @Json(name = "author")
    var author: String? = null,         // 저자
    @Json(name = "description")
    var description: String? = null,    // 책 설명
    @Json(name = "title")
    var title: String? = null,          // 제목
    @Json(name = "image")
    var image: String? = null,          // 이미지
    @Json(name = "price")
    var price: String? = null           // 가격
) : Model()