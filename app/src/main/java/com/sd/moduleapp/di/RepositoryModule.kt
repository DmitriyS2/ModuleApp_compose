package com.sd.moduleapp.di

import com.sd.api.PlusOneRepository
import com.sd.impl.PlusOneRepositoryImpl
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
    fun bindsPlusOneRepository(impl: PlusOneRepositoryImpl): PlusOneRepository
}