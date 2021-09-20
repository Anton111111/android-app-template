package com.anton111111.template.data.source.local

import com.anton111111.template.data.db.AppDatabase
import com.anton111111.template.data.source.local.model.ItemEntityData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(
    private val db: AppDatabase
) {
    private val dao = db.dao()

    suspend fun insertEntities(
        entityData: List<ItemEntityData>
    ) {
        if (entityData.isEmpty()) return
        dao.insertEntities(entityData)
    }

}