package com.example.studysample_01.domain

import javax.inject.Inject

class BookSearchUseCase @Inject constructor(
    private val bookSearchRepository: BookSearchRepository
) {

    fun setSearchKeywordSend(keyword: String) : String {

        return keyword
    }

    suspend fun getSearchBookInfo(keyword: String): SearchBookEntity {

        return bookSearchRepository.getBookList(keyword)
    }

}