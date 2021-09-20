package com.anton111111.template.di.modules

import android.content.Context
import androidx.room.Room
import com.anton111111.template.data.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Singleton
    @Provides
    fun provideDB(@ApplicationContext appContext: Context?) =
        Room.databaseBuilder(appContext!!, AppDatabase::class.java, "db")
            .build()

}