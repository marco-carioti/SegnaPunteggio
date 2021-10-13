package com.example.segnapunteggio

import ViewModel.MainViewModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.segnapunteggio.databinding.FragmentFirstBinding
import com.example.segnapunteggio.databinding.FragmentHomeBinding

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding?=null
    private val binding get()=_binding!!
    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.aumentaCasa.setOnClickListener {
            binding.punteggiocasa.text = viewModel.add_score().toString()
        }
        binding.diminuisciCasa.setOnClickListener {
            viewModel.remove_score()
        }
        binding.aumentaTrasferta.setOnClickListener {
            viewModel.add_score()
        }
        binding.diminuisciTrasferta.setOnClickListener {
            viewModel.remove_score()
        }
    }
    }
