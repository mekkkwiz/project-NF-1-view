package com.prototype.project_nf_1_view.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class PersonViewModel(application: Application): AndroidViewModel(application) {

    val reaAllData: LiveData<List<Person>>
    private val repository: PersonRepository

    init {
        val personDao = AppDatabase.getDatabase(application).PersonDao()
        repository = PersonRepository(personDao)
        reaAllData = repository.allPersons
    }

     fun readPersonByAddress(personAddress: String): LiveData<List<Person>> {
        return repository.readPersonByAddress(personAddress)
    }

    fun readAddressByFirstName(firstName: String): LiveData<String> {
        return repository.readAddressByFirstName(firstName)
    }

     fun readVhvByAddress(personAddress: String): LiveData<String> {
        return repository.readVhvByAddress(personAddress)
    }
}