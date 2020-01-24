package com.achek.urlsviewfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class PhotoViewerFragment : Fragment() {

    private lateinit var urls: Array<String>
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        urls = arguments!!.getStringArray(PUT_URLS)!!
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_image_viewer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager2 = view.findViewById(R.id.view_pager)
        adapter = SliderAdapter(urls.toList())
        viewPager2.adapter = adapter
        adapter.notifyDataSetChanged()

        activity!!.window.statusBarColor = ContextCompat.getColor(activity!!,R.color.colorPrimaryDark)
    }

    companion object {
        private const val PUT_URLS = "put_urls"

        fun NewInstance(urls: Array<String>): PhotoViewerFragment {
            return  PhotoViewerFragment().apply {
                arguments = Bundle().apply {
                    putStringArray(PUT_URLS, urls)
                }
            }
        }
    }
}