package ch.bfh.cas.mad.viewexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SwitchCompat

class SwitchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)

        val view = findViewById<SwitchCompat>(R.id.switch_terms_accepted)
        view.isChecked = false
        view.setOnCheckedChangeListener { buttonView, isChecked ->
            println(isChecked)
        }
    }
}