package com.sd.impl

import com.sd.api.NumberRepository
import com.sd.api.PlusOneUseCase
import com.sd.common.model.NumberModel
import javax.inject.Inject

class PlusOneUseCaseImpl @Inject constructor(
    private val numberRepository: NumberRepository
) : PlusOneUseCase {

    override suspend operator fun invoke(numberModel: NumberModel) {
        numberRepository.setNumber(numberModel)
    }
}