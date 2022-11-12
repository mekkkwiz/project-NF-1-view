package com.prototype.project_nf_1_view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.prototype.project_nf_1_view.BottomSheetFragment
import com.prototype.project_nf_1_view.R

class MapTopLeftFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map_top_left, container, false)

        val bottomSheetFragment = BottomSheetFragment()

        val btn_111 = view.findViewById<View>(R.id.btn_111)
        val btn_83 = view.findViewById<View>(R.id.btn_83)


        btn_111.setOnClickListener {
            Toast.makeText(context, "111", Toast.LENGTH_SHORT).show()
            bottomSheetFragment.show(parentFragmentManager, "BottomSheetDialog")
        }
        btn_83.setOnClickListener {
            Toast.makeText(context, "83", Toast.LENGTH_SHORT).show()
        }
        return view
    }



}