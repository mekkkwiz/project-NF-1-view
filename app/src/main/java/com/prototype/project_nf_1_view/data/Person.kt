package com.prototype.project_nf_1_view.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person_table")
data class Person(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?,
    @ColumnInfo(name = "address") val address: String?,
    @ColumnInfo(name = "vhv") val vhv: String?,
    @ColumnInfo(name = "color") val color: String?,
)
