package service


import model.Model
import retrofit2.Call
import retrofit2.http.GET

interface NewsAPI {
    @GET("dee3c2cc47c74152be1aa08f73ca2494")
    fun getnewsapi(): Call<List<Model>>

}