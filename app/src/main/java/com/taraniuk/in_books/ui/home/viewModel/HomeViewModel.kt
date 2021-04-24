package com.taraniuk.in_books.ui.home.viewModel

import androidx.lifecycle.ViewModel
//import com.taraniuk.in_books.domain.usecasesImpl.WeatherUseCaseImpl
//import javax.inject.Inject

class HomeViewModel  : ViewModel() {

//    private val weatherLiveData = MutableLiveData<WeatherResponse>()
//
//    fun getWeatherInCity(city: String): LiveData<WeatherResponse> {
//        viewModelScope.launch {
//            when (val response = useCase.getWeatherInCurrentCity(city)) {
//                is RequestResult.OnSuccess -> {
//                    Log.d("CityWeather", "getWeatherInCity: ${response.data}")
//                    weatherLiveData.value = response.data
//                }
//                is RequestResult.OnError -> {
//                    Log.d("CityWeather", "getWeatherInCity: ${response.error}")
//                }
//            }
//        }
//        return weatherLiveData
//    }

}