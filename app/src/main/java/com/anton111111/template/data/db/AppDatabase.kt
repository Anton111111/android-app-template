package com.anton111111.template.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.anton111111.template.data.source.local.Dao
import com.anton111111.template.data.source.local.model.ItemEntityData

@Database(entities = [ItemEntityData::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dao(): Dao
}