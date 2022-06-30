package uwbuilder.underworld.characterbuilder

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class PopupWindow : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.activity_popup_window)

        val closePopup = findViewById<Button>(R.id.closePopup)

        //Character Values
        var characterRace = intent.getStringExtra("characterRace")
        var cultureFragsInt = intent.getIntExtra("cultureFragsInt", 0)
        var characterCulture = intent.getStringExtra("characterCulture")
        var characterClass = intent.getStringExtra("characterClass")
        var characterVocation = intent.getStringExtra("characterVocation")
        var levelInt = intent.getIntExtra("levelInt", 1)
        var hpInt = intent.getIntExtra("hpInt", 0)
        var blanketsInt = intent.getIntExtra("blanketsInt", 0)
        var cpInt = intent.getIntExtra("cpInt", 150)
        var freeInt = intent.getIntExtra("freeInt", 0)
        var characterSpentInt = intent.getIntExtra("characterSpentInt", 0)
        var characterFragsInt = intent.getIntExtra("characterFragsInt", 0)

        //General Skills
        var autoRacialSkill = intent.getStringExtra("autoRacialSkill")
        var racialSkill = intent.getStringExtra("racialSkill")
        var racialSelect = intent.getIntExtra("racialSelect", 0)
        var bodySelect = intent.getIntExtra("bodySelect", 0)
        var strengthSelect = intent.getIntExtra("strengthSelect", 0)
        var level3Skill = intent.getStringExtra("level3Skill")
        var level3Select = intent.getIntExtra("level3Select", 0)
        var level6Skill = intent.getStringExtra("level6Skill")
        var level6Select = intent.getIntExtra("level6Select", 0)
        var level9Skill = intent.getStringExtra("level9Skill")
        var level9Select = intent.getIntExtra("level9Select", 0)
        var level12Skill = intent.getStringExtra("level12Skill")
        var level12Select = intent.getIntExtra("level12Select", 0)
        var trapsmithSelect = intent.getIntExtra("trapsmithSelect", 0)
        var tradesmanSelect = intent.getIntExtra("tradesmanSelect", 0)
        var alchemySelect = intent.getIntExtra("alchemySelect", 0)
        var chemistrySelect = intent.getIntExtra("chemistrySelect", 0)
        var blacksmithingSelect = intent.getIntExtra("blacksmithingSelect", 0)
        var artificeSelect = intent.getIntExtra("artificeSelect", 0)
        var scrollcraftingSelect = intent.getIntExtra("scrollcraftingSelect", 0)
        var coldHandsSelect = intent.getIntExtra("coldHandsSelect", 0)
        var createAlcoholSelect = intent.getIntExtra("createAlcoholSelect", 0)
        var heavyDrinkerSelect = intent.getIntExtra("heavyDrinkerSelect", 0)
        var hindsightSelect = intent.getIntExtra("hindsightSelect", 0)
        var intuitionSelect = intent.getIntExtra("intuitionSelect", 0)
        var lootingSelect = intent.getIntExtra("lootingSelect", 0)
        var paragonSelect = intent.getIntExtra("paragonSelect", 0)
        var possumSelect = intent.getIntExtra("possumSelect", 0)
        var teacherSelect = intent.getIntExtra("teacherSelect", 0)
        //Warrior Skills
        var ambidexteritySelect = intent.getIntExtra("ambidexteritySelect", 0)
        var florentineSelect = intent.getIntExtra("florentineSelect", 0)
        var flurrySelect = intent.getIntExtra("flurrySelect", 0)
        var heavyArmorSelect = intent.getIntExtra("heavyArmorSelect", 0)
        var shieldSelect = intent.getIntExtra("shieldSelect", 0)
        var selfMutilateSelect = intent.getIntExtra("selfMutilateSelect", 0)
        var weapRefocusSelect = intent.getIntExtra("weapRefocusSelect", 0)
        var groupProfMedSelect = intent.getIntExtra("groupProfMedSelect", 0)
        var groupProfLrgSelect = intent.getIntExtra("groupProfLrgSelect", 0)
        var profExoticSelect = intent.getIntExtra("profExoticSelect", 0)
        var groupSpecSelect = intent.getIntExtra("groupSpecSelect", 0)
        var specificSpecSelect = intent.getIntExtra("specificSpecSelect", 0)
        var slayParrySelect = intent.getIntExtra("slayParrySelect", 0)
        var slayParryMstrSelect = intent.getIntExtra("slayParryMstrSelect", 0)
        var battlefieldRepairSelect = intent.getIntExtra("battlefieldRepairSelect", 0)
        var crippleSelect = intent.getIntExtra("crippleSelect", 0)
        var decapitateSelect = intent.getIntExtra("decapitateSelect", 0)
        var dirtEyeSelect = intent.getIntExtra("dirtEyeSelect", 0)
        var tripSelect = intent.getIntExtra("tripSelect", 0)
        var whirlBlowsSelect = intent.getIntExtra("whirlBlowsSelect", 0)
        //Rogue Skills
        var garroteSelect = intent.getIntExtra("garroteSelect", 0)
        var sapSelect = intent.getIntExtra("sapSelect", 0)
        var vitalBlowSelect = intent.getIntExtra("vitalBlowSelect", 0)
        var dodgeSelect = intent.getIntExtra("dodgeSelect", 0)
        var specificCritSelect = intent.getIntExtra("specificCritSelect", 0)
        var groupCritSelect = intent.getIntExtra("groupCritSelect", 0)
        var executeSelect = intent.getIntExtra("executeSelect", 0)
        var executeMstrSelect = intent.getIntExtra("executeMstrSelect", 0)
        var blindfighterSelect = intent.getIntExtra("blindfighterSelect", 0)
        var escapeSelect = intent.getIntExtra("escapeSelect", 0)
        var riposteSelect = intent.getIntExtra("riposteSelect", 0)
        var suckerPunchSelect = intent.getIntExtra("suckerPunchSelect", 0)
        var thievesCantSelect = intent.getIntExtra("thievesCantSelect", 0)
        var tumbleSelect = intent.getIntExtra("tumbleSelect", 0)
        //Scholar Skills
        var mysticismSelect = intent.getIntExtra("mysticismSelect", 0)
        var demAngArtsSelect = intent.getIntExtra("demAngArtsSelect", 0)
        var necroArtsSelect = intent.getIntExtra("necroArtsSelect", 0)
        var anatomySelect = intent.getIntExtra("anatomySelect", 0)
        var firstAidSelect = intent.getIntExtra("firstAidSelect", 0)
        var physicianSelect = intent.getIntExtra("physicianSelect", 0)
        var readWriteSelect = intent.getIntExtra("readWriteSelect", 0)
        var readMagicSelect = intent.getIntExtra("readMagicSelect", 0)
        var rdAdvMagicSelect = intent.getIntExtra("rdAdvMagicSelect", 0)
        var rdRitualMagicSelect = intent.getIntExtra("rdRitualMagicSelect", 0)
        var advRitualSelect = intent.getIntExtra("advRitualSelect", 0)
        var eleAttuneSelect = intent.getIntExtra("eleAttuneSelect", 0)
        var combatWizSelect = intent.getIntExtra("combatWizSelect", 0)
        var harvestSelect = intent.getIntExtra("harvestSelect", 0)
        var morticianSelect = intent.getIntExtra("morticianSelect", 0)
        var refocusSelect = intent.getIntExtra("refocusSelect", 0)
        var spellParrySelect = intent.getIntExtra("spellParrySelect", 0)
        var spellVersSkillSelect = intent.getIntExtra("spellVersSkillSelect", 0)
        var spellSwitchSelect = intent.getIntExtra("spellSwitchSelect", 0)
        var sphereSelect1 = intent.getStringExtra("sphereSelect1")
        var sphereSelect2 = intent.getStringExtra("sphereSelect2")
        var sphereSelect3 = intent.getStringExtra("sphereSelect3")
        var slot1Select = intent.getIntExtra("slot1Select", 0)
        var slot2Select = intent.getIntExtra("slot2Select", 0)
        var slot3Select = intent.getIntExtra("slot3Select", 0)
        var slot4Select = intent.getIntExtra("slot4Select", 0)
        var slot5Select = intent.getIntExtra("slot5Select", 0)
        var slot6Select = intent.getIntExtra("slot6Select", 0)
        var slot7Select = intent.getIntExtra("slot7Select", 0)
        var slot8Select = intent.getIntExtra("slot8Select", 0)
        var slot9Select = intent.getIntExtra("slot9Select", 0)
        var ritualSelect = intent.getIntExtra("ritualSelect", 0)

        //Character Basics
        val popupLevel = findViewById<TextView>(R.id.popupLevel)
        popupLevel.setText("Level $levelInt")
        val popupHP = findViewById<TextView>(R.id.popupHP)
        popupHP.setText("$hpInt HP")
        val popupRace = findViewById<TextView>(R.id.popupRace)
        popupRace.setText("$characterRace")
        val popupCulture = findViewById<TextView>(R.id.popupCulture)
        if (cultureFragsInt == 0) {
            popupCulture.setText("")
            popupCulture.visibility = View.GONE
        }
        else {
            popupCulture.setText("$characterCulture")
            popupCulture.visibility = View.VISIBLE
        }
        val popupClass = findViewById<TextView>(R.id.popupClass)
        popupClass.setText("$characterClass")
        val popupVocation = findViewById<TextView>(R.id.popupVocation)
        if (characterVocation == "Vocation") {
            popupVocation.setText("")
            popupVocation.visibility = View.GONE
        }
        else {
            popupVocation.setText("$characterVocation")
            popupVocation.visibility = View.VISIBLE
        }
        val popupBlankets = findViewById<TextView>(R.id.popupBlankets)
        popupBlankets.setText("Blankets: $blanketsInt")
        val popupCP = findViewById<TextView>(R.id.popupCP)
        popupCP.setText("Total CP: $cpInt")
        val popupSpent = findViewById<TextView>(R.id.popupSpent)
        popupSpent.setText("Spent CP: $characterSpentInt")
        val popupFree = findViewById<TextView>(R.id.popupFree)
        popupFree.setText("Free CP: $freeInt")
        val popupFrags = findViewById<TextView>(R.id.popupFrags)
        popupFrags.setText("Spent Frags: $characterFragsInt")

        //General Skills
        val popupAutoRacial = findViewById<TextView>(R.id.popupAutoRacial)
        if (characterRace == "Race") {
            popupAutoRacial.setText("")
            popupAutoRacial.visibility = View.GONE
        }
        else {
            popupAutoRacial.setText("$autoRacialSkill")
            popupAutoRacial.visibility = View.VISIBLE
        }
        val popupRacial = findViewById<TextView>(R.id.popupRacial)
        if (characterRace == "Race" || racialSelect == 0) {
            popupRacial.setText("")
            popupRacial.visibility = View.GONE
        }
        else {
            popupRacial.setText("$racialSelect x $racialSkill")
            popupRacial.visibility = View.VISIBLE
        }
        val popupBodyBonus = findViewById<TextView>(R.id.popupBodyBonus)
        if (bodySelect == 0) {
            popupBodyBonus.setText("")
            popupBodyBonus.visibility = View.GONE
        }
        else {
            popupBodyBonus.setText("$bodySelect x Body Point Bonus")
            popupBodyBonus.visibility = View.VISIBLE
        }
        val popupStrengthBonus = findViewById<TextView>(R.id.popupStrengthBonus)
        if (strengthSelect == 0) {
            popupStrengthBonus.setText("")
            popupStrengthBonus.visibility = View.GONE
        }
        else {
            popupStrengthBonus.setText("$strengthSelect x Body Point Bonus")
            popupStrengthBonus.visibility = View.VISIBLE
        }
        val popupLevel3 = findViewById<TextView>(R.id.popupLevel3)
        if (level3Select == 0) {
            popupLevel3.setText("Level 3 Skill")
            popupLevel3.visibility = View.GONE
        }
        else {
            popupLevel3.setText("$level3Select x $level3Skill")
            popupLevel3.visibility = View.VISIBLE
        }
        val popupLevel6 = findViewById<TextView>(R.id.popupLevel6)
        if (level6Select == 0) {
            popupLevel6.setText("Level 6 Skill")
            popupLevel6.visibility = View.GONE
        }
        else {
            popupLevel6.setText("$level6Select x $level6Skill")
            popupLevel6.visibility = View.VISIBLE
        }
        val popupLevel9 = findViewById<TextView>(R.id.popupLevel9)
        if (level9Select == 0) {
            popupLevel9.setText("Level 9 Skill")
            popupLevel9.visibility = View.GONE
        }
        else {
            popupLevel9.setText("$level9Select x $level9Skill")
            popupLevel9.visibility = View.VISIBLE
        }
        val popupLevel12 = findViewById<TextView>(R.id.popupLevel12)
        if (level12Select == 0) {
            popupLevel12.setText("Level 12 Skill")
            popupLevel12.visibility = View.GONE
        }
        else {
            popupLevel12.setText("$level12Select x $level12Skill")
            popupLevel12.visibility = View.VISIBLE
        }

        val popupTrapsmith = findViewById<TextView>(R.id.popupTrapsmith)
        if (trapsmithSelect == 0) {
            popupTrapsmith.setText("Trapsmithing")
            popupTrapsmith.visibility = View.GONE
        }
        else {
            popupTrapsmith.setText("$trapsmithSelect x Trapsmithing")
            popupTrapsmith.visibility = View.VISIBLE
        }
        val popupTradesman = findViewById<TextView>(R.id.popupTradesman)
        if (tradesmanSelect == 0) {
            popupTradesman.setText("Tradesman")
            popupTradesman.visibility = View.GONE
        }
        else {
            popupTradesman.setText("$tradesmanSelect x Tradesman")
            popupTradesman.visibility = View.VISIBLE
        }
        val popupAlchemy = findViewById<TextView>(R.id.popupAlchemy)
        if (alchemySelect == 0) {
            popupAlchemy.setText("Alchemy")
            popupAlchemy.visibility = View.GONE
        }
        else {
            popupAlchemy.setText("$alchemySelect x Alchemy")
            popupAlchemy.visibility = View.VISIBLE
        }
        val popupChemistry = findViewById<TextView>(R.id.popupChemistry)
        if (chemistrySelect == 0) {
            popupChemistry.setText("Chemistry")
            popupChemistry.visibility = View.GONE
        }
        else {
            popupChemistry.setText("$chemistrySelect x Chemistry")
            popupChemistry.visibility = View.VISIBLE
        }
        val popupBlacksmithing = findViewById<TextView>(R.id.popupBlacksmithing)
        if (blacksmithingSelect == 0) {
            popupBlacksmithing.setText("Blacksmithing")
            popupBlacksmithing.visibility = View.GONE
        }
        else {
            popupBlacksmithing.setText("$blacksmithingSelect x Blacksmithing")
            popupBlacksmithing.visibility = View.VISIBLE
        }
        val popupArtifice = findViewById<TextView>(R.id.popupArtifice)
        if (artificeSelect == 0) {
            popupArtifice.setText("Artifice")
            popupArtifice.visibility = View.GONE
        }
        else {
            popupArtifice.setText("$artificeSelect x Artifice")
            popupArtifice.visibility = View.VISIBLE
        }
        val popupScrollcrafting = findViewById<TextView>(R.id.popupScrollcrafting)
        if (scrollcraftingSelect == 0) {
            popupScrollcrafting.setText("Scrollcrafting")
            popupScrollcrafting.visibility = View.GONE
        }
        else {
            popupScrollcrafting.setText("$scrollcraftingSelect x Scrollcrafting")
            popupScrollcrafting.visibility = View.VISIBLE
        }
        val popupColdHands = findViewById<TextView>(R.id.popupColdHands)
        if (coldHandsSelect == 0) {
            popupColdHands.setText("Cold Dead Hands")
            popupColdHands.visibility = View.GONE
        }
        else {
            popupColdHands.setText("$coldHandsSelect x Cold Dead Hands")
            popupColdHands.visibility = View.VISIBLE
        }
        val popupCreateAlcohol = findViewById<TextView>(R.id.popupCreateAlcohol)
        if (createAlcoholSelect == 0) {
            popupCreateAlcohol.setText("Create Alcohol")
            popupCreateAlcohol.visibility = View.GONE
        }
        else {
            popupCreateAlcohol.setText("$createAlcoholSelect x Create Alcohol")
            popupCreateAlcohol.visibility = View.VISIBLE
        }
        val popupHeavyDrinker = findViewById<TextView>(R.id.popupHeavyDrinker)
        if (heavyDrinkerSelect == 0) {
            popupHeavyDrinker.setText("Heavy Drinker")
            popupHeavyDrinker.visibility = View.GONE
        }
        else {
            popupHeavyDrinker.setText("$heavyDrinkerSelect x Heavy Drinker")
            popupHeavyDrinker.visibility = View.VISIBLE
        }
        val popupHindsight = findViewById<TextView>(R.id.popupHindsight)
        if (hindsightSelect == 0) {
            popupHindsight.setText("Hindsight")
            popupHindsight.visibility = View.GONE
        }
        else {
            popupHindsight.setText("$hindsightSelect x Hindsight")
            popupHindsight.visibility = View.VISIBLE
        }
        val popupIntuition = findViewById<TextView>(R.id.popupIntuition)
        if (intuitionSelect == 0) {
            popupIntuition.setText("Insight")
            popupIntuition.visibility = View.GONE
        }
        else {
            popupIntuition.setText("$intuitionSelect x Insight")
            popupIntuition.visibility = View.VISIBLE
        }
        val popupLooting = findViewById<TextView>(R.id.popupLooting)
        if (lootingSelect == 0) {
            popupLooting.setText("Looting")
            popupLooting.visibility = View.GONE
        }
        else {
            popupLooting.setText("$lootingSelect x Looting")
            popupLooting.visibility = View.VISIBLE
        }
        val popupTeacher = findViewById<TextView>(R.id.popupTeacher)
        if (teacherSelect == 0) {
            popupTeacher.setText("Teacher")
            popupTeacher.visibility = View.GONE
        }
        else {
            popupTeacher.setText("$teacherSelect x Teacher")
            popupTeacher.visibility = View.VISIBLE
        }
        val popupPossum = findViewById<TextView>(R.id.popupPossum)
        if (possumSelect == 0) {
            popupPossum.setText("Possum")
            popupPossum.visibility = View.GONE
        }
        else {
            popupPossum.setText("$possumSelect x Possum")
            popupPossum.visibility = View.VISIBLE
        }
        val popupParagon = findViewById<TextView>(R.id.popupParagon)
        if (paragonSelect == 0) {
            popupParagon.setText("Paragon")
            popupParagon.visibility = View.GONE
        }
        else {
            popupParagon.setText("$paragonSelect x Paragon")
            popupParagon.visibility = View.VISIBLE
        }

        //Warrior Skills
        val popupAmbidexterity = findViewById<TextView>(R.id.popupAmbidexterity)
        if (ambidexteritySelect == 0) {
            popupAmbidexterity.setText("Ambidexterity")
            popupAmbidexterity.visibility = View.GONE
        }
        else {
            popupAmbidexterity.setText("$ambidexteritySelect x Ambidexterity")
            popupAmbidexterity.visibility = View.VISIBLE
        }
        val popupFlorentine = findViewById<TextView>(R.id.popupFlorentine)
        if (florentineSelect == 0) {
            popupFlorentine.setText("Florentine")
            popupFlorentine.visibility = View.GONE
        }
        else {
            popupFlorentine.setText("$florentineSelect x Florentine")
            popupFlorentine.visibility = View.VISIBLE
        }
        val popupFlurry = findViewById<TextView>(R.id.popupFlurry)
        if (flurrySelect == 0) {
            popupFlurry.setText("Flurry of Blows")
            popupFlurry.visibility = View.GONE
        }
        else {
            popupFlurry.setText("$flurrySelect x Flurry of Blows")
            popupFlurry.visibility = View.VISIBLE
        }
        val popupHeavyArmor = findViewById<TextView>(R.id.popupHeavyArmor)
        if (heavyArmorSelect == 0) {
            popupHeavyArmor.setText("Heavy Armor")
            popupHeavyArmor.visibility = View.GONE
        }
        else {
            popupHeavyArmor.setText("$heavyArmorSelect x Heavy Armor")
            popupHeavyArmor.visibility = View.VISIBLE
        }
        val popupSelfMutilate = findViewById<TextView>(R.id.popupSelfMutilate)
        if (selfMutilateSelect == 0) {
            popupSelfMutilate.setText("Self Mutilate")
            popupSelfMutilate.visibility = View.GONE
        }
        else {
            popupSelfMutilate.setText("$selfMutilateSelect x Self Mutilate")
            popupSelfMutilate.visibility = View.VISIBLE
        }
        val popupShield = findViewById<TextView>(R.id.popupShield)
        if (shieldSelect == 0) {
            popupShield.setText("Shield")
            popupShield.visibility = View.GONE
        }
        else {
            popupShield.setText("$shieldSelect x Shield")
            popupShield.visibility = View.VISIBLE
        }
        val popupWeapRefocus = findViewById<TextView>(R.id.popupWeapRefocus)
        if (weapRefocusSelect == 0) {
            popupWeapRefocus.setText("Weapon Refocus")
            popupWeapRefocus.visibility = View.GONE
        }
        else {
            popupWeapRefocus.setText("$weapRefocusSelect x Weapon Refocus")
            popupWeapRefocus.visibility = View.VISIBLE
        }
        val popupGroupProfMed = findViewById<TextView>(R.id.popupGroupProfMed)
        if (groupProfMedSelect == 0) {
            popupGroupProfMed.setText("Medium Group Proficiency")
            popupGroupProfMed.visibility = View.GONE
        }
        else {
            popupGroupProfMed.setText("$groupProfMedSelect x Medium Group Proficiency")
            popupGroupProfMed.visibility = View.VISIBLE
        }
        val popupGroupProfLrg = findViewById<TextView>(R.id.popupGroupProfLrg)
        if (groupProfLrgSelect == 0) {
            popupGroupProfLrg.setText("Large Group Proficiency")
            popupGroupProfLrg.visibility = View.GONE
        }
        else {
            popupGroupProfLrg.setText("$groupProfLrgSelect x Large Group Proficiency")
            popupGroupProfLrg.visibility = View.VISIBLE
        }
        val popupProfExotic = findViewById<TextView>(R.id.popupProfExotic)
        if (profExoticSelect == 0) {
            popupProfExotic.setText("Exotic Weapon Proficiency")
            popupProfExotic.visibility = View.GONE
        }
        else {
            popupProfExotic.setText("$profExoticSelect x Exotic Weapon Proficiency")
            popupProfExotic.visibility = View.VISIBLE
        }
        val popupSpecificSpec = findViewById<TextView>(R.id.popupSpecificSpec)
        if (specificSpecSelect == 0) {
            popupSpecificSpec.setText("Specific Specialisation +1")
            popupSpecificSpec.visibility = View.GONE
        }
        else {
            popupSpecificSpec.setText("$specificSpecSelect x Specific Specialisation +1")
            popupSpecificSpec.visibility = View.VISIBLE
        }
        val popupGroupSpec = findViewById<TextView>(R.id.popupGroupSpec)
        if (groupSpecSelect == 0) {
            popupGroupSpec.setText("Group Specialisation +1")
            popupGroupSpec.visibility = View.GONE
        }
        else {
            popupGroupSpec.setText("$groupSpecSelect x Group Specialisation +1")
            popupGroupSpec.visibility = View.VISIBLE
        }
        val popupSlayParry = findViewById<TextView>(R.id.popupSlayParry)
        if (slayParrySelect == 0) {
            popupSlayParry.setText("Slay / Parry")
            popupSlayParry.visibility = View.GONE
        }
        else {
            popupSlayParry.setText("$slayParrySelect x Slay / Parry")
            popupSlayParry.visibility = View.VISIBLE
        }
        val popupSlayParryMstr = findViewById<TextView>(R.id.popupSlayParryMstr)
        if (slayParryMstrSelect == 0) {
            popupSlayParryMstr.setText("Slay / Parry Master")
            popupSlayParryMstr.visibility = View.GONE
        }
        else {
            popupSlayParryMstr.setText("$slayParryMstrSelect x Slay / Parry Master")
            popupSlayParryMstr.visibility = View.VISIBLE
        }
        val popupBattleRepair = findViewById<TextView>(R.id.popupBattleRepair)
        if (battlefieldRepairSelect == 0) {
            popupBattleRepair.setText("Battlefield Repair")
            popupBattleRepair.visibility = View.GONE
        }
        else {
            popupBattleRepair.setText("$battlefieldRepairSelect x Battlefield Repair")
            popupBattleRepair.visibility = View.VISIBLE
        }
        val popupCripple = findViewById<TextView>(R.id.popupCripple)
        if (crippleSelect == 0) {
            popupCripple.setText("Cripple")
            popupCripple.visibility = View.GONE
        }
        else {
            popupCripple.setText("$crippleSelect x Cripple")
            popupCripple.visibility = View.VISIBLE
        }
        val popupDecapitate = findViewById<TextView>(R.id.popupDecapitate)
        if (decapitateSelect == 0) {
            popupDecapitate.setText("Decapitate")
            popupDecapitate.visibility = View.GONE
        }
        else {
            popupDecapitate.setText("$decapitateSelect x Decapitate")
            popupDecapitate.visibility = View.VISIBLE
        }
        val popupDirtEye = findViewById<TextView>(R.id.popupDirtEye)
        if (dirtEyeSelect == 0) {
            popupDirtEye.setText("Dirt in the Eye")
            popupDirtEye.visibility = View.GONE
        }
        else {
            popupDirtEye.setText("$dirtEyeSelect x Dirt in the Eye")
            popupDirtEye.visibility = View.VISIBLE
        }
        val popupTrip = findViewById<TextView>(R.id.popupTrip)
        if (tripSelect == 0) {
            popupTrip.setText("Trip")
            popupTrip.visibility = View.GONE
        }
        else {
            popupTrip.setText("$tripSelect x Trip")
            popupTrip.visibility = View.VISIBLE
        }
        val popupWhirlBlows = findViewById<TextView>(R.id.popupWhirlBlows)
        if (whirlBlowsSelect == 0) {
            popupWhirlBlows.setText("Whirlwind of Blows")
            popupWhirlBlows.visibility = View.GONE
        }
        else {
            popupWhirlBlows.setText("$whirlBlowsSelect x Whirlwind of Blows")
            popupWhirlBlows.visibility = View.VISIBLE
        }

        //Rogue Skills
        val popupGarrote = findViewById<TextView>(R.id.popupGarrote)
        if (garroteSelect == 0) {
            popupGarrote.setText("Garrote")
            popupGarrote.visibility = View.GONE
        }
        else {
            popupGarrote.setText("$garroteSelect x Garrote")
            popupGarrote.visibility = View.VISIBLE
        }
        val popupSap = findViewById<TextView>(R.id.popupSap)
        if (sapSelect == 0) {
            popupSap.setText("Sap")
            popupSap.visibility = View.GONE
        }
        else {
            popupSap.setText("$sapSelect x Sap")
            popupSap.visibility = View.VISIBLE
        }
        val popupVitalBlow = findViewById<TextView>(R.id.popupVitalBlow)
        if (vitalBlowSelect == 0) {
            popupVitalBlow.setText("Vital Blow")
            popupVitalBlow.visibility = View.GONE
        }
        else {
            popupVitalBlow.setText("$vitalBlowSelect x Vital Blow")
            popupVitalBlow.visibility = View.VISIBLE
        }
        val popupDodge = findViewById<TextView>(R.id.popupDodge)
        if (dodgeSelect == 0) {
            popupDodge.setText("Dodge")
            popupDodge.visibility = View.GONE
        }
        else {
            popupDodge.setText("$dodgeSelect x Dodge")
            popupDodge.visibility = View.VISIBLE
        }
        val popupSpecificCrit = findViewById<TextView>(R.id.popupSpecificCrit)
        if (specificCritSelect == 0) {
            popupSpecificCrit.setText("Specific Critical +2")
            popupSpecificCrit.visibility = View.GONE
        }
        else {
            popupSpecificCrit.setText("$specificCritSelect x Specific Critical +2")
            popupSpecificCrit.visibility = View.VISIBLE
        }
        val popupGroupCrit = findViewById<TextView>(R.id.popupGroupCrit)
        if (groupCritSelect == 0) {
            popupGroupCrit.setText("Group Critical +2")
            popupGroupCrit.visibility = View.GONE
        }
        else {
            popupGroupCrit.setText("$groupCritSelect x Group Critical +2")
            popupGroupCrit.visibility = View.VISIBLE
        }
        val popupExecute = findViewById<TextView>(R.id.popupExecute)
        if (executeSelect == 0) {
            popupExecute.setText("Execute")
            popupExecute.visibility = View.GONE
        }
        else {
            popupExecute.setText("$executeSelect x Execute")
            popupExecute.visibility = View.VISIBLE
        }
        val popupExecuteMstr = findViewById<TextView>(R.id.popupExecuteMstr)
        if (executeMstrSelect == 0) {
            popupExecuteMstr.setText("Execute Master")
            popupExecuteMstr.visibility = View.GONE
        }
        else {
            popupExecuteMstr.setText("$executeMstrSelect x Execute Master")
            popupExecuteMstr.visibility = View.VISIBLE
        }
        val popupBlindfighter = findViewById<TextView>(R.id.popupBlindfighter)
        if (blindfighterSelect == 0) {
            popupBlindfighter.setText("Blindfighter")
            popupBlindfighter.visibility = View.GONE
        }
        else {
            popupBlindfighter.setText("$blindfighterSelect x Blindfighter")
            popupBlindfighter.visibility = View.VISIBLE
        }
        val popupEscape = findViewById<TextView>(R.id.popupEscape)
        if (escapeSelect == 0) {
            popupEscape.setText("Escape")
            popupEscape.visibility = View.GONE
        }
        else {
            popupEscape.setText("$escapeSelect x Escape")
            popupEscape.visibility = View.VISIBLE
        }
        val popupRiposte = findViewById<TextView>(R.id.popupRiposte)
        if (riposteSelect == 0) {
            popupRiposte.setText("Riposte")
            popupRiposte.visibility = View.GONE
        }
        else {
            popupRiposte.setText("$riposteSelect x Riposte")
            popupRiposte.visibility = View.VISIBLE
        }
        val popupSuckerPunch = findViewById<TextView>(R.id.popupSuckerPunch)
        if (suckerPunchSelect == 0) {
            popupSuckerPunch.setText("Sucker Punch")
            popupSuckerPunch.visibility = View.GONE
        }
        else {
            popupSuckerPunch.setText("$suckerPunchSelect x Sucker Punch")
            popupSuckerPunch.visibility = View.VISIBLE
        }
        val popupThievesCant = findViewById<TextView>(R.id.popupThievesCant)
        if (thievesCantSelect == 0) {
            popupThievesCant.setText("Thieves' Cant")
            popupThievesCant.visibility = View.GONE
        }
        else {
            popupThievesCant.setText("$thievesCantSelect x Thieves' Cant")
            popupThievesCant.visibility = View.VISIBLE
        }
        val popupTumble = findViewById<TextView>(R.id.popupTumble)
        if (tumbleSelect == 0) {
            popupTumble.setText("Tumble")
            popupTumble.visibility = View.GONE
        }
        else {
            popupTumble.setText("$tumbleSelect x Tumble")
            popupTumble.visibility = View.VISIBLE
        }

        //Scholar Skills
        val popupMysticism = findViewById<TextView>(R.id.popupMysticism)
        if (mysticismSelect == 0) {
            popupMysticism.setText("Mysticism")
            popupMysticism.visibility = View.GONE
        }
        else {
            popupMysticism.setText("$mysticismSelect x Mysticism")
            popupMysticism.visibility = View.VISIBLE
        }
        val popupDemAngArts = findViewById<TextView>(R.id.popupDemAngArts)
        if (demAngArtsSelect == 0) {
            popupDemAngArts.setText("Demonic / Angelic Arts")
            popupDemAngArts.visibility = View.GONE
        }
        else {
            popupDemAngArts.setText("$demAngArtsSelect x Demonic / Angelic Arts")
            popupDemAngArts.visibility = View.VISIBLE
        }
        val popupNecroArts = findViewById<TextView>(R.id.popupNecroArts)
        if (necroArtsSelect == 0) {
            popupNecroArts.setText("Necromantic Arts")
            popupNecroArts.visibility = View.GONE
        }
        else {
            popupNecroArts.setText("$necroArtsSelect x Necromantic Arts")
            popupNecroArts.visibility = View.VISIBLE
        }
        val popupAnatomy = findViewById<TextView>(R.id.popupAnatomy)
        if (anatomySelect == 0) {
            popupAnatomy.setText("Anatomy")
            popupAnatomy.visibility = View.GONE
        }
        else {
            popupAnatomy.setText("$anatomySelect x Anatomy")
            popupAnatomy.visibility = View.VISIBLE
        }
        val popupFirstAid = findViewById<TextView>(R.id.popupFirstAid)
        if (firstAidSelect == 0) {
            popupFirstAid.setText("First Aid")
            popupFirstAid.visibility = View.GONE
        }
        else {
            popupFirstAid.setText("$firstAidSelect x First Aid")
            popupFirstAid.visibility = View.VISIBLE
        }
        val popupPhysician = findViewById<TextView>(R.id.popupPhysician)
        if (physicianSelect == 0) {
            popupPhysician.setText("Physician")
            popupPhysician.visibility = View.GONE
        }
        else {
            popupPhysician.setText("$physicianSelect x Physician")
            popupPhysician.visibility = View.VISIBLE
        }
        val popupReadWrite = findViewById<TextView>(R.id.popupReadWrite)
        if (readWriteSelect == 0) {
            popupReadWrite.setText("Read and Write")
            popupReadWrite.visibility = View.GONE
        }
        else {
            popupReadWrite.setText("$readWriteSelect x Read and Write")
            popupReadWrite.visibility = View.VISIBLE
        }
        val popupReadMagic = findViewById<TextView>(R.id.popupReadMagic)
        if (readMagicSelect == 0) {
            popupReadMagic.setText("Read Magic")
            popupReadMagic.visibility = View.GONE
        }
        else {
            popupReadMagic.setText("$readMagicSelect x Read Magic")
            popupReadMagic.visibility = View.VISIBLE
        }
        val popupRdAdvMagic = findViewById<TextView>(R.id.popupRdAdvMagic)
        if (rdAdvMagicSelect == 0) {
            popupRdAdvMagic.setText("Read Advanced Magic")
            popupRdAdvMagic.visibility = View.GONE
        }
        else {
            popupRdAdvMagic.setText("$rdAdvMagicSelect x Read Advanced Magic")
            popupRdAdvMagic.visibility = View.VISIBLE
        }
        val popupRdRitualMagic = findViewById<TextView>(R.id.popupRdRitualMagic)
        if (rdRitualMagicSelect == 0) {
            popupRdRitualMagic.setText("Read Ritual Magic")
            popupRdRitualMagic.visibility = View.GONE
        }
        else {
            popupRdRitualMagic.setText("$rdRitualMagicSelect x Read Ritual Magic")
            popupRdRitualMagic.visibility = View.VISIBLE
        }
        val popupAdvRitual = findViewById<TextView>(R.id.popupAdvRitual)
        if (advRitualSelect == 0) {
            popupAdvRitual.setText("Adv. Ritual Casting")
            popupAdvRitual.visibility = View.GONE
        }
        else {
            popupAdvRitual.setText("$advRitualSelect x Adv. Ritual Casting")
            popupAdvRitual.visibility = View.VISIBLE
        }
        val popupEleAttune = findViewById<TextView>(R.id.popupEleAttune)
        if (eleAttuneSelect == 0) {
            popupEleAttune.setText("Elemental Attunement")
            popupEleAttune.visibility = View.GONE
        }
        else {
            popupEleAttune.setText("$eleAttuneSelect x Elemental Attunement")
            popupEleAttune.visibility = View.VISIBLE
        }
        val popupCombatWiz = findViewById<TextView>(R.id.popupCombatWiz)
        if (combatWizSelect == 0) {
            popupCombatWiz.setText("Combat Wizardry")
            popupCombatWiz.visibility = View.GONE
        }
        else {
            popupCombatWiz.setText("$combatWizSelect x Combat Wizardry")
            popupCombatWiz.visibility = View.VISIBLE
        }
        val popupHarvest = findViewById<TextView>(R.id.popupHarvest)
        if (harvestSelect == 0) {
            popupHarvest.setText("Harvest")
            popupHarvest.visibility = View.GONE
        }
        else {
            popupHarvest.setText("$harvestSelect x Harvest")
            popupHarvest.visibility = View.VISIBLE
        }
        val popupMortician = findViewById<TextView>(R.id.popupMortician)
        if (morticianSelect == 0) {
            popupMortician.setText("Mortician")
            popupMortician.visibility = View.GONE
        }
        else {
            popupMortician.setText("$morticianSelect x Mortician")
            popupMortician.visibility = View.VISIBLE
        }
        val popupRefocus = findViewById<TextView>(R.id.popupRefocus)
        if (refocusSelect == 0) {
            popupRefocus.setText("Refocus")
            popupRefocus.visibility = View.GONE
        }
        else {
            popupRefocus.setText("$refocusSelect x Refocus")
            popupRefocus.visibility = View.VISIBLE
        }
        val popupSpellParry = findViewById<TextView>(R.id.popupSpellParry)
        if (spellParrySelect == 0) {
            popupSpellParry.setText("Spell Parry")
            popupSpellParry.visibility = View.GONE
        }
        else {
            popupSpellParry.setText("$spellParrySelect x Spell Parry")
            popupSpellParry.visibility = View.VISIBLE
        }
        val popupSpellVers = findViewById<TextView>(R.id.popupSpellVers)
        if (spellVersSkillSelect == 0) {
            popupSpellVers.setText("Spell Versatility")
            popupSpellVers.visibility = View.GONE
        }
        else {
            popupSpellVers.setText("$spellVersSkillSelect x Spell Versatility")
            popupSpellVers.visibility = View.VISIBLE
        }
        val popupSpellSwitch = findViewById<TextView>(R.id.popupSpellSwitch)
        if (spellSwitchSelect == 0) {
            popupSpellSwitch.setText("Spell Switch")
            popupSpellSwitch.visibility = View.GONE
        }
        else {
            popupSpellSwitch.setText("$spellSwitchSelect x Spell Switch")
            popupSpellSwitch.visibility = View.VISIBLE
        }

        //Spheres and Slots
        //Spheres
        val popupSphere1 = findViewById<TextView>(R.id.popupSphere1)
        if (sphereSelect1 == "None") {
            popupSphere1.setText("1st Sphere")
            popupSphere1.visibility = View.GONE
        }
        else {
            popupSphere1.setText("1 x 1st Sphere - $sphereSelect1")
            popupSphere1.visibility = View.VISIBLE
        }
        val popupSphere2 = findViewById<TextView>(R.id.popupSphere2)
        if (sphereSelect2 == "None") {
            popupSphere2.setText("2nd Sphere")
            popupSphere2.visibility = View.GONE
        }
        else {
            popupSphere2.setText("1 x 2nd Sphere - $sphereSelect2")
            popupSphere2.visibility = View.VISIBLE
        }
        val popupSphere3 = findViewById<TextView>(R.id.popupSphere3)
        if (sphereSelect3 == "None") {
            popupSphere3.setText("3rd Sphere")
            popupSphere3.visibility = View.GONE
        }
        else {
            popupSphere3.setText("1 x 3rd Sphere - $sphereSelect3")
            popupSphere3.visibility = View.VISIBLE
        }
        //Slots
        val popupSlot1 = findViewById<TextView>(R.id.popupSlot1)
        if (slot1Select == 0) {
            popupSlot1.setText("1st Circle")
            popupSlot1.visibility = View.GONE
        }
        else {
            popupSlot1.setText("$slot1Select x 1st Circle")
            popupSlot1.visibility = View.VISIBLE
        }
        val popupSlot2 = findViewById<TextView>(R.id.popupSlot2)
        if (slot2Select == 0) {
            popupSlot2.setText("2nd Circle")
            popupSlot2.visibility = View.GONE
        }
        else {
            popupSlot2.setText("$slot2Select x 2nd Circle")
            popupSlot2.visibility = View.VISIBLE
        }
        val popupSlot3 = findViewById<TextView>(R.id.popupSlot3)
        if (slot3Select == 0) {
            popupSlot3.setText("3rd Circle")
            popupSlot3.visibility = View.GONE
        }
        else {
            popupSlot3.setText("$slot3Select x 3rd Circle")
            popupSlot3.visibility = View.VISIBLE
        }
        val popupSlot4 = findViewById<TextView>(R.id.popupSlot4)
        if (slot4Select == 0) {
            popupSlot4.setText("4th Circle")
            popupSlot4.visibility = View.GONE
        }
        else {
            popupSlot4.setText("$slot4Select x 4th Circle")
            popupSlot4.visibility = View.VISIBLE
        }
        val popupSlot5 = findViewById<TextView>(R.id.popupSlot5)
        if (slot5Select == 0) {
            popupSlot5.setText("5th Circle")
            popupSlot5.visibility = View.GONE
        }
        else {
            popupSlot5.setText("$slot5Select x 5th Circle")
            popupSlot5.visibility = View.VISIBLE
        }
        val popupSlot6 = findViewById<TextView>(R.id.popupSlot6)
        if (slot6Select == 0) {
            popupSlot6.setText("6th Circle")
            popupSlot6.visibility = View.GONE
        }
        else {
            popupSlot6.setText("$slot6Select x 6th Circle")
            popupSlot6.visibility = View.VISIBLE
        }
        val popupSlot7 = findViewById<TextView>(R.id.popupSlot7)
        if (slot7Select == 0) {
            popupSlot7.setText("7th Circle")
            popupSlot7.visibility = View.GONE
        }
        else {
            popupSlot7.setText("$slot7Select x 7th Circle")
            popupSlot7.visibility = View.VISIBLE
        }
        val popupSlot8 = findViewById<TextView>(R.id.popupSlot8)
        if (slot8Select == 0) {
            popupSlot8.setText("8th Circle")
            popupSlot8.visibility = View.GONE
        }
        else {
            popupSlot8.setText("$slot8Select x 8th Circle")
            popupSlot8.visibility = View.VISIBLE
        }
        val popupSlot9 = findViewById<TextView>(R.id.popupSlot9)
        if (slot9Select == 0) {
            popupSlot9.setText("9th Circle")
            popupSlot9.visibility = View.GONE
        }
        else {
            popupSlot9.setText("$slot9Select x 9th Circle")
            popupSlot9.visibility = View.VISIBLE
        }
        val popupRitual = findViewById<TextView>(R.id.popupRitual)
        if (ritualSelect == 0) {
            popupRitual.setText("Ritual Slots")
            popupRitual.visibility = View.GONE
        }
        else {
            popupRitual.setText("$ritualSelect x Ritual Slots")
            popupRitual.visibility = View.VISIBLE
        }

        closePopup.setOnClickListener() {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}