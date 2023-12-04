package com.smushytaco.health_levels.configuration_support
import com.smushytaco.health_levels.HealthLevels
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment
@Config(name = HealthLevels.MOD_ID)
data class ModConfiguration(
    @Comment("Default value is yes.\nIf set to yes you'll see an experience bar for your health experience.\nIf set to no you won't.")
    val enableHealthExperienceBar: Boolean = true,
    @Comment("The first value in the list is the first level and the amount put for the value is\nhow much it takes to reach that level and the same goes for every other value.")
    val levelsAndXP: List<Int> = listOf(5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000),
    @Comment("Default value is 2.\nFor every health level a player has they'll gain this much HP.")
    val hpPerLevel: Int = 2,
    @Comment("Default value is 10.\nThis will determine how much HP you'll start off with.")
    val startingHP: Int = 10,
    @Comment("Default value is yes.\nIf set to yes you will be healed whenever you level up.\nIf set to no you won't.")
    val healOnLevelUp: Boolean = true,
    @Comment("Default value is XP.\nIf set to LEVELS_AND_XP you'll lose levels and xp upon death,\nif set to XP you'll lose xp upon death,\nand if set to none you'll lose nothing upon death.")
    val loseType: LoseType = LoseType.XP,
    @Comment("The amount of level you lose on death.")
    val loseAmount: Int = 4
): ConfigData