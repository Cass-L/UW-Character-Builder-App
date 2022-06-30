package uwbuilder.underworld.characterbuilder

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GeneralSkillsInfo : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.general_skills_info)

        val autoRacialInfoTitle = findViewById<TextView>(R.id.autoRacialInfoTitle)
        val autoRacialInfo = findViewById<TextView>(R.id.autoRacialInfo)
        val racialInfoTitle = findViewById<TextView>(R.id.racialInfoTitle)
        val racialInfo = findViewById<TextView>(R.id.racialInfo)
        val racialDisInfoTitle = findViewById<TextView>(R.id.racialDisInfoTitle)
        val racialDisInfo = findViewById<TextView>(R.id.racialDisInfo)
        val level3InfoTitle = findViewById<TextView>(R.id.level3InfoTitle)
        val level3Info = findViewById<TextView>(R.id.level3Info)
        val level6InfoTitle = findViewById<TextView>(R.id.level6InfoTitle)
        val level6Info = findViewById<TextView>(R.id.level6Info)
        val level9InfoTitle = findViewById<TextView>(R.id.level9InfoTitle)
        val level9Info = findViewById<TextView>(R.id.level9Info)
        val level12InfoTitle = findViewById<TextView>(R.id.level12InfoTitle)
        val level12Info = findViewById<TextView>(R.id.level12Info)

        val moreTrapsmithButton = findViewById<Button>(R.id.moreTrapsmithButton)
        val moreAlchemyButton = findViewById<Button>(R.id.moreAlchemyButton)
        val moreChemistryButton = findViewById<Button>(R.id.moreChemistryButton)
        val moreBlacksmithButton = findViewById<Button>(R.id.moreBlacksmithButton)
        val moreArtificeButton = findViewById<Button>(R.id.moreArtificeButton)
        val moreScrollcraftButton = findViewById<Button>(R.id.moreScrollcraftButton)
        val closePopup = findViewById<Button>(R.id.closePopup)

        var characterRace = intent.getStringExtra("characterRace")
        var cultureFragsInt = intent.getIntExtra("cultureFragsInt", 0)
        var characterClass = intent.getStringExtra("characterClass")
        var characterVocation = intent.getStringExtra("characterVocation")

        when (characterVocation) {
            "Dread Knight" -> characterClass = characterVocation
            "Paladin" -> characterClass = characterVocation
            "Darkweaver" -> characterClass = characterVocation
            "Lightweaver" -> characterClass = characterVocation
            "Dragon Knight" -> characterClass = characterVocation
         }

        if (characterRace == "Savar'Aving"){
            autoRacialInfoTitle.text = "Natural Claws"
            autoRacialInfo.text = "\t\tSavar’Aving are all born with retractable claws. These claws can be retracted or " +
                    "extended on a 3 count. While the claws are extended, the Savar’Aving may not use any other weapons or shields." +
                    "Savar’Aving receive a free proficiency in <Medium Weapons Group Proficiency: Claws> and may use one claw " +
                    "weapon in their good hand and nothing in their off hand. They may buy specializations with them as Medium " +
                    "Weapon Specialization: Claws. Should a Savar’Aving purchase the skill “Ambidexterity”, they may use a second " +
                    "claw weapon in their off-hand. Savar’Aving claws act like normal medium weapons, with the exception that they " +
                    "cannot be destroyed or disarmed. Claws otherwise act like regular weapons for the purposes of augmentation; " +
                    "they may be made Master Crafted, Legendary, have alchemy applied to them, and so on. Augmentations must be " +
                    "done per claw. If the augmentation would normally be destroyed, destroying it simply returns the claws to their " +
                    "natural state. If the Savar’Aving resurrects, their claws will lose any augmentations applied to them."
            if (cultureFragsInt == 0) {
                racialInfoTitle.text = "Cat-Like Reflexes"
                racialInfo.text =
                    "\t\tA Savar’Aving with this ability can use their claws to swat away a single spell. " +
                            "By striking a spell packet with one of their claws, the Savar’Aving can call “Innate Cat-Like Reflexes!” and " +
                            "deflect the spell. This call can be made after the packet is blocked, as long as it is called within 3 seconds. If the " +
                            "packet then hits the Savar’Aving or anyone else, the spell will affect that person. This ability is usable once per " +
                            "day per purchase. As always, claw swings must be done safely according to the rules of weapon combat."
            }
            else {
                racialInfoTitle.text = "Redeemer's Claws"
                racialInfo.text =
                    "\t\tBy stating “Innate Redeemer’s Claws!”, a Taliss Pride member can " +
                            "swing for Magic damage with their claws for 10 minutes. If their claws are already magically enchanted " +
                            "(swinging Magic damage) they gain an additional “Magic Weakness” suffix effect to their swings during " +
                            "the 10 minutes. This effect will cause a strength loss of -8, lowering the target’s weapon swings by -4 to a " +
                            "minimum of 1. The Weakness will last one hour. The Redeemer’s Claws Weakness and Magic damage " +
                            "will only function against Undead that the Taliss Pride member has identified with Necromantic Arts or " +
                            "witnessed taking damage from Healing. This ability does not stack. This ability is usable once per day per " +
                            "purchase."
            }
            racialDisInfoTitle.text = "Plagued"
            racialDisInfo.text = "\t\tWhile the worst of the plague seems to have passed, its effects on the Savar’Aving people " +
                    "still linger. As a result, all living Savar’Aving take quadruple damage from Infliction. As with all racial " +
                    "vulnerabilities, Infliction damage will bypass any thresholds a Savar’Aving might have. Furthermore, should a " +
                    "Savar’Aving enter their Death Count via Infliction, they will immediately rise as a mindless lesser Undead. Once " +
                    "a Savar’Aving enters this form, their Death Count is immediately over and they cannot be brought back through " +
                    "any means, magical or otherwise. The Savar’Aving's Body points will be restored. This Undeath does not grant " +
                    "the Savar’Aving any of the special abilities of Undead, but they will have a Magic threshold and immunity to " +
                    "effects that target the mind or living body, such as charms, poisons and saps. However, they will still suffer all the " +
                    "negative effects such as Control Undead and quadruple damage from the Healing Sphere. While in this form, the " +
                    "Savar’Aving may not use their spells or abilities and may only swing base weapon damage. They are berserked " +
                    "and will attack anyone or anything around them for up to 10 minutes or until destroyed, at which point they will " +
                    "become a pile of ash"
        }
        else if (characterRace == "Gargylen"){
            autoRacialInfoTitle.text = "Alternative Healing"
            autoRacialInfo.text = "\t\tA Gargylen may be healed as if his/her body was made of armour. Every 1 " +
                    "minute of Blacksmithing will heal the Gargylen 10 Body. See the Blacksmithing skill for more detail. Should the " +
                    "Gargylen enter their “Bleed” count, any use of the Blacksmith skill to heal/Refit will pause the “Bleed” count " +
                    "much like the First Aid skill does. If the Blacksmith is interrupted, or stops Refitting the Gargylen, the attempt " +
                    "will fail and the Gargylen will continue their “Bleed” count from where s/he last left off. Any successful Refit " +
                    "while in the “Bleed” count will heal the Gargylen to 1 Body."

            racialInfoTitle.text = "Stone Skin"
            racialInfo.text = "\t\tA Gargylen who has purchased this skill has learned a finer degree of control over their " +
                    "crafted body. When the skill is used, the Gargylen’s skin becomes as hard as stone, making them less susceptible " +
                    "to all weapons. The Gargylen must declare “Innate Stone Skin” and proceed to complete a 30 second count. Once " +
                    "this count is completed, for the duration of 1 hour a Gargylen gains temporary Body points based on the " +
                    "Gargylen’s level. At 1st level the Body bonus is 20 Body points, at 5th level it is 30 and at 10th level it is 40." +
                    "These Body points act as normal Body points with the exception that they are damaged and removed first from " +
                    "the Gargylen’s Body point Total and cannot be healed or refit. While Stone Skin is active, the Gargylen suffers " +
                    "double damage from all spells that damage into Body, such as Ego Rend, etc. This double damage will extend " +
                    "past the bonus Body points allotted by Stone Skin and will carry over onto the Gargylen’s permanent Body points." +
                    "Stone Skin may be ended by the Gargylen with an uninterruptible 30 second count. A Gargylen’s Stone Skin will " +
                    "not affect, in any way, their Armour Points or any other magical or non-magical protections. This skill is usable " +
                    "once per day, per purchase."

            racialDisInfoTitle.text = "Healing Limitations"
            racialDisInfo.text = "\t\tAlthough a Gargylen possesses the same living organs as most other races, they " +
                    "are still part construct. As a result, the normal methods of healing and first aid will not function. A Gargylen may " +
                    "only heal damaged Body points with the Blacksmithing skill. Gargylen cannot have Body points restored by " +
                    "magic, Alchemy, or the First Aid/Physician skills, although First Aid may still be used to halt a Gargylen’s Bleed " +
                    "Count and raise them to 0 Body. A Life Spell will still function as normal."
        }
        else if (characterRace == "Mountain Dwarf"){
            autoRacialInfoTitle.text = "Resist Toxin"
            autoRacialInfo.text = "\t\tAllows the user to “Racial Resist Toxin” any toxin, alchemy, or disease, be it Magical " +
                    "or non-Magical in nature, once per day. The user may choose which toxin to resist and when. When a Resist " +
                    "Toxin goes off it gives off a white flash of light. As a racial benefit, it may be used to “Resist” Chemistry."

            racialInfoTitle.text = "Racial Body Bonus"
            racialInfo.text = "\t\tThis skill represents extra constitutional training the Mountain Dwarf has gone " +
                    "through, beyond what is standard for their race and grants +5 Body. This skill can only be purchased three times."

            racialDisInfoTitle.text = "Gas Globe and Magic Item Restriction"
            racialDisInfo.text = "\t\tDwarves have a hard time using magic items and " +
                    "alchemical gas globes, partially due to their clumsy and thick fingers and also because of their distaste for both. In " +
                    "dwarven culture, magic items with activation words are considered “cheating” and frowned upon. Gas globes are " +
                    "rarely used among dwarves due to their resistance to toxin. All dwarves must activate magical items twice in " +
                    "order to get a single use out of them. This does not use up two charges; instead they must state the incant twice in " +
                    "succession instead of once. This disadvantage does not apply to magic items which are “always on” or otherwise " +
                    "do not have activation requirements. Also, gas globes must be prepared for double the count it normally takes " +
                    "before they can be thrown."
        }
        else if (characterRace == "Dark Elf"){
            autoRacialInfoTitle.text = "Natural Chemists"
            autoRacialInfo.text = "\t\tDark Elves have a natural affinity for alchemy and are trained from an early age " +
                    "to use it offensively against rivals. All Dark Elves are capable of throwing alchemical gas globes and do not need " +
                    "to purchase any skills to do so."
            if (cultureFragsInt == 0) {
                racialInfoTitle.text = "Spite Blood"
                racialInfo.text = "\t\tGenerations of living underground and eating the local flora has caused Dark Elven " +
                        "blood to gain a slight toxicity. Drawing a small amount of blood and enhancing it with their talents as natural " +
                        "alchemists allows Dark Elves to produce a single dose of lethal toxin in the form of an alchemical gas globe. It " +
                        "takes 1 minute to draw enough blood to create a globe and does 1 Body point of damage to the Dark Elf. The " +
                        "globe can only be used by the Dark Elf who created it. When thrown, the Spite Blood globe will do 10 Normal " +
                        "Alchemical damage. A Dark Elf who has purchased Spite Blood multiple times may stack together up to three " +
                        "doses to create a single gas globe of increasing damage. These doses must be stacked at the time of creation and " +
                        "cannot be combined once manufactured. A single dose will do 10 damage, two doses mixed together will do 25 " +
                        "damage and finally 3 doses combined will do 50 damage. Spite Blood gas globes are considered blood for the " +
                        "purposes of Wytchcraft, vampires, etc. When thrown, the call is “Innate X Normal Alchemical” and can be " +
                        "resisted with standard anti-toxin defenses / resistances. Each purchase of this ability allows the creation of 1 dose" +
                        "per day. This alchemy will last for 5 days."
            }
            else {
                racialInfoTitle.text = "Control Lesser Undead"
                racialInfo.text = "\t\tMasters of undeath, House members of House Mortuus can " +
                        "innately control weaker undead, even if they are not spellcasters themselves. This can be done by stating " +
                        "“Innate Control Lesser Undead” and striking the target with a spell packet or via touch. It will temporarily " +
                        "override any existing control over a Lesser Undead. For one hour, the Undead will obey all commands, " +
                        "including suicide. Commands must be simple, such as “Defend me!”, “Kill them!” or “Don’t allow " +
                        "anyone to pass”. At the end of the hour the control fades. The ability is usable once per day per purchase."
            }
            racialDisInfoTitle.text = "Diurnal Vulnerability"
            racialDisInfo.text = "\t\tBetween the hours of 6 AM and 6 PM and while outside of darkness, Dark " +
                    "Elves may not be healed by any means other than by First Aid, Physician, and Life effects. If a Dark Elf enters an " +
                    "enclosed structure that includes a minimum of three walls plus ceiling for more than 10 minutes, they will regain " +
                    "their susceptibility to all forms of healing. Between the hours of 6 PM and 6 AM, Diurnal Vulnerability does not " +
                    "apply no matter the amount of light present."
        }
        else if (characterRace == "High Elf"){
            autoRacialInfoTitle.text = "Magical Aptitude"
            autoRacialInfo.text = "\t\tThis skill gives the High Elf one free Battle Magic spell-slot on character " +
                    "creation. This free spell-slot can be used to store any spell s/he can cast, up to their highest-level spell-slot. This " +
                    "free spell-slot in no way contributes to their pyramid or the prerequisites needed to raise it. Aside from that" +
                    "limitation, this free spell slot functions in every other way like a normal purchased slot. Example: A High Elf " +
                    "Mage with 1 purchased 4th level spell-slot may use Magical Aptitude to gain an additional 4th level or lower " +
                    "spell, determined at their reset."

            racialInfoTitle.text = "Resist Psionics"
            racialInfo.text = "\t\tAllows the user to “Racial Resist Psionics” any effect from " +
                    "the Psionics Sphere of Magic as well as all mind altering attacks. Mind altering attacks " +
                    "are considered effects which change your emotional state or control your mind in any " +
                    "way. Examples of mind altering effects are a Hobling’s Taunt ability, a Bard’s Songs of " +
                    "Aversion and Love, Confusion, Sleep, Enrage, Feeblemind, Forget, and Hallucinate, plus " +
                    "Ritual mind altering spells and monster effects which are mind altering. This may be " +
                    "used once per, day per purchase. "

            racialDisInfoTitle.text = "Death's Doors"
            racialDisInfo.text = "\t\tHigh Elves have always held a deep spiritual attunement to " +
                    "the forests and the land. Recent events have weakened this attunement, and in doing so " +
                    "have weakened the High Elves connection to the Spirit world. Should a High Elf enter " +
                    "their Death Count s/he will have 2 minutes less to receive a Life Spell than the time " +
                    "allotted to other races."
        }
        else if (characterRace == "Wild Elf"){
            autoRacialInfoTitle.text = "Chosen Enemy"
            autoRacialInfo.text = "\t\tUpon character creation, the Wild Elf must choose one Chosen Enemy racial group" +
                    "against which they are additionally effective. The reasons for this vary from Wild Elf to Wild Elf. Some Wild " +
                    "Elves despise a race that at some point has done great harm to them, their family or the natural balance of the " +
                    "forest. Others have learned to hunt their Chosen Enemy to support their tribe, with no particular emotional " +
                    "investment. A player can choose as their Chosen Enemy racial group one of the following: Angels/Demons, " +
                    "Animals, Bestial, Brood, Constructs, Draconic, Dwarves, Elementals, Elves, Fae, Goblinoids, Humanoids, Plants, " +
                    "Spirit, Undead (excluding vampires). The Chosen Enemy ability will grant the Wild Elf a +1 damage bonus on " +
                    "any melee or ranged weapon while fighting against their Chosen Enemy. This bonus will increase +1 for every 3 " +
                    "levels the Wild Elf gains. +1 at first level, +2 at fourth level, +3 at 7th level and so on. This damage bonus will " +
                    "not carry over to any other racial group, but does apply to any race within the racial group. For example, a Wild " +
                    "Elf with Chosen Enemy: Elves does bonus damage against Dark Elves, High Elves, Wild Elves, etc. If the Wild " +
                    "Elf isn’t certain whether a creature fits into their Chosen Enemy category, they may state, “Chosen Enemy " +
                    "<Type>?” and the creature will respond with yes or no. Some creatures are able to hide what kind of creature they " +
                    "are. In those cases, Chosen Enemy does not work. Chosen Enemy cannot be changed after character creation."
            if (cultureFragsInt == 0) {
                racialInfoTitle.text = "Nature's Cache"
                racialInfo.text = "\t\tOnce a day per purchase, a " +
                        "Wild Elf is able to construct a small temporary shelter for " +
                        "themselves and up to 4 allies chosen at the time of creation. " +
                        "This 10 foot by 10 foot area provides multiple benefits and " +
                        "lasts 1 hour or less. It can only be constructed outdoors, but " +
                        "functions on any terrain. To use it the Wild Elf should affix " +
                        "their Nature’s Cache tag to a location, which then becomes " +
                        "the center of the cache and state “Innate Nature’s Cache”.\n\n" +
                        "Hidden Scent: Those inside the cache are " +
                        "undetectable by hostile animals and insects.\n\n" +
                        "Forage: The Wild Elf can spend 10 minutes searching " +
                        "for healing herbs, which will provide 10 Healing" +
                        "points total, divided up as desired, to all within the " +
                        "shelter. These herbs will expire with the shelter if " +
                        "unused.\n\n" +
                        "The Pack: For the hour after the cache ends, all " +
                        "members of the camp will gain +1 damage with " +
                        "weapons against any opponent with which they all " +
                        "have simultaneous line of sight. This damage bonus " +
                        "does not stack with other uses of The Pack.\n\n" +
                        "Natural Intuition: While in the cache, the Wild Elf " +
                        "may query the surrounding lands, detecting its current " +
                        "state of being and any areas of impurity or corruption. " +
                        "This is a difficult task and is not always successful. " +
                        "The Wild Elf should attempt to find a Shaper prior or " +
                        "during the use of Nature’s Cache. If no Shaper is " +
                        "available, the lands are unclear with their answer."
            }
            else {
                racialInfoTitle.text = "Freedom of Movement"
                racialInfo.text = "\t\tThis ability grants the user Freedom of Movement for 1 minute, " +
                        "stating “Racial Freedom of Movement”, making them immune to effects which would immobilise or slow " +
                        "them. This ability is usable once per day per purchase."
            }
            racialDisInfoTitle.text = "Armor Restrictions"
            racialDisInfo.text = "\t\tViewed as abhorrence to nature, a Wild Elf will never equip Armour made " +
                    "primarily of steel, iron, or any other metal. This disadvantage does not apply to metal buckles, fasteners or studs " +
                    "used to hold or reinforce the Armour. This penalty does not apply to metal weapons, items and objects not used as " +
                    "Armour, but proper role-play should still be observed."
        }
        else if (characterRace == "Wood Fae"){
            autoRacialInfoTitle.text = "Lust for Life"
            autoRacialInfo.text = "\t\tA Wood Fae’s natural attunement to the forest and all things living has given them a " +
                    "lust for life that other races lack. Should a Wood Fae drop into their Bleed Count they are given a full two minutes " +
                    "before entering their Death Count rather than the standard one minute."

            racialInfoTitle.text = "Charm Break"
            racialInfo.text = "\t\tThis ability has two functions. Firstly, it can allow the user to “Racial Resist Charm” " +
                    "all charm-based attacks. Charm-based attacks are considered effects which instill friendship or loyalty. Specific " +
                    "examples of charms are a Bard’s Songs of Love, Charm, and Dominate plus Ritual charm spells and monster " +
                    "effects which are charm-based. Resisting in this manner uses up the ability. The second function is the ability to " +
                    "break an active charm effect on another person. This can only be accomplished through 10 seconds of talking to " +
                    "the Charmed character then declaring “Innate Charm Break” while touching them. Doing this uses up the skill for " +
                    "the day and creates a visible effect like any racial resistance does when it is used. Charm Break is usable once per " +
                    "day per purchase."

            racialDisInfoTitle.text = "Iron Aversion"
            racialDisInfo.text = "\t\tWood Fae will take double damage from any source using the suffix “Iron” in its " +
                    "damage call. Carrying iron items is permitted, but doing so will cause great discomfort and should be roleplayed " +
                    "accordingly. This disadvantage applies to damage taken to both Armour and Body. As with all racial " +
                    "vulnerabilities, iron damage will bypass any thresholds a Wood Fae might have."
        }
        else if (characterRace == "Orc"){
            autoRacialInfoTitle.text = "Immune to Fear"
            autoRacialInfo.text = "\t\tWhether brave or stupid, Orcs cannot suffer " +
                    "the effects of fear. The immunity is always active. Orcs should call ‘No " +
                    "Effect’ when fear effects are used on them."
            if (cultureFragsInt == 0) {
                racialInfoTitle.text = "Orcish Constitution"
                racialInfo.text = "\t\tPurchasing this racial grants an orc the combination of Strength Point Bonus " +
                        "and Body Point Bonus. Furthermore, when an Orc has 50% or less of their total natural Body points (rounded " +
                        "down) they gain +1 damage to all melee weapon swings. This skill may only be purchased once."
            }
            else {
                racialInfoTitle.text = "Brood Constitution"
                racialInfo.text = "\t\tThe Orc gains +1 Strength and subtracts 5 damage from all packet-delivered sources of acid to a minimum of 1. Once per day when the Orc has 50% or more of their total " +
                        "natural Body points (rounded up), they may spit a globule of their corrosive blood on a 3-count, which " +
                        "will deal “Innate Alchemical 5 Acid”. They must use an orange spell packet as if they were throwing an " +
                        "Alchemical Gas Globe. This skill may only be purchased once."
            }
            racialDisInfoTitle.text = "Charmable"
            racialDisInfo.text = "\t\tThe same mental toughness that grants Orcs immunity to fear also causes them to be " +
                    "susceptible to Charm effects. The Charm spell and Charm alchemy, as well as any Charm monster abilities will" +
                    "completely control the Orc. This means that instead of only being susceptible to friendly suggestions, the Orc will " +
                    "blindly follow any commands, including suicidal orders. These commands may include anything from killing a " +
                    "loved one to suicide. The commands can include forcing the victim to tell the truth as they know it (which may or " +
                    "may not be the OOG truth known by the player). A note to victims of this effect: You are never expected to do " +
                    "anything that makes you uncomfortable OOG. This includes but is not limited to being forced to do unsafe acts, " +
                    "actions of an inappropriate sexual nature or anything else that makes you uncomfortable for any reason, OOG." +
                    "Although the potency of the effect is increased, its duration is not and the Orc will have full memory of all events " +
                    "when the charm wears off or is remove by standard means.\n\n" +
                    "\t\tNote that this only applies to effects that copy the Charm spell specifically, not all charm-like effects such as " +
                    "Taunt, Song of Love, Dominate, etc. "
        }
        else if (characterRace == "Ajaunti"){
            autoRacialInfoTitle.text = "Eyes of the Mother"
            autoRacialInfo.text = "\t\tWhen the Blood Curse which prevented all Ajaunti from casting magic was " +
                    "removed, it was replaced with a boon by an unknown benefactor. Perhaps it was a benevolent God who felt pity " +
                    "on the Ajaunti for what was done to them, or perhaps it was the Ancestors of the Aja themselves. Whatever the " +
                    "source, Ajaunti cannot be surprised with violence, as if a greater power is always watching over them. All Aja are " +
                    "immune to the Surprise prefix. The defensive call for this ability is “Racial Foresight!”. It may be used at will."
            if (cultureFragsInt == 0) {
                racialInfoTitle.text = "Ancestor's Wisdom"
                racialInfo.text = "\t\tWhen heroism is required, the Ajaunti gift for inspiration can rake the coals of " +
                        "greatness in others. To initiate Ancestor’s Wisdom, the Ajaunti must tell a story of how one of their ancestors " +
                        "overcame adversity or performed an act of heroism to inspire those who listen. The story must last at least one " +
                        "minute but may go longer if desired. After the minute has passed, the Ajaunti may then choose one or more " +
                        "targets from the audience to receive a boon from the ancestors. This is done by touching the forehead of the " +
                        "listener and declaring “Innate Ancestor’s Wisdom (Type)”. The nature of the story told will determine what " +
                        "wisdom the Ajaunti is trying to pass along to their audience and all recipients must be granted the same type of " +
                        "boon. If a second Ajaunti is present during the story, they may add to the story to increase the potency of the " +
                        "boon. The Ajaunti assisting in the story must either speak for one additional minute or must play music during the " +
                        "tale. The assistant does not need to expend their own use of Ancestor’s Wisdom to participate. If over 10 Aja " +
                        "members of the same clan (including the Aja using Ancestor’s Wisdom plus their assistant) are present for the " +
                        "ceremony, it will become even more powerful. These additional clan members may participate or may simply " +
                        "observe. Ancestor’s Wisdom may be used once a day per purchase, but each type of ceremony may only be " +
                        "performed once a month. There are four types of ceremonies that the Ajaunti may choose to perform:\n\n" +
                        "Ceremony of Courage: Performing this ceremony will extend the Bleed and/or Death Counts of up to 3 targets for " +
                        "the next hour. If a single Aja performs the ceremony it will add a minute to the target(s) Bleed Counts. If assisted, " +
                        "it adds a minute to both Bleed and Death Counts. If 10 or more clan members are involved, it will double the " +
                        "duration of both counts (2 minutes/10 minutes for most species).\n\n" +
                        "Ceremony of Celebration: This ceremony will create a permanent item for each target of the ceremony. Examples " +
                        "would be wedding gifts for a couple getting married, medals for acts of bravery, a knife in a coming of age " +
                        "ceremony, etc. These items will gain no effect beyond being permanent and they cannot have been magically " +
                        "enchanted to begin with. They are vulnerable to damage like normal but a bride’s crown of flowers will never " +
                        "wilt, a medal will never tarnish, writing on paper will never fade, etc. If they are kept by the recipient for 1 year " +
                        "they will turn into catalysts of a type and emotion desired by the owner. Players who have items made for them in " +
                        "this way must visit NPC camp for the tags at some point prior to the event ending. A single Aja can create 1 item. " +
                        "If they have an assistant, they can create 2. If 10 or more clan members participate, the items will become " +
                        "catalysts instantly.\n\n" +
                        "Ceremony of Hex Breaking: This ceremony will allow an Ajaunti to remove any one curse that is afflicting a " +
                        "target. It will permanently remove any Lesser Curse. If an assistant is used, the Ceremony of Hex Breaking may " +
                        "temporarily remove Greater Curses for 1 hour. If 10 or more clan members are present, then the ceremony may " +
                        "effect up to 3 targets simultaneously and has a chance to permanently remove Greater Curses with shaper " +
                        "approval. The target does not have to be conscious for this effect to take place, though they cannot be in their " +
                        "Death Count. \n\n" +
                        "Ceremony of Mourning: This ceremony grants the ability to communicate with the ghost of a departed (final " +
                        "death) spirit for 10 minutes, so long as the final death occurred within the past year. The spirit must be willing to " +
                        "participate and a Shaper or marshal is required to perform this ceremony. Sprits spoken to in this manner cannot " +
                        "recall anything about their death and they cannot speak, but they can hear and respond with body language. If an " +
                        "assistant is used, the ghost can speak. If more than 10 members of the clan are present, the spirit remains for an " +
                        "hour. This is considered a great favour to ask of an Aja and it is not without risk – sometimes the act draws the " +
                        "attention of other restless spirits, who will be attracted to the Aja who performed, hours after the ceremony is " +
                        "completed."
            }
            else {
                racialInfoTitle.text = "Spirit Hook"
                racialInfo.text = "\t\t The Ajaunti may throw a packet and declare “Innate Arcane Spirit Hook”. If it " +
                        "strikes a target that is a non-corporeal Undead, they will be affected by an Arcane Web effect that " +
                        "immobilizes them from the neck down. Creatures trapped this way are unable to do anything except" +
                        "talking, reading, and skills that require no movement. Trapped creatures may also activate Magical items " +
                        "if the items are touching them, though few items would be beneficial, for the victim cannot use their " +
                        "hands to direct the activated item by throwing packets. Creatures with a Strength bonus of +6 may rip free " +
                        "from the web, taking three seconds and doing 6 Body in the process regardless of threshold. Otherwise," +
                        "they may be cut out which takes 6 minutes of time to completely remove the sticky strands. Webbed " +
                        "creatures cannot be moved. This effect lasts as long as the Ajaunti has line of sight of the Undead.\n\n" +
                        "\t\tIf used on a ghost whose spirit is trapped in the Deadlands, this ability will function as a binding circle " +
                        "and force it to remain in place. This does not give the Ajaunti control over the creature but it does " +
                        "prevents its escape. Once a creature is successfully struck with the packet, a 5-foot diameter circle of salt " +
                        "and ash will appear centered around the ghost. The Ajaunti can keep the ghost in the circle indefinitely " +
                        "until it is put to rest or the circle is destroyed. The ghost can converse through the circle, assuming anyone " +
                        "has the ability to understand it. Should the circle be crossed or breached by anything or anyone, the effect " +
                        "will end immediately and the ghost trapped inside will be freed. The Ajaunti may choose to drop the" +
                        "circle at any time. The circle perimeter must be represented by a rope or a similarly identifying prop.\n\n" +
                        "\t\tThis ability has no impact on people who are possessed by ghosts. This ability is usable once per day per " +
                        "purchase."
            }
            racialDisInfoTitle.text = "Lost in Memories"
            racialDisInfo.text = "\t\tWhen an Ajaunti dies, they have the normal 1 in 10 chance of remembering their " +
                    "death. If they fail to remember, Aja lose 24 hours of memories, not the standard 1 hour. In addition, if an Aja " +
                    "forgets their death there is a 50% chance that they will bring something back with them. When this occurs, the " +
                    "Aja will know it has happened upon resurrecting but will not know any further details. This can take 3 forms, " +
                    "chosen by a Shaper:\n\n" +
                    "1) A cursed item returns on their body. These items are always negative and can only be removed by effects " +
                    "which remove Greater Curses. The item’s history and specifics of the curse will be decided by the Shaper.\n" +
                    "2) A restless spirit materialises within 1 day’s travel of where the Aja resurrected. This ghost will attempt to " +
                    "find the Aja and will seek their aid in putting their spirit to rest.\n" +
                    "3) A hostile Undead arrives via the Deadlands, typically a wraith or spectre. It instinctively knows where the " +
                    "Aja can be found and will locate the Aja within 24 hours, seeking to destroy them."
        }
        else if (characterRace == "Einher"){
            autoRacialInfoTitle.text = "Resist Cold"
            autoRacialInfo.text = "\t\tResist Cold allows the user to “Racial Resist Cold” one cold-based effect. As a Racial " +
                    "Ability, it may be used to “Resist” Ritual Magic. This skill is automatically given on character creation, cannot be " +
                    "purchased for multiple uses, and is only usable once per day."
            if (cultureFragsInt == 0) {
                racialInfoTitle.text = "Berserker Rage"
                racialInfo.text = "\t\tA Northman can incite in himself a " +
                        "powerful Berserker Rage. The character must cry out “Innate " +
                        "BERSERK!” for a ten-count, i.e., “Berserk 1, berserk 2, berserk " +
                        "3...” while working themselves into a frothing frenzy. For the " +
                        "duration of one combat, the character gains +1 Strength, +5 Body, " +
                        "and is immune to Fear effects. From the point at which the fight " +
                        "ends, it takes 5 minutes for the effects of Berserk to wear off. The " +
                        "character cannot will the rage to end sooner and must continue to " +
                        "fight so long as opponents are visible. This skill is usable once per " +
                        "day, per purchase."
            }
            else {
                racialInfoTitle.text = "Berserker Poison"
                racialInfo.text = "\t\tThe Einher may brew an “Ingested Alchemical Berserker Poison” that " +
                        "lasts until reset. This brew takes 10 minutes to make and is made from bodily fluids, local fungi and water " +
                        "from a source that is spiritually significant to the character. Unlike regular ingested alchemy, the brew " +
                        "cannot be mixed with any other food or drink. This brew can be ingested or poured over the Berserker’s " +
                        "Mantle, where the liquid will drip into the hooks that are lodged in the True Berserker’s skin. When a" +
                        "True Berserker drinks this brew, they will go in a Berserk state in which they are immune to fear effects" +
                        "and gain 1 AP for any unarmoured armour location. This armour cannot be repaired. They will also gain " +
                        "+1 Strength. The Strength and AP increase by 1 when the character purchases the skill four, seven and ten " +
                        "times. While in their Berserk state, the Einher must try to kill anyone who they consider an opponent, and " +
                        "anyone who gets in their way, friend or foe. If there are no opponents remaining, they will perform a " +
                        "Killing Blow on any unconscious opponents to ensure that they are dead. At the end of a fight, it takes 5 " +
                        "minutes for the effects of Berserk to wear off. The character cannot end the rage sooner and must " +
                        "continue to fight so long as opponents are visible, even if they are cleansed of the Berserker Poison itself. " +
                        "Afterwards, no skills or abilities may be used for the same length of time that they were Berserking, to a " +
                        "minimum of 10 minutes. If anyone but a True Berserker drinks this brew, they will take an Alchemical " +
                        "Enrage effect for 60 seconds, causing them to attack the first person they see. They will not gain any of " +
                        "the other effects. This ability is useable once per day per purchase. This ability does not stack."
            }
            racialDisInfoTitle.text = "Hell's Embrace"
            racialDisInfo.text = "\t\tThe Einher live for battle. It is their " +
                    "belief that if they die their final death in combat, their souls travel to a great hall where they will fight and drink " +
                    "for eternity. It is every Northman’s fear that they will die alone outside of combat. Einher who die outside of " +
                    "combat have a 50% chance of taking two deaths on their character card for the one they take in game. An Einher " +
                    "who has died outside of combat will first flip a coin to determine if the death taken is counted as one or two, then " +
                    "the deaths are applied to their character card, and finally, if required, an additional flip(s) to see if they succumb to " +
                    "final death."
        }
        else if (characterRace == "Hobling"){
            autoRacialInfoTitle.text = "Taunt"
            autoRacialInfo.text = "\t\tThis skill allows the Hobling to Taunt a target, inciting him/her into combat. The target will " +
                    "immediately attack the taunting Hobling, ignoring all other targets until the Hobling is on the ground unmoving, " +
                    "out of line-of-sight, or physically unobtainable. The target is still free-willed and able to fight with strategy and " +
                    "cunning but s/he must attack immediately, and must target the taunting Hobling. After the Hobling is down or has " +
                    "left line-of-sight, the target may then choose to stop combat if s/he wishes. In order for this racial to be effective, " +
                    "the Hobling must actually taunt the target with 2 insults, declare “Innate Taunt” then hit with a successful packet " +
                    "strike. This skill is automatically given on character creation, cannot be purchased for multiple uses and is only " +
                    "usable once per day. Hobling Taunt is considered a Psionic attack but is a racial and cannot be resisted by " +
                    "anything short of another racial ability. Some example taunts are: “Go soak your head in a bucket. Then some fool " +
                    "might mistake it for a helm and therefore mistake you for a knight” and “You have something on your face. Oh " +
                    "wait! That is your face!”"

            racialInfoTitle.text = "Racial Dodge"
            racialInfo.text = "\t\tAllows the subject to dodge any attack, calling “Racial Dodge”, so long as it is not a " +
                    "trap of any kind, or some other unreasonable damage-causing incident, such as falling off a tower. This skill is " +
                    "usable once per day per purchase. It is not possible to dodge a Surprise Attack, Power Word, Area of Effect or " +
                    "Massive damage."

            racialDisInfoTitle.text = "Small Size"
            racialDisInfo.text = "\t\tHoblings can only purchase proficiency and specializations from the Simple weapon and " +
                    "Exotic weapon groups. No exotic weapon may be used that is greater than 16 inches but other weapons (such as " +
                    "staves in the Simple Group) are not affected."
        }
        else if (characterRace == "Human"){
            autoRacialInfoTitle.text = "Character Point (CP) Bonus"
            autoRacialInfo.text = "\t\tHumans begin with 50 extra CP upon character creation."

            racialInfoTitle.text = "No Purchased Racial"
            racialInfo.text = "\t\tN/A"

            racialDisInfoTitle.text = "No Racial Disadvantage"
            racialDisInfo.text = "\t\tN/A"
        }
        else if (characterRace == "Am'Rath"){
            autoRacialInfoTitle.text = "Simple Weapon Damage Bonus"
            autoRacialInfo.text = "\t\tAm’Raths gain +1 damage to all weapons in the simple " +
                    "weapon group."

            racialInfoTitle.text = "Clobber"
            racialInfo.text = "\t\tThis physical attack can be used with any melee strike and will cause 25 points of " +
                    "damage, the damage type based on the weapon used. If the attack misses, the skill is used. It may be " +
                    "augmented with magic and alchemy. It is used by calling out “Innate Clobber!” before the attack. Clobber " +
                    "may be used once per day per purchase."

            racialDisInfoTitle.text = "Simple Weapon Restriction"
            racialDisInfo.text = "\t\tTo an Am’Rath, all melee weapons outside the Simple Weapon " +
                    "group are considered “exotic” for purposes such as proficiencies, slays and specializations. Ranged " +
                    "weapons are not included in this disadvantage."
        }
        else if (characterRace == "Faun"){
            autoRacialInfoTitle.text = "Companion"
            autoRacialInfo.text = "\t\tA faun may declare another living creature a “companion” each day. This " +
                    "companion is decided at reset and cannot be changed until the next reset. If their companion enters their " +
                    "Death Count a faun may place both hands on their body and pause the Death Count. After 60 seconds of " +
                    "concentration, their companion will be affected by an “Innate Magic Life” effect from the Nature sphere. " +
                    "This ability may be used once per day."

            racialInfoTitle.text = "Forest Revival"
            racialInfo.text = "\t\tFauns may, one per day per purchase, fully heal their Body by placing both " +
                    "hands on any living tree within a forest and concentrating for 60 seconds. During this time they may not " +
                    "use any other skills and are considered to be “concentrating” as per spell-casting. Body Points are gained " +
                    "immediately at the end of the 60 second count. "

            racialDisInfoTitle.text = "Restriction to Nature Healing"
            racialDisInfo.text = "\t\tWhen it comes to magical healing, fauns cannot be healed " +
                    "by any magic outside of the Nature sphere. This includes all Body Point healing and healing effects. " +
                    "Natural and alchemical versions of these effects will work. Additionally, consuming a Goodberry will " +
                    "heal a Faun for 2 Body. Life spells from outside the Nature sphere will work on fauns but not effectively - " +
                    "the Faun will be healed to 1 Body and not full Body like usual. Life effects from Nature sources will " +
                    "operate as normal."
        }
        else if (characterRace == "Minotaur"){
            autoRacialInfoTitle.text = "Enhanced Strength"
            autoRacialInfo.text = "\t\tMinotaurs are incredibly strong. They will gain +1 Strength every five " +
                    "levels, starting at level 1, giving them +2 Strength at level 6, +3 Strength at level 11, and so on."

            racialInfoTitle.text = "Fae Ward"
            racialInfo.text = "\t\tLong standing wars with creatures of the Fae Realm have given Minotaurs a " +
                    "natural ability to protect and ward themselves against pesky Fae meddling. A Minotaur with this ability " +
                    "may craft a special magical Fae Ward, capable of preventing entry by any Fae creature, including those " +
                    "with only trace amounts of Fae blood in their veins. The Fae Ward must be carved on an object containing " +
                    "at least a small amount of iron and must be at least 1 square foot in size. The carving of the Fae Ward " +
                    "takes 10 minutes of roleplaying to draw. Once erected, no Fae creature, pure or thin of blood, may cross " +
                    "within 10 feet of the Ward. This includes True Fae, Redcaps and even the thin blooded relatives such as " +
                    "Carnal Fae and Wood Fae but does not include other Minotaurs. The Ward lasts for 5 days unless it is " +
                    "moved, defaced or destroyed at which point the magic of the Fae Ward is lost and must be re-carved. No " +
                    "Fae can move or interfere with the ward in any way. This ability is usable once per day per purchase."

            racialDisInfoTitle.text = "Fae Susceptibility"
            racialDisInfo.text = "\t\tCenturies of mind manipulation by the Fae have altered Minotaurs’ " +
                    "reactions to mind magic. If a Fae hits a Minotaur with a magical mind effect of any kind, the Minotaur " +
                    "will become enraged for one minute. During this time, they may not attack the source of the magic. Once " +
                    "the minute is complete, the Minotaur will no longer be enraged and the mind-altering effect will affect " +
                    "them as normal. The mind alteration’s duration begins at this point. Fae able to induce this effect include " +
                    "True Fae, Redcaps and even the thin blooded relatives such as Carnal Fae and Wood Fae but not other " +
                    "Minotaurs."
        }
        else if (characterRace == "Kobold"){
            autoRacialInfoTitle.text = "Innate Sap"
            autoRacialInfo.text = "\t\tA Kobold receives one free Sap skill every other level, starting at first level. " +
                    "These Innate Saps are identical to the purchased skill. This racial does not hamper the Kobold’s ability to " +
                    "purchase the Sap skill. The call for this is “Innate Sap”."

            racialInfoTitle.text = "KABOOM!"
            racialInfo.text = "\t\tKobolds are natural Trappers. They excel in the craft above and beyond any " +
                    "other race. A Kobold may use this natural affinity to make an extraordinary, unique trap, even without the " +
                    "Trapper skill. This is similar to an Explosive Trap. For every 1 RM used to create the trap, it will do 2 " +
                    "points of damage to everyone within 5 feet of the trap when it is triggered. If the Kobold has 4 levels of " +
                    "Trapper, this amount is raised to 3 points damage per 1 RM. Kobolds may use any kind of RM to create " +
                    "these traps. Kobolds will receive one KABOOM! trap tag per day per purchase. The player must then " +
                    "affix the appropriate RM to the tag to determine the damage caused by the trap. This can be done at any " +
                    "time. Once the RM is attached to the KABOOM! tag, the trap is created and the timer must be set. The " +
                    "timer can be set for any time between 1 and 60 seconds, but this must be decided on trap creation, and " +
                    "will start counting down from then. The detonation cannot be triggered early. All normal Trapper rules " +
                    "apply to this trap, except:\n\n" +
                    "- The Kobold who made the KABOOM! trap can run with it without setting it off early\n" +
                    "- The KABOOM! may be thrown without automatically detonating it, but if the timer is damaged " +
                    "or turned off in the throw, the KABOOM! becomes a dud and is used up without exploding\n" +
                    "- KABOOM! traps cannot be scavenged for RM\n" +
                    "- The phys-rep should be made of foam and a minimum of 1 foot cubic square in size. It should " +
                    "look like a bomb a kobold would make - scavenged and ugly. It still requires a timer like a regular " +
                    "Timer Trap"

            racialDisInfoTitle.text = "Frailty"
            racialDisInfo.text = "\t\tKobolds are frail and weak creatures. A Kobold has a -2 strength penalty. This " +
                    "means they swing for one less damage, to a minimum of one."
        }
        else if (characterRace == "Ogre"){
            autoRacialInfoTitle.text = "Ogre Constitution"
            autoRacialInfo.text = "\t\tBecause of their incredible size and strength, Ogres begin with +2 " +
                    "Strength, and +5 Body. Furthermore, Ogres gain an additional +2 Body per level."

            racialInfoTitle.text = "Ogre Smash"
            racialInfo.text = "\t\tBy summoning all of their great strength into a single melee attack, an Ogre " +
                    "can target an opponent’s weapon or shield, causing grievous amounts of damage to it. Weapons and " +
                    "shields struck by this attack are affected by a “Shatter” effect, destroying them unless they are immune or " +
                    "have resistance. To activate this ability, the Ogre must let out a blood curdling war cry followed by the " +
                    "call “Innate Physical Smash!” The next hit, whether it is to the target’s weapon or shield, will determine " +
                    "what is destroyed. This ability will only stay active for 10 seconds after the Ogre’s Smash call and is " +
                    "considered used even if the attack misses. It is usable once per day per purchase."

            racialDisInfoTitle.text = "Untempered Rage"
            racialDisInfo.text = "\t\tIf an Ogre takes more than 15 points of damage directly to their Body " +
                    "from any single effect from any source, they immediately fly into a mindless rage. They will immediately " +
                    "attack everyone nearby, friends and foes alike. This onslaught may only be stopped by dropping the Ogre " +
                    "into its Death count. Any effects that would incapacitate the Ogre, such as sleep magic/alchemy or " +
                    "unconsciousness, will still function, but the rage will carry on if they are revived prior to the duration " +
                    "expiring. After 10 minutes have passed since the attack, the effect will wear off. If the ogre is struck for " +
                    "more than 15 Body points a second time while Untempered Rage is active, its duration will reset and start" +
                    "again at 10 minutes."
        }
        else if (characterRace == "Squamata"){
            autoRacialInfoTitle.text = "Seal Pores"
            autoRacialInfo.text = "\t\tSquamata’s pores are sealed to prevent toxic substances from entering the " +
                    "bloodstream, making them immune to packet-delivered alchemical attacks, stating “No Effect”. This " +
                    "defense will not function against ingested or contact alchemy. Chemistry Gas Globes may also be resisted " +
                    "in this manner."

            racialInfoTitle.text = "Tongue Pierce"
            racialInfo.text = "\t\tSquamata are able to lash out their long, needle-sharp tongues at opponents " +
                    "by calling “Innate Tongue Pierce 5 Body!” Considered a thrown weapon attack, the weapon phys-rep " +
                    "should be coloured red to indicate it is a natural weapon. This weapon may not be picked up by anyone " +
                    "besides the Squamata it belongs to. No skills may be used with this attack and specializations may not be " +
                    "purchased for the Tongue Pierce. Squamata may use this attack once per day, per purchase. If the Tongue " +
                    "Pierce is blocked or defended against, the Squamata will become silenced for 10 minutes."

            racialDisInfoTitle.text = "Soft Underbelly"
            racialDisInfo.text = "\t\tAll Squamata take double damage from all physical Body weapon damage. " +
                    "As with all racial vulnerabilities, physical Body weapon damage will bypass any thresholds a Squamata " +
                    "might have."
        }
        else if (characterRace == "Avian"){
            autoRacialInfoTitle.text = "Spirit Anchor"
            autoRacialInfo.text = "\t\tSpirit Anchor allows an Avian to anchor their spirit to a specific location and " +
                    "be able to “shadow step” to it on a 10 second count, stating “Innate Spirit Anchor 1, Innate Spirit Anchor " +
                    "2…”, once per day. This magical transportation is done via travel though the Plane of Shadow, a dark and " +
                    "dangerous place. The anchor itself is an in-game item that must be represented by an active glow-stick or " +
                    "LED attached to a “mechanical” steam-machinery based item. This item must be approved by a Shaper, " +
                    "cannot be magical in nature and can be destroyed by normal means. The Avian is transported with " +
                    "everything they currently carry but they cannot transport other spirits or items larger than they can " +
                    "physically carry, including creatures in their Bleed or Death Counts.\n\n" +
                    "\t\tIf the Spirit Anchor is destroyed, a new one can be created by the Avian without cost after an hour’s " +
                    "work. The new Anchor must be approved by a Shaper like the first. If an Avian attempts to transport " +
                    "themselves to a destroyed anchor, they will die. They will resurrect as normal, only all their belongings " +
                    "will reappear at the resurrection circle with them. If this death finals the Avian, all their belongings will " +
                    "appear at the resurrection circle without them. An Avian may also “disconnect” from their current Anchor " +
                    "and undergo the same 1 hour process as a destroyed one. An Avian must be able to see to use this ability, " +
                    "and must have full unobstructed vision. A spirit anchor may be used through a Garrotte, assuming the " +
                    "player resists or calls no effect on the Garrotte."

            racialInfoTitle.text = "Create Goggles"
            racialInfo.text = "\t\tThis ability allows the Avian to create a mechanical set of Goggles which " +
                    "only they can use. By spending 10 minutes gathering together pieces of scrap and old junk the Avian can " +
                    "state “Innate Create Goggles” and make them magical. The player must provide the phys-rep. Once " +
                    "created, an Avian has 10 seconds to infuse these Goggles with any 1st to 3rd Circle spell effect from the " +
                    "core rulebook. This is done automatically, with the Avian simply choosing the spell, it need not be cast " +
                    "into the Goggles. The Goggles function in the same manner as a 1/day magical item and detect as " +
                    "magical. These Goggles will last 5 days before the magic fades and the Goggles fall apart. A new pair can " +
                    "be made at this time, with the same or a different spell. Purchasing this ability a second time will grant all " +
                    "spells up to 6th circle and a 3rd purchase will grant up to 9th circle. No more than one set of Goggles may " +
                    "exist at any time unless this ability is purchased a 4th time. Any purchases beyond 3rd go toward building " +
                    "new sets of Goggles, following the same rules for spell levels that applied to the first set of Goggles (a 4th " +
                    "purchase allows a second set of Goggles with spell levels 1-3, a 5th purchase upgrades them to 1-6, etc.). " +
                    "When using the Goggles, the Avian does not need to know the Sphere, nor possess any of the " +
                    "requirements to cast the spell, but only the Avian may use their Goggles. Each pair of Goggles may be " +
                    "used once per day but the spell inside may only be changed every 5 days. If the Goggles are destroyed, " +
                    "they may be remade after the next reset, but the spell will be the same as before. "

            racialDisInfoTitle.text = "Shadow Mark"
            racialDisInfo.text = "\t\tAvian’s spirits are irrevocably tied to the Shadow Plane. Both dying and " +
                    "near-death experiences scar Avians with shadow energy, either temporarily or permanently. These scars" +
                    "manifest physically on the Avian in the form of grey slash marks across the eye socket. If an Avian enters " +
                    "its Death Count, they gain a Shadow Mark within 1 hour (giving the player the time to rep this). This " +
                    "Mark will last until the next skill reset. If an Avian dies, they will resurrect with a permanent Mark. " +
                    "Permanent Marks can never be removed or lost, even if Spiritual Resolve is purchased.\n\n" +
                    "\t\tEach Mark adds +5 seconds to the Avian’s Anchor count, +1 damage from all magic sources and -1 " +
                    "Strength. These negatives only affect the Avian between 6 PM and 6 AM.\n\n" +
                    "\t\tWhen an Avian dies their final death, their body will materialize near the location of death, devoid of " +
                    "Shadow Marks. This Shadow double has only one purpose – the death and destruction of all things the " +
                    "Avian cared for in life. It will last for a minimum of 1 hour or until destroyed. Throughout the hour the " +
                    "Shadow double’s emotions will drain until it is nothing but a husk, driven by a desire for destruction that " +
                    "will bring it no pleasure. The Shadow double will have all stats and abilities that the Avian had upon " +
                    "death, plus a full memory of its life. The Avian player will usually have the opportunity to NPC the " +
                    "Shadow double if they desire. The Shaper and player must agree for the Shadow double to last longer " +
                    "than 1 hour."
        }
        else if (characterRace == "Draconian"){
            autoRacialInfoTitle.text = "Natural Threshold"
            autoRacialInfo.text = "\t\tDraconians have a thick layer of scales which become harder than steel " +
                    "as they age. They gain a natural (normal) threshold of one for every three levels, starting at level 1, giving " +
                    "them a 2 Normal threshold at level 4, 3 Normal threshold at level 7, and so on."

            racialInfoTitle.text = "Reflect Divine"
            racialInfo.text = "\t\tOnce a day per purchase, a Draconian may use a natural ability to reflect " +
                    "Divine Magic back on its originator, calling “Racial Reflect Divine”. The Draconian has the option of not " +
                    "reflecting the spell if they so choose. Because this is a racial ability, it affects both Battle Magic and ritual " +
                    "spells. It can be stacked with magical protections such as Shield Magic and is considered a separate racial " +
                    "ability."

            racialDisInfoTitle.text = "Weak Spirit"
            racialDisInfo.text = "\t\tDue to the nature of their existence, Draconian spirits are considered weaker " +
                    "than normal. They get one “free” death before they must begin flipping, instead of the normal two."
        }
        else if (characterRace == "Fire Elf"){
            autoRacialInfoTitle.text = "Resist Fire"
            autoRacialInfo.text = "\t\tFire Elves are extremely resilient to heat. Once a day they may call “Racial" +
                    "Resist Fire” to any magic or elemental attack involving fire or heat, and take no damage from it. "

            racialInfoTitle.text = "Endurance"
            racialInfo.text = "\t\tWhen struck by an effect that would drop a Fire Elf into their Bleed Count via a " +
                    "number based attack (melee, magic, acid, etc.) the Fire Elf may call “Racial Endurance!” and remain at 2 " +
                    "Body points, regardless of how much damage they have taken. For example, if a fire elf has 8 Body and is " +
                    "struck by a Slay for 50 damage, they may call “Racial Endurance!” and remain at 2 Body instead. " +
                    "Endurance cannot be used against numeric attacks that drop a character into their Death Count, such as " +
                    "Elemental attacks. Usable once per day per purchase."

            racialDisInfoTitle.text = "Armor Restriction"
            racialDisInfo.text = "\t\tFire Elves are limited to 10AP worth of physical armour at level 1. " +
                    "That amount rises by +5AP per level. The fire elf may physically wear more armour but will receive no " +
                    "benefit beyond those numbers"
        }
        else if (characterRace == "Goblin"){
            autoRacialInfoTitle.text = "Parasites"
            autoRacialInfo.text = "\t\tThe racial parasites that live in all Goblins come with a surprising advantage. " +
                    "Goblins can vomit these parasites onto creatures to keep them from bleeding out. If a Goblin spends 10 " +
                    "seconds vomiting on a target in their Bleed Count, they will be stabilised and go to 0 Body. During the 10 " +
                    "seconds, the Goblin should ask the target out of game if they’re currently infected with Goblin Parasites. " +
                    "They can also explain what just happened during that time. If the target is already infected with Goblin " +
                    "Parasites, the skill will fail. Successfully doing this causes an infection similar to the one Goblins " +
                    "experience. The new infection will consume one half of all healing that is administered to the infected " +
                    "individual (rounded down) to a minimum of 1. Within the body of a Goblin, these parasites are so hardy " +
                    "that they can never be removed. In the body of someone targeted by Parasites, they can only be removed " +
                    "with extremely powerful cleansing effects. The only cures are Life effects, Nature’s Restoration, Purify or " +
                    "Cleansing Light. These parasites are considered foreign life forms, not toxins or diseases. This ability may " +
                    "be used at will but the Goblin must consume some type of organic matter larger than an apple in between " +
                    "uses. This does not need to be done OOG, but appropriately sized food reps must be present. This ability " +
                    "cannot be used on other Goblins."

            racialInfoTitle.text = "Amorphic Mucus"
            racialInfo.text = "\t\tAll Goblins are equipped with a gland that produces mucus which, when " +
                    "coughed up, has the ability to replicate certain types of alchemy. To use this skill the Goblin must excrete " +
                    "and cough up the Amorphic venom on a 10 second count. After being excreted, the Amorphic Mucus " +
                    "must be put in contact with any alchemical gas globe for 1 minute. If successful, the mucus will harden " +
                    "and take on the exact same properties of the alchemy it was exposed to but will expire in 1 hour. This " +
                    "Mucus may be thrown by the Goblin like a gas globe as if they had the appropriate level of Alchemy. If " +
                    "the duration expires, or the mucus leaves the possession of the Goblin that created it, it will become inert " +
                    "and dissolve. Only one Amorphic Mucus may be prepared at any given time. This skill is usable once per " +
                    "day per purchase."

            racialDisInfoTitle.text = "Parasites"
            racialDisInfo.text = "\t\tGoblins, constantly living in filth and muck, have become host to racial parasites " +
                    "that feed off their spirit and vitality. These microscopic parasites are incurable even through resurrection " +
                    "and will always consume one half of all healing that is administered to the Goblin (rounded down) to a " +
                    "minimum of 1."
        }
        else if (characterRace == "Risen"){
            autoRacialInfoTitle.text = "Dual Race"
            autoRacialInfo.text = "\t\tA Risen’s automatic advantage is dependent on which form the Risen is in at " +
                    "that time.\n\n" +
                    "Undead Form: While in Undead form the Risen gains the following Advantages:\n" +
                    "- 0 Silver Threshold levels 1 to 5 (from 6 PM to 6 AM only, no threshold during the day)\n" +
                    "- 0 Magic Threshold levels 6+ (from 6 PM to 6 AM only, no threshold during the day)\n" +
                    "- Heals from Infliction \n" +
                    "- +2 Strength Bonus \n" +
                    "- Considered a Greater Zombie\n" +
                    "- May be healed by a physician with knowledge of the Necromantic Arts\n" +
                    "- May have First Aid administered by an individual with knowledge of the Necromantic Arts\n" +
                    "- Standard Bleed and Death Count as if living \n\n" +
                    "Living Form: While in living form the Risen gains the following Advantages:\n" +
                    "- Heals from Healing \n" +
                    "- Sense as Life"

            racialInfoTitle.text = "Spirit Skinning"
            racialInfo.text = "\t\tAny creature that has a spirit, is capable of resurrection, and is in their " +
                    "Bleed Count or unable to interrupt a killing blow, may be Spirit Skinned. The Risen must state “Innate " +
                    "Spirit Skinning,” and then perform a Killing Blow. If the Killing Blow is not interrupted, then the effects " +
                    "of this ability will instantly place the target into their Death Count and transfer part of their spirit into the " +
                    "Risen. A spirit skinning is a process with a visible component, the description of which is: “Visible white " +
                    "energy is ripped from the target’s body and consumed by the Risen”.\n\n" +
                    "\t\tIf successful, the Risen must immediately begin to transform to their living form by stating “Innate " +
                    "Arcane Race Change. Transform to living 1, transform to living 2, transform to living 3.” This " +
                    "transformation is automatic and cannot be stopped once the Risen has Spirit Skinned a target. If this " +
                    "ability is used while the Risen is already in their Living Form then a Spirit Recall will stack onto their " +
                    "spirit. A Risen may transform into their living form by using a Spirit Recall on their spirit, by stating " +
                    "“Innate Recall Spirit Skinning.” This will transform the Risen again into their living form, as if they had " +
                    "just cast the ability on a target. A Risen can, at will, change back into their Undead form by stating " +
                    "“Innate Arcane Race Change. Transform to Undead 1, transform to Undead 2, transform to Undead 3.”" +
                    "The living flesh begins to rot and a moment later the Risen is once again in their Undead form. There is " +
                    "no limit to the number of times a Risen can transform back to their Undead form nor is there any skill or " +
                    "ability that will physically force a Risen back into their Undead form save for a successful resurrection. A " +
                    "Risen may use Spirit Skinning at will. However, the maximum number of Spirit Recalls on their spirit is " +
                    "equal to the number of times they have purchased the Spirit Skinning ability. These Spirit Recalls expire " +
                    "in 5 days, but the living form obtained from Spirit Skinning is indefinite. Risen players may start their " +
                    "first game in either their living or Undead form, but they may not transform back into their living form " +
                    "without purchasing this ability. A Risen’s transformation cannot be interrupted."

            racialDisInfoTitle.text = "Dual Race"
            racialDisInfo.text = "\t\tA Risen’s automatic disadvantage is dependent on which form the Risen is in " +
                    "at that time.\n\n" +
                    "Undead form: While in Undead Form the Risen gains the following Disadvantages:\n" +
                    "- Sense as both Undead and Necromantic.\n" +
                    "- Quadruple damage from Healing Spells of any sphere.\n" +
                    "- Daytime Vulnerability: Undead take 1 Arcane damage per second if uncovered between 6 AM " +
                    "and 6 PM. To be considered covered, an Undead must wear clothing covering 90% of their body " +
                    "and this must include both the head and hands. This is a racial vulnerability.\n" +
                    "- Susceptible to spells and abilities that would target Undead such as Destroy Undead and Control " +
                    "Undead. \n" +
                    "- Requires 2 Life spells to take out of Death Count. \n" +
                    "- A barely functional anatomy forces an Undead Risen to still breathe and require functional organs " +
                    "to live. Therefore, they do not gain the typical Undead’s immunity to Alchemy or mind-altering" +
                    "effects. This is not enough life to detect or register as living though magical, physical or spiritual " +
                    "means. \n\n" +
                    "Living Form: While in Living Form the Risen gains the following disadvantages:\n" +
                    "- All as if living\n" +
                    "- Sense as original pre-Undead race and may be affected by spells or abilities that target that race."
        }
        else if (characterRace == "Wolven"){
            autoRacialInfoTitle.text = "Sense Undead"
            autoRacialInfo.text = "\t\tAllows the player to sense Undead. To sense the Undead, the Wolven must" +
                    "roleplay that they are sniffing (“scenting”) the air for 10 seconds uninterrupted, then state “Innate Sense" +
                    "Undead” in a normal speaking voice. Any Undead who hear the “Sense Undead” will respond “Here” in a" +
                    "normal speaking voice. This ability does not grant the detector any information on the type of Undead." +
                    "This will not allow Wolven to sense vampires. Usable at will."

            racialInfoTitle.text = "Natural Hide"
            racialInfo.text = "\t\tWolven are born with a natural thick hide. To represent this, a Wolven will " +
                    "gain 10 AP (Armour Points) with their first purchase of this ability and an additional 5 AP for every " +
                    "subsequent purchase. This armour works in every respect to normal armour save that it cannot be refit. " +
                    "For a Wolven to repair their Natural Hide, they must heal it as though it were Body. A Wolven can never " +
                    "cure more Natural Hide AP than she or he has. Natural Hide AP will be removed after normal and " +
                    "Magical Armour but before Body points. Normal armour may be worn on top of Natural Hide."

            racialDisInfoTitle.text = "Vulnerability to Fire"
            racialDisInfo.text = "\t\tWolven have a natural fear of and vulnerability to fire. A Wolven " +
                    "will take x2 damage from all sources of fire, including Magical and Elemental. Should a Wolven take fire " +
                    "damage to Body, they will also become terrified of the source of that damage, unable to attack it or come " +
                    "within 10 feet of it. To quell the fear, the Wolven must either cower behind something which completely " +
                    "obscures them from view for 10 seconds or wait 1 minute. This effect cannot be resisted or dispelled in " +
                    "any way and should be role-played appropriately. As with all racial vulnerabilities, fire damage will " +
                    "bypass any thresholds a Wolven might have."
        }
        else if (characterRace == "Yokai"){
            autoRacialInfoTitle.text = "Foxfire"
            autoRacialInfo.text = "\t\tThe Yokai have been infused with demonic energy and can focus it into short bursts " +
                    "of destructive power through their physical attacks. After stating “Innate Foxfire” the Yokai will gain a " +
                    "Magic Fire aura for 10 minutes. This enchants the Yokai’s spirit to deal +0 Magic Fire using any melee " +
                    "weapon the Yokai is proficient with for the duration. This ability is usable once per day."

            racialInfoTitle.text = "Enemy of my Enemy"
            racialInfo.text = "\t\tWhile some Yokai may be ashamed of being part demon, most " +
                    "embrace it as a point of pride because they still maintain control over it. Yokai can tap into that power and " +
                    "use it against other demons. Once per day per purchase a Yokai may strike a Lesser Demon with a packet " +
                    "attack and call “Innate Magic Control Lesser Demon”. For the next hour the target will do anything asked " +
                    "of it, including sacrificing itself. The specific abilities and limitations of the target will depend upon the " +
                    "type of demon being controlled. This ability has no effect against Greater Demons.\n\n" +
                    "\t\tWhile a Yokai has a Lesser Demon under their control via Enemy of my Enemy they will be viewed by " +
                    "all other demons as a demon themselves. Weaker demons may avoid hostility so long as the Yokai does " +
                    "not threaten them, as they fear the power that the Yokai is wielding. Greater Demons have a notoriously " +
                    "quick temper but if they’re cunning, the Yokai may be able to sweet-talk their way through an encounter " +
                    "with one. This altered perception lasts for as long as Enemy of my Enemy remains active on a target and " +
                    "is considered a change in roleplay, not a Charm effect."

            racialDisInfoTitle.text = "The Stranger Within"
            racialDisInfo.text = "\t\tYokai are simultaneously mortal and demonic. As such, Yokai will " +
                    "sense as demonic in response to “Sense Demonic” calls. They will also count as a Greater Demon for the " +
                    "purposes of skills such as Angelic/Demonic Arts and Exorcism. Finally, Yokai take x2 damage from " +
                    "Psionic spell damage, bypassing any thresholds they may have."
        }
        else if (characterRace == "Carnal Fae"){
            autoRacialInfoTitle.text = "Destroy Light"
            autoRacialInfo.text = "\t\t This racial ability will allow the Carnal Fae to extinguish any magical or " +
                    "non-magical light source. The call for this ability is “Innate Destroy Light”. If targeting a stationary light " +
                    "source not held by someone, a packet must be thrown and land within 5 feet of the light source to " +
                    "extinguish it. If held by a creature with a spirit, only the creature must be hit. This skill may be used once " +
                    "per day."

            racialInfoTitle.text = "Greater Resist Magic"
            racialInfo.text = "\t\t This racial ability will allow the Carnal Fae to resist any single " +
                    "incoming magical attack. This absorbs the attack, causing no ill effects to the Carnal Fae. This racial " +
                    "ability will stop any magical attack regardless of power, including ritual, Draconic and Arcane Magic. " +
                    "The defensive call for this ability is “Racial Greater Resist Magic”."

            racialDisInfoTitle.text = "Vulnerability to Iron"
            racialDisInfo.text = "\t\t A Carnal Fae cannot touch cold iron without experiencing extreme " +
                    "discomfort. If damage is called and a Carnal Fae is struck with an iron weapon, the Carnal Fae will take " +
                    "iron damage x4. As with all racial vulnerabilities, iron damage will bypass any thresholds a Carnal Fae " +
                    "might have. "
        }
        else if (characterRace == "Faceless"){
            autoRacialInfoTitle.text = "Permanent Non-Detection"
            autoRacialInfo.text = "\t\tThe Faceless cannot be detected by any means, natural or " +
                    "magical. They do not need to answer to calls of “Sense Life” or similar. Their presence is even hidden " +
                    "from that of ultra-powerful beings such as Gods and Dragons."

            racialInfoTitle.text = "Unmasked"
            racialInfo.text = "\t\tA Faceless may choose to remove their mask, releasing substantial anti-magical " +
                    "powers as a result, calling “Innate Unmask <Sphere>”. Only the Faceless may remove their own mask." +
                    "Doing so gives the Faceless immunity to one sphere of magic of their choosing other than Psionics for 10 " +
                    "minutes after the mask is removed. This immunity includes ritual magic but cannot grant immunity to " +
                    "magical damage from enchanted weapons. While their mask is not being worn, a Faceless will lose their " +
                    "“Non-Detection” racial and instead will detect as everything. Not wearing their mask is draining for a " +
                    "Faceless, and it may only be done once per day per purchase. Multiple purchases may be used at the same " +
                    "time to become immune to multiple spheres."

            racialDisInfoTitle.text = "Demonic Spirit"
            racialDisInfo.text = "\t\tAlthough their origin may be shrouded in mystery, one fact that cannot be " +
                    "denied is that the Faceless have been tainted by demonic powers and owe their existence to it. As such, " +
                    "Faceless take x4 damage from sources of Psionic damage and this is considered a racial vulnerability. As " +
                    "with all racial vulnerabilities, Psionic damage will bypass any thresholds a Faceless might have. Also, " +
                    "Banish and Exorcism spells will not return a Faceless to their home plane but they will drop the Faceless " +
                    "into their Death Count akin to a Death effect. With the exception of these two special conditions, other " +
                    "Psionic effects function normally."
        }
        else if (characterRace == "Gnome"){
            autoRacialInfoTitle.text = "Scavenger"
            autoRacialInfo.text = "\t\tGnomes have a natural talent for finding useful scrap, repurposing junk into " +
                    "amazing gadgets and making the impossible seem possible with raw material. Every Gnome is seemingly " +
                    "capable of pulling Raw Material out of thin air and using it for just about anything. At each Logistics, " +
                    "Gnomes may collect 5 universal RM."

            racialInfoTitle.text = "Gnomish Device"
            racialInfo.text = "\t\tThrough skilled tinkering a Gnome can create fantastical gadgets which " +
                    "mimic magic items without being magical. For each purchase of Gnomish Device, a Gnome is able to " +
                    "build and maintain one additional Device. The Gnome may choose from 3 lists of 10 Devices during " +
                    "Logistics, provided by the Shaper team. These lists are divided into Offensive, Defensive and Utility " +
                    "themed Devices. After choosing a list the Gnome’s player will then roll randomly on whichever list they " +
                    "chose. They may see the lists prior to choosing a list. The result of the roll will determine which Device " +
                    "the Gnome receives. If the Gnome does not like the Device they receive, they can pay 5 RM per digits " +
                    "difference between the item they rolled and the item they want. For example: Wozzbur rolls a 7 after " +
                    "selecting the Defensive list. Wozzbur sees a Device he wants more, which is Device #3 on the list. " +
                    "Wozzbur can pay 20 RM (5 RM x 4) to select that Device instead.\n\n" +
                    "\t\tEach Gnomish Device has one per day power and one negative effect that is either constant or activates " +
                    "along with the power. After the initial use, a Gnome may choose to feed RM to the Device to use it again. " +
                    "For every 5 RM of any type used to power their Device it will receive a new daily use of that power. If " +
                    "more than 5 RM is used on the Device at one time it will not be divided; any additional RM past 5 will be " +
                    "wasted. Each Device can be “recharged” up to 5 times per day.\n\n" +
                    "\t\tGnomish Devices do not expire, but during Logistics a Gnome may abandon an old Device and select a " +
                    "new one from the Device lists. Devices may not be switched mid-event and may only be used by their " +
                    "creator. Device powers are not considered racial and will use prefixes based on their design – alchemical, " +
                    "elemental, magic, etc. Although some Devices will use magic prefixes for the sake of clarity, they will not " +
                    "detect as magical nor are they magical in-game."

            racialDisInfoTitle.text = "Psychosomatic Static"
            racialDisInfo.text = "\t\tGnomes hate magic and magical items in particular, including spell " +
                    "foci. This manifests in a bizarre psychological condition. If a Gnome comes into contact with a magic " +
                    "item they will begin to itch violently, as if they were allergic to it, and must scratch themselves " +
                    "frantically. This itching will continue so long as the Gnome is touching the item or has it anywhere on " +
                    "their person. While the itching continues the Gnome is unable to speak, cast or use any skills, but can " +
                    "move at normal speed. This prevents a Gnome from activating magic items that have per day/hour/etc. " +
                    "abilities, as they cannot speak the activation words. Gnomes may handle magic items that don’t require " +
                    "activation, such as magical swords and armour, but they will continuously experience their allergic " +
                    "reaction while doing so. It is important to note that this allergy isn’t real – it’s all in the mind of the " +
                    "Gnome. It will activate when the Gnome a) knows that an item is magical or b) believes it is magical. The " +
                    "Gnome cannot actively detect magical items and confirm their existence out of game, but they may react " +
                    "to items which simply seem magical. For example, if a wand covered in runes is glowing, a Gnome will " +
                    "believe it to be magical in nature. Gnomish hatred of magic is a racial disadvantage and is therefore " +
                    "impossible to overcome. Gnomes cannot be tricked into using magic, disbelieve in magic or otherwise " +
                    "avoid this racial hatred in any way. Gnomes are always able to distinguish Gnomish Devices from " +
                    "magical items. "
        }
        else if (characterRace == "Ice Elf"){
            autoRacialInfoTitle.text = "Scion of Suffering"
            autoRacialInfo.text = "\t\tIce Elves are conditioned to carry on when physical pain would leave " +
                    "any other race unable to do more than cry for help. When at 0 or 1 Body, Ice Elves remain conscious and " +
                    "able to perform all actions they normally could at 2 Body, without falling unconscious. Use of this ability " +
                    "does not require the skill Self Mutilate."

            racialInfoTitle.text = "Memories in Flesh"
            racialInfo.text = "\t\tOnce a day an Ice Elf may recall a lesson by carving into their skin with " +
                    "a blade a phrase, an image, a symbol, etc., that reminds them of their lesson. Doing so takes 5 minutes of " +
                    "focused concentration and will return the use of any tagged (daily, hourly, etc.) character ability or skill, " +
                    "including class abilities, that has been used since last reset. This ability may only be used when the Ice Elf " +
                    "is at full Body. It will not return any skill or ability more than once per day even if the character has " +
                    "multiple purchases of the skill or multiple purchases of Memories in Flesh. Memories in Flesh will not " +
                    "refresh magic items or ritual spells on spirit. If Memories in Flesh is used to return a spell slot, that spell " +
                    "slot can only be used to cast the original spell memorised for that slot. Using this racial ability will lower " +
                    "the Ice Elf to 1 Body at the end of the 5 minutes of concentration. This ability may be used once a day per " +
                    "purchase, which will allow additional uses for different skills/abilities."

            racialDisInfoTitle.text = "Pandora's Touch"
            racialDisInfo.text = "\t\tIce Elves are marked from birth by the dark magics of Pandora. If “Sense " +
                    "Dark” calls are used, they must respond. Ice Elves have a permanent aura on their spirit of “Active Dark " +
                    "Magic” at all times, which will respond to certain effects, such as Witch Marks. Finally, like Angels they " +
                    "are vulnerable to Psionic magic, and take x2 from Psionic damage. Exorcism effects do not affect them."
        }
        else if (characterRace == "Sidhe"){
            autoRacialInfoTitle.text = "Formless Casting"
            autoRacialInfo.text = "\t\tThis racial allows a Sidhe to cast Battle Magic spells without requiring a " +
                    "free casting hand or the need to speak. Out of Game, the player must still correctly state the spell’s incant " +
                    "and is still required to hit their target with a spell packet (if needed) however in-game the Sidhe will " +
                    "remain motionless and silent during casting. In other words, the rulebook process for casting a spell " +
                    "remains the same (incant + packet strike), it is only the In Game actions which change. Spell packets are " +
                    "still visible in game and any defences which the spell triggers will still create the normal flash of light " +
                    "when they go off. This racial ability functions at will for Day Sidhe between 6 AM - 6 PM and for Night " +
                    "Sidhe between 6 PM - 6 AM. To activate this power, a Sidhe must state “Formless Casting” prior to any " +
                    "incants."

            racialInfoTitle.text = "Magic Echo"
            racialInfo.text = "\t\tSidhe have the ability to “Echo” a spell that they have cast against a target. If " +
                    "their target successfully defends against a spell, the Sidhe can cause it to strike a second time in an " +
                    "attempt to bypass defenses. By using this racial, a Sidhe can force their opponent to defend a second time " +
                    "or take the effect. When the target is hit by a spell and calls an appropriate defense, the Sidhe may then " +
                    "call “Innate Echo!”, causing the target to be instantly hit by the spell again, although they may still defend " +
                    "against it if possible. This racial ability functions for Sidhe at any time of the day. This skill cannot be " +
                    "used to Echo magic items. Usable once per day per purchase."

            racialDisInfoTitle.text = "Fleeting Death Count"
            racialDisInfo.text = "\t\tUnlike other true fae, Sidhe do not have a vulnerability to iron. " +
                    "However, their spirits on the mortal realm are weak. Sidhe have a 10 second Death Count which cannot " +
                    "be extended in any way. During these 10 seconds the Sidhe can stand on their feet as a spirit and cast any " +
                    "one spell from memory. After they choose to cast a spell, they cannot be Lifed. They cannot speak during " +
                    "this time (minus their one incant) and both feet must remain planted after they have stood up. They are " +
                    "completely invulnerable for this period and appear as a ghostly version of themselves, unable to " +
                    "physically interact with people or objects. A Sidhe may choose to target themselves with a Life spell, " +
                    "throw a final spell at their enemy or assist an ally. This spell must still be incanted correctly and the target " +
                    "must be struck with a packet if required. Only a magical Life effect (cast by the Sidhe themselves or " +
                    "another) will revive them. Non-magical Life effects will have no impact. The 10 second window only " +
                    "exists for the Sidhe if they are in their matching time cycle – day for Day Sidhe, night for Night Sidhe – " +
                    "however there is no limit to the amount of times the 10 second window may be used during those periods. " +
                    "If they are not in their matching time cycle, they will bypass their Death Count and resurrect immediately."
        }
        else if (characterRace == "Vulcan Dwarf"){
            autoRacialInfoTitle.text = "Volcanic Skin"
            autoRacialInfo.text = "\t\tVulcan Dwarves have an extremely thick skin, due to their acclimatization " +
                    "within an active volcano. The possession of this thick skin gives a Vulcan Dwarf the ability to resist any" +
                    "single Body damage attack, once per day, by calling “Racial Resist”. Resisting an attack this way will " +
                    "also allow the Vulcan Dwarf to resist any carriers that would have affected the Vulcan Dwarf if the attack " +
                    "was successful."

            racialInfoTitle.text = "Endure Fire"
            racialInfo.text = "\t\tVulcan dwarves have the ability to endure massive amounts of heat. Once per " +
                    "day per purchase a Vulcan Dwarf is able to endure elemental and magical fire for 10 minutes. During " +
                    "those 10 minutes they will subtract 25 damage from all sources of fire and heat to a minimum of 0. Each " +
                    "time this ability is purchased an additional -25 is added and an addition use is gained. Eg: If this ability is " +
                    "purchased 3 times, then 3 times a day a Vulcan Dwarf subtracts 75 damage from all fire damage sources " +
                    "for 10 minutes. This ability is activated by stating “Racial Endure Fire”."

            racialDisInfoTitle.text = "Crippling Vulnerability to Cold"
            racialDisInfo.text = "\t\tDue to their nature, Vulcan Dwarves are extremely " +
                    "susceptible to the cold. Vulcan Dwarves take x4 damage from Ice. Furthermore, if a Vulcan Dwarf is " +
                    "dropped into their Bleed Count via an Ice attack they will explode into chunks of frozen body parts and " +
                    "enter their Death Count, removing the Bleed Count entirely. Only a Life spell or some other form of " +
                    "miracle will bring them back to life at that point. As with all racial vulnerabilities, Ice damage will bypass " +
                    "any thresholds a Vulcan Dwarf might have. "
        }

        if (characterVocation == "Choose a vocation") {
            if (characterClass == "Mercenary") {
                level3InfoTitle.text = "Hamstring"
                level3Info.text = "\t\tAn Occupational Ability for Mercenaries, this skill allows the Mercenary to injure the target’s leg and hamper " +
                        "their movement. To activate this skill the Mercenary must successfully strike the target’s leg with a weapon and " +
                        "call out “Innate 3 Body Hamstring.” If the hit is successful, the target will take 3 Body damage and temporarily " +
                        "loses mobility in the injured leg, slowing their movement to 1 step every 3 seconds. This skill may be stacked if " +
                        "purchased more than once, allowing the damage to increase for each time it is used. For example, if Hamstring is " +
                        "purchased 3 times all three may be used simultaneously to create a “Innate 9 Body Hamstring” attack. Lastly, " +
                        "specific damage types may be called such as “silver” or “magic” based on the weapon used to hamstring. This " +
                        "makes walking slow and running impossible. This effect will last until the target receives at least 3 Body points " +
                        "worth of healing. This skill is usable once per day, per purchase."

                level6InfoTitle.text = "Head-Butt"
                level6Info.text = "\t\tAn Occupational Ability for Mercenaries, a Head-Butt attack will stun the target for 5 seconds. While stunned, a " +
                        "victim is unable to take any action, including blocking, moving and the use of skills, minus the ability to call " +
                        "“interrupt” against Killing Blows and any counts against them. Automatic defenses such as Shield Magic will still " +
                        "operate, but ones requiring conscious thought such as Advanced Shield Magic will not. It may be used at will but " +
                        "only once per target, per day. To use the attack, place your palms on victim’s shoulders, facing the victim from " +
                        "the front, and state “Innate Physical Head-Butt”. If the attacker naturally swings for a type of damage other than " +
                        "Normal, this damage type is placed in front of the normal call. There is no numerical value for this attack, so " +
                        "when determining if the attack is stopped by a defender’s threshold, only the damage threshold type is taken into " +
                        "account. For example, an “Innate Silver Physical Head-Butt” will breach a defender’s +2 Silver threshold, but not " +
                        "a Magic one. A helmet on the defender will negate the attack, regardless of the damage type. A secondary effect " +
                        "of this ability allows the mercenary to escape a Garrotte. A Mercenary can use a Head-Butt attack while being " +
                        "Garrotted but the attack will be negated if the Garrotter is wearing a helmet. To escape a Garrotte the Mercenary " +
                        "does not need to be facing their attacker, but must place their hands on their attacker’s hands and state “Physical " +
                        "Head-Butt”. Performing a Head-Butt will do 1 Body damage to the attacker, which cannot be avoided in any way." +
                        "Self Mutilate is not needed to use this ability."

                level9InfoTitle.text = "Dismember"
                level9Info.text = "\t\tAn Occupational Ability for Mercenaries, this skill will sever the arms or legs of a target. By calling out “Innate 5 " +
                        "Body Dismember!” before striking an arm or leg, the Mercenary is able to deliver 5 points of Body damage and " +
                        "sever the limb from their victim. This skill may be stacked if purchased more than once, allowing the damage to " +
                        "increase for each time it is used. For example, if Dismember is purchased 3 times all three may be used " +
                        "simultaneously to create a “Innate 15 Body Dismember” attack. Also, specific damage types may be called such " +
                        "as “silver” or “magic” based on the weapon used to Dismember. The skill is consumed regardless of whether the " +
                        "attack is successful or not. It will work on arms and legs only. The skill may be used once per day per purchase."

                level12InfoTitle.text = "Razor's Edge"
                level12Info.text = "\t\tAn Occupational Ability for Mercenaries, this skill allows the Mercenary to sharpen, hone, or reinforce any " +
                        "weapon to add a +1 to its base damage for 1 year. The ability may be used once per day per purchase and takes 10 " +
                        "minutes of in-game time to complete. If the process is interrupted during that time, that day's use of Razor’s Edge " +
                        "is used up and considered to be wasted. Once complete, the skill tag must be attached to the weapon, beside the " +
                        "weapon tag. Otherwise, a new tag, with the new base damage, must be signed off / authorized by a Shaper. If a " +
                        "Razor’s Edged weapon is enchanted, the Razor’s Edge will expire when the enchantment does. This skill may " +
                        "only be used on non-Magical weapons and each weapon may only have one Razor’s Edge on it at a time."
            }
            else if (characterClass == "Ranger") {
                level3InfoTitle.text = "Detoxify"
                level3Info.text = "\t\tAn Occupational Ability for Rangers, this skill allows the Ranger to remove toxins and Alchemical substances " +
                        "from the target’s bloodstream. It takes 1 uninterrupted minute for the Ranger to remove the toxin from the target. " +
                        "If, at any time, the Ranger stops, or takes damage to Body, the Detoxify fails and the skill is considered used. It " +
                        "will work on any toxin or Alchemical substance which can be cured by a standard Antidote, regardless of how " +
                        "long the toxin has been in the target’s system. The call for this ability is “Innate Detoxify”. This skill is usable " +
                        "once per day, per purchase."

                level6InfoTitle.text = "Trailblazing"
                level6Info.text = "\t\tAn Occupational Ability for Rangers, this skill allows the Ranger to call “Innate Trailblazing” to release " +
                        "themselves from any magical or alchemical binding effect that requires a strength bonus to escape from without " +
                        "taking any Body damage. This skill does not function against any man-made devices like bear traps or manacles. " +
                        "This skill is usable once per day, per purchase."

                level9InfoTitle.text = "Nature's Grasp"
                level9Info.text = "\t\tAn Occupational Ability for Rangers, this skill allows the Ranger to infuse any weapon with the binding power of " +
                        "Nature. It takes 10 seconds to infuse one weapon and during that time, the Ranger must concentrate by rubbing " +
                        "the weapon with leaves, dirt or other symbols of nature. If the Ranger is interrupted, or takes damage to Body, the " +
                        "ability fails and is used up for the day. If successfully created, the weapon’s damage suffix is changed to “Magic” " +
                        "and, when used, will entangle the target in a Bind effect. When a target is successfully hit, roots will rise up from " +
                        "the ground, entangling their legs and arms. Movement will become impossible. It takes a 4 minute count to cut " +
                        "free from the entanglement, or the target may rip it out if they have at least +4 Strength, and the skill Self " +
                        "Mutilate, suffering 4 Body damage in the process. The call for this attack would be “Innate <damage> Magic " +
                        "Bind”. This infusion will last 5 days or until first used. This skill is usable once per day, per purchase."

                level12InfoTitle.text = "Call of the Hunt"
                level12Info.text = "\t\tAn Occupational Ability for Rangers, this skill will summon into being a powerful Hunt-Master to hunt a target " +
                        "that has offended nature. Not to be used lightly, this skill will summon forth the Hunt-Master and their hounds. " +
                        "This skill can only be used by the Ranger between the hours of 6am and 6pm. The ability requires a 10-minute " +
                        "ritual and requires the Ranger’s full attention. Should the Ranger use any other skill or ability, take damage to " +
                        "Body, or become distracted for more than 60 seconds, the ability will fail and be consumed for the event. During " +
                        "these 10 minutes, the Ranger must commune with nature, stating their reasons for calling the Hunt, and end by " +
                        "sacrificing a living creature (animal will suffice) to the Hunt-Master. The sacrifice should be performed in a way " +
                        "appropriate to the culture of a Ranger and which respects the gift given by the sacrifice. The more elaborate this " +
                        "ritual is, the stronger the Huntsman will be. This ceremony should take place in front of a marshal. At the end of " +
                        "the ritual, the marshal will ask the Ranger whether they would like an NPC Hunt-Master and hounds, or if they, " +
                        "and up to 3 of their friends, would like to act as the Hunt-Master and their hounds. If the Ranger requests an NPC " +
                        "Hunt-Master, and NPC camp has the NPCs to spare, the Hunt-Master and their hounds will appear between the " +
                        "hours of 6pm and 6am that night.\n\n" +
                        "\t\tIf the Ranger requests to act as the Hunt-Master themself, or NPC camp does not have NPCs to spare, the Ranger " +
                        "will become imbued with the power of a Hunt-Master and up to three other PCs will be imbued with the power of " +
                        "the Hunt-Master’s hounds. Anyone who wishes to be part of this must have been involved in the ceremony. The " +
                        "Ranger and their friends will be given claws, horns, and anything else they require for the role. The Ranger will " +
                        "keep their own skills, abilities, etc., but will also be given additional Hunt-Master. The PC hounds will have only " +
                        "the hound abilities. While in this form, the Ranger and their hounds must hunt down their target. If they stop " +
                        "hunting or do something else, the effect ends. A marshal may end the hunt early if they feel the Ranger is not " +
                        "actually hunting their target. While in this form, the Ranger can sense the general direction of their target (ie: " +
                        "north, west, etc.) until they get within 1 mile of the target. Within 1 mile of the target, the Ranger can “Sense” " +
                        "their target at will by stating, “Sense [Target]”. If a PC dies as the Hunt-Master, they take a death and resurrect " +
                        "like normal. If a PC dies as a hound, they resurrect but their death is not recorded.\n\n" +
                        "\t\tThe Hunt-Master is not a mindless creature chained to the will of the Ranger. It is an aspect of nature and can act " +
                        "with intelligence, cunning and fury. Should the Ranger use this ability frivolously or without warrant, they may " +
                        "find themselves the hunted. The movement of the Hunt-Master and his hounds is limited to the natural and rural" +
                        "environment. They cannot cross constructed bridges, city streets made of anything but dirt, or enter buildings or " +
                        "other dwellings which are not naturally occurring. The Hunt-Master will not hunt mindless creatures or those " +
                        "without a Spirit. This ability can only be used by the Ranger once per event."
            }
            else if (characterClass == "Templar") {
                level3InfoTitle.text = "Burn Slot"
                level3Info.text = "\t\tAn Occupational Ability for Templars, this skill allows the Templar to “burn” any unused Battle Magic or Ritual " +
                        "Magic level spell-slots to add damage, at the value of +2 Magic/slot, to their next weapon strike. The Templar " +
                        "may choose how many of their unused slots to burn at the time of the swing. Any spells stored in those slots are " +
                        "lost. E.g. A Templar who normally swings for “2 Normal” with their sword chooses to burn 3 slots, the call would " +
                        "be “Innate 8 Magic” for that one swing. The level of the slot does not matter for this purpose. If the swing misses " +
                        "or is blocked, the skill is used up, as are the slots burned. This skill is usable once per day, per purchase."

                level6InfoTitle.text = "Scroll Harvest"
                level6Info.text = "\t\tAn Occupational Ability for Templars, this skill will allow the Templar to activate a Battle Magic scroll without it " +
                        "being consumed. To activate this skill, the Templar must hold the target scroll, verbally state “Innate Scroll " +
                        "Harvest <scroll name>” then verbally incant the spell on the scroll. The scroll will activate normally but will not " +
                        "be consumed by the casting. This class ability will work on scrolls level 1 to 7. For scroll levels 8 to 9, two uses of " +
                        "Scroll Harvest must be used. Normal rules for activating a Battle Magic scroll apply. This ability does not grant " +
                        "the Templar the Read Magic Ability, which must be purchased separately. This skill is usable once per day, per " +
                        "purchase."

                level9InfoTitle.text = "Weapon Break"
                level9Info.text = "\t\tAn Occupational Ability for the Templar, this skill will allow the Templar to shatter an opponent’s weapon, " +
                        "spraying the target with the shattered pieces. The Templar may break an opponent’s weapon using their own " +
                        "weapon, like a physical effect, so long as the weapon is hit. This ability will also work on shields. If the shatter is " +
                        "successful, the target will also be dealt 15 damage of whatever type their weapon was dealing when it was struck. " +
                        "This damage type includes Normal, Magic, silver, etc., but does not include Body damage or Alchemical effects. " +
                        "Shields deal Normal damage. The call is “Innate Weapon Break!” This skill is usable once per day per purchase."

                level12InfoTitle.text = "Weapon Conduit"
                level12Info.text = "\t\tAn Occupational Ability for Templars, this skill will allow the Templar to absorb, store and redirect Battle Magic " +
                        "spells and magical effects which exactly copy a Battle Magic spell which they have successfully been hit with, " +
                        "through their melee weapon. The Templar may use any source for this Battle Magic including: spells they cast on " +
                        "themselves, offensive spells cast at them, scrolls, or even Battle Magic producing Magic items.\n\n" +
                        "\t\tTo effectively use Weapon Conduit the Templar must first absorb a Battle Magic spell they are the target of. By " +
                        "stating “Innate Weapon Conduit!” at the time of absorption, the Templar’s own body will absorb the spell and " +
                        "then act as a conduit, sending it though their own weapon, on to another target. Once a spell is stored in the " +
                        "weapon, the Templar may unleash it at their will in the form of a Spellstrike. To activate the spell inside the " +
                        "weapon the Templar must call out “Spellstrike <spell>” The Templar has 1 minute to unleash his absorbed spell " +
                        "before the stored power of the spell explodes from their body. If the Templar fails to unleash their stored spell " +
                        "within that time, they suffer 15 points of magic damage. Stored spells do not stack on the Templar. Spellstrikes " +
                        "may be only used in conjunction with melee weapons. This ability can be used once per day per purchase. "
            }
            else if (characterClass == "Assassin") {
                level3InfoTitle.text = "Shiv"
                level3Info.text = "\t\tAn Occupational Ability for Assassins, this skill allows the Assassin to turn any single simple- or medium-sized " +
                        "weapon or stiletto swing into Body damage equal to the weapon’s base damage. If a stiletto is used, the damage is " +
                        "doubled. Preparing the Shiv attack requires a 3-count - “Innate Shiv 1, Innate Shiv 2, Innate Shiv 3”. This skill " +
                        "can be combined with any other skill or ability as if it were a normal weapon swing. This effect is used up " +
                        "regardless of whether the attack hits or misses. The Assassin has 1 minute to use the Shiv before it expires. This " +
                        "skill is usable only by the Assassin who prepares it and is usable once per day per purchase."

                level6InfoTitle.text = "Silent Strike"
                level6Info.text = "\t\tAn Occupational Ability for Assassins, this skill allows the Assassin to add a silencing effect to one of their " +
                        "Normal attacks. For this effect to activate successfully, the attack must damage the target into Body. If the attack " +
                        "does not damage the target into Body, this skill will fail. This silencing effect lasts until the target receives at least " +
                        "1 Body point of healing. To activate this skill the Assassin must declare “Innate Silent Strike”. Once activated the " +
                        "Assassin has one hour to engage their prey, adding the suffix “Silence” once to their next weapon swing. This " +
                        "skill may be used in conjunction with an Execute to create a Silent Kill. To use the ability in this manner the " +
                        "assassin must declare “Silent Kill”. A silent kill functions exactly the same as an execute save that the target is " +
                        "silenced and cannot scream. The Silent Strike skill may be used once per day, per purchase."

                level9InfoTitle.text = "Spirit Sever"
                level9Info.text = "\t\tAn Occupational Ability for Assassins, this skill allows the Assassin to cut the astral strands that bind a Spirit to " +
                        "its body. This skill must be used on a target in their Death Count and takes one minute to complete. During this " +
                        "time, the Assassin must stay with the target, actively cutting the invisible strands that tie the target's Spirit to their " +
                        "body. If successful, the target Spirit must forgo the remaining time in their Death Count and immediately attempt " +
                        "to Resurrect. While the Assassin is using this skill, it is suggested that the target continue their normal Death " +
                        "Count, outlined by their race, in the event the Assassin fails. The one-minute Spirit Sever count must be said by " +
                        "the Assassin, loud enough for the target to hear. If at any point the Assassin stops counting, is interrupted, uses " +
                        "any other skill or if the target was so far along in their Death Count they Resurrect before the Assassin finishes, " +
                        "this skill will fail. This skill will also fail if used on a conscious target or a target in their Bleed Count. This skill " +
                        "can be used once per day per purchase."

                level12InfoTitle.text = "Penetration"
                level12Info.text = "\t\tAn Occupational Ability for Assassins, this skill allows the Assassin to bypass armour and Magical protections " +
                        "for a single physical attack. When used, the Assassin may add the “Innate Surprise Penetrating” prefix to their " +
                        "damage call for one melee or ranged attack that strikes their opponent from behind. A penetrating attack ignores " +
                        "all non-ritual level protections, non-racial abilities, and any armour the target may be wearing. If the Assassin " +
                        "misses their target with their swing or the attack is physically blocked by another weapon or shield, this ability is " +
                        "used up for the day. It is usable once per day per purchase. Penetration may be used in conjunction with any " +
                        "Rogue skill, even if said skill explicitly states that it may be not used in conjunction with other skills."
            }
            else if (characterClass == "Nightblade") {
                level3InfoTitle.text = "Feint"
                level3Info.text = "\t\tAn Occupational Ability for Nightblades, this skill allows the Nightblade to quickly evade any packet-delivered" +
                        "alchemical attack they are successfully struck with. To use this ability, the Nightblade must state “Innate Feint,” " +
                        "in order to avoid the attack. This skill also has the additional benefit of acting as the pre-requisite for the rogue " +
                        "skill Dodge, without requiring the Nightblade to purchase the skill Critical. Each purchase of Feint fulfills the pre-requisite for a single purchase of Dodge."

                level6InfoTitle.text = "Duplicate Key"
                level6Info.text = "\t\tAn Occupational Ability for Nightblades, this ability will create a duplicate of any key, Magical or otherwise. " +
                        "This ability will work on any mundane key, wizard lock key, ward keys etc. This ability requires the original key " +
                        "or a pre-existing duplicate to be touched by the Nightblade and a declaration of “Innate Duplicate Key” must be " +
                        "said aloud. This duplicate will last 24 hours or until used once. It may be used once per day, per purchase. "

                level9InfoTitle.text = "Dim"
                level9Info.text = "\t\tAn Occupational Ability for Nightblades, this skill allows the Nightblade to become invisible and non-corporeal " +
                        "so long as they do not move, attack, or make any sound. To use the skill the Nightblade must be in darkness. A " +
                        "character is in darkness when words on a page held at arm’s length cannot be read. Dimming requires a three-count, “Innate Dim 1, Dim 2…”, both entering and exiting the Dim. Should a light source destroy the shadow the " +
                        "Nightblade will automatically be forced out of Dim (still requiring an exiting 3 count). While dimmed, a " +
                        "Nightblade must put on a white, out-of-game headband, or place their hand/weapon on their head. This ability " +
                        "does not hide the Nightblade from Sense abilities. This skill may be used once per day, per purchase."

                level12InfoTitle.text = "Passwall"
                level12Info.text = "\t\tAn Occupational Ability for Nightblades, this ability allows the Nightblade to ethereally attune a small section of " +
                        "a normally solid surface, allowing them to pass back and forth through it, stating “Innate Passwall”. It will allow " +
                        "the Nightblade to enter and exit through the surface, but only once per direction. This attunement will work on " +
                        "any object that is less than 3 feet in thickness, such as stone walls and doors (including magical and ritual " +
                        "barriers). Only the Nightblade, mundane untagged clothing, Spirit linked items, and items made from the " +
                        "Duplicate Key skill, may enter. All other items must be left behind. If or when the Nightblade exits through the " +
                        "attuned surface, they may bring any items with them. The attuned surface will last 5 minutes. The ability requires" +
                        "1 minute of uninterrupted concentration before using. If Body damage is taken during the 1 minute of preparation, " +
                        "the skill is used up and wasted. It may be used once per day per purchase. "
            }
            else if (characterClass == "Witch Hunter") {
                level3InfoTitle.text = "Witch Mark/Opposed Sphere"
                level3Info.text = "\t\tAn Occupational Ability for Witch Hunters, this skill serves two purposes:\n\n" +
                        "\t\tFirst, it allows for the creation of a glowing magical symbol that will store any Battle Magic spell cast into it by " +
                        "the Witch Hunter within 60 seconds of its creation. This spell must be cast by the Witch Hunter or through a " +
                        "magic item used by them. The symbol must be represented by a lit green glowstick and must remain stationary " +
                        "and unhidden. The tag for the Witch Mark must be attached on or next to the glowstick, as well as the spell tag if" +
                        "one is used. The Witch Hunter must choose one of their opposed spheres and write that on the Witch Mark tag, " +
                        "stating “Innate Witch Mark <Sphere>”. Once prepared, the Witch Mark will activate the next time a person with " +
                        "active magic from the chosen sphere comes within 10 feet of it. If this occurs, the target will be automatically " +
                        "struck by the stored spell as if they had been successfully hit by a spell packet. For the purposes of defenses, the " +
                        "attack is presumed to have a call of “Magic <spell>”. If no spell is cast into the Witch Mark, it will do 1 Magic" +
                        "damage instead. Once the Witch Mark is activated, it will vanish. A Witch Mark can be destroyed and is " +
                        "considered to have 1 Body Point.\n\n" +
                        "\t\tSecond, purchasing this ability allows the Witch Hunter to choose one hated sphere. Until this class ability is " +
                        "purchased for the first time, a Witch Hunter has no opposing sphere of magic. This class ability may be purchased " +
                        "multiple times, each time allowing the Witch Hunter to choose a new sphere of magic if they desire, otherwise " +
                        "multiple purchases will simply unlock more uses of the Witch Mark per day."

                level6InfoTitle.text = "Twist of the Tongue"
                level6Info.text = "\t\tAn Occupational Ability for Witch Hunter, this skill will allow the Witch Hunter to inflict a terrible attack on any " +
                        "target, twisting and spiraling their tongue, should they cast from any of the Witch Hunter’s opposed spheres. This " +
                        "packet delivered attack, if successfully landed, will sit, impervious to all methods of removal, on a target’s spirit " +
                        "for the next hour like a magical trap. If at any time during that duration the target casts a spell from the Witch " +
                        "Hunters hated spheres, from memory, scroll, or magic item, their tongue will twist and spiral once the spell is " +
                        "cast. A target with a twisted tongue may grunt and squeal but cannot cast, engage in coherent speech or use any " +
                        "skills, items or abilities that require speech for duration of one hour. This infliction may not be healed or cured, " +
                        "even if the target dies and is given a life spell. Only successful resurrection or duration expiry will restore the " +
                        "targets tongue. The call for this ability is “Innate Arcane Twist of the Tongue <Spheres>”, e.g. “Innate Arcane " +
                        "Twist of the Tongue Necromancy Psionics”. This ability is usable once per day per purchase. "

                level9InfoTitle.text = "Karmic Ricochet"
                level9Info.text = "\t\tAn Occupational Ability for Witch Hunters, this ability will allow the Witch Hunter to absorb any Battle Magic" +
                        "spell and return it back to the caster. This ability can absorb a spell from the Witch Hunter’s Opposed Spheres of " +
                        "Magic that successfully strikes him/her, or any other target within 10 feet of the Witch Hunter, by verbally " +
                        "declaring “Innate Arcane Ricochet”. The Witch Hunter then has 3 seconds to ricochet that spell back to the " +
                        "original caster or into the ground via spell packet or touch-cast. If s/he fails to do this or does not ricochet it within " +
                        "the 3 seconds, the Witch Hunter will take the full effect of the spell themselves. When returning the spell, the " +
                        "Witch Hunter must declare “Innate Ricochet Magic <spell name>!” before throwing the packet. This returning " +
                        "spell will have no effect on any other target other than the original caster or the Witch Hunter. The spell being " +
                        "returned is an exact duplicate of the one that was captured by the Witch Hunter. This ability is usable once per " +
                        "day, per purchase."

                level12InfoTitle.text = "Counter Magic"
                level12Info.text = "\t\tAn Occupational Ability for Witch Hunters, this Arcane packet-delivered or touch attack will negate or destroy " +
                        "any Battle Magic and most Ritual spells of the Witch Hunters Hated spheres. This ability may also counter any " +
                        "spell that hits the Witch Hunter, so long as it is within their Hated spheres. Counter Magic will act the same as an " +
                        "Advanced Shield Magic spell in this regard and the defensive call is “Innate Arcane Counter Magic”.\n\n" +
                        "\t\tWhen used offensively, Counter Magic will destroy any one spell within the Hated Spheres of Magic that is active " +
                        "on the target and has a duration other than instant. The call for this attack is “Innate Arcane Counter Magic: " +
                        "<specific spell OR sphere>”. If a sphere is part of the call, the target chooses one active spell within that sphere to " +
                        "be removed. If a spell named in the call is active on the target, it is destroyed. If the specific spell called is not " +
                        "active on the target, the Counter Magic fails without activating defenses. This ability is usable once per day, per " +
                        "purchase. \n\n" +
                        "\t\tCounter Magic may be used against a target without a spirit, such as a cabin. Once again, either a specific spell " +
                        "may be targeted or a sphere. If an OOG note has been left describing an active spell effect (such as a Ward) and it " +
                        "is destroyed by the Witch Hunter, they may leave their Counter Magic tag attached to the note to indicate that it " +
                        "no longer exists. "
            }
            else if (characterClass == "Druid") {
                level3InfoTitle.text = "Create Grove"
                level3Info.text = "\t\tAn Occupational Ability for Druids, this skill awakens a 10-foot diameter circle of natural wilderness with druidic " +
                        "energy. A Grove grants the following powers: it allows the creator to see and identify any True Fae creature that " +
                        "steps within its boundary and the Grove creates an empathetic bond with its creator. This allows the Druid to " +
                        "sense the emotions of the Grove and vice versa. A Grove's emotion can change based on perceived threats to the " +
                        "grove or unnatural corruption of the lands surrounding it. These indicators will always be vague and cannot tell a " +
                        "druid specifics about the reasons for the emotional state, only that they exist. A Grove does not provide a barrier " +
                        "or any other protection to those inside, and cannot be augmented in any way, other than upgrading it to a Henge " +
                        "for which it is a prerequisite. It takes a 1-hour role-play ritual to create the Grove. Groves must have their " +
                        "boundary visibly defined by a rope or other marker but these markers can be natural, such as vegetation. Groves " +
                        "can only be made outdoors. They may contain structures such as tents, but only if the structure is small enough to " +
                        "fit completely inside the Grove. A Druid may have 1 Grove active at a time, per guild. The grove can be moved " +
                        "by releasing the druidic energy back to nature and performing the 1-hour role-play ritual again elsewhere. If a " +
                        "druid who has created a Grove dies a final death, the Grove fades away."

                level6InfoTitle.text = "Forest Meld"
                level6Info.text = "\t\tAn Occupational Ability for Druids, this skill allows the Druid to become one with the forest, hiding their " +
                        "presence. To successfully activate this skill the Druid must use a tree with a thickness such that they are unable to " +
                        "completely wrap the fingers of both their hands around its trunk. A 3 count declaration must be said aloud “Innate " +
                        "Forest Meld 1, Forest Meld 2 ...” At this point, the Druid will merge into the tree and must place their " +
                        "hand/weapon on their head, or don a white headband, to show they are out of game. The Druid may stay hidden " +
                        "inside the tree until s/he wills the skill to end, breaks concentration, or the tree takes 1 Body point of damage. At " +
                        "that point, the Druid will be ejected from the tree, again with a 3 count. While melded, a Druid is able to hear " +
                        "sounds as normal. A Druid who has created a Henge may choose to merge with it, if it is large enough, and forgo " +
                        "the expulsion due to Body damage. In this case the Druid will not be ejected unless the Henge dies, at which point " +
                        "so will the Druid. This skill may be used once per day, per purchase."

                level9InfoTitle.text = "Totem"
                level9Info.text = "\t\tAn Occupational Ability for Druids, this skill allows the Druid to shape-shift into their Totem Animal. The Totem " +
                        "Animal must be chosen upon purchase and cannot be changed after purchase. Subsequent purchases allow the " +
                        "Druid to select an additional Totem Animal. Totem may be used once per day per purchase.\n\n" +
                        "\t\tWhen used, this skill will transform a Druid into their chosen animal form. The animal cannot be smaller than a " +
                        "fox or larger than a brown bear. The animal may not be one that is capable of flight and must be natural/normal " +
                        "(not supernatural). It takes one minute to activate, and requires the Druid’s full concentration. If s/he becomes " +
                        "distracted, uses any other skill, or takes damage to Body during the transformation, the ability fails and is " +
                        "considered used for that day. All carried items and clothing will magically merge into the Totem form. These " +
                        "items cannot be retrieved until the Totem ends. This ability will fail if the Druid attempts to shape-shift while " +
                        "carrying an item with a Spirit or something that is larger than half their size. The experience of “shifting” for a " +
                        "Druid is a blessed and personal one. During this time, the Spirit of their Animal Totem grants permission to share " +
                        "its consciousness for a brief and majestic moment. This Totem change lasts for 1 hour and may be terminated at " +
                        "will (taking 1 minute to change back). If detected for magic, a Totem will glow and thus can be distinguished " +
                        "from a regular animal. While in Totem form, a Druid will detect as the Totem animal and not their original race.\n\n" +
                        "\t\tWhile in their Totem form, the Druid should think and behave as the animal does. The Druid will possess his/her " +
                        "own personality, motivations and fears. However, they will now be filtered through the mind of an animal. The " +
                        "character will now have “animal intelligence” but this should be viewed more like “forced role-play” than as a " +
                        "weakness. All information learned while in Totem form will be remembered when the Druid shifts back, unless " +
                        "the Totem animal dies. While in Totem form the Druid may not use any skills or abilities. Magic protections, " +
                        "augmentations and any other Magic targeting the Druid’s Spirit (positive or negative) will transfer over to the " +
                        "Totem form during the shape-shift; normal rules for duration still apply. All Totem Animals fight with two melee" +
                        "weapons to represent their “claws”. It is possible to construct a suit of armour specifically for the animal form, " +
                        "although the Totem Animal would require assistance putting it on.\n\n" +
                        "\t\tWhile in Totem form (and during the 1-minute transformation count), the Druid will take double damage from all " +
                        "silver weapons. Should the Druid fall into their “Death” count, their body will automatically revert to their " +
                        "original form over the next minute. The Druid may touch and carry silver items, but doing so will cause him/her " +
                        "great discomfort and should be role-played accordingly. Once shifted back, the Druid will be fully healed, unless " +
                        "they were in their Death count, and any Alchemical toxins or non-Magical diseases in their system will be " +
                        "removed. Shifting back cannot be interrupted.\n\n" +
                        "\t\tThe Totem will have the following stats. Please note that the numbers are calculated from level 1 and not the level " +
                        "at which the Druid purchased the skill.\n\n" +
                        "1 Normal threshold, +1 every 3 levels.\n" +
                        "2 damage via Claw, +1 every 3 levels.\n" +
                        "20 Body, +5 every 3 levels.\n" +
                        "1 “25 Slay” every 5 levels.\n\n" +
                        "\t\tThese stats/abilities cannot be improved by skills purchased by the Druid. In the same way that one cannot use a " +
                        "Totem slay outside of Totem form, one cannot use a character’s slay in Totem form. The same is true for all of " +
                        "these stats."

                level12InfoTitle.text = "Henge"
                level12Info.text = "\t\tAn Occupational Ability for Druids, this ability upgrades any Grove the Druid has created into something much " +
                        "more powerful. Once created a Grove will gain a “Heart” - a living organism at the center of the new Henge, " +
                        "which powers it and acts as its lifeforce. This Heart must be represented by living vegetation at the center of the " +
                        "Henge and must be marked with a tag. A Henge’s size and boundaries will mirror that of the Grove it was created " +
                        "from. A Henge has the abilities of a Grove, with the following additions:\n\n" +
                        "- The Henge Heart has 100 Body points and a magic threshold.\n" +
                        "- The Henge offers an always active, frictionless, spherical barrier. Those invested in the Henge may pass " +
                        "freely through the barrier and may “Recognize” others through the barrier on a 3-count, allowing them to " +
                        "enter and exit once. Recognition may be done without packets, simply by stating “I recognize 1, I " +
                        "recognize 2, I recognize 3” while pointing at the target. This barrier will prevent the passage of " +
                        "everything, with the exception of air, light, sound and gaze attacks, unless the ability specifically states " +
                        "otherwise. Attacks cannot be made from the inside of the Henge to the outside, even by investees.\n" +
                        "- The Henge can have as many people invested in it as the druid desires (this is done through a 1 hour role-play only ritual of the creator’s design). Being invested in a Ηenge persists through death. At any time, " +
                        "the creator of the Henge may “Divest” anyone Invested on a three count from within the Henge. The " +
                        "Divested does not need to be present at the time but should be informed OOG by a marshal.\n" +
                        "- The Henge can resurrect spirits as per a Resurrection Circle and will do so automatically, without " +
                        "assistance required, in 10 minutes.\n" +
                        "- The Henge allows anyone invested in the Henge to “reject” anything that has a Spirit and is not invested, " +
                        "forcing them outside the boundary by pointing at the target and stating “The Henge rejects you!” This " +
                        "cannot be resisted by anything but the most powerful of creatures. Once rejected, the same creature " +
                        "cannot be rejected from the Henge for 5 days. \n" +
                        "- The Henge allows anyone invested in the Henge to see any Spirit that is in the Henge, including Ghosts " +
                        "and those that walk in the Fae Realm.\n" +
                        "- The Henge will act as a Nature ritual circle for those invested and will act as a secondary caster for those " +
                        "rituals.\n" +
                        "- The Henge allows anyone invested to transport to the Fae realm once per day. Before this power is used, " +
                        "the Fae Marshal must be contacted. Chance of success and ultimate destination is decided by the Fae " +
                        "Marshal and based on the role-played actions and performed ritual done by those invested. This power " +
                        "does not give them the ability to transport themselves back to this plane.\n" +
                        "- The Henge does not know whether or not its investees have died unless they do so within the Henge.\n\n" +
                        "\t\tWhen a Henge Heart is killed, if the creator is within 5 miles of it, the creator will be hit with a repeating Arcane " +
                        "Death once per hour until they resurrect. A druid may have 1 active Henge per guild. If a Henge is destroyed a " +
                        "new one may be created via a new Grove, but it will not have any of the augmentations the previous Henge had " +
                        "nor the investees. If the druid who created the Henge dies a final death, all investees become divested and the " +
                        "Henge fades away. "
            }
            else if (characterClass == "Mage") {
                level3InfoTitle.text = "Identify Magic Item"
                level3Info.text = "\t\tAn Occupational Ability for Mages, this skill allows the Mage to identify a magic item by consuming a Catalyst " +
                        "of any type. The Mage must touch a Catalyst of any type, as well as the item they are attempting to identify, and " +
                        "state “Innate Identify”. The Catalyst will be consumed in a brilliant flash of blue light. The effect(s), flaw(s), " +
                        "activation word, expiry, and any other traits on the magic item tag will be revealed to the Mage. This skill is " +
                        "usable once per day, per purchase."

                level6InfoTitle.text = "Mana Harvest"
                level6Info.text = "\t\tAn Occupational Ability for Mages, this skill allows the Mage to harvest spent Battle Magic spells by consuming " +
                        "Catalysts. For this ability to be successful the Mage must touch the appropriate number of Catalysts, choose " +
                        "which used Battle Magic spell they are going to recall, and declare “Innate Mana Harvest <spell>”. The " +
                        "Catalyst(s) will be consumed in a brilliant flash of blue light and the Mage’s ability to cast that chosen spell will " +
                        "be recalled. To harvest a Circle 1-3 spell, the mage must consume one Catalyst of any type. To harvest a Circle 4-" +
                        "6 spell, the mage must consume two Catalysts of any type. To harvest a Circle 7-9 the mage must consume three " +
                        "Catalysts of any type. A Discord Catalyst will count as if it were two Catalysts. This ability will only recall a " +
                        "Battle Magic spell into memory that has already been used and will not allow the Mage to rememorize a new one " +
                        "in its place. This skill is usable at will but may only be used once per spell slot."

                level9InfoTitle.text = "Create Familiar"
                level9Info.text = "\t\tAn Occupational Ability for Mages, this skill allows the Mage to create, and bring to life, a magical Familiar. " +
                        "This Familiar is a part of the Mage, created from his/her raw magic. Only one such creature can exist at a time for " +
                        "the Mage, and the creature is considered to have animal intelligence. The Mage may choose the Familiar’s form at " +
                        "creation, but it must in some way represent one of the Spheres of Magic that the Mage can cast. Once decided, a " +
                        "Familiar's form cannot be changed. Its size is limited to no greater than a large housecat. The Familiar is spirit " +
                        "linked to its creator, and cannot leave the Mage’s person. It has no skills or abilities of its own, possesses no Spirit " +
                        "and cannot die, unless the Mage dies and resurrects. At any point, the Mage can choose to kill the Familiar, just " +
                        "by willing it. Doing so causes the Familiar to dissipate. While in existence, the Familiar will hold one Battle" +
                        "Magic spell that the caster can currently cast. This spell is chosen when the Familiar is first created and can be " +
                        "changed or reset when the Mage chooses to re-memorize their spells for that day. At any point, the Mage can cast " +
                        "that spell as if they had the extra spell-slot in their pyramid. Once done, the Familiar is now “empty” and cannot " +
                        "store another spell until the Mage resets for the day. The Familiar will also help in the casting of Rituals. The " +
                        "Familiar can act as a secondary caster in a Ritual the Mage casts as the primary caster, once per day. To create a " +
                        "Familiar, the Mage must spend one hour performing a rite to create an entity from raw magic. Once the hour has " +
                        "passed, the Mage must declare “Innate Create <Sphere> Familiar” for the ritual to be complete. The Familiar must " +
                        "be visually represented by the Mage. A doll or stuffed toy will suffice, as long as it in some way resembles the " +
                        "Sphere of Magic chosen. This skill may be used once per day, per purchase."

                level12InfoTitle.text = "Power Nexus"
                level12Info.text = "\t\tAn Occupational Ability for Mages, this skill allows the Mage to create a circle of power used in the casting of " +
                        "Ritual Magic for any Sphere that the Mage knows. Casting a ritual using a Power Nexus will add 1 White stone to " +
                        "the ritual bag. A Power Nexus will also allow the Mage to “Sense Catalyst” at will, so long as the mage is inside " +
                        "the circle. Those within range of the detection must announce how many (and what type of) Catalysts they carry " +
                        "on their person, even if they are outside of the circle. This circle is not equipped with a barrier or any other " +
                        "abilities unless the Mage alters it with ritual magic. A final ability of a Power Nexus is to have the Nexus " +
                        "transform into a circle of protection for 10 minutes. This transformation will change the Nexus into a Circle of " +
                        "Protection against one of these specific groups that must be declared at the time of transformation via “Innate " +
                        "Power Nexus: Circle of Protection from <name>!”: Any racial group in the rulebook (such as “elves”), lesser " +
                        "angels, lesser demons, lesser Undead, animals, Brood, constructs, elementals, fae, plants or magical beasts. Only " +
                        "one type of protection can be active at a time and it cannot be changed once active. When a circle is modified in " +
                        "this manner, it will last for 10 minutes then the entire circle will vanish permanently. While active the protective " +
                        "circle will prevent its target \"type\" from crossing the circle or performing hostile actions through it, but it will not " +
                        "act as a barrier to any other creature. \n\n" +
                        "\t\tThe Mage must visually represent this circle of power with a rope or some other method that clearly outlines its " +
                        "borders. A circle of power created with Power Nexus is 10 feet in diameter; however, multiple uses of this ability " +
                        "by the same Mage at creation will increase the diameter of this circle by 10 feet per use. This circle of power will " +
                        "last for 5 days and cannot be destroyed save via Ritual Magic. The Mage can choose to destroy this circle at any " +
                        "time they wish. For this skill to be successful, the Mage must visually represent their Circle and declare “Innate " +
                        "Magic Power Nexus!” This skill can be used once per day per purchase. "
            }
            else if (characterClass == "Bard") {
                level3InfoTitle.text = "Song of Aversion"
                level3Info.text = "Duration: Concentration\n" +
                        "\t\tThis Occupational Ability allows for a Bard in danger to cloud the minds of his foes, confusing them to his exact " +
                        "presence and hiding him for a few precious moments. This skill does not grant the Bard true invisibility but it will " +
                        "obfuscate his person, causing all around him to avoid and ignore the bard for a short period. To activate this skill," +
                        "the Bard must state “Innate Song of Aversion!” Once activated the Bard’s feet must remain stationary and for the " +
                        "next 15 seconds he must repeatedly state “Active Song of Aversion”. While the skill is active all those around the " +
                        "Bard that can hear his voice know the general location of the bard within ten feet, but he will appear blurred and " +
                        "displaced. They will unconsciously miss if they try to blindly attack or swing wildly in the area the bard is hiding." +
                        "This does not grant the Bard immunity to damage from Area of Effect spells or effects or the effects of Power or " +
                        "Command Words. This skill is intended to give the Bard a few moments to put away their valuable instruments to " +
                        "avoid harm and/or hopefully allow their friends to regroup and save him from the attack. This ability is usable " +
                        "once per day per purchase."

                level6InfoTitle.text = "Song of Love"
                level6Info.text = "Duration: 4 Hours\n" +
                        "\t\tAn Occupational Ability for Bards, this song will allow the bard to magically charm up to two individuals of their " +
                        "choosing, so long as both hear the bard’s performance from start to finish and are serenaded by the bard at least " +
                        "once. In order for a serenade to be successful, the song must have a duration of at least 5 seconds, and the targets " +
                        "of the serenade must make eye contact with or be touched by the singer. Once the performance is complete, the " +
                        "bard must either state “Innate Arcane Charm: Target’s Name” or convey to the target that they have been " +
                        "affected. Each target will then take the effect of an Arcane Command Word Charm Spell. The player may " +
                        "determine, out of game, whether this causes infatuation or a very strong friendship. This Command Word is not " +
                        "detectable when used, nor is spoken or cast by the Bard. Instead, it is a representation of the overall effect the " +
                        "Bards song has on his targets. Both the Charm and the potential infatuation will not cause the target to do things " +
                        "outside of their nature but they will act as if the bard is their new best friend and possibly lover. They will believe " +
                        "almost anything the Bard says to be true, they will protect the Bard with their lives if asked. A charmed target will " +
                        "not kill themselves or assassinate other loved ones unless somehow tricked or deceived. This effect will last for 4 " +
                        "hours after which the charm effect will wear off. This ability is usable once per day per purchase."

                level9InfoTitle.text = "Song of Intermission"
                level9Info.text = "Duration: Concentration up to 30 minutes\n" +
                        "\t\tAn Occupational Ability for Bards, this song will allow the Bard to use their performance to suspend or extend " +
                        "any spell or effect that is currently being counted or in duration. In order for this effect to work the target of the " +
                        "duration or count must hear the Bard’s song and willingly accept its effects to allow the duration or count to be " +
                        "extended. The Song of Intermission is so powerful that it can even delay death, pausing a willing victim’s death or " +
                        "Bleed Count, until help can be found. This function will work even if the dead or dying target cannot hear. To " +
                        "activate this song, the Bard must state “Innate Song of Intermission” then begin their performance piece. Song of " +
                        "Intermission will not affect any spell or effect that fails. This skill may only be used on one target at a time, " +
                        "though the target of the spell may be changed on a 3 count. This skill will last at most 1 minute per the Bard’s " +
                        "level. This skill is usable once per day per purchase."

                level12InfoTitle.text = "Song of Heroism"
                level12Info.text = "Duration: Concentration\n" +
                        "\t\tThis Occupational Ability allows the Bard to perform a masterpiece of heroic inspiration, leading allies to victory " +
                        "and bringing life back to the injured. In order for those listening to become heroic, they must consider the Bard an " +
                        "ally (that is to say, do not wish them harm), and have heard the song for at least 30 seconds. Once the " +
                        "requirements have been made all those that can hear the Bard will become inspired, gaining +2 Strength, an aura " +
                        "on their Spirit allowing them to swing any weapon for magic damage, and finally they become immune to the " +
                        "effects of Fear. To further this, all those who are under the effects of this song and are within 10 feet of the Bard, " +
                        "will regenerate 1 Body every minute so long as they are conscious or semi-conscious. This song has no effect on " +
                        "those in their Bleed or Death Counts. To activate this song, the bard must state “Innate Song of Heroism!” and if " +
                        "possible, shouts it often to inform those around them that the song is still active. If the Bard’s concentration is " +
                        "broken, the bard must then shout “Heroism Over!” The Song of Heroism will not stack with other bard songs." +
                        "This skill is usable once per day per purchase."
            }
            else if (characterClass == "Paladin") {
                level3InfoTitle.text = "Defender"
                level3Info.text = "\t\tThis ability permanently augments a melee or non-simple ranged weapon to be empowered by the will of " +
                        "their God. If a ranged weapon is selected, its powers will affect the missiles fired from it. This weapon is " +
                        "now their Defender. Each purchase of this ability strengthens the bond between the weapon and its user " +
                        "and grants +3 Body permanently. Every time this ability is purchased the Paladin may change weapons if " +
                        "desired. Any enchantments on the previous weapon not gained via Paladin class abilities will be lost if the " +
                        "weapon is switched. This new weapon will then be considered the Defender Blade. This class ability does " +
                        "not grant the weapon skill needed to use the weapon."

                level6InfoTitle.text = "Holy Ring"
                level6Info.text = "\t\tThis ring grants the Paladin a magic aura for any weapon they swing with the hand the ring is on. It will " +
                        "also allow the Paladin to touch cast or Spellstrike a Light Shard once per day. The call for this is " +
                        "“Activate Magic 10 Light” if it is touch cast or “Activate Spellstrike 10 Light” if it is Spellstruck. These " +
                        "powers only work via the hand wearing the ring. They will work for two-handed weapons and missile " +
                        "weapons. Each additional purchase of this ability allows the Paladin to create a new ring with the same " +
                        "properties."

                level9InfoTitle.text = "Holy Symbol"
                level9Info.text = "\t\tThis Holy Symbol must be the symbol of the Paladin’s God. If the Paladin has purchased the Light" +
                        "sphere, it must be their spell focus. It cannot be the same item as their Defender. The Holy Symbol must " +
                        "be held or displayed to use either of its abilities.\n\n" +
                        "\t\tThis Symbol will grant the Paladin the ability to Power Word Directed Arcane Rebuke Undead and " +
                        "Demons. To use this power the Paladin must state in a loud voice “In the name of <God> I rebuke you, " +
                        "Undead/Demon! Innate Power Word Directed Arcane Rebuke Undead/Demon”. The target is physically " +
                        "pushed away from the Paladin until it is at least 10 feet away. The target may not get closer than 10 feet " +
                        "away from the Paladin while the Paladin maintains concentration and holds their Holy Symbol towards " +
                        "the target at eye level with both hands. If the target cannot retreat any further and the Paladin approaches " +
                        "the creature within the ten feet, the effect will fail. This ability can be used at will but it takes 1 minute of " +
                        "prayer to recharge for further use. This will not function against vampires and some unique or powerful " +
                        "Undead and demons. If the target calls “No Effect”, the ability cannot be used until the next reset.\n\n" +
                        "\t\tThe Holy Symbol also grants the Paladin the ability to call forth a massive pillar of elemental destruction " +
                        "via packet attack. Upon purchase of the skill, the Paladin must select the elemental type. This selection is " +
                        "permanent. The call for this is “Activate Holy Pillar - 20 Massive Elemental <type>”. This may be used " +
                        "indoors, but since it is a massive pillar of destruction, it may cause structural damage. Holy Pillar is " +
                        "usable once per day per purchase. Subsequent purchases may select different elemental types."

                level12InfoTitle.text = "Headpiece"
                level12Info.text = "\t\tTo activate this ability, the Paladin must state “Activate Headpiece”. This ability augments the other class " +
                        "abilities as follows for 10 minutes:\n\n" +
                        "1. The Defender may swing for Elemental damage of a type of the Paladin's choosing. The Defender also " +
                        "grants the Paladin one Parry, but if this is used the Elemental damage ends as well.\n" +
                        "2. The Holy Rings grant +5 damage (total, not per ring) to any weapon held in a hand wearing one.\n" +
                        "3. The Holy Symbol’s Arcane Rebuke now becomes a Destroy effect for Lesser Undead and Demons. It " +
                        "stays the same for Greater Undead and Demons. To use this power, the Paladin must state in a loud voice " +
                        "“In the name of <God> I destroy you, Undead/Demon! Innate Power Word Directed Arcane Destroy " +
                        "Undead/Demon”.\n\n" +
                        "\t\tThe Headpiece must be worn for the 10 minutes this ability is active. This ability is usable once per day " +
                        "per purchase and does not stack."
            }
            else if (characterClass == "Dread Knight") {
                level3InfoTitle.text = "Harbringer's Blade"
                level3Info.text = "\t\tThis ability permanently augments a melee or non-simple ranged weapon to be empowered by the will of " +
                        "their God. If a ranged weapon is selected, its powers will affect the missiles fired from it. This weapon is " +
                        "now their Harbinger’s Blade. Each purchase of this ability strengthens the bond between the weapon and " +
                        "its user and grants +3 Body permanently. Every time this ability is purchased the Dread Knight may " +
                        "change weapons if desired. Any enchantments on the previous weapon not gained via Dread Knight class " +
                        "abilities will be lost if the weapon is switched. This new weapon will then be considered the Harbinger’s " +
                        "Blade. This class ability does not grant the weapon skill needed to use the weapon."

                level6InfoTitle.text = "Unholy Ring"
                level6Info.text = "\t\tThis ring grants the Dread Knight a magic aura for any weapon they swing with the hand the ring is on. It " +
                        "will also allow the Dread Knight to touch cast or Spellstrike a Dark Shard once per day. The call for this " +
                        "is “Activate Magic 10 Dark” if it is touch cast or “Activate Spellstrike 10 Dark” if it is Spellstruck. These " +
                        "powers only work via the hand wearing the ring. They will work for two-handed weapons and missile " +
                        "weapons. Each additional purchase of this ability allows the Dread Knight to create a new ring with the " +
                        "same properties."

                level9InfoTitle.text = "Unholy Symbol"
                level9Info.text = "\t\tThis Unholy Symbol must be the symbol of the Dread Knight’s God. If the Dread Knight has purchased " +
                        "the Dark sphere, it must be their spell focus. It cannot be the same item as their Harbinger’s Blade. The " +
                        "Unholy Symbol must be held or displayed to use either of its abilities.\n\n" +
                        "\t\tThis Symbol will grant the Dread Knight +2 Strength for one hour if they perform a Killing Blow on a " +
                        "creature capable of resurrection, at will. The creature must either final or resurrect for this effect to occur. " +
                        "The call for this is “Innate Spirit Drain” following the Killing Blow. The Strength bonus cannot be " +
                        "stacked with itself by killing multiple creatures but if it is lost it can be replaced at will. The Unholy " +
                        "Symbol only needs to be visible/held when performing the Killing Blow. It can be hidden on the Dread " +
                        "Knight’s person without them losing the Strength bonus.\n\n" +
                        "\t\tThe Unholy Symbol also grants the Dread Knight a packet delivered attack. The call for this ability is " +
                        "“Activate Magic Maelstrom”. Maelstrom constricts the target in black tentacles, rendering them unable to " +
                        "speak or move. After 10 seconds the target is hit with a Death effect. If anyone else touches the target " +
                        "during the 10 seconds, they will be hit with the same effect. If they call a defence they will be immune to " +
                        "that particular Maelstrom. If the target receives any numeric healing during the 10 seconds, this will " +
                        "remove the Maelstrom effect from them. Each purchase of this ability grants the Dread Knight another " +
                        "use of Maelstrom."

                level12InfoTitle.text = "Headpiece"
                level12Info.text = "\t\tTo activate this ability, the Dread Knight must state “Activate Headpiece”. This ability augments the " +
                        "other class abilities as follows for 10 minutes:\n\n" +
                        "1. The Harbinger’s Blade may swing for Elemental damage of a type of the Dread Knight’s choosing. The " +
                        "Harbinger’s Blade also grants the Dread Knight one Parry, but if this is used the Elemental damage ends " +
                        "as well.\n" +
                        "2. The Unholy Rings grant +5 damage (total, not per ring) to any weapon held in a hand wearing one.\n" +
                        "3. The Unholy Symbol’s Spirit Drain can now stack, granting the Dread Knight +1 Strength for each " +
                        "creature killed after the first to a maximum of +6.\n\n" +
                        "\t\tThe Headpiece must be worn for the 10 minutes this ability is active. This ability is usable once per day " +
                        "per purchase and does not stack."
            }
            else if (characterClass == "Lightweaver") {
                level3InfoTitle.text = "Holy Altar"
                level3Info.text = "\t\tThis ability creates a Holy Altar devoted to the creator’s God. These Altars require physical " +
                        "representations in game and should be decorated to match the God to which they’re devoted. To create a " +
                        "Holy Altar, the Lightweaver performs a 10 minute rite devoted to their God and then states “Innate Create " +
                        "Holy Altar”. This will empower the Altar with their God’s power for 5 days. At the end of the 5 days the " +
                        "Altar will remain, but it will no longer be empowered and the rite must be performed again. If a Holy " +
                        "Altar is moved more than 20 feet from its original location, it will lose its empowerment. Only one Holy " +
                        "Altar can be active at any time. Once empowered, Holy Shrines have 100 Body and a 10 Normal " +
                        "threshold. They do not have spirits. A tag describing these stats should be placed on the Holy Altar once " +
                        "empowered. When not empowered, the Altar is as destructible as what it is made from in game.\n\n" +
                        "\t\tHoly Altars provide a number of powers. The first allows its creator to transfer active Blesses from their " +
                        "own spirit to other people or even items. This is done by stating “Innate Transfer” and touching the target. " +
                        "Doing this will remove the Bless from the Lightweaver and give it to the target. This transfer is only " +
                        "possible within 20 feet of the Holy Altar. The Bless will keep its original duration. This ability can be " +
                        "used at will.\n\n" +
                        "\t\tAdditionally, Holy Altars create 3 vials of holy water each day per purchase. These vials appear on the " +
                        "top of the Holy Altar and will remain there until reset if undisturbed. Once removed from the Altar, they " +
                        "will last for 1 hour before transforming into normal water. The vials may be used for any one of these " +
                        "three effects:\n\n" +
                        "1. The vial may function as a light source once removed from the Holy Altar. The light source " +
                        "should be repped by a green, yellow or red glow stick or LED light.\n" +
                        "2. The vial may be thrown at either an Undead or demon to inflict 10 Alchemical Acid. This is a " +
                        "packet delivered attack. Do not throw an actual vial. Doing this will use up the vial and it will " +
                        "revert into water immediately.\n" +
                        "3. The vial may be consumed to grant the consumer a Bless of the Lightweaver’s God which will " +
                        "last for 5 days. Doing this will use up the vial."

                level6InfoTitle.text = "Sacred Bond"
                level6Info.text = "\t\tSacred Bond will link the Lightweaver to their Holy Altar from a distance. This link allows the " +
                        "Lightweaver to access some of their God’s holy power as they do their work away from their Altar. Each " +
                        "of the two abilities may be used once per day per purchase; you do not need to choose between them.\n\n" +
                        "1. The Lightweaver may grant 15 mending to any target. This healing type is special; it will heal any " +
                        "target for its natural healing type. Thus, it can be used to heal Undead, Gargylen or anything that " +
                        "can receive Healing. It cannot be used offensively. The call for this is “Innate Arcane 15 Mend”. " +
                        "It may be touch cast or packet delivered. This may be used once per purchase of Sacred Bond.\n" +
                        "2. The Lightweaver may activate magical items with “per day” or “ever” charges left on the Altar as" +
                        "if they were in possession of it. A Sacred Bond must be created between the item and the Altar. " +
                        "The Lightweaver must perform a 10 minute RP Rite. At the end of the Rite, the item will be " +
                        "absorbed into the Altar, making it vanish inside. This will allow the Lightweaver to use it from " +
                        "afar. It will last until the next skill reset. Tags for the magic item must still be carried and " +
                        "produced if requested. This Sacred Bond will only function for “ever” or “per day” powers, even " +
                        "if the item has multiple types of powers, such as a sword with both a magic aura and a once per " +
                        "day Life spell; the Life spell can be used, but the magic aura cannot. Inapplicable item powers " +
                        "will be ignored. If the Altar is destroyed or the next reset occurs, the item will reappear. This " +
                        "power works within 1 km of the Altar, although your God may extend the range in special " +
                        "circumstances. It will not pause a Spirit Link. Sacred Bond cannot be used with items which have " +
                        "Dark or Draconic magic. Only one Sacred Bond may be active per purchase and the Bond will " +
                        "only allow the Lightweaver to use the item."

                level9InfoTitle.text = "Sacred Vessel"
                level9Info.text = "\t\tThis ability allows the Lightweaver to perform a 1 minute Rite to create a Sacred Vessel for their Holy " +
                        "Altar. The Sacred Vessel may be anything, but it should be appropriate to the Lightweaver’s God - a " +
                        "medical kit for Cassandra, an hourglass for Vesmir, etc. These Vessels can store Battle Magic spells while " +
                        "they remain on the Altar. Anyone may cast spells into the Vessel to store them. Spells may be from any " +
                        "core rulebook sphere or the Light sphere. Spells cast by the Lightweaver will not be lost from the " +
                        "Lightweaver’s memory, but spells cast by others will. After absorbing a spell, the Vessel requires 1 hour " +
                        "of time to attune to the magic, at which point it will become accessible. The Sacred Vessel itself may " +
                        "only be used by the Lightweaver. Stored spells are used by stating “Activate Vessel: <Spell Name>”. " +
                        "Spells cast from the Vessel are considered cast by the Vessel’s owner and otherwise function normally. " +
                        "Sacred Vessels may not be combined with Sacred Bonds.\n\n" +
                        "\t\tEach Sacred Vessel can store a single spell. This spell may be cast an infinite number of times by the " +
                        "Lightweaver within 20 feet of the Altar. After the first use of the spell, each subsequent use must consume " +
                        "a blessed catalyst. To bless a catalyst, the Lightweaver must transfer their Bless into the catalyst itself.\n\n" +
                        "\t\tSacred Vessels are as destructible as the item naturally is. Magic items may be used as Vessels. A Sacred " +
                        "Vessel will last for 5 days. The Vessel must remain within 20 feet of the Altar or it will permanently lose " +
                        "its power and be destroyed, even if the item was magical prior to becoming a Vessel. If a Vessel merely " +
                        "expires or has all its stored spell(s) used, it will not be destroyed. Spell(s) cast into Sacred Vessels should " +
                        "have their spell tags affixed to the phys-rep of the Vessel. These tags should be removed or crossed off " +
                        "when the spells are cast. If the spell is cast by the Lightweaver, and therefore not lost from their memory, " +
                        "they should write the spell on the Vessel tag and affix that instead.\n\n" +
                        "\t\tOne Sacred Vessel may exist per purchase of this ability. If a Sacred Vessel is destroyed, a new Sacred " +
                        "Vessel may be created after the next reset."

                level12InfoTitle.text = "Church"
                level12Info.text = "\t\tAt the 12th level, the Lightweaver may construct a truly Holy Church devoted to their God, pray for 10 " +
                        "minutes and then state “Innate Create Church” to activate it. The Church is a 20 foot square centered " +
                        "around the Holy Altar. It must be properly phys-repped with great care and excellent props. The Church " +
                        "will grant the following powers:\n\n" +
                        "\t\tThe Holy Altar is now indestructible but its duration remains the same. The Church may be destroyed by " +
                        "physically removing or destroying the majority of the holy items, trappings, and vestments that make up " +
                        "the church. This will include things like flipping tables, tearing down banners, breaking candles and pews, " +
                        "etc. Note that these items should only be destroyed in game; you can never destroy anyone’s property out " +
                        "of game without their permission. The phys-reps should be removed or moved in such a way that it is " +
                        "clear that the Church has been ransacked. If the Church is destroyed, the Holy Altar will once again " +
                        "become destructible. If the Church is destroyed, it may be recreated at the next reset following the same " +
                        "method.\n\n" +
                        "\t\tThe Lightweaver may decide whether the area inside Church is considered to be in day time (6 AM to 6 " +
                        "PM) or night time (6 PM to 6 AM) at all times by performing a 10 minute Rite involving lighting or " +
                        "extinguishing candles. This may be done at will. The time of day will only apply to Undead and the\n" +
                        "Lightweaver themselves. To everyone else, it will be considered day or night based on whether it is really\n" +
                        "day or night.\n\n" +
                        "\t\tRituals cast within the Church receive an additional ‘Bless’ stone to the ritual bag. This Bless Stone " +
                        "should be uniquely coloured to distinguish it from all other stones. If the Bless Stone is pulled, it is put " +
                        "aside and another stone is pulled. If pulled, the Bless Stone will grant a bonus effect based on the God " +
                        "served and the ritual cast, as determined by a Shaper or Ritual Marshal, regardless of whether the ritual " +
                        "succeeds or fails. A backlash roll might be turned into a flaw instead, a daily use might become two uses " +
                        "per day, the duration of the ritual may be extended, all who are involved in the ritual may receive a Shield " +
                        "Magic, and so on.\n\n" +
                        "\t\tIf a person within the Church has a Light Bless of any God and they are struck by a Dark or Draconic " +
                        "spell, the Bless will act as a Shield Magic and be expended. If the Lightweaver is struck by a Dark or " +
                        "Draconic spell and they have a Bless, it will function like a Reflect Magic and be expended.\n\n" +
                        "\t\tSacred Vessels from other Lightweavers may be created on the Holy Altar, even if the God the other " +
                        "Lightweaver follows is different. Sacred Vessels created in this manner will only function for the owner " +
                        "of the Church. The Sacred Vessel will still be considered to belong to its creator, but only the Church’s " +
                        "Lightweaver will be able to access the stored spells.\n\n" +
                        "\t\tDepending on the quality of the Church’s props and the roleplay of the Lightweaver and their followers, " +
                        "Shapers may grant additional powers in special circumstances. Any powers granted will be tailored to the " +
                        "God and situation in question. These powers will only function within the Church. These ‘miracles’ will " +
                        "vary in power and effect and should be gauged by the size and power of the Church, as well as the " +
                        "average power level of the Guild the Church exists in. Examples of miracles include a small healing aura " +
                        "in a Church of Cassandra or a field which makes elves immune to Sense calls in a Church of Ll'yandra."
            }
            else if (characterClass == "Darkweaver") {
                level3InfoTitle.text = "Unholy Altar"
                level3Info.text = "\t\tThis ability creates an Unholy Altar devoted to the creator’s God. These Altars require physical " +
                        "representations in game and should be decorated to match the God to which they’re devoted. To create an " +
                        "Unholy Altar, the Darkweaver performs a 10 minute rite devoted to their God and then states “Innate " +
                        "Create Unholy Altar”. This will empower the Altar with their God’s power for 5 days. At the end of the 5 " +
                        "days the Altar will remain, but it will no longer be empowered and the rite must be performed again. If an " +
                        "Unholy Altar is moved more than 20 feet from its original location, it will lose its empowerment. Only " +
                        "one Unholy Altar can be active at any time. Once empowered, Unholy Shrines have 100 Body and a 10 " +
                        "Normal threshold. They do not have spirits. A tag describing these stats should be placed on the Unholy " +
                        "Altar once empowered. When not empowered, the Altar is as destructible as what it is made from in " +
                        "game. \n\n" +
                        "\t\tUnholy Altars provide a number of powers. The first allows its creator to transfer active Blesses from " +
                        "their own spirit to other people or even items. This is done by stating “Innate Transfer” and touching the " +
                        "target. Doing this will remove the Bless from the Darkweaver and give it to the target. This transfer is " +
                        "only possible within 20 feet of the Unholy Altar. The Bless will keep its original duration. This ability can " +
                        "be used at will.\n\n" +
                        "\t\tAdditionally, Unholy Altars create 3 vials of unholy blood each day per purchase. These vials appear on " +
                        "the top of the Unholy Altar and will remain there until reset if undisturbed. Once removed from the Altar, " +
                        "they will last for 1 hour before transforming into normal water. The vials may be used for any one of " +
                        "these three effects:\n\n" +
                        "1. The vial may function as a light source once removed from the Unholy Altar. The light source" +
                        "should be repped by a green, yellow or red glow stick or LED light.\n" +
                        "2. The vial may be thrown at a target to cause 10 seconds of Alchemical Blindness. This is a packet " +
                        "delivered attack. Do not throw an actual vial. Doing this will use up the vial and it will revert into " +
                        "water immediately.\n" +
                        "3. The vial may be consumed to grant the consumer a Bless of the Darkweaver’s God which will " +
                        "last for 5 days. Doing this will use up the vial."

                level6InfoTitle.text = "Sacred Bond"
                level6Info.text = "\t\tSacred Bond will link the Darkweaver to their Unholy Altar from a distance. This link allows the " +
                        "Darkweaver to access some of their God’s unholy power as they do their work away from their Altar." +
                        "Each of the two abilities may be used once per day per purchase; you do not need to choose between " +
                        "them.\n\n" +
                        "1. The Darkweaver may grant 15 mending to any target. This healing type is special; it will heal any " +
                        "target for its natural healing type. Thus, it can be used to heal Undead, Gargylen or anything that " +
                        "can receive Healing. It cannot be used offensively. The call for this is “Innate Arcane 15 Mend”. " +
                        "It may be touch cast or packet delivered. This may be used once per purchase of Sacred Bond.\n" +
                        "2. The Darkweaver may activate magical items with “per day” or “ever” charges left on the Altar as " +
                        "if they were in possession of it. A Sacred Bond must be created between the item and the Altar. " +
                        "The Darkweaver must perform a 10 minute RP Rite. At the end of the Rite, the item will be " +
                        "absorbed into the Altar, making it vanish inside. This will allow the Darkweaver to use it from " +
                        "afar. It will last until the next skill reset. Tags for the magic item must still be carried and " +
                        "produced if requested. This Sacred Bond will only function for “ever” or “per day” powers, even " +
                        "if the item has multiple types of powers, such as a sword with both a magic aura and a once per " +
                        "day Life spell; the Life spell can be used, but the magic aura cannot. Inapplicable item powers " +
                        "will be ignored. If the Altar is destroyed or the next reset occurs, the item will reappear. This " +
                        "power works within 1 km of the Altar, although your God may extend the range in special " +
                        "circumstances. It will not pause a Spirit Link. Sacred Bond cannot be used with items which have" +
                        "Light or Draconic magic. Only one Sacred Bond may be active per purchase and the Bond will " +
                        "only allow the Darkweaver to use the item."

                level9InfoTitle.text = "Sacred Vessel"
                level9Info.text = "\t\tThis ability allows the Darkweaver to perform a 1 minute Rite to create a Sacred Vessel for their Unholy " +
                        "Altar. The Sacred Vessel may be anything, but it should be appropriate to the Darkweaver’s God - a skull " +
                        "for Malagant, a spear for Pandora, etc. These Vessels can store Battle Magic spells while they remain on " +
                        "the Altar. Anyone may cast spells into the Vessel to store them. Spells may be from any core rulebook " +
                        "sphere or the Dark sphere. Spells cast by the Darkweaver will not be lost from the Darkweaver’s memory, " +
                        "but spells cast by others will. After absorbing a spell, the Vessel requires 1 hour of time to attune to the " +
                        "magic, at which point it will become accessible. The Sacred Vessel itself may only be used by the " +
                        "Darkweaver. Stored spells are used by stating “Activate Vessel: <Spell Name>”. Spells cast from the " +
                        "Vessel are considered cast by the Vessel’s owner and otherwise function normally. Sacred Vessels may " +
                        "not be combined with Sacred Bonds.\n\n" +
                        "\t\tEach Sacred Vessel can store a single spell. This spell may cast an infinite number of times by the " +
                        "Darkweaver within 20 feet of the Altar. After the first use of the spell, each subsequent use must consume " +
                        "a blessed catalyst. To bless a catalyst, the Darkweaver must transfer their Bless into the catalyst itself.\n\n" +
                        "\t\tSacred Vessels are as destructible as the item naturally is. Magic items may be used as Vessels. A Sacred " +
                        "Vessel will last for 5 days. The Vessel must remain within 20 feet of the Altar or it will permanently lose " +
                        "its power and be destroyed, even if the item was magical prior to becoming a Vessel. If a Vessel merely " +
                        "expires or has all its stored spell(s) used, it will not be destroyed. Spell(s) cast into Sacred Vessels should " +
                        "have their spell tags affixed to the phys-rep of the Vessel. These tags should be removed or crossed off " +
                        "when the spells are cast. If the spell is cast by the Darkweaver, and therefore not lost from their memory, " +
                        "they should write the spell on the Vessel tag and affix that instead.\n\n" +
                        "\t\tOne Sacred Vessel may exist per purchase of this ability. If a Sacred Vessel is destroyed, a new Sacred " +
                        "Vessel may be created after the next reset."

                level12InfoTitle.text = "Church"
                level12Info.text = "\t\tAt the 12th level, the Darkweaver may construct a truly Unholy Church devoted to their God, pray for 10 " +
                        "minutes and then state “Innate Create Church” to activate it. The Church is a 20 foot square centered " +
                        "around the Unholy Altar. It must be properly phys-repped with great care and excellent props. The " +
                        "Church will grant the following powers:\n\n" +
                        "\t\tThe Unholy Altar is now indestructible but its duration remains the same. The Church may be destroyed " +
                        "by physically removing or destroying the majority of the unholy items, trappings, and vestments that " +
                        "make up the church. This will include things like flipping tables, tearing down banners, breaking candles " +
                        "and pews, etc. Note that these items should only be destroyed in game; you can never destroy anyone’s " +
                        "property out of game without their permission. The phys-reps should be removed or moved in such a way " +
                        "that it is clear that the Church has been ransacked. If the Church is destroyed, the Unholy Altar will once " +
                        "again become destructible. If the Church is destroyed, it may be recreated at the next reset following the " +
                        "same method.\n\n" +
                        "\t\tThe Darkweaver may decide whether the area inside Church is considered to be in day time (6 AM to 6 " +
                        "PM) or night time (6 PM to 6 AM) at all times by performing a 10 minute Rite involving lighting or " +
                        "extinguishing candles. This may be done at will. The time of day will only apply to Undead and the\n" +
                        "Darkweaver themselves. To everyone else, it will be considered day or night based on whether it is really\n" +
                        "day or night.\n\n" +
                        "\t\tRituals cast within the Church receive an additional ‘Bless’ stone to the ritual bag. This Bless Stone " +
                        "should be uniquely coloured to distinguish it from all other stones. If the Bless Stone is pulled, it is put " +
                        "aside and another stone is pulled. If pulled, the Bless Stone will grant a bonus effect based on the God " +
                        "served and the ritual cast, as determined by a Shaper or Ritual Marshal, regardless of whether the ritual " +
                        "succeeds or fails. A backlash roll might be turned into a flaw instead, a daily use might become two uses " +
                        "per day, the duration of the ritual may be extended, all who are involved in the ritual may receive a Shield " +
                        "Magic, and so on.\n\n" +
                        "\t\tIf a person within the Church has a Dark Bless of any God and they are struck by a Light or Draconic " +
                        "spell, the Bless will act as a Shield Magic and be expended. If the Darkweaver is struck by a Light or " +
                        "Draconic spell and they have a Bless, it will function like a Reflect Magic and be expended." +
                        "Sacred Vessels from other Darkweavers may be created on the Unholy Altar, even if the God the other " +
                        "Darkweaver follows is different. Sacred Vessels created in this manner will only function for the owner of " +
                        "the Church. The Sacred Vessel will still be considered to belong to its creator, but only the Church’s " +
                        "Darkweaver will be able to access the stored spells.\n\n" +
                        "\t\tDepending on the quality of the Church’s props and the roleplay of the Darkweaver and their followers, " +
                        "Shapers may grant additional powers in special circumstances. Any powers granted will be tailored to the " +
                        "God and situation in question. These powers will only function within the Church. These ‘miracles’ will " +
                        "vary in power and effect and should be gauged by the size and power of the Church, as well as the " +
                        "average power level of the Guild the Church exists in. Examples of miracles include a temporary boost to " +
                        "the defensive abilities of a Church of Malagant besieged by the Citadel of Light, or a boost to damage " +
                        "done to Einher within a Church of Pandora."
            }
            else if (characterClass == "Dragon Knight") {
                level3InfoTitle.text = "Draconic Shrine"
                level3Info.text = "\t\tThis ability creates a Draconic Shrine devoted to the creator’s Dragon. These Shrines require physical " +
                        "representations in game and should be decorated to match the Dragon to which they’re devoted. To create " +
                        "a Draconic Shrine, the Dragon Knight performs a 10 minute rite devoted to their Dragon and then states " +
                        "“Innate Create Draconic Shrine”. This will empower the Shrine with their Dragon’s power for 5 days. At " +
                        "the end of the 5 days the Shrine will remain, but it will no longer be empowered and the rite must be " +
                        "performed again. If a Draconic Shrine is moved more than 20 feet from its original location, it will lose its " +
                        "empowerment. Only one Draconic Shrine can be active at any time. Once empowered, Draconic Shrines " +
                        "have 100 Body and a 10 Normal threshold. They do not have spirits. A tag describing these stats should " +
                        "be placed on the Draconic Shrine once empowered. When not empowered, the Shrine is as destructible as " +
                        "what it is made from in game. \n\n" +
                        "\t\tDraconic Shrines provide a number of powers. The first allows its creator to transfer active Dragon Marks " +
                        "from their own spirit to other people or even items. This is done by stating “Innate Transfer” and touching " +
                        "the target. Doing this will remove the Dragon Mark from the Dragon Knight and give it to the target. This" +
                        "transfer is only possible within 20 feet of the Draconic Shrine. The Dragon Mark will keep its original " +
                        "duration. This ability can be used at will.\n\n" +
                        "\t\tAdditionally, Draconic Shrines create 3 vials of ink the colour of the Dragon Knight's Dragon each day " +
                        "per purchase. These vials appear on the top of the Draconic Shrine and will remain there until reset if " +
                        "undisturbed. Once removed from the Shrine, they will last for 1 hour before transforming into normal " +
                        "water. The vials may be used for any one of these three effects: \n\n" +
                        "1. The vial may function as a light source once removed from the Draconic Shrine. The light source " +
                        "should be repped by a green, yellow or red glow stick or LED light.\n" +
                        "2. The ink may be applied to the target's skin to grant a +2 threshold of whatever type of threshold " +
                        "the target already has for 1 hour. If the target does not have a threshold, they receive a 2 Normal " +
                        "threshold. If, for example, they have a 3 Magic threshold already, they receive a 5 Magic " +
                        "threshold. This effect cannot be stacked with itself. Doing this will use up the vial.\n" +
                        "3. The vial may be consumed to grant the consumer a Dragon Mark of the Dragon Knight’s Dragon " +
                        "which will last for 5 days. Doing this will use up the vial."

                level6InfoTitle.text = "Draconic Covenant"
                level6Info.text = "\t\tDraconic Covenant will link the Dragon Knight to their Draconic Shrine from a distance. This link allows " +
                        "the Dragon Knight to access some of their patron Dragon’s power as they do their work away from their " +
                        "Shrine. Each of the two abilities may be used once per day per purchase; you do not need to choose " +
                        "between them.\n\n" +
                        "1. A Dragon Knight can corrupt and use Divine magic items that are brought to their Shrine. This " +
                        "ability will only function on items which have magic from the Light or Dark spheres within them. " +
                        "Once the item is placed upon the shrine, the Dragon Knight may initiate a 10 minute Rite by " +
                        "stating “Innate Divine Corruption!” When completed, the item will be immediately destroyed and " +
                        "its abilities - now corrupted - will be absorbed by the Dragon Knight, even Light and Dark " +
                        "effects. The Dragon Knight may innately use the item’s powers with the prefix “Innate " +
                        "Corruption <normal item activation phrase>”. The Dragon Knight will be considered to have any " +
                        "and all prerequisites fulfilled when using an item in this manner. Corrupting an item will change " +
                        "the duration of its powers. All times-per-day charges become times-ever. All continuous powers " +
                        "become 1 hour. Light and Dark powers will not be converted into the Draconic equivalent; if an " +
                        "item granted the user the ability to cast Light Bolts, that will be the ability gained. The absorbed " +
                        "powers themselves will last 5 days before fading away.\n" +
                        "2. A banner with the symbol or colour of the Dragon Knight’s patron Dragon may be activated for " +
                        "one hour and carried away from the shrine. Anyone with a Dragon Mark of the same Dragon as " +
                        "the Draconic Covenant’s creator will receive a magic aura on their weapon swings so long as they " +
                        "are within line of sight of the banner, up to a range of 100 feet. The banner may be carried by the " +
                        "Dragon Knight or anyone with their patron’s Dragon Mark. If the banner is carried by someone " +
                        "without the proper Dragon Mark, the banner’s powers will immediately end and the daily use will " +
                        "be expended. The banner may be exchanged between people at will."

                level9InfoTitle.text = "Draconic Trove"
                level9Info.text = "\t\tThis ability allows the Dragon Knight to perform a 1 minute Rite to create a Draconic Trove for their " +
                        "Draconic Shrine. The Draconic Trove may be anything, but it should be appropriate to the Dragon " +
                        "Knight’s Dragon - a seashell for Physignathus, a skull for Styphon, etc. These Troves can store Battle " +
                        "Magic spells while they remain on the Altar. Anyone may cast spells into the Trove to store them. Spells " +
                        "may be from any core rulebook sphere or the Draconic sphere. Spells cast by the Dragon Knight will not " +
                        "be lost from the Dragon Knight’s memory, but spells cast by others will. After absorbing a spell, the " +
                        "Trove requires 1 hour of time to attune to the magic, at which point it will become accessible. Stored " +
                        "spells are used by stating “Activate Trove: <Spell Name>”. Spells cast from the Trove are considered cast " +
                        "by the new caster and otherwise function normally. Draconic Troves may not be combined with Draconic " +
                        "Covenants.\n\n" +
                        "\t\tEach Draconic Trove can store three spells at once. These spells must be cast into the Trove within 1 " +
                        "minute of each other. Once stored, anyone with a Dragon Mark of the Trove's creator's Dragon, or any " +
                        "Dragon Knight, may access the stored spells. Anyone capable of accessing the spells may touch the Trove " +
                        "and know what spells are stored within it. Once a stored spell is cast, it is used up. A Trove may only " +
                        "store a particular spell once per day, unless a catalyst is expended for any subsequent storage of the same " +
                        "spell.\n\n" +
                        "\t\tDraconic Troves are as destructible as the item naturally is. Magic items may be used as Troves. A " +
                        "Draconic Trove will last for 5 days. The Trove must remain within 20 feet of the Altar or it will " +
                        "permanently lose its power and be destroyed, even if the item was magical prior to becoming a Trove. If a " +
                        "Trove merely expires or has all its stored spell(s) used, it will not be destroyed. Spell(s) cast into Draconic " +
                        "Troves should have their spell tags affixed to the phys-rep of the Trove. These tags should be removed or " +
                        "crossed off when the spells are cast. If the spell is cast by the Dragon Knight, and therefore not lost from " +
                        "their memory, they should write the spell on the Trove tag and affix that instead.\n\n" +
                        "\t\tOne Draconic Trove may exist per purchase of this ability. If a Draconic Trove is destroyed, a new " +
                        "Draconic Trove may be created after the next reset."

                level12InfoTitle.text = "Temple"
                level12Info.text = "\t\tAt the 12th level, the Dragon Knight may construct a truly magnificent Temple devoted to their Dragon," +
                        "meditate for 10 minutes and then state “Innate Create Temple” to activate it. The Temple is a 20 foot " +
                        "square centered around the Draconic Shrine. It must be properly phys-repped with great care and " +
                        "excellent props. The Temple will grant the following powers:\n\n" +
                        "\t\tThe Draconic Shrine is now indestructible but its duration remains the same. The Temple may be " +
                        "destroyed by physically removing or destroying the majority of the items, trappings, and vestments that " +
                        "make up the temple. This will include things like flipping tables, tearing down banners, breaking candles " +
                        "and pews, etc. Note that these items should only be destroyed in game; you can never destroy anyone’s " +
                        "property out of game without their permission. The phys-reps should be removed or moved in such a way " +
                        "that it is clear that the Temple has been ransacked. If the Temple is destroyed, the Draconic Shrine will " +
                        "once again become destructible. If the Temple is destroyed, it may be recreated at the next reset following " +
                        "the same method.\n\n" +
                        "\t\tThe Dragon Knight may decide whether the area inside Temple is considered to be in day time (6 AM to " +
                        "6 PM) or night time (6 PM to 6 AM) at all times by performing a 10 minute Rite involving lighting or " +
                        "extinguishing candles. This may be done at will.\n\n" +
                        "\t\tRituals cast within the Temple receive an additional ‘Dragon Mark’ stone to the ritual bag. This Dragon " +
                        "Mark Stone should be uniquely coloured to distinguish it from all other stones. If the Dragon Mark Stone " +
                        "is pulled, it is put aside and another stone is pulled. If pulled, the Dragon Mark Stone will grant a bonus " +
                        "effect based on the Dragon served and the ritual cast, as determined by a Shaper or Ritual Marshal, " +
                        "regardless of whether the ritual succeeds or fails. A backlash roll might be turned into a flaw instead, a " +
                        "daily use might become two uses per day, the duration of the ritual may be extended, all who are involved " +
                        "in the ritual may receive a Shield Magic, and so on.\n\n" +
                        "\t\tIf a person within the Temple has a Dragon Mark of any Dragon and they are struck by a Dark or Light " +
                        "spell, the Dragon Mark will act as a Shield Magic and be expended. If the Dragon Knight is struck by a " +
                        "Dark or Light spell and they have a Dragon Mark, it will function like a Reflect Magic and be expended." +
                        "Draconic Troves from other Dragon Knights may be created on the Draconic Shrine, even if the Dragon " +
                        "the other Dragon Knight follows is different. Draconic Troves created in this manner will only function " +
                        "for the owner of the Temple. The Draconic Trove will still be considered to belong to its creator, but only " +
                        "the Temple’s Dragon Knight will be able to access the stored spells.\n\n" +
                        "\t\tDepending on the quality of the Temple’s props and the roleplay of the Dragon Knight and their " +
                        "followers, Shapers may grant additional powers in special circumstances. Any powers granted will be " +
                        "tailored to the Dragon and situation in question. These powers will only function within the Temple. " +
                        "These ‘marvels’ will vary in power and effect and should be gauged by the size and power of the Temple, " +
                        "as well as the average power level of the Guild the Temple exists in. Examples of marvels include a " +
                        "creating a portal to the plane of Ice in a Temple of Ahriman or a defensive protection in a Temple of " +
                        "Tezoth."
            }
        }
        else if (characterVocation == "Archer") {
            level3InfoTitle.text = "Arrow Dodge"
            level3Info.text = "\t\tOnce per day per purchase the Archer may use a “dodge” defense against a single arrow, bolt, or thrown " +
                    "weapon that hits them, negating the attack as per the dodge skill. It will not function against surprise " +
                    "attacks. The call for this ability is “Innate Arrow Dodge!”"

            level6InfoTitle.text = "Stand and Deliver"
            level6Info.text = "\t\tStand and Deliver allows the Archer to steady them self and fire a more damaging ranged attack. The " +
                    "Archer must plant both feet (crossbow users may also choose to kneel or brace their crossbow on a table " +
                    "or stable object) and state “Innate Stand and Deliver”. The Archer may add +2 to their damage with their " +
                    "ranged attacks for as long as they maintain the position. Moving from that position or taking damage of " +
                    "any kind will cancel this effect and they must wait at least a minute before they can use it again. Using " +
                    "any type of Dodge skill or spell protections will not break this effect. This ability may be purchased " +
                    "multiple times. Each purchase increased the damage modifier by an additional +2. (+2 for one purchase, " +
                    "+4 for two purchases, etc.)."

            level9InfoTitle.text = "Maim"
            level9Info.text = "\t\tAt 9th level, an Archer can fire a projectile that when struck will cripple the target’s defenses temporarily. " +
                    "For 60 seconds after being hit with a Maim attack, the victim will receive double damage from all " +
                    "physical sources and be affected by a “Swampwalk” effect, forcing them to pause for 3 seconds between " +
                    "each step of movement. The archer must call out “Innate <damage> Maim!” and the attack must hit Body " +
                    "to function. If the Maim attack misses, the skill is lost."

            level12InfoTitle.text = "Death Arrow"
            level12Info.text = "\t\tDeath Arrow allows an Archer to concentrate and focus on a shot with the hopes of killing their target in a " +
                    "single strike. After 10 seconds of concentration the Archer will be ready to fire. If this 10 seconds is " +
                    "interrupted the archer must begin the 10 seconds again, but the skill will not be wasted. Only releasing the " +
                    "missile will activate the skill. After the preparation time the Archer may fire with a call of “Innate " +
                    "<damage> Death!”, with the damage amount being their normal damage call. As with all carrier attacks, " +
                    "the damage must strike Body points to take effect. If it does, the target will immediately drop into their " +
                    "Death Count as if struck by a death effect. If the attack misses the skill is used. It is usable once per day " +
                    "per purchase. "
        }
        else if (characterVocation == "Artisan") {
            level3InfoTitle.text = "Treasure Hunter"
            level3Info.text = "\t\tArtisans have a nose for gold. Treasure Hunter allows them to sense gold and silver at will by touching " +
                    "the target and performing a 3 count - “Innate Sense Coin 1, Sense Coin 2, Sense Coin 3.” If the target has" +
                    "gold or silver coins in their possession they must respond with “Here!” in a normal speaking voice. The " +
                    "sense and response calls are considered out of game. Doing this does not let the Artisan know the exact " +
                    "pinpoint location of the gold, only that it is on the person. In game, this is the Artisan hearing the familiar " +
                    "jingle of coins and watching the target’s body language as they move. This has no effect on coins not on a " +
                    "person but will work on corpses and immobile targets. Eg: It cannot be used to detect gold inside chests.\n\n" +
                    "\t\tTreasure Hunter also helps Artisans loot bodies. Once per day per purchase, the Artisan may touch a " +
                    "target that is unconscious, dying or dead, and which they have already used Sense Coin on within the 3 " +
                    "seconds, and ask out of game one of the following questions: “Innate Treasure Hunter - do you have any " +
                    "coins / magic items / catalysts on you?” Doing this will instantaneously loot the target. The target must " +
                    "hand over all the tags on their person, regardless of whether the target has any ranks of Looting."

            level6InfoTitle.text = "Bribe"
            level6Info.text = "\t\tIn times of dire need, an Artisan may slip out of dangerous situations by offering up a charm-infused " +
                    "bribe. If the Artisan offers a target an item worth at least 1 gold piece or 10 RM in base creation value " +
                    "which they have created themselves, they may be able to save their skin. While holding out the item the " +
                    "Artisan must declare “Innate Magic Bribe!” and strike the target with a spell packet. If target defends " +
                    "against the Bribe, for every 3 gold or 50 RM in base creation value of the item, the Artisan may use an " +
                    "“Innate Echo!” effect in a second attempt. If the initial Bribe is resisted but the Echo is successful, the " +
                    "original Bribe attempt will be temporarily forgotten - its memory suppressed by the glamour of the item " +
                    "being offered a second time. If the Bribe succeeds, the target will not be aware that they are being " +
                    "charmed until the effect wears off.\n\n" +
                    "\t\tWhen a Bribe is successful, the Artisan has 3 seconds to place the item on the ground or in the target’s " +
                    "hands, as decided by the target. The target will then take the item. For the next minute, the target cannot" +
                    "take hostile action against the Artisan unless the Artisan initiates any hostile actions toward the target. " +
                    "Actions are determined to be hostile or not by the target of the Bribe. The target will not necessarily trust " +
                    "the Artisan; they will simply avoid initiating hostilities. Bribe has no effect against mindless and Undead " +
                    "creatures and it can be resisted the same way as a magical charm. Items made with conventional " +
                    "production skills may be used for this skill. This skill can be used once per day per purchase. "

            level9InfoTitle.text = "Magnum Opus"
            level9Info.text = "\t\tFor each purchase of Magnum Opus an Artisan may choose to augment either their Production or " +
                    "Tradesman skills. At Logistics, they can craft a single item through their Production skills using any type " +
                    "of RM. Alternatively, the Artisan can focus on their Tradesman skills and increase the value of one item " +
                    "created by 3 gold. No matter which of the abilities is used, a catalyst will be generated. This catalyst must" +
                    "be a physical tool that was used somehow in the item’s creation. Both its type and emotion radiated may " +
                    "be decided by the Artisan. This skill may be used once per event (at Logistics) per purchase."

            level12InfoTitle.text = "Vault"
            level12Info.text = "\t\tWhen an Artisan reaches this level of skill they may call in favours to build the ultimate strong-room free " +
                    "of charge - the Vault, a 10’x10’x10’ square room with a ritual-level magical barrier. The Vault must be " +
                    "phys-repped by a tent or building, or the inside of a tent or building. The Vault has one door and one key, " +
                    "which is spirit linked to the Artisan. The Vault may have windows, but even they will be magically " +
                    "protected. This magical barrier is special and cannot be breached or dispelled by any means, including " +
                    "such powers as Passwall, Counter Magic or ritual Destroy Magic, other than Shaper approved abilities. " +
                    "Only those with a spirit-linked key may enter the Vault. For each additional purchase of Vault an Artisan " +
                    "may increase the Vault’s size by 10’x10’x10’, may add an additional spirit-linked key to one additional " +
                    "person and may add another door if desired. All lock(s) and key(s) will be tagged and have matching " +
                    "numbers assigned to them. If anyone with a spirit-linked key suffers a final death the key will still exist" +
                    "and may still be used to open the Vault but will no longer be spirit-linked. If the Artisan dies a final death, " +
                    "the Vault loses its magic and becomes a normal building.\n\n" +
                    "\t\tThe Artisan may only have one Vault at a time. If desired, the Artisan can deactivate their Vault and " +
                    "create another somewhere else. If a Vault is deactivated, the Artisan may not make another for 5 days -" +
                    "favours take time to cash in. It takes 10 minutes to create a new Vault. When the new Vault is created, the " +
                    "Artisan will receive a number of new keys equal to their purchases of this ability. The old keys will " +
                    "become normal keys which do not unlock anything."
        }
        else if (characterVocation == "Battle Mage") {
            level3InfoTitle.text = "Amulet"
            level3Info.text = "\t\tThis class ability allows the Battle Mage to enchant any item smaller than an apple to store 1 Battle " +
                    "Magic spell, 3rd level or lower. The spell must be cast into the item and remains there for 5 days. " +
                    "Although the spell must be cast, it is immediately returned to the Battle Mage’s memory and is not " +
                    "expended from the spell slot. One Amulet may be created per purchase of this ability. Once created, the " +
                    "Amulet may be used by anyone by stating “Activate: <Spell Name>”. Although the Amulet detects as " +
                    "magic and is affected by dispel magic, it can be destroyed by normal means. Only one Amulet can be " +
                    "active per purchase of this ability, when the spell within a Amulet is cast, that Amulet’s state returns to " +
                    "that of the normal object originally used. This skill may be used once per day per purchase."

            level6InfoTitle.text = "Maximize"
            level6Info.text = "\t\tIn order to use this class ability, the Battle Mage must state “Innate Maximize:” before a spell incant for a " +
                    "spell that involves damaging or healing with numerical amounts and a duration of instant. If the spell is " +
                    "successfully cast, those healing or damaging numbers are doubled. The Battle Mage must state the total " +
                    "number at the end of the incant. This is extremely taxing to the Battle Mage and after the spell is cast they " +
                    "are stunned for 10 seconds and cannot use any skills whatsoever. While stunned, the Battle Mage is " +
                    "unable to take any action, including blocking, moving and the use of skills, minus the ability to call " +
                    "“interrupt” against killing blows. They may also interrupt any counts against them. Automatic defenses " +
                    "such as Shield Magic will still operate, but ones requiring conscious thought such as Advanced Shield " +
                    "Magic will not.\n\n" +
                    "\t\tMaximize may be used once per day per purchase and if the spell is miscanted the maximize ability will " +
                    "be wasted."

            level9InfoTitle.text = "Twin Spell"
            level9Info.text = "\t\tWhen casting a Battle Magic spell and using Twin Spell, the Battle Mage is able to throw two packets " +
                    "simultaneously, either two packets in one hand or a packet in each hand. Both packets are considered the " +
                    "same spell and either packet will do what the spell would normally do. No more than 1 second can pass " +
                    "between throwing both packets. For defensive purposes they are considered two separate spells. In order " +
                    "to activate this class ability, the Battle Mage must state “Innate Twin Spell:” before the incant. Although " +
                    "considered two spells, only one spell is removed from the mage’s memory and spell slot. If the spell is " +
                    "miscanted, the Twin Spell ability will be wasted.\n\n" +
                    "\t\tThe magical energy required to duplicate a spell is taxing on the mind, the Battle Mage will thus be " +
                    "stunned for the next 10 seconds after using this ability. The effects of this stun are identical to those of " +
                    "Maximize. Twin Spell can be used once per day per purchase."

            level12InfoTitle.text = "Wizard Staff"
            level12Info.text = "\t\tStarting at 12th level, the Battle Mage is able to create a powerful staff for their own use. This process " +
                    "takes an hour of concentration and requires a staff to imbue with this power. Any type of staff may be " +
                    "used. During that creation, the Battle Mage must choose to align their staff with any one spell sphere they " +
                    "have purchased. Once created the staff will function as a magic weapon in the hands of its creator and will " +
                    "swing for magic. Also, the sphere they have chosen to align with their staff no longer requires the use of " +
                    "incants to cast. Those incants are replaced with “<Sphere> Magic <Spell>”, eg: “Nature Magic Swarm”. " +
                    "If an Elemental spell contains the word “Elemental” in the name, the word “Elemental” can be omitted " +
                    "from the spell part of the call, eg: “Elemental Magic Strike” rather than “Elemental Magic Elemental " +
                    "Strike”. The staff must be in the hands of the Battle Mage for all abilities to function, it will act like a " +
                    "simple staff in the hands of anyone else. If a Battle Mage wishes to align their Wizard Staff to a different " +
                    "sphere the same staff may be used but the hour of concentration must be completed again. For purposes of " +
                    "destruction, the staff is considered whatever type of staff was used to create it and can be broken like one." +
                    "A Wizard Staff will last 5 days before the magic fades, returning it to its previous state. A Wizard Staff " +
                    "may be created once per day per purchase, but only one may exist at any time."
        }
        else if (characterVocation == "Brew Master") {
            level3InfoTitle.text = "Iron Gut"
            level3Info.text = "\t\tPossessing Iron Gut gives the Brew Master x2 maximum Stamina. Also, while the Brew Master’s " +
                    "Stamina is lower than maximum they gain +5 Body and all hand to hand damage is increased by +2 " +
                    "damage. Iron Gut may only be purchased once."

            level6InfoTitle.text = "Mixologist"
            level6Info.text = "\t\tThe Mixologist Class Ability allows its user to spend 1 minute concocting a special alcoholic drink. There " +
                    "are three different types of drink that can be created through Mixologist:\n\n" +
                    "1) A potent beverage that does 20 points of Stamina damage. \n" +
                    "2) A soothing drink that heals 10 points of Body damage for any creature that can drink it, including " +
                    "Gargylen, but also does 4 Stamina damage.\n" +
                    "3) A Molotov cocktail which explodes on impact when thrown (packet delivered) and does 10 " +
                    "elemental fire damage. “10 Elemental Fire!” is the call when thrown.\n\n" +
                    "\t\tA Brew Master can create 1 drink total per day, per purchase and each drink lasts 1 hour before becoming " +
                    "inert. These drinks cannot be time-extended."

            level9InfoTitle.text = "Firebreathing"
            level9Info.text = "\t\tAt 9th level, a Brew Master can ingest pure alcohol then spit it out and light it on fire. This is a packet " +
                    "delivered attack that does 25 points of Elemental Fire damage. Even though the alcohol is never " +
                    "swallowed it is still potent enough to cause 5 Stamina damage to the Brew Master each time Firebreathing " +
                    "is used. Firebreathing may only be used once per day per purchase and the call is “Innate Firebreathing –" +
                    "25 Elemental Fire!”"

            level12InfoTitle.text = "Drunken Master"
            level12Info.text = "\t\tWhen a Brewmaster with Drunken Master reaches 0 Stamina, instead of becoming a slurring mess of " +
                    "intoxication like everyone else, they may choose to enter the eye of the storm. At 0 Stamina they may " +
                    "activate Drunken Master, stating “Innate Drunken Master”. A Brew Master may also choose to activate " +
                    "this ability by taking 40 Stamina damage in less than one minute, which will reduce them to 0 Stamina " +
                    "regardless of their true total stamina. If they activate this ability, for 10 minutes they gain a 2 Normal " +
                    "threshold, a +1 Strength, +5 damage with hand to hand, 2 Parries with Hand to Hand, an immunity to " +
                    "charm, an immunity to further stamina damage and +25 Body points. When the 10 minutes expires the " +
                    "Brew Master returns to 1 Stamina. As normal, a Drunken Master cannot use other skills while they are at " +
                    "0 Stamina. This ability may be used once per day per purchase."
        }
        else if (characterVocation == "Bounty Hunter") {
            level3InfoTitle.text = "Mercy"
            level3Info.text = "\t\tThis ability allows a Bounty Hunter to add the suffix “Mercy” to the end of a weapon swing call. Eg: “4 " +
                    "Normal Mercy”. A “Mercy” suffix means that the attack will not drop the target below 0 Body regardless " +
                    "of how much numerical damage it does. This ability may be combined with other weapon skills. This " +
                    "ability may be used at will. Note that Mercy will not prevent damage from other sources."

            level6InfoTitle.text = "Bola"
            level6Info.text = "\t\tBolas are a special thrown item designed to trip up a target’s legs and force them to the ground. This " +
                    "ability is delivered via a spell packet, which represents multiple weighted balls attached together with " +
                    "rope. The call is “Innate Bola – Physical Snare”. If successfully struck by the spell packet, the victim’s " +
                    "right foot will be stuck to the ground as per the Snare spell. A target can only be affected by one Bola at a " +
                    "time. The Bounty Hunter must be holding a Bola phys-rep in their off hand at the time of the throw. This " +
                    "ability can be used at will so long as the player has 1 Bola tag for each Bola thrown. A Bola may be cut " +
                    "through with a two-minute count and may also be ripped free from by the victim if a +2 or greater " +
                    "strength is used, both of which will destroy the Bola. Ripping free will cause the victim to take 2 points of " +
                    "damage straight to Body regardless of threshold. It takes three seconds to rip free from the Bola. Bola tags " +
                    "can be reused if the Bola spell packet is recovered in game and has not been destroyed. A Bounty Hunter " +
                    "can recover the Bola if it misses the target, or if they remove the Bola from the victim on a 5 count. Bola " +
                    "tags cost 20 RM of blacksmithing material to create. Bounty Hunters can make a number of Bolas up to" +
                    "their number of purchases of this ability during Logistics. This does not require the Blacksmithing skill. " +
                    "Bolas expire 2 years after creation. " +
                    "Bolas are considered tools, not weapons, and cannot be enchanted, augmented, made of silver, etc. Bola " +
                    "phys-reps should be a string or small rope with a ball at each end and should never actually be thrown. "

            level9InfoTitle.text = "Smoke Bomb"
            level9Info.text = "\t\tThis area-of-effect blindness attack is activated by the Bounty Hunter throwing a spell packet at their feet " +
                    "and declaring “Innate Alchemical Smoke Bomb!” This will blind anyone within a 10-foot radius of the " +
                    "Bounty Hunter for 10 seconds, except for the Bounty Hunter. This is usable once per day per purchase."

            level12InfoTitle.text = "Impale"
            level12Info.text = "\t\tThis ability causes a tagged throwing weapon to strike a vital point on the target, causing extreme pain" +
                    "which prevents the victim from using any tag skills until the victim performs a 10-second count to remove " +
                    "the weapon while not moving, or until 60 seconds have passed. The call for this is “Innate 1 Body " +
                    "Impale”. Until the weapon is removed or the time expires, the victim can move no faster than 1 step per " +
                    "second. Removing the weapon manually causes an additional 1 Body of damage. Impale will only " +
                    "function against living targets and those that feel pain. It cannot be combined with other skills and the " +
                    "damage cannot be increased, though specific damage types such as “Silver” or “Magic” may be called " +
                    "based on the weapon used. This ability is usable once per day per purchase."
        }
        else if (characterVocation == "Shaman") {
            level3InfoTitle.text = "Rite of Weaving/Unweaving"
            level3Info.text = "\t\tThis rite allows a Shaman to induct new members into their Braid, build them a Fetish, and Empower a " +
                    "Braid member’s Fetish when its power fades. The first time a Shaman uses a Rite of Weaving they will do " +
                    "so for themselves, creating their own Fetish and becoming a true Shaman. Fetishes are sacred items that " +
                    "should be personal and important to the Braid member. Creating or Empowering a Fetish requires the " +
                    "Shaman to perform a ceremony at least 10 minutes long. The specifics of the ceremony will depend on " +
                    "the Shaman’s culture, race and style.\n\n" +
                    "\t\tIf the Braid member is new, the Shaman will decide on an Animist animal for the new Braid member " +
                    "based on their personality and will present them with their Fetish. This Fetish must be made by the " +
                    "Shaman and should be smaller than a child’s doll, but otherwise can be anything. The Braid’s Animist " +
                    "may be any land-based animal and is considered to be either a Predator or a Prey Animist. The animal " +
                    "must be a natural, non-magical animal - bears are acceptable, basilisks are not. The Shaman states “Innate " +
                    "Rite of Weaving” and attaches the tag for their Rite of Weaving to the Fetish. Once the ceremony is " +
                    "complete, this new Fetish will grant Animal Kinship with that animal group for the Braid member at will. " +
                    "Animal Kinship will cause any animal of that group (eg: all ‘cats’ for a Lion Animist) to see the Braid " +
                    "member as friendly. It is used by stating “Innate Magic Animal Kinship <animal>”. Animals in this group " +
                    "will not initiate hostilities against the Braid member but will respond to hostility normally. A Shaman " +
                    "may induct a new Braid member by creating a new Fetish for them once per day per purchase.\n\n" +
                    "\t\tThe Rite of Weaving may also be used to empower expired Fetishes at will by the Shaman. Being " +
                    "inducted into the Braid is considered a lifelong commitment, but the power of a Fetish will last for 5 days " +
                    "before needing to be empowered again. Should the Fetish be destroyed or leave their person, membership " +
                    "in the Braid continues, but the Rite of Weaving must be performed again to create a new Fetish. " +
                    "Empowering an existing Fetish does not use up a daily use of Rite of Weaving, but replacing a missing " +
                    "Fetish does. A Shaman may not empower another Shaman’s Fetishes. A Shaman can have up to one" +
                    "Empowered Fetish per level of the Shaman, excluding themselves.\n\n" +
                    "\t\tA Shaman can sense their own Braid members with Empowered Fetishes. This can be accomplished by " +
                    "stating “Sense Braid <Braid Name>!”. All Braid members with Empowered Fetishes must respond " +
                    "“Here!” out of game. This power may be used at will by the Shaman and once per day by Braid members.\n\n" +
                    "\t\tA Shaman can remove Braid members who have become disloyal - by force. To remove a Braid member, " +
                    "the Shaman must kill them and eat their heart to reclaim the Animist within it. The Shaman empowers " +
                    "each of the other Braid members with Empowered Fetishes who participate in this reclamation with +2 " +
                    "Strength for one hour once the body vanishes to resurrect or dies a final death. Either way they are " +
                    "removed from the Braid.\n\n" +
                    "\t\tFinally, Shaman are vulnerable to betrayal their own Braid members. A Shaman who is killed, directly or " +
                    "indirectly, by one of their Braid members who shares their race will have a 50% chance of taking two " +
                    "deaths upon resurrection. If the Braid member who committed the betrayal is of another race, this " +
                    "automatically raises to two deaths. This occurs even if the Shaman is unaware of the betrayal. The death " +
                    "must have been intentionally caused by the Braid member. The Braid member should report this to the " +
                    "Shaper team if the Shaman is unaware. The Shaman is vulnerable to this effect for up to one year after the " +
                    "betrayal."

            level6InfoTitle.text = "Rite of War"
            level6Info.text = "\t\tThis ability allows the Shaman to strengthen and empower their Braid by banging on war drums, singing," +
                    "or chanting. At the beginning of the Rite, the Shaman senses their Braid members with the Rite of " +
                    "Weaving. For each Braid member that the Shaman senses, the Shaman can resist any one physical strike " +
                    "or hostile Battle Magic spell. While the Rite of War is going on, all Braid members with Empowered " +
                    "Fetishes within earshot and line of sight will gain a power based on their Fetish, as described below. " +
                    "While the Rite of War is active, the Shaman can take no other action besides walking and performing the " +
                    "Rite. The Shaman cannot stop for more than 3 continuous seconds or the rite will end. To initiate a Rite of " +
                    "War the Shaman must state “Innate: Rite of War!” and then begin their performance. This rite is usable " +
                    "once per day per purchase and lasts for up to ten minutes.\n\n" +
                    "Predator: Predators Braid members with an Empowered Fetish participating in the Rite of War gain " +
                    "temporary hide armour worth 5 Armour Points. This armour increases by 5 AP for each Braid member, " +
                    "other than the Shaman and themselves, who participates in the Rite of War who has an Empowered " +
                    "Fetish. This armour functions like normal armour except that it cannot be refitted or repaired. To repair " +
                    "their natural hide, the Braid member must heal it as though it were Body points.\n\n" +
                    "Prey: When any Braid member with an Empowered Fetish falls into their Bleed or Death Count during " +
                    "the Rite of War, Braid members with Prey Animists may touch their fallen bodies and state “Innate Spirit " +
                    "Walk 1, Innate Spirit Walk 2, Innate Spirit Walk 3”. This transfers the body in spirit form to the " +
                    "Shaman’s location by calling on the target’s Animist. Upon reaching the Shaman the body, including its " +
                    "possessions returns to the material world with the same Spirit Walk count. During this travel time, their " +
                    "Bleed or Death count will continue and their body cannot be Lifed because their spirit is not in it. If the " +
                    "spirit cannot find or reach the Shaman, they will return to their body. Their spirit will pass through non-magical barriers if any block their route to the Shaman, but must travel around magical barriers. This" +
                    "ability may be used at will by Prey Braids with Empowered Fetishes during the Rite of War."

            level9InfoTitle.text = "Rite of Vision"
            level9Info.text = "\t\tThe Rite of Vision is a one minute ceremony that allows the Shaman to become a ghostly version of their " +
                    "Animist for a period of time. For each Braid present in the ceremony with an Empowered Fetish, the Rite " +
                    "of Vision becomes more powerful. \n\n" +
                    "\t\tTo begin, the Shaman must create a new Fetish of their mortal form, the size of a child’s doll or larger. " +
                    "This Fetish will take the place of their body and has 1 Body point. All damage to this Fetish acts as a " +
                    "Killing Blow and will cause the Shaman’s physical body to fall into its Death Count when the Shaman " +
                    "returns to it. If there is no Marshal present when the Fetish is damaged, the killer must find a Marshal and " +
                    "inform them that they performed a Killing Blow on the Fetish. The Marshal will then inform the Shaman." +
                    "The Shaman’s character sheet should be left with the Fetish along with the tag for the Rite of Vision.\n\n" +
                    "\t\tOnce their Fetish is prepared the Shaman will state “Innate Rite of Vision!”. This will manifest a " +
                    "shimmering, transparent version of their Animist which they now possess. The Shaman’s physical body " +
                    "and all items on them will be absorbed into their special Fetish. The Fetish cannot be moved by any " +
                    "means until the Shaman returns to it. The ghostly Animist is now controlled by the Shaman and all that it " +
                    "experiences will be experienced by the Shaman. The Animist has a silver threshold, 25 Body points, two " +
                    "claws which swing for 5 Normal each, and 25 hide Armour Points. This armour functions like normal " +
                    "armour except that it cannot be refitted or repaired. To repair their natural hide, the Shaman must heal it " +
                    "as though it were Body points. The Shaman may speak in this form.\n\n" +
                    "\t\tThe Shaman may touch cast one memorised spell through their claws for each Braid member that " +
                    "participated in the Rite of Vision. No other skills or abilities may be used and no items of any kind may " +
                    "be carried by the Animist. This possession will last for 10 minutes per Braid with an Empowered Fetish " +
                    "who participated in the Rite. When the duration expires or the Animist reaches 0 Body, the Shaman’s " +
                    "spirit will return to their Fetish and their body will reform, along with anything it was wearing. If the " +
                    "Animist was destroyed by reaching 0 Body, when the Shaman’s spirit returns to its body they will be at 2 " +
                    "Body. For the next hour, 2 Body will be their maximum Body. If a Shaman’s special Fetish suffered a " +
                    "Killing Blow during the Rite of Vision, upon returning to its body the Shaman enters their Death Count."

            level12InfoTitle.text = "Rite of the Monolith"
            level12Info.text = "\t\tThis powerful Rite will create a sacred area for the Shaman and their Braid, dominated by a large stone or " +
                    "monolith. The Shaman must perform a 1-hour roleplay rite to create the Monolith. This area will " +
                    "encompass a space 20 feet by 20 feet. The stone must be at least 5 feet but does not need to be real stone " +
                    "out of game. A Shaman may only have one active Monolith at a time. The Shaman can destroy their " +
                    "Monolith by doing 50 pts of damage to it. They may then create another somewhere else, after 5 days.\n\n" +
                    "\t\tThe area around the Monolith will function as a resurrection circle for the Shaman’s Braid members who " +
                    "have Empowered Fetishes. Resurrections may be performed by the Shaman but will also happen " +
                    "automatically if they are not there. A Shaman may construct a special Spirit Mask for this purpose. This " +
                    "mask must be at least 1 foot long and 8 inches wide, made of wood or bone in game and have large " +
                    "adornments. It should not be able to be mistaken for an NPC mask. The Shaman’s Animist animal should " +
                    "be represented in some manner on the mask. If the Shaman resurrects a Braid member while wearing this " +
                    "Spirit Mask and tells that Braid member a resurrection dream themed around them being their Animist, " +
                    "the resurrection will only take 5 minutes. The mask will only function for resurrections performed on" +
                    "Braid members within the Monolith area.\n\n" +
                    "\t\tOne per day per purchase, a magic, transparent barrier can be created around the Monolith area. It will " +
                    "last for 1 hour for every Empowered Fetish present within the area when activated. The entire barrier may " +
                    "be temporarily disabled at any time when active by the Shaman or any Braid members with Empowered " +
                    "Fetishes by stating “Barrier up/down!” at will. While the barrier is up, it behaves like a Circle of " +
                    "Protection. The magic of this barrier is considered ritual level.\n\n" +
                    "\t\tAny sentient creature capable of resurrection may be sacrificed upon the Monolith. If the creature suffers " +
                    "a Killing Blow and has their heart removed, any Braid members, including the Shaman, who eat a piece " +
                    "of it will gain +2 Strength for one hour once the body vanishes to resurrect or dies a final death. This " +
                    "power may be used once per Braid member or Shaman per day."
        }
        else if (characterVocation == "Stalwart") {
            level3InfoTitle.text = "Shield Parry"
            level3Info.text = "\t\tThis skill allows a Stalwart to call an “Innate Shield Parry!” defense to any physical attack that strikes " +
                    "their shield, once a day per purchase. All normal parry rules apply. This ability does not allow the " +
                    "Stalwart to parry with their weapon; the incoming strike must successfully strike their shield."

            level6InfoTitle.text = "Conviction"
            level6Info.text = "\t\tThe Stalwart’s Conviction ability allows them to grant themselves +10 temporary Body points once per " +
                    "day per purchase, stating “Innate Conviction”. These Body points cannot be stacked with other temporary " +
                    "Body point bonuses (they will remove and over-ride the previous) except with other activations of this " +
                    "ability. These Body points cannot be healed and are taken off first when damage is struck to Body. These " +
                    "extra Body points will fade after exactly 24 hours have passed."

            level9InfoTitle.text = "Fortress"
            level9Info.text = "\t\tWhen Fortress is used, the Stalwart gains the ability to activate a defensive stance that grants the Stalwart " +
                    "a 5 Normal threshold and +40 armour points that remain as long as the Stalwart keeps one foot planted. " +
                    "The Stalwart also gains an immunity to fear and cower effects during this time. While in Fortress, the " +
                    "Stalwart is immune to Strength-based pushing, magical or physical.\n\n" +
                    "\t\tThis ability can be activated once per day per purchase by planting a foot and stating “Innate Fortress!”. " +
                    "When the defensive stance ends by the planted foot being raised or moved (it may swivel to change " +
                    "facing), the Stalwart needs a respite due to the sheer amount of physical and mental energy required. For " +
                    "1 minute after Fortress ends, the Stalwart possesses -2 Strength and is unable to use any skills that have " +
                    "limited uses."

            level12InfoTitle.text = "Imbue Shield"
            level12Info.text = "\t\tImbue Shield allows a Stalwart to spend 10 seconds of uninterrupted time imbuing a shield of any type " +
                    "with defensive power. This is done by concentrating on the shield for 10 seconds then stating “Innate " +
                    "Imbue Shield!”. Once imbued, the shield allows any Battle Magic spell or Battle Magic level magical" +
                    "ability with the same name as a spell that strikes it to be “resisted” for 1 hour by simply stating “Innate " +
                    "Resist!” During this hour the Stalwart may also “reflect” one Battle Magic spell or Battle Magic level " +
                    "magical ability with the same name as a spell that strikes the shield back upon the caster by calling out " +
                    "“Innate Reflect!”. If the shield is no longer equipped, the ability ends. The imbued shield may only be " +
                    "used by the Stalwart who activated it. Imbue Shield may be used once a day per purchase."
        }
        else if (characterVocation == "Swashbuckler") {
            level3InfoTitle.text = "Finesse"
            level3Info.text = "\t\tLight on their feet and nimble, a Swashbuckler trains to maneuver around weapon strikes and absorb the " +
                    "inertia of blows. Each time this ability is purchased the Swashbuckler gains 5 Armour Points. These 5 AP " +
                    "are considered armour, but they cannot be repaired, refitted or augmented in any way. Finesse AP are " +
                    "removed before regular AP if the Swashbuckler takes damage. Finesse AP will regenerate as a " +
                    "Swashbuckler’s energy returns. For every 60 second spent roleplaying limbering up, calming their " +
                    "breathing, tightening straps, etc., the Swashbuckler will regain up to 10 Finesse AP. During this time no " +
                    "other skills may be used. AP from Finesse will be temporarily lost if the Swashbuckler wears metal " +
                    "armour. If Finesse’s AP are lost because of these restrictions it will take 10 seconds for them to return " +
                    "after the restrictions have been met. Finesse AP cannot be used if the Swashbuckler is unable to move."

            level6InfoTitle.text = "En Garde!"
            level6Info.text = "\t\tThis ability improves a Swashbuckler’s skill at fighting with a weapon in one hand against a single target. " +
                    "En Garde! grants the Swashbuckler +1 damage with their main weapon for 10 minutes. This bonus" +
                    "damage is not granted to their off-hand weapon, if they use one. If the Swashbuckler has two weapons, " +
                    "they may select their ‘main’ weapon when the ability is activated. To activate this ability the " +
                    "Swashbuckler will point or motion toward one target and state: “Innate En Garde!” En Garde! only grant " +
                    "this damage bonus against the declared target. Each time this ability is purchased the Swashbuckler will " +
                    "gain an additional +1 damage and another 10 minute period in which can use En Garde! per day. Eg: If " +
                    "purchased 3 times the Swashbuckler will gain +3 to main weapon damage for 10 minutes, three times a " +
                    "day. Only one En Garde! can be activate at the same time."

            level9InfoTitle.text = "Prise de Fer"
            level9Info.text = "\t\tThis physical attack will disarm an opponent’s weapon and cause it to land in the Swashbuckler’s hand. " +
                    "By striking the opponent’s weapon with their own and calling “Innate Prise de Fer!” the Swashbuckler " +
                    "can force their opponent to give them the targeted weapon, if the Prise de Fer is successful. A " +
                    "Swashbuckler has a 3 second grace period to determine what to do with the captured weapon before any " +
                    "negative effects from the Swashbuckler weapon restrictions begin. Prise de Fer is considered a physical " +
                    "attack. It will not grant the skill to use the weapon captured. Prise de Fer will only function against 1-" +
                    "handed weapons unless two Prise de Fers are used at once. If the Swashbuckler does not have a free hand " +
                    "to catch the weapon it will fall on the ground at their feet. Prise de Fer is usable once per day per " +
                    "purchase."

            level12InfoTitle.text = "Aegis"
            level12Info.text = "\t\tBy declaring “Innate Aegis!” the Swashbuckler may use the Parry defense multiple times within 10 " +
                    "seconds. For every level of the Swashbuckler, they may use one Parry. Parry enables the player to parry " +
                    "any weapon blow, as well as touch casted spells. To Parry an attack, the Swashbuckler simply calls" +
                    "“Parry”, which negates the last hit taken. This Parry cannot be used in conjunction with any other skill, " +
                    "ability, or magically summoned weapon. Parry cannot block Massive damage, Spellstrikes, or Surprise " +
                    "Attacks. While Aegis is active, no other skills may be used. Aegis may be used once per day per " +
                    "purchase."
        }
        else if (characterVocation == "Undead Hunter") {
            level3InfoTitle.text = "Hunter's Focus"
            level3Info.text = "\t\tWhen the Undead Hunter wields any silver, Master Crafted or Legendary weapon they may call magic " +
                    "damage. This ability is usable at will."

            level6InfoTitle.text = "Hunter's Attrition"
            level6Info.text = "\t\tHunter’s Attrition is a powerful magical ability that damages Undead while healing the Undead Hunter. " +
                    "By using a weapon appropriate for Hunter’s Focus, an Undead Hunter may call “Innate Spellstrike " +
                    "Hunter’s Attrition: 25 Magic Healing”. When successfully delivered, this ability does 25 Magic Healing " +
                    "damage (100 Magic Body damage vs Undead) and also mends the Undead Hunter for 25 Body, in the" +
                    "appropriate type for them to heal from, regardless of race. This damage is considered healing magic for " +
                    "all purposes. In order for the healing function of this ability to function an Undead must have been " +
                    "successfully damaged. Hunter’s Attrition can be used once per day per purchase."

            level9InfoTitle.text = "Crystal of Light"
            level9Info.text = "\t\tAt 9th level an Undead Hunter can create and throw a magical crystal of sunlight, which when striking an " +
                    "Undead causes it to explode in natural sunlight. This sunlight will bathe the Undead for 1 minute and " +
                    "cause it to be affected as though it was between the hours of 6:00 AM and 6:00 PM. This will strip " +
                    "magical thresholds and supernatural strength from Undead and may have additional effects based on the " +
                    "Undead type. If the target is not Undead the crystal will have no effect and will not activate magical " +
                    "defenses. It may be used once per day per purchase and the call is “Innate Arcane Crystal of Light”."

            level12InfoTitle.text = "Final Rest"
            level12Info.text = "\t\tThis ability allows an Undead Hunter to destroy an Undead creature immediately. By using a weapon " +
                    "appropriate for Hunter’s Focus, an Undead Hunter may call “Innate Spellstrike: Arcane Death!” against" +
                    "any Lesser or Greater Undead. Some powerful or unique Undead may be able to resist this effect. This " +
                    "skill is usable once per day per purchase."
        }

        moreTrapsmithButton.setOnClickListener() {
            val intent = Intent(this, MoreTrapsmith::class.java)
            startActivity(intent)
        }
        moreAlchemyButton.setOnClickListener() {
            val intent = Intent(this, MoreAlchemy::class.java)
            startActivity(intent)
        }
        moreChemistryButton.setOnClickListener() {
            val intent = Intent(this, MoreChemistry::class.java)
            startActivity(intent)
        }
        moreBlacksmithButton.setOnClickListener() {
            val intent = Intent(this, MoreBlacksmith::class.java)
            startActivity(intent)
        }
        moreArtificeButton.setOnClickListener() {
            val intent = Intent(this, MoreArtifice::class.java)
            startActivity(intent)
        }
        moreScrollcraftButton.setOnClickListener() {
            val intent = Intent(this, MoreScrollcraft::class.java)
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