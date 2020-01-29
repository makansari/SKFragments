package com.ansari.skfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class PassingDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data)

        var frag1 = FragmentOne()
        supportFragmentManager.beginTransaction().add(R.id.mylayout,frag1,"adding frag").commit()
    }

    override fun onBackPressed() {
        //super.onBackPressed()

        Toast.makeText(this,"backpressed button disabled",Toast.LENGTH_SHORT).show()
    }
}
