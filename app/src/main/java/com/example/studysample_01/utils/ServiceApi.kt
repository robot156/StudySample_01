package com.example.studysample_01.utils

import com.example.studysample_01.data.model.SearchBookModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {

    @GET(API.SEARCH_BOOK)
    suspend fun getSearchBook(
        @Query("query") query: String
    ) : SearchBookModel
}