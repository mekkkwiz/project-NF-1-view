package com.prototype.project_nf_1_view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.prototype.project_nf_1_view.R


class AllMapFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_map, container, false)

        val btn_tl = view.findViewById<View>(R.id.btn_tl)
        val btn_tr = view.findViewById<View>(R.id.btn_tr)
        val btn_dl = view.findViewById<View>(R.id.btn_dl)
        val btn_dr = view.findViewById<View>(R.id.btn_dr)

        btn_tl.setOnClickListener {
            findNavController().navigate(R.id.action_allMapFragment_to_mapTopLeftFragment)
        }
        btn_tr.setOnClickListener {
            findNavController().navigate(R.id.action_allMapFragment_to_mapTopRightFragment)
        }
        btn_dl.setOnClickListener {
            findNavController().navigate(R.id.action_allMapFragment_to_mapDownLeftFragment)
        }
        btn_dr.setOnClickListener {
            findNavController().navigate(R.id.action_allMapFragment_to_mapDownRightFragment)
        }

        return view
    }
}