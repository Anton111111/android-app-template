package com.anton111111.template.data.source.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = ItemEntityData.ITEMS_TABLE
)
data class ItemEntityData(
    /**
     * id
     */
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    ) {

    companion object {
        const val ITEMS_TABLE = "items"
    }
}