package com.sd.impl.mapper

import com.sd.common.model.NumberModel
import com.sd.impl.db.NumberEntity

fun NumberModel.toEntity():NumberEntity {
    return NumberEntity(number = this.number)
}

fun NumberEntity.toModel():NumberModel {
    return NumberModel(number = this.number)
}

//class Mapper {
//
//    fun modelToEntity(numberModel: NumberModel): NumberEntity {
//        return NumberEntity(
//            number = numberModel.number
//        )
//    }
//
//    fun entityToModel(numberEntity: NumberEntity): NumberModel {
//        return NumberModel(number = numberEntity.number)
//    }
//}