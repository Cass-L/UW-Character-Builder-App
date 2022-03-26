package uwbuilder.underworld.characterbuilder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import uwbuilder.underworld.characterbuilder.R.*

//Other Value Calls
var characterRace = "Choose a race"
var characterClass = "Choose a class"
var characterVocation = "Choose a vocation"

//Int Value calls
var levelInt: Int = 1
var hpInt: Int = 0
var blanketsInt: Int = 0
var cpInt: Int = 150
var freeInt: Int = 0
var spentInt: Int = 0
var characterSpentInt = 0
var fragsInt: Int = 0
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
var allowedRacial: Int = 1
var bodyInt: Int = 0
var bodyHP: Int = 0
var strengthInt: Int = 0
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
var paragonInt: Int = 0
var possumInt: Int = 0
var teacherInt: Int = 0

var coldHandsFragsInt: Int = 0
var createAlcoholFragsInt: Int = 0
var heavyDrinkerFragsInt: Int = 0
var hindsightFragsInt: Int = 0
var intuitionFragsInt: Int = 0
var lootingFragsInt: Int = 0
var paragonFragsInt: Int = 0
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
var spellVersInt: Int = 0
var spellVers1Int: Int = 0
var spellVers2Int: Int = 0
var spellVers3Int: Int = 0
var spellVers4Int: Int = 0
var spellVers5Int: Int = 0
var spellVers6Int: Int = 0
var spellVers7Int: Int = 0
var spellVers8Int: Int = 0
var spellVers9Int: Int = 0
var spellVers10Int: Int = 0

var combatWizFragsInt: Int = 0
var harvestFragsInt: Int = 0
var morticianFragsInt: Int = 0
var refocusFragsInt: Int = 0
var spellParryFragsInt: Int = 0
var spellSwitchFragsInt: Int = 0
var spellVersFragsInt: Int = 0
var spellVersFrags1Int: Int = 0
var spellVersFrags2Int: Int = 0
var spellVersFrags3Int: Int = 0
var spellVersFrags4Int: Int = 0
var spellVersFrags5Int: Int = 0
var spellVersFrags6Int: Int = 0
var spellVersFrags7Int: Int = 0
var spellVersFrags8Int: Int = 0
var spellVersFrags9Int: Int = 0
var spellVersFrags10Int: Int = 0

//Magic Skill Int
var sphere1Int: Int = 0
var sphere2Int: Int = 0
var sphere3Int: Int = 0
var sphere1FragsInt: Int = 0
var sphere2FragsInt: Int = 0
var sphere3FragsInt: Int = 0
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
var bodyCost = 0
var bodySelect = 0
var strengthCost = 0
var strengthSelect = 0
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
var paragonCost = 0
var paragonSelect = 0
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
var paragonFragCost = 0
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
var sphere1Cost: Int = 0
var sphere1FragCost: Int = 0
var sphereSelect1 = ""
var sphere1Select = 0
var sphere2Cost: Int = 0
var sphere2FragCost: Int = 0
var sphereSelect2 = ""
var sphere2Select = 0
var sphere3Cost: Int = 0
var sphere3FragCost: Int = 0
var sphereSelect3 = ""
var sphere3Select = 0
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
        setContentView(layout.activity_main)

        //Text View IDs
//Top Section
        val fragText = findViewById<TextView>(id.fragText)
        val cultureText = findViewById<TextView>(id.cultureText)
        val vocationText = findViewById<TextView>(id.vocationText)
        var characterLevel = findViewById<EditText>(id.levelNumEntry)
        var characterHP = findViewById<EditText>(id.hpNumEntry)
        var characterBlankets = findViewById<EditText>(id.blanketsNumEntry)
        var characterCP = findViewById<EditText>(id.cpNumEntry)
        var characterFree = findViewById<EditText>(id.freeNumEntry)
        var characterSpent = findViewById<EditText>(id.spentNumEntry)
        var characterFrags = findViewById<EditText>(id.fragsNumEntry)
//General Skills
        val level3Name = findViewById<TextView>(id.level3Name)
        val level3CP = findViewById<TextView>(id.level3CP)
        val level6Name = findViewById<TextView>(id.level6Name)
        val level6CP = findViewById<TextView>(id.level6CP)
        val level9Name = findViewById<TextView>(id.level9Name)
        val level9CP = findViewById<TextView>(id.level9CP)
        val level12Name = findViewById<TextView>(id.level12Name)
        val level12CP = findViewById<TextView>(id.level12CP)
        val racialName = findViewById<TextView>(id.racialName)
        val racialCP = findViewById<TextView>(id.racialCP)
        val bodyText = findViewById<TextView>(id.bodyText)
        val bodyCP = findViewById<TextView>(id.bodyCP)
        val strengthText = findViewById<TextView>(id.strengthText)
        val strengthCP = findViewById<TextView>(id.strengthCP)
        val trapsmithCP = findViewById<TextView>(id.trapsmithCP)
        val tradesmanCP = findViewById<TextView>(id.tradesmanCP)
        val alchemyCP = findViewById<TextView>(id.alchemyCP)
        val chemistryCP = findViewById<TextView>(id.chemistryCP)
        val blacksmithingCP = findViewById<TextView>(id.blacksmithingCP)
        val artificeCP = findViewById<TextView>(id.artificeCP)
        val scrollcraftingCP = findViewById<TextView>(id.scrollcraftingCP)
        val coldHandsCP = findViewById<TextView>(id.coldHandsCP)
        val createAlcoholCP = findViewById<TextView>(id.createAlcoholCP)
        val heavyDrinkerCP = findViewById<TextView>(id.heavyDrinkerCP)
        val hindsightCP = findViewById<TextView>(id.hindsightCP)
        val intuitionCP = findViewById<TextView>(id.intuitionCP)
        val lootingCP = findViewById<TextView>(id.lootingCP)
        val paragonSlotText = findViewById<TextView>(id.paragonSlotText)
        val paragonCP = findViewById<TextView>(id.paragonCP)
        val possumCP = findViewById<TextView>(id.possumCP)
        val teacherCP = findViewById<TextView>(id.teacherCP)

        val coldHandsFrags = findViewById<TextView>(id.coldHandsFrags)
        val createAlcoholFrags = findViewById<TextView>(id.createAlcoholFrags)
        val heavyDrinkerFrags = findViewById<TextView>(id.heavyDrinkerFrags)
        val hindsightFrags = findViewById<TextView>(id.hindsightFrags)
        val intuitionFrags = findViewById<TextView>(id.intuitionFrags)
        val lootingFrags = findViewById<TextView>(id.lootingFrags)
        val paragonFrags = findViewById<TextView>(id.paragonFrags)
        val possumFrags = findViewById<TextView>(id.possumFrags)
        val teacherFrags = findViewById<TextView>(id.teacherFrags)
//Warrior Skills
        val ambidexterityCP = findViewById<TextView>(id.ambidexterityCP)
        val florentineCP = findViewById<TextView>(id.florentineCP)
        val flurryCP = findViewById<TextView>(id.flurryCP)
        val heavyArmorCP = findViewById<TextView>(id.heavyArmorCP)
        val selfMutilateCP = findViewById<TextView>(id.selfMutilateCP)
        val shieldCP = findViewById<TextView>(id.shieldCP)
        val weapRefocusCP = findViewById<TextView>(id.weapRefocusCP)
        val groupProfMedCP = findViewById<TextView>(id.groupProfMedCP)
        val groupProfLrgCP = findViewById<TextView>(id.groupProfLrgCP)
        val profExoticCP = findViewById<TextView>(id.profExoticCP)
        val groupSpecCP = findViewById<TextView>(id.groupSpecCP)
        val specificSpecCP = findViewById<TextView>(id.specificSpecCP)
        val slayParryCP = findViewById<TextView>(id.slayParryCP)
        val slayParryMstrCP = findViewById<TextView>(id.slayParryMstrCP)
        val battlefieldRepairCP = findViewById<TextView>(id.battlefieldRepairCP)
        val crippleCP = findViewById<TextView>(id.crippleCP)
        val decapitateCP = findViewById<TextView>(id.decapitateCP)
        val dirtEyeCP = findViewById<TextView>(id.dirtEyeCP)
        val tripCP = findViewById<TextView>(id.tripCP)
        val whirlBlowsCP = findViewById<TextView>(id.whirlBlowsCP)

        val battlefieldRepairFrags = findViewById<TextView>(id.battlefieldRepairFrags)
        val crippleFrags = findViewById<TextView>(id.crippleFrags)
        val decapitateFrags = findViewById<TextView>(id.decapitateFrags)
        val dirtEyeFrags = findViewById<TextView>(id.dirtEyeFrags)
        val tripFrags = findViewById<TextView>(id.tripFrags)
        val whirlBlowsFrags = findViewById<TextView>(id.whirlBlowsFrags)

//Rogue Skills
        val garroteCP = findViewById<TextView>(id.garroteCP)
        val sapCP = findViewById<TextView>(id.sapCP)
        val vitalBlowCP = findViewById<TextView>(id.vitalBlowCP)
        val dodgeCP = findViewById<TextView>(id.dodgeCP)
        val specificCritCP = findViewById<TextView>(id.specificCritCP)
        val groupCritCP = findViewById<TextView>(id.groupCritCP)
        val executeCP = findViewById<TextView>(id.executeCP)
        val executeMstrCP = findViewById<TextView>(id.executeMstrCP)
        val blindfighterCP = findViewById<TextView>(id.blindfighterCP)
        val escapeCP = findViewById<TextView>(id.escapeCP)
        val riposteCP = findViewById<TextView>(id.riposteCP)
        val suckerPunchCP = findViewById<TextView>(id.suckerPunchCP)
        val thievesCantCP = findViewById<TextView>(id.thievesCantCP)
        val tumbleCP = findViewById<TextView>(id.tumbleCP)

        val blindfighterFrags = findViewById<TextView>(id.blindfighterFrags)
        val escapeFrags = findViewById<TextView>(id.escapeFrags)
        val riposteFrags = findViewById<TextView>(id.riposteFrags)
        val suckerPunchFrags = findViewById<TextView>(id.suckerPunchFrags)
        val thievesCantFrags = findViewById<TextView>(id.thievesCantFrags)
        val tumbleFrags = findViewById<TextView>(id.tumbleFrags)

//Scholar Skills
        val mysticismCP = findViewById<TextView>(id.mysticismCP)
        val demAngArtsCP = findViewById<TextView>(id.demAngArtsCP)
        val necroArtsCP = findViewById<TextView>(id.necroArtsCP)
        val anatomyCP = findViewById<TextView>(id.anatomyCP)
        val firstAidCP = findViewById<TextView>(id.firstAidCP)
        val physicianCP = findViewById<TextView>(id.physicianCP)
        val readWriteCP = findViewById<TextView>(id.readWriteCP)
        val readMagicCP = findViewById<TextView>(id.readMagicCP)
        val rdAdvMagicCP = findViewById<TextView>(id.rdAdvMagicCP)
        val rdRitualMagicCP = findViewById<TextView>(id.rdRitualMagicCP)
        val eleAttuneCP = findViewById<TextView>(id.eleAttuneCP)
        val combatWizCP = findViewById<TextView>(id.combatWizCP)
        val harvestCP = findViewById<TextView>(id.harvestCP)
        val morticianCP = findViewById<TextView>(id.morticianCP)
        val refocusCP = findViewById<TextView>(id.refocusCP)
        val spellParryCP = findViewById<TextView>(id.spellParryCP)
        val spellVersCP = findViewById<TextView>(id.spellVersCP)
        val spellSwitchCP = findViewById<TextView>(id.spellSwitchCP)

        val combatWizFrags = findViewById<TextView>(id.combatWizFrags)
        val harvestFrags = findViewById<TextView>(id.harvestFrags)
        val morticianFrags = findViewById<TextView>(id.morticianFrags)
        val refocusFrags = findViewById<TextView>(id.refocusFrags)
        val spellParryFrags = findViewById<TextView>(id.spellParryFrags)
        val spellSwitchFrags = findViewById<TextView>(id.spellSwitchFrags)
        val spellVersSlot1 = findViewById<TextView>(id.spellVersSlot1)
        val spellVersSlot2 = findViewById<TextView>(id.spellVersSlot2)
        val spellVersSlot3 = findViewById<TextView>(id.spellVersSlot3)
        val spellVersSlot4 = findViewById<TextView>(id.spellVersSlot4)
        val spellVersSlot5 = findViewById<TextView>(id.spellVersSlot5)
        val spellVersSlot6 = findViewById<TextView>(id.spellVersSlot6)
        val spellVersSlot7 = findViewById<TextView>(id.spellVersSlot7)
        val spellVersSlot8 = findViewById<TextView>(id.spellVersSlot8)
        val spellVersSlot9 = findViewById<TextView>(id.spellVersSlot9)
        val spellVersSlot10 = findViewById<TextView>(id.spellVersSlot10)

//Spheres and Slots
        val sphere1CP = findViewById<TextView>(id.sphere1CP)
        val sphere2CP = findViewById<TextView>(id.sphere2CP)
        val sphere3CP = findViewById<TextView>(id.sphere3CP)
        val slot1CP = findViewById<TextView>(id.slot1CP)
        val slot2CP = findViewById<TextView>(id.slot2CP)
        val slot3CP = findViewById<TextView>(id.slot3CP)
        val slot4CP = findViewById<TextView>(id.slot4CP)
        val slot5CP = findViewById<TextView>(id.slot5CP)
        val slot6CP = findViewById<TextView>(id.slot6CP)
        val slot7CP = findViewById<TextView>(id.slot7CP)
        val slot8CP = findViewById<TextView>(id.slot8CP)
        val slot9CP = findViewById<TextView>(id.slot9CP)
        val ritualCP = findViewById<TextView>(id.ritualCP)

//Button and Spinner View Id
//Top Section
        val resetButton = findViewById<Button>(id.resetButton)
        val raceSpinner = findViewById<Spinner>(id.raceSpinner)
        val fragSpinner = findViewById<Spinner>(id.fragSpinner)
        val cultureCheck: CheckBox = findViewById(id.cultureCheck)
        val classSpinner = findViewById<Spinner>(id.classSpinner)
        val vocationSpinner = findViewById<Spinner>(id.vocationSpinner)

        val zeroBuyList = arrayOf("0")
        val zeroBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, zeroBuyList)
        val oneBuyList = arrayOf("0","1")
        val oneBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, oneBuyList)
        val twoBuyList = arrayOf("0","1","2")
        val twoBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, twoBuyList)
        val threeBuyList = arrayOf("0","1","2","3")
        val threeBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, threeBuyList)
        val fourBuyList = arrayOf("0","1","2","3","4")
        val fourBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, fourBuyList)
        val fiveBuyList = arrayOf("0","1","2","3","4","5")
        val fiveBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, fiveBuyList)
        val sixBuyList = arrayOf("0","1","2","3","4","5","6")
        val sixBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sixBuyList)
        val sevenBuyList = arrayOf("0","1","2","3","4","5","6","7")
        val sevenBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sevenBuyList)
        val eightBuyList = arrayOf("0","1","2","3","4","5","6","7","8")
        val eightBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, eightBuyList)
        val nineBuyList = arrayOf("0","1","2","3","4","5","6","7","8","9")
        val nineBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, nineBuyList)
        val tenBuyList = arrayOf("0","1","2","3","4","5","6","7","8","9","10")
        val tenBuyListArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, tenBuyList)
        val sphereList = arrayOf("None","Elemental","Healing","Nature","Protections","Psionics","*Necromancy","*Sigil","*Wytchcraft")
        val sphereArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, sphereList)
        val lightSphereList = arrayOf("None","Elemental","Healing","Nature","Protections","Psionics","*Necromancy","*Sigil","*Wytchcraft","Light")
        val lightSphereArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, lightSphereList)
        val darkSphereList = arrayOf("None","Elemental","Healing","Nature","Protections","Psionics","*Necromancy","*Sigil","*Wytchcraft","Dark")
        val darkSphereArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, darkSphereList)
        val draconicSphereList = arrayOf("None","Elemental","Healing","Nature","Protections","Psionics","*Necromancy","*Sigil","*Wytchcraft","Draconic")
        val draconicSphereArrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, draconicSphereList)
//General Skills
        val level3Spinner = findViewById<Spinner>(id.level3Spinner)
        level3Spinner.isEnabled = false
        val level6Spinner = findViewById<Spinner>(id.level6Spinner)
        level6Spinner.isEnabled = false
        val level9Spinner = findViewById<Spinner>(id.level9Spinner)
        level9Spinner.isEnabled = false
        val level12Spinner = findViewById<Spinner>(id.level12Spinner)
        level12Spinner.isEnabled = false
        val racialSpinner = findViewById<Spinner>(id.racialSpinner)
        val bodySpinner = findViewById<Spinner>(id.bodySpinner)
        val strengthSpinner = findViewById<Spinner>(id.strengthSpinner)
        val trapsmithSpinner = findViewById<Spinner>(id.trapsmithSpinner)
        val tradesmanSpinner = findViewById<Spinner>(id.tradesmanSpinner)
        val alchemySpinner = findViewById<Spinner>(id.alchemySpinner)
        val chemistrySpinner = findViewById<Spinner>(id.chemistrySpinner)
        chemistrySpinner.isEnabled = false
        val blacksmithingSpinner = findViewById<Spinner>(id.blacksmithingSpinner)
        val artificeSpinner = findViewById<Spinner>(id.artificeSpinner)
        artificeSpinner.isEnabled = false
        val scrollcraftingSpinner = findViewById<Spinner>(id.scrollcraftingSpinner)
        scrollcraftingSpinner.isEnabled = false
        val coldHandsSpinner = findViewById<Spinner>(id.coldHandsSpinner)
        val createAlcoholSpinner = findViewById<Spinner>(id.createAlcoholSpinner)
        val heavyDrinkerSpinner = findViewById<Spinner>(id.heavyDrinkerSpinner)
        val hindsightSpinner = findViewById<Spinner>(id.hindsightSpinner)
        hindsightSpinner.isEnabled = false
        val intuitionSpinner = findViewById<Spinner>(id.intuitionSpinner)
        val lootingSpinner = findViewById<Spinner>(id.lootingSpinner)
        val paragonSpinner = findViewById<Spinner>(id.paragonSpinner)
        val paragonSlotSpinner = findViewById<Spinner>(id.paragonSlotSpinner)
        val possumSpinner = findViewById<Spinner>(id.possumSpinner)
        val teacherSpinner = findViewById<Spinner>(id.teacherSpinner)
//Warrior Skills
        val ambidexteritySpinner = findViewById<Spinner>(id.ambidexteritySpinner)
        val florentineSpinner = findViewById<Spinner>(id.florentineSpinner)
        florentineSpinner.isEnabled = false
        val flurrySpinner = findViewById<Spinner>(id.flurrySpinner)
        val heavyArmorSpinner = findViewById<Spinner>(id.heavyArmorSpinner)
        val selfMutilateSpinner = findViewById<Spinner>(id.selfMutilateSpinner)
        val shieldSpinner = findViewById<Spinner>(id.shieldSpinner)
        val weapRefocusSpinner = findViewById<Spinner>(id.weapRefocusSpinner)
        val groupProfMedSpinner = findViewById<Spinner>(id.groupProfMedSpinner)
        val groupProfLrgSpinner = findViewById<Spinner>(id.groupProfLrgSpinner)
        val profExoticSpinner = findViewById<Spinner>(id.profExoticSpinner)
        val groupSpecSpinner = findViewById<Spinner>(id.groupSpecSpinner)
        val specificSpecSpinner = findViewById<Spinner>(id.specificSpecSpinner)
        val slayParrySpinner = findViewById<Spinner>(id.slayParrySpinner)
        slayParrySpinner.isEnabled = false
        val slayParryMstrSpinner = findViewById<Spinner>(id.slayParryMstrSpinner)
        slayParryMstrSpinner.isEnabled = false
        val battlefieldRepairSpinner = findViewById<Spinner>(id.battlefieldRepairSpinner)
        val crippleSpinner = findViewById<Spinner>(id.crippleSpinner)
        val decapitateSpinner = findViewById<Spinner>(id.decapitateSpinner)
        decapitateSpinner.isEnabled = false
        val dirtEyeSpinner = findViewById<Spinner>(id.dirtEyeSpinner)
        val tripSpinner = findViewById<Spinner>(id.tripSpinner)
        val whirlBlowsSpinner = findViewById<Spinner>(id.whirlBlowsSpinner)
        whirlBlowsSpinner.isEnabled = false
//Rogue Skills
        val garroteSpinner = findViewById<Spinner>(id.garroteSpinner)
        val sapSpinner = findViewById<Spinner>(id.sapSpinner)
        val vitalBlowSpinner = findViewById<Spinner>(id.vitalBlowSpinner)
        val dodgeSpinner = findViewById<Spinner>(id.dodgeSpinner)
        dodgeSpinner.isEnabled = false
        val specificCritSpinner = findViewById<Spinner>(id.specificCritSpinner)
        val groupCritSpinner = findViewById<Spinner>(id.groupCritSpinner)
        val executeSpinner = findViewById<Spinner>(id.executeSpinner)
        executeSpinner.isEnabled = false
        val executeMstrSpinner = findViewById<Spinner>(id.executeMstrSpinner)
        executeMstrSpinner.isEnabled = false
        val blindfighterSpinner = findViewById<Spinner>(id.blindfighterSpinner)
        val escapeSpinner = findViewById<Spinner>(id.escapeSpinner)
        escapeSpinner.isEnabled = false
        val riposteSpinner = findViewById<Spinner>(id.riposteSpinner)
        val suckerPunchSpinner = findViewById<Spinner>(id.suckerPunchSpinner)
        val thievesCantSpinner = findViewById<Spinner>(id.thievesCantSpinner)
        val tumbleSpinner = findViewById<Spinner>(id.tumbleSpinner)
//Scholar Skills
        val mysticismSpinner = findViewById<Spinner>(id.mysticismSpinner)
        val demAngArtsSpinner = findViewById<Spinner>(id.demAngArtsSpinner)
        val necroArtsSpinner = findViewById<Spinner>(id.necroArtsSpinner)
        val anatomySpinner = findViewById<Spinner>(id.anatomySpinner)
        val firstAidSpinner = findViewById<Spinner>(id.firstAidSpinner)
        firstAidSpinner.isEnabled = false
        val physicianSpinner = findViewById<Spinner>(id.physicianSpinner)
        physicianSpinner.isEnabled = false
        val readWriteSpinner = findViewById<Spinner>(id.readWriteSpinner)
        val readMagicSpinner = findViewById<Spinner>(id.readMagicSpinner)
        readMagicSpinner.isEnabled = false
        val rdAdvMagicSpinner = findViewById<Spinner>(id.rdAdvMagicSpinner)
        rdAdvMagicSpinner.isEnabled = false
        val rdRitualMagicSpinner = findViewById<Spinner>(id.rdRitualMagicSpinner)
        rdRitualMagicSpinner.isEnabled = false
        val eleAttuneSpinner = findViewById<Spinner>(id.eleAttuneSpinner)
        eleAttuneSpinner.isEnabled = false
        val combatWizSpinner = findViewById<Spinner>(id.combatWizSpinner)
        combatWizSpinner.isEnabled = false
        val harvestSpinner = findViewById<Spinner>(id.harvestSpinner)
        val morticianSpinner = findViewById<Spinner>(id.morticianSpinner)
        morticianSpinner.isEnabled = false
        val refocusSpinner = findViewById<Spinner>(id.refocusSpinner)
        val spellParrySpinner = findViewById<Spinner>(id.spellParrySpinner)
        val spellVersSpinner = findViewById<Spinner>(id.spellVersSpinner)
        val spellSwitchSpinner = findViewById<Spinner>(id.spellSwitchSpinner)
        val spellVersSlotSpinner1 = findViewById<Spinner>(id.spellVersSlotSpinner1)
        val spellVersSlotSpinner2 = findViewById<Spinner>(id.spellVersSlotSpinner2)
        val spellVersSlotSpinner3 = findViewById<Spinner>(id.spellVersSlotSpinner3)
        val spellVersSlotSpinner4 = findViewById<Spinner>(id.spellVersSlotSpinner4)
        val spellVersSlotSpinner5 = findViewById<Spinner>(id.spellVersSlotSpinner5)
        val spellVersSlotSpinner6 = findViewById<Spinner>(id.spellVersSlotSpinner6)
        val spellVersSlotSpinner7 = findViewById<Spinner>(id.spellVersSlotSpinner7)
        val spellVersSlotSpinner8 = findViewById<Spinner>(id.spellVersSlotSpinner8)
        val spellVersSlotSpinner9 = findViewById<Spinner>(id.spellVersSlotSpinner9)
        val spellVersSlotSpinner10 = findViewById<Spinner>(id.spellVersSlotSpinner10)
//Spheres and Slots
        val sphere1Spinner = findViewById<Spinner>(id.sphere1Spinner)
        sphere1Spinner.isEnabled = false
        val sphere2Spinner = findViewById<Spinner>(id.sphere2Spinner)
        sphere2Spinner.isEnabled = false
        val sphere3Spinner = findViewById<Spinner>(id.sphere3Spinner)
        sphere3Spinner.isEnabled = false
        val slot1Spinner = findViewById<Spinner>(id.slot1Spinner)
        slot1Spinner.isEnabled = false
        val slot2Spinner = findViewById<Spinner>(id.slot2Spinner)
        slot2Spinner.isEnabled = false
        val slot3Spinner = findViewById<Spinner>(id.slot3Spinner)
        slot3Spinner.isEnabled = false
        val slot4Spinner = findViewById<Spinner>(id.slot4Spinner)
        slot4Spinner.isEnabled = false
        val slot5Spinner = findViewById<Spinner>(id.slot5Spinner)
        slot5Spinner.isEnabled = false
        val slot6Spinner = findViewById<Spinner>(id.slot6Spinner)
        slot6Spinner.isEnabled = false
        val slot7Spinner = findViewById<Spinner>(id.slot7Spinner)
        slot7Spinner.isEnabled = false
        val slot8Spinner = findViewById<Spinner>(id.slot8Spinner)
        slot8Spinner.isEnabled = false
        val slot9Spinner = findViewById<Spinner>(id.slot9Spinner)
        slot9Spinner.isEnabled = false
        val ritualSpinner = findViewById<Spinner>(id.ritualSpinner)
        ritualSpinner.isEnabled = false

        //Reset Button
        resetButton.setOnClickListener() {
            startActivity(Intent(this, MainActivity::class.java))

            levelInt = 1
            hpInt = 0
            blanketsInt = 0
            cpInt = 150
            freeInt = 0
            spentInt = 0
            characterSpentInt = 0
            fragsInt = 0
            characterFragsInt = 0
            raceFragsInt = 0
            cultureFragsInt = 0
            vocationFragsInt = 0
            favoredInt = 0
            favoredFragsInt = 0
            
            characterBlankets.setText("0")

            calculateLevelbyBlankets()
            characterLevel.setText("" + levelInt)

            calculateHP()
            characterHP.setText("" + hpInt)

            calculateTotalCPbyBlankets()
            characterCP.setText("" + cpInt)

            calculateFreeCP()
            characterFree.setText("" + freeInt)

            spentFrags()
            calculateFragCost()
            characterFrags.setText("" + characterFragsInt)
        }

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

                    racialName.setText("Racial Skill")

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

                    raceFragsInt = 0
                    calculateFragCost()
                    characterFrags.setText("" + characterFragsInt)

                    if (raceSelection == "Savar'Aving") {
                        characterRace = raceSelection

                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Cat-Like Reflexes")

                        cultureText.text = "Taliss Pride Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                                racialName.setText("Redeemer's Claws")
                            }
                            else {
                                characterRace = raceSelection

                                cultureFragsInt = 0
                                racialName.setText("Cat-Like Reflexes")
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Gargylen") {
                        characterRace = raceSelection

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Stone Skin")

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Mountain Dwarf") {
                        characterRace = raceSelection

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Racial Body Bonus")

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Dark Elf") {
                        characterRace = raceSelection

                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Spite Blood")

                        cultureText.text = "House Mortuus Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                                racialName.setText("Control Lesser Undead")
                            }
                            else {
                                characterRace = raceSelection

                                cultureFragsInt = 0
                                racialName.setText("Spite Blood")
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "High Elf") {
                        characterRace = raceSelection

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Resist Psionics")

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Wild Elf") {
                        characterRace = raceSelection

                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Nature's Cache")

                        cultureText.text = "Kraken Tribe Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                                racialName.setText("Freedom of Movement")
                            }
                            else {
                                characterRace = raceSelection

                                cultureFragsInt = 0
                                racialName.setText("Nature's Cache")
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Wood Fae") {
                        characterRace = raceSelection

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Charm Break")

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else if (raceSelection == "Orc") {
                        characterRace = raceSelection

                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Orcish Constitution")

                        cultureText.text = "Ebon Khan Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                                racialName.setText("Brood Constitution")
                            }
                            else {
                                characterRace = raceSelection

                                cultureFragsInt = 0
                                racialName.setText("Orcish Constitution")
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Ajaunti") {
                        characterRace = raceSelection

                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Ancestor's Wisdom")

                        cultureText.text = "Clan Vinatore Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                                racialName.setText("Spirit Hook")
                            }
                            else {
                                characterRace = raceSelection

                                cultureFragsInt = 0
                                racialName.setText("Ancestor's Wisdom")
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Einher") {
                        characterRace = raceSelection

                        cultureCheck.isChecked = false
                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Berserker Rage")

                        cultureText.text = "True Berserker Culture"
                        cultureText.visibility = View.VISIBLE
                        cultureCheck.visibility = View.VISIBLE

                        cultureCheck.setOnClickListener({
                            if (cultureCheck.isChecked == true) {
                                cultureFragsInt = 100
                                racialName.setText("Berserker Poison")
                            }
                            else {
                                characterRace = raceSelection

                                cultureFragsInt = 0
                                racialName.setText("Berserker Rage")
                            }
                            calculateFragCost()
                            characterFrags.setText("" + characterFragsInt)
                        })
                    }
                    else if (raceSelection == "Hobling") {
                        characterRace = raceSelection

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Taunt")

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE

                    }
                    else if (raceSelection == "Human") {
                        characterRace = raceSelection

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)

                        racialName.setText("Body Point Bonus")

                        cultureCheck.isChecked = false
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                    }
                    else {
                        cultureText.text = "Culture"
                        cultureText.visibility = View.GONE
                        cultureCheck.visibility = View.GONE
                        cultureCheck.isChecked = false

                        racialName.setText("Racial Skill")

                        cultureFragsInt = 0
                        calculateFragCost()
                        characterFrags.setText("" + characterFragsInt)
                    }
                }

                //Body Point Bonus and Strength Spinners in Race
                when (characterRace){
                    "Gargylen" -> {
                        bodySpinner.adapter = twoBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Mountain Dwarf" -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Wild Elf" -> {
                        bodySpinner.adapter = oneBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Einher" -> {
                        bodySpinner.adapter = oneBuyListArrayAdapter
                        strengthSpinner.adapter = oneBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthSpinner.adapter = oneBuyListArrayAdapter
                        strengthText.visibility = View.VISIBLE
                        strengthCP.visibility = View.VISIBLE
                        strengthSpinner.visibility = View.VISIBLE
                    }
                    "Human" -> {
                        bodySpinner.adapter = oneBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Wolven" -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0
                        strengthSpinner.adapter = oneBuyListArrayAdapter
                        strengthText.visibility = View.VISIBLE
                        strengthCP.visibility = View.VISIBLE
                        strengthSpinner.visibility = View.VISIBLE
                    }
                    "Orc" -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    else -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0

                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }

                }// End Body Point Bonus and Strength Spinners in Race

                calculateHP()
                characterHP.setText("" + hpInt)

                calculateTotalCPbyBlankets()
                characterCP.setText("" + cpInt)

                calculateSpentCP()
                calculateFreeCP()

                characterSpent.setText("" + characterSpentInt)
                characterFree.setText("" + freeInt)


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
                    characterRace = fragSelection

                    raceFragsInt = 75
                    racialName.setText("Clobber")
                }
                else if (fragSelection == "Faun"){
                    characterRace = fragSelection

                    raceFragsInt = 75
                    racialName.setText("Forest Revival")
                }
                else if (fragSelection == "Minotaur"){
                    characterRace = fragSelection

                    raceFragsInt = 75
                    racialName.setText("Fae Ward")
                }
                else if (fragSelection == "Kobold"){
                    characterRace = fragSelection

                    raceFragsInt = 75
                    racialName.setText("KABOOM!")
                }
                else if (fragSelection == "Ogre"){
                    characterRace = fragSelection

                    raceFragsInt = 75
                    racialName.setText("Ogre Smash")
                }
                else if (fragSelection == "Squamata"){
                    characterRace = fragSelection

                    raceFragsInt = 75
                    racialName.setText("Tongue Pierce")
                }
                //Rare Races
                else if (fragSelection == "Avian"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Create Goggles")
                }
                else if (fragSelection == "Draconian"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Reflect Divine")
                }
                else if (fragSelection == "Fire Elf"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Endurance")
                }
                else if (fragSelection == "Goblin"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Amorphic Mucus")
                }
                else if (fragSelection == "Risen"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Spirit Skinning")
                }
                else if (fragSelection == "Wolven"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Natural Hide")
                }
                else if (fragSelection == "Yokai"){
                    characterRace = fragSelection

                    raceFragsInt = 150
                    racialName.setText("Enemy of my Enemy")
                }
                //Obscure Races
                else if (fragSelection == "Carnal Fae"){
                    characterRace = fragSelection

                    raceFragsInt = 250
                    racialName.setText("Greater Resist Magic")
                }
                else if (fragSelection == "Faceless"){
                    characterRace = fragSelection

                    raceFragsInt = 250
                    racialName.setText("Unmasked")
                }
                else if (fragSelection == "Gnome"){
                    characterRace = fragSelection

                    raceFragsInt = 250
                    racialName.setText("Gnomish Device")
                }
                else if (fragSelection == "Ice Elf"){
                    characterRace = fragSelection

                    raceFragsInt = 250
                    racialName.setText("Memories in Flesh")
                }
                else if (fragSelection == "Sidhe"){
                    characterRace = fragSelection

                    raceFragsInt = 250
                    racialName.setText("Magic Echo")
                }
                else if (fragSelection == "Vulcan Dwarf"){
                    characterRace = fragSelection

                    raceFragsInt = 250
                    racialName.setText("Endure Fire")
                }

                //Body Point Bonus and Strength Spinners in Frag Race
                when (characterRace){
                    "Gargylen" -> {
                        bodySpinner.adapter = twoBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Mountain Dwarf" -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Wild Elf" -> {
                        bodySpinner.adapter = oneBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Einher" -> {
                        bodySpinner.adapter = oneBuyListArrayAdapter
                        strengthSpinner.adapter = oneBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthSpinner.adapter = oneBuyListArrayAdapter
                        strengthText.visibility = View.VISIBLE
                        strengthCP.visibility = View.VISIBLE
                        strengthSpinner.visibility = View.VISIBLE
                    }
                    "Human" -> {
                        bodySpinner.adapter = oneBuyListArrayAdapter
                        bodyText.visibility = View.VISIBLE
                        bodyCP.visibility = View.VISIBLE
                        bodySpinner.visibility = View.VISIBLE
                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }
                    "Wolven" -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0
                        strengthSpinner.adapter = oneBuyListArrayAdapter
                        strengthText.visibility = View.VISIBLE
                        strengthCP.visibility = View.VISIBLE
                        strengthSpinner.visibility = View.VISIBLE
                    }
                    else -> {
                        bodyText.visibility = View.GONE
                        bodyCP.visibility = View.GONE
                        bodySpinner.visibility = View.GONE
                        bodySpinner.setSelection(0)
                        bodyInt = 0

                        strengthText.visibility = View.GONE
                        strengthCP.visibility = View.GONE
                        strengthSpinner.visibility = View.GONE
                        strengthSpinner.setSelection(0)
                        strengthInt = 0
                    }

                }// End Body Point Bonus and Strength Spinners in Frag Race

                calculateHP()
                characterHP.setText("" + hpInt)

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

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
                    characterClass = classSelection
                }
                else if (classSelection == "Ranger"){
                    level3Name.text = "Detoxify"
                    level6Name.text = "Trailblazing"
                    level9Name.text = "Nature's Grasp"
                    level12Name.text = "Call of the Hunt"
                    characterClass = classSelection
                }
                else if (classSelection == "Templar"){
                    level3Name.text = "Burn Slot"
                    level6Name.text = "Scroll Harvest"
                    level9Name.text = "Weapon Break"
                    level12Name.text = "Weapon Conduit"
                    characterClass = classSelection
                }
                else if (classSelection == "Assassin"){
                    level3Name.text = "Shiv"
                    level6Name.text = "Silent Strike"
                    level9Name.text = "Spirit Sever"
                    level12Name.text = "Penetration"
                    characterClass = classSelection
                }
                else if (classSelection == "Nightblade"){
                    level3Name.text = "Feint"
                    level6Name.text = "Duplicate Key"
                    level9Name.text = "Dim"
                    level12Name.text = "Passwall"
                    characterClass = classSelection
                }
                else if (classSelection == "Witch Hunter"){
                    level3Name.text = "Witch Mark"
                    level6Name.text = "Twist of the Tongue"
                    level9Name.text = "Karmic Ricochet"
                    level12Name.text = "Counter Magic"
                    characterClass = classSelection
                }
                else if (classSelection == "Druid"){
                    level3Name.text = "Create Grove"
                    level6Name.text = "Forest Meld"
                    level9Name.text = "Totem"
                    level12Name.text = "Henge"
                    characterClass = classSelection
                }
                else if (classSelection == "Mage"){
                    level3Name.text = "Id. Magic Item"
                    level6Name.text = "Mana Harvest"
                    level9Name.text = "Create Familiar"
                    level12Name.text = "Power Nexus"
                    characterClass = classSelection
                }
                else if (classSelection == "Bard"){
                    level3Name.text = "S. of Aversion"
                    level6Name.text = "S. of Love"
                    level9Name.text = "S. of Intermission"
                    level12Name.text = "S. of Heroism"
                    characterClass = classSelection
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
                    alchemyCP.text = "70"
                    chemistryCP.text = "80"
                    blacksmithingCP.text = "70"
                    artificeCP.text = "80"
                    scrollcraftingCP.text = "40"
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
                    garroteCP.text = "120"
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
                if (bodySpinner.getVisibility() == View.VISIBLE) {
                    bodyCost = Integer.parseInt(bodyCP.text.toString())
                    bodySelect = Integer.parseInt(bodySpinner.selectedItem.toString())
                }
                if (strengthSpinner.getVisibility() == View.VISIBLE) {
                    strengthCost = Integer.parseInt(strengthCP.text.toString())
                    strengthSelect = Integer.parseInt(strengthSpinner.selectedItem.toString())
                }
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
                createAlcoholFragCost = Integer.parseInt(createAlcoholFrags.text.toString())
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
                paragonFragCost = Integer.parseInt(paragonFrags.text.toString())
                paragonSelect = Integer.parseInt(paragonSpinner.selectedItem.toString())
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
                blindfighterFragCost = Integer.parseInt(blindfighterFrags.text.toString())
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
                spellSwitchCost = Integer.parseInt(spellSwitchCP.text.toString())
                versatilityCalc()
                spellSwitchFragCost = Integer.parseInt(spellSwitchFrags.text.toString())
                spellSwitchSelect = Integer.parseInt(spellSwitchSpinner.selectedItem.toString())
                //Spheres and Slots
                sphere1Cost = Integer.parseInt(sphere1CP.text.toString())
                sphereSelect1 = sphere1Spinner.selectedItem.toString()
                if (sphereSelect1 == "*Sigil"){ sphere1FragCost = 100 } else if (sphereSelect1 == "*Wytchcraft") { sphere1FragCost = 100 } else if (sphereSelect1 == "*Necromancy") { sphere1FragCost = 100 } else { sphere1FragCost = 0 }
                if (sphereSelect1 != "None") { sphere1Select = 1 } else { sphere1Select = 0 }
                sphere2Cost = Integer.parseInt(sphere2CP.text.toString())
                sphereSelect2 = sphere2Spinner.selectedItem.toString()
                if (sphereSelect2 == "*Sigil"){ sphere2FragCost = 100 } else if (sphereSelect2 == "*Wytchcraft") { sphere2FragCost = 100 } else if (sphereSelect2 == "*Necromancy") { sphere2FragCost = 100 } else { sphere2FragCost = 0 }
                if (sphereSelect2 != "None") { sphere2Select = 1 } else { sphere2Select = 0 }
                sphere3Cost = Integer.parseInt(sphere3CP.text.toString())
                sphereSelect3 = sphere3Spinner.selectedItem.toString()
                if (sphereSelect3 == "*Sigil"){ sphere3FragCost = 100 } else if (sphereSelect3 == "*Wytchcraft") { sphere3FragCost = 100 } else if (sphereSelect3 == "*Necromancy") { sphere3FragCost = 100 } else { sphere3FragCost = 0 }
                if (sphereSelect3 != "None") { sphere3Select = 1 } else { sphere3Select = 0 }
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

                calculateHP()
                characterHP.setText("" + hpInt)

                spentCP()  // Cost x Spent For All CP
                calculateSpentCP()
                calculateFreeCP()

                spentFrags()  // Cost x Spent For All Frags
                calculateFragCost()

                characterFree.setText("" + freeInt)
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
                    characterClass = classSelection

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
                    characterClass = classSelection

                    //Ranger CP text
                    //General Skills
                    trapsmithCP.text = "75"
                    tradesmanCP.text = "40"
                    alchemyCP.text = "70"
                    chemistryCP.text = "80"
                    blacksmithingCP.text = "70"
                    artificeCP.text = "80"
                    scrollcraftingCP.text = "40"
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
                    garroteCP.text = "120"
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
                else if (classSelection == "Templar") {
                    characterClass = "Templar"
                    characterClass = classSelection

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
                    characterClass = classSelection

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
                    characterClass = classSelection

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
                    characterClass = classSelection

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
                    characterClass = classSelection

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
                    characterClass = classSelection

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
                    characterClass = classSelection

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
                    characterClass = classSelection

                    classSpinner.isEnabled = true
                    vocationFragsInt = 0
                    favoredFragsInt = 0
                    favoredInt = 0
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

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
                    sphere1Spinner.adapter = sphereArrayAdapter
                    sphere2Spinner.adapter = sphereArrayAdapter
                    sphere3Spinner.adapter = sphereArrayAdapter

                    characterClass = classSelection

                    level3Name.text = "Hunter's Focus"
                    level6Name.text = "Hunter's Attrition"
                    level9Name.text = "Crystal of Light"
                    level12Name.text = "Final Rest"
                }
                //Favoured Vocations
                else if (vocationSelection == "Dread Knight") {
                    classSpinner.isEnabled = false
                    vocationFragsInt = 0
                    favoredFragsInt = 250
                    favoredInt = 50

                    characterClass = "Dread Knight"

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
                    sphere1Spinner.adapter = darkSphereArrayAdapter
                    sphere2Spinner.adapter = darkSphereArrayAdapter
                    sphere3Spinner.adapter = darkSphereArrayAdapter
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

                    characterClass = "Paladin"

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
                    sphere1Spinner.adapter = lightSphereArrayAdapter
                    sphere2Spinner.adapter = lightSphereArrayAdapter
                    sphere3Spinner.adapter = lightSphereArrayAdapter
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

                    characterClass = "Darkweaver"

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
                    sphere1Spinner.adapter = darkSphereArrayAdapter
                    sphere2Spinner.adapter = darkSphereArrayAdapter
                    sphere3Spinner.adapter = darkSphereArrayAdapter
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

                    characterClass = "Lightweaver"

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
                    sphere1Spinner.adapter = lightSphereArrayAdapter
                    sphere2Spinner.adapter = lightSphereArrayAdapter
                    sphere3Spinner.adapter = lightSphereArrayAdapter
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

                    characterClass = "Dragon Knight"

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
                    sphere1Spinner.adapter = draconicSphereArrayAdapter
                    sphere2Spinner.adapter = draconicSphereArrayAdapter
                    sphere3Spinner.adapter = draconicSphereArrayAdapter
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
                if (bodySpinner.getVisibility() == View.VISIBLE) {
                    bodyCost = Integer.parseInt(bodyCP.text.toString())
                    bodySelect = Integer.parseInt(bodySpinner.selectedItem.toString())
                }
                if (strengthSpinner.getVisibility() == View.VISIBLE) {
                    strengthCost = Integer.parseInt(strengthCP.text.toString())
                    strengthSelect = Integer.parseInt(strengthSpinner.selectedItem.toString())
                }
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
                createAlcoholFragCost = Integer.parseInt(createAlcoholFrags.text.toString())
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
                paragonCalc()
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
                blindfighterFragCost = Integer.parseInt(blindfighterFrags.text.toString())
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
                versatilityCalc()
                spellSwitchCost = Integer.parseInt(spellSwitchCP.text.toString())
                spellSwitchFragCost = Integer.parseInt(spellSwitchFrags.text.toString())
                spellSwitchSelect = Integer.parseInt(spellSwitchSpinner.selectedItem.toString())
                //Spheres and Slots
                sphere1Cost = Integer.parseInt(sphere1CP.text.toString())
                sphereSelect1 = sphere1Spinner.selectedItem.toString()
                if (sphereSelect1 == "*Sigil"){ sphere1FragCost = 100 } else if (sphereSelect1 == "*Wytchcraft") { sphere1FragCost = 100 } else if (sphereSelect1 == "*Necromancy") { sphere1FragCost = 100 } else { sphere1FragCost = 0 }
                if (sphereSelect1 != "None") { sphere1Select = 1 } else { sphere1Select = 0 }
                sphere2Cost = Integer.parseInt(sphere2CP.text.toString())
                sphereSelect2 = sphere2Spinner.selectedItem.toString()
                if (sphereSelect2 == "*Sigil"){ sphere2FragCost = 100 } else if (sphereSelect2 == "*Wytchcraft") { sphere2FragCost = 100 } else if (sphereSelect2 == "*Necromancy") { sphere2FragCost = 100 } else { sphere2FragCost = 0 }
                if (sphereSelect2 != "None") { sphere2Select = 1 } else { sphere2Select = 0 }
                sphere3Cost = Integer.parseInt(sphere3CP.text.toString())
                sphereSelect3 = sphere3Spinner.selectedItem.toString()
                if (sphereSelect3 == "*Sigil"){ sphere3FragCost = 100 } else if (sphereSelect3 == "*Wytchcraft") { sphere3FragCost = 100 } else if (sphereSelect3 == "*Necromancy") { sphere3FragCost = 100 } else { sphere3FragCost = 0 }
                if (sphereSelect3 != "None") { sphere3Select = 1 } else { sphere3Select = 0 }
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

                calculateHP()
                characterHP.setText("" + hpInt)

                spentCP()  // Cost x Spent For All CP
                calculateSpentCP()
                calculateFreeCP()

                spentFrags()  // Cost x Spent For All Frags
                calculateFragCost()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
                characterFrags.setText("" + characterFragsInt)

            } // Vocation Spinner

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Blanket Box

        characterBlankets.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                val characterBlanketsStr = characterBlankets.editableText.toString()

                if (characterBlanketsStr != ""){
                    blanketsInt = Integer.parseInt(characterBlanketsStr)

                    calculateLevelbyBlankets()
                    characterLevel.setText("" + levelInt)

                    calculateHP()
                    characterHP.setText("" + hpInt)

                    calculateTotalCPbyBlankets()
                    characterCP.setText("" + cpInt)

                    calculateFreeCP()
                    characterFree.setText("" + freeInt)

                }
                else {
                    blanketsInt = 0
                    levelInt = 1
                    characterLevel.setText("" + levelInt)
                    cpInt = 150
                    characterCP.setText("" + cpInt)
                    freeInt = 150
                    characterFree.setText("" + freeInt)
                }

                if (levelInt == 1 || levelInt == 2) {
                    allowedRacial = 1
                }
                else if (levelInt == 3 || levelInt == 4) {
                    allowedRacial = 2
                }
                else if (levelInt == 5) {
                    allowedRacial = 3
                }
                else if (levelInt == 6) {
                    allowedRacial = 3
                }
                else if (levelInt == 7 || levelInt == 8) {
                    allowedRacial = 4
                }
                else if (levelInt == 9 || levelInt == 10) {
                    allowedRacial = 5
                }
                else if (levelInt == 11) {
                    allowedRacial = 6
                }
                else if (levelInt == 12) {
                    allowedRacial = 6
                }
                else if (levelInt == 13 || levelInt == 14) {
                    allowedRacial = 7
                }
                else if (levelInt == 15 || levelInt == 16) {
                    allowedRacial = 8
                }
                else if (levelInt == 17 || levelInt == 18) {
                    allowedRacial = 9
                }
                else if (levelInt >= 19) {
                    allowedRacial = 10
                }
                else {
                    allowedRacial = 0
                }

                level3Select = Integer.parseInt(level3Spinner.selectedItem.toString())

                if (levelInt >= 3) {
                    level3Spinner.isEnabled = true
                }
                else {
                    level3Spinner.isEnabled = false
                    level3Spinner.setSelection(0)
                    level3Int = 0
                }

                racialSelect = Integer.parseInt(racialSpinner.selectedItem.toString())

                if (racialSelect > allowedRacial) {
                    racialSelect = allowedRacial
                    racialSpinner.setSelection(racialSelect)
                }

                if (levelInt == 1 || levelInt == 2) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = oneBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 3 || levelInt == 4) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = twoBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 5 || levelInt == 6) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = threeBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 7 || levelInt == 8) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = fourBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 9 || levelInt == 10) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = fiveBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 11 || levelInt == 12) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = sixBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 13 || levelInt == 14) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = sevenBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 15 || levelInt == 16) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = eightBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt == 17 || levelInt == 18) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = nineBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else if (levelInt >= 19) {
                    racialSpinner.isEnabled = true
                    racialSpinner.adapter = tenBuyListArrayAdapter
                    racialSpinner.setSelection(racialSelect)
                }
                else {
                    racialSpinner.isEnabled = false
                    racialSpinner.setSelection(0)
                    racialInt = 0
                }

            }
        })


        //General Skill Spinners

        //Spinner for Level 3 Skill
        level3Spinner.adapter = tenBuyListArrayAdapter
        level3Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level3CP.text.toString())
                val skillSelect = Integer.parseInt(level3Spinner.selectedItem.toString())

                if (skillSelect > 0 && levelInt >= 6) {
                    level6Spinner.isEnabled = true
                }
                else {
                    level6Spinner.isEnabled = false
                    level6Spinner.setSelection(0)
                    level6Int = 0
                }

                if (characterClass == "Nightblade") {
                    specificCritSelect = Integer.parseInt(specificCritSpinner.selectedItem.toString())
                    groupCritSelect = Integer.parseInt(groupCritSpinner.selectedItem.toString())
                    dodgeSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())

                    if (dodgeSelect > skillSelect) {
                        if (skillSelect > specificCritSelect && skillSelect > groupCritSelect) {
                            dodgeSelect = skillSelect
                        }
                        else {
                            if (specificCritSelect > groupCritSelect) {
                                dodgeSelect = specificCritSelect
                            } else if (groupCritSelect > specificCritSelect)
                                dodgeSelect = groupCritSelect
                        }
                        dodgeSpinner.setSelection(dodgeSelect)
                    }

                    if (skillSelect > specificCritSelect && skillSelect > groupCritSelect) {
                        if (skillSelect == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (skillSelect == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                }

                level3Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Spinner for Level 6 Skill
        level6Spinner.adapter = tenBuyListArrayAdapter
        level6Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level6CP.text.toString())
                val skillSelect = Integer.parseInt(level6Spinner.selectedItem.toString())

                if (skillSelect > 0 && levelInt >= 9) {
                    level9Spinner.isEnabled = true
                }
                else {
                    level9Spinner.isEnabled = false
                    level9Spinner.setSelection(0)
                    level9Int = 0
                }

                level6Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Level 9 Skill
        level9Spinner.adapter = tenBuyListArrayAdapter
        level9Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level9CP.text.toString())
                val skillSelect = Integer.parseInt(level9Spinner.selectedItem.toString())

                if (skillSelect > 0 && levelInt >= 12) {
                    level12Spinner.isEnabled = true
                }
                else {
                    level12Spinner.isEnabled = false
                    level12Spinner.setSelection(0)
                    level12Int = 0
                }

                level9Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Level 12 Skill
        level12Spinner.adapter = tenBuyListArrayAdapter
        level12Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(level12CP.text.toString())
                val skillSelect = Integer.parseInt(level12Spinner.selectedItem.toString())

                level12Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Racial Skill
        racialSpinner.adapter = oneBuyListArrayAdapter
        racialSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(racialCP.text.toString())
                val skillSelect = Integer.parseInt(racialSpinner.selectedItem.toString())

                racialInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateHP()
                characterHP.setText("" + hpInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Body Point Bonus
        bodySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(bodyCP.text.toString())
                val skillSelect = Integer.parseInt(bodySpinner.selectedItem.toString())

                bodyHP = 5 * skillSelect

                bodyInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateHP()
                characterHP.setText("" + hpInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Strength Point Bonus
        strengthSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(strengthCP.text.toString())
                val skillSelect = Integer.parseInt(strengthSpinner.selectedItem.toString())

                strengthInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Production Spinners

        //Spinner for Trapsmith Skill
        trapsmithSpinner.adapter = tenBuyListArrayAdapter
        trapsmithSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(trapsmithCP.text.toString())
                val skillSelect = Integer.parseInt(trapsmithSpinner.selectedItem.toString())

                if (skillSelect < 5) {
                        escapeSpinner.isEnabled = false
                        escapeSpinner.setSelection(0)
                        escapeInt = 0
                }
                else{
                    escapeSpinner.isEnabled = true
                }

                trapsmithInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Tradesman Skill
        tradesmanSpinner.adapter = tenBuyListArrayAdapter
        tradesmanSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(tradesmanCP.text.toString())
                val skillSelect = Integer.parseInt(tradesmanSpinner.selectedItem.toString())

                //Math
                tradesmanInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Alchemy Skill
        alchemySpinner.adapter = tenBuyListArrayAdapter
        alchemySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(alchemyCP.text.toString())
                val skillSelect = Integer.parseInt(alchemySpinner.selectedItem.toString())

                when (skillSelect) {
                    10 -> {
                        chemistrySpinner.isEnabled = true

                    }
                    else -> {
                        chemistrySpinner.isEnabled = false
                        chemistrySpinner.setSelection(0)
                        chemistryInt = 0
                    }
                }

                alchemyInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Chemistry Skill
        chemistrySpinner.adapter = tenBuyListArrayAdapter
        chemistrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(chemistryCP.text.toString())
                val skillSelect = Integer.parseInt(chemistrySpinner.selectedItem.toString())

                //Math
                chemistryInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Blacksmithing Skill
        blacksmithingSpinner.adapter = tenBuyListArrayAdapter
        blacksmithingSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(blacksmithingCP.text.toString())
                val skillSelect = Integer.parseInt(blacksmithingSpinner.selectedItem.toString())

                when (skillSelect) {
                    10 -> {
                        artificeSpinner.isEnabled = true

                    }
                    else -> {
                        artificeSpinner.isEnabled = false
                        artificeSpinner.setSelection(0)
                        artificeInt = 0
                    }
                }

                blacksmithingInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Artifice Skill
        artificeSpinner.adapter = tenBuyListArrayAdapter
        artificeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(artificeCP.text.toString())
                val skillSelect = Integer.parseInt(artificeSpinner.selectedItem.toString())

                //Math
                artificeInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Scrollcrafting Skill
        scrollcraftingSpinner.adapter = tenBuyListArrayAdapter
        scrollcraftingSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(scrollcraftingCP.text.toString())
                val skillSelect = Integer.parseInt(scrollcraftingSpinner.selectedItem.toString())

                scrollcraftingInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //General Frag Skills

        //Spinner for Cold Dead Hands Skill
        coldHandsSpinner.adapter = oneBuyListArrayAdapter
        coldHandsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(coldHandsCP.text.toString())
                val fragCost = Integer.parseInt(coldHandsFrags.text.toString())
                val skillSelect = Integer.parseInt(coldHandsSpinner.selectedItem.toString())

                //Math
                coldHandsInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                coldHandsFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Create Alcohol Skill
        createAlcoholSpinner.adapter = tenBuyListArrayAdapter
        createAlcoholSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(createAlcoholCP.text.toString())
                val fragCost = Integer.parseInt(createAlcoholFrags.text.toString())
                val skillSelect = Integer.parseInt(createAlcoholSpinner.selectedItem.toString())

                //Math
                createAlcoholInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                createAlcoholFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Heavy Drinker Skill
        heavyDrinkerSpinner.adapter = oneBuyListArrayAdapter
        heavyDrinkerSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(heavyDrinkerCP.text.toString())
                val fragCost = Integer.parseInt(heavyDrinkerFrags.text.toString())
                val skillSelect = Integer.parseInt(heavyDrinkerSpinner.selectedItem.toString())

                //Math
                heavyDrinkerInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                heavyDrinkerFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Hindsight Skill
        hindsightSpinner.adapter = oneBuyListArrayAdapter
        hindsightSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(hindsightCP.text.toString())
                val fragCost = Integer.parseInt(hindsightFrags.text.toString())
                val skillSelect = Integer.parseInt(hindsightSpinner.selectedItem.toString())

                //Math
                hindsightInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                hindsightFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Intuition Skill
        intuitionSpinner.adapter = oneBuyListArrayAdapter
        intuitionSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(intuitionCP.text.toString())
                val fragCost = Integer.parseInt(intuitionFrags.text.toString())
                val skillSelect = Integer.parseInt(intuitionSpinner.selectedItem.toString())

                //Math
                intuitionInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                intuitionFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Looting Skill
        lootingSpinner.adapter = fiveBuyListArrayAdapter
        lootingSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(lootingCP.text.toString())
                val fragCost = Integer.parseInt(lootingFrags.text.toString())
                val skillSelect = Integer.parseInt(lootingSpinner.selectedItem.toString())

                //Math
                lootingInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                lootingFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Paragon Skill
        paragonSpinner.adapter = oneBuyListArrayAdapter
        paragonSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val paragonSelect = Integer.parseInt(paragonSpinner.selectedItem.toString())

                if (paragonSelect == 1) {
                    paragonSlotText.visibility = View.VISIBLE
                    paragonSlotSpinner.visibility = View.VISIBLE

                    paragonFragsInt = 100

                }
                else {
                    paragonSlotText.visibility = View.GONE
                    paragonSlotSpinner.visibility = View.GONE
                    paragonSlotSpinner.setSelection(0)

                    paragonFragsInt = 0
                }

                paragonInt = 0
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Paragon Slot Level Spinner
        paragonSlotSpinner.adapter = nineBuyListArrayAdapter
        paragonSlotSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                paragonCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Possum Skill
        possumSpinner.adapter = tenBuyListArrayAdapter
        possumSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(possumCP.text.toString())
                val fragCost = Integer.parseInt(possumFrags.text.toString())
                val skillSelect = Integer.parseInt(possumSpinner.selectedItem.toString())

                //Math
                possumInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                possumFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Teacher Skill
        teacherSpinner.adapter = tenBuyListArrayAdapter
        teacherSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(teacherCP.text.toString())
                val fragCost = Integer.parseInt(teacherFrags.text.toString())
                val skillSelect = Integer.parseInt(teacherSpinner.selectedItem.toString())

                //Math
                teacherInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
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
        ambidexteritySpinner.adapter = oneBuyListArrayAdapter
        ambidexteritySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(ambidexterityCP.text.toString())
                val skillSelect = Integer.parseInt(ambidexteritySpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        florentineSpinner.isEnabled = false
                        florentineSpinner.setSelection(0)
                        florentineInt = 0
                    }
                    else -> florentineSpinner.isEnabled = true
                }

                ambidexterityInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Florentine Skill
        florentineSpinner.adapter = oneBuyListArrayAdapter
        florentineSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(florentineCP.text.toString())
                val skillSelect = Integer.parseInt(florentineSpinner.selectedItem.toString())

                //Math
                florentineInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Flurry of Blows Skill
        flurrySpinner.adapter = tenBuyListArrayAdapter
        flurrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(flurryCP.text.toString())
                val skillSelect = Integer.parseInt(flurrySpinner.selectedItem.toString())

                whirlBlowsSelect = Integer.parseInt(whirlBlowsSpinner.selectedItem.toString())
                if (whirlBlowsSelect > skillSelect){
                    whirlBlowsSelect = skillSelect
                }

                when (skillSelect) {
                    0 -> {
                        whirlBlowsSpinner.isEnabled = false
                        whirlBlowsSpinner.setSelection(0)
                        whirlBlowsInt = 0
                        whirlBlowsFragsInt = 0
                    }
                    1 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = oneBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)
                    }
                    2 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = twoBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    3 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = threeBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    4 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = fourBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    5 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = fiveBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    6 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = sixBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    7 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = sevenBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    8 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = eightBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    9 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = nineBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)

                    }
                    10 -> {
                        whirlBlowsSpinner.isEnabled = true
                        whirlBlowsSpinner.adapter = tenBuyListArrayAdapter
                        whirlBlowsSpinner.setSelection(whirlBlowsSelect)
                    }
                }

                flurryInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Heavy Armor Skill
        heavyArmorSpinner.adapter = oneBuyListArrayAdapter
        heavyArmorSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(heavyArmorCP.text.toString())
                val skillSelect = Integer.parseInt(heavyArmorSpinner.selectedItem.toString())

                //Math
                heavyArmorInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Self Mutilate Skill
        selfMutilateSpinner.adapter = oneBuyListArrayAdapter
        selfMutilateSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(selfMutilateCP.text.toString())
                val skillSelect = Integer.parseInt(selfMutilateSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        combatWizSpinner.isEnabled = false
                        combatWizSpinner.setSelection(0)
                        combatWizInt = 0
                        combatWizFragsInt = 0
                    }
                    else -> combatWizSpinner.isEnabled = true
                }

                selfMutilateInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Shield Skill
        shieldSpinner.adapter = oneBuyListArrayAdapter
        shieldSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(shieldCP.text.toString())
                val skillSelect = Integer.parseInt(shieldSpinner.selectedItem.toString())

                //Math
                shieldInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Weapon Refocus Skill
        weapRefocusSpinner.adapter = tenBuyListArrayAdapter
        weapRefocusSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(weapRefocusCP.text.toString())
                val skillSelect = Integer.parseInt(weapRefocusSpinner.selectedItem.toString())

                //Math
                weapRefocusInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Proficiency Medium Skill
        groupProfMedSpinner.adapter = oneBuyListArrayAdapter
        groupProfMedSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupProfMedCP.text.toString())
                val skillSelect = Integer.parseInt(groupProfMedSpinner.selectedItem.toString())

                groupProfMedInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Proficiency Large Skill
        groupProfLrgSpinner.adapter = oneBuyListArrayAdapter
        groupProfLrgSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupProfLrgCP.text.toString())
                val skillSelect = Integer.parseInt(groupProfLrgSpinner.selectedItem.toString())

                //Math
                groupProfLrgInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Proficiency Exotic Skill
        profExoticSpinner.adapter = tenBuyListArrayAdapter
        profExoticSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(profExoticCP.text.toString())
                val skillSelect = Integer.parseInt(profExoticSpinner.selectedItem.toString())

                //Math
                profExoticInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Specific Spec +1 Skill
        specificSpecSpinner.adapter = tenBuyListArrayAdapter
        specificSpecSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(specificSpecCP.text.toString())
                val skillSelect = Integer.parseInt(specificSpecSpinner.selectedItem.toString())

                groupSpecSelect = Integer.parseInt(groupSpecSpinner.selectedItem.toString())
                slayParrySelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())

                if (slayParrySelect > skillSelect) {
                    if (skillSelect >= groupSpecSelect) {
                        slayParrySelect = skillSelect
                    }
                    else if (skillSelect <= groupSpecSelect) {
                        slayParrySelect = groupSpecSelect
                    }
                    slayParrySpinner.setSelection(slayParrySelect)
                }

                if (skillSelect >= groupSpecSelect) {
                    if (skillSelect == 0) {
                        slayParrySpinner.isEnabled = false
                        slayParrySpinner.setSelection(0)
                        slayParryInt = 0
                    }
                    if (skillSelect == 1) {
                        slayParrySpinner.adapter = oneBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 2) {
                        slayParrySpinner.adapter = twoBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 3) {
                        slayParrySpinner.adapter = threeBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 4) {
                        slayParrySpinner.adapter = fourBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 5) {
                        slayParrySpinner.adapter = fiveBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 6) {
                        slayParrySpinner.adapter = sixBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 7) {
                        slayParrySpinner.adapter = sevenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 8) {
                        slayParrySpinner.adapter = eightBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 9) {
                        slayParrySpinner.adapter = nineBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (skillSelect == 10) {
                        slayParrySpinner.adapter = tenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                }
                else if (skillSelect <= groupSpecSelect) {
                    if (groupSpecSelect == 0) {
                        slayParrySpinner.isEnabled = false
                        slayParrySpinner.setSelection(0)
                        slayParryInt = 0
                    }
                    else if (groupSpecSelect == 1) {
                        slayParrySpinner.adapter = oneBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 2) {
                        slayParrySpinner.adapter = twoBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 3) {
                        slayParrySpinner.adapter = threeBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 4) {
                        slayParrySpinner.adapter = fourBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 5) {
                        slayParrySpinner.adapter = fiveBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 6) {
                        slayParrySpinner.adapter = sixBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 7) {
                        slayParrySpinner.adapter = sevenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 8) {
                        slayParrySpinner.adapter = eightBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 9) {
                        slayParrySpinner.adapter = nineBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (groupSpecSelect == 10) {
                        slayParrySpinner.adapter = tenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                }

                specificSpecInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Spec +1 Skill
        groupSpecSpinner.adapter = tenBuyListArrayAdapter
        groupSpecSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupSpecCP.text.toString())
                val skillSelect = Integer.parseInt(groupSpecSpinner.selectedItem.toString())

                specificSpecSelect = Integer.parseInt(specificSpecSpinner.selectedItem.toString())
                slayParrySelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())
                slayParryMstrSelect = Integer.parseInt(slayParryMstrSpinner.selectedItem.toString())

                if (slayParrySelect > skillSelect && slayParrySelect > specificSpecSelect) {
                    if (skillSelect >= specificSpecSelect) {
                        slayParrySelect = skillSelect
                    }
                    else if (skillSelect <= specificSpecSelect) {
                        slayParrySelect = specificSpecSelect
                    }
                    slayParrySpinner.setSelection(slayParrySelect)
                }

                if (slayParryMstrSelect >= skillSelect) {
                    slayParryMstrSelect = skillSelect
                    slayParrySpinner.setSelection(slayParryMstrSelect)
                }

                if (skillSelect >= specificSpecSelect) {
                    if (skillSelect == 0){
                        slayParrySpinner.isEnabled = false
                        slayParrySpinner.setSelection(0)
                        slayParryInt = 0
                        slayParryMstrSpinner.isEnabled = false
                        slayParryMstrSpinner.setSelection(0)
                        slayParryMstrInt = 0
                    }
                    else if (skillSelect == 1) {
                        slayParrySpinner.adapter = oneBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = oneBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 2) {
                        slayParrySpinner.adapter = twoBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = twoBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 3) {
                        slayParrySpinner.adapter = threeBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = threeBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 4) {
                        slayParrySpinner.adapter = fourBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = fourBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 5) {
                        slayParrySpinner.adapter = fiveBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = fiveBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 6) {
                        slayParrySpinner.adapter = sixBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = sixBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 7) {
                        slayParrySpinner.adapter = sevenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = sevenBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 8) {
                        slayParrySpinner.adapter = eightBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = eightBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 9) {
                        slayParrySpinner.adapter = nineBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = nineBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 10) {
                        slayParrySpinner.adapter = tenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                        slayParryMstrSpinner.adapter = tenBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                }
                else if (skillSelect <= specificSpecSelect) {
                    if (specificSpecSelect == 0) {
                        slayParrySpinner.isEnabled = false
                        slayParrySpinner.setSelection(0)
                        slayParryInt = 0
                    }
                    else if (specificSpecSelect == 1) {
                        slayParrySpinner.adapter = oneBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 2) {
                        slayParrySpinner.adapter = twoBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 3) {
                        slayParrySpinner.adapter = threeBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 4) {
                        slayParrySpinner.adapter = fourBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 5) {
                        slayParrySpinner.adapter = fiveBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 6) {
                        slayParrySpinner.adapter = sixBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 7) {
                        slayParrySpinner.adapter = sevenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 8) {
                        slayParrySpinner.adapter = eightBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 9) {
                        slayParrySpinner.adapter = nineBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }
                    else if (specificSpecSelect == 10) {
                        slayParrySpinner.adapter = tenBuyListArrayAdapter
                        slayParrySpinner.isEnabled = true
                        slayParrySpinner.setSelection(slayParrySelect)
                    }

                    if (skillSelect == 0) {
                        slayParryMstrSpinner.isEnabled = false
                        slayParryMstrSpinner.setSelection(0)
                        slayParryMstrInt = 0
                    }
                    else if (skillSelect == 1) {
                        slayParryMstrSpinner.adapter = oneBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 2) {
                        slayParryMstrSpinner.adapter = twoBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 3) {
                        slayParryMstrSpinner.adapter = threeBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 4) {
                        slayParryMstrSpinner.adapter = fourBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 5) {
                        slayParryMstrSpinner.adapter = fiveBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 6) {
                        slayParryMstrSpinner.adapter = sixBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 7) {
                        slayParryMstrSpinner.adapter = sevenBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 8) {
                        slayParryMstrSpinner.adapter = eightBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 9) {
                        slayParryMstrSpinner.adapter = nineBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                    else if (skillSelect == 10) {
                        slayParryMstrSpinner.adapter = tenBuyListArrayAdapter
                        slayParryMstrSpinner.isEnabled = true
                        slayParryMstrSpinner.setSelection(slayParryMstrSelect)
                    }
                }

                groupSpecInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slay/Parry Skill
        slayParrySpinner.adapter = tenBuyListArrayAdapter
        slayParrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slayParryCP.text.toString())
                val skillSelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())

                decapitateSelect = Integer.parseInt(decapitateSpinner.selectedItem.toString())
                slayParryMstrSelect = Integer.parseInt(slayParryMstrSpinner.selectedItem.toString())

                if (decapitateSelect > skillSelect) {
                    if (skillSelect >= slayParryMstrSelect) {
                        decapitateSelect = skillSelect
                    }
                    else if (skillSelect <= slayParryMstrSelect) {
                        decapitateSelect = slayParryMstrSelect
                    }
                    decapitateSpinner.setSelection(decapitateSelect)
                }

                if (skillSelect >= slayParryMstrSelect) {
                    if (skillSelect == 0){
                        decapitateSpinner.isEnabled = false
                        decapitateSpinner.setSelection(0)
                        decapitateInt = 0
                    }
                    if (skillSelect == 1) {
                        decapitateSpinner.adapter = oneBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 2) {
                        decapitateSpinner.adapter = twoBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 3) {
                        decapitateSpinner.adapter = threeBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 4) {
                        decapitateSpinner.adapter = fourBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 5) {
                        decapitateSpinner.adapter = fiveBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 6) {
                        decapitateSpinner.adapter = sixBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 7) {
                        decapitateSpinner.adapter = sevenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 8) {
                        decapitateSpinner.adapter = eightBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 9) {
                        decapitateSpinner.adapter = nineBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 10) {
                        decapitateSpinner.adapter = tenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                }
                else if (skillSelect <= slayParryMstrSelect) {
                    if (slayParryMstrSelect == 0){
                        decapitateSpinner.isEnabled = false
                        decapitateSpinner.setSelection(0)
                        decapitateInt = 0
                    }
                    if (slayParryMstrSelect == 1) {
                        decapitateSpinner.adapter = oneBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 2) {
                        decapitateSpinner.adapter = twoBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 3) {
                        decapitateSpinner.adapter = threeBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 4) {
                        decapitateSpinner.adapter = fourBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 5) {
                        decapitateSpinner.adapter = fiveBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 6) {
                        decapitateSpinner.adapter = sixBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 7) {
                        decapitateSpinner.adapter = sevenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 8) {
                        decapitateSpinner.adapter = eightBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 9) {
                        decapitateSpinner.adapter = nineBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParryMstrSelect == 10) {
                        decapitateSpinner.adapter = tenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                }

                slayParryInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slay/Parry Master Skill
        slayParryMstrSpinner.adapter = tenBuyListArrayAdapter
        slayParryMstrSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slayParryMstrCP.text.toString())
                val skillSelect = Integer.parseInt(slayParryMstrSpinner.selectedItem.toString())

                decapitateSelect = Integer.parseInt(decapitateSpinner.selectedItem.toString())
                slayParrySelect = Integer.parseInt(slayParrySpinner.selectedItem.toString())

                if (decapitateSelect > skillSelect) {
                    if (skillSelect >= slayParrySelect) {
                        decapitateSelect = skillSelect
                    }
                    else if (skillSelect <= slayParrySelect) {
                        decapitateSelect = slayParrySelect
                    }
                    decapitateSpinner.setSelection(decapitateSelect)
                }

                if (skillSelect >= slayParrySelect) {
                    if (skillSelect == 0){
                        decapitateSpinner.isEnabled = false
                        decapitateSpinner.setSelection(0)
                        decapitateInt = 0
                    }
                    if (skillSelect == 1) {
                        decapitateSpinner.adapter = oneBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 2) {
                        decapitateSpinner.adapter = twoBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 3) {
                        decapitateSpinner.adapter = threeBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 4) {
                        decapitateSpinner.adapter = fourBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 5) {
                        decapitateSpinner.adapter = fiveBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 6) {
                        decapitateSpinner.adapter = sixBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 7) {
                        decapitateSpinner.adapter = sevenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 8) {
                        decapitateSpinner.adapter = eightBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 9) {
                        decapitateSpinner.adapter = nineBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (skillSelect == 10) {
                        decapitateSpinner.adapter = tenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                }
                else if (skillSelect <= slayParrySelect) {
                    if (slayParrySelect == 0){
                        decapitateSpinner.isEnabled = false
                        decapitateSpinner.setSelection(0)
                        decapitateInt = 0
                    }
                    if (slayParrySelect == 1) {
                        decapitateSpinner.adapter = oneBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 2) {
                        decapitateSpinner.adapter = twoBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 3) {
                        decapitateSpinner.adapter = threeBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 4) {
                        decapitateSpinner.adapter = fourBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 5) {
                        decapitateSpinner.adapter = fiveBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 6) {
                        decapitateSpinner.adapter = sixBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 7) {
                        decapitateSpinner.adapter = sevenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 8) {
                        decapitateSpinner.adapter = eightBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 9) {
                        decapitateSpinner.adapter = nineBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                    else if (slayParrySelect == 10) {
                        decapitateSpinner.adapter = tenBuyListArrayAdapter
                        decapitateSpinner.isEnabled = true
                        decapitateSpinner.setSelection(decapitateSelect)
                    }
                }

                slayParryMstrInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Warrior Frag Skills

        //Spinner for Battlefield Repair Skill
        battlefieldRepairSpinner.adapter = tenBuyListArrayAdapter
        battlefieldRepairSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(battlefieldRepairCP.text.toString())
                val fragCost = Integer.parseInt(battlefieldRepairFrags.text.toString())
                val skillSelect = Integer.parseInt(battlefieldRepairSpinner.selectedItem.toString())

                //Math
                battlefieldRepairInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                battlefieldRepairFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Cripple Skill
        crippleSpinner.adapter = tenBuyListArrayAdapter
        crippleSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(crippleCP.text.toString())
                val fragCost = Integer.parseInt(crippleFrags.text.toString())
                val skillSelect = Integer.parseInt(crippleSpinner.selectedItem.toString())

                //Math
                crippleInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                crippleFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Decapitate Skill
        decapitateSpinner.adapter = tenBuyListArrayAdapter
        decapitateSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(decapitateCP.text.toString())
                val fragCost = Integer.parseInt(decapitateFrags.text.toString())
                val skillSelect = Integer.parseInt(decapitateSpinner.selectedItem.toString())

                decapitateInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                decapitateFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Dirt in the Eye Skill
        dirtEyeSpinner.adapter = tenBuyListArrayAdapter
        dirtEyeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(dirtEyeCP.text.toString())
                val fragCost = Integer.parseInt(dirtEyeFrags.text.toString())
                val skillSelect = Integer.parseInt(dirtEyeSpinner.selectedItem.toString())

                //Math
                dirtEyeInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                dirtEyeFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Trip Skill
        tripSpinner.adapter = tenBuyListArrayAdapter
        tripSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(tripCP.text.toString())
                val fragCost = Integer.parseInt(tripFrags.text.toString())
                val skillSelect = Integer.parseInt(tripSpinner.selectedItem.toString())

                //Math
                tripInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                tripFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Whirl of Blows Skill
        whirlBlowsSpinner.adapter = tenBuyListArrayAdapter
        whirlBlowsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(whirlBlowsCP.text.toString())
                val fragCost = Integer.parseInt(whirlBlowsFrags.text.toString())
                val skillSelect = Integer.parseInt(whirlBlowsSpinner.selectedItem.toString())

                //Math
                whirlBlowsInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
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
        garroteSpinner.adapter = oneBuyListArrayAdapter
        garroteSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(garroteCP.text.toString())
                val skillSelect = Integer.parseInt(garroteSpinner.selectedItem.toString())

                //Math
                garroteInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sap Skill
        sapSpinner.adapter = tenBuyListArrayAdapter
        sapSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(sapCP.text.toString())
                val skillSelect = Integer.parseInt(sapSpinner.selectedItem.toString())

                //Math
                sapInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Vital Blow Skill
        vitalBlowSpinner.adapter = tenBuyListArrayAdapter
        vitalBlowSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(vitalBlowCP.text.toString())
                val skillSelect = Integer.parseInt(vitalBlowSpinner.selectedItem.toString())

                //Math
                vitalBlowInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Dodge Skill
        dodgeSpinner.adapter = tenBuyListArrayAdapter
        dodgeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(dodgeCP.text.toString())
                val skillSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())

                dodgeInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Specific Crit +2 Skill
        specificCritSpinner.adapter = tenBuyListArrayAdapter
        specificCritSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(specificCritCP.text.toString())
                val skillSelect = Integer.parseInt(specificCritSpinner.selectedItem.toString())

                groupCritSelect = Integer.parseInt(groupCritSpinner.selectedItem.toString())
                dodgeSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())
                executeSelect = Integer.parseInt(executeSpinner.selectedItem.toString())
                executeMstrSelect = Integer.parseInt(executeMstrSpinner.selectedItem.toString())

                if (characterClass == "Nightblade") {
                    level3Select = Integer.parseInt(level3Spinner.selectedItem.toString())

                    if (dodgeSelect > skillSelect) {
                        if (skillSelect > groupCritSelect && skillSelect > level3Select) {
                            dodgeSelect = skillSelect
                        }
                        else {
                            if (groupCritSelect >= level3Select) {
                                dodgeSelect = groupCritSelect
                            } else if (level3Select >= groupCritSelect)
                                dodgeSelect = level3Select
                        }
                        dodgeSpinner.setSelection(dodgeSelect)
                    }

                    if (skillSelect > groupCritSelect && skillSelect > level3Select) {
                        if (skillSelect == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (skillSelect == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                    else if (skillSelect <= groupCritSelect && skillSelect <= level3Select && groupCritSelect >= level3Select) {
                        if (groupCritSelect == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (groupCritSelect == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (groupCritSelect == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                    else if (skillSelect <= groupCritSelect && skillSelect <= level3Select && groupCritSelect <= level3Select) {
                        if (level3Select == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (level3Select == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                } // End if (characterClass == "Nightblade")

                if (dodgeSelect > skillSelect) {
                    if (skillSelect >= groupCritSelect) {
                        dodgeSelect = skillSelect
                    }
                    else if (skillSelect <= groupCritSelect) {
                        dodgeSelect = groupCritSelect
                    }
                    dodgeSpinner.setSelection(dodgeSelect)
                }

                if (executeSelect > skillSelect) {
                    if (skillSelect >= groupCritSelect) {
                        executeSelect = skillSelect
                    }
                    else if (skillSelect <= groupCritSelect) {
                        executeSelect = groupCritSelect
                    }
                    executeSpinner.setSelection(executeSelect)
                }

                if (skillSelect >= groupCritSelect) {
                    if (skillSelect == 0){
                        dodgeSpinner.isEnabled = false
                        dodgeSpinner.setSelection(0)
                        dodgeInt = 0
                        executeSpinner.isEnabled = false
                        executeSpinner.setSelection(0)
                        executeInt = 0
                    }
                    if (skillSelect == 1) {
                        dodgeSpinner.adapter = oneBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = oneBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 2) {
                        dodgeSpinner.adapter = twoBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = twoBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 3) {
                        dodgeSpinner.adapter = threeBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = threeBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 4) {
                        dodgeSpinner.adapter = fourBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fourBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 5) {
                        dodgeSpinner.adapter = fiveBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fiveBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 6) {
                        dodgeSpinner.adapter = sixBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sixBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 7) {
                        dodgeSpinner.adapter = sevenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sevenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 8) {
                        dodgeSpinner.adapter = eightBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = eightBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 9) {
                        dodgeSpinner.adapter = nineBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = nineBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (skillSelect == 10) {
                        dodgeSpinner.adapter = tenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = tenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                }
                else if (skillSelect <= groupCritSelect) {
                    if (groupCritSelect == 0){
                        dodgeSpinner.isEnabled = false
                        dodgeSpinner.setSelection(0)
                        dodgeInt = 0
                        executeSpinner.isEnabled = false
                        executeSpinner.setSelection(0)
                        executeInt = 0
                    }
                    if (groupCritSelect == 1) {
                        dodgeSpinner.adapter = oneBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = oneBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 2) {
                        dodgeSpinner.adapter = twoBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = twoBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 3) {
                        dodgeSpinner.adapter = threeBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = threeBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 4) {
                        dodgeSpinner.adapter = fourBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fourBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 5) {
                        dodgeSpinner.adapter = fiveBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fiveBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 6) {
                        dodgeSpinner.adapter = sixBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sixBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 7) {
                        dodgeSpinner.adapter = sevenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sevenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 8) {
                        dodgeSpinner.adapter = eightBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = eightBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 9) {
                        dodgeSpinner.adapter = nineBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = nineBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (groupCritSelect == 10) {
                        dodgeSpinner.adapter = tenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = tenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                }

                specificCritInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Group Crit +2 Skill
        groupCritSpinner.adapter = tenBuyListArrayAdapter
        groupCritSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(groupCritCP.text.toString())
                val skillSelect = Integer.parseInt(groupCritSpinner.selectedItem.toString())

                specificCritSelect = Integer.parseInt(specificCritSpinner.selectedItem.toString())
                dodgeSelect = Integer.parseInt(dodgeSpinner.selectedItem.toString())
                executeSelect = Integer.parseInt(executeSpinner.selectedItem.toString())
                executeMstrSelect = Integer.parseInt(executeMstrSpinner.selectedItem.toString())

                if (characterClass == "Nightblade") {
                    level3Select = Integer.parseInt(level3Spinner.selectedItem.toString())

                    if (dodgeSelect > skillSelect) {
                        if (skillSelect > specificCritSelect && skillSelect > level3Select) {
                            dodgeSelect = skillSelect
                        }
                        else {
                            if (specificCritSelect >= level3Select) {
                                dodgeSelect = specificCritSelect
                            } else if (level3Select >= specificCritSelect)
                                dodgeSelect = level3Select
                        }
                        dodgeSpinner.setSelection(dodgeSelect)
                    }

                    if (skillSelect > specificCritSelect && skillSelect > level3Select) {
                        if (skillSelect == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (skillSelect == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (skillSelect == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                    else if (skillSelect <= specificCritSelect && skillSelect <= level3Select && specificCritSelect >= level3Select) {
                        if (specificCritSelect == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (specificCritSelect == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (specificCritSelect == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                    else if (skillSelect <= specificCritSelect && skillSelect <= level3Select && specificCritSelect <= level3Select) {
                        if (level3Select == 0){
                            dodgeSpinner.isEnabled = false
                            dodgeSpinner.setSelection(0)
                            dodgeInt = 0
                        }
                        if (level3Select == 1) {
                            dodgeSpinner.adapter = oneBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 2) {
                            dodgeSpinner.adapter = twoBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 3) {
                            dodgeSpinner.adapter = threeBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 4) {
                            dodgeSpinner.adapter = fourBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 5) {
                            dodgeSpinner.adapter = fiveBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 6) {
                            dodgeSpinner.adapter = sixBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 7) {
                            dodgeSpinner.adapter = sevenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 8) {
                            dodgeSpinner.adapter = eightBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 9) {
                            dodgeSpinner.adapter = nineBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                        else if (level3Select == 10) {
                            dodgeSpinner.adapter = tenBuyListArrayAdapter
                            dodgeSpinner.isEnabled = true
                            dodgeSpinner.setSelection(dodgeSelect)
                        }
                    }
                } // End if (characterClass == "Nightblade")

                if (executeSelect > skillSelect) {
                    if (skillSelect >= specificCritSelect) {
                        executeSelect = skillSelect
                    }
                    else if (skillSelect <= specificCritSelect) {
                        executeSelect = specificCritSelect
                    }
                    executeSpinner.setSelection(executeSelect)
                }

                if (dodgeSelect > skillSelect) {
                    if (skillSelect >= specificCritSelect) {
                        dodgeSelect = skillSelect
                    }
                    else if (skillSelect <= specificCritSelect) {
                        dodgeSelect = specificCritSelect
                    }
                    dodgeSpinner.setSelection(dodgeSelect)
                }

                if (executeMstrSelect > skillSelect) {
                    executeMstrSelect = skillSelect
                    executeMstrSpinner.setSelection(executeMstrSelect)
                }

                if (skillSelect > specificCritSelect) {
                    if (skillSelect == 0){
                        dodgeSpinner.isEnabled = false
                        dodgeSpinner.setSelection(0)
                        dodgeInt = 0
                        executeSpinner.isEnabled = false
                        executeSpinner.setSelection(0)
                        executeInt = 0
                        executeMstrSpinner.isEnabled = false
                        executeMstrSpinner.setSelection(0)
                        executeMstrInt = 0
                    }
                    if (skillSelect == 1) {
                        dodgeSpinner.adapter = oneBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = oneBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = oneBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 2) {
                        dodgeSpinner.adapter = twoBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = twoBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = twoBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 3) {
                        dodgeSpinner.adapter = threeBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = threeBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = threeBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 4) {
                        dodgeSpinner.adapter = fourBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fourBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = fourBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 5) {
                        dodgeSpinner.adapter = fiveBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fiveBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = fiveBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 6) {
                        dodgeSpinner.adapter = sixBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sixBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = sixBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 7) {
                        dodgeSpinner.adapter = sevenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sevenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = sevenBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 8) {
                        dodgeSpinner.adapter = eightBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = eightBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = eightBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 9) {
                        dodgeSpinner.adapter = nineBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = nineBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = nineBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 10) {
                        dodgeSpinner.adapter = tenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = tenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                        executeMstrSpinner.adapter = tenBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                }
                else if (skillSelect <= specificCritSelect) {
                    if (specificCritSelect == 0){
                        dodgeSpinner.isEnabled = false
                        dodgeSpinner.setSelection(0)
                        dodgeInt = 0
                        executeSpinner.isEnabled = false
                        executeSpinner.setSelection(0)
                        executeInt = 0
                    }
                    if (specificCritSelect == 1) {
                        dodgeSpinner.adapter = oneBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = oneBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 2) {
                        dodgeSpinner.adapter = twoBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = twoBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 3) {
                        dodgeSpinner.adapter = threeBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = threeBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 4) {
                        dodgeSpinner.adapter = fourBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fourBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 5) {
                        dodgeSpinner.adapter = fiveBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = fiveBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 6) {
                        dodgeSpinner.adapter = sixBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sixBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 7) {
                        dodgeSpinner.adapter = sevenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = sevenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 8) {
                        dodgeSpinner.adapter = eightBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = eightBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 9) {
                        dodgeSpinner.adapter = nineBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = nineBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }
                    else if (specificCritSelect == 10) {
                        dodgeSpinner.adapter = tenBuyListArrayAdapter
                        dodgeSpinner.isEnabled = true
                        dodgeSpinner.setSelection(dodgeSelect)
                        executeSpinner.adapter = tenBuyListArrayAdapter
                        executeSpinner.isEnabled = true
                        executeSpinner.setSelection(executeSelect)
                    }

                    if (skillSelect == 0){
                        executeMstrSpinner.isEnabled = false
                        executeMstrSpinner.setSelection(0)
                        executeMstrInt = 0
                    }
                    if (skillSelect == 1) {
                        executeMstrSpinner.adapter = oneBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 2) {
                        executeMstrSpinner.adapter = twoBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 3) {
                        executeMstrSpinner.adapter = threeBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 4) {
                        executeMstrSpinner.adapter = fourBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 5) {
                        executeMstrSpinner.adapter = fiveBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 6) {
                        executeMstrSpinner.adapter = sixBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 7) {
                        executeMstrSpinner.adapter = sevenBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 8) {
                        executeMstrSpinner.adapter = eightBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 9) {
                        executeMstrSpinner.adapter = nineBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                    else if (skillSelect == 10) {
                        executeMstrSpinner.adapter = tenBuyListArrayAdapter
                        executeMstrSpinner.isEnabled = true
                        executeMstrSpinner.setSelection(executeMstrSelect)
                    }
                }

                groupCritInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Execute Skill
        executeSpinner.adapter = tenBuyListArrayAdapter
        executeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(executeCP.text.toString())
                val skillSelect = Integer.parseInt(executeSpinner.selectedItem.toString())

                //Math
                executeInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Execute Master Skill
        executeMstrSpinner.adapter = tenBuyListArrayAdapter
        executeMstrSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(executeMstrCP.text.toString())
                val skillSelect = Integer.parseInt(executeMstrSpinner.selectedItem.toString())

                //Math
                executeMstrInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Rogue Frag Skills

        //Spinner for Blindfighter Skill
        blindfighterSpinner.adapter = tenBuyListArrayAdapter
        blindfighterSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(blindfighterCP.text.toString())
                val fragCost = Integer.parseInt(blindfighterFrags.text.toString())
                val skillSelect = Integer.parseInt(blindfighterSpinner.selectedItem.toString())

                //Math
                blindfighterInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                blindfighterFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Escape Skill
        escapeSpinner.adapter = tenBuyListArrayAdapter
        escapeSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(escapeCP.text.toString())
                val fragCost = Integer.parseInt(escapeFrags.text.toString())
                val skillSelect = Integer.parseInt(escapeSpinner.selectedItem.toString())

                //Math
                escapeInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                escapeFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Riposte Skill
        riposteSpinner.adapter = tenBuyListArrayAdapter
        riposteSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(riposteCP.text.toString())
                val fragCost = Integer.parseInt(riposteFrags.text.toString())
                val skillSelect = Integer.parseInt(riposteSpinner.selectedItem.toString())

                //Math
                riposteInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                riposteFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sucker Punch Skill
        suckerPunchSpinner.adapter = tenBuyListArrayAdapter
        suckerPunchSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(suckerPunchCP.text.toString())
                val fragCost = Integer.parseInt(suckerPunchFrags.text.toString())
                val skillSelect = Integer.parseInt(suckerPunchSpinner.selectedItem.toString())

                //Math
                suckerPunchInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                suckerPunchFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Thieves' Cant Skill
        thievesCantSpinner.adapter = oneBuyListArrayAdapter
        thievesCantSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(thievesCantCP.text.toString())
                val fragCost = Integer.parseInt(thievesCantFrags.text.toString())
                val skillSelect = Integer.parseInt(thievesCantSpinner.selectedItem.toString())

                //Math
                thievesCantInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                thievesCantFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Tumble Skill
        tumbleSpinner.adapter = tenBuyListArrayAdapter
        tumbleSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(tumbleCP.text.toString())
                val fragCost = Integer.parseInt(tumbleFrags.text.toString())
                val skillSelect = Integer.parseInt(tumbleSpinner.selectedItem.toString())

                //Math
                tumbleInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
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
        mysticismSpinner.adapter = tenBuyListArrayAdapter
        mysticismSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(mysticismCP.text.toString())
                val skillSelect = Integer.parseInt(mysticismSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        hindsightSpinner.isEnabled = false
                        hindsightSpinner.setSelection(0)
                        hindsightInt = 0
                        hindsightFragsInt = 0
                    }
                    else -> hindsightSpinner.isEnabled = true
                }

                mysticismInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Demonic/Angelic Arts Skill
        demAngArtsSpinner.adapter = oneBuyListArrayAdapter
        demAngArtsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(demAngArtsCP.text.toString())
                val skillSelect = Integer.parseInt(demAngArtsSpinner.selectedItem.toString())

                //Math
                demAngArtsInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Necromantic Arts Skill
        necroArtsSpinner.adapter = oneBuyListArrayAdapter
        necroArtsSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(necroArtsCP.text.toString())
                val skillSelect = Integer.parseInt(necroArtsSpinner.selectedItem.toString())

                //Math
                necroArtsInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Anatomy Skill
        anatomySpinner.adapter = oneBuyListArrayAdapter
        anatomySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(anatomyCP.text.toString())
                val skillSelect = Integer.parseInt(anatomySpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        firstAidSpinner.isEnabled = false
                        firstAidSpinner.setSelection(0)
                        firstAidInt = 0
                    }
                    else -> firstAidSpinner.isEnabled = true
                }

                when (skillSelect) {
                    0 -> {
                        morticianSpinner.isEnabled = false
                        morticianSpinner.setSelection(0)
                        morticianInt = 0
                        morticianFragsInt = 0
                    }
                    else -> morticianSpinner.isEnabled = true
                }

                anatomyInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for First Aid Skill
        firstAidSpinner.adapter = oneBuyListArrayAdapter
        firstAidSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(firstAidCP.text.toString())
                val skillSelect = Integer.parseInt(firstAidSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        physicianSpinner.isEnabled = false
                        physicianSpinner.setSelection(0)
                        physicianInt = 0
                    }
                    else -> physicianSpinner.isEnabled = true
                }

                firstAidInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Physician Skill
        physicianSpinner.adapter = tenBuyListArrayAdapter
        physicianSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(physicianCP.text.toString())
                val skillSelect = Integer.parseInt(physicianSpinner.selectedItem.toString())

                //Math
                physicianInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read/Write Skill
        readWriteSpinner.adapter = oneBuyListArrayAdapter
        readWriteSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(readWriteCP.text.toString())
                val skillSelect = Integer.parseInt(readWriteSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        readMagicSpinner.isEnabled = false
                        readMagicSpinner.setSelection(0)
                        readMagicInt = 0
                    }
                    else -> readMagicSpinner.isEnabled = true
                }

                readWriteInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read Magic Skill
        readMagicSpinner.adapter = oneBuyListArrayAdapter
        readMagicSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(readMagicCP.text.toString())
                val skillSelect = Integer.parseInt(readMagicSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        scrollcraftingSpinner.isEnabled = false
                        scrollcraftingSpinner.setSelection(0)
                        scrollcraftingInt = 0
                    }
                    else -> scrollcraftingSpinner.isEnabled = true
                }

                when (skillSelect) {
                    0 -> {
                        rdAdvMagicSpinner.isEnabled = false
                        rdAdvMagicSpinner.setSelection(0)
                        rdAdvMagicInt = 0
                    }
                    else -> rdAdvMagicSpinner.isEnabled = true
                }

                when (skillSelect) {
                    0 -> {
                        sphere1Spinner.isEnabled = false
                        sphere1Spinner.setSelection(0)
                        sphere1Int = 0
                    }
                    else -> sphere1Spinner.isEnabled = true
                }

                readMagicInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read Advanced Magic Skill
        rdAdvMagicSpinner.adapter = oneBuyListArrayAdapter
        rdAdvMagicSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(rdAdvMagicCP.text.toString())
                val skillSelect = Integer.parseInt(rdAdvMagicSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> {
                        rdRitualMagicSpinner.isEnabled = false
                        rdRitualMagicSpinner.setSelection(0)
                        rdRitualMagicInt = 0
                    }
                    else -> rdRitualMagicSpinner.isEnabled = true
                }

                rdAdvMagicInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Read Ritual Magic Skill
        rdRitualMagicSpinner.adapter = oneBuyListArrayAdapter
        rdRitualMagicSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(rdRitualMagicCP.text.toString())
                val skillSelect = Integer.parseInt(rdRitualMagicSpinner.selectedItem.toString())

                slot9Select = Integer.parseInt(slot9Spinner.selectedItem.toString())

                if (skillSelect == 0 || slot9Select == 0){
                    ritualSpinner.isEnabled = false
                    ritualSpinner.setSelection(0)
                    ritualInt = 0
                }
                else{
                    ritualSpinner.isEnabled = true
                }

                rdRitualMagicInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
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
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Scholar Frag Skills

        //Spinner for Combat Wizardry Skill
        combatWizSpinner.adapter = oneBuyListArrayAdapter
        combatWizSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(combatWizCP.text.toString())
                val fragCost = Integer.parseInt(combatWizFrags.text.toString())
                val skillSelect = Integer.parseInt(combatWizSpinner.selectedItem.toString())

                //Math
                combatWizInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                combatWizFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Harvest Skill
        harvestSpinner.adapter = tenBuyListArrayAdapter
        harvestSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(harvestCP.text.toString())
                val fragCost = Integer.parseInt(harvestFrags.text.toString())
                val skillSelect = Integer.parseInt(harvestSpinner.selectedItem.toString())

                //Math
                harvestInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                harvestFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Mortician Skill
        morticianSpinner.adapter = oneBuyListArrayAdapter
        morticianSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(morticianCP.text.toString())
                val fragCost = Integer.parseInt(morticianFrags.text.toString())
                val skillSelect = Integer.parseInt(morticianSpinner.selectedItem.toString())

                //Math
                morticianInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                morticianFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Refocus Skill
        refocusSpinner.adapter = tenBuyListArrayAdapter
        refocusSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(refocusCP.text.toString())
                val fragCost = Integer.parseInt(refocusFrags.text.toString())
                val skillSelect = Integer.parseInt(refocusSpinner.selectedItem.toString())

                //Math
                refocusInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                refocusFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Parry Skill
        spellParrySpinner.adapter = oneBuyListArrayAdapter
        spellParrySpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(spellParryCP.text.toString())
                val fragCost = Integer.parseInt(spellParryFrags.text.toString())
                val skillSelect = Integer.parseInt(spellParrySpinner.selectedItem.toString())

                //Math
                spellParryInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                spellParryFragsInt = fragCost * skillSelect
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill
        var spellVersSkillSelect = 0
        spellVersSpinner.adapter = tenBuyListArrayAdapter
        spellVersSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                spellVersSkillSelect = Integer.parseInt(spellVersSpinner.selectedItem.toString())

                if (spellVersSkillSelect == 1) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE

                    spellVersSlot2.visibility = View.GONE
                    spellVersSlotSpinner2.visibility = View.GONE
                    spellVersSlot3.visibility = View.GONE
                    spellVersSlotSpinner3.visibility = View.GONE
                    spellVersSlot4.visibility = View.GONE
                    spellVersSlotSpinner4.visibility = View.GONE
                    spellVersSlot5.visibility = View.GONE
                    spellVersSlotSpinner5.visibility = View.GONE
                    spellVersSlot6.visibility = View.GONE
                    spellVersSlotSpinner6.visibility = View.GONE
                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner2.setSelection(0)
                    spellVersSlotSpinner3.setSelection(0)
                    spellVersSlotSpinner4.setSelection(0)
                    spellVersSlotSpinner5.setSelection(0)
                    spellVersSlotSpinner6.setSelection(0)
                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers2Int = 0
                    spellVers3Int = 0
                    spellVers4Int = 0
                    spellVers5Int = 0
                    spellVers6Int = 0
                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags2Int = 0
                    spellVersFrags3Int = 0
                    spellVersFrags4Int = 0
                    spellVersFrags5Int = 0
                    spellVersFrags6Int = 0
                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 2) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE

                    spellVersSlot3.visibility = View.GONE
                    spellVersSlotSpinner3.visibility = View.GONE
                    spellVersSlot4.visibility = View.GONE
                    spellVersSlotSpinner4.visibility = View.GONE
                    spellVersSlot5.visibility = View.GONE
                    spellVersSlotSpinner5.visibility = View.GONE
                    spellVersSlot6.visibility = View.GONE
                    spellVersSlotSpinner6.visibility = View.GONE
                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner3.setSelection(0)
                    spellVersSlotSpinner4.setSelection(0)
                    spellVersSlotSpinner5.setSelection(0)
                    spellVersSlotSpinner6.setSelection(0)
                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers3Int = 0
                    spellVers4Int = 0
                    spellVers5Int = 0
                    spellVers6Int = 0
                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags3Int = 0
                    spellVersFrags4Int = 0
                    spellVersFrags5Int = 0
                    spellVersFrags6Int = 0
                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 3) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE

                    spellVersSlot4.visibility = View.GONE
                    spellVersSlotSpinner4.visibility = View.GONE
                    spellVersSlot5.visibility = View.GONE
                    spellVersSlotSpinner5.visibility = View.GONE
                    spellVersSlot6.visibility = View.GONE
                    spellVersSlotSpinner6.visibility = View.GONE
                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner4.setSelection(0)
                    spellVersSlotSpinner5.setSelection(0)
                    spellVersSlotSpinner6.setSelection(0)
                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers4Int = 0
                    spellVers5Int = 0
                    spellVers6Int = 0
                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags4Int = 0
                    spellVersFrags5Int = 0
                    spellVersFrags6Int = 0
                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 4) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE

                    spellVersSlot5.visibility = View.GONE
                    spellVersSlotSpinner5.visibility = View.GONE
                    spellVersSlot6.visibility = View.GONE
                    spellVersSlotSpinner6.visibility = View.GONE
                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner5.setSelection(0)
                    spellVersSlotSpinner6.setSelection(0)
                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers5Int = 0
                    spellVers6Int = 0
                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags5Int = 0
                    spellVersFrags6Int = 0
                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 5) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE
                    spellVersSlot5.visibility = View.VISIBLE
                    spellVersSlotSpinner5.visibility = View.VISIBLE

                    spellVersSlotSpinner6.visibility = View.GONE
                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner6.setSelection(0)
                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers6Int = 0
                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags6Int = 0
                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 6) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE
                    spellVersSlot5.visibility = View.VISIBLE
                    spellVersSlotSpinner5.visibility = View.VISIBLE
                    spellVersSlot6.visibility = View.VISIBLE
                    spellVersSlotSpinner6.visibility = View.VISIBLE

                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 7) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE
                    spellVersSlot5.visibility = View.VISIBLE
                    spellVersSlotSpinner5.visibility = View.VISIBLE
                    spellVersSlot6.visibility = View.VISIBLE
                    spellVersSlotSpinner6.visibility = View.VISIBLE
                    spellVersSlot7.visibility = View.VISIBLE
                    spellVersSlotSpinner7.visibility = View.VISIBLE

                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 8) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE
                    spellVersSlot5.visibility = View.VISIBLE
                    spellVersSlotSpinner5.visibility = View.VISIBLE
                    spellVersSlot6.visibility = View.VISIBLE
                    spellVersSlotSpinner6.visibility = View.VISIBLE
                    spellVersSlot7.visibility = View.VISIBLE
                    spellVersSlotSpinner7.visibility = View.VISIBLE
                    spellVersSlot8.visibility = View.VISIBLE
                    spellVersSlotSpinner8.visibility = View.VISIBLE

                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 9) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE
                    spellVersSlot5.visibility = View.VISIBLE
                    spellVersSlotSpinner5.visibility = View.VISIBLE
                    spellVersSlot6.visibility = View.VISIBLE
                    spellVersSlotSpinner6.visibility = View.VISIBLE
                    spellVersSlot7.visibility = View.VISIBLE
                    spellVersSlotSpinner7.visibility = View.VISIBLE
                    spellVersSlot8.visibility = View.VISIBLE
                    spellVersSlotSpinner8.visibility = View.VISIBLE
                    spellVersSlot9.visibility = View.VISIBLE
                    spellVersSlotSpinner9.visibility = View.VISIBLE

                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner10.setSelection(0)

                    spellVers10Int = 0

                    spellVersFrags10Int = 0
                }
                else if (spellVersSkillSelect == 10) {
                    spellVersSlot1.visibility = View.VISIBLE
                    spellVersSlotSpinner1.visibility = View.VISIBLE
                    spellVersSlot2.visibility = View.VISIBLE
                    spellVersSlotSpinner2.visibility = View.VISIBLE
                    spellVersSlot3.visibility = View.VISIBLE
                    spellVersSlotSpinner3.visibility = View.VISIBLE
                    spellVersSlot4.visibility = View.VISIBLE
                    spellVersSlotSpinner4.visibility = View.VISIBLE
                    spellVersSlot5.visibility = View.VISIBLE
                    spellVersSlotSpinner5.visibility = View.VISIBLE
                    spellVersSlot6.visibility = View.VISIBLE
                    spellVersSlotSpinner6.visibility = View.VISIBLE
                    spellVersSlot7.visibility = View.VISIBLE
                    spellVersSlotSpinner7.visibility = View.VISIBLE
                    spellVersSlot8.visibility = View.VISIBLE
                    spellVersSlotSpinner8.visibility = View.VISIBLE
                    spellVersSlot9.visibility = View.VISIBLE
                    spellVersSlotSpinner9.visibility = View.VISIBLE
                    spellVersSlot10.visibility = View.VISIBLE
                    spellVersSlotSpinner10.visibility = View.VISIBLE
                }
                else {
                    spellVersSlot1.visibility = View.GONE
                    spellVersSlotSpinner1.visibility = View.GONE
                    spellVersSlot2.visibility = View.GONE
                    spellVersSlotSpinner2.visibility = View.GONE
                    spellVersSlot3.visibility = View.GONE
                    spellVersSlotSpinner3.visibility = View.GONE
                    spellVersSlot4.visibility = View.GONE
                    spellVersSlotSpinner4.visibility = View.GONE
                    spellVersSlot5.visibility = View.GONE
                    spellVersSlotSpinner5.visibility = View.GONE
                    spellVersSlot6.visibility = View.GONE
                    spellVersSlotSpinner6.visibility = View.GONE
                    spellVersSlot7.visibility = View.GONE
                    spellVersSlotSpinner7.visibility = View.GONE
                    spellVersSlot8.visibility = View.GONE
                    spellVersSlotSpinner8.visibility = View.GONE
                    spellVersSlot9.visibility = View.GONE
                    spellVersSlotSpinner9.visibility = View.GONE
                    spellVersSlot10.visibility = View.GONE
                    spellVersSlotSpinner10.visibility = View.GONE

                    spellVersSlotSpinner1.setSelection(0)
                    spellVersSlotSpinner2.setSelection(0)
                    spellVersSlotSpinner3.setSelection(0)
                    spellVersSlotSpinner4.setSelection(0)
                    spellVersSlotSpinner5.setSelection(0)
                    spellVersSlotSpinner6.setSelection(0)
                    spellVersSlotSpinner7.setSelection(0)
                    spellVersSlotSpinner8.setSelection(0)
                    spellVersSlotSpinner9.setSelection(0)
                    spellVersSlotSpinner10.setSelection(0)

                    spellVersInt = 0
                    spellVers1Int = 0
                    spellVers2Int = 0
                    spellVers3Int = 0
                    spellVers4Int = 0
                    spellVers5Int = 0
                    spellVers6Int = 0
                    spellVers7Int = 0
                    spellVers8Int = 0
                    spellVers9Int = 0
                    spellVers10Int = 0

                    spellVersFragsInt = 0
                    spellVersFrags1Int = 0
                    spellVersFrags2Int = 0
                    spellVersFrags3Int = 0
                    spellVersFrags4Int = 0
                    spellVersFrags5Int = 0
                    spellVersFrags6Int = 0
                    spellVersFrags7Int = 0
                    spellVersFrags8Int = 0
                    spellVersFrags9Int = 0
                    spellVersFrags10Int = 0
                }
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Spinner for Spell Versatility Skill SLOT 1
        spellVersSlotSpinner1.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner1.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 2
        spellVersSlotSpinner2.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner2.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 3
        spellVersSlotSpinner3.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner3.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 4
        spellVersSlotSpinner4.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner4.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 5
        spellVersSlotSpinner5.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner5.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 6
        spellVersSlotSpinner6.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner6.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 7
        spellVersSlotSpinner7.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner7.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 8
        spellVersSlotSpinner8.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner8.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 9
        spellVersSlotSpinner9.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner9.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Versatility Skill SLOT 10
        spellVersSlotSpinner10.adapter = nineBuyListArrayAdapter
        spellVersSlotSpinner10.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                versatilityCalc()

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Spell Switch Skill
        spellSwitchSpinner.adapter = tenBuyListArrayAdapter
        spellSwitchSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(spellSwitchCP.text.toString())
                val fragCost = Integer.parseInt(spellSwitchFrags.text.toString())
                val skillSelect = Integer.parseInt(spellSwitchSpinner.selectedItem.toString())

                //Math
                spellSwitchInt = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
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
                val cpCost = Integer.parseInt(sphere1CP.text.toString())
                val sphereSelect = sphere1Spinner.selectedItem.toString()
                var fragCost = 0

                if (sphereSelect == "None") {
                        sphere2Spinner.isEnabled = false
                        sphere2Spinner.setSelection(0)
                        sphere2Int = 0
                }
                else {
                        sphere2Spinner.isEnabled = true
                }

                sphereSelect2 = sphere2Spinner.selectedItem.toString()
                sphereSelect3 = sphere3Spinner.selectedItem.toString()

                if (sphereSelect == "Elemental" || sphereSelect2 == "Elemental" || sphereSelect3 == "Elemental") {
                    eleAttuneSpinner.isEnabled = true
                }
                else {
                    eleAttuneSpinner.isEnabled = false
                    eleAttuneSpinner.setSelection(0)
                    eleAttuneInt = 0
                }

                if (sphereSelect != "None") {
                    if (sphereSelect == "*Sigil"){
                        fragCost = 100
                    }
                    else if (sphereSelect == "*Wytchcraft"){
                        fragCost = 100
                    }
                    else if (sphereSelect == "*Necromancy"){
                        fragCost = 100
                    }
                    else{
                        fragCost = 0
                    }

                    sphere1Int = cpCost
                }
                else{
                    sphere1Int = 0
                }

                slot1Select = Integer.parseInt(slot1Spinner.selectedItem.toString())

                if (sphereSelect == "None") {
                    slot1Spinner.isEnabled = false
                    slot1Spinner.setSelection(0)
                    slot1Int = 0
                    slot2Spinner.isEnabled = false
                    slot2Spinner.setSelection(0)
                    slot2Int = 0
                    slot3Spinner.isEnabled = false
                    slot3Spinner.setSelection(0)
                    slot3Int = 0
                    slot4Spinner.isEnabled = false
                    slot4Spinner.setSelection(0)
                    slot4Int = 0
                    slot5Spinner.isEnabled = false
                    slot5Spinner.setSelection(0)
                    slot5Int = 0
                    slot6Spinner.isEnabled = false
                    slot6Spinner.setSelection(0)
                    slot6Int = 0
                    slot7Spinner.isEnabled = false
                    slot7Spinner.setSelection(0)
                    slot7Int = 0
                    slot8Spinner.isEnabled = false
                    slot8Spinner.setSelection(0)
                    slot8Int = 0
                    slot9Spinner.isEnabled = false
                    slot9Spinner.setSelection(0)
                    slot9Int = 0
                }
                else{
                    slot1Spinner.isEnabled = true
                    slot2Spinner.isEnabled = true
                    slot3Spinner.isEnabled = true
                    slot4Spinner.isEnabled = true
                    slot5Spinner.isEnabled = true
                    slot6Spinner.isEnabled = true
                    slot7Spinner.isEnabled = true
                    slot8Spinner.isEnabled = true
                    slot9Spinner.isEnabled = true
                }

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                sphere1FragsInt = fragCost
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sphere 2 Skill
        sphere2Spinner.adapter = sphereArrayAdapter
        sphere2Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(sphere2CP.text.toString())
                val sphereSelect = sphere2Spinner.selectedItem.toString()
                var fragCost = 0

                if (sphereSelect == "None") {
                    sphere3Spinner.isEnabled = false
                    sphere3Spinner.setSelection(0)
                    sphere3Int = 0
                }
                else {
                    sphere3Spinner.isEnabled = true
                }

                sphereSelect1 = sphere1Spinner.selectedItem.toString()
                sphereSelect3 = sphere3Spinner.selectedItem.toString()

                if (sphereSelect == "Elemental" || sphereSelect1 == "Elemental" || sphereSelect3 == "Elemental") {
                    eleAttuneSpinner.isEnabled = true
                }
                else {
                    eleAttuneSpinner.isEnabled = false
                    eleAttuneSpinner.setSelection(0)
                    eleAttuneInt = 0
                }

                if (sphereSelect != "None") {
                    if (sphereSelect == "*Sigil"){
                        fragCost = 100
                    }
                    else if (sphereSelect == "*Wytchcraft"){
                        fragCost = 100
                    }
                    else if (sphereSelect == "*Necromancy"){
                        fragCost = 100
                    }
                    else{
                        fragCost = 0
                    }

                    sphere2Int = cpCost
                }
                else{
                    sphere2Int = 0
                }

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                sphere2FragsInt = fragCost
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Sphere 3 Skill
        sphere3Spinner.adapter = sphereArrayAdapter
        sphere3Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(sphere3CP.text.toString())
                val sphereSelect = sphere3Spinner.selectedItem.toString()
                var fragCost = 0

                sphereSelect1 = sphere1Spinner.selectedItem.toString()
                sphereSelect2 = sphere2Spinner.selectedItem.toString()

                if (sphereSelect == "Elemental" || sphereSelect1 == "Elemental" || sphereSelect2 == "Elemental") {
                    eleAttuneSpinner.isEnabled = true
                }
                else {
                    eleAttuneSpinner.isEnabled = false
                    eleAttuneSpinner.setSelection(0)
                    eleAttuneInt = 0
                }

                if (sphereSelect != "None") {
                    if (sphereSelect == "*Sigil"){
                        fragCost = 100
                    }
                    else if (sphereSelect == "*Wytchcraft"){
                        fragCost = 100
                    }
                    else if (sphereSelect == "*Necromancy"){
                        fragCost = 100
                    }
                    else{
                        fragCost = 0
                    }

                    sphere3Int = cpCost
                }
                else{
                    sphere3Int = 0
                }

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)

                sphere3FragsInt = fragCost
                calculateFragCost()
                characterFrags.setText("" + characterFragsInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //Slot Spinners

        //Spinner for Slot 1 Skill
        slot1Spinner.adapter = tenBuyListArrayAdapter
        slot1Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot1CP.text.toString())
                val skillSelect = Integer.parseInt(slot1Spinner.selectedItem.toString())

                slot1Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 2 Skill
        slot2Spinner.adapter = tenBuyListArrayAdapter
        slot2Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot2CP.text.toString())
                val skillSelect = Integer.parseInt(slot2Spinner.selectedItem.toString())

                slot2Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 3 Skill
        slot3Spinner.adapter = tenBuyListArrayAdapter
        slot3Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot3CP.text.toString())
                val skillSelect = Integer.parseInt(slot3Spinner.selectedItem.toString())

                slot3Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 4 Skill
        slot4Spinner.adapter = tenBuyListArrayAdapter
        slot4Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot4CP.text.toString())
                val skillSelect = Integer.parseInt(slot4Spinner.selectedItem.toString())

                slot4Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 5 Skill
        slot5Spinner.adapter = tenBuyListArrayAdapter
        slot5Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot5CP.text.toString())
                val skillSelect = Integer.parseInt(slot5Spinner.selectedItem.toString())

                slot5Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 6 Skill
        slot6Spinner.adapter = tenBuyListArrayAdapter
        slot6Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot6CP.text.toString())
                val skillSelect = Integer.parseInt(slot6Spinner.selectedItem.toString())

                slot6Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 7 Skill
        slot7Spinner.adapter = tenBuyListArrayAdapter
        slot7Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot7CP.text.toString())
                val skillSelect = Integer.parseInt(slot7Spinner.selectedItem.toString())

                slot7Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 8 Skill
        slot8Spinner.adapter = tenBuyListArrayAdapter
        slot8Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot8CP.text.toString())
                val skillSelect = Integer.parseInt(slot8Spinner.selectedItem.toString())

                slot8Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Slot 9 Skill
        slot9Spinner.adapter = tenBuyListArrayAdapter
        slot9Spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(slot9CP.text.toString())
                val skillSelect = Integer.parseInt(slot9Spinner.selectedItem.toString())

                rdRitualMagicSelect = Integer.parseInt(rdRitualMagicSpinner.selectedItem.toString())

                if (skillSelect == 0 || rdRitualMagicSelect == 0){
                    ritualSpinner.isEnabled = false
                    ritualSpinner.setSelection(0)
                    ritualInt = 0
                }
                else{
                    ritualSpinner.isEnabled = true
                }

                slot9Int = cpCost * skillSelect
                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        //Spinner for Ritual Slot Skill
        ritualSpinner.adapter = tenBuyListArrayAdapter
        ritualSpinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val cpCost = Integer.parseInt(ritualCP.text.toString())
                val skillSelect = Integer.parseInt(ritualSpinner.selectedItem.toString())

                when (skillSelect) {
                    0 -> ritualInt = 0
                    1 -> ritualInt = cpCost
                    2 -> ritualInt = (cpCost * skillSelect) + (cpCost)
                    3 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2)
                    4 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3)
                    5 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3) + (cpCost * 4)
                    6 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3) + (cpCost * 4) + (cpCost * 5)
                    7 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3) + (cpCost * 4) + (cpCost * 5) + (cpCost * 6)
                    8 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3) + (cpCost * 4) + (cpCost * 5) + (cpCost * 6) + (cpCost * 7)
                    9 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3) + (cpCost * 4) + (cpCost * 5) + (cpCost * 6) + (cpCost * 7) + (cpCost * 8)
                    10 -> ritualInt = (cpCost * skillSelect) + (cpCost) + (cpCost * 2) + (cpCost * 3) + (cpCost * 4) + (cpCost * 5) + (cpCost * 6) + (cpCost * 7) + (cpCost * 8) + (cpCost * 9)
                }

                calculateSpentCP()
                calculateFreeCP()

                characterFree.setText("" + freeInt)
                characterSpent.setText("" + characterSpentInt)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }


    }// override fun onCreate

    fun paragonCalc() {
        val paragonSlotSpinner = findViewById<Spinner>(id.paragonSlotSpinner)
        val slot1CP = findViewById<TextView>(id.slot1CP)
        val slot2CP = findViewById<TextView>(id.slot2CP)
        val slot3CP = findViewById<TextView>(id.slot3CP)
        val slot4CP = findViewById<TextView>(id.slot4CP)
        val slot5CP = findViewById<TextView>(id.slot5CP)
        val slot6CP = findViewById<TextView>(id.slot6CP)
        val slot7CP = findViewById<TextView>(id.slot7CP)
        val slot8CP = findViewById<TextView>(id.slot8CP)
        val slot9CP = findViewById<TextView>(id.slot9CP)

        val skillSelect = Integer.parseInt(paragonSlotSpinner.selectedItem.toString())
        var slotCost1 = Integer.parseInt(slot1CP.text.toString())
        var slotCost2 = Integer.parseInt(slot2CP.text.toString())
        var slotCost3 = Integer.parseInt(slot3CP.text.toString())
        var slotCost4 = Integer.parseInt(slot4CP.text.toString())
        var slotCost5 = Integer.parseInt(slot5CP.text.toString())
        var slotCost6 = Integer.parseInt(slot6CP.text.toString())
        var slotCost7 = Integer.parseInt(slot7CP.text.toString())
        var slotCost8 = Integer.parseInt(slot8CP.text.toString())
        var slotCost9 = Integer.parseInt(slot9CP.text.toString())

        if (paragonFragsInt == 100){
            if (skillSelect == 0){
                paragonInt = 0
            }
            else if (skillSelect == 1){
                paragonInt = slotCost1 + 10
            }
            else if (skillSelect == 2){
                paragonInt = slotCost2 + 10
            }
            else if (skillSelect == 3){
                paragonInt = slotCost3 + 10
            }
            else if (skillSelect == 4){
                paragonInt = slotCost4 + 10
            }
            else if (skillSelect == 5){
                paragonInt = slotCost5 + 10
            }
            else if (skillSelect == 6){
                paragonInt = slotCost6 + 10
            }
            else if (skillSelect == 7){
                paragonInt = slotCost7 + 10
            }
            else if (skillSelect == 8){
                paragonInt = slotCost8 + 10
            }
            else if (skillSelect == 9){
                paragonInt = slotCost9 + 10
            }
        }
        else{
            paragonInt = 0
        }
    }

    fun versatilityCalc() {

        val spellVersSlotSpinner1 = findViewById<Spinner>(id.spellVersSlotSpinner1)
        val spellVersSlotSpinner2 = findViewById<Spinner>(id.spellVersSlotSpinner2)
        val spellVersSlotSpinner3 = findViewById<Spinner>(id.spellVersSlotSpinner3)
        val spellVersSlotSpinner4 = findViewById<Spinner>(id.spellVersSlotSpinner4)
        val spellVersSlotSpinner5 = findViewById<Spinner>(id.spellVersSlotSpinner5)
        val spellVersSlotSpinner6 = findViewById<Spinner>(id.spellVersSlotSpinner6)
        val spellVersSlotSpinner7 = findViewById<Spinner>(id.spellVersSlotSpinner7)
        val spellVersSlotSpinner8 = findViewById<Spinner>(id.spellVersSlotSpinner8)
        val spellVersSlotSpinner9 = findViewById<Spinner>(id.spellVersSlotSpinner9)
        val spellVersSlotSpinner10 = findViewById<Spinner>(id.spellVersSlotSpinner10)
        val slot1CP = findViewById<TextView>(id.slot1CP)
        val slot2CP = findViewById<TextView>(id.slot2CP)
        val slot3CP = findViewById<TextView>(id.slot3CP)
        val slot4CP = findViewById<TextView>(id.slot4CP)
        val slot5CP = findViewById<TextView>(id.slot5CP)
        val slot6CP = findViewById<TextView>(id.slot6CP)
        val slot7CP = findViewById<TextView>(id.slot7CP)
        val slot8CP = findViewById<TextView>(id.slot8CP)
        val slot9CP = findViewById<TextView>(id.slot9CP)

        val slotSelect1 = Integer.parseInt(spellVersSlotSpinner1.selectedItem.toString())
        val slotSelect2 = Integer.parseInt(spellVersSlotSpinner2.selectedItem.toString())
        val slotSelect3 = Integer.parseInt(spellVersSlotSpinner3.selectedItem.toString())
        val slotSelect4 = Integer.parseInt(spellVersSlotSpinner4.selectedItem.toString())
        val slotSelect5 = Integer.parseInt(spellVersSlotSpinner5.selectedItem.toString())
        val slotSelect6 = Integer.parseInt(spellVersSlotSpinner6.selectedItem.toString())
        val slotSelect7 = Integer.parseInt(spellVersSlotSpinner7.selectedItem.toString())
        val slotSelect8 = Integer.parseInt(spellVersSlotSpinner8.selectedItem.toString())
        val slotSelect9 = Integer.parseInt(spellVersSlotSpinner9.selectedItem.toString())
        val slotSelect10 = Integer.parseInt(spellVersSlotSpinner10.selectedItem.toString())
        var slotCost1 = Integer.parseInt(slot1CP.text.toString())
        var slotCost2 = Integer.parseInt(slot2CP.text.toString())
        var slotCost3 = Integer.parseInt(slot3CP.text.toString())
        var slotCost4 = Integer.parseInt(slot4CP.text.toString())
        var slotCost5 = Integer.parseInt(slot5CP.text.toString())
        var slotCost6 = Integer.parseInt(slot6CP.text.toString())
        var slotCost7 = Integer.parseInt(slot7CP.text.toString())
        var slotCost8 = Integer.parseInt(slot8CP.text.toString())
        var slotCost9 = Integer.parseInt(slot9CP.text.toString())

        //SLOT 1
        if (slotSelect1 == 0) {
            spellVers1Int = 0
            spellVersFrags1Int = 0
        }
        else if (slotSelect1 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers1Int = (slotCost1 / 2) + 5
            spellVersFrags1Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect1 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers1Int = (slotCost2 / 2) + 5
            spellVersFrags1Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect1 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers1Int = (slotCost3 / 2) + 5
            spellVersFrags1Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect1 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers1Int = (slotCost4 / 2) + 5
            spellVersFrags1Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect1 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers1Int = (slotCost5 / 2) + 5
            spellVersFrags1Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect1 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers1Int = (slotCost6 / 2) + 5
            spellVersFrags1Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect1 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers1Int = (slotCost7 / 2) + 5
            spellVersFrags1Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect1 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers1Int = (slotCost8 / 2) + 5
            spellVersFrags1Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect1 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers1Int = (slotCost9 / 2) + 5
            spellVersFrags1Int = (slotCost9 / 2) + 5
        }

        //SLOT 2
        if (slotSelect2 == 0) {
            spellVers2Int = 0
            spellVersFrags2Int = 0
        }
        else if (slotSelect2 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers2Int = (slotCost1 / 2) + 5
            spellVersFrags2Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect2 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers2Int = (slotCost2 / 2) + 5
            spellVersFrags2Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect2 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers2Int = (slotCost3 / 2) + 5
            spellVersFrags2Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect2 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers2Int = (slotCost4 / 2) + 5
            spellVersFrags2Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect2 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers2Int = (slotCost5 / 2) + 5
            spellVersFrags2Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect2 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers2Int = (slotCost6 / 2) + 5
            spellVersFrags2Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect2 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers2Int = (slotCost7 / 2) + 5
            spellVersFrags2Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect2 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers2Int = (slotCost8 / 2) + 5
            spellVersFrags2Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect2 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers2Int = (slotCost9 / 2) + 5
            spellVersFrags2Int = (slotCost9 / 2) + 5
        }

        //SLOT 3
        if (slotSelect3 == 0) {
            spellVers3Int = 0
            spellVersFrags3Int = 0
        }
        else if (slotSelect3 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers3Int = (slotCost1 / 2) + 5
            spellVersFrags3Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect3 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers3Int = (slotCost2 / 2) + 5
            spellVersFrags3Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect3 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers3Int = (slotCost3 / 2) + 5
            spellVersFrags3Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect3 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers3Int = (slotCost4 / 2) + 5
            spellVersFrags3Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect3 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers3Int = (slotCost5 / 2) + 5
            spellVersFrags3Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect3 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers3Int = (slotCost6 / 2) + 5
            spellVersFrags3Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect3 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers3Int = (slotCost7 / 2) + 5
            spellVersFrags3Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect3 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers3Int = (slotCost8 / 2) + 5
            spellVersFrags3Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect3 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers3Int = (slotCost9 / 2) + 5
            spellVersFrags3Int = (slotCost9 / 2) + 5
        }

        //SLOT 4
        if (slotSelect4 == 0) {
            spellVers4Int = 0
            spellVersFrags4Int = 0
        }
        else if (slotSelect4 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers4Int = (slotCost1 / 2) + 5
            spellVersFrags4Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect4 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers4Int = (slotCost2 / 2) + 5
            spellVersFrags4Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect4 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers4Int = (slotCost3 / 2) + 5
            spellVersFrags4Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect4 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers4Int = (slotCost4 / 2) + 5
            spellVersFrags4Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect4 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers4Int = (slotCost5 / 2) + 5
            spellVersFrags4Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect4 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers4Int = (slotCost6 / 2) + 5
            spellVersFrags4Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect4 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers4Int = (slotCost7 / 2) + 5
            spellVersFrags4Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect4 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers4Int = (slotCost8 / 2) + 5
            spellVersFrags4Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect4 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers4Int = (slotCost9 / 2) + 5
            spellVersFrags4Int = (slotCost9 / 2) + 5
        }

        //SLOT 5
        if (slotSelect5 == 0) {
            spellVers5Int = 0
            spellVersFrags5Int = 0
        }
        else if (slotSelect5 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers5Int = (slotCost1 / 2) + 5
            spellVersFrags5Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect5 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers5Int = (slotCost2 / 2) + 5
            spellVersFrags5Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect5 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers5Int = (slotCost3 / 2) + 5
            spellVersFrags5Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect5 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers5Int = (slotCost4 / 2) + 5
            spellVersFrags5Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect5 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers5Int = (slotCost5 / 2) + 5
            spellVersFrags5Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect5 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers5Int = (slotCost6 / 2) + 5
            spellVersFrags5Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect5 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers5Int = (slotCost7 / 2) + 5
            spellVersFrags5Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect5 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers5Int = (slotCost8 / 2) + 5
            spellVersFrags5Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect5 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers5Int = (slotCost9 / 2) + 5
            spellVersFrags5Int = (slotCost9 / 2) + 5
        }

        //SLOT 6
        if (slotSelect6 == 0) {
            spellVers6Int = 0
            spellVersFrags6Int = 0
        }
        else if (slotSelect6 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers6Int = (slotCost1 / 2) + 5
            spellVersFrags6Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect6 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers6Int = (slotCost2 / 2) + 5
            spellVersFrags6Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect6 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers6Int = (slotCost3 / 2) + 5
            spellVersFrags6Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect6 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers6Int = (slotCost4 / 2) + 5
            spellVersFrags6Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect6 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers6Int = (slotCost5 / 2) + 5
            spellVersFrags6Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect6 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers6Int = (slotCost6 / 2) + 5
            spellVersFrags6Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect6 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers6Int = (slotCost7 / 2) + 5
            spellVersFrags6Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect6 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers6Int = (slotCost8 / 2) + 5
            spellVersFrags6Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect6 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers6Int = (slotCost9 / 2) + 5
            spellVersFrags6Int = (slotCost9 / 2) + 5
        }

        //SLOT 7
        if (slotSelect7 == 0) {
            spellVers7Int = 0
            spellVersFrags7Int = 0
        }
        else if (slotSelect7 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers7Int = (slotCost1 / 2) + 5
            spellVersFrags7Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect7 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers7Int = (slotCost2 / 2) + 5
            spellVersFrags7Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect7 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers7Int = (slotCost3 / 2) + 5
            spellVersFrags7Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect7 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers7Int = (slotCost4 / 2) + 5
            spellVersFrags7Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect7 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers7Int = (slotCost5 / 2) + 5
            spellVersFrags7Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect7 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers7Int = (slotCost6 / 2) + 5
            spellVersFrags7Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect7 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers7Int = (slotCost7 / 2) + 5
            spellVersFrags7Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect7 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers7Int = (slotCost8 / 2) + 5
            spellVersFrags7Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect7 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers7Int = (slotCost9 / 2) + 5
            spellVersFrags7Int = (slotCost9 / 2) + 5
        }

        //SLOT 8
        if (slotSelect8 == 0) {
            spellVers8Int = 0
            spellVersFrags8Int = 0
        }
        else if (slotSelect8 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers8Int = (slotCost1 / 2) + 5
            spellVersFrags8Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect8 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers8Int = (slotCost2 / 2) + 5
            spellVersFrags8Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect8 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers8Int = (slotCost3 / 2) + 5
            spellVersFrags8Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect8 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers8Int = (slotCost4 / 2) + 5
            spellVersFrags8Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect8 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers8Int = (slotCost5 / 2) + 5
            spellVersFrags8Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect8 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers8Int = (slotCost6 / 2) + 5
            spellVersFrags8Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect8 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers8Int = (slotCost7 / 2) + 5
            spellVersFrags8Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect8 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers8Int = (slotCost8 / 2) + 5
            spellVersFrags8Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect8 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers8Int = (slotCost9 / 2) + 5
            spellVersFrags8Int = (slotCost9 / 2) + 5
        }

        //SLOT 9
        if (slotSelect9 == 0) {
            spellVers9Int = 0
            spellVersFrags9Int = 0
        }
        else if (slotSelect9 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers9Int = (slotCost1 / 2) + 5
            spellVersFrags9Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect9 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers9Int = (slotCost2 / 2) + 5
            spellVersFrags9Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect9 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers9Int = (slotCost3 / 2) + 5
            spellVersFrags9Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect9 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers9Int = (slotCost4 / 2) + 5
            spellVersFrags9Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect9 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers9Int = (slotCost5 / 2) + 5
            spellVersFrags9Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect9 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers9Int = (slotCost6 / 2) + 5
            spellVersFrags9Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect9 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers9Int = (slotCost7 / 2) + 5
            spellVersFrags9Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect9 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers9Int = (slotCost8 / 2) + 5
            spellVersFrags9Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect9 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers9Int = (slotCost9 / 2) + 5
            spellVersFrags9Int = (slotCost9 / 2) + 5
        }

        //SLOT 10
        if (slotSelect10 == 0) {
            spellVers10Int = 0
            spellVersFrags10Int = 0
        }
        else if (slotSelect10 == 1){
            if (slotCost1 % 2 != 0) {
                slotCost1 = slotCost1 + 1
            }
            spellVers10Int = (slotCost1 / 2) + 5
            spellVersFrags10Int = (slotCost1 / 2) + 5
        }
        else if (slotSelect10 == 2){
            if (slotCost2 % 2 != 0) {
                slotCost2 = slotCost2 + 1
            }
            spellVers10Int = (slotCost2 / 2) + 5
            spellVersFrags10Int = (slotCost2 / 2) + 5
        }
        else if (slotSelect10 == 3){
            if (slotCost3 % 2 != 0) {
                slotCost3 = slotCost3 + 1
            }
            spellVers10Int = (slotCost3 / 2) + 5
            spellVersFrags10Int = (slotCost3 / 2) + 5
        }
        else if (slotSelect10 == 4){
            if (slotCost4 % 2 != 0) {
                slotCost4 = slotCost4 + 1
            }
            spellVers10Int = (slotCost4 / 2) + 5
            spellVersFrags10Int = (slotCost4 / 2) + 5
        }
        else if (slotSelect10 == 5){
            if (slotCost5 % 2 != 0) {
                slotCost5 = slotCost5 + 1
            }
            spellVers10Int = (slotCost5 / 2) + 5
            spellVersFrags10Int = (slotCost5 / 2) + 5
        }
        else if (slotSelect10 == 6){
            if (slotCost6 % 2 != 0) {
                slotCost6 = slotCost6 + 1
            }
            spellVers10Int = (slotCost6 / 2) + 5
            spellVersFrags10Int = (slotCost6 / 2) + 5
        }
        else if (slotSelect10 == 7){
            if (slotCost7 % 2 != 0) {
                slotCost7 = slotCost7 + 1
            }
            spellVers10Int = (slotCost7 / 2) + 5
            spellVersFrags10Int = (slotCost7 / 2) + 5
        }
        else if (slotSelect10 == 8){
            if (slotCost8 % 2 != 0) {
                slotCost8 = slotCost8 + 1
            }
            spellVers10Int = (slotCost8 / 2) + 5
            spellVersFrags10Int = (slotCost8 / 2) + 5
        }
        else if (slotSelect10 == 9){
            if (slotCost9 % 2 != 0) {
                slotCost9 = slotCost9 + 1
            }
            spellVers10Int = (slotCost9 / 2) + 5
            spellVersFrags10Int = (slotCost9 / 2) + 5
        }

    }

    //Calculate Level
    fun calculateLevelbyCP (){

        if (cpInt >= 150 && cpInt < 250){
            levelInt = 1
        }
        else if (cpInt >= 250 && cpInt < 350){
            levelInt = 2
        }
        else if (cpInt >= 350 && cpInt < 450){
            levelInt = 3
        }
        else if (cpInt >= 450 && cpInt < 550){
            levelInt = 4
        }
        else if (cpInt >= 550 && cpInt < 650){
            levelInt = 5
        }
        else if (cpInt >= 650 && cpInt < 750){
            levelInt = 6
        }
        else if (cpInt >= 750 && cpInt < 850){
            levelInt = 7
        }
        else if (cpInt >= 850 && cpInt < 950){
            levelInt = 8
        }
        else if (cpInt >= 950 && cpInt < 1050){
            levelInt = 9
        }
        else if (cpInt >= 1050 && cpInt < 1150){
            levelInt = 10
        }
        else if (cpInt >= 1150 && cpInt < 1250){
            levelInt = 11
        }
        else if (cpInt >= 1250 && cpInt < 1350){
            levelInt = 12
        }
        else if (cpInt >= 1350 && cpInt < 1450){
            levelInt = 13
        }
        else if (cpInt >= 1450 && cpInt < 1550){
            levelInt = 14
        }
        else if (cpInt >= 1550 && cpInt < 1650){
            levelInt = 15
        }
        else if (cpInt >= 1650 && cpInt < 1750){
            levelInt = 16
        }
        else if (cpInt >= 1750 && cpInt < 1850){
            levelInt = 17
        }
        else if (cpInt >= 1850 && cpInt < 1950){
            levelInt = 18
        }
        else if (cpInt >= 1950 && cpInt < 2050){
            levelInt = 19
        }
        else if (cpInt >= 2050 && cpInt < 2150){
            levelInt = 20
        }
        else if (cpInt >= 2150 && cpInt < 2250){
            levelInt = 21
        }
        else if (cpInt >= 2250 && cpInt < 2350){
            levelInt = 22
        }
        else if (cpInt >= 2350 && cpInt < 2450){
            levelInt = 23
        }
        else if (cpInt >= 2450 && cpInt < 2550){
            levelInt = 24
        }
        else if (cpInt >= 2550 && cpInt < 2650){
            levelInt = 25
        }
        else if (cpInt >= 2650 && cpInt < 2750){
            levelInt = 26
        }
        else if (cpInt >= 2750 && cpInt < 2850){
            levelInt = 27
        }
        else if (cpInt >= 2850 && cpInt < 2950){
            levelInt = 28
        }
        else if (cpInt >= 2950 && cpInt < 3050){
            levelInt = 29
        }
        else if (cpInt >= 3050 && cpInt < 3150){
            levelInt = 30
        }
        else {
            levelInt = 1
        }

    } //End calculate level by CP

    fun calculateLevelbyBlankets (){

        if (blanketsInt >= 0 && blanketsInt < 2){
            levelInt = 1
        }
        else if (blanketsInt >= 2 && blanketsInt < 4){
            levelInt = 2
        }
        else if (blanketsInt >= 4 && blanketsInt < 7){
            levelInt = 3
        }
        else if (blanketsInt >= 7 && blanketsInt < 10){
            levelInt = 4
        }
        else if (blanketsInt >= 10 && blanketsInt < 15){
            levelInt = 5
        }
        else if (blanketsInt >= 15 && blanketsInt < 19){
            levelInt = 6
        }
        else if (blanketsInt >= 19 && blanketsInt < 24){
            levelInt = 7
        }
        else if (blanketsInt >= 24 && blanketsInt <30){
            levelInt = 8
        }
        else if (blanketsInt >= 30 && blanketsInt < 36){
            levelInt = 9
        }
        else if (blanketsInt >= 36 && blanketsInt < 43){
            levelInt = 10
        }
        else if (blanketsInt >= 43 && blanketsInt < 50){
            levelInt = 11
        }
        else if (blanketsInt >= 50 && blanketsInt < 58){
            levelInt = 12
        }
        else if (blanketsInt >= 58 && blanketsInt < 66){
            levelInt = 13
        }
        else if (blanketsInt >= 66 && blanketsInt < 74){
            levelInt = 14
        }
        else if (blanketsInt >= 74 && blanketsInt < 83){
            levelInt = 15
        }
        else if (blanketsInt >= 83 && blanketsInt < 92){
            levelInt = 16
        }
        else if (blanketsInt >= 92 && blanketsInt < 102){
            levelInt = 17
        }
        else if (blanketsInt >= 102 && blanketsInt < 112){
            levelInt = 18
        }
        else if (blanketsInt >= 112 && blanketsInt < 122){
            levelInt = 19
        }
        else if (blanketsInt >= 122 && blanketsInt < 132){
            levelInt = 20
        }
        else if (blanketsInt >= 132 && blanketsInt < 142){
            levelInt = 21
        }
        else if (blanketsInt >= 142 && blanketsInt < 152){
            levelInt = 22
        }
        else if (blanketsInt >= 152 && blanketsInt < 162){
            levelInt = 23
        }
        else if (blanketsInt >= 162 && blanketsInt < 172){
            levelInt = 24
        }
        else if (blanketsInt >= 172 && blanketsInt < 182){
            levelInt = 25
        }
        else if (blanketsInt >= 182 && blanketsInt < 192){
            levelInt = 26
        }
        else if (blanketsInt >= 192 && blanketsInt < 202){
            levelInt = 27
        }
        else if (blanketsInt >= 202 && blanketsInt < 212){
            levelInt = 28
        }
        else if (blanketsInt >= 212 && blanketsInt < 222){
            levelInt = 29
        }
        else if (blanketsInt >= 222 && blanketsInt < 232){
            levelInt = 29
        }
        else {
            levelInt = 0
        }

    } //End calculate level by blankets

    // Calculate HP

    fun calculateHP (){
        val racialSpinner = findViewById<Spinner>(id.racialSpinner)
        val racialSelect = Integer.parseInt(racialSpinner.selectedItem.toString())

        when (characterClass) {

            //Warrior Classes
            "Mercenary" -> {
                hpInt = 6 + ((2 * levelInt) - 2)
            }
            "Ranger" -> {
                hpInt = 6 + ((2 * levelInt) - 2)
            }
            "Templar" -> {
                hpInt = 6 + ((2 * levelInt) - 2)
            }
            "Dread Knight" -> {
                hpInt = 6 + ((2 * levelInt) - 2)
            }
            "Paladin" -> {
                hpInt = 6 + ((2 * levelInt) - 2)
            }

            //Rogue Classes
            "Assassin" -> {
                hpInt = levelInt + 3
            }
            "Nightblade" -> {
                hpInt = levelInt + 3
            }
            "Witch Hunter" -> {
                hpInt = levelInt + 3
            }

            //Scholar Classes
            "Mage" -> {
                hpInt = 2 + levelInt - (levelInt / 3)
            }
            "Druid" -> {
                hpInt = 2 + levelInt - (levelInt / 3)
            }
            "Bard" -> {
                hpInt = 2 + levelInt - (levelInt / 3)
            }
            "Darkweaver" -> {
                hpInt = 2 + levelInt - (levelInt / 3)
            }
            "Lightweaver" -> {
                hpInt = 2 + levelInt - (levelInt / 3)
            }
            "Dragon Knight" -> {
                hpInt = 2 + levelInt - (levelInt / 3)
            }
            else -> {
                hpInt = 0
            }
        }

        if (characterRace == "Ogre"){
            hpInt = hpInt + ((levelInt * 2) + 3)
        }
        else if (characterRace == "Orc"){
            hpInt = hpInt + racialSelect
        }
        else if (characterRace == "Mountain Dwarf"){
            hpInt = hpInt + (5 * racialSelect)
        }

        hpInt = hpInt + bodyHP

    } //End calculate HP

    // Calculate Blankets

    fun calculateBlanketsbyLevel (){

        if (levelInt == 1){
            blanketsInt = 0
        }
        else if (levelInt == 2){
            blanketsInt = 2
        }
        else if (levelInt == 3){
            blanketsInt = 4
        }
        else if (levelInt == 4){
            blanketsInt = 7
        }
        else if (levelInt == 5){
            blanketsInt = 10
        }
        else if (levelInt == 6){
            blanketsInt = 15
        }
        else if (levelInt == 7){
            blanketsInt = 19
        }
        else if (levelInt == 8){
            blanketsInt = 24
        }
        else if (levelInt == 9){
            blanketsInt = 30
        }
        else if (levelInt == 10){
            blanketsInt = 36
        }
        else if (levelInt == 11){
            blanketsInt = 43
        }
        else if (levelInt == 12){
            blanketsInt = 50
        }
        else if (levelInt == 13){
            blanketsInt = 58
        }
        else if (levelInt == 14){
            blanketsInt = 66
        }
        else if (levelInt == 15){
            blanketsInt = 74
        }
        else if (levelInt == 16){
            blanketsInt = 83
        }
        else if (levelInt == 17){
            blanketsInt = 92
        }
        else if (levelInt == 18){
            blanketsInt = 102
        }
        else if (levelInt == 19){
            blanketsInt = 112
        }
        else if (levelInt == 20){
            blanketsInt = 122
        }
        else if (levelInt == 21){
            blanketsInt = 132
        }
        else if (levelInt == 22){
            blanketsInt = 142
        }
        else if (levelInt == 23){
            blanketsInt = 152
        }
        else if (levelInt == 24){
            blanketsInt = 162
        }
        else if (levelInt == 25){
            blanketsInt = 172
        }
        else if (levelInt == 26){
            blanketsInt = 182
        }
        else if (levelInt == 27){
            blanketsInt = 192
        }
        else if (levelInt == 28){
            blanketsInt = 202
        }
        else if (levelInt == 29){
            blanketsInt = 212
        }
        else if (levelInt == 30){
            blanketsInt = 222
        }
        else {
            blanketsInt = 0
        }

    } //End calculate blankets by level

    fun calculateBlanketsbyCP (){

        if (cpInt == 150){
            blanketsInt = 0
        }
        else if (cpInt == 215){
            blanketsInt = 1
        }
        else if (cpInt == 280){
            blanketsInt = 2
        }
        else if (cpInt == 323){
            blanketsInt = 3
        }
        else if (cpInt == 366){
            blanketsInt = 4
        }
        else if (cpInt == 400){
            blanketsInt = 5
        }
        else if (cpInt == 434){
            blanketsInt = 6
        }
        else if (cpInt == 468){
            blanketsInt = 7
        }
        else if (cpInt == 496){
            blanketsInt = 8
        }
        else if (cpInt == 524){
            blanketsInt = 9
        }
        else if (cpInt == 552){
            blanketsInt = 10
        }
        else if (cpInt == 576){
            blanketsInt = 11
        }
        else if (cpInt == 600){
            blanketsInt = 12
        }
        else if (cpInt == 624){
            blanketsInt = 13
        }
        else if (cpInt == 648){
            blanketsInt = 14
        }
        else if (cpInt == 672){
            blanketsInt = 15
        }
        else if (cpInt == 694){
            blanketsInt = 16
        }
        else if (cpInt == 716){
            blanketsInt = 17
        }
        else if (cpInt == 738){
            blanketsInt = 18
        }
        else if (cpInt == 760){
            blanketsInt = 19
        }
        else if (cpInt == 779){
            blanketsInt = 20
        }
        else if (cpInt == 798){
            blanketsInt = 21
        }
        else if (cpInt == 817){
            blanketsInt = 22
        }
        else if (cpInt == 836){
            blanketsInt = 23
        }
        else if (cpInt == 855){
            blanketsInt = 24
        }
        else if (cpInt == 872){
            blanketsInt = 25
        }
        else if (cpInt == 889){
            blanketsInt = 26
        }
        else if (cpInt == 906){
            blanketsInt = 27
        }
        else if (cpInt == 923){
            blanketsInt = 28
        }
        else if (cpInt == 940){
            blanketsInt = 29
        }
        else if (cpInt == 957){
            blanketsInt = 30
        }
        else if (cpInt == 973){
            blanketsInt = 31
        }
        else if (cpInt == 989){
            blanketsInt = 32
        }
        else if (cpInt == 1005){
            blanketsInt = 33
        }
        else if (cpInt == 1021){
            blanketsInt = 34
        }
        else if (cpInt == 1037){
            blanketsInt = 35
        }
        else if (cpInt == 1053){
            blanketsInt = 36
        }
        else if (cpInt == 1068){
            blanketsInt = 37
        }
        else if (cpInt == 1083){
            blanketsInt = 38
        }
        else if (cpInt == 1098){
            blanketsInt = 39
        }
        else if (cpInt == 1113){
            blanketsInt = 40
        }
        else if (cpInt == 1128){
            blanketsInt = 41
        }
        else if (cpInt == 1143){
            blanketsInt = 42
        }
        else if (cpInt == 1158){
            blanketsInt = 43
        }
        else if (cpInt == 1172){
            blanketsInt = 44
        }
        else if (cpInt == 1186){
            blanketsInt = 45
        }
        else if (cpInt == 1200){
            blanketsInt = 46
        }
        else if (cpInt == 1214){
            blanketsInt = 47
        }
        else if (cpInt == 1228){
            blanketsInt = 48
        }
        else if (cpInt == 1242){
            blanketsInt = 49
        }
        else if (cpInt == 1256){
            blanketsInt = 50
        }
        else if (cpInt == 1269){
            blanketsInt = 51
        }
        else if (cpInt == 1282){
            blanketsInt = 52
        }
        else if (cpInt == 1295){
            blanketsInt = 53
        }
        else if (cpInt == 1308){
            blanketsInt = 54
        }
        else if (cpInt == 1321){
            blanketsInt = 55
        }
        else if (cpInt == 1334){
            blanketsInt = 56
        }
        else if (cpInt == 1347){
            blanketsInt = 57
        }
        else if (cpInt == 1360){
            blanketsInt = 58
        }
        else if (cpInt == 1372){
            blanketsInt = 59
        }
        else if (cpInt == 1384){
            blanketsInt = 60
        }
        else if (cpInt == 1396){
            blanketsInt = 61
        }
        else if (cpInt == 1408){
            blanketsInt = 62
        }
        else if (cpInt == 1420){
            blanketsInt = 64
        }
        else if (cpInt == 1432){
            blanketsInt = 65
        }
        else if (cpInt == 1444){
            blanketsInt = 66
        }
        else if (cpInt == 1456){
            blanketsInt = 67
        }
        else if (cpInt == 1468){
            blanketsInt = 68
        }
        else if (cpInt == 1480){
            blanketsInt = 69
        }
        else if (cpInt == 1492){
            blanketsInt = 70
        }
        else if (cpInt == 1504){
            blanketsInt = 71
        }
        else if (cpInt == 1516){
            blanketsInt = 72
        }
        else if (cpInt == 1528){
            blanketsInt = 73
        }
        else if (cpInt == 1540){
            blanketsInt = 74
        }
        else if (cpInt == 1552){
            blanketsInt = 75
        }
        else if (cpInt == 1563){
            blanketsInt = 76
        }
        else if (cpInt == 1574){
            blanketsInt = 77
        }
        else if (cpInt == 1585){
            blanketsInt = 78
        }
        else if (cpInt == 1596){
            blanketsInt = 79
        }
        else if (cpInt == 1607){
            blanketsInt = 80
        }
        else if (cpInt == 1618){
            blanketsInt = 81
        }
        else if (cpInt == 1629){
            blanketsInt = 82
        }
        else if (cpInt == 1640){
            blanketsInt = 83
        }
        else if (cpInt == 1651){
            blanketsInt = 84
        }
        else if (cpInt == 1662){
            blanketsInt = 85
        }
        else if (cpInt == 1673){
            blanketsInt = 86
        }
        else if (cpInt == 1684){
            blanketsInt = 87
        }
        else if (cpInt == 1695){
            blanketsInt = 88
        }
        else if (cpInt == 1706){
            blanketsInt = 89
        }
        else if (cpInt == 1717){
            blanketsInt = 90
        }
        else if (cpInt == 1728){
            blanketsInt = 91
        }
        else if (cpInt == 1739){
            blanketsInt = 92
        }
        else if (cpInt == 1750){
            blanketsInt = 93
        }
        else if (cpInt > 1751 && cpInt <= 3150){
            blanketsInt = ((cpInt - 1750) / 10) + 93
        }
        else{
            blanketsInt = 0
        }

    } //End calculate blankets by CP

    // Calculate Total CP

    fun calculateTotalCPbyBlankets (){

        if (blanketsInt == 0){
            cpInt = 150
        }
        else if (blanketsInt == 1){
            cpInt = 215
        }
        else if (blanketsInt == 2){
            cpInt = 280
        }
        else if (blanketsInt == 3){
            cpInt = 323
        }
        else if (blanketsInt == 4){
            cpInt = 366
        }
        else if (blanketsInt == 5){
            cpInt = 400
        }
        else if (blanketsInt == 6){
            cpInt = 434
        }
        else if (blanketsInt == 7){
            cpInt = 468
        }
        else if (blanketsInt == 8){
            cpInt = 496
        }
        else if (blanketsInt == 9){
            cpInt = 524
        }
        else if (blanketsInt == 10){
            cpInt = 552
        }
        else if (blanketsInt == 11){
            cpInt = 576
        }
        else if (blanketsInt == 12){
            cpInt = 600
        }
        else if (blanketsInt == 13){
            cpInt = 624
        }
        else if (blanketsInt == 14){
            cpInt = 648
        }
        else if (blanketsInt == 15){
            cpInt = 672
        }
        else if (blanketsInt == 16){
            cpInt = 694
        }
        else if (blanketsInt == 17){
            cpInt = 716
        }
        else if (blanketsInt == 18){
            cpInt = 738
        }
        else if (blanketsInt == 19){
            cpInt = 760
        }
        else if (blanketsInt == 20){
            cpInt = 779
        }
        else if (blanketsInt == 21){
            cpInt = 798
        }
        else if (blanketsInt == 22){
            cpInt = 817
        }
        else if (blanketsInt == 23){
            cpInt = 836
        }
        else if (blanketsInt == 24){
            cpInt = 855
        }
        else if (blanketsInt == 25){
            cpInt = 872
        }
        else if (blanketsInt == 26){
            cpInt = 889
        }
        else if (blanketsInt == 27){
            cpInt = 906
        }
        else if (blanketsInt == 28){
            cpInt = 923
        }
        else if (blanketsInt == 29){
            cpInt = 940
        }
        else if (blanketsInt == 30){
            cpInt = 957
        }
        else if (blanketsInt == 31){
            cpInt = 973
        }
        else if (blanketsInt == 32){
            cpInt = 989
        }
        else if (blanketsInt == 33){
            cpInt = 1005
        }
        else if (blanketsInt == 34){
            cpInt = 1021
        }
        else if (blanketsInt == 35){
            cpInt = 1037
        }
        else if (blanketsInt == 36){
            cpInt = 1053
        }
        else if (blanketsInt == 37){
            cpInt = 1068
        }
        else if (blanketsInt == 38){
            cpInt = 1083
        }
        else if (blanketsInt == 39){
            cpInt = 1098
        }
        else if (blanketsInt == 40){
            cpInt = 1113
        }
        else if (blanketsInt == 41){
            cpInt = 1128
        }
        else if (blanketsInt == 42){
            cpInt = 1143
        }
        else if (blanketsInt == 43){
            cpInt = 1158
        }
        else if (blanketsInt == 44){
            cpInt = 1172
        }
        else if (blanketsInt == 45){
            cpInt = 1186
        }
        else if (blanketsInt == 46){
            cpInt = 1200
        }
        else if (blanketsInt == 47){
            cpInt = 1214
        }
        else if (blanketsInt == 48){
            cpInt = 1228
        }
        else if (blanketsInt == 49){
            cpInt = 1242
        }
        else if (blanketsInt == 50){
            cpInt = 1256
        }
        else if (blanketsInt == 51){
            cpInt = 1269
        }
        else if (blanketsInt == 52){
            cpInt = 1282
        }
        else if (blanketsInt == 53){
            cpInt = 1295
        }
        else if (blanketsInt == 54){
            cpInt = 1308
        }
        else if (blanketsInt == 55){
            cpInt = 1321
        }
        else if (blanketsInt == 56){
            cpInt = 1334
        }
        else if (blanketsInt == 57){
            cpInt = 1347
        }
        else if (blanketsInt == 58){
            cpInt = 1360
        }
        else if (blanketsInt == 59){
            cpInt = 1372
        }
        else if (blanketsInt == 60){
            cpInt = 1384
        }
        else if (blanketsInt == 61){
            cpInt = 1396
        }
        else if (blanketsInt == 62){
            cpInt = 1408
        }
        else if (blanketsInt == 63){
            cpInt = 1420
        }
        else if (blanketsInt == 64){
            cpInt = 1432
        }
        else if (blanketsInt == 65){
            cpInt = 1444
        }
        else if (blanketsInt == 66){
            cpInt = 1456
        }
        else if (blanketsInt == 67){
            cpInt = 1468
        }
        else if (blanketsInt == 68){
            cpInt = 1480
        }
        else if (blanketsInt == 69){
            cpInt = 1492
        }
        else if (blanketsInt == 70){
            cpInt = 1504
        }
        else if (blanketsInt == 71){
            cpInt = 1516
        }
        else if (blanketsInt == 72){
            cpInt = 1528
        }
        else if (blanketsInt == 73){
            cpInt = 1540
        }
        else if (blanketsInt == 74){
            cpInt = 1552
        }
        else if (blanketsInt == 75){
            cpInt = 1563
        }
        else if (blanketsInt == 76){
            cpInt = 1574
        }
        else if (blanketsInt == 77){
            cpInt = 1585
        }
        else if (blanketsInt == 78){
            cpInt = 1596
        }
        else if (blanketsInt == 79){
            cpInt = 1607
        }
        else if (blanketsInt == 80){
            cpInt = 1618
        }
        else if (blanketsInt == 81){
            cpInt = 1629
        }
        else if (blanketsInt == 82){
            cpInt = 1640
        }
        else if (blanketsInt == 83){
            cpInt = 1651
        }
        else if (blanketsInt == 84){
            cpInt = 1662
        }
        else if (blanketsInt == 85){
            cpInt = 1673
        }
        else if (blanketsInt == 86){
            cpInt = 1684
        }
        else if (blanketsInt == 87){
            cpInt = 1695
        }
        else if (blanketsInt == 88){
            cpInt = 1706
        }
        else if (blanketsInt == 89){
            cpInt = 1717
        }
        else if (blanketsInt == 90){
            cpInt = 1728
        }
        else if (blanketsInt == 91){
            cpInt = 1739
        }
        else if (blanketsInt == 92){
            cpInt = 1750
        }
        else {
            if (blanketsInt >= 93 && blanketsInt <= 231){
                cpInt = ((blanketsInt - 92) * 10) + 1750
            }
            else{
                cpInt = 150
            }
        }

        if (characterRace == "Human"){
            cpInt = cpInt + 50
        }

    } //End calculate total CP by blankets

    fun calculateTotalCPbyLevel(){

        if (levelInt > 30){
            levelInt = 1
        }

        cpInt = (levelInt * 100) + 50

    } // End calculate total CP by level

    fun calculateFreeCP (){
        freeInt = cpInt - characterSpentInt

    } //End calculate free CP

    // Cost x Spent For All CP
    fun spentCP (){
        //Math
        level3Int = level3Cost * level3Select
        level6Int = level6Cost * level6Select
        level9Int = level9Cost * level9Select
        level12Int = level12Cost * level12Select
        racialInt = racialCost * racialSelect
        bodyInt = bodyCost * bodySelect
        strengthInt = strengthCost * strengthSelect
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
        paragonCalc()
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
        spellVersInt = spellVers1Int + spellVers2Int + spellVers3Int + spellVers4Int + spellVers5Int + spellVers6Int + spellVers7Int + spellVers8Int + spellVers9Int + spellVers10Int
        spellSwitchInt = spellSwitchCost * spellSwitchSelect
        //Spheres and Slots
        sphere1Int = sphere1Cost * sphere1Select
        sphere2Int = sphere2Cost * sphere2Select
        sphere3Int = sphere3Cost * sphere3Select
        slot1Int = slot1Cost * slot1Select
        slot2Int = slot2Cost * slot2Select
        slot3Int = slot3Cost * slot3Select
        slot4Int = slot4Cost * slot4Select
        slot5Int = slot5Cost * slot5Select
        slot6Int = slot6Cost * slot6Select
        slot7Int = slot7Cost * slot7Select
        slot8Int = slot8Cost * slot8Select
        slot9Int = slot9Cost * slot9Select
        when (ritualSelect) {
            1 -> ritualInt = ritualCost
            2 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost)
            3 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2)
            4 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3)
            5 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3) + (ritualCost * 4)
            6 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3) + (ritualCost * 4) + (ritualCost * 5)
            7 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3) + (ritualCost * 4) + (ritualCost * 5) + (ritualCost * 6)
            8 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3) + (ritualCost * 4) + (ritualCost * 5) + (ritualCost * 6) + (ritualCost * 7)
            9 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3) + (ritualCost * 4) + (ritualCost * 5) + (ritualCost * 6) + (ritualCost * 7) + (ritualCost * 8)
            10 -> ritualInt = (ritualCost * ritualSelect) + (ritualCost) + (ritualCost * 2) + (ritualCost * 3) + (ritualCost * 4) + (ritualCost * 5) + (ritualCost * 6) + (ritualCost * 7) + (ritualCost * 8) + (ritualCost * 9)
        }
    } //fun spentCP

    fun calculateSpentCP() {
        spellVersInt = spellVers1Int + spellVers2Int + spellVers3Int + spellVers4Int + spellVers5Int + spellVers6Int + spellVers7Int + spellVers8Int + spellVers9Int + spellVers10Int

        characterSpentInt = favoredInt + level3Int + level6Int + level9Int + level12Int + racialInt + bodyInt + strengthInt + trapsmithInt + tradesmanInt + alchemyInt + chemistryInt + blacksmithingInt + artificeInt + scrollcraftingInt + coldHandsInt + createAlcoholInt + heavyDrinkerInt + hindsightInt + intuitionInt + lootingInt + paragonInt + possumInt + teacherInt + ambidexterityInt + florentineInt + flurryInt + heavyArmorInt + selfMutilateInt + shieldInt + weapRefocusInt + groupProfMedInt + groupProfLrgInt + profExoticInt + groupSpecInt + specificSpecInt + slayParryInt + slayParryMstrInt + battlefieldRepairInt + crippleInt + decapitateInt + dirtEyeInt + tripInt + whirlBlowsInt + garroteInt + sapInt + vitalBlowInt + dodgeInt + specificCritInt + groupCritInt + executeInt + executeMstrInt + blindfighterInt + escapeInt + riposteInt + suckerPunchInt + thievesCantInt + tumbleInt + mysticismInt + demAngArtsInt + necroArtsInt + anatomyInt + firstAidInt + physicianInt + readWriteInt + readMagicInt + rdAdvMagicInt + rdRitualMagicInt + eleAttuneInt + combatWizInt + harvestInt + morticianInt + refocusInt + spellParryInt + spellSwitchInt + spellVersInt + sphere1Int + sphere2Int + sphere3Int + slot1Int + slot2Int + slot3Int + slot4Int + slot5Int + slot6Int + slot7Int + slot8Int + slot9Int + ritualInt
    }

    // Cost x Spent For All Frags
    fun spentFrags() {

        coldHandsFragsInt = coldHandsFragCost * coldHandsSelect
        createAlcoholFragsInt = createAlcoholFragCost * createAlcoholSelect
        heavyDrinkerFragsInt = heavyDrinkerFragCost * heavyDrinkerSelect
        hindsightFragsInt = hindsightFragCost * hindsightSelect
        intuitionFragsInt = intuitionFragCost * intuitionSelect
        lootingFragsInt = lootingFragCost * lootingSelect
        paragonFragsInt = paragonFragCost * paragonSelect
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
        spellVersFragsInt = spellVersFrags1Int + spellVersFrags2Int + spellVersFrags3Int + spellVersFrags4Int + spellVersFrags5Int + spellVersFrags6Int + spellVersFrags7Int + spellVersFrags8Int + spellVersFrags9Int + spellVersFrags10Int
        spellSwitchFragsInt = spellSwitchFragCost * spellSwitchSelect
        sphere1FragsInt = sphere1FragCost * sphere1Select
        sphere2FragsInt = sphere2FragCost * sphere2Select
        sphere3FragsInt = sphere3FragCost * sphere3Select
    }

    fun calculateFragCost() {
        spellVersFragsInt = spellVersFrags1Int + spellVersFrags2Int + spellVersFrags3Int + spellVersFrags4Int + spellVersFrags5Int + spellVersFrags6Int + spellVersFrags7Int + spellVersFrags8Int + spellVersFrags9Int + spellVersFrags10Int

        characterFragsInt = cultureFragsInt + raceFragsInt + vocationFragsInt + favoredFragsInt + coldHandsFragsInt + createAlcoholFragsInt + heavyDrinkerFragsInt + hindsightFragsInt + intuitionFragsInt + lootingFragsInt + paragonFragsInt + possumFragsInt + teacherFragsInt + battlefieldRepairFragsInt + crippleFragsInt + decapitateFragsInt + dirtEyeFragsInt + tripFragsInt + whirlBlowsFragsInt + blindfighterFragsInt + escapeFragsInt + riposteFragsInt + suckerPunchFragsInt + thievesCantFragsInt + tumbleFragsInt + combatWizFragsInt + harvestFragsInt + morticianFragsInt + refocusFragsInt + spellParryFragsInt + spellSwitchFragsInt + spellVersFragsInt + sphere1FragsInt + sphere2FragsInt + sphere3FragsInt
    }

}// class:MainActivity
