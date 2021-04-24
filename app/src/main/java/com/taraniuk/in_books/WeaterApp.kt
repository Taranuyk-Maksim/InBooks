package com.taraniuk.in_books

import android.app.Application
import com.taraniuk.in_books.di.component.InBooksComponent
import com.taraniuk.in_books.di.component.DaggerInBooksComponent


class InBooksApplication : Application() {

    companion object {
        lateinit var daggerInBooksComponent: InBooksComponent
    }

    override fun onCreate() {
        super.onCreate()
        daggerInBooksComponent = DaggerInBooksComponent.builder().application(this).build()
    }
}