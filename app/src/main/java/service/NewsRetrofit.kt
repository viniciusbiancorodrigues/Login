package service

import model.Model
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsRetrofit {
    private val api: NewsAPI
    init{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/everything?q=tecnologia&apiKey=")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(NewsAPI::class.java)
    }
    fun newsturn(
        onSuccess:(model:List<Model>)->Unit,
        onError:()->Unit
        ){
        api.getnewsapi()
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