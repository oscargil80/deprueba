package com.oscargil80.deprueba.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Singleton
    @Provides
    fun provideFrase1() : String{
        return "Nueva Frase"
    }
}

/*@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideFrase1() : String{
        return "Nueva Frase"
    }*/

   /* @Singleton
    @Provides
    fun provideWordsDatabase(@ApplicationContext context:Context ): WordsDatabase{
        return Room.databaseBuilder(context, WordsDatabase::class.java, "words.db").build()
    }

    @Singleton
    @Provides
    fun provideWordsDao(wordsDatabase: WordsDatabase): WordDAO{
        return wordsDatabase.wordDao()
    }*/
//}
