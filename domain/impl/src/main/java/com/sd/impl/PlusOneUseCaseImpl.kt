package com.sd.impl

import com.sd.api.PlusOneRepository
import com.sd.api.PlusOneUseCase
import javax.inject.Inject

class PlusOneUseCaseImpl @Inject constructor(
    private val plusOneRepository: PlusOneRepository
) : PlusOneUseCase {

    override operator fun invoke(number: Int): Int {
        return plusOneRepository.plusOne(number)
    }
}