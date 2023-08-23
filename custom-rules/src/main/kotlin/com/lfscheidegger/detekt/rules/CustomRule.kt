package com.lfscheidegger.detekt.rules

import io.gitlab.arturbosch.detekt.api.*
import org.jetbrains.kotlin.psi.KtCallExpression

class CustomRule(config: Config): Rule(config) {

    override val issue = Issue(
        javaClass.simpleName,
        Severity.Defect,
        "Using println is forbidden.",
        Debt.FIVE_MINS
    )

    override fun visitCallExpression(expression: KtCallExpression) {
        super.visitCallExpression(expression)
        if (expression.calleeExpression?.text == "println") {
            report(CodeSmell(issue, Entity.from(expression), "Usage of println detected"))
        }
    }
}