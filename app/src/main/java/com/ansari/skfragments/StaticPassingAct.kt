package com.ansari.skfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StaticPassingAct : AppCompatActivity(),MyInterface {
    override fun myMethod(data: String) {

        var f2 = supportFragmentManager.findFragmentById(R.id.fragmentStaticfrag2) as FragmentTwo

        f2.getMyData(data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_passing)
    }
}
