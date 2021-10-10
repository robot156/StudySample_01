package com.example.studysample_01.data.model

import com.example.studysample_01.domain.BookInfoEntity
import com.example.studysample_01.domain.EntityMapper

object BookInfoMapper : EntityMapper<BookInfoEntity, BookInfoModel>()  {

    override fun fromEntityModel(entity: BookInfoEntity): BookInfoModel {

        return BookInfoModel(
            entity.author,
            entity.description,
            entity.title,
            entity.image,
            entity.price
        )
    }

    override fun fromModelEntity(model: BookInfoModel): BookInfoEntity {

        return BookInfoEntity(
            model.author,
            model.description,
            model.title,
            model.image,
            model.price
        )
    }
}