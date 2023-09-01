package alkusi.kudmi.rabindradaggerwithmvvm.network

import alkusi.kudmi.rabindradaggerwithmvvm.model.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {
    @GET("products")
   suspend fun getProducts():Response<List<Products>>
}