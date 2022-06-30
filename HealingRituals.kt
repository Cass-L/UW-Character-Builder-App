package uwbuilder.underworld.characterbuilder

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HealingRituals : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.healing_rituals)

        val closePopup = findViewById<Button>(R.id.closePopup)

        closePopup.setOnClickListener() {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }

}