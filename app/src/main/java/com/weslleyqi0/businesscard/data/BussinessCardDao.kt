package com.weslleyqi0.businesscard.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BussinessCardDao {

    @Query("SELECT * FROM BusinessCard")
    fun getAll(): LiveData<List<BusinessCard>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(businessCard: BusinessCard)
}