package com.clynch.kotlingql.graphql.widget

import com.clynch.kotlingql.model.Widget
import com.clynch.kotlingql.service.WidgetService
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class WidgetQuery(private val service: WidgetService) : Query {

    fun widget(id: Long): Widget? {
        return service.getWidgetById(id)
    }
}