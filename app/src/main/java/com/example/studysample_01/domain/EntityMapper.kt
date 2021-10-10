package com.example.studysample_01.domain

import com.example.studysample_01.data.Model

abstract class EntityMapper<E: Entity, M: Model> {

    abstract fun fromEntityModel(entity: E) : M  // Entity -> Model

    abstract fun fromModelEntity(model: M) : E   // Model -> Entity

}