package alkusi.kudmi.rabindradaggerwithmvvm

import alkusi.kudmi.rabindradaggerwithmvvm.di.DaggerProductComponent
import alkusi.kudmi.rabindradaggerwithmvvm.di.ProductComponent
import android.app.Application

class ComponentApplication :Application(){
    lateinit var productComponent: ProductComponent
    override fun onCreate() {
        super.onCreate()
     productComponent = DaggerProductComponent.builder().build()
    }
}