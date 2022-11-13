package com.prototype.project_nf_1_view.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.prototype.project_nf_1_view.BottomSheetFragment
import com.prototype.project_nf_1_view.R


class MapDownLeftFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map_down_left, container, false)

        val btn_2_3 = view.findViewById<View>(R.id.btn_2_3)
        val btn_3 = view.findViewById<View>(R.id.btn_3)
        val btn_4 = view.findViewById<View>(R.id.btn_4)
        val btn_8 = view.findViewById<View>(R.id.btn_8)
        val btn_10_1 = view.findViewById<View>(R.id.btn_10_1)
        val btn_13 = view.findViewById<View>(R.id.btn_13)
        val btn_35_2 = view.findViewById<View>(R.id.btn_35_2)
        val btn_44_1_1 = view.findViewById<View>(R.id.btn_44_1_1)
        val btn_49_3 = view.findViewById<View>(R.id.btn_49_3)
        val btn_51_1 = view.findViewById<View>(R.id.btn_51_1)
        val btn_52_3 = view.findViewById<View>(R.id.btn_52_3)
        val btn_64_2 = view.findViewById<View>(R.id.btn_64_2)
        val btn_73 = view.findViewById<View>(R.id.btn_73)
        val btn_74_1 = view.findViewById<View>(R.id.btn_74_1)
        val btn_102 = view.findViewById<View>(R.id.btn_102)
        val btn_107= view.findViewById<View>(R.id.btn_107)
        val btn_111 = view.findViewById<View>(R.id.btn_111)

        btn_2_3.setOnClickListener(this)
        btn_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_8.setOnClickListener(this)
        btn_10_1.setOnClickListener(this)
        btn_13.setOnClickListener(this)
        btn_35_2.setOnClickListener(this)
        btn_44_1_1.setOnClickListener(this)
        btn_49_3.setOnClickListener(this)
        btn_51_1.setOnClickListener(this)
        btn_52_3.setOnClickListener(this)
        btn_64_2.setOnClickListener(this)
        btn_73.setOnClickListener(this)
        btn_74_1.setOnClickListener(this)
        btn_102.setOnClickListener(this)
        btn_107.setOnClickListener(this)
        btn_111.setOnClickListener(this)


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