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


class MapTopRightFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map_top_right, container, false)

        val bottomSheetFragment = BottomSheetFragment()


        val btn_9 = view.findViewById<View>(R.id.btn_9)
        val btn_97 = view.findViewById<View>(R.id.btn_97)
        val btn_65 = view.findViewById<View>(R.id.btn_65)
        val btn_62_5 = view.findViewById<View>(R.id.btn_62_5)
        val btn_101 = view.findViewById<View>(R.id.btn_101)
        val btn_103 = view.findViewById<View>(R.id.btn_103)
        val btn_112 = view.findViewById<View>(R.id.btn_112)
        val btn_52_3 = view.findViewById<View>(R.id.btn_52_3)
        val btn_53 = view.findViewById<View>(R.id.btn_53)
        val btn_58 = view.findViewById<View>(R.id.btn_58)
        val btn_31 = view.findViewById<View>(R.id.btn_31)
        val btn_99 = view.findViewById<View>(R.id.btn_99)
        val btn_70_2 = view.findViewById<View>(R.id.btn_70_2)
        val btn_60 = view.findViewById<View>(R.id.btn_60)
        val btn_44 = view.findViewById<View>(R.id.btn_44)
        val btn_44_3 = view.findViewById<View>(R.id.btn_44_3)
        val btn_44_1 = view.findViewById<View>(R.id.btn_44_1)
        val btn_44_1_1 = view.findViewById<View>(R.id.btn_44_1_1)
        val btn_38 = view.findViewById<View>(R.id.btn_38)
        val btn_38_1 = view.findViewById<View>(R.id.btn_38_1)
        val btn_37 = view.findViewById<View>(R.id.btn_37)
        val btn_35 = view.findViewById<View>(R.id.btn_35)
        val btn_34 = view.findViewById<View>(R.id.btn_34)




        btn_9.setOnClickListener(this)
        btn_97.setOnClickListener(this)
        btn_65.setOnClickListener(this)
        btn_62_5.setOnClickListener(this)
        btn_101.setOnClickListener(this)
        btn_103.setOnClickListener(this)
        btn_112.setOnClickListener(this)
        btn_52_3.setOnClickListener(this)
        btn_53.setOnClickListener(this)
        btn_58.setOnClickListener(this)
        btn_31.setOnClickListener(this)
        btn_99.setOnClickListener(this)
        btn_70_2.setOnClickListener(this)
        btn_60.setOnClickListener(this)
        btn_44.setOnClickListener(this)
        btn_44_3.setOnClickListener(this)
        btn_44_1.setOnClickListener(this)
        btn_44_1_1.setOnClickListener(this)
        btn_38.setOnClickListener(this)
        btn_38_1.setOnClickListener(this)
        btn_37.setOnClickListener(this)
        btn_35.setOnClickListener(this)
        btn_34.setOnClickListener(this)




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