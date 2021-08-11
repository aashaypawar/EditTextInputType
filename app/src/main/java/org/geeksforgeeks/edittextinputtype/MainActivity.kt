package org.geeksforgeeks.edittextinputtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mEditText = findViewById<EditText>(R.id.edit_text)
        val mTextBtn = findViewById<Button>(R.id.textBtn)
        val mNumBtn = findViewById<Button>(R.id.numBtn)

        mTextBtn.setOnClickListener {
            mEditText.inputType = InputType.TYPE_CLASS_TEXT
        }

        mNumBtn.setOnClickListener {
            mEditText.inputType = InputType.TYPE_CLASS_NUMBER
        }
    }
}