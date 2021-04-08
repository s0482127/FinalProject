package student.rvc.edu.finalproject

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //bind objects
        val txtWpnArmor = findViewById<TextView>(R.id.txtWpnArmor)
        val txtWpnArmorPct = findViewById<TextView>(R.id.txtWpnArmorPct)
        val txtWpnAttackSpeed = findViewById<TextView>(R.id.txtWpnAttackSpeed)
        val txtWpnAttackSpeedPct = findViewById<TextView>(R.id.txtWpnAttackSpeedPct)
        val txtWpnCritChance = findViewById<TextView>(R.id.txtWpnCritChance)
        val txtWpnDamage = findViewById<TextView>(R.id.txtWpnDamage)
        val txtWpnDamagePct = findViewById<TextView>(R.id.txtWpnDamagePct)
        val txtWpnHealth = findViewById<TextView>(R.id.txtWpnHealth)
        val txtWpnHealthPct = findViewById<TextView>(R.id.txtWpnHealthPct)
        val txtWpnHealthPerSecond = findViewById<TextView>(R.id.txtWpnHealthPerSecond)
        val txtWpnHealthPerSecondPct = findViewById<TextView>(R.id.txtWpnHealthPerSecondPct)
        val txtWpnMagic = findViewById<TextView>(R.id.txtWpnMagic)
        val txtWpnMagicPct = findViewById<TextView>(R.id.txtWpnMagicPct)
        val txtWpnMagicPerSecond = findViewById<TextView>(R.id.txtWpnMagicPerSecond)
        val txtWpnMagicPerSecondPct = findViewById<TextView>(R.id.txtWpnMagicPerSecondPct)

        val btnNext = findViewById<Button>(R.id.btnNext2)

        btnNext.setOnClickListener(View.OnClickListener {
            //Intent is used to send data between activities
            val intent = Intent(this, MainActivity3::class.java)
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

}}