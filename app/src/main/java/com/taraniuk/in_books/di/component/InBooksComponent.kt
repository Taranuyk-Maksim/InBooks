package com.taraniuk.in_books.di.component

import android.app.Application
import com.taraniuk.in_books.di.module.AppModule
import com.taraniuk.in_books.di.module.NetModule
import com.taraniuk.in_books.di.module.ViewModelModule
import com.taraniuk.in_books.ui.home.view.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class,
        NetModule::class,
        ViewModelModule::class,
    ]
)

@Singleton
interface InBooksComponent {

    fun inject(homeFragment: HomeFragment)

    @Component.Builder
    interface Builder {
        fun build(): InBooksComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}