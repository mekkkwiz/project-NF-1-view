package com.prototype.project_nf_1_view.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface PersonDao {

    @Query("SELECT * FROM person_table")
    fun getAll(): LiveData<List<Person>>

    @Query("SELECT * FROM person_table WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): LiveData<List<Person>>

    @Query("SELECT * FROM person_table WHERE address IN (:personAddress)")
    fun readPersonByAddress(personAddress: String): LiveData<List<Person>>

    @Query("SELECT address FROM person_table WHERE first_name IN (:firstName)")
    fun readAddressByFirstName(firstName: String): String

    @Query("SELECT vhv FROM person_table WHERE address IN (:personAddress)")
    fun readVhvByAddress(personAddress: String): String
}