package com.vincentmasselis.daggerbindsoptionalofbug

import android.app.Application
import java.util.*
import javax.inject.Inject

class Application : Application() {

    @Inject
    lateinit var string: Optional<String>

    override fun onCreate() {
        super.onCreate()
        DaggerRootComponent.factory().build().also { it.inject(this) }
        //val subComponent = rootComponent.subComponent.build()


    }
}