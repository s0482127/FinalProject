package student.rvc.edu.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val txtShowDmg = findViewById<TextView>(R.id.txtShowDmg)
        var strShowDmg: String? = intent.getStringExtra("SendBaseDamage")
        txtShowDmg.text = strShowDmg

    }
}