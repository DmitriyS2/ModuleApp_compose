package com.sd.impl

import com.sd.api.FirstNumberUseCase
import com.sd.api.NumberRepository
import javax.inject.Inject

class FirstNumberUseCaseImpl @Inject constructor(
    private val repository: NumberRepository
) : FirstNumberUseCase {

    override suspend operator fun invoke() {
        repository.setFirstNumber()
    }
}