package com.sd.api

import androidx.lifecycle.LiveData
import com.sd.common.model.NumberModel

interface NumberRepository {

    fun getNumber(): LiveData<NumberModel>
    suspend fun setFirstNumber()
    suspend fun setNumber(numberModel: NumberModel)
}