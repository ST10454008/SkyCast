package za.ac.st110454008.skycast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val ReturnButton2 = findViewById<Button>(R.id.Return_button2)



        ReturnButton2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)//this button is to returen the user tom the home page


        }
    }
}
