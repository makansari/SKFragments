package com.ansari.skfragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne : Fragment() {

    lateinit var myInterface : MyInterface
    override fun onAttach(context: Context?) {
        super.onAttach(context)

        myInterface = activity as MyInterface
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_one,container,false)

        view.buttonPassdata.setOnClickListener {
            myInterface.myMethod("ansari")
          /*  Toast.makeText(activity,"passing data button clicked",Toast.LENGTH_SHORT).show()
              // passing the data via bundle
                var bundle = Bundle()
                bundle.putString("key1","Data been passed ")

            // passing to a Fragment

            var f2 = FragmentTwo()
            f2.arguments = bundle

            fragmentManager!!.beginTransaction().replace(R.id.mylayout,f2).addToBackStack(null).commit()*/



        }





        return view
    }


}