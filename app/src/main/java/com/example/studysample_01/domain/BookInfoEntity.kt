package com.example.studysample_01.domain

data class SearchBookEntity(
    var total_count: Int = 0,
    var pageable_count: Int = 0,
    var is_end: Boolean = false,
    var items: List<BookInfoEntity>? = null
) : Entity()

data class BookInfoEntity(
    var author: String? = null,         // 저자
    var description: String? = null,    // 책 설명
    var title: String? = null,          // 제목
    var image: String? = null,          // 이미지
    var price: String? = null           // 가격
) : Entity()

