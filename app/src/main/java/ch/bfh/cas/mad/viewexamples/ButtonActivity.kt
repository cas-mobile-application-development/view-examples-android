package ch.bfh.cas.mad.viewexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        val view = findViewById<Button>(R.id.button_save)
        view.setOnClickListener {
            println("Save")
        }
    }
}