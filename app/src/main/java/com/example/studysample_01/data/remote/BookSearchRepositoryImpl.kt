package com.example.studysample_01.data.remote

import com.example.studysample_01.data.model.BookSearchMapper
import com.example.studysample_01.domain.BookSearchRepository
import com.example.studysample_01.domain.SearchBookEntity
import com.example.studysample_01.utils.ServiceApi
import javax.inject.Inject

class BookSearchRepositoryImpl @Inject constructor(
    private val serviceApi: ServiceApi
) : BookSearchRepository {

    override suspend fun getBookList(keyword: String): SearchBookEntity {

        return BookSearchMapper.fromModelEntity(serviceApi.getSearchBook(keyword))
    }

}