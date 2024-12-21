package com.oscargil80.deprueba.di

//import com.oscargil80.deprueba.WordRepository
//mport com.oscargil80.deprueba.WordRepositoryImpl
import com.oscargil80.deprueba.database.WordDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/*
@Module
@InstallIn(ViewModelComponent::class)
object WordModule {

    @ViewModelScoped
    @Provides
    fun provideWordRepository(wordDAO: WordDAO): WordRepository{
        return WordRepositoryImpl(wordDAO)
    }
}*/
