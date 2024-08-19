package com.sd.moduleapp.di

import android.content.Context
import androidx.room.Room
import com.sd.impl.db.AppDb
import com.sd.impl.db.NumberDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DbModule {
    @Provides
    @Singleton
    fun provideDb(@ApplicationContext context: Context): AppDb {
        return Room.databaseBuilder(context, AppDb::class.java, "app.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNumberDao(
        appDb: AppDb
    ): NumberDao = appDb.numberDao()
}