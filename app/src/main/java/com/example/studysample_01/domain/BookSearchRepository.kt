package com.example.studysample_01.domain


interface BookSearchRepository {

    suspend fun getBookList(keyword: String) : SearchBookEntity


}