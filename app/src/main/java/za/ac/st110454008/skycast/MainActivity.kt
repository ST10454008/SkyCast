package za.ac.st110454008.skycast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val StartButton = findViewById<Button>(R.id.Start_button)

        StartButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)//this code is for the start button to work


        }
    }
}