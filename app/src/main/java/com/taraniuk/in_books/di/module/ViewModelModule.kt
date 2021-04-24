package com.taraniuk.in_books.di.module

import androidx.lifecycle.ViewModelProvider
import com.taraniuk.in_books.di.factory.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindsViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
