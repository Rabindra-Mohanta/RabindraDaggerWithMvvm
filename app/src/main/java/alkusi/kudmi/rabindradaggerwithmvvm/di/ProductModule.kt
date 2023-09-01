package alkusi.kudmi.rabindradaggerwithmvvm.di

import alkusi.kudmi.rabindradaggerwithmvvm.network.FakerApi
import alkusi.kudmi.rabindradaggerwithmvvm.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class ProductModule {

    @Singleton
    @Provides
    fun getRetrofit():Retrofit
    {
           return Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Singleton
    @Provides
    fun getFakerInstance(retrofit: Retrofit):FakerApi
    {
        return retrofit.create(FakerApi::class.java)
    }
}