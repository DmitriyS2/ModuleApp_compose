package com.sd.impl.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NumberEntity::class], version = 1, exportSchema = false)
abstract class AppDb : RoomDatabase() {

    abstract fun numberDao(): NumberDao
}