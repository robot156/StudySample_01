package com.example.studysample_01.data.model

import com.example.studysample_01.data.Model
import com.example.studysample_01.domain.BookInfoEntity

data class SearchBookModel(
    var total_count: Int = 0,
    var pageable_count: Int = 0,
    var is_end: Boolean = false,
    var items: List<BookInfoModel>? = null
) : Model()

data class BookInfoModel(
    var author: String? = null,         // 저자
    var description: String? = null,    // 책 설명
    var title: String? = null,          // 제목
    var image: String? = null,          // 이미지
    var price: String? = null           // 가격
) : Model()