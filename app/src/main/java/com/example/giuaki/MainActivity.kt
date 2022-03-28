package com.example.giuaki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // below code is to add on click
        // listener to our add name button
        insert.setOnClickListener{

            // below we have created
            // a new DBHelper class,
            // and passed context to it
            val db = DBHelper(this, null)

            // creating variables for values
            // in name and age edit texts
            val name = Name.text.toString()
            val email = Email.text.toString()
            val contact = Contact.text.toString()
            val address = Address.text.toString()
            // calling method to add
            // name to our database
            db.addName(name, email, contact, address)

            // Toast to message on the screen
            Toast.makeText(this, name + " added to database", Toast.LENGTH_LONG).show()

            // at last, clearing edit texts
            Name.text.clear()
            Email.text.clear()
            Address.text.clear()
            Contact.text.clear()
        }

        // below code is to add on click
        // listener to our print name button
//        printName.setOnClickListener{
//
//            // creating a DBHelper class
//            // and passing context to it
//            val db = DBHelper(this, null)
//
//            // below is the variable for cursor
//            // we have called method to get
//            // all names from our database
//            // and add to name text view
//            val cursor = db.getName()
//
//            // moving the cursor to first position and
//            // appending value in the text view
//            cursor!!.moveToFirst()
//            Name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
//            Age.append(cursor.getString(cursor.getColumnIndex(DBHelper.AGE_COL)) + "\n")
//
//            // moving our cursor to next
//            // position and appending values
//            while(cursor.moveToNext()){
//                Name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
//                Age.append(cursor.getString(cursor.getColumnIndex(DBHelper.AGE_COL)) + "\n")
//            }
//
//            // at last we close our cursor
//            cursor.close()
//        }
    }
}
