package de.hsfl.tjwa.viewbindingtask

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    var currentTask: String = "keine Aufgabe"
        set(value) {
            Log.i("TaskViewModel", "Neuer Wert: $value")
            field = value
        }
}