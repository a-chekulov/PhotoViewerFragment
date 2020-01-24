package com.achek.urlsviewfragment

import android.view.View
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.github.chrisbanes.photoview.PhotoView
import com.github.chrisbanes.photoview.PhotoViewAttacher

class SlideViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val photoView = itemView.findViewById<PhotoView>(R.id.photo_view)
    var card = itemView.findViewById<CardView>(R.id.card_view)

    fun bind(url: String) {

        card.elevation = 4.0f
        card.radius = 15.0f
        card.setCardBackgroundColor(ContextCompat.getColor(itemView.context, android.R.color.black))

        val photoViewAttacher = PhotoViewAttacher(photoView)
        photoViewAttacher.setZoomable(true)

        val glide = Glide.with(itemView.context)
            .load(url)
            .fitCenter()
            .diskCacheStrategy(DiskCacheStrategy.SOURCE)
            .thumbnail(0.5f)
            .into(photoView)
    }
}