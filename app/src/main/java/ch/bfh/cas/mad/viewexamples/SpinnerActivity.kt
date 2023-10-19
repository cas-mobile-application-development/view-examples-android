package ch.bfh.cas.mad.viewexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Spinner

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val view = findViewById<Spinner>(R.id.spinner_color_choice)
        view.onItemSelectedListener = object: OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                println(resources.getStringArray(R.array.color_choices)[position])
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("Nothing selected")
            }
        }
    }
}