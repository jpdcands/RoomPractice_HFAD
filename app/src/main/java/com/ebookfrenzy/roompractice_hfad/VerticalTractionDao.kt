package com.ebookfrenzy.roompractice_hfad

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface VerticalTractionDao {

        @Insert
        suspend fun insert(VerticalTraction: VerticalTraction)

        @Update
        suspend fun update(VerticalTraction: VerticalTraction)

        @Delete
        suspend fun delete(VerticalTraction: VerticalTraction)
        
}