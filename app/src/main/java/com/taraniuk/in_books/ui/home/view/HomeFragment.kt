package com.taraniuk.in_books.ui.home.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.taraniuk.in_books.InBooksApplication
import com.taraniuk.in_books.databinding.HomeFragmetBinding
import com.taraniuk.in_books.di.module.BASE_IMAGE_URL

class HomeFragment : Fragment() {

//    @Inject
//    lateinit var viewModel: HomeViewModel
    lateinit var binding: HomeFragmetBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        InBooksApplication.daggerInBooksComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = HomeFragmetBinding.inflate(inflater)

//        viewModel.getWeatherInCity("KIEV").observe(viewLifecycleOwner, {
////            binding.text.text = it.toString()
////            setImage(binding.sun, it.weather[0].icon)
//
//            Log.d("TAG_A",  it.toString())
//        })

        return binding.root
    }

    private fun setImage(image: ImageView, imageId: String) {
        Glide.with(this)
            .load("${BASE_IMAGE_URL}w/$imageId.png")
            .centerCrop()
            .into(image)
    }

}