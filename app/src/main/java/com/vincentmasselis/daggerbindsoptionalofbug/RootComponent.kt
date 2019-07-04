package com.vincentmasselis.daggerbindsoptionalofbug

import dagger.Component

@Component(modules = [RootModule::class])
interface RootComponent {

    @Component.Factory
    interface Factory {
        fun build(): RootComponent
    }

    fun inject(application: Application)
}