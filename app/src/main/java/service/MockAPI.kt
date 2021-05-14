package service


import model.Model
import retrofit2.Call
import retrofit2.http.GET

interface MockAPI {
    @GET("everis/users")
    fun getmockapi(): Call<List<Model>>

}