package DogsList


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiServices {
    @GET
    suspend fun getDogsByBress(@Url url: String):Response<DogsRespond>
}