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
    private lateinit var buttonSwitch: Button
    private lateinit var buttonSpinner: Button
    private lateinit var buttonConstraintLayout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTextView = findViewById(R.id.button_textview)
        buttonEditText = findViewById(R.id.button_editText)
        buttonButton = findViewById(R.id.button_button)
        buttonSwitch = findViewById(R.id.button_switch)
        buttonSpinner = findViewById(R.id.button_spinner)
        buttonConstraintLayout = findViewById(R.id.button_constraint_layout)
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
        buttonSwitch.setOnClickListener {
            startActivity(SwitchActivity::class)
        }
        buttonSpinner.setOnClickListener {
            startActivity(SpinnerActivity::class)
        }
        buttonConstraintLayout.setOnClickListener {
            startActivity(ConstraintLayoutActivity::class)
        }
    }

    override fun onPause() {
        super.onPause()
        buttonTextView.setOnClickListener(null)
        buttonEditText.setOnClickListener(null)
        buttonButton.setOnClickListener(null)
        buttonSwitch.setOnClickListener(null)
        buttonSpinner.setOnClickListener(null)
        buttonConstraintLayout.setOnClickListener(null)
    }

    private fun startActivity(clazz: KClass<*>) {
        val intent = Intent(this, clazz.java)
        startActivity(intent)
    }
}