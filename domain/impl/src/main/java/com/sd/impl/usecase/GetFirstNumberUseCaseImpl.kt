package com.sd.impl.usecase

import com.sd.api.GetFirstNumberUseCase
import com.sd.api.NumberRepository
import javax.inject.Inject

class GetFirstNumberUseCaseImpl @Inject constructor(
    private val repository: NumberRepository
) : GetFirstNumberUseCase {

    override suspend operator fun invoke() {
        repository.setFirstNumber()
    }
}