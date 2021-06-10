package edu.co.icesi.semana2kotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    private lateinit var newusernameET : EditText
    private lateinit var backBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val username = intent.extras?.getString("username")

        newusernameET = findViewById(R.id.newusernameET)
        backBtn = findViewById(R.id.backBtn)

        newusernameET.setText(username)


        backBtn.setOnClickListener{
            val i = Intent().apply {
                putExtra("username",newusernameET.text.toString())
            }
            setResult(Activity.RESULT_OK, i)
            finish()
        }
    }
}