package za.ac.st110454008.skycast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import za.ac.st110454008.skycast.R.id.Result_button

private val UInt.text: Any
    get()
private val Nothing.text: Any
    get() {
        TODO("Not yet implemented")
    }

private fun Any.clear() {
    TODO("Not yet implemented")
}

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Declarations

        val ReturnButton = findViewById<Button>(R.id.Back_button)
        val NextButton = findViewById<Button>(R.id.Next_button)
        val ResultButton = findViewById<Button>(Result_button)
        val ResultView = findViewById<TextView>(R.id.Result_view)
        val UserInput = findViewById<EditText>(R.id.User_Input)

        ResultButton.setOnClickListener{
            val temperature= ResultButton.text.toString().toUIntOrNull()
            if (temperature==null) {
                ResultView.text = "enter another temperature"//this code is for my the information to be displayed

            } else{


                    if (temperature != null) {
                        if (temperature < 11u || temperature > 38u) {
                            ResultView.text = "Please enter the valid tempature "
                            val clear: Any = temperature.text.clear()

                        }else{
                                
                                /*4 temperatures*/
                                val result = when (temperature) {
                                    12u -> "the temperature 12 degrees was the minimum temperature for Monday and the maximum was 25 degrees, hich shows it was sunny "
                                    15u -> "the temperature of 15 degrees was the minimum temperature for Tuesday and the maximum was 29 degrees, which shows it was sunny "
                                    10u -> "the temperature  of 10 degrees as the minimum temperature is for Saturday  and the maximum was 18 degrees, which it was raining"
                                    10u -> "the temperature of 10 degrees as the minimum tempature was for SundaY and the maximum was 16, which it was cold"

                                    else -> "enter a vaild Minimum temperature"


                                }
                                ResultButton.text = result


                            
                        
                    }
                }
            }

        }


        ReturnButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)


            NextButton.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
       }
    }
}
