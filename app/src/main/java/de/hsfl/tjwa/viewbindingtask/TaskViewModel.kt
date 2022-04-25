package de.hsfl.tjwa.viewbindingtask

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    val currentTask: MutableLiveData<String> by lazy {
        MutableLiveData<String>("keine Aufgabe")
    }

}