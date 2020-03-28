package com.clynch.kotlingql.graphql.widget

import com.clynch.kotlingql.service.WidgetService
import com.clynch.kotlingql.model.Widget
import com.expediagroup.graphql.spring.operations.Mutation
import org.springframework.stereotype.Component

@Component
class WidgetMutation(private val service: WidgetService) : Mutation {

    fun createWidget(description: String): Widget {
        return service.addWidget(description)
    }
}

