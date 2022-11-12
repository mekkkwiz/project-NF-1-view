package com.prototype.project_nf_1_view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
            Toast.makeText(context, "Top Left", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_allMapFragment_to_mapTopLeftFragment)
        }
        btn_tr.setOnClickListener {
            Toast.makeText(context, "Top Right", Toast.LENGTH_SHORT).show()
        }
        btn_dl.setOnClickListener {
            Toast.makeText(context, "Down Left", Toast.LENGTH_SHORT).show()
        }
        btn_dr.setOnClickListener {
            Toast.makeText(context, "Down Right", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}