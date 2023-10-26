package com.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class MyDialogFragment : DialogFragment() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var ok: Button
    lateinit var cancel: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_dialog, container, false)
        name = view.findViewById(R.id.nameInput)
        age = view.findViewById(R.id.ageInput)
        ok = view.findViewById(R.id.ok)
        cancel = view.findViewById(R.id.cancel)

        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)

        ok.setOnClickListener {
            val userName: String = name.text.toString()
            val age: Int = age.text.toString().toInt()

            val mainActivity: MainActivity = activity as MainActivity
            mainActivity.getUserData(userName,age)
            dialog?.dismiss()
        }

        cancel.setOnClickListener {
            dialog?.dismiss()
        }
        // Inflate the layout for this fragment
        return view
    }
}