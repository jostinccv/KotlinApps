package DogsList

import com.google.gson.annotations.SerializedName

data class DogsRespond(@SerializedName("status")var status:String,
                       @SerializedName("message")var imagenes:List<String>
)