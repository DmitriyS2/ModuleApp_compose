package com.sd.moduleapp.di

import com.sd.api.PlusOneUseCase
import com.sd.impl.PlusOneUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {

    @Binds
    fun bindPlusOneUseCase(impl: PlusOneUseCaseImpl): PlusOneUseCase
}