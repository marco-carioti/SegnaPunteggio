package com.example.segnapunteggio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.navArgs
import com.example.segnapunteggio.databinding.FragmentFirstBinding
import com.example.segnapunteggio.databinding.FragmentHomeBinding
import com.example.segnapunteggio.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    val args:SecondFragmentArgs by navArgs()
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding= FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.risultatoFinale.text= args.punteggioCasa
        binding.risultatoFinale2.text=args.punteggioTrasferta
    }
}
