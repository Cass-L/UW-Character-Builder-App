package uwbuilder.underworld.characterbuilder

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WarriorSkillsInfo : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.warrior_skills_info)

        val closePopup = findViewById<Button>(R.id.closePopup)

        closePopup.setOnClickListener() {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }

}