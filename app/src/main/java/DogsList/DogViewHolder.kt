package DogsList

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemDogsBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view:View):RecyclerView.ViewHolder(view){

    private val biding = ItemDogsBinding.bind(view)

    fun bind(image:String){
        Picasso.get().load(image).into(biding.ivDog)
    }
}