package alkusi.kudmi.rabindradaggerwithmvvm.repository

import alkusi.kudmi.rabindradaggerwithmvvm.model.Products
import alkusi.kudmi.rabindradaggerwithmvvm.network.FakerApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

class MyRepository @Inject constructor(private val fakerApi: FakerApi){

    val mutableLiveData = MutableLiveData<List<Products>>();
    val liveData: LiveData<List<Products>>
    get() = mutableLiveData

    suspend fun getData()
    {
        val result = fakerApi.getProducts()
        if(result.isSuccessful)
        {
            mutableLiveData.postValue(result.body())
        }
    }
}