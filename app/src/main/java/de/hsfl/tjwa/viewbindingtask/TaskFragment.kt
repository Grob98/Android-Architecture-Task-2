package de.hsfl.tjwa.viewbindingtask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


class TaskFragment : Fragment() {

    private lateinit var taskViewModel: TaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        taskViewModel = ViewModelProvider(requireActivity()).get(TaskViewModel::class.java)

        val rootView: View = inflater.inflate(R.layout.fragment_task, container, false)

        val bSaveTask = rootView.findViewById<TextView>(R.id.bSaveTask)
        val etTask = rootView.findViewById<EditText>(R.id.etTask)
        val tvCurrentTask = rootView.findViewById<TextView>(R.id.tvCurrentTask)

        bSaveTask.setOnClickListener {
            taskViewModel.currentTask = etTask.text.toString()
            tvCurrentTask.text = taskViewModel.currentTask
        }
        tvCurrentTask.text = taskViewModel.currentTask

        return rootView
    }
}