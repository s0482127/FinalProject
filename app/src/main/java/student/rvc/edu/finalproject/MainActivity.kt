package student.rvc.edu.finalproject

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind objects
        val txtBaseDamage = findViewById<TextView>(R.id.txtBaseDamage)
        val txtAttackSpeed = findViewById<TextView>(R.id.txtAttackSpeed)
        val txtCritChance = findViewById<TextView>(R.id.txtCritChance)
        val txtBaseArmor = findViewById<TextView>(R.id.txtBaseArmor)
        val txtBaseHealth = findViewById<TextView>(R.id.txtBaseHealth)
        val txtHealthPerSecond = findViewById<TextView>(R.id.txtHealthPerSecond)
        val txtBaseMagic = findViewById<TextView>(R.id.txtBaseMagic)
        val txtMagicPerSecond = findViewById<TextView>(R.id.txtMagicPerSecond)

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener(View.OnClickListener {
            //Intent is used to send data between activities
            val intent = Intent(this, MainActivity2::class.java)
            //THIS WAS ADDED AS A TEST _________________________________________________________
            val intentFin = Intent(this, MainActivity4::class.java)
            //putExtra sets value to name SendStuff (Could be called whatever you want THIS WAS ALSO CHANGED FOR A TEST _________
            intentFin.putExtra("SendBaseDmg",txtBaseDamage.text.toString())
            //Go to second activity
            startActivity(intent)

        })

        //Fire hidekeyboard when user taps outside any text object
//Place below code right before last right bracket in function onCreate
        findViewById<View>(android.R.id.content).setOnTouchListener { _, _ ->
            hideKeyboard()
            false
        }

    }

    //function to hide keyboard goes right before the last right bracket of Class MainActivity
//should auto import android.content.Context
//should auto add import android.view.inputmethod.InputMethodManager
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }

    }

}