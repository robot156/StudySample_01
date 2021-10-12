package com.example.studysample_01.data.model

import com.example.studysample_01.domain.EntityMapper
import com.example.studysample_01.domain.SearchBookEntity

object BookSearchMapper : EntityMapper<SearchBookEntity, SearchBookModel>() {

    override fun fromEntityModel(entity: SearchBookEntity): SearchBookModel {
        return SearchBookModel(
            total_count = entity.total_count,
            pageable_count = entity.pageable_count,
            is_end = entity.is_end,
            items = entity.items!!.map { BookInfoMapper.fromEntityModel(it) }
        )
    }

    override fun fromModelEntity(model: SearchBookModel): SearchBookEntity {

        return SearchBookEntity(
            total_count = model.total_count,
            pageable_count = model.pageable_count,
            is_end = model.is_end,
            items = model.items!!.map { BookInfoMapper.fromModelEntity(it) }
        )
    }
}