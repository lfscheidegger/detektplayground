package com.lfscheidegger.detekt

import com.lfscheidegger.detekt.rules.CustomRule
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class CustomRuleSetProvider: RuleSetProvider {

    override val ruleSetId: String = "custom-rules"
    override fun instance(config: Config): RuleSet = RuleSet(
        ruleSetId,
        listOf(CustomRule(config))
    )
}