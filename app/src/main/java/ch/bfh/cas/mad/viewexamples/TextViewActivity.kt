package ch.bfh.cas.mad.viewexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        val view = findViewById<TextView>(R.id.textview_output)
        view.text = "A new text"
    }
}