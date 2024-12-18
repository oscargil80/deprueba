package com.oscargil80.deprueba.di

import com.oscargil80.deprueba.WordRepository
import com.oscargil80.deprueba.WordRepositoryImpl
import com.oscargil80.deprueba.database.WordDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object WordModule {

    @Provides
    fun provideWordRepository(wordDAO: WordDAO): WordRepository{
        return WordRepositoryImpl(wordDAO)
    }
}