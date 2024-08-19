package com.sd.api

import androidx.lifecycle.LiveData
import com.sd.common.model.NumberModel

interface GetNumberUseCase {

    operator fun invoke(): LiveData<NumberModel>
}