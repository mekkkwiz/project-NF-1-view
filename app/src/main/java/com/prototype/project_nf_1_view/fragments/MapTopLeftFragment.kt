package com.prototype.project_nf_1_view.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.prototype.project_nf_1_view.BottomSheetFragment
import com.prototype.project_nf_1_view.R

class MapTopLeftFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map_top_left, container, false)

        val btn_111 = view.findViewById<View>(R.id.btn_111)
        val btn_65 = view.findViewById<View>(R.id.btn_65)
        val btn_97 = view.findViewById<View>(R.id.btn_97)
        val btn_62_5 = view.findViewById<View>(R.id.btn_62_5)
        val btn_101 = view.findViewById<View>(R.id.btn_101)
        val btn_99 = view.findViewById<View>(R.id.btn_99)
        val btn_61 = view.findViewById<View>(R.id.btn_61)
        val btn_114 = view.findViewById<View>(R.id.btn_114)
        val btn_9_1 = view.findViewById<View>(R.id.btn_9_1)
        val btn_60 = view.findViewById<View>(R.id.btn_60)
        val btn_58_1 = view.findViewById<View>(R.id.btn_58_1)
        val btn_58 = view.findViewById<View>(R.id.btn_58)
        val btn_56 = view.findViewById<View>(R.id.btn_56)
        val btn_53 = view.findViewById<View>(R.id.btn_53)
        val btn_52_3 = view.findViewById<View>(R.id.btn_52_3)
        val btn_44_1 = view.findViewById<View>(R.id.btn_44_1)
        val btn_44_3 = view.findViewById<View>(R.id.btn_44_3)
        val btn_44 = view.findViewById<View>(R.id.btn_44)
        val btn_44_1_1 = view.findViewById<View>(R.id.btn_44_1_1)








        btn_111.setOnClickListener (this)
        btn_65.setOnClickListener (this)
        btn_97.setOnClickListener (this)
        btn_62_5.setOnClickListener (this)
        btn_101.setOnClickListener (this)
        btn_99.setOnClickListener (this)
        btn_61.setOnClickListener (this)
        btn_114.setOnClickListener (this)
        btn_9_1.setOnClickListener (this)
        btn_60.setOnClickListener (this)
        btn_58_1.setOnClickListener (this)
        btn_58.setOnClickListener (this)
        btn_56.setOnClickListener (this)
        btn_53.setOnClickListener (this)
        btn_52_3.setOnClickListener (this)
        btn_44_1.setOnClickListener (this)
        btn_44_3.setOnClickListener (this)
        btn_44.setOnClickListener (this)
        btn_44_1_1.setOnClickListener (this)






        return view
    }


    override fun onClick(v: View) {
        v as Button
        val bottomSheetFragment = BottomSheetFragment()
        val bundle = Bundle()
        Log.i("address", v.text.toString())
        bundle.putString("address", v.text.toString())
        bottomSheetFragment.arguments = bundle
        bottomSheetFragment.show(parentFragmentManager, "BottomSheetDialog")
    }


}