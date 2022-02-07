package com.example.uwcharacterbuilder

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Selection.setSelection
import android.view.View
import android.widget.*
import androidx.core.view.get


//Int Value calls
val levelInt: Int = 0
val hpInt: Int = 0
val blanketsInt: Int = 0
val cpInt: Int = 0
val freeInt: Int = 0
val spentInt: Int = 0
var characterSpentInt = 0
val fragsInt: Int = 0
var characterFragsInt: Int = 0

//Total CP/Frag Int (Cost x Spent/Frags x Spent)
//General Skill Int
var raceFragsInt = 0
var cultureFragsInt = 0
var vocationFragsInt = 0
var favoredInt = 0
var favoredFragsInt = 0

var level3Int: Int = 0
var level6Int: Int = 0
var level9Int: Int = 0
var level12Int: Int = 0
var racialInt: Int = 0
var trapsmithInt: Int = 0
var tradesmanInt: Int = 0
var alchemyInt: Int = 0
var chemistryInt: Int = 0
var blacksmithingInt: Int = 0
var artificeInt: Int = 0
var scrollcraftingInt: Int = 0
var coldHandsInt: Int = 0
var createAlcoholInt: Int = 0
var heavyDrinkerInt: Int = 0
var hindsightInt: Int = 0
var intuitionInt: Int = 0
var lootingInt: Int = 0
var possumInt: Int = 0
var teacherInt: Int = 0

var coldHandsFragsInt: Int = 0
var createAlcoholFragsInt: Int = 0
var heavyDrinkerFragsInt: Int = 0
var hindsightFragsInt: Int = 0
var intuitionFragsInt: Int = 0
var lootingFragsInt: Int = 0
var possumFragsInt: Int = 0
var teacherFragsInt: Int = 0

//Warrior Skill Int
var ambidexterityInt: Int = 0
var florentineInt: Int = 0
var flurryInt: Int = 0
var heavyArmorInt: Int = 0
var selfMutilateInt: Int = 0
var shieldInt: Int = 0
var weapRefocusInt: Int = 0
var groupProfMedInt: Int = 0
var groupProfLrgInt: Int = 0
var profExoticInt: Int = 0
var groupSpecInt: Int = 0
var specificSpecInt: Int = 0
var slayParryInt: Int = 0
var slayParryMstrInt: Int = 0
var battlefieldRepairInt: Int = 0
var crippleInt: Int = 0
var decapitateInt: Int = 0
var dirtEyeInt: Int = 0
var tripInt: Int = 0
var whirlBlowsInt: Int = 0

var battlefieldRepairFragsInt: Int = 0
var crippleFragsInt: Int = 0
var decapitateFragsInt: Int = 0
var dirtEyeFragsInt: Int = 0
var tripFragsInt: Int = 0
var whirlBlowsFragsInt: Int = 0

//Rogue Skill Int
var garroteInt: Int = 0
var sapInt: Int = 0
var vitalBlowInt: Int = 0
var dodgeInt: Int = 0
var specificCritInt: Int = 0
var groupCritInt: Int = 0
var executeInt: Int = 0
var executeMstrInt: Int = 0
var blindfighterInt: Int = 0
var escapeInt: Int = 0
var riposteInt: Int = 0
var suckerPunchInt: Int = 0
var thievesCantInt: Int = 0
var tumbleInt: Int = 0

var blindfighterFragsInt: Int = 0
var escapeFragsInt: Int = 0
var riposteFragsInt: Int = 0
var suckerPunchFragsInt: Int = 0
var thievesCantFragsInt: Int = 0
var tumbleFragsInt: Int = 0

//Scholar Skill Int
var mysticismInt: Int = 0
var demAngArtsInt: Int = 0
var necroArtsInt: Int = 0
var anatomyInt: Int = 0
var firstAidInt: Int = 0
var physicianInt: Int = 0
var readWriteInt: Int = 0
var readMagicInt: Int = 0
var rdAdvMagicInt: Int = 0
var rdRitualMagicInt: Int = 0
var eleAttuneInt: Int = 0
var combatWizInt: Int = 0
var harvestInt: Int = 0
var morticianInt: Int = 0
var refocusInt: Int = 0
var spellParryInt: Int = 0
var spellSwitchInt: Int = 0

var combatWizFragsInt: Int = 0
var harvestFragsInt: Int = 0
var morticianFragsInt: Int = 0
var refocusFragsInt: Int = 0
var spellParryFragsInt: Int = 0
var spellSwitchFragsInt: Int = 0

//Slot Skill Int
var slot1Int: Int = 0
var slot2Int: Int = 0
var slot3Int: Int = 0
var slot4Int: Int = 0
var slot5Int: Int = 0
var slot6Int: Int = 0
var slot7Int: Int = 0
var slot8Int: Int = 0
var slot9Int: Int = 0
var ritualInt: Int = 0

//General Skills (Cost/SelectFrags)
var raceFragCost = 0
var cultureFragCost = 0
var vocationFragCost = 0
var favoredCost = 0
var favoredFragCost = 0

var level3Cost = 0
var level3Select = 0
var level6Cost = 0
var level6Select = 0
var level9Cost = 0
var level9Select = 0
var level12Cost = 0
var level12Select = 0
var racialCost = 0
var racialSelect = 0
var trapsmithCost = 0
var trapsmithSelect = 0
var tradesmanCost = 0
var tradesmanSelect = 0
var alchemyCost = 0
var alchemySelect = 0
var chemistryCost = 0
var chemistrySelect = 0
var blacksmithingCost = 0
var blacksmithingSelect = 0
var artificeCost = 0
var artificeSelect = 0
var scrollcraftingCost = 0
var scrollcraftingSelect = 0
var coldHandsCost = 0
var coldHandsSelect = 0
var createAlcoholCost = 0
var createAlcoholSelect = 0
var heavyDrinkerCost = 0
var heavyDrinkerSelect = 0
var hindsightCost = 0
var hindsightSelect = 0
var intuitionCost = 0
var intuitionSelect = 0
var lootingCost = 0
var lootingSelect = 0
//Paragon
var possumCost = 0
var possumSelect = 0
var teacherCost = 0
var teacherSelect = 0

var coldHandsFragCost = 0
var createAlcoholFragCost = 0
var heavyDrinkerFragCost = 0
var hindsightFragCost = 0
var intuitionFragCost = 0
var lootingFragCost = 0
var possumFragCost = 0
var teacherFragCost = 0

//Warrior Skills
var ambidexterityCost = 0
var ambidexteritySelect = 0
var florentineCost = 0
var florentineSelect = 0
var flurryCost = 0
var flurrySelect = 0
var heavyArmorCost = 0
var heavyArmorSelect = 0
var shieldCost = 0
var shieldSelect = 0
var selfMutilateCost = 0
var selfMutilateSelect = 0
var weapRefocusCost = 0
var weapRefocusSelect = 0
var groupProfMedCost = 0
var groupProfMedSelect = 0
var groupProfLrgCost = 0
var groupProfLrgSelect = 0
var profExoticCost = 0
var profExoticSelect = 0
var groupSpecCost = 0
var groupSpecSelect = 0
var specificSpecCost = 0
var specificSpecSelect = 0
var slayParryCost = 0
var slayParrySelect = 0
var slayParryMstrCost = 0
var slayParryMstrSelect = 0
var battlefieldRepairCost = 0
var battlefieldRepairSelect = 0
var crippleCost = 0
var crippleSelect = 0
var decapitateCost = 0
var decapitateSelect = 0
var dirtEyeCost = 0
var dirtEyeSelect = 0
var tripCost = 0
var tripSelect = 0
var whirlBlowsCost = 0
var whirlBlowsSelect = 0

var battlefieldRepairFragCost = 0
var crippleFragCost = 0
var decapitateFragCost = 0
var dirtEyeFragCost = 0
var tripFragCost = 0
var whirlBlowsFragCost = 0

//Rogue Skills
var garroteCost = 0
var garroteSelect = 0
var sapCost = 0
var sapSelect = 0
var vitalBlowCost = 0
var vitalBlowSelect = 0
var dodgeCost = 0
var dodgeSelect = 0
var specificCritCost = 0
var specificCritSelect = 0
var groupCritCost = 0
var groupCritSelect = 0
var executeCost = 0
var executeSelect = 0
var executeMstrCost = 0
var executeMstrSelect = 0
var blindfighterCost = 0
var blindfighterSelect = 0
var escapeCost = 0
var escapeSelect = 0
var riposteCost = 0
var riposteSelect = 0
var suckerPunchCost = 0
var suckerPunchSelect = 0
var thievesCantCost = 0
var thievesCantSelect = 0
var tumbleCost = 0
var tumbleSelect = 0

var blindfighterFragCost = 0
var escapeFragCost = 0
var riposteFragCost = 0
var suckerPunchFragCost = 0
var thievesCantFragCost = 0
var tumbleFragCost = 0

//Scholar Skills
var mysticismCost = 0
var mysticismSelect = 0
var demAngArtsCost = 0
var demAngArtsSelect = 0
var necroArtsCost = 0
var necroArtsSelect = 0
var anatomyCost = 0
var anatomySelect = 0
var firstAidCost = 0
var firstAidSelect = 0
var physicianCost = 0
var physicianSelect = 0
var readWriteCost = 0
var readWriteSelect = 0
var readMagicCost = 0
var readMagicSelect = 0
var rdAdvMagicCost = 0
var rdAdvMagicSelect = 0
var rdRitualMagicCost = 0
var rdRitualMagicSelect = 0
var eleAttuneCost = 0
var eleAttuneSelect = 0
var combatWizCost = 0
var combatWizSelect = 0
var harvestCost = 0
var harvestSelect = 0
var morticianCost = 0
var morticianSelect = 0
var refocusCost = 0
var refocusSelect = 0
var spellParryCost = 0
var spellParrySelect = 0
//Spell Versatility
var spellSwitchCost = 0
var spellSwitchSelect = 0

var combatWizFragCost = 0
var harvestFragCost = 0
var morticianFragCost = 0
var refocusFragCost = 0
var spellParryFragCost = 0
var spellSwitchFragCost = 0

//Spheres and Slots
//Spheres
var slot1Cost = 0
var slot1Select = 0
var slot2Cost = 0
var slot2Select = 0
var slot3Cost = 0
var slot3Select = 0
var slot4Cost = 0
var slot4Select = 0
var slot5Cost = 0
var slot5Select = 0
var slot6Cost = 0
var slot6Select = 0
var slot7Cost = 0
var slot7Select = 0
var slot8Cost = 0
var slot8Select = 0
var slot9Cost = 0
var slot9Select = 0
var ritualCost = 0
var ritualSelect = 0


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Text View IDs
//Top Section
        val fragText = findViewById<TextView>(R.id.fragText)
        val cultureText = findViewById<TextView>(R.id.cultureText)
        val vocationText = findViewById<TextView>(R.id.vocationText)
        var characterRace = "Choose a race"
        var characterClass = "Choose a class"
        var characterVocation = "Choose a vocation"
        val characterLevel = findViewById<EditText>(R.id.levelNumEntry)
        val characterHP = findViewById<EditText>(R.id.hpNumEntry)
        val characterBlankets = findViewById<EditText>(R.id.blanketsNumEntry)
        val characterFree = findViewById<EditText>(R.id.freeNumEntry)
        val characterSpent = findViewById<EditText>(R.id.spentNumEntry)
        val characterFrags = findViewById<EditText>(R.id.fragsNumEntry)
//General Skills
        val level3Name = findViewById<TextView>(R.id.level3Name)
        val level3CP = findViewById<TextView>(R.id.level3CP)
        val level6Name = findViewById<TextView>(R.id.level6Name)
        val level6CP = findViewById<TextView>(R.id.level6CP)
        val level9Name = findViewById<TextView>(R.id.level9Name)
        val level9CP = findViewById<TextView>(R.id.level9CP)
        val level12Name = findViewById<TextView>(R.id.level12Name)
        val level12CP = findViewById<TextView>(R.id.level12CP)
        val racialName = findViewById<TextView>(R.id.racialName)
        val racialCP = findViewById<TextView>(R.id.racialCP)
        val trapsmithCP = findViewById<TextView>(R.id.trapsmithCP)
        val tradesmanCP = findViewById<TextView>(R.id.tradesmanCP)
        val alchemyCP = findViewById<TextView>(R.id.alchemyCP)
        val chemistryCP = findViewById<TextView>(R.id.chemistryCP)
        val blacksmithingCP = findViewById<TextView>(R.id.blacksmithingCP)
        val artificeCP = findViewById<TextView>(R.id.artificeCP)
        val scrollcraftingCP = findViewById<TextView>(R.id.scrollcraftingCP)
        val coldHandsCP = findViewById<TextView>(R.id.coldHandsCP)
        val createAlcoholCP = findViewById<TextView>(R.id.createAlcoholCP)
        val heavyDrinkerCP = findViewById<TextView>(R.id.heavyDrinkerCP)
        val hindsightCP = findViewById<TextView>(R.id.hindsightCP)
        val intuitionCP = findViewById<TextView>(R.id.intuitionCP)
        val lootingCP = findViewById<TextView>(R.id.lootingCP)
        val paragonCP = findViewById<TextView>(R.id.paragonCP)
        val possumCP = findViewById<TextView>(R.id.possumCP)
        val teacherCP = findViewById<TextView>(R.id.teacherCP)

        val coldHandsFrags = findViewById<TextView>(R.id.coldHandsFrags)
        val createAlcoholFrags = findViewById<TextView>(R.id.createAlcoholFrags)
        val heavyDrinkerFrags = findViewById<TextView>(R.id.heavyDrinkerFrags)
        val hindsightFrags = findViewById<TextView>(R.id.hindsightFrags)
        val intuitionFrags = findViewById<TextView>(R.id.intuitionFrags)
        val lootingFrags = findViewById<TextView>(R.id.lootingFrags)
        val paragonFrags = findViewById<TextView>(R.id.paragonFrags)
        val possumFrags = findViewById<TextView>(R.id.possumFrags)
        val teacherFrags = findViewById<TextView>(R.id.teacherFrags)
//Warrior Skills
        val ambidexterityCP = findViewById<TextView>(R.id.ambidexterityCP)
        val florentineCP = findViewById<TextView>(R.id.florentineCP)
        val flurryCP = findViewById<TextView>(R.id.flurryCP)
        val heavyArmorCP = findViewById<TextView>(R.id.heavyArmorCP)
        val selfMutilateCP = findViewById<TextView>(R.id.selfMutilateCP)
        val shieldCP = findViewById<TextView>(R.id.shieldCP)
        val weapRefocusCP = findViewById<TextView>(R.id.weapRefocusCP)
        val groupProfMedCP = findViewById<TextView>(R.id.groupProfMedCP)
        val groupProfLrgCP = findViewById<TextView>(R.id.groupProfLrgCP)
        val profExoticCP = findViewById<TextView>(R.id.profExoticCP)
        val groupSpecCP = findViewById<TextView>(R.id.groupSpecCP)
        val specificSpecCP = findViewById<TextView>(R.id.specificSpecCP)
        val slayParryCP = findViewById<TextView>(R.id.slayParryCP)
        val slayParryMstrCP = findViewById<TextView>(R.id.slayParryMstrCP)
        val battlefieldRepairCP = findViewById<TextView>(R.id.battlefieldRepairCP)
        val crippleCP = findViewById<TextView>(R.id.crippleCP)
        val decapitateCP = findViewById<TextView>(R.id.decapitateCP)
        val dirtEyeCP = findViewById<TextView>(R.id.dirtEyeCP)
        val tripCP = findViewById<TextView>(R.id.tripCP)
        val whirlBlowsCP = findViewById<TextView>(R.id.whirlBlowsCP)

        val battlefieldRepairFrags = findViewById<TextView>(R.id.battlefieldRepairFrags)
        val crippleFrags = findViewById<TextView>(R.id.crippleFrags)
        val decapitateFrags = findViewById<TextView>(R.id.decapitateFrags)
        val dirtEyeFrags = findViewById<TextView>(R.id.dirtEyeFrags)
        val tripFrags = findViewById<TextView>(R.id.tripFrags)
        val whirlBlowsFrags = findViewById<TextView>(R.id.whirlBlowsFrags)

//Rogue Skills
        val garroteCP = findViewById<TextView>(R.id.garroteCP)
        val sapCP = findViewById<TextView>(R.id.sapCP)
        val vitalBlowCP = findViewById<TextView>(R.id.vitalBlowCP)
        val dodgeCP = findViewById<TextView>(R.id.dodgeCP)
        val specificCritCP = findViewById<TextView>(R.id.specificCritCP)
        val groupCritCP = findViewById<TextView>(R.id.groupCritCP)
        val executeCP = findViewById<TextView>(R.id.executeCP)
        val executeMstrCP = findViewById<TextView>(R.id.executeMstrCP)
        val blindfighterCP = findViewById<TextView>(R.id.blindfighterCP)
        val escapeCP = findViewById<TextView>(R.id.escapeCP)
        val riposteCP = findViewById<TextView>(R.id.riposteCP)
        val suckerPunchCP = findViewById<TextView>(R.id.suckerPunchCP)
        val thievesCantCP = findViewById<TextView>(R.id.thievesCantCP)
        val tumbleCP = findViewById<TextView>(R.id.tumbleCP)

        val blindfighterFrags = findViewById<TextView>(R.id.blindfighterFrags)
        val escapeFrags = findViewById<TextView>(R.id.escapeFrags)
        val riposteFrags = findViewById<TextView>(R.id.riposteFrags)
        val suckerPunchFrags = findViewById<TextView>(R.id.suckerPunchFrags)
        val thievesCantFrags = findViewById<TextView>(R.id.thievesCantFrags)
        val tumbleFrags = findViewById<TextView>(R.id.tumbleFrags)

//Scholar Skills
        val mysticismCP = findViewById<TextView>(R.id.mysticismCP)
        val demAngArtsCP = findViewById<TextView>(R.id.demAngArtsCP)
        val necroArtsCP = findViewById<TextView>(R.id.necroArtsCP)
        val anatomyCP = findViewById<TextView>(R.id.anatomyCP)
        val firstAidCP = findViewById<TextView>(R.id.firstAidCP)
        val physicianCP = findViewById<TextView>(R.id.physicianCP)
        val readWriteCP = findViewById<TextView>(R.id.readWriteCP)
        val readMagicCP = findViewById<TextView>(R.id.readMagicCP)
        val rdAdvMagicCP = findViewById<TextView>(R.id.rdAdvMagicCP)
        val rdRitualMagicCP = findViewById<TextView>(R.id.rdRitualMagicCP)
        val eleAttuneCP = findViewById<TextView>(R.id.eleAttuneCP)
        val combatWizCP = findViewById<TextView>(R.id.combatWizCP)
        val harvestCP = findViewById<TextView>(R.id.harvestCP)
        val morticianCP = findViewById<TextView>(R.id.morticianCP)
        val refocusCP = findViewById<TextView>(R.id.refocusCP)
        val spellParryCP = findViewById<TextView>(R.id.spellParryCP)
        val spellVersCP = findViewById<TextView>(R.id.spellVersCP)
        val spellSwitchCP = findViewById<TextView>(R.id.spellSwitchCP)

        val combatWizFrags = findViewById<TextView>(R.id.combatWizFrags)
        val harvestFrags = findViewById<TextView>(R.id.harvestFrags)
        val morticianFrags = findViewById<TextView>(R.id.morticianFrags)
        val refocusFrags = findViewById<TextView>(R.id.refocusFrags)
        val spellParryFrags = findViewById<TextView>(R.id.spellParryFrags)
        val spellSwitchFrags = findViewById<TextView>(R.id.spellSwitchFrags)

//Spheres and Slots
        val sphere1CP = findViewById<TextView>(R.id.sphere1CP)
        val sphere2CP = findViewById<TextView>(R.id.sphere2CP)
        val sphere3CP = findViewById<TextView>(R.id.sphere3CP)
        val slot1CP = findViewById<TextView>(R.id.slot1CP)
        val slot2CP = findViewById<TextView>(R.id.slot2CP)
        val slot3CP = findViewById<TextView>(R.id.slot3CP)
        val slot4CP = findViewById<TextView>(R.id.slot4CP)
        val slot5CP = findViewById<TextView>(R.id.slot5CP)
        val slot6CP = findViewById<TextView>(R.id.slot6CP)
        val slot7CP = findViewById<TextView>(R.id.slot7CP)
        val slot8CP = findViewById<TextView>(R.id.slot8CP)
        val slot9CP = findViewById<TextView>(R.id.slot9CP)
        val ritualCP = findViewById<TextView>(R.id.ritualCP)

//Button and Spinner View Id
//Top Section
        val raceSpinner = findViewById<Spinner>(R.id.raceSpinner)
        val fragSpinner = findViewById<Spinner>(R.id.fragSpinner)
        val cultureCheck: CheckBox = findViewById(R.id.cultureCheck)
        val classSpinner = findViewById<Spinner>(R.id.classSpinner)
        val vocationSpinner = findViewById<Spinner>(R.id.vocationSpinner)
        val skillLevelList = arrayOf("0","1","2","3","4","5","6","7","8","9","10")
        val skillLevelArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, skillLevelList)
        val shortSkillLevelList = arrayOf("0","1")
        val shortSkillLevelArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, shortSkillLevelList)
        val sphereList = arrayOf("None","Elemental","Healing","Nature","Protections","Psionics","Necromancy","Sigil","Wytchcraft")
        val sphereArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sphereList)
        val favouredSphereList = arrayOf("None","Elemental","Healing","Nature","Protections","Psionics","Necromancy","Sigil","Wytchcraft","Dark","Light","Draconic")
        val favouredSphereArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, favouredSphereList)
//General Skills
        val level3Spinner = findViewById<Spinner>(R.id.level3Spinner)
        val level6Spinner = findViewById<Spinner>(R.id.level6Spinner)
        val level9Spinner = findViewById<Spinner>(R.id.level9Spinner)
        val level12Spinner = findViewById<Spinner>(R.id.level12Spinner)
        val racialSpinner = findViewById<Spinner>(R.id.racialSpinner)
        val trapsmithSpinner = findViewById<Spinner>(R.id.trapsmithSpinner)
        val tradesmanSpinner = findViewById<Spinner>(R.id.tradesmanSpinner)
        val alchemySpinner = findViewById<Spinner>(R.id.alchemySpinner)
        val chemistrySpinner = findViewById<Spinner>(R.id.chemistrySpinner)
        val blacksmithingSpinner = findViewById<Spinner>(R.id.blacksmithingSpinner)
        val artificeSpinner = findViewById<Spinner>(R.id.artificeSpinner)
        val scrollcraftingSpinner = findViewById<Spinner>(R.id.scrollcraftingSpinner)
        val coldHandsSpinner = findViewById<Spinner>(R.id.coldHandsSpinner)
        val createAlcoholSpinner = findViewById<Spinner>(R.id.createAlcoholSpinner)
        val heavyDrinkerSpinner = findViewById<Spinner>(R.id.heavyDrinkerSpinner)
        val hindsightSpinner = findViewById<Spinner>(R.id.hindsightSpinner)
        val intuitionSpinner = findViewById<Spinner>(R.id.intuitionSpinner)
        val lootingSpinner = findViewById<Spinner>(R.id.lootingSpinner)
        val paragonSpinner = findViewById<Spinner>(R.id.paragonSpinner)
        val possumSpinner = findViewById<Spinner>(R.id.possumSpinner)
        val teacherSpinner = findViewById<Spinner>(R.id.teacherSpinner)
//Warrior Skills
        val ambidexteritySpinner = findViewById<Spinner>(R.id.ambidexteritySpinner)
        val florentineSpinner = findViewById<Spinner>(R.id.florentineSpinner)
        val flurrySpinner = findViewById<Spinner>(R.id.flurrySpinner)
        val heavyArmorSpinner = findViewById<Spinner>(R.id.heavyArmorSpinner)
        val selfMutilateSpinner = findViewById<Spinner>(R.id.selfMutilateSpinner)
        val shieldSpinner = findViewById<Spinner>(R.id.shieldSpinner)
        val weapRefocusSpinner = findViewById<Spinner>(R.id.weapRefocusSpinner)
        val groupProfMedSpinner = findViewById<Spinner>(R.id.groupProfMedSpinner)
        val groupProfLrgSpinner = findViewById<Spinner>(R.id.groupProfLrgSpinner)
        val profExoticSpinner = findViewById<Spinner>(R.id.profExoticSpinner)
        val groupSpecSpinner = findViewById<Spinner>(R.id.groupSpecSpinner)
        val specificSpecSpinner = findViewById<Spinner>(R.id.specificSpecSpinner)
        val slayParrySpinner = findViewById<Spinner>(R.id.slayParrySpinner)
        val slayParryMstrSpinner = findViewById<Spinner>(R.id.slayParryMstrSpinner)
        val battlefieldRepairSpinner = findViewById<Spinner>(R.id.battlefieldRepairSpinner)
        val crippleSpinner = findViewById<Spinner>(R.id.crippleSpinner)
        val decapitateSpinner = findViewById<Spinner>(R.id.decapitateSpinner)
        val dirtEyeSpinner = findViewById<Spinner>(R.id.dirtEyeSpinner)
        val tripSpinner = findViewById<Spinner>(R.id.tripSpinner)
        val whirlBlowsSpinner = findViewById<Spinner>(R.id.whirlBlowsSpinner)
//Rogue Skills
        val garroteSpinner = findViewById<Spinner>(R.id.garroteSpinner)
        val sapSpinner = findViewById<Spinner>(R.id.sapSpinner)
        val vitalBlowSpinner = findViewById<Spinner>(R.id.vitalBlowSpinner)
        val dodgeSpinner = findViewById<Spinner>(R.id.dodgeSpinner)
        val specificCritSpinner = findViewById<Spinner>(R.id.specificCritSpinner)
        val groupCritSpinner = findViewById<Spinner>(R.id.groupCritSpinner)
        val executeSpinner = findViewById<Spinner>(R.id.executeSpinner)
        val executeMstrSpinner = findViewById<Spinner>(R.id.executeMstrSpinner)
        val blindfighterSpinner = findViewById<Spinner>(R.id.blindfighterSpinner)
        val escapeSpinner = findViewById<Spinner>(R.id.escapeSpinner)
        val riposteSpinner = findViewById<Spinner>(R.id.riposteSpinner)
        val suckerPunchSpinner = findViewById<Spinner>(R.id.suckerPunchSpinner)
        val thievesCantSpinner = findViewById<Spinner>(R.id.thievesCantSpinner)
        val tumbleSpinner = findViewById<Spinner>(R.id.tumbleSpinner)
//Scholar Skills
        val mysticismSpinner = findViewById<Spinner>(R.id.mysticismSpinner)
        val demAngArtsSpinner = findViewById<Spinner>(R.id.demAngArtsSpinner)
        val necroArtsSpinner = findViewById<Spinner>(R.id.necroArtsSpinner)
        val anatomySpinner = findViewById<Spinner>(R.id.anatomySpinner)
        val firstAidSpinner = findViewById<Spinner>(R.id.firstAidSpinner)
        val physicianSpinner = findViewById<Spinner>(R.id.physicianSpinner)
        val readWriteSpinner = findViewById<Spinner>(R.id.readWriteSpinner)
        val readMagicSpinner = findViewById<Spinner>(R.id.readMagicSpinner)
        val rdAdvMagicSpinner = findViewById<Spinner>(R.id.rdAdvMagicSpinner)
        val rdRitualMagicSpinner = findViewById<Spinner>(R.id.rdRitualMagicSpinner)
        val eleAttuneSpinner = findViewById<Spinner>(R.id.eleAttuneSpinner)
        val combatWizSpinner = findViewById<Spinner>(R.id.combatWizSpinner)
        val harvestSpinner = findViewById<Spinner>(R.id.harvestSpinner)
        val morticianSpinner = findViewById<Spinner>(R.id.morticianSpinner)
        val refocusSpinner = findViewById<Spinner>(R.id.refocusSpinner)
        val spellParrySpinner = findViewById<Spinner>(R.id.spellParrySpinner)
        val spellVersSpinner = findViewById<Spinner>(R.id.spellVersSpinner)
        val spellSwitchSpinner = findViewById<Spinner>(R.id.spellSwitchSpinner)
//Spheres and Slots
        val sphere1Spinner = findViewById<Spinner>(R.id.sphere1Spinner)
        val sphere2Spinner = findViewById<Spinner>(R.id.sphere2Spinner)
        val sphere3Spinner = findViewById<Spinner>(R.id.sphere3Spinner)
        val slot1Spinner = findViewById<Spinner>(R.id.slot1Spinner)
        val slot2Spinner = findViewById<Spinner>(R.id.slot2Spinner)
        val slot3Spinner = findViewById<Spinner>(R.id.slot3Spinner)
        val slot4Spinner = findViewById<Spinner>(R.id.slot4Spinner)
        val slot5Spinner = findViewById<Spinner>(R.id.slot5Spinner)
        val slot6Spinner = findViewById<Spinner>(R.id.slot6Spinner)
        val slot7Spinner = findViewById<Spinner>(R.id.slot7Spinner)
        val slot8Spinner = findViewById<Spinner>(R.id.slot8Spinner)
        val slot9Spinner = findViewById<Spinner>(R.id.slot9Spinner)
        val ritualSpinner = findViewById<Spinner>(R.id.ritualSpinner)

        //Old Value Slot

        //Spinners for Top Section

        //Spinner for Races
        val raceList = arrayOf(
            "No Selection", "Savar'Aving", "Gargylen", "Mountain Dwarf", "Dark Elf", "High Elf",
            "Wild Elf", "Wood Fae", "Orc", "Ajaunti", "Einher", "Hobling", "Human", "*Frag Race*")
        val raceArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, raceList)
        raceSpinner.adapter = raceArrayAdapter
        raceSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val raceSelection: String = raceSpinner.selectedItem.toString()

                if (raceSelection == "*Frag Race*") {
                    fragText.visibility = View.VISIBLE
                    fragSpinner.visibility = View.VISIBLE

                    cultureText.text = "Culture"
                    cultureText.visibility = View.GONE
                    cultureCheck.visibility = View.GONE
                    cultureCheck.isChecked = false

                    cultureFragsInt = 0
                    calculateFragCost()
                    characterFrags.setText("" + characterFragsInt)
                }
                else {
                    fragText.visibility = View.GONE
                    fragSpinner.visibility = View.GONE

                    if (raceSelection == "Savar'Aving") {
                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureText.text = "Taliss Pride Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                            }
                            else {
                                cultureFragsInt = 0
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Gargylen") {
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Mountain Dwarf") {
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Dark Elf") {
                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureText.text = "House Mortuus Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                            }
                            else {
                                cultureFragsInt = 0
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "High Elf") {
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Wild Elf") {
                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureText.text = "Kraken Tribe Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                            }
                            else {
                                cultureFragsInt = 0
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Wood Elf") {
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Orc") {
                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureText.text = "Ebon Khan Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                            }
                            else {
                                cultureFragsInt = 0
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Ajaunti") {
                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureText.text = "Clan Vinatore Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                            }
                            else {
                                cultureFragsInt = 0
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Einher") {
                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureText.text = "True Berserker Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                            }
                            else {
                                cultureFragsInt = 0
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Hobling") {
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE

                    }
                    else if (raceSelection == "Human") {
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else {
                        cultureText.text = "Culture"
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                        cultureCheck.isChecked = false

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)
                    }
                }

            }  //raceSpinner onSelected

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        } //raceSpinner

        //Spinner for Frag Races
        val fragList = arrayOf(
            "No Selection", "Am'rath", "Faun", "Minotaur", "Kobold", "Ogre", "Squamata", "Avian",
            "Draconian", "Fire Elf", "Goblin", "Risen", "Wolven", "Yokai", "Carnal Fae", "Faceless",
            "Gnome", "Ice Elf", "Sidhe", "Vulcan Dwarf")
        val fragArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, fragList)
        fragSpinner.adapter = fragArrayAdapter
        fragSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                val fragSelection: String = fragSpinner.selectedItem.toString()
                if (fragSelection == "No Selection") {
                    raceFragsInt = 0
                }
                //Uncommon Races
                else if (fragSelection == "Am'rath"){
                    raceFragsInt = 75
                }
                else if (fragSelection == "Faun"){
                    raceFragsInt = 75
                }
                else if (fragSelection == "Minotaur"){
                    raceFragsInt = 75
                }
                else if (fragSelection == "Kobold"){
                    raceFragsInt = 75
                }
                else if (fragSelection == "Ogre"){
                    raceFragsInt = 75
                }
                else if (fragSelection == "Squamata"){
                    raceFragsInt = 75
                }
                //Rare Races
                else if (fragSelection == "Avian"){
                    raceFragsInt = 150
                }
                else if (fragSelection == "Draconian"){
                    raceFragsInt = 150
                }
                else if (fragSelection == "Fire Elf"){
                    raceFragsInt = 150
                }
                else if (fragSelection == "Goblin"){
                    raceFragsInt = 150
                }
                else if (fragSelection == "Risen"){
                    raceFragsInt = 150
                }
                else if (fragSelection == "Wolven"){
                    raceFragsInt = 150
                }
                else if (fragSelection == "Yokai"){
                    raceFragsInt = 150
                }
                //Obscure Races
                else if (fragSelection == "Carnal Fae"){
                    raceFragsInt = 250
                }
                else if (fragSelection == "Faceless"){
                    raceFragsInt = 250
                }
                else if (fragSelection == "Gnome"){
                    raceFragsInt = 250
                }
                else if (fragSelection == "Ice Elf"){
                    raceFragsInt = 250
                }
                else if (fragSelection == "Sidhe"){
                    raceFragsInt = 250
                }
                else if (fragSelection == "Vulcan Dwarf"){
                    raceFragsInt = 250
                }

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)

            } //fragSpinner onSelected
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        } //fragSpinner

        //Spinner for Class
        val classList = arrayOf(
            "No Selection", "Mercenary", "Ranger", "Templar", "Assassin", "Nightblade",
            "Witch Hunter", "Druid", "Mage", "Bard")
        val classArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, classList)
        classSpinner.adapter = classArrayAdapter
        classSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                //Changes at Class Selection
                val classSelection: String = classSpinner.selectedItem.toString()
                val vocationSelection: String = vocationSpinner.selectedItem.toString()

                if (classSelection != "No Selection"){
                    vocationText.visibility = View.VISIBLE
                    vocationSpinner.visibility = View.VISIBLE
                }
                else{
                    vocationText.visibility = View.GONE
                    vocationSpinner.visibility = View.GONE
                }

                if (vocationSelection != "None"){      //Set Occupational names
                    //Do Nothing
                }
                else if (classSelection =="Mercenary"){
                    level3Name.text = "Hamstring"
                    level6Name.text = "Headbutt"
                    level9Name.text = "Dismember"
                    level12Name.text = "Razor's Edge"
                }
                else if (classSelection == "Ranger"){
                    level3Name.text = "Detoxify"
                    level6Name.text = "Trailblazing"
                    level9Name.text = "Nature's Grasp"
                    level12Name.text = "Call of the Hunt"
                }
                else if (classSelection == "Templar"){
                    level3Name.text = "Burn Slot"
                    level6Name.text = "Scroll Harvest"
                    level9Name.text = "Weapon Break"
                    level12Name.text = "Weapon Conduit"
                }
                else if (classSelection == "Assassin"){
                    level3Name.text = "Shiv"
                    level6Name.text = "Silent Strike"
                    level9Name.text = "Spirit Sever"
                    level12Name.text = "Penetration"
                }
                else if (classSelection == "Nightblade"){
                    level3Name.text = "Feint"
                    level6Name.text = "Duplicate Key"
                    level9Name.text = "Dim"
                    level12Name.text = "Passwall"
                }
                else if (classSelection == "Witch Hunter"){
                    level3Name.text = "Witch Mark"
                    level6Name.text = "Twist of the Tongue"
                    level9Name.text = "Karmic Ricochet"
                    level12Name.text = "Counter Magic"
                }
                else if (classSelection == "Druid"){
                    level3Name.text = "Create Grove"
                    level6Name.text = "Forest Meld"
                    level9Name.text = "Totem"
                    level12Name.text = "Henge"
                }
                else if (classSelection == "Mage"){
                    level3Name.text = "Id. Magic Item"
                    level6Name.text = "Mana Harvest"
                    level9Name.text = "Create Familiar"
                    level12Name.text = "Power Nexus"
                }
                else if (classSelection == "Bard"){
                    level3Name.text = "S. of Aversion"
                    level6Name.text = "S. of Love"
                    level9Name.text = "S. of Intermission"
                    level12Name.text = "S. of Heroism"
                }

                if (classSelection == "Mercenary") {    //Start CP set
                    characterClass = "Mercenary"

                    //Mercenary CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "80"
                    chemistryCP.text = "90"
                    blacksmithingCP.text = "65"
                    artificeCP.text = "75"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "20"
                    florentineCP.text = "40"
                    flurryCP.text = "40"
                    heavyArmorCP.text = "15"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "50"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "100"
                    groupSpecCP.text = "120"
                    specificSpecCP.text = "100"
                    slayParryCP.text = "100"
                    slayParryMstrCP.text = "120"
                    //Rogue Skills
                    garroteCP.text = "100"
                    sapCP.text = "55"
                    vitalBlowCP.text = "85"
                    dodgeCP.text = "170"
                    specificCritCP.text = "150"
                    groupCritCP.text = "170"
                    executeCP.text = "170"
                    executeMstrCP.text = "190"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "70"
                    readMagicCP.text = "45"
                    rdAdvMagicCP.text = "50"
                    rdRitualMagicCP.text = "90"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "100"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "30"
                    slot2CP.text = "40"
                    slot3CP.text = "80"
                    slot4CP.text = "100"
                    slot5CP.text = "100"
                    slot6CP.text = "120"
                    slot7CP.text = "120"
                    slot8CP.text = "150"
                    slot9CP.text = "150"
                    ritualCP.text = "40"
                }
                else if (classSelection == "Ranger") {
                    characterClass = "Ranger"

                    //Ranger CP text
                    //General Skills
                    trapsmithCP.text = "65"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "50"
                    chemistryCP.text = "60"
                    blacksmithingCP.text = "65"
                    artificeCP.text = "75"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "30"
                    florentineCP.text = "40"
                    flurryCP.text = "50"
                    heavyArmorCP.text = "20"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "75"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "100"
                    groupSpecCP.text = "140"
                    specificSpecCP.text = "120"
                    slayParryCP.text = "120"
                    slayParryMstrCP.text = "140"
                    //Rogue Skills
                    garroteCP.text = "85"
                    sapCP.text = "45"
                    vitalBlowCP.text = "65"
                    dodgeCP.text = "140"
                    specificCritCP.text = "125"
                    groupCritCP.text = "145"
                    executeCP.text = "130"
                    executeMstrCP.text = "150"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "60"
                    readMagicCP.text = "35"
                    rdAdvMagicCP.text = "45"
                    rdRitualMagicCP.text = "80"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "100"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "30"
                    slot2CP.text = "30"
                    slot3CP.text = "60"
                    slot4CP.text = "60"
                    slot5CP.text = "90"
                    slot6CP.text = "90"
                    slot7CP.text = "120"
                    slot8CP.text = "120"
                    slot9CP.text = "150"
                    ritualCP.text = "30"
                }
                else if (classSelection == "Templar") {
                    characterClass = "Templar"

                    //Templar CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "80"
                    chemistryCP.text = "90"
                    blacksmithingCP.text = "65"
                    artificeCP.text = "75"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "35"
                    florentineCP.text = "45"
                    flurryCP.text = "55"
                    heavyArmorCP.text = "20"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "60"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "100"
                    groupSpecCP.text = "150"
                    specificSpecCP.text = "130"
                    slayParryCP.text = "130"
                    slayParryMstrCP.text = "150"
                    //Rogue Skills
                    garroteCP.text = "85"
                    sapCP.text = "50"
                    vitalBlowCP.text = "75"
                    dodgeCP.text = "150"
                    specificCritCP.text = "130"
                    groupCritCP.text = "150"
                    executeCP.text = "150"
                    executeMstrCP.text = "170"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "60"
                    necroArtsCP.text = "60"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "45"
                    readMagicCP.text = "20"
                    rdAdvMagicCP.text = "30"
                    rdRitualMagicCP.text = "50"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "75"
                    sphere2CP.text = "175"
                    sphere3CP.text = "275"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "30"
                    slot5CP.text = "40"
                    slot6CP.text = "50"
                    slot7CP.text = "60"
                    slot8CP.text = "70"
                    slot9CP.text = "80"
                    ritualCP.text = "30"
                }
                else if (classSelection == "Assassin") {
                    characterClass = "Assassin"

                    //Assassin CP text
                    //General Skills
                    trapsmithCP.text = "55"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "40"
                    chemistryCP.text = "50"
                    blacksmithingCP.text = "90"
                    artificeCP.text = "100"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "30"
                    florentineCP.text = "65"
                    flurryCP.text = "65"
                    heavyArmorCP.text = "45"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "120"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "50"
                    groupProfLrgCP.text = "100"
                    profExoticCP.text = "130"
                    groupSpecCP.text = "150"
                    specificSpecCP.text = "130"
                    slayParryCP.text = "150"
                    slayParryMstrCP.text = "170"
                    //Rogue Skills
                    garroteCP.text = "60"
                    sapCP.text = "35"
                    vitalBlowCP.text = "55"
                    dodgeCP.text = "120"
                    specificCritCP.text = "100"
                    groupCritCP.text = "120"
                    executeCP.text = "100"
                    executeMstrCP.text = "120"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "70"
                    readMagicCP.text = "40"
                    rdAdvMagicCP.text = "50"
                    rdRitualMagicCP.text = "90"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "100"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "40"
                    slot2CP.text = "60"
                    slot3CP.text = "80"
                    slot4CP.text = "100"
                    slot5CP.text = "100"
                    slot6CP.text = "120"
                    slot7CP.text = "120"
                    slot8CP.text = "150"
                    slot9CP.text = "150"
                    ritualCP.text = "40"
                }
                else if (classSelection == "Nightblade") {
                    characterClass = "Nightblade"

                    //Nightblade CP text
                    //General Skills
                    trapsmithCP.text = "45"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "40"
                    chemistryCP.text = "50"
                    blacksmithingCP.text = "80"
                    artificeCP.text = "90"
                    scrollcraftingCP.text = "50"
                    lootingCP.text = "10"
                    //Warrior Skills
                    ambidexterityCP.text = "40"
                    florentineCP.text = "70"
                    flurryCP.text = "75"
                    heavyArmorCP.text = "40"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "110"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "50"
                    groupProfLrgCP.text = "100"
                    profExoticCP.text = "130"
                    groupSpecCP.text = "170"
                    specificSpecCP.text = "150"
                    slayParryCP.text = "170"
                    slayParryMstrCP.text = "190"
                    //Rogue Skills
                    garroteCP.text = "85"
                    sapCP.text = "35"
                    vitalBlowCP.text = "50"
                    dodgeCP.text = "100"
                    specificCritCP.text = "120"
                    groupCritCP.text = "140"
                    executeCP.text = "120"
                    executeMstrCP.text = "150"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "55"
                    readMagicCP.text = "25"
                    rdAdvMagicCP.text = "35"
                    rdRitualMagicCP.text = "60"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "75"
                    sphere2CP.text = "175"
                    sphere3CP.text = "275"
                    slot1CP.text = "20"
                    slot2CP.text = "20"
                    slot3CP.text = "40"
                    slot4CP.text = "40"
                    slot5CP.text = "60"
                    slot6CP.text = "60"
                    slot7CP.text = "80"
                    slot8CP.text = "80"
                    slot9CP.text = "100"
                    ritualCP.text = "20"
                }
                else if (classSelection == "Witch Hunter") {
                    characterClass = "Witch Hunter"

                    //Witch Hunter CP text
                    //General Skills
                    trapsmithCP.text = "65"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "50"
                    chemistryCP.text = "60"
                    blacksmithingCP.text = "80"
                    artificeCP.text = "90"
                    scrollcraftingCP.text = "45"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "45"
                    florentineCP.text = "70"
                    flurryCP.text = "75"
                    heavyArmorCP.text = "45"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "95"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "50"
                    groupProfLrgCP.text = "100"
                    profExoticCP.text = "130"
                    groupSpecCP.text = "170"
                    specificSpecCP.text = "150"
                    slayParryCP.text = "170"
                    slayParryMstrCP.text = "190"
                    //Rogue Skills
                    garroteCP.text = "65"
                    sapCP.text = "35"
                    vitalBlowCP.text = "65"
                    dodgeCP.text = "130"
                    specificCritCP.text = "130"
                    groupCritCP.text = "150"
                    executeCP.text = "130"
                    executeMstrCP.text = "150"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "60"
                    necroArtsCP.text = "60"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "45"
                    readMagicCP.text = "25"
                    rdAdvMagicCP.text = "35"
                    rdRitualMagicCP.text = "60"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "75"
                    sphere2CP.text = "175"
                    sphere3CP.text = "275"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "30"
                    slot5CP.text = "30"
                    slot6CP.text = "40"
                    slot7CP.text = "50"
                    slot8CP.text = "50"
                    slot9CP.text = "60"
                    ritualCP.text = "20"
                }
                else if (classSelection == "Druid") {
                    characterClass = "Druid"

                    //Druid CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "40"
                    chemistryCP.text = "50"
                    blacksmithingCP.text = "100"
                    artificeCP.text = "110"
                    scrollcraftingCP.text = "45"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "100"
                    heavyArmorCP.text = "60"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "140"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "200"
                    specificSpecCP.text = "180"
                    slayParryCP.text = "200"
                    slayParryMstrCP.text = "220"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "100"
                    dodgeCP.text = "200"
                    specificCritCP.text = "180"
                    groupCritCP.text = "200"
                    executeCP.text = "200"
                    executeMstrCP.text = "220"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "60"
                    necroArtsCP.text = "60"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "50"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }
                else if (classSelection == "Mage") {
                    characterClass = "Mage"

                    //Mage CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "60"
                    chemistryCP.text = "70"
                    blacksmithingCP.text = "110"
                    artificeCP.text = "120"
                    scrollcraftingCP.text = "35"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "125"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "140"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "250"
                    specificSpecCP.text = "230"
                    slayParryCP.text = "250"
                    slayParryMstrCP.text = "270"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "120"
                    dodgeCP.text = "250"
                    specificCritCP.text = "230"
                    groupCritCP.text = "250"
                    executeCP.text = "250"
                    executeMstrCP.text = "270"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "55"
                    necroArtsCP.text = "55"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "40"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "25"
                    sphere2CP.text = "150"
                    sphere3CP.text = "200"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }
                else if (classSelection == "Bard") {
                    characterClass = "Bard"

                    //Bard CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "35"
                    alchemyCP.text = "50"
                    chemistryCP.text = "60"
                    blacksmithingCP.text = "85"
                    artificeCP.text = "95"
                    scrollcraftingCP.text = "35"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "125"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "140"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "250"
                    specificSpecCP.text = "230"
                    slayParryCP.text = "250"
                    slayParryMstrCP.text = "270"
                    //Rogue Skills
                    garroteCP.text = "95"
                    sapCP.text = "40"
                    vitalBlowCP.text = "75"
                    dodgeCP.text = "80"
                    specificCritCP.text = "130"
                    groupCritCP.text = "150"
                    executeCP.text = "150"
                    executeMstrCP.text = "170"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "50"
                    necroArtsCP.text = "55"
                    anatomyCP.text = "35"
                    firstAidCP.text = "55"
                    physicianCP.text = "40"
                    readWriteCP.text = "40"
                    readMagicCP.text = "25"
                    rdAdvMagicCP.text = "35"
                    rdRitualMagicCP.text = "50"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "30"
                    slot5CP.text = "30"
                    slot6CP.text = "40"
                    slot7CP.text = "60"
                    slot8CP.text = "70"
                    slot9CP.text = "80"
                    ritualCP.text = "30"
                }
                else {
                    vocationSpinner.setSelection(0)
                    characterClass = "Choose a class"

                    level3Name.text = "Level 3 Skill"
                    level6Name.text = "Level 6 Skill"
                    level9Name.text = "Level 9 Skill"
                    level12Name.text = "Level 12 Skill"

                    //No Class CP text
                    //General Skills
                    trapsmithCP.text = "0"
                    tradesmanCP.text = "0"
                    alchemyCP.text = "0"
                    chemistryCP.text = "0"
                    blacksmithingCP.text = "0"
                    artificeCP.text = "0"
                    scrollcraftingCP.text = "0"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "0"
                    florentineCP.text = "0"
                    flurryCP.text = "0"
                    heavyArmorCP.text = "0"
                    selfMutilateCP.text = "0"
                    shieldCP.text = "0"
                    weapRefocusCP.text = "0"
                    groupProfMedCP.text = "0"
                    groupProfLrgCP.text = "0"
                    profExoticCP.text = "0"
                    groupSpecCP.text = "0"
                    specificSpecCP.text = "0"
                    slayParryCP.text = "0"
                    slayParryMstrCP.text = "0"
                    //Rogue Skills
                    garroteCP.text = "0"
                    sapCP.text = "0"
                    vitalBlowCP.text = "0"
                    dodgeCP.text = "0"
                    specificCritCP.text = "0"
                    groupCritCP.text = "0"
                    executeCP.text = "0"
                    executeMstrCP.text = "0"
                    //Scholar Skills
                    mysticismCP.text = "0"
                    demAngArtsCP.text = "0"
                    necroArtsCP.text = "0"
                    anatomyCP.text = "0"
                    firstAidCP.text = "0"
                    physicianCP.text = "0"
                    readWriteCP.text = "0"
                    readMagicCP.text = "0"
                    rdAdvMagicCP.text = "0"
                    rdRitualMagicCP.text = "0"
                    eleAttuneCP.text = "0"
                    //Spheres and Slots
                    sphere1CP.text = "0"
                    sphere2CP.text = "0"
                    sphere3CP.text = "0"
                    slot1CP.text = "0"
                    slot2CP.text = "0"
                    slot3CP.text = "0"
                    slot4CP.text = "0"
                    slot5CP.text = "0"
                    slot6CP.text = "0"
                    slot7CP.text = "0"
                    slot8CP.text = "0"
                    slot9CP.text = "0"
                    ritualCP.text = "0"
                }

                //CP and Frag Check and Math
                //General Skills
                level3Cost = Integer.parseInt(level3CP.text.toString())
                level3Select = Integer.parseInt(level3Spinner.selectedItem.toString())
                level6Cost = Integer.parseInt(level6CP.text.toString())
                level6Select = Integer.parseInt(level6Spinner.selectedItem.toString())
                level9Cost = Integer.parseInt(level9CP.text.toString())
                level9Select = Integer.parseInt(level9Spinner.selectedItem.toString())
                level12Cost = Integer.parseInt(level12CP.text.toString())
                level12Select = Integer.parseInt(level12Spinner.selectedItem.toString())
                racialCost = Integer.parseInt(racialCP.text.toString())
                racialSelect = Integer.parseInt(racialSpinner.selectedItem.toString())
                trapsmithCost = Integer.parseInt(trapsmithCP.text.toString())
                trapsmithSelect = Integer.parseInt(trapsmithSpinner.selectedItem.toString())
                tradesmanCost = Integer.parseInt(tradesmanCP.text.toString())
                tradesmanSelect = Integer.parseInt(tradesmanSpinner.selectedItem.toString())
                alchemyCost = Integer.parseInt(alchemyCP.text.toString())
                alchemySelect = Integer.parseInt(alchemySpinner.selectedItem.toString())
                chemistryCost = Integer.parseInt(chemistryCP.text.toString())
                chemistrySelect = Integer.parseInt(chemistrySpinner.selectedItem.toString())
                blacksmithingCost = Integer.parseInt(blacksmithingCP.text.toString())
                blacksmithingSelect = Integer.parseInt(blacksmithingSpinner.selectedItem.toString())
                artificeCost = Integer.parseInt(artificeCP.text.toString())
                artificeSelect = Integer.parseInt(artificeSpinner.selectedItem.toString())
                scrollcraftingCost = Integer.parseInt(scrollcraftingCP.text.toString())
                scrollcraftingSelect = Integer.parseInt(scrollcraftingSpinner.selectedItem.toString())
                coldHandsCost = Integer.parseInt(coldHandsCP.text.toString())
                coldHandsFragCost = Integer.parseInt(coldHandsFrags.text.toString())
                coldHandsSelect = Integer.parseInt(coldHandsSpinner.selectedItem.toString())
                createAlcoholCost = Integer.parseInt(createAlcoholCP.text.toString())
                createAlcoholFragCost= Integer.parseInt(createAlcoholFrags.text.toString())
                createAlcoholSelect = Integer.parseInt(createAlcoholSpinner.selectedItem.toString())
                heavyDrinkerCost = Integer.parseInt(heavyDrinkerCP.text.toString())
                heavyDrinkerFragCost = Integer.parseInt(heavyDrinkerFrags.text.toString())
                heavyDrinkerSelect = Integer.parseInt(heavyDrinkerSpinner.selectedItem.toString())
                hindsightCost = Integer.parseInt(hindsightCP.text.toString())
                hindsightFragCost = Integer.parseInt(hindsightFrags.text.toString())
                hindsightSelect = Integer.parseInt(hindsightSpinner.selectedItem.toString())
                intuitionCost = Integer.parseInt(intuitionCP.text.toString())
                intuitionFragCost = Integer.parseInt(intuitionFrags.text.toString())
                intuitionSelect = Integer.parseInt(intuitionSpinner.selectedItem.toString())
                lootingCost = Integer.parseInt(lootingCP.text.toString())
                lootingFragCost = Integer.parseInt(lootingFrags.text.toString())
                lootingSelect = Integer.parseInt(lootingSpinner.selectedItem.toString())
                //Paragon
                possumCost = Integer.parseInt(possumCP.text.toString())
                possumFragCost = Integer.parseInt(possumFrags.text.toString())
                possumSelect = Integer.parseInt(possumSpinner.selectedItem.toString())
                teacherCost = Integer.parseInt(teacherCP.text.toString())
                teacherFragCost = Integer.parseInt(teacherFrags.text.toString())
                teacherSelect = Integer.parseInt(teacherSpinner.selectedItem.toString())
                //Warrior Skills
                ambidexterityCost = Integer.parseInt(ambidexterityCP.text.toString())
                ambidexteritySelect = Integer.parseInt(ambidexteritySpinner.selectedItem.toString())
                florentineCost = Integer.parseInt(florentineCP.text.toString())
                florentineSelect = Integer.parseInt(florentineSpinner.selectedItem.toString())
                flurryCost = Integer.parseInt(flurryCP.text.toString())
                flurrySelect = Integer.parseInt(flurrySpinner.selectedItem.toString())
                heavyArmorCost = Integer.parseInt(heavyArmorCP.text.toString())
                heavyArmorSelect = Integer.parseInt(heavyArmorSpinner.selectedItem.toString())
                shieldCost = Integer.parseInt(shieldCP.text.toString())
                shieldSelect = Integer.parseInt(shieldSpinner.selectedItem.toString())
                selfMutilateCost = Integer.parseInt(selfMutilateCP.text.toString())
                selfMutilateSelect = Integer.parseInt(selfMutilateSpinner.selectedItem.toString())
                weapRefocusCost = Integer.parseInt(weapRefocusCP.text.toString())
                weapRefocusSelect = Integer.parseInt(weapRefocusSpinner.selectedItem.toString())
                groupProfMedCost = Integer.parseInt(groupProfMedCP.text.toString())
                groupProfMedSelect = Integer.parseInt(groupProfMedSpinner.selectedItem.toString())
                groupProfLrgCost = Integer.parseInt(groupProfLrgCP.text.toString())
                groupProfLrgSelect = Integer.parseInt(groupProfLrgSpinner.selectedItem.toString())
                profExoticCost = Integer.parseInt(profExoticCP.text.toString())
                profExoticSelect = Integer.parseInt(profExoticSpinner.selectedItem.toString())
                groupSpecCost = Integer.parseInt(groupSpecCP.text.toString())
                groupSpecSelect = Integer.parseInt(groupSpecSpinner.selectedItem.toString())
                specificSpecCost = Integer.parseInt(specificSpecCP.text.toString())
                specificSpecSelect = Integer.parseInt(specificSpecSpinner.selectedItem.toString())
                slayParryCost = Integer.parseInt(slayParryCP.text.toString())
                slayParrySelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())
                slayParryMstrCost = Integer.parseInt(slayParryMstrCP.text.toString())
                slayParryMstrSelect = Integer.parseInt(slayParryMstrSpinner.selectedItem.toString())
                battlefieldRepairCost = Integer.parseInt(battlefieldRepairCP.text.toString())
                battlefieldRepairFragCost = Integer.parseInt(battlefieldRepairFrags.text.toString())
                battlefieldRepairSelect = Integer.parseInt(battlefieldRepairSpinner.selectedItem.toString())
                crippleCost = Integer.parseInt(crippleCP.text.toString())
                crippleFragCost = Integer.parseInt(crippleFrags.text.toString())
                crippleSelect = Integer.parseInt(crippleSpinner.selectedItem.toString())
                decapitateCost = Integer.parseInt(decapitateCP.text.toString())
                decapitateFragCost = Integer.parseInt(decapitateFrags.text.toString())
                decapitateSelect = Integer.parseInt(decapitateSpinner.selectedItem.toString())
                dirtEyeCost = Integer.parseInt(dirtEyeCP.text.toString())
                dirtEyeFragCost = Integer.parseInt(dirtEyeFrags.text.toString())
                dirtEyeSelect = Integer.parseInt(dirtEyeSpinner.selectedItem.toString())
                tripCost = Integer.parseInt(tripCP.text.toString())
                tripFragCost = Integer.parseInt(tripFrags.text.toString())
                tripSelect = Integer.parseInt(tripSpinner.selectedItem.toString())
                whirlBlowsCost = Integer.parseInt(whirlBlowsCP.text.toString())
                whirlBlowsFragCost = Integer.parseInt(whirlBlowsFrags.text.toString())
                whirlBlowsSelect = Integer.parseInt(whirlBlowsSpinner.selectedItem.toString())
                //Rogue Skills
                garroteCost = Integer.parseInt(garroteCP.text.toString())
                garroteSelect = Integer.parseInt(garroteSpinner.selectedItem.toString())
                sapCost = Integer.parseInt(sapCP.text.toString())
                sapSelect = Integer.parseInt(sapSpinner.selectedItem.toString())
                vitalBlowCost = Integer.parseInt(vitalBlowCP.text.toString())
                vitalBlowSelect = Integer.parseInt(vitalBlowSpinner.selectedItem.toString())
                dodgeCost = Integer.parseInt(dodgeCP.text.toString())
                dodgeSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())
                specificCritCost = Integer.parseInt(specificCritCP.text.toString())
                specificCritSelect = Integer.parseInt(specificCritSpinner.selectedItem.toString())
                groupCritCost = Integer.parseInt(groupCritCP.text.toString())
                groupCritSelect = Integer.parseInt(groupCritSpinner.selectedItem.toString())
                executeCost = Integer.parseInt(executeCP.text.toString())
                executeSelect = Integer.parseInt(executeSpinner.selectedItem.toString())
                executeMstrCost = Integer.parseInt(executeMstrCP.text.toString())
                executeMstrSelect = Integer.parseInt(executeMstrSpinner.selectedItem.toString())
                blindfighterCost = Integer.parseInt(blindfighterCP.text.toString())
                blindfighterFragCost= Integer.parseInt(blindfighterFrags.text.toString())
                blindfighterSelect = Integer.parseInt(blindfighterSpinner.selectedItem.toString())
                escapeCost = Integer.parseInt(escapeCP.text.toString())
                escapeFragCost = Integer.parseInt(escapeFrags.text.toString())
                escapeSelect = Integer.parseInt(escapeSpinner.selectedItem.toString())
                riposteCost = Integer.parseInt(riposteCP.text.toString())
                riposteFragCost = Integer.parseInt(riposteFrags.text.toString())
                riposteSelect = Integer.parseInt(riposteSpinner.selectedItem.toString())
                suckerPunchCost = Integer.parseInt(suckerPunchCP.text.toString())
                suckerPunchFragCost = Integer.parseInt(suckerPunchFrags.text.toString())
                suckerPunchSelect = Integer.parseInt(suckerPunchSpinner.selectedItem.toString())
                thievesCantCost = Integer.parseInt(thievesCantCP.text.toString())
                thievesCantFragCost = Integer.parseInt(thievesCantFrags.text.toString())
                thievesCantSelect = Integer.parseInt(thievesCantSpinner.selectedItem.toString())
                tumbleCost = Integer.parseInt(tumbleCP.text.toString())
                tumbleFragCost = Integer.parseInt(tumbleFrags.text.toString())
                tumbleSelect = Integer.parseInt(tumbleSpinner.selectedItem.toString())
                //Scholar Skills
                mysticismCost = Integer.parseInt(mysticismCP.text.toString())
                mysticismSelect = Integer.parseInt(mysticismSpinner.selectedItem.toString())
                demAngArtsCost = Integer.parseInt(demAngArtsCP.text.toString())
                demAngArtsSelect = Integer.parseInt(demAngArtsSpinner.selectedItem.toString())
                necroArtsCost = Integer.parseInt(necroArtsCP.text.toString())
                necroArtsSelect = Integer.parseInt(necroArtsSpinner.selectedItem.toString())
                anatomyCost = Integer.parseInt(anatomyCP.text.toString())
                anatomySelect = Integer.parseInt(anatomySpinner.selectedItem.toString())
                firstAidCost = Integer.parseInt(firstAidCP.text.toString())
                firstAidSelect = Integer.parseInt(firstAidSpinner.selectedItem.toString())
                physicianCost = Integer.parseInt(physicianCP.text.toString())
                physicianSelect = Integer.parseInt(physicianSpinner.selectedItem.toString())
                readWriteCost = Integer.parseInt(readWriteCP.text.toString())
                readWriteSelect = Integer.parseInt(readWriteSpinner.selectedItem.toString())
                readMagicCost = Integer.parseInt(readMagicCP.text.toString())
                readMagicSelect = Integer.parseInt(readMagicSpinner.selectedItem.toString())
                rdAdvMagicCost = Integer.parseInt(rdAdvMagicCP.text.toString())
                rdAdvMagicSelect = Integer.parseInt(rdAdvMagicSpinner.selectedItem.toString())
                rdRitualMagicCost = Integer.parseInt(rdRitualMagicCP.text.toString())
                rdRitualMagicSelect = Integer.parseInt(rdRitualMagicSpinner.selectedItem.toString())
                eleAttuneCost = Integer.parseInt(eleAttuneCP.text.toString())
                eleAttuneSelect = Integer.parseInt(eleAttuneSpinner.selectedItem.toString())
                combatWizCost = Integer.parseInt(combatWizCP.text.toString())
                combatWizFragCost = Integer.parseInt(combatWizFrags.text.toString())
                combatWizSelect = Integer.parseInt(combatWizSpinner.selectedItem.toString())
                harvestCost = Integer.parseInt(harvestCP.text.toString())
                harvestFragCost = Integer.parseInt(harvestFrags.text.toString())
                harvestSelect = Integer.parseInt(harvestSpinner.selectedItem.toString())
                morticianCost = Integer.parseInt(morticianCP.text.toString())
                morticianFragCost = Integer.parseInt(morticianFrags.text.toString())
                morticianSelect = Integer.parseInt(morticianSpinner.selectedItem.toString())
                refocusCost = Integer.parseInt(refocusCP.text.toString())
                refocusFragCost = Integer.parseInt(refocusFrags.text.toString())
                refocusSelect = Integer.parseInt(refocusSpinner.selectedItem.toString())
                spellParryCost = Integer.parseInt(spellParryCP.text.toString())
                spellParryFragCost = Integer.parseInt(spellParryFrags.text.toString())
                spellParrySelect = Integer.parseInt(spellParrySpinner.selectedItem.toString())
                //Spell Versatility
                spellSwitchCost = Integer.parseInt(spellSwitchCP.text.toString())
                spellSwitchFragCost = Integer.parseInt(spellSwitchFrags.text.toString())
                spellSwitchSelect = Integer.parseInt(spellSwitchSpinner.selectedItem.toString())
                //Spheres and Slots
                //Spheres
                slot1Cost = Integer.parseInt(slot1CP.text.toString())
                slot1Select = Integer.parseInt(slot1Spinner.selectedItem.toString())
                slot2Cost = Integer.parseInt(slot2CP.text.toString())
                slot2Select = Integer.parseInt(slot2Spinner.selectedItem.toString())
                slot3Cost = Integer.parseInt(slot3CP.text.toString())
                slot3Select = Integer.parseInt(slot3Spinner.selectedItem.toString())
                slot4Cost = Integer.parseInt(slot4CP.text.toString())
                slot4Select = Integer.parseInt(slot4Spinner.selectedItem.toString())
                slot5Cost = Integer.parseInt(slot5CP.text.toString())
                slot5Select = Integer.parseInt(slot5Spinner.selectedItem.toString())
                slot6Cost = Integer.parseInt(slot6CP.text.toString())
                slot6Select = Integer.parseInt(slot6Spinner.selectedItem.toString())
                slot7Cost = Integer.parseInt(slot7CP.text.toString())
                slot7Select = Integer.parseInt(slot7Spinner.selectedItem.toString())
                slot8Cost = Integer.parseInt(slot8CP.text.toString())
                slot8Select = Integer.parseInt(slot8Spinner.selectedItem.toString())
                slot9Cost = Integer.parseInt(slot9CP.text.toString())
                slot9Select = Integer.parseInt(slot9Spinner.selectedItem.toString())
                ritualCost = Integer.parseInt(ritualCP.text.toString())
                ritualSelect = Integer.parseInt(ritualSpinner.selectedItem.toString())

                spentCP()  // Cost x Spent For All CP
                calculateSpentCP()

                spentFrags()  // Cost x Spent For All Frags
                calculateFragCost()

                characterSpent.setText("" + characterSpentInt)
                characterFrags.setText("" + characterFragsInt)

            }//Class Spinner Selected

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Spinner for Vocations
        val vocationList = arrayOf(
            "None", "Archer", "Artisan", "Battle Mage", "Brew Master", "Bounty Hunter", "Shaman",
            "Stalwart", "Swashbuckler", "Undead Hunter", "Dread Knight", "Paladin", "Darkweaver",
            "Lightweaver", "Dragon Knight")
        val vocationArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, vocationList)
        vocationSpinner.adapter = vocationArrayAdapter
        vocationSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                val vocationSelection: String = vocationSpinner.selectedItem.toString()
                val classSelection: String = classSpinner.selectedItem.toString()

                if (classSelection != "No Selection") {
                    vocationText.visibility = View.VISIBLE
                    vocationSpinner.visibility = View.VISIBLE
                }
                else {
                    vocationText.visibility = View.GONE
                    vocationSpinner.visibility = View.GONE
                    vocationSpinner.setSelection(0)
                    characterVocation = "Choose a vocation"
                }

                if (classSelection == "Mercenary") {
                    characterClass = "Mercenary"

                    //Mercenary CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "80"
                    chemistryCP.text = "90"
                    blacksmithingCP.text = "65"
                    artificeCP.text = "75"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "20"
                    florentineCP.text = "40"
                    flurryCP.text = "40"
                    heavyArmorCP.text = "15"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "50"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "100"
                    groupSpecCP.text = "120"
                    specificSpecCP.text = "100"
                    slayParryCP.text = "100"
                    slayParryMstrCP.text = "120"
                    //Rogue Skills
                    garroteCP.text = "100"
                    sapCP.text = "55"
                    vitalBlowCP.text = "85"
                    dodgeCP.text = "170"
                    specificCritCP.text = "150"
                    groupCritCP.text = "170"
                    executeCP.text = "170"
                    executeMstrCP.text = "190"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "70"
                    readMagicCP.text = "45"
                    rdAdvMagicCP.text = "50"
                    rdRitualMagicCP.text = "90"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "100"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "30"
                    slot2CP.text = "40"
                    slot3CP.text = "80"
                    slot4CP.text = "100"
                    slot5CP.text = "100"
                    slot6CP.text = "120"
                    slot7CP.text = "120"
                    slot8CP.text = "150"
                    slot9CP.text = "150"
                    ritualCP.text = "40"
                }
                else if (classSelection == "Ranger") {
                    characterClass = "Ranger"

                    //Ranger CP text
                    //General Skills
                    trapsmithCP.text = "65"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "50"
                    chemistryCP.text = "60"
                    blacksmithingCP.text = "65"
                    artificeCP.text = "75"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "30"
                    florentineCP.text = "40"
                    flurryCP.text = "50"
                    heavyArmorCP.text = "20"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "75"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "100"
                    groupSpecCP.text = "140"
                    specificSpecCP.text = "120"
                    slayParryCP.text = "120"
                    slayParryMstrCP.text = "140"
                    //Rogue Skills
                    garroteCP.text = "85"
                    sapCP.text = "45"
                    vitalBlowCP.text = "65"
                    dodgeCP.text = "140"
                    specificCritCP.text = "125"
                    groupCritCP.text = "145"
                    executeCP.text = "130"
                    executeMstrCP.text = "150"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "60"
                    readMagicCP.text = "35"
                    rdAdvMagicCP.text = "45"
                    rdRitualMagicCP.text = "80"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "100"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "30"
                    slot2CP.text = "30"
                    slot3CP.text = "60"
                    slot4CP.text = "60"
                    slot5CP.text = "90"
                    slot6CP.text = "90"
                    slot7CP.text = "120"
                    slot8CP.text = "120"
                    slot9CP.text = "150"
                    ritualCP.text = "30"
                }
                else if (classSelection == "Templar") {
                    characterClass = "Templar"

                    //Templar CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "80"
                    chemistryCP.text = "90"
                    blacksmithingCP.text = "65"
                    artificeCP.text = "75"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "35"
                    florentineCP.text = "45"
                    flurryCP.text = "55"
                    heavyArmorCP.text = "20"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "60"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "100"
                    groupSpecCP.text = "150"
                    specificSpecCP.text = "130"
                    slayParryCP.text = "130"
                    slayParryMstrCP.text = "150"
                    //Rogue Skills
                    garroteCP.text = "85"
                    sapCP.text = "50"
                    vitalBlowCP.text = "75"
                    dodgeCP.text = "150"
                    specificCritCP.text = "130"
                    groupCritCP.text = "150"
                    executeCP.text = "150"
                    executeMstrCP.text = "170"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "60"
                    necroArtsCP.text = "60"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "45"
                    readMagicCP.text = "20"
                    rdAdvMagicCP.text = "30"
                    rdRitualMagicCP.text = "50"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "75"
                    sphere2CP.text = "175"
                    sphere3CP.text = "275"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "30"
                    slot5CP.text = "40"
                    slot6CP.text = "50"
                    slot7CP.text = "60"
                    slot8CP.text = "70"
                    slot9CP.text = "80"
                    ritualCP.text = "30"
                }
                else if (classSelection == "Assassin") {
                    characterClass = "Assassin"

                    //Assassin CP text
                    //General Skills
                    trapsmithCP.text = "55"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "40"
                    chemistryCP.text = "50"
                    blacksmithingCP.text = "90"
                    artificeCP.text = "100"
                    scrollcraftingCP.text = "75"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "30"
                    florentineCP.text = "65"
                    flurryCP.text = "65"
                    heavyArmorCP.text = "45"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "120"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "50"
                    groupProfLrgCP.text = "100"
                    profExoticCP.text = "130"
                    groupSpecCP.text = "150"
                    specificSpecCP.text = "130"
                    slayParryCP.text = "150"
                    slayParryMstrCP.text = "170"
                    //Rogue Skills
                    garroteCP.text = "60"
                    sapCP.text = "35"
                    vitalBlowCP.text = "55"
                    dodgeCP.text = "120"
                    specificCritCP.text = "100"
                    groupCritCP.text = "120"
                    executeCP.text = "100"
                    executeMstrCP.text = "120"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "70"
                    readMagicCP.text = "40"
                    rdAdvMagicCP.text = "50"
                    rdRitualMagicCP.text = "90"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "100"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "40"
                    slot2CP.text = "60"
                    slot3CP.text = "80"
                    slot4CP.text = "100"
                    slot5CP.text = "100"
                    slot6CP.text = "120"
                    slot7CP.text = "120"
                    slot8CP.text = "150"
                    slot9CP.text = "150"
                    ritualCP.text = "40"
                }
                else if (classSelection == "Nightblade") {
                    characterClass = "Nightblade"

                    //Nightblade CP text
                    //General Skills
                    trapsmithCP.text = "45"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "40"
                    chemistryCP.text = "50"
                    blacksmithingCP.text = "80"
                    artificeCP.text = "90"
                    scrollcraftingCP.text = "50"
                    lootingCP.text = "10"
                    //Warrior Skills
                    ambidexterityCP.text = "40"
                    florentineCP.text = "70"
                    flurryCP.text = "75"
                    heavyArmorCP.text = "40"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "110"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "50"
                    groupProfLrgCP.text = "100"
                    profExoticCP.text = "130"
                    groupSpecCP.text = "170"
                    specificSpecCP.text = "150"
                    slayParryCP.text = "170"
                    slayParryMstrCP.text = "190"
                    //Rogue Skills
                    garroteCP.text = "85"
                    sapCP.text = "35"
                    vitalBlowCP.text = "50"
                    dodgeCP.text = "100"
                    specificCritCP.text = "120"
                    groupCritCP.text = "140"
                    executeCP.text = "120"
                    executeMstrCP.text = "150"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "75"
                    necroArtsCP.text = "75"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "55"
                    readMagicCP.text = "25"
                    rdAdvMagicCP.text = "35"
                    rdRitualMagicCP.text = "60"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "75"
                    sphere2CP.text = "175"
                    sphere3CP.text = "275"
                    slot1CP.text = "20"
                    slot2CP.text = "20"
                    slot3CP.text = "40"
                    slot4CP.text = "40"
                    slot5CP.text = "60"
                    slot6CP.text = "60"
                    slot7CP.text = "80"
                    slot8CP.text = "80"
                    slot9CP.text = "100"
                    ritualCP.text = "20"
                }
                else if (classSelection == "Witch Hunter") {
                    characterClass = "Witch Hunter"

                    //Witch Hunter CP text
                    //General Skills
                    trapsmithCP.text = "65"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "50"
                    chemistryCP.text = "60"
                    blacksmithingCP.text = "80"
                    artificeCP.text = "90"
                    scrollcraftingCP.text = "45"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "45"
                    florentineCP.text = "70"
                    flurryCP.text = "75"
                    heavyArmorCP.text = "45"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "95"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "50"
                    groupProfLrgCP.text = "100"
                    profExoticCP.text = "130"
                    groupSpecCP.text = "170"
                    specificSpecCP.text = "150"
                    slayParryCP.text = "170"
                    slayParryMstrCP.text = "190"
                    //Rogue Skills
                    garroteCP.text = "65"
                    sapCP.text = "35"
                    vitalBlowCP.text = "65"
                    dodgeCP.text = "130"
                    specificCritCP.text = "130"
                    groupCritCP.text = "150"
                    executeCP.text = "130"
                    executeMstrCP.text = "150"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "60"
                    necroArtsCP.text = "60"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "45"
                    readMagicCP.text = "25"
                    rdAdvMagicCP.text = "35"
                    rdRitualMagicCP.text = "60"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "75"
                    sphere2CP.text = "175"
                    sphere3CP.text = "275"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "30"
                    slot5CP.text = "30"
                    slot6CP.text = "40"
                    slot7CP.text = "50"
                    slot8CP.text = "50"
                    slot9CP.text = "60"
                    ritualCP.text = "20"
                }
                else if (classSelection == "Druid") {
                    characterClass = "Druid"

                    //Druid CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "40"
                    chemistryCP.text = "50"
                    blacksmithingCP.text = "100"
                    artificeCP.text = "110"
                    scrollcraftingCP.text = "45"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "100"
                    heavyArmorCP.text = "60"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "140"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "200"
                    specificSpecCP.text = "180"
                    slayParryCP.text = "200"
                    slayParryMstrCP.text = "220"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "100"
                    dodgeCP.text = "200"
                    specificCritCP.text = "180"
                    groupCritCP.text = "200"
                    executeCP.text = "200"
                    executeMstrCP.text = "220"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "60"
                    necroArtsCP.text = "60"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "50"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }
                else if (classSelection == "Mage") {
                    characterClass = "Mage"

                    //Mage CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "60"
                    chemistryCP.text = "70"
                    blacksmithingCP.text = "110"
                    artificeCP.text = "120"
                    scrollcraftingCP.text = "35"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "125"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "140"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "250"
                    specificSpecCP.text = "230"
                    slayParryCP.text = "250"
                    slayParryMstrCP.text = "270"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "120"
                    dodgeCP.text = "250"
                    specificCritCP.text = "230"
                    groupCritCP.text = "250"
                    executeCP.text = "250"
                    executeMstrCP.text = "270"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "55"
                    necroArtsCP.text = "55"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "40"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "25"
                    sphere2CP.text = "150"
                    sphere3CP.text = "200"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }
                else if (classSelection == "Bard") {
                    characterClass = "Bard"

                    //Bard CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "35"
                    alchemyCP.text = "50"
                    chemistryCP.text = "60"
                    blacksmithingCP.text = "85"
                    artificeCP.text = "95"
                    scrollcraftingCP.text = "35"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "125"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "140"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "250"
                    specificSpecCP.text = "230"
                    slayParryCP.text = "250"
                    slayParryMstrCP.text = "270"
                    //Rogue Skills
                    garroteCP.text = "95"
                    sapCP.text = "40"
                    vitalBlowCP.text = "75"
                    dodgeCP.text = "80"
                    specificCritCP.text = "130"
                    groupCritCP.text = "150"
                    executeCP.text = "150"
                    executeMstrCP.text = "170"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "50"
                    necroArtsCP.text = "55"
                    anatomyCP.text = "35"
                    firstAidCP.text = "55"
                    physicianCP.text = "40"
                    readWriteCP.text = "40"
                    readMagicCP.text = "25"
                    rdAdvMagicCP.text = "35"
                    rdRitualMagicCP.text = "50"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "30"
                    slot5CP.text = "30"
                    slot6CP.text = "40"
                    slot7CP.text = "60"
                    slot8CP.text = "70"
                    slot9CP.text = "80"
                    ritualCP.text = "30"
                }
                if (vocationSelection == "None"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 0
                    favoredFragsInt = 0
                    favoredInt = 0

                    if (classSelection =="Mercenary"){
                        level3Name.text = "Hamstring"
                        level6Name.text = "Headbutt"
                        level9Name.text = "Dismember"
                        level12Name.text = "Razor's Edge"
                    }
                    else if (classSelection == "Ranger"){
                        level3Name.text = "Detoxify"
                        level6Name.text = "Trailblazing"
                        level9Name.text = "Nature's Grasp"
                        level12Name.text = "Call of the Hunt"
                    }
                    else if (classSelection == "Templar"){
                        level3Name.text = "Burn Slot"
                        level6Name.text = "Scroll Harvest"
                        level9Name.text = "Weapon Break"
                        level12Name.text = "Weapon Conduit"
                    }
                    else if (classSelection == "Assassin"){
                        level3Name.text = "Shiv"
                        level6Name.text = "Silent Strike"
                        level9Name.text = "Spirit Sever"
                        level12Name.text = "Penetration"
                    }
                    else if (classSelection == "Nightblade"){
                        level3Name.text = "Feint"
                        level6Name.text = "Duplicate Key"
                        level9Name.text = "Dim"
                        level12Name.text = "Passwall"
                    }
                    else if (classSelection == "Witch Hunter"){
                        level3Name.text = "Witch Mark"
                        level6Name.text = "Twist of the Tongue"
                        level9Name.text = "Karmic Ricochet"
                        level12Name.text = "Counter Magic"
                    }
                    else if (classSelection == "Druid"){
                        level3Name.text = "Create Grove"
                        level6Name.text = "Forest Meld"
                        level9Name.text = "Totem"
                        level12Name.text = "Henge"
                    }
                    else if (classSelection == "Mage"){
                        level3Name.text = "Id. Magic Item"
                        level6Name.text = "Mana Harvest"
                        level9Name.text = "Create Familiar"
                        level12Name.text = "Power Nexus"
                    }
                    else if (classSelection == "Bard"){
                        level3Name.text = "S. of Aversion"
                        level6Name.text = "S. of Love"
                        level9Name.text = "S. of Intermission"
                        level12Name.text = "S. of Heroism"
                    }
                }
                else if (vocationSelection == "Archer") {
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Arrow Dodge"
                    level6Name.text = "Stand and Deliver"
                    level9Name.text = "Maim"
                    level12Name.text = "Death Arrow"
                }
                else if (vocationSelection == "Artisan"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Treasure Hunter"
                    level6Name.text = "Bribe"
                    level9Name.text = "Magnum Opus"
                    level12Name.text = "Vault"
                }
                else if (vocationSelection == "Battle Mage"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Amulet"
                    level6Name.text = "Maximize"
                    level9Name.text = "Twin Spell"
                    level12Name.text = "Wizard Staff"
                }
                else if (vocationSelection == "Brew Master"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Iron Gut"
                    level6Name.text = "Mixologist"
                    level9Name.text = "Firebreathing"
                    level12Name.text = "Drunken Master"
                }
                else if (vocationSelection == "Bounty Hunter"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Mercy"
                    level6Name.text = "Bola"
                    level9Name.text = "Smoke Bomb"
                    level12Name.text = "Impale"
                }
                else if (vocationSelection == "Shaman"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Rite of Weaving"
                    level6Name.text = "Rite of War"
                    level9Name.text = "Rite of Vision"
                    level12Name.text = "Monolith"
                }
                else if (vocationSelection == "Stalwart"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Shield Parry"
                    level6Name.text = "Conviction"
                    level9Name.text = "Fortress"
                    level12Name.text = "Imbue Shield"
                }
                else if (vocationSelection == "Swashbuckler"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Finesse"
                    level6Name.text = "En Garde!"
                    level9Name.text = "Prise de Fer"
                    level12Name.text = "Aegis"
                }
                else if (vocationSelection == "Undead Hunter"){
                    classSpinner.isEnabled = true
                    vocationFragsInt = 150
                    favoredFragsInt = 0
                    favoredInt = 0

                    level3Name.text = "Hunter's Focus"
                    level6Name.text = "Hunter's Attrition"
                    level9Name.text = "Crystal of Light"
                    level12Name.text = "Final Rest"
                }
                else if (vocationSelection == "Dread Knight") {
                    classSpinner.isEnabled = false
                    vocationFragsInt = 0
                    favoredFragsInt = 250
                    favoredInt = 50

                    level3Name.text = "Harbringer's Blade"
                    level6Name.text = "Unholy Ring"
                    level9Name.text = "Unholy Symbol"
                    level12Name.text = "Headpiece"

                    //Paladin CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "90"
                    chemistryCP.text = "100"
                    blacksmithingCP.text = "75"
                    artificeCP.text = "85"
                    scrollcraftingCP.text = "50"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "40"
                    florentineCP.text = "50"
                    flurryCP.text = "45"
                    heavyArmorCP.text = "10"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "50"
                    weapRefocusCP.text = "70"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "110"
                    groupSpecCP.text = "160"
                    specificSpecCP.text = "100"
                    slayParryCP.text = "120"
                    slayParryMstrCP.text = "140"
                    //Rogue Skills
                    garroteCP.text = "140"
                    sapCP.text = "55"
                    vitalBlowCP.text = "70"
                    dodgeCP.text = "170"
                    specificCritCP.text = "140"
                    groupCritCP.text = "180"
                    executeCP.text = "170"
                    executeMstrCP.text = "190"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "40"
                    necroArtsCP.text = "40"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "50"
                    readMagicCP.text = "30"
                    rdAdvMagicCP.text = "50"
                    rdRitualMagicCP.text = "50"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "10"
                    slot2CP.text = "20"
                    slot3CP.text = "40"
                    slot4CP.text = "40"
                    slot5CP.text = "50"
                    slot6CP.text = "60"
                    slot7CP.text = "70"
                    slot8CP.text = "80"
                    slot9CP.text = "100"
                    ritualCP.text = "30"
                }
                else if (vocationSelection == "Paladin") {
                    classSpinner.isEnabled = false
                    vocationFragsInt = 0
                    favoredFragsInt = 250
                    favoredInt = 50

                    level3Name.text = "Defender"
                    level6Name.text = "Holy Ring"
                    level9Name.text = "Holy Symbol"
                    level12Name.text = "Headpiece"

                    //Paladin CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "90"
                    chemistryCP.text = "100"
                    blacksmithingCP.text = "75"
                    artificeCP.text = "85"
                    scrollcraftingCP.text = "50"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "40"
                    florentineCP.text = "50"
                    flurryCP.text = "45"
                    heavyArmorCP.text = "10"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "50"
                    weapRefocusCP.text = "70"
                    groupProfMedCP.text = "40"
                    groupProfLrgCP.text = "70"
                    profExoticCP.text = "110"
                    groupSpecCP.text = "160"
                    specificSpecCP.text = "100"
                    slayParryCP.text = "120"
                    slayParryMstrCP.text = "140"
                    //Rogue Skills
                    garroteCP.text = "140"
                    sapCP.text = "55"
                    vitalBlowCP.text = "70"
                    dodgeCP.text = "170"
                    specificCritCP.text = "140"
                    groupCritCP.text = "180"
                    executeCP.text = "170"
                    executeMstrCP.text = "190"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "40"
                    necroArtsCP.text = "40"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "50"
                    readMagicCP.text = "30"
                    rdAdvMagicCP.text = "50"
                    rdRitualMagicCP.text = "50"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "200"
                    sphere3CP.text = "300"
                    slot1CP.text = "10"
                    slot2CP.text = "20"
                    slot3CP.text = "40"
                    slot4CP.text = "40"
                    slot5CP.text = "50"
                    slot6CP.text = "60"
                    slot7CP.text = "70"
                    slot8CP.text = "80"
                    slot9CP.text = "100"
                    ritualCP.text = "30"
                }
                else if (vocationSelection == "Darkweaver") {
                    classSpinner.isEnabled = false
                    vocationFragsInt = 0
                    favoredFragsInt = 250
                    favoredInt = 50

                    level3Name.text = "Unholy Altar"
                    level6Name.text = "Sacred Bond"
                    level9Name.text = "Sacred Vessel"
                    level12Name.text = "Church"

                    //Paladin CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "70"
                    chemistryCP.text = "80"
                    blacksmithingCP.text = "110"
                    artificeCP.text = "120"
                    scrollcraftingCP.text = "40"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "100"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "100"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "200"
                    specificSpecCP.text = "180"
                    slayParryCP.text = "200"
                    slayParryMstrCP.text = "220"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "100"
                    dodgeCP.text = "200"
                    specificCritCP.text = "180"
                    groupCritCP.text = "200"
                    executeCP.text = "200"
                    executeMstrCP.text = "220"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "45"
                    necroArtsCP.text = "45"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "40"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }
                else if (vocationSelection == "Lightweaver") {
                    classSpinner.isEnabled = false
                    vocationFragsInt = 0
                    favoredFragsInt = 250
                    favoredInt = 50

                    level3Name.text = "Holy Altar"
                    level6Name.text = "Sacred Bond"
                    level9Name.text = "Sacred Vessel"
                    level12Name.text = "Church"

                    //Paladin CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "70"
                    chemistryCP.text = "80"
                    blacksmithingCP.text = "110"
                    artificeCP.text = "120"
                    scrollcraftingCP.text = "40"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "100"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "100"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "200"
                    specificSpecCP.text = "180"
                    slayParryCP.text = "200"
                    slayParryMstrCP.text = "220"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "100"
                    dodgeCP.text = "200"
                    specificCritCP.text = "180"
                    groupCritCP.text = "200"
                    executeCP.text = "200"
                    executeMstrCP.text = "220"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "45"
                    necroArtsCP.text = "45"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "40"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }
                else if (vocationSelection == "Dragon Knight") {
                    classSpinner.isEnabled = false
                    vocationFragsInt = 0
                    favoredFragsInt = 250
                    favoredInt = 50

                    level3Name.text = "Draconic Shrine"
                    level6Name.text = "Draconic Covenant"
                    level9Name.text = "Draconic Trove"
                    level12Name.text = "Temple"

                    //Paladin CP text
                    //General Skills
                    trapsmithCP.text = "85"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "70"
                    chemistryCP.text = "80"
                    blacksmithingCP.text = "110"
                    artificeCP.text = "120"
                    scrollcraftingCP.text = "40"
                    lootingCP.text = "15"
                    //Warrior Skills
                    ambidexterityCP.text = "75"
                    florentineCP.text = "110"
                    flurryCP.text = "100"
                    heavyArmorCP.text = "65"
                    selfMutilateCP.text = "15"
                    shieldCP.text = "100"
                    weapRefocusCP.text = "40"
                    groupProfMedCP.text = "80"
                    groupProfLrgCP.text = "130"
                    profExoticCP.text = "150"
                    groupSpecCP.text = "200"
                    specificSpecCP.text = "180"
                    slayParryCP.text = "200"
                    slayParryMstrCP.text = "220"
                    //Rogue Skills
                    garroteCP.text = "150"
                    sapCP.text = "60"
                    vitalBlowCP.text = "100"
                    dodgeCP.text = "200"
                    specificCritCP.text = "180"
                    groupCritCP.text = "200"
                    executeCP.text = "200"
                    executeMstrCP.text = "220"
                    //Scholar Skills
                    mysticismCP.text = "50"
                    demAngArtsCP.text = "45"
                    necroArtsCP.text = "45"
                    anatomyCP.text = "40"
                    firstAidCP.text = "60"
                    physicianCP.text = "45"
                    readWriteCP.text = "40"
                    readMagicCP.text = "15"
                    rdAdvMagicCP.text = "25"
                    rdRitualMagicCP.text = "40"
                    eleAttuneCP.text = "25"
                    //Spheres and Slots
                    sphere1CP.text = "50"
                    sphere2CP.text = "175"
                    sphere3CP.text = "225"
                    slot1CP.text = "10"
                    slot2CP.text = "10"
                    slot3CP.text = "20"
                    slot4CP.text = "20"
                    slot5CP.text = "30"
                    slot6CP.text = "30"
                    slot7CP.text = "40"
                    slot8CP.text = "40"
                    slot9CP.text = "50"
                    ritualCP.text = "10"
                }

                //CP and Frag Check and Math
                //General Skills
                level3Cost = Integer.parseInt(level3CP.text.toString())
                level3Select = Integer.parseInt(level3Spinner.selectedItem.toString())
                level6Cost = Integer.parseInt(level6CP.text.toString())
                level6Select = Integer.parseInt(level6Spinner.selectedItem.toString())
                level9Cost = Integer.parseInt(level9CP.text.toString())
                level9Select = Integer.parseInt(level9Spinner.selectedItem.toString())
                level12Cost = Integer.parseInt(level12CP.text.toString())
                level12Select = Integer.parseInt(level12Spinner.selectedItem.toString())
                racialCost = Integer.parseInt(racialCP.text.toString())
                racialSelect = Integer.parseInt(racialSpinner.selectedItem.toString())
                trapsmithCost = Integer.parseInt(trapsmithCP.text.toString())
                trapsmithSelect = Integer.parseInt(trapsmithSpinner.selectedItem.toString())
                tradesmanCost = Integer.parseInt(tradesmanCP.text.toString())
                tradesmanSelect = Integer.parseInt(tradesmanSpinner.selectedItem.toString())
                alchemyCost = Integer.parseInt(alchemyCP.text.toString())
                alchemySelect = Integer.parseInt(alchemySpinner.selectedItem.toString())
                chemistryCost = Integer.parseInt(chemistryCP.text.toString())
                chemistrySelect = Integer.parseInt(chemistrySpinner.selectedItem.toString())
                blacksmithingCost = Integer.parseInt(blacksmithingCP.text.toString())
                blacksmithingSelect = Integer.parseInt(blacksmithingSpinner.selectedItem.toString())
                artificeCost = Integer.parseInt(artificeCP.text.toString())
                artificeSelect = Integer.parseInt(artificeSpinner.selectedItem.toString())
                scrollcraftingCost = Integer.parseInt(scrollcraftingCP.text.toString())
                scrollcraftingSelect = Integer.parseInt(scrollcraftingSpinner.selectedItem.toString())
                coldHandsCost = Integer.parseInt(coldHandsCP.text.toString())
                coldHandsFragCost = Integer.parseInt(coldHandsFrags.text.toString())
                coldHandsSelect = Integer.parseInt(coldHandsSpinner.selectedItem.toString())
                createAlcoholCost = Integer.parseInt(createAlcoholCP.text.toString())
                createAlcoholFragCost= Integer.parseInt(createAlcoholFrags.text.toString())
                createAlcoholSelect = Integer.parseInt(createAlcoholSpinner.selectedItem.toString())
                heavyDrinkerCost = Integer.parseInt(heavyDrinkerCP.text.toString())
                heavyDrinkerFragCost = Integer.parseInt(heavyDrinkerFrags.text.toString())
                heavyDrinkerSelect = Integer.parseInt(heavyDrinkerSpinner.selectedItem.toString())
                hindsightCost = Integer.parseInt(hindsightCP.text.toString())
                hindsightFragCost = Integer.parseInt(hindsightFrags.text.toString())
                hindsightSelect = Integer.parseInt(hindsightSpinner.selectedItem.toString())
                intuitionCost = Integer.parseInt(intuitionCP.text.toString())
                intuitionFragCost = Integer.parseInt(intuitionFrags.text.toString())
                intuitionSelect = Integer.parseInt(intuitionSpinner.selectedItem.toString())
                lootingCost = Integer.parseInt(lootingCP.text.toString())
                lootingFragCost = Integer.parseInt(lootingFrags.text.toString())
                lootingSelect = Integer.parseInt(lootingSpinner.selectedItem.toString())
                //Paragon
                possumCost = Integer.parseInt(possumCP.text.toString())
                possumFragCost = Integer.parseInt(possumFrags.text.toString())
                possumSelect = Integer.parseInt(possumSpinner.selectedItem.toString())
                teacherCost = Integer.parseInt(teacherCP.text.toString())
                teacherFragCost = Integer.parseInt(teacherFrags.text.toString())
                teacherSelect = Integer.parseInt(teacherSpinner.selectedItem.toString())
                //Warrior Skills
                ambidexterityCost = Integer.parseInt(ambidexterityCP.text.toString())
                ambidexteritySelect = Integer.parseInt(ambidexteritySpinner.selectedItem.toString())
                florentineCost = Integer.parseInt(florentineCP.text.toString())
                florentineSelect = Integer.parseInt(florentineSpinner.selectedItem.toString())
                flurryCost = Integer.parseInt(flurryCP.text.toString())
                flurrySelect = Integer.parseInt(flurrySpinner.selectedItem.toString())
                heavyArmorCost = Integer.parseInt(heavyArmorCP.text.toString())
                heavyArmorSelect = Integer.parseInt(heavyArmorSpinner.selectedItem.toString())
                shieldCost = Integer.parseInt(shieldCP.text.toString())
                shieldSelect = Integer.parseInt(shieldSpinner.selectedItem.toString())
                selfMutilateCost = Integer.parseInt(selfMutilateCP.text.toString())
                selfMutilateSelect = Integer.parseInt(selfMutilateSpinner.selectedItem.toString())
                weapRefocusCost = Integer.parseInt(weapRefocusCP.text.toString())
                weapRefocusSelect = Integer.parseInt(weapRefocusSpinner.selectedItem.toString())
                groupProfMedCost = Integer.parseInt(groupProfMedCP.text.toString())
                groupProfMedSelect = Integer.parseInt(groupProfMedSpinner.selectedItem.toString())
                groupProfLrgCost = Integer.parseInt(groupProfLrgCP.text.toString())
                groupProfLrgSelect = Integer.parseInt(groupProfLrgSpinner.selectedItem.toString())
                profExoticCost = Integer.parseInt(profExoticCP.text.toString())
                profExoticSelect = Integer.parseInt(profExoticSpinner.selectedItem.toString())
                groupSpecCost = Integer.parseInt(groupSpecCP.text.toString())
                groupSpecSelect = Integer.parseInt(groupSpecSpinner.selectedItem.toString())
                specificSpecCost = Integer.parseInt(specificSpecCP.text.toString())
                specificSpecSelect = Integer.parseInt(specificSpecSpinner.selectedItem.toString())
                slayParryCost = Integer.parseInt(slayParryCP.text.toString())
                slayParrySelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())
                slayParryMstrCost = Integer.parseInt(slayParryMstrCP.text.toString())
                slayParryMstrSelect = Integer.parseInt(slayParryMstrSpinner.selectedItem.toString())
                battlefieldRepairCost = Integer.parseInt(battlefieldRepairCP.text.toString())
                battlefieldRepairFragCost = Integer.parseInt(battlefieldRepairFrags.text.toString())
                battlefieldRepairSelect = Integer.parseInt(battlefieldRepairSpinner.selectedItem.toString())
                crippleCost = Integer.parseInt(crippleCP.text.toString())
                crippleFragCost = Integer.parseInt(crippleFrags.text.toString())
                crippleSelect = Integer.parseInt(crippleSpinner.selectedItem.toString())
                decapitateCost = Integer.parseInt(decapitateCP.text.toString())
                decapitateFragCost = Integer.parseInt(decapitateFrags.text.toString())
                decapitateSelect = Integer.parseInt(decapitateSpinner.selectedItem.toString())
                dirtEyeCost = Integer.parseInt(dirtEyeCP.text.toString())
                dirtEyeFragCost = Integer.parseInt(dirtEyeFrags.text.toString())
                dirtEyeSelect = Integer.parseInt(dirtEyeSpinner.selectedItem.toString())
                tripCost = Integer.parseInt(tripCP.text.toString())
                tripFragCost = Integer.parseInt(tripFrags.text.toString())
                tripSelect = Integer.parseInt(tripSpinner.selectedItem.toString())
                whirlBlowsCost = Integer.parseInt(whirlBlowsCP.text.toString())
                whirlBlowsFragCost = Integer.parseInt(whirlBlowsFrags.text.toString())
                whirlBlowsSelect = Integer.parseInt(whirlBlowsSpinner.selectedItem.toString())
                //Rogue Skills
                garroteCost = Integer.parseInt(garroteCP.text.toString())
                garroteSelect = Integer.parseInt(garroteSpinner.selectedItem.toString())
                sapCost = Integer.parseInt(sapCP.text.toString())
                sapSelect = Integer.parseInt(sapSpinner.selectedItem.toString())
                vitalBlowCost = Integer.parseInt(vitalBlowCP.text.toString())
                vitalBlowSelect = Integer.parseInt(vitalBlowSpinner.selectedItem.toString())
                dodgeCost = Integer.parseInt(dodgeCP.text.toString())
                dodgeSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())
                specificCritCost = Integer.parseInt(specificCritCP.text.toString())
                specificCritSelect = Integer.parseInt(specificCritSpinner.selectedItem.toString())
                groupCritCost = Integer.parseInt(groupCritCP.text.toString())
                groupCritSelect = Integer.parseInt(groupCritSpinner.selectedItem.toString())
                executeCost = Integer.parseInt(executeCP.text.toString())
                executeSelect = Integer.parseInt(executeSpinner.selectedItem.toString())
                executeMstrCost = Integer.parseInt(executeMstrCP.text.toString())
                executeMstrSelect = Integer.parseInt(executeMstrSpinner.selectedItem.toString())
                blindfighterCost = Integer.parseInt(blindfighterCP.text.toString())
                blindfighterFragCost= Integer.parseInt(blindfighterFrags.text.toString())
                blindfighterSelect = Integer.parseInt(blindfighterSpinner.selectedItem.toString())
                escapeCost = Integer.parseInt(escapeCP.text.toString())
                escapeFragCost = Integer.parseInt(escapeFrags.text.toString())
                escapeSelect = Integer.parseInt(escapeSpinner.selectedItem.toString())
                riposteCost = Integer.parseInt(riposteCP.text.toString())
                riposteFragCost = Integer.parseInt(riposteFrags.text.toString())
                riposteSelect = Integer.parseInt(riposteSpinner.selectedItem.toString())
                suckerPunchCost = Integer.parseInt(suckerPunchCP.text.toString())
                suckerPunchFragCost = Integer.parseInt(suckerPunchFrags.text.toString())
                suckerPunchSelect = Integer.parseInt(suckerPunchSpinner.selectedItem.toString())
                thievesCantCost = Integer.parseInt(thievesCantCP.text.toString())
                thievesCantFragCost = Integer.parseInt(thievesCantFrags.text.toString())
                thievesCantSelect = Integer.parseInt(thievesCantSpinner.selectedItem.toString())
                tumbleCost = Integer.parseInt(tumbleCP.text.toString())
                tumbleFragCost = Integer.parseInt(tumbleFrags.text.toString())
                tumbleSelect = Integer.parseInt(tumbleSpinner.selectedItem.toString())
                //Scholar Skills
                mysticismCost = Integer.parseInt(mysticismCP.text.toString())
                mysticismSelect = Integer.parseInt(mysticismSpinner.selectedItem.toString())
                demAngArtsCost = Integer.parseInt(demAngArtsCP.text.toString())
                demAngArtsSelect = Integer.parseInt(demAngArtsSpinner.selectedItem.toString())
                necroArtsCost = Integer.parseInt(necroArtsCP.text.toString())
                necroArtsSelect = Integer.parseInt(necroArtsSpinner.selectedItem.toString())
                anatomyCost = Integer.parseInt(anatomyCP.text.toString())
                anatomySelect = Integer.parseInt(anatomySpinner.selectedItem.toString())
                firstAidCost = Integer.parseInt(firstAidCP.text.toString())
                firstAidSelect = Integer.parseInt(firstAidSpinner.selectedItem.toString())
                physicianCost = Integer.parseInt(physicianCP.text.toString())
                physicianSelect = Integer.parseInt(physicianSpinner.selectedItem.toString())
                readWriteCost = Integer.parseInt(readWriteCP.text.toString())
                readWriteSelect = Integer.parseInt(readWriteSpinner.selectedItem.toString())
                readMagicCost = Integer.parseInt(readMagicCP.text.toString())
                readMagicSelect = Integer.parseInt(readMagicSpinner.selectedItem.toString())
                rdAdvMagicCost = Integer.parseInt(rdAdvMagicCP.text.toString())
                rdAdvMagicSelect = Integer.parseInt(rdAdvMagicSpinner.selectedItem.toString())
                rdRitualMagicCost = Integer.parseInt(rdRitualMagicCP.text.toString())
                rdRitualMagicSelect = Integer.parseInt(rdRitualMagicSpinner.selectedItem.toString())
                eleAttuneCost = Integer.parseInt(eleAttuneCP.text.toString())
                eleAttuneSelect = Integer.parseInt(eleAttuneSpinner.selectedItem.toString())
                combatWizCost = Integer.parseInt(combatWizCP.text.toString())
                combatWizFragCost = Integer.parseInt(combatWizFrags.text.toString())
                combatWizSelect = Integer.parseInt(combatWizSpinner.selectedItem.toString())
                harvestCost = Integer.parseInt(harvestCP.text.toString())
                harvestFragCost = Integer.parseInt(harvestFrags.text.toString())
                harvestSelect = Integer.parseInt(harvestSpinner.selectedItem.toString())
                morticianCost = Integer.parseInt(morticianCP.text.toString())
                morticianFragCost = Integer.parseInt(morticianFrags.text.toString())
                morticianSelect = Integer.parseInt(morticianSpinner.selectedItem.toString())
                refocusCost = Integer.parseInt(refocusCP.text.toString())
                refocusFragCost = Integer.parseInt(refocusFrags.text.toString())
                refocusSelect = Integer.parseInt(refocusSpinner.selectedItem.toString())
                spellParryCost = Integer.parseInt(spellParryCP.text.toString())
                spellParryFragCost = Integer.parseInt(spellParryFrags.text.toString())
                spellParrySelect = Integer.parseInt(spellParrySpinner.selectedItem.toString())
                //Spell Versatility
                spellSwitchCost = Integer.parseInt(spellSwitchCP.text.toString())
                spellSwitchFragCost = Integer.parseInt(spellSwitchFrags.text.toString())
                spellSwitchSelect = Integer.parseInt(spellSwitchSpinner.selectedItem.toString())
                //Spheres and Slots
                //Spheres
                slot1Cost = Integer.parseInt(slot1CP.text.toString())
                slot1Select = Integer.parseInt(slot1Spinner.selectedItem.toString())
                slot2Cost = Integer.parseInt(slot2CP.text.toString())
                slot2Select = Integer.parseInt(slot2Spinner.selectedItem.toString())
                slot3Cost = Integer.parseInt(slot3CP.text.toString())
                slot3Select = Integer.parseInt(slot3Spinner.selectedItem.toString())
                slot4Cost = Integer.parseInt(slot4CP.text.toString())
                slot4Select = Integer.parseInt(slot4Spinner.selectedItem.toString())
                slot5Cost = Integer.parseInt(slot5CP.text.toString())
                slot5Select = Integer.parseInt(slot5Spinner.selectedItem.toString())
                slot6Cost = Integer.parseInt(slot6CP.text.toString())
                slot6Select = Integer.parseInt(slot6Spinner.selectedItem.toString())
                slot7Cost = Integer.parseInt(slot7CP.text.toString())
                slot7Select = Integer.parseInt(slot7Spinner.selectedItem.toString())
                slot8Cost = Integer.parseInt(slot8CP.text.toString())
                slot8Select = Integer.parseInt(slot8Spinner.selectedItem.toString())
                slot9Cost = Integer.parseInt(slot9CP.text.toString())
                slot9Select = Integer.parseInt(slot9Spinner.selectedItem.toString())
                ritualCost = Integer.parseInt(ritualCP.text.toString())
                ritualSelect = Integer.parseInt(ritualSpinner.selectedItem.toString())

                spentCP()  // Cost x Spent For All CP
                calculateSpentCP()

                spentFrags()  // Cost x Spent For All Frags
                calculateFragCost()

                characterSpent.setText("" + characterSpentInt)
                characterFrags.setText("" + characterFragsInt)

            } // Vocation Spinner

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //General Skill Spinners

        //Spinner for Level 3 Skill
        level3Spinner.adapter = skillLevelArrayAdapter
        level3Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level3CP.text.toString())
                val skillSelect = Integer.parseInt(level3Spinner.selectedItem.toString())

                //Math
                level3Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
                println ("characterSpentInt is " + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Spinner for Level 6 Skill
        level6Spinner.adapter = skillLevelArrayAdapter
        level6Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level6CP.text.toString())
                val skillSelect = Integer.parseInt(level6Spinner.selectedItem.toString())

                //Math
                level6Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Level 9 Skill
        level9Spinner.adapter = skillLevelArrayAdapter
        level9Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level9CP.text.toString())
                val skillSelect = Integer.parseInt(level9Spinner.selectedItem.toString())

                //Math
                level9Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Level 12 Skill
        level12Spinner.adapter = skillLevelArrayAdapter
        level12Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level12CP.text.toString())
                val skillSelect = Integer.parseInt(level12Spinner.selectedItem.toString())

                //Math
                level12Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Racial Skill
        racialSpinner.adapter = skillLevelArrayAdapter
        racialSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(racialCP.text.toString())
                val skillSelect = Integer.parseInt(racialSpinner.selectedItem.toString())

                //Math
                racialInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Production Spinners

        //Spinner for Trapsmith Skill
        trapsmithSpinner.adapter = skillLevelArrayAdapter
        trapsmithSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(trapsmithCP.text.toString())
                val skillSelect = Integer.parseInt(trapsmithSpinner.selectedItem.toString())

                //Math
                trapsmithInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Tradesman Skill
        tradesmanSpinner.adapter = skillLevelArrayAdapter
        tradesmanSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(tradesmanCP.text.toString())
                val skillSelect = Integer.parseInt(tradesmanSpinner.selectedItem.toString())

                //Math
                tradesmanInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Alchemy Skill
        alchemySpinner.adapter = skillLevelArrayAdapter
        alchemySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(alchemyCP.text.toString())
                val skillSelect = Integer.parseInt(alchemySpinner.selectedItem.toString())

                //Math
                alchemyInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Chemistry Skill
        chemistrySpinner.adapter = skillLevelArrayAdapter
        chemistrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(chemistryCP.text.toString())
                val skillSelect = Integer.parseInt(chemistrySpinner.selectedItem.toString())

                //Math
                chemistryInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Blacksmithing Skill
        blacksmithingSpinner.adapter = skillLevelArrayAdapter
        blacksmithingSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(blacksmithingCP.text.toString())
                val skillSelect = Integer.parseInt(blacksmithingSpinner.selectedItem.toString())

                //Math
                blacksmithingInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Artifice Skill
        artificeSpinner.adapter = skillLevelArrayAdapter
        artificeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(artificeCP.text.toString())
                val skillSelect = Integer.parseInt(artificeSpinner.selectedItem.toString())

                //Math
                artificeInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Scrollcrafting Skill
        scrollcraftingSpinner.adapter = skillLevelArrayAdapter
        scrollcraftingSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(scrollcraftingCP.text.toString())
                val skillSelect = Integer.parseInt(scrollcraftingSpinner.selectedItem.toString())

                //Math
                scrollcraftingInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //General Frag Skills

        //Spinner for Cold Dead Hands Skill
        coldHandsSpinner.adapter = shortSkillLevelArrayAdapter
        coldHandsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(coldHandsCP.text.toString())
                val fragCost = Integer.parseInt(coldHandsFrags.text.toString())
                val skillSelect = Integer.parseInt(coldHandsSpinner.selectedItem.toString())

                //Math
                coldHandsInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                coldHandsFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Create Alcohol Skill
        createAlcoholSpinner.adapter = skillLevelArrayAdapter
        createAlcoholSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(createAlcoholCP.text.toString())
                val fragCost = Integer.parseInt(createAlcoholFrags.text.toString())
                val skillSelect = Integer.parseInt(createAlcoholSpinner.selectedItem.toString())

                //Math
                createAlcoholInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                createAlcoholFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Heavy Drinker Skill
        heavyDrinkerSpinner.adapter = shortSkillLevelArrayAdapter
        heavyDrinkerSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(heavyDrinkerCP.text.toString())
                val fragCost = Integer.parseInt(heavyDrinkerFrags.text.toString())
                val skillSelect = Integer.parseInt(heavyDrinkerSpinner.selectedItem.toString())

                //Math
                heavyDrinkerInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                heavyDrinkerFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Hindsight Skill
        hindsightSpinner.adapter = shortSkillLevelArrayAdapter
        hindsightSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(hindsightCP.text.toString())
                val fragCost = Integer.parseInt(hindsightFrags.text.toString())
                val skillSelect = Integer.parseInt(hindsightSpinner.selectedItem.toString())

                //Math
                hindsightInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                hindsightFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Intuition Skill
        intuitionSpinner.adapter = shortSkillLevelArrayAdapter
        intuitionSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(intuitionCP.text.toString())
                val fragCost = Integer.parseInt(intuitionFrags.text.toString())
                val skillSelect = Integer.parseInt(intuitionSpinner.selectedItem.toString())

                //Math
                intuitionInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                intuitionFragsInt= fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Looting Skill
        val lootingSkillLevelList = arrayOf("0","1","2","3","4","5")
        val lootingSkillLevelArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, lootingSkillLevelList)
        lootingSpinner.adapter = lootingSkillLevelArrayAdapter
        lootingSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(lootingCP.text.toString())
                val fragCost = Integer.parseInt(lootingFrags.text.toString())
                val skillSelect = Integer.parseInt(lootingSpinner.selectedItem.toString())

                //Math
                lootingInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                lootingFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Paragon Skill
        paragonSpinner.adapter = shortSkillLevelArrayAdapter
        paragonSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Possum Skill
        possumSpinner.adapter = skillLevelArrayAdapter
        possumSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(possumCP.text.toString())
                val fragCost = Integer.parseInt(possumFrags.text.toString())
                val skillSelect = Integer.parseInt(possumSpinner.selectedItem.toString())

                //Math
                possumInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                possumFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Teacher Skill
        teacherSpinner.adapter = skillLevelArrayAdapter
        teacherSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(teacherCP.text.toString())
                val fragCost = Integer.parseInt(teacherFrags.text.toString())
                val skillSelect = Integer.parseInt(teacherSpinner.selectedItem.toString())

                //Math
                teacherInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                teacherFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Warrior Skill Spinners

        //Spinner for Ambidexterity Skill
        ambidexteritySpinner.adapter = shortSkillLevelArrayAdapter
        ambidexteritySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(ambidexterityCP.text.toString())
                val skillSelect = Integer.parseInt(ambidexteritySpinner.selectedItem.toString())

                //Math
                ambidexterityInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Florentine Skill
        florentineSpinner.adapter = shortSkillLevelArrayAdapter
        florentineSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(florentineCP.text.toString())
                val skillSelect = Integer.parseInt(florentineSpinner.selectedItem.toString())

                //Math
                florentineInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Flurry of Blows Skill
        flurrySpinner.adapter = skillLevelArrayAdapter
        flurrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(flurryCP.text.toString())
                val skillSelect = Integer.parseInt(flurrySpinner.selectedItem.toString())

                //Math
                flurryInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Heavy Armor Skill
        heavyArmorSpinner.adapter = shortSkillLevelArrayAdapter
        heavyArmorSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(heavyArmorCP.text.toString())
                val skillSelect = Integer.parseInt(heavyArmorSpinner.selectedItem.toString())

                //Math
                heavyArmorInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Self Mutilate Skill
        selfMutilateSpinner.adapter = shortSkillLevelArrayAdapter
        selfMutilateSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(selfMutilateCP.text.toString())
                val skillSelect = Integer.parseInt(selfMutilateSpinner.selectedItem.toString())

                //Math
                selfMutilateInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Shield Skill
        shieldSpinner.adapter = shortSkillLevelArrayAdapter
        shieldSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(shieldCP.text.toString())
                val skillSelect = Integer.parseInt(shieldSpinner.selectedItem.toString())

                //Math
                shieldInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Weapon Refocus Skill
        weapRefocusSpinner.adapter = skillLevelArrayAdapter
        weapRefocusSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(weapRefocusCP.text.toString())
                val skillSelect = Integer.parseInt(weapRefocusSpinner.selectedItem.toString())

                //Math
                weapRefocusInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Proficiency Medium Skill
        groupProfMedSpinner.adapter = shortSkillLevelArrayAdapter
        groupProfMedSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupProfMedCP.text.toString())
                val skillSelect = Integer.parseInt(groupProfMedSpinner.selectedItem.toString())

                //Math
                groupProfMedInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Proficiency Large Skill
        groupProfLrgSpinner.adapter = shortSkillLevelArrayAdapter
        groupProfLrgSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupProfLrgCP.text.toString())
                val skillSelect = Integer.parseInt(groupProfLrgSpinner.selectedItem.toString())

                //Math
                groupProfLrgInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Proficiency Exotic Skill
        profExoticSpinner.adapter = skillLevelArrayAdapter
        profExoticSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(profExoticCP.text.toString())
                val skillSelect = Integer.parseInt(profExoticSpinner.selectedItem.toString())

                //Math
                profExoticInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Spec +1 Skill
        groupSpecSpinner.adapter = skillLevelArrayAdapter
        groupSpecSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupSpecCP.text.toString())
                val skillSelect = Integer.parseInt(groupSpecSpinner.selectedItem.toString())

                //Math
                groupSpecInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Specific Spec +1 Skill
        specificSpecSpinner.adapter = skillLevelArrayAdapter
        specificSpecSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(specificSpecCP.text.toString())
                val skillSelect = Integer.parseInt(specificSpecSpinner.selectedItem.toString())

                //Math
                specificSpecInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slay/Parry Skill
        slayParrySpinner.adapter = skillLevelArrayAdapter
        slayParrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slayParryCP.text.toString())
                val skillSelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())

                //Math
                slayParryInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slay/Parry Master Skill
        slayParryMstrSpinner.adapter = skillLevelArrayAdapter
        slayParryMstrSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slayParryMstrCP.text.toString())
                val skillSelect = Integer.parseInt(slayParryMstrSpinner.selectedItem.toString())

                //Math
                slayParryMstrInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Warrior Frag Skills

        //Spinner for Battlefield Repair Skill
        battlefieldRepairSpinner.adapter = skillLevelArrayAdapter
        battlefieldRepairSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(battlefieldRepairCP.text.toString())
                val fragCost = Integer.parseInt(battlefieldRepairFrags.text.toString())
                val skillSelect = Integer.parseInt(battlefieldRepairSpinner.selectedItem.toString())

                //Math
                battlefieldRepairInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                battlefieldRepairFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Cripple Skill
        crippleSpinner.adapter = skillLevelArrayAdapter
        crippleSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(crippleCP.text.toString())
                val fragCost = Integer.parseInt(crippleFrags.text.toString())
                val skillSelect = Integer.parseInt(crippleSpinner.selectedItem.toString())

                //Math
                crippleInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                crippleFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Decapitate Skill
        decapitateSpinner.adapter = skillLevelArrayAdapter
        decapitateSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(decapitateCP.text.toString())
                val fragCost = Integer.parseInt(decapitateFrags.text.toString())
                val skillSelect = Integer.parseInt(decapitateSpinner.selectedItem.toString())

                //Math
                decapitateInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                decapitateFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Dirt in the Eye Skill
        dirtEyeSpinner.adapter = skillLevelArrayAdapter
        dirtEyeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(dirtEyeCP.text.toString())
                val fragCost = Integer.parseInt(dirtEyeFrags.text.toString())
                val skillSelect = Integer.parseInt(dirtEyeSpinner.selectedItem.toString())

                //Math
                dirtEyeInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                dirtEyeFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Trip Skill
        tripSpinner.adapter = skillLevelArrayAdapter
        tripSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(tripCP.text.toString())
                val fragCost = Integer.parseInt(tripFrags.text.toString())
                val skillSelect = Integer.parseInt(tripSpinner.selectedItem.toString())

                //Math
                tripInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                tripFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Whirl of Blows Skill
        whirlBlowsSpinner.adapter = skillLevelArrayAdapter
        whirlBlowsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(whirlBlowsCP.text.toString())
                val fragCost = Integer.parseInt(whirlBlowsFrags.text.toString())
                val skillSelect = Integer.parseInt(whirlBlowsSpinner.selectedItem.toString())

                //Math
                whirlBlowsInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                whirlBlowsFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Rogue Skill Spinners

        //Spinner for Garrote Skill
        garroteSpinner.adapter = shortSkillLevelArrayAdapter
        garroteSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(garroteCP.text.toString())
                val skillSelect = Integer.parseInt(garroteSpinner.selectedItem.toString())

                //Math
                garroteInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sap Skill
        sapSpinner.adapter = skillLevelArrayAdapter
        sapSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(sapCP.text.toString())
                val skillSelect = Integer.parseInt(sapSpinner.selectedItem.toString())

                //Math
                sapInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Vital Blow Skill
        vitalBlowSpinner.adapter = skillLevelArrayAdapter
        vitalBlowSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(vitalBlowCP.text.toString())
                val skillSelect = Integer.parseInt(vitalBlowSpinner.selectedItem.toString())

                //Math
                vitalBlowInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Dodge Skill
        dodgeSpinner.adapter = skillLevelArrayAdapter
        dodgeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(dodgeCP.text.toString())
                val skillSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())

                //Math
                dodgeInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Specific Crit +2 Skill
        specificCritSpinner.adapter = skillLevelArrayAdapter
        specificCritSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(specificCritCP.text.toString())
                val skillSelect = Integer.parseInt(specificCritSpinner.selectedItem.toString())

                //Math
                specificCritInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Crit +2 Skill
        groupCritSpinner.adapter = skillLevelArrayAdapter
        groupCritSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupCritCP.text.toString())
                val skillSelect = Integer.parseInt(groupCritSpinner.selectedItem.toString())

                //Math
                groupCritInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Execute Skill
        executeSpinner.adapter = skillLevelArrayAdapter
        executeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(executeCP.text.toString())
                val skillSelect = Integer.parseInt(executeSpinner.selectedItem.toString())

                //Math
                executeInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Execute Master Skill
        executeMstrSpinner.adapter = skillLevelArrayAdapter
        executeMstrSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(executeMstrCP.text.toString())
                val skillSelect = Integer.parseInt(executeMstrSpinner.selectedItem.toString())

                //Math
                executeMstrInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Rogue Frag Skills

        //Spinner for Blindfighter Skill
        blindfighterSpinner.adapter = skillLevelArrayAdapter
        blindfighterSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(blindfighterCP.text.toString())
                val fragCost = Integer.parseInt(blindfighterFrags.text.toString())
                val skillSelect = Integer.parseInt(blindfighterSpinner.selectedItem.toString())

                //Math
                blindfighterInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                blindfighterFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Escape Skill
        escapeSpinner.adapter = skillLevelArrayAdapter
        escapeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(escapeCP.text.toString())
                val fragCost = Integer.parseInt(escapeFrags.text.toString())
                val skillSelect = Integer.parseInt(escapeSpinner.selectedItem.toString())

                //Math
                escapeInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                escapeFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Riposte Skill
        riposteSpinner.adapter = skillLevelArrayAdapter
        riposteSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(riposteCP.text.toString())
                val fragCost = Integer.parseInt(riposteFrags.text.toString())
                val skillSelect = Integer.parseInt(riposteSpinner.selectedItem.toString())

                //Math
                riposteInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                riposteFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sucker Punch Skill
        suckerPunchSpinner.adapter = skillLevelArrayAdapter
        suckerPunchSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(suckerPunchCP.text.toString())
                val fragCost = Integer.parseInt(suckerPunchFrags.text.toString())
                val skillSelect = Integer.parseInt(suckerPunchSpinner.selectedItem.toString())

                //Math
                suckerPunchInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                suckerPunchFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Thieves' Cant Skill
        thievesCantSpinner.adapter = shortSkillLevelArrayAdapter
        thievesCantSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(thievesCantCP.text.toString())
                val fragCost = Integer.parseInt(thievesCantFrags.text.toString())
                val skillSelect = Integer.parseInt(thievesCantSpinner.selectedItem.toString())

                //Math
                thievesCantInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                thievesCantFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Tumble Skill
        tumbleSpinner.adapter = skillLevelArrayAdapter
        tumbleSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(tumbleCP.text.toString())
                val fragCost = Integer.parseInt(tumbleFrags.text.toString())
                val skillSelect = Integer.parseInt(tumbleSpinner.selectedItem.toString())

                //Math
                tumbleInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                tumbleFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Scholar Skill Spinners

        //Spinner for Mysticism Skill
        mysticismSpinner.adapter = skillLevelArrayAdapter
        mysticismSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(mysticismCP.text.toString())
                val skillSelect = Integer.parseInt(mysticismSpinner.selectedItem.toString())

                //Math
                mysticismInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Demonic/Angelic Arts Skill
        demAngArtsSpinner.adapter = shortSkillLevelArrayAdapter
        demAngArtsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(demAngArtsCP.text.toString())
                val skillSelect = Integer.parseInt(demAngArtsSpinner.selectedItem.toString())

                //Math
                demAngArtsInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Necromantic Arts Skill
        necroArtsSpinner.adapter = shortSkillLevelArrayAdapter
        necroArtsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(necroArtsCP.text.toString())
                val skillSelect = Integer.parseInt(necroArtsSpinner.selectedItem.toString())

                //Math
                necroArtsInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Anatomy Skill
        anatomySpinner.adapter = shortSkillLevelArrayAdapter
        anatomySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(anatomyCP.text.toString())
                val skillSelect = Integer.parseInt(anatomySpinner.selectedItem.toString())

                //Math
                anatomyInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for First Aid Skill
        firstAidSpinner.adapter = shortSkillLevelArrayAdapter
        firstAidSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(firstAidCP.text.toString())
                val skillSelect = Integer.parseInt(firstAidSpinner.selectedItem.toString())

                //Math
                firstAidInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Physician Skill
        physicianSpinner.adapter = skillLevelArrayAdapter
        physicianSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(physicianCP.text.toString())
                val skillSelect = Integer.parseInt(physicianSpinner.selectedItem.toString())

                //Math
                physicianInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read/Write Skill
        readWriteSpinner.adapter = shortSkillLevelArrayAdapter
        readWriteSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(readWriteCP.text.toString())
                val skillSelect = Integer.parseInt(readWriteSpinner.selectedItem.toString())

                //Math
                readWriteInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read Magic Skill
        readMagicSpinner.adapter = shortSkillLevelArrayAdapter
        readMagicSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(readMagicCP.text.toString())
                val skillSelect = Integer.parseInt(readMagicSpinner.selectedItem.toString())

                //Math
                readMagicInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read Advanced Magic Skill
        rdAdvMagicSpinner.adapter = shortSkillLevelArrayAdapter
        rdAdvMagicSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(rdAdvMagicCP.text.toString())
                val skillSelect = Integer.parseInt(rdAdvMagicSpinner.selectedItem.toString())

                //Math
                rdAdvMagicInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read Ritual Magic Skill
        rdRitualMagicSpinner.adapter = shortSkillLevelArrayAdapter
        rdRitualMagicSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(rdRitualMagicCP.text.toString())
                val skillSelect = Integer.parseInt(rdRitualMagicSpinner.selectedItem.toString())

                //Math
                rdRitualMagicInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Elemental Attunement Skill
        val eleSkillLevelList = arrayOf("0","1","2","3")
        val eleSkillLevelArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, eleSkillLevelList)
        eleAttuneSpinner.adapter = eleSkillLevelArrayAdapter
        eleAttuneSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(eleAttuneCP.text.toString())
                val skillSelect = Integer.parseInt(eleAttuneSpinner.selectedItem.toString())

                //Math
                eleAttuneInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Scholar Frag Skills

        //Spinner for Combat Wizardry Skill
        combatWizSpinner.adapter = shortSkillLevelArrayAdapter
        combatWizSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(combatWizCP.text.toString())
                val fragCost = Integer.parseInt(combatWizFrags.text.toString())
                val skillSelect = Integer.parseInt(combatWizSpinner.selectedItem.toString())

                //Math
                combatWizInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                combatWizFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Harvest Skill
        harvestSpinner.adapter = skillLevelArrayAdapter
        harvestSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(harvestCP.text.toString())
                val fragCost = Integer.parseInt(harvestFrags.text.toString())
                val skillSelect = Integer.parseInt(harvestSpinner.selectedItem.toString())

                //Math
                harvestInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                harvestFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Mortician Skill
        morticianSpinner.adapter = shortSkillLevelArrayAdapter
        morticianSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(morticianCP.text.toString())
                val fragCost = Integer.parseInt(morticianFrags.text.toString())
                val skillSelect = Integer.parseInt(morticianSpinner.selectedItem.toString())

                //Math
                morticianInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                morticianFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Refocus Skill
        refocusSpinner.adapter = skillLevelArrayAdapter
        refocusSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(refocusCP.text.toString())
                val fragCost = Integer.parseInt(refocusFrags.text.toString())
                val skillSelect = Integer.parseInt(refocusSpinner.selectedItem.toString())

                //Math
                refocusInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                refocusFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Parry Skill
        spellParrySpinner.adapter = shortSkillLevelArrayAdapter
        spellParrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(spellParryCP.text.toString())
                val fragCost = Integer.parseInt(spellParryFrags.text.toString())
                val skillSelect = Integer.parseInt(spellParrySpinner.selectedItem.toString())

                //Math
                spellParryInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                spellParryFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill
        spellVersSpinner.adapter = skillLevelArrayAdapter
        spellVersSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Switch Skill
        spellSwitchSpinner.adapter = skillLevelArrayAdapter
        spellSwitchSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(spellSwitchCP.text.toString())
                val fragCost = Integer.parseInt(spellSwitchFrags.text.toString())
                val skillSelect = Integer.parseInt(spellSwitchSpinner.selectedItem.toString())

                //Math
                spellSwitchInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)

                spellSwitchFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Magic Spheres and Slots Spinners

        //Sphere Spinners

        //Spinner for Sphere 1 Skill
        sphere1Spinner.adapter = sphereArrayAdapter
        sphere1Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sphere 2 Skill
        sphere2Spinner.adapter = sphereArrayAdapter
        sphere2Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sphere 3 Skill
        sphere3Spinner.adapter = sphereArrayAdapter
        sphere3Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Slot Spinners

        //Spinner for Slot 1 Skill
        slot1Spinner.adapter = skillLevelArrayAdapter
        slot1Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot1CP.text.toString())
                val skillSelect = Integer.parseInt(slot1Spinner.selectedItem.toString())

                //Math
                slot1Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 2 Skill
        slot2Spinner.adapter = skillLevelArrayAdapter
        slot2Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot2CP.text.toString())
                val skillSelect = Integer.parseInt(slot2Spinner.selectedItem.toString())

                //Math
                slot2Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 3 Skill
        slot3Spinner.adapter = skillLevelArrayAdapter
        slot3Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot3CP.text.toString())
                val skillSelect = Integer.parseInt(slot3Spinner.selectedItem.toString())

                //Math
                slot3Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 4 Skill
        slot4Spinner.adapter = skillLevelArrayAdapter
        slot4Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot4CP.text.toString())
                val skillSelect = Integer.parseInt(slot4Spinner.selectedItem.toString())

                //Math
                slot4Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 5 Skill
        slot5Spinner.adapter = skillLevelArrayAdapter
        slot5Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot5CP.text.toString())
                val skillSelect = Integer.parseInt(slot5Spinner.selectedItem.toString())

                //Math
                slot5Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 6 Skill
        slot6Spinner.adapter = skillLevelArrayAdapter
        slot6Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot6CP.text.toString())
                val skillSelect = Integer.parseInt(slot6Spinner.selectedItem.toString())

                //Math
                slot6Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 7 Skill
        slot7Spinner.adapter = skillLevelArrayAdapter
        slot7Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot7CP.text.toString())
                val skillSelect = Integer.parseInt(slot7Spinner.selectedItem.toString())

                //Math
                slot7Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 8 Skill
        slot8Spinner.adapter = skillLevelArrayAdapter
        slot8Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot8CP.text.toString())
                val skillSelect = Integer.parseInt(slot8Spinner.selectedItem.toString())

                //Math
                slot8Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 9 Skill
        slot9Spinner.adapter = skillLevelArrayAdapter
        slot9Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot9CP.text.toString())
                val skillSelect = Integer.parseInt(slot9Spinner.selectedItem.toString())

                //Math
                slot9Int = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Ritual Slot Skill
        ritualSpinner.adapter = skillLevelArrayAdapter
        ritualSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(ritualCP.text.toString())
                val skillSelect = Integer.parseInt(ritualSpinner.selectedItem.toString())

                //Math
                ritualInt = cpCost * skillSelect
                calculateSpentCP()
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }



    }// override fun onCreate

    // Cost x Spent For All CP
    fun spentCP (){
        //Math
        level3Int = level3Cost * level3Select
        level6Int = level6Cost * level6Select
        level9Int = level9Cost * level9Select
        level12Int = level12Cost * level12Select
        racialInt = racialCost * racialSelect
        trapsmithInt = trapsmithCost * trapsmithSelect
        tradesmanInt = tradesmanCost * tradesmanSelect
        alchemyInt = alchemyCost * alchemySelect
        chemistryInt = chemistryCost * chemistrySelect
        blacksmithingInt = blacksmithingCost * blacksmithingSelect
        artificeInt = artificeCost * artificeSelect
        scrollcraftingInt = scrollcraftingCost * scrollcraftingSelect
        coldHandsInt = coldHandsCost * coldHandsSelect
        createAlcoholInt = createAlcoholCost * createAlcoholSelect
        heavyDrinkerInt = heavyDrinkerCost * heavyDrinkerSelect
        hindsightInt = hindsightCost * hindsightSelect
        intuitionInt = intuitionCost * intuitionSelect
        lootingInt = lootingCost * lootingSelect
        //Paragon
        possumInt = possumCost * possumSelect
        teacherInt = teacherCost * teacherSelect
        //Warrior Skills
        ambidexterityInt = ambidexterityCost * ambidexteritySelect
        florentineInt = florentineCost * florentineSelect
        flurryInt = flurryCost * flurrySelect
        heavyArmorInt = heavyArmorCost * heavyArmorSelect
        selfMutilateInt = selfMutilateCost * selfMutilateSelect
        shieldInt = shieldCost * shieldSelect
        weapRefocusInt = weapRefocusCost * weapRefocusSelect
        groupProfMedInt = groupProfMedCost * groupProfMedSelect
        groupProfLrgInt = groupProfLrgCost * groupProfLrgSelect
        profExoticInt = profExoticCost * profExoticSelect
        groupSpecInt = groupSpecCost * groupSpecSelect
        specificSpecInt = specificSpecCost * specificSpecSelect
        slayParryInt = slayParryCost * slayParrySelect
        slayParryMstrInt = slayParryMstrCost * slayParryMstrSelect
        battlefieldRepairInt = battlefieldRepairCost * battlefieldRepairSelect
        crippleInt = crippleCost * crippleSelect
        decapitateInt = decapitateCost * decapitateSelect
        dirtEyeInt = dirtEyeCost * dirtEyeSelect
        tripInt = tripCost * tripSelect
        whirlBlowsInt = whirlBlowsCost * whirlBlowsSelect
        //Rogue Skills
        garroteInt = garroteCost * garroteSelect
        sapInt = sapCost * sapSelect
        vitalBlowInt = vitalBlowCost * vitalBlowSelect
        dodgeInt = dodgeCost * dodgeSelect
        specificCritInt = specificCritCost * specificCritSelect
        groupCritInt = groupCritCost * groupCritSelect
        executeInt = executeCost * executeSelect
        executeMstrInt = executeMstrCost * executeMstrSelect
        blindfighterInt = blindfighterCost * blindfighterSelect
        escapeInt = escapeCost * escapeSelect
        riposteInt = riposteCost * riposteSelect
        suckerPunchInt = suckerPunchCost * suckerPunchSelect
        thievesCantInt = thievesCantCost * thievesCantSelect
        tumbleInt = tumbleCost * tumbleSelect
        //Scholar Skills
        mysticismInt = mysticismCost * mysticismSelect
        demAngArtsInt = demAngArtsCost * demAngArtsSelect
        necroArtsInt = necroArtsCost * necroArtsSelect
        anatomyInt = anatomyCost * anatomySelect
        firstAidInt = firstAidCost * firstAidSelect
        physicianInt = physicianCost * physicianSelect
        readWriteInt = readWriteCost * readWriteSelect
        readMagicInt = readMagicCost * readMagicSelect
        rdAdvMagicInt = rdAdvMagicCost * rdAdvMagicSelect
        rdRitualMagicInt = rdRitualMagicCost * rdRitualMagicSelect
        eleAttuneInt = eleAttuneCost * eleAttuneSelect
        combatWizInt = combatWizCost * combatWizSelect
        harvestInt = harvestCost * harvestSelect
        morticianInt = morticianCost * morticianSelect
        refocusInt = refocusCost * refocusSelect
        spellParryInt = spellParryCost * spellParrySelect
        //Spell Versatility
        spellSwitchInt = spellSwitchCost * spellSwitchSelect
        //Spheres and Slots
        //Spheres
        slot1Int = slot1Cost * slot1Select
        slot2Int = slot2Cost * slot2Select
        slot3Int = slot3Cost * slot3Select
        slot4Int = slot4Cost * slot4Select
        slot5Int = slot5Cost * slot5Select
        slot6Int = slot6Cost * slot6Select
        slot7Int = slot7Cost * slot7Select
        slot8Int = slot8Cost * slot8Select
        slot9Int = slot9Cost * slot9Select
        ritualInt = ritualCost * ritualSelect
    } //fun spentCP

    fun calculateSpentCP() {
        characterSpentInt = favoredInt + level3Int + level6Int + level9Int + level12Int + racialInt + trapsmithInt + tradesmanInt + alchemyInt + chemistryInt + blacksmithingInt + artificeInt + scrollcraftingInt + coldHandsInt + createAlcoholInt + heavyDrinkerInt + hindsightInt + intuitionInt + lootingInt + possumInt + teacherInt + ambidexterityInt + florentineInt + flurryInt + heavyArmorInt + selfMutilateInt + shieldInt + weapRefocusInt + groupProfMedInt + groupProfLrgInt + profExoticInt + groupSpecInt + specificSpecInt + slayParryInt + slayParryMstrInt + battlefieldRepairInt + crippleInt + decapitateInt + dirtEyeInt + tripInt + whirlBlowsInt + garroteInt + sapInt + vitalBlowInt + dodgeInt + specificCritInt + groupCritInt + executeInt + executeMstrInt + blindfighterInt + escapeInt + riposteInt + suckerPunchInt + thievesCantInt + tumbleInt + mysticismInt + demAngArtsInt + necroArtsInt + anatomyInt + firstAidInt + physicianInt + readWriteInt + readMagicInt + rdAdvMagicInt + rdRitualMagicInt + eleAttuneInt + combatWizInt + harvestInt + morticianInt + refocusInt + spellParryInt + spellSwitchInt + slot1Int + slot2Int + slot3Int + slot4Int + slot5Int + slot6Int + slot7Int + slot8Int + slot9Int + ritualInt
        println ("characterSpentInt in fun calculateSpentCP is $characterSpentInt")
    }

    // Cost x Spent For All Frags
    fun spentFrags() {

        coldHandsFragsInt = coldHandsFragCost * coldHandsSelect
        createAlcoholFragsInt = createAlcoholFragCost * createAlcoholSelect
        heavyDrinkerFragsInt = heavyDrinkerFragCost * heavyDrinkerSelect
        hindsightFragsInt = hindsightFragCost * hindsightSelect
        intuitionFragsInt = intuitionFragCost * intuitionSelect
        lootingFragsInt = lootingFragCost * lootingSelect
        //Paragon
        possumFragsInt = possumFragCost * possumSelect
        teacherFragsInt = teacherFragCost * teacherSelect

        battlefieldRepairFragsInt = battlefieldRepairFragCost * battlefieldRepairSelect
        crippleFragsInt = crippleFragCost * crippleSelect
        decapitateFragsInt = decapitateFragCost * decapitateSelect
        dirtEyeFragsInt = dirtEyeFragCost * dirtEyeSelect
        tripFragsInt = tripFragCost * tripSelect
        whirlBlowsFragsInt = whirlBlowsFragCost * whirlBlowsSelect

        combatWizFragsInt = combatWizFragCost * combatWizSelect
        harvestFragsInt = harvestFragCost * harvestSelect
        morticianFragsInt = morticianFragCost * morticianSelect
        refocusFragsInt = refocusFragCost * refocusSelect
        spellParryFragsInt = spellParryFragCost * spellParrySelect
        //Spell Versatility
        spellSwitchFragsInt = spellSwitchFragCost * spellSwitchSelect
    }

    fun calculateFragCost() {
        characterFragsInt = cultureFragsInt + raceFragsInt + vocationFragsInt + favoredFragsInt + coldHandsFragsInt + createAlcoholFragsInt + heavyDrinkerFragsInt + hindsightFragsInt + intuitionFragsInt + lootingFragsInt + possumFragsInt + teacherFragsInt + battlefieldRepairInt + crippleInt + decapitateInt + dirtEyeInt + tripInt + whirlBlowsInt + blindfighterInt + escapeInt + riposteInt + suckerPunchInt + thievesCantInt + tumbleInt + combatWizInt + harvestInt + morticianInt + refocusInt + spellParryInt + spellSwitchInt
        println ("characterFragsInt in fun calculateFragCost is $characterFragsInt")
    }

}// class:MainActivity
