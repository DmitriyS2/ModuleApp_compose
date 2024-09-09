package com.sd.impl.usecase

import androidx.lifecycle.LiveData
import com.sd.api.GetNumberUseCase
import com.sd.api.NumberRepository
import com.sd.common.model.NumberModel
import javax.inject.Inject

class GetNumberUseCaseImpl @Inject constructor(
    private val repository: NumberRepository
) : GetNumberUseCase {

    override operator fun invoke(): LiveData<NumberModel> {
        return repository.getNumber()
    }
}