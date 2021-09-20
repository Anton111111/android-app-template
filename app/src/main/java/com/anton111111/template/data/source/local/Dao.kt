package com.anton111111.template.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.anton111111.template.data.source.local.model.ItemEntityData

@Dao
interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntities(entityData: List<ItemEntityData>)

}