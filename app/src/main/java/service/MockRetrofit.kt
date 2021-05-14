package service

import model.Model
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MockRetrofit {
    private val api: MockAPI
    init{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://609d36bb04bffa001792e377.mockapi.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(MockAPI::class.java)
    }
    fun mockturn(
        onSuccess:(model:List<Model>)->Unit,
        onError:()->Unit
        ){
        api.getmockapi()
            .enqueue(object: Callback<List<Model>>
            {
                override fun onResponse(call: Call<List<Model>>, response: Response<List<Model>>) {
                    if(response.isSuccessful){
                        val responsebody = response.body()
                        if (responsebody != null){
                            onSuccess.invoke(responsebody)
                       }else{
                           onError.invoke()
                        }
                    }else {
                        onError.invoke()
                    }
                }
                override fun onFailure(call: Call<List<Model>>, t:Throwable) {
                    onError.invoke()
                }
            })
    }
}