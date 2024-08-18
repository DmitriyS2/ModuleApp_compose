package com.sd.impl

import com.sd.api.PlusOneRepository
import com.sd.common.extensions.plus1
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlusOneRepositoryImpl @Inject constructor() : PlusOneRepository {

    override fun plusOne(number: Int): Int {
        return number.plus1()
    }
}