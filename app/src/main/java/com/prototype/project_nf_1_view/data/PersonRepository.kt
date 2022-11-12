package com.prototype.project_nf_1_view.data

import androidx.lifecycle.LiveData

class PersonRepository(private val personDao: PersonDao) {

    val allPersons: LiveData<List<Person>> = personDao.getAll()

//    suspend fun insert(person: Person) {
//        personDao.insert(person)
//    }
//
//    suspend fun delete(person: Person) {
//        personDao.delete(person)
//    }
//
//    suspend fun update(person: Person) {
//        personDao.update(person)
//    }

    fun readPersonByAddress(personAddress: String): LiveData<List<Person>> {
        return personDao.readPersonByAddress(personAddress)
    }

    fun readAddressByFirstName(firstName: String): String {
        return personDao.readAddressByFirstName(firstName)
    }

    fun readVhvByAddress(personAddress: String): String {
        return personDao.readVhvByAddress(personAddress)
    }
}