package ch.bfh.cas.mad.viewexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {
    private lateinit var buttonTextView: Button
    private lateinit var buttonEditText: Button
    private lateinit var buttonButton: Button
    private lateinit var buttonSpinner: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTextView = findViewById(R.id.button_textview)
        buttonEditText = findViewById(R.id.button_editText)
        buttonButton = findViewById(R.id.button_button)
        buttonSpinner = findViewById(R.id.button_spinner)
    }

    override fun onResume() {
        super.onResume()
        buttonTextView.setOnClickListener {
            startActivity(TextViewActivity::class)
        }
        buttonEditText.setOnClickListener {
            startActivity(EditTextActivity::class)
        }
        buttonButton.setOnClickListener {
            startActivity(ButtonActivity::class)
        }
        buttonSpinner.setOnClickListener {
            startActivity(SpinnerActivity::class)
        }
    }

    override fun onPause() {
        super.onPause()
        buttonTextView.setOnClickListener(null)
        buttonEditText.setOnClickListener(null)
        buttonButton.setOnClickListener(null)
        buttonSpinner.setOnClickListener(null)
    }

    private fun startActivity(clazz: KClass<*>) {
        val intent = Intent(this, clazz.java)
        startActivity(intent)
    }
}