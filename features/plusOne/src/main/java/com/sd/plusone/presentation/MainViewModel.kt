package com.sd.plusone.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sd.api.PlusOneUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val plusOneUseCase: PlusOneUseCase
) : ViewModel() {

    private val _number: MutableLiveData<Int> = MutableLiveData(1)
    val number: LiveData<Int>
        get() = _number

    fun plusOne() {
        _number.value = plusOneUseCase(_number.value ?: 1)
    }
}