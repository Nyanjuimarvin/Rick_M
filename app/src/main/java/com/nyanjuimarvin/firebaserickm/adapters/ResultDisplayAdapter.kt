package com.nyanjuimarvin.firebaserickm.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nyanjuimarvin.firebaserickm.R
import com.nyanjuimarvin.firebaserickm.databinding.ResultdisplayBinding
import com.nyanjuimarvin.firebaserickm.models.Results
import com.squareup.picasso.Picasso

class ResultDisplayAdapter(private val results:List<Results>, private val context: Context, private val listener:CustomOnClick): RecyclerView.Adapter<ResultDisplayAdapter.ResultViewHolder>() {

    private lateinit var itemBinding: ResultdisplayBinding

    interface CustomOnClick {
        fun onItemClick(result: Results): Void
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ResultDisplayAdapter.ResultViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ResultDisplayAdapter.ResultViewHolder, position: Int) {
        val result: Results = results[position]
        Picasso.get().load(result.image).into(holder.imageView)
        holder.nameView?.setText(result.name)
        holder.statusView?.setText(result.status)
        holder.speciesView?.setText(result.species)
        holder.locationView?.setText(result.location.name)
        holder.originView?.setText(result.origin.name)
        holder.bindView(result, listener)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView? = itemView.findViewById(R.id.imageView2)
        val nameView: TextView? = itemView.findViewById(R.id.name)
        val statusView: TextView? = itemView.findViewById(R.id.status)
        val speciesView: TextView? = itemView.findViewById(R.id.species)
        val locationView: TextView? = itemView.findViewById(R.id.locationFirst)
        val originView: TextView? = itemView.findViewById(R.id.origin)

        public fun bindView(result: Results, listener: CustomOnClick) {
            itemView.setOnClickListener {
               itemView.setOnClickListener {listener.onItemClick(result)}
            }
        }

    }
}