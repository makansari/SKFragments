package com.ansari.skfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       registerForContextMenu(imageView)

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


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var id = item?.itemId

        if(id == R.id.item_mytoast){

            Toast.makeText(this,"Options menu selected",Toast.LENGTH_LONG).show()
        }

        if(id == R.id.item_search){
            Toast.makeText(this,"searching ....",Toast.LENGTH_LONG).show()

        }

        return super.onOptionsItemSelected(item)
    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
                        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.my_menu,menu)
    }


    override fun onContextItemSelected(item: MenuItem?): Boolean {

        var id = item?.itemId

        if(id == R.id.item_mytoast){

            Toast.makeText(this,"CONTEXT menu selected",Toast.LENGTH_LONG).show()
        }

        if(id == R.id.item_seconAct){

        }

        return super.onContextItemSelected(item)
    }
}
