package com.ansari.skfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFragmentOne.setOnClickListener {
            var f1 = FragmentOne()
            var FManager = supportFragmentManager
            var transaction = FManager.beginTransaction()
            transaction.replace(R.id.fragmentStatic, f1)
            transaction.commit()

        }


        buttonFragmentTwo.setOnClickListener {
            var f2 = FragmentTwo()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentStatic,f2).commit()
        }
    }
}
