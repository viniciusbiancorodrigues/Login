package view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imc.login.R
import model.Model

class Adapter(
    private val list: List<Model>

) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.newslist,
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(

        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        val title: TextView? = itemView.findViewById(R.id.title)
        fun bind(Objeto: Model) {
            title!!.text = Objeto.title

            val description: TextView? = itemView.findViewById(R.id.description)
            fun bind(Objeto: Model) {
                description!!.text = Objeto.description

                val urlToImage: TextView? = itemView.findViewById(R.id.urlToImage)
                fun bind(Objeto: Model) {
                    urlToImage!!.text = Objeto.urlToImage


                }

            }
        }}}