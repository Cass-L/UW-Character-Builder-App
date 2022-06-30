package uwbuilder.underworld.characterbuilder

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MagicInfo : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.magic_info)

        val elementalButton = findViewById<Button>(R.id.elementalButton)
        val healingButton = findViewById<Button>(R.id.healingButton)
        val natureButton = findViewById<Button>(R.id.natureButton)
        val protectionsButton = findViewById<Button>(R.id.protectionsButton)
        val psionicsButton = findViewById<Button>(R.id.psionicsButton)
        val necromancyButton = findViewById<Button>(R.id.necromancyButton)
        val sigilButton = findViewById<Button>(R.id.sigilButton)
        val wytchButton = findViewById<Button>(R.id.wytchButton)
        val lightButton = findViewById<Button>(R.id.lightButton)
        val darkButton = findViewById<Button>(R.id.darkButton)
        val draconicButton = findViewById<Button>(R.id.draconicButton)

        val elementalRituals = findViewById<Button>(R.id.elementalRituals)
        val healingRituals = findViewById<Button>(R.id.healingRituals)
        val natureRituals = findViewById<Button>(R.id.natureRituals)
        val protectionsRituals = findViewById<Button>(R.id.protectionsRituals)
        val psionicsRituals = findViewById<Button>(R.id.psionicsRituals)
        val necromancyRituals = findViewById<Button>(R.id.necromancyRituals)
        val sigilRituals = findViewById<Button>(R.id.sigilRituals)
        val wytchRituals = findViewById<Button>(R.id.wytchRituals)
        val lightRituals = findViewById<Button>(R.id.lightRituals)
        val darkRituals = findViewById<Button>(R.id.darkRituals)
        val draconicRituals = findViewById<Button>(R.id.draconicRituals)

        val closePopup = findViewById<Button>(R.id.closePopup)

        elementalButton.setOnClickListener() {
            val intent = Intent(this, ElementalInfo::class.java)
            startActivity(intent)
        }
        healingButton.setOnClickListener() {
            val intent = Intent(this, HealingInfo::class.java)
            startActivity(intent)
        }
        natureButton.setOnClickListener() {
            val intent = Intent(this, NatureInfo::class.java)
            startActivity(intent)
        }
        protectionsButton.setOnClickListener() {
            val intent = Intent(this, ProtectionsInfo::class.java)
            startActivity(intent)
        }
        psionicsButton.setOnClickListener() {
            val intent = Intent(this, PsionicsInfo::class.java)
            startActivity(intent)
        }
        necromancyButton.setOnClickListener() {
            val intent = Intent(this, NecromancyInfo::class.java)
            startActivity(intent)
        }
        sigilButton.setOnClickListener() {
            val intent = Intent(this, SigilInfo::class.java)
            startActivity(intent)
        }
        wytchButton.setOnClickListener() {
            val intent = Intent(this, WytchInfo::class.java)
            startActivity(intent)
        }
        lightButton.setOnClickListener() {
            val intent = Intent(this, LightInfo::class.java)
            startActivity(intent)
        }
        darkButton.setOnClickListener() {
            val intent = Intent(this, DarkInfo::class.java)
            startActivity(intent)
        }
        draconicButton.setOnClickListener() {
            val intent = Intent(this, DraconicInfo::class.java)
            startActivity(intent)
        }

        elementalRituals.setOnClickListener() {
            val intent = Intent(this, ElementalRituals::class.java)
            startActivity(intent)
        }
        healingRituals.setOnClickListener() {
            val intent = Intent(this, HealingRituals::class.java)
            startActivity(intent)
        }
        natureRituals.setOnClickListener() {
            val intent = Intent(this, NatureRituals::class.java)
            startActivity(intent)
        }
        protectionsRituals.setOnClickListener() {
            val intent = Intent(this, ProtectionsRituals::class.java)
            startActivity(intent)
        }
        psionicsRituals.setOnClickListener() {
            val intent = Intent(this, PsionicsRituals::class.java)
            startActivity(intent)
        }
        necromancyRituals.setOnClickListener() {
            val intent = Intent(this, NecromancyRituals::class.java)
            startActivity(intent)
        }
        sigilRituals.setOnClickListener() {
            val intent = Intent(this, SigilRituals::class.java)
            startActivity(intent)
        }
        wytchRituals.setOnClickListener() {
            val intent = Intent(this, WytchRituals::class.java)
            startActivity(intent)
        }
        lightRituals.setOnClickListener() {
            val intent = Intent(this, LightRituals::class.java)
            startActivity(intent)
        }
        darkRituals.setOnClickListener() {
            val intent = Intent(this, DarkRituals::class.java)
            startActivity(intent)
        }
        draconicRituals.setOnClickListener() {
            val intent = Intent(this, DraconicRituals::class.java)
            startActivity(intent)
        }

        closePopup.setOnClickListener() {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }

}