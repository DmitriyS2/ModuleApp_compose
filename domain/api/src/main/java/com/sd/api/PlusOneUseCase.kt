package com.sd.api

import com.sd.common.model.NumberModel

interface PlusOneUseCase {

    suspend operator fun invoke(numberModel: NumberModel)
}