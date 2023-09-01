package alkusi.kudmi.rabindradaggerwithmvvm.di

import alkusi.kudmi.rabindradaggerwithmvvm.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ProductModule::class])
interface ProductComponent {
    fun initDagger(mainActivity: MainActivity)
}