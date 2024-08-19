package com.sd.impl.mapper

import com.sd.common.model.NumberModel
import com.sd.impl.db.NumberEntity

class Mapper {

    fun modelToEntity(numberModel: NumberModel): NumberEntity {
        return NumberEntity(
            number = numberModel.number
        )
    }

    fun entityToModel(numberEntity: NumberEntity): NumberModel {
        return NumberModel(
            number = numberEntity.number
        )
    }
}