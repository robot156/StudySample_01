package com.example.studysample_01.di

import com.example.studysample_01.data.remote.BookSearchRepositoryImpl
import com.example.studysample_01.domain.BookSearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    fun providerBookSearch(impl: BookSearchRepositoryImpl) : BookSearchRepository {
        return impl
    }

}