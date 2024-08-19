package com.sd.impl.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NumberEntity(
    @PrimaryKey
    val id: Int = 1,
    val number: Int
)
