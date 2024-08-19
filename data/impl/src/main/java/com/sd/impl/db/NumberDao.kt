package com.sd.impl.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface NumberDao {

    //дать number из БД
    @Query("SELECT * FROM NumberEntity WHERE id = 1")
    fun getNumber(): LiveData<NumberEntity>

    //запись нового значения number
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setNumber(numberEntity: NumberEntity)
}