package com.example.studysample_01.data.model

import com.example.studysample_01.domain.EntityMapper
import com.example.studysample_01.domain.SearchBookEntity

object BookSearchMapper : EntityMapper<SearchBookEntity, SearchBookModel>() {

    override fun fromEntityModel(entity: SearchBookEntity): SearchBookModel {
        return SearchBookModel(
            totalCount = entity.totalCount,
            pageableCount = entity.pageableCount,
            isEnd = entity.is_end,
            items = entity.items!!.map { BookInfoMapper.fromEntityModel(it) }
        )
    }

    override fun fromModelEntity(model: SearchBookModel): SearchBookEntity {

        return SearchBookEntity(
            totalCount = model.totalCount,
            pageableCount = model.pageableCount,
            is_end = model.isEnd,
            items = model.items!!.map { BookInfoMapper.fromModelEntity(it) }
        )
    }
}