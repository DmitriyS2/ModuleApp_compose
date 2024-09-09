package com.sd.impl.repository

import android.content.Context
import androidx.lifecycle.map
import com.sd.api.NumberRepository
import com.sd.common.extensions.plus1
import com.sd.common.model.NumberModel
import com.sd.impl.db.NumberDao
import com.sd.impl.mapper.toEntity
import com.sd.impl.mapper.toModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NumberRepositoryImpl @Inject constructor(
    private val numberDao: NumberDao,
    @ApplicationContext private val context: Context,
) : NumberRepository {

    private val prefs = context.getSharedPreferences("firstStart", Context.MODE_PRIVATE)
    private val flagKey = "flag"

    override suspend fun setFirstNumber() {
        val flag = prefs.getBoolean(flagKey, true)
        if (flag) {
            setNumber(NumberModel(number = 0))
            setFlagStartFalse()
        }
    }

    private fun setFlagStartFalse() {
        with(prefs.edit()) {
            putBoolean(flagKey, false)
            apply()
        }
    }

    override fun getNumber() = numberDao.getNumber().map {
        it.toModel()
    }

    override suspend fun setNumber(numberModel: NumberModel) {
        val newNumberModel = numberModel.copy(number = numberModel.number.plus1())
        numberDao.setNumber(newNumberModel.toEntity())
    }
}