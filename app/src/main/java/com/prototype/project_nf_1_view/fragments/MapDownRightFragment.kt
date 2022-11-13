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


class MapDownRightFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map_down_right, container, false)
        val btn_2_3 = view.findViewById<Button>(R.id.btn_2_3)
        val btn_4 = view.findViewById<Button>(R.id.btn_4)
        val btn_9 = view.findViewById<Button>(R.id.btn_9)
        val btn_10_1 = view.findViewById<Button>(R.id.btn_10_1)
        val btn_13 = view.findViewById<Button>(R.id.btn_13)
        val btn_15 = view.findViewById<Button>(R.id.btn_15)
        val btn_15_2 = view.findViewById<Button>(R.id.btn_15_2)
        val btn_16_2 = view.findViewById<Button>(R.id.btn_16_2)
        val btn_16_3 = view.findViewById<Button>(R.id.btn_16_3)
        val btn_17_1 = view.findViewById<Button>(R.id.btn_17_1)
        val btn_18 = view.findViewById<Button>(R.id.btn_18)
        val btn_19 = view.findViewById<Button>(R.id.btn_19)
        val btn_34 = view.findViewById<Button>(R.id.btn_34)
        val btn_35 = view.findViewById<Button>(R.id.btn_35)
        val btn_44_1_1 = view.findViewById<Button>(R.id.btn_44_1_1)
        val btn_45_1 = view.findViewById<Button>(R.id.btn_45_1)
        val btn_52_3 = view.findViewById<Button>(R.id.btn_52_3)
        val btn_104 = view.findViewById<Button>(R.id.btn_104)


        btn_2_3.setOnClickListener(this)
        btn_4.setOnClickListener(this)
        btn_9.setOnClickListener(this)
        btn_10_1.setOnClickListener(this)
        btn_13.setOnClickListener(this)
        btn_15.setOnClickListener(this)
        btn_15_2.setOnClickListener(this)
        btn_16_2.setOnClickListener(this)
        btn_16_3.setOnClickListener(this)
        btn_17_1.setOnClickListener(this)
        btn_18.setOnClickListener(this)
        btn_19.setOnClickListener(this)
        btn_34.setOnClickListener(this)
        btn_35.setOnClickListener(this)
        btn_44_1_1.setOnClickListener(this)
        btn_45_1.setOnClickListener(this)
        btn_52_3.setOnClickListener(this)
        btn_104.setOnClickListener(this)

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