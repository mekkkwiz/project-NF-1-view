package com.prototype.project_nf_1_view.fragments.dialog

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.prototype.project_nf_1_view.R
import com.prototype.project_nf_1_view.data.Person


class DialogListAdapter: RecyclerView.Adapter<DialogListAdapter.ViewHolder>() {

    private var personList = emptyList<Person>()

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val color = itemView.findViewById<ImageView>(R.id.img_color)!!
        val fName = itemView.findViewById<TextView>(R.id.tv_f_name)!!
        val lName = itemView.findViewById<TextView>(R.id.tv_l_name)!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_person, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = personList[position]
        holder.fName.text = currentItem.firstName
        holder.lName.text = currentItem.lastName
        when (currentItem.color) {
            "Red" -> holder.color.setBackgroundColor(Color.parseColor("#d20000"))
            "Yellow" -> holder.color.setBackgroundColor(Color.parseColor("#ffd300"))
            "Green" -> holder.color.setBackgroundColor(Color.parseColor("#90d300"))
            "Orange" -> holder.color.setBackgroundColor(Color.parseColor("#ff7e1a"))
            "Headman" -> holder.color.setImageResource(R.drawable.ic_headman)
        }

    }

    fun setData(person: List<Person>) {
        this.personList = person
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return personList.size
    }
}