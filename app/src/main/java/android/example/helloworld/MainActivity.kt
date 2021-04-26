package android.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // to count number of times button is tapped
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap(view: View) {
        // to increase the number of counts
        count++
        // locate textview and update text
        val textview = findViewById(R.id.textView) as TextView
        textview.text = "$count"
    }
}