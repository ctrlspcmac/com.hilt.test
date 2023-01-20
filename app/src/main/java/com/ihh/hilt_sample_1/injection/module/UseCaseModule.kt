package com.ihh.hilt_sample_1.injection.module

import com.ihh.hilt_sample_1.SampleUseCase1
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideSampleUseCase1(): SampleUseCase1 {
        return SampleUseCase1()
    }
}