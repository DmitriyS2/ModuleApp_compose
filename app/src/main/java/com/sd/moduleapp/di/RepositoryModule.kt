package com.sd.moduleapp.di

import com.sd.api.NumberRepository
import com.sd.impl.repository.NumberRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Singleton
    @Binds
    fun bindsNumberRepository(impl: NumberRepositoryImpl): NumberRepository
}