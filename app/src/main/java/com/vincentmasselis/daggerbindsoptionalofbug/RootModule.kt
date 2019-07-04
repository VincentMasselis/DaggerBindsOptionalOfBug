package com.vincentmasselis.daggerbindsoptionalofbug

import dagger.BindsOptionalOf
import dagger.Module

@Module
interface RootModule {
    @BindsOptionalOf
    fun string(): String
}