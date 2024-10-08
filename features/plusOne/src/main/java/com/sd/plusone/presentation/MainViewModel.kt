package com.sd.plusone.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sd.api.GetFirstNumberUseCase
import com.sd.api.GetNumberUseCase
import com.sd.api.PlusOneUseCase
import com.sd.common.model.NumberModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getFirstNumberUseCase: GetFirstNumberUseCase,
    getNumberUseCase: GetNumberUseCase,
    private val plusOneUseCase: PlusOneUseCase
) : ViewModel() {

    val number: LiveData<NumberModel> = getNumberUseCase()

    init {
        viewModelScope.launch {
            try {
                addFirstNumberToDb()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private suspend fun addFirstNumberToDb() {
        getFirstNumberUseCase()
    }

    fun plusOne() {
        viewModelScope.launch {
            try {
                plusOneUseCase(number.value ?: NumberModel())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}