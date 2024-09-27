package com.example.yourname.job1nsda.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.job_1_nsda.ApiInstance.apiService
import com.example.job_1_nsda.Product

import kotlinx.coroutines.launch

class ProductViewModel:ViewModel() {

    private val _product = MutableLiveData<List<Product>>()
    val products:LiveData<List<Product>> get() = _product


    init {
        viewModelScope.launch {
            fetchroducts()
        }
    }

    private suspend fun fetchroducts() {
        try {
            val response =  apiService.getProducts()
            _product.postValue(response)
        }catch (e:Exception){

        }
    }

}