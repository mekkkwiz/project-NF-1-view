package com.prototype.project_nf_1_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.prototype.project_nf_1_view.data.PersonViewModel
import com.prototype.project_nf_1_view.fragments.dialog.DialogListAdapter

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var mPersonViewModel : PersonViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_bottom_sheet, container, false)

        var addressNo = arguments?.getString("address") ?: "61" //default value


        // View items
        val tv_address = view.findViewById<TextView>(R.id.tv_address)
        val tv_vhv_name = view.findViewById<TextView>(R.id.tv_vhv_name)

        //recyclerview
        val adapter = DialogListAdapter()
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcy_dialog)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        //PersonViewModel
        mPersonViewModel = ViewModelProvider(this)[PersonViewModel::class.java]
        mPersonViewModel.readPersonByAddress(addressNo)
            .observe(viewLifecycleOwner, Observer { person ->
                adapter.setData(person)
            })

        tv_address.text = "บ้านเลขที่ $addressNo"
        mPersonViewModel.readVhvByAddress(addressNo).observe(viewLifecycleOwner, Observer { vhv ->
            tv_vhv_name.text = vhv
        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}