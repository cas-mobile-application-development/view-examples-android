package ch.bfh.cas.mad.viewexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        val view = findViewById<EditText>(R.id.edittext_name)
        val name = view.text.toString()
        view.setText("New value")
    }
}