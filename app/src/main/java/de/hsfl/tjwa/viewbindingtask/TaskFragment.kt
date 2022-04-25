package de.hsfl.tjwa.viewbindingtask

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import de.hsfl.tjwa.viewbindingtask.databinding.FragmentTaskBinding


class TaskFragment : Fragment() {

    private lateinit var taskViewModel: TaskViewModel

    private var _binding: FragmentTaskBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        taskViewModel = ViewModelProvider(requireActivity()).get(TaskViewModel::class.java)

        _binding = FragmentTaskBinding.inflate(inflater, container, false)

        val taskObserver = Observer<String> {
            //onChange
            binding.tvCurrentTask.text = it
            Log.i("TaskFragment", "Neuer Wert: $it")
        }
        taskViewModel.currentTask.observe(viewLifecycleOwner, taskObserver)

        binding.bSaveTask.setOnClickListener {
            taskViewModel.currentTask.value = binding.etTask.text.toString()
        }

        return binding.root
    }
}