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

        val bottomSheetFragment = BottomSheetFragment()

        val btn_111 = view.findViewById<View>(R.id.btn_111)
        val btn_83 = view.findViewById<View>(R.id.btn_83)
        val btn_95 = view.findViewById<View>(R.id.btn_95)
        val btn_64_1 = view.findViewById<View>(R.id.btn_64_1)
        val btn_64 = view.findViewById<View>(R.id.btn_64)
        val btn_66_1 = view.findViewById<View>(R.id.btn_66_1)
        val btn_66 = view.findViewById<View>(R.id.btn_66)
        val btn_65 = view.findViewById<View>(R.id.btn_65)
        val btn_7 = view.findViewById<View>(R.id.btn_7)
        val btn_67 = view.findViewById<View>(R.id.btn_67)
        val btn_123 = view.findViewById<View>(R.id.btn_123)
        val btn_97 = view.findViewById<View>(R.id.btn_97)
        val btn_67_2 = view.findViewById<View>(R.id.btn_67_2)
        val btn_62 = view.findViewById<View>(R.id.btn_62)
        val btn_62_7 = view.findViewById<View>(R.id.btn_62_7)
        val btn_62_5 = view.findViewById<View>(R.id.btn_62_5)
        val btn_62_2 = view.findViewById<View>(R.id.btn_62_2)
        val btn_101 = view.findViewById<View>(R.id.btn_101)
        val btn_62_1 = view.findViewById<View>(R.id.btn_62_1)
        val btn_77 = view.findViewById<View>(R.id.btn_77)
        val btn_99 = view.findViewById<View>(R.id.btn_99)
        val btn_70_3 = view.findViewById<View>(R.id.btn_70_3)
        val btn_70_1 = view.findViewById<View>(R.id.btn_70_1)
        val btn_113 = view.findViewById<View>(R.id.btn_113)
        val btn_61 = view.findViewById<View>(R.id.btn_61)
        val btn_115 = view.findViewById<View>(R.id.btn_115)
        val btn_61_2 = view.findViewById<View>(R.id.btn_61_2)
        val btn_61_1 = view.findViewById<View>(R.id.btn_61_1)
        val btn_114 = view.findViewById<View>(R.id.btn_114)
        val btn_9_1 = view.findViewById<View>(R.id.btn_9_1)
        val btn_60_1 = view.findViewById<View>(R.id.btn_60_1)
        val btn_60 = view.findViewById<View>(R.id.btn_60)
        val btn_58_1 = view.findViewById<View>(R.id.btn_58_1)
        val btn_58 = view.findViewById<View>(R.id.btn_58)
        val btn_57 = view.findViewById<View>(R.id.btn_57)
        val btn_56_2 = view.findViewById<View>(R.id.btn_56_2)
        val btn_56_1 = view.findViewById<View>(R.id.btn_56_1)
        val btn_56 = view.findViewById<View>(R.id.btn_56)
        val btn_53 = view.findViewById<View>(R.id.btn_53)
        val btn_52_1 = view.findViewById<View>(R.id.btn_52_1)
        val btn_52_3 = view.findViewById<View>(R.id.btn_52_3)
        val btn_41_2 = view.findViewById<View>(R.id.btn_41_2)
        val btn_41_1 = view.findViewById<View>(R.id.btn_41_1)
        val btn_41 = view.findViewById<View>(R.id.btn_41)
        val btn_43_1 = view.findViewById<View>(R.id.btn_43_1)
        val btn_42 = view.findViewById<View>(R.id.btn_42)
        val btn_105 = view.findViewById<View>(R.id.btn_105)
        val btn_44_3 = view.findViewById<View>(R.id.btn_44_3)
        val btn_44_2 = view.findViewById<View>(R.id.btn_44_2)
        val btn_44_1 = view.findViewById<View>(R.id.btn_44_1)
        val btn_44 = view.findViewById<View>(R.id.btn_44)
        val btn_44_1_1 = view.findViewById<View>(R.id.btn_44_1_1)
        val btn_45 = view.findViewById<View>(R.id.btn_45)
        val btn_47 = view.findViewById<View>(R.id.btn_47)







        btn_111.setOnClickListener (this)
        btn_83.setOnClickListener (this)
        btn_95.setOnClickListener (this)
        btn_64_1.setOnClickListener (this)
        btn_64.setOnClickListener (this)
        btn_66_1.setOnClickListener (this)
        btn_66.setOnClickListener (this)
        btn_65.setOnClickListener (this)
        btn_7.setOnClickListener (this)
        btn_67.setOnClickListener (this)
        btn_123.setOnClickListener (this)
        btn_97.setOnClickListener (this)
        btn_67_2.setOnClickListener (this)
        btn_62.setOnClickListener (this)
        btn_62_7.setOnClickListener (this)
        btn_62_5.setOnClickListener (this)
        btn_62_2.setOnClickListener (this)
        btn_101.setOnClickListener (this)
        btn_62_1.setOnClickListener (this)
        btn_77.setOnClickListener (this)
        btn_99.setOnClickListener (this)
        btn_70_3.setOnClickListener (this)
        btn_70_1.setOnClickListener (this)
        btn_113.setOnClickListener (this)
        btn_61.setOnClickListener (this)
        btn_115.setOnClickListener (this)
        btn_61_2.setOnClickListener (this)
        btn_61_1.setOnClickListener (this)
        btn_114.setOnClickListener (this)
        btn_9_1.setOnClickListener (this)
        btn_60_1.setOnClickListener (this)
        btn_60.setOnClickListener (this)
        btn_58_1.setOnClickListener (this)
        btn_58.setOnClickListener (this)
        btn_57.setOnClickListener (this)
        btn_56_2.setOnClickListener (this)
        btn_56_1.setOnClickListener (this)
        btn_56.setOnClickListener (this)
        btn_53.setOnClickListener (this)
        btn_52_1.setOnClickListener (this)
        btn_52_3.setOnClickListener (this)
        btn_41_2.setOnClickListener (this)
        btn_41_1.setOnClickListener (this)
        btn_41.setOnClickListener (this)
        btn_43_1.setOnClickListener (this)
        btn_42.setOnClickListener (this)
        btn_105.setOnClickListener (this)
        btn_44_3.setOnClickListener (this)
        btn_44_2.setOnClickListener (this)
        btn_44_1.setOnClickListener (this)
        btn_44.setOnClickListener (this)
        btn_44_1_1.setOnClickListener (this)
        btn_45.setOnClickListener (this)
        btn_47.setOnClickListener (this)






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