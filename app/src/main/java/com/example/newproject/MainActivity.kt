package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val TextAmount = findViewById<EditText>(R.id.AmountValue)
        val Radio1 = findViewById<RadioButton>(R.id.radioButton2)
        val Radio2 = findViewById<RadioButton>(R.id.radioButton)
        val ButtonClick = findViewById<Button>(R.id.button)


ButtonClick.setOnClickListener {
    if(TextAmount.text.isBlank()){
        Toast.makeText(this,"لطفا مبلغ را وارد کنید",Toast.LENGTH_SHORT).show()
        return@setOnClickListener
    }
    var number = TextAmount.editableText.toString().toInt()


    if(Radio1.isChecked)

    number = (number * 12)/100

    else (Radio2.isChecked)

    number = (number * 22)/100

    Toast.makeText(this,"سود شما می شود:"+number.toString(),Toast.LENGTH_SHORT).show()
}


    }

    }
