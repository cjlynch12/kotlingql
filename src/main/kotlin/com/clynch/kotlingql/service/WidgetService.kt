package com.clynch.kotlingql.service

import com.clynch.kotlingql.model.Widget
import com.clynch.kotlingql.repository.WidgetRepository
import com.clynch.kotlingql.sql.WidgetEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class WidgetService(private val repository: WidgetRepository) {

    fun addWidget(description: String): Widget {
        val newWidget: WidgetEntity = WidgetEntity(null, description)
        repository.save(newWidget)
        return Widget.fromDAO(newWidget)
    }

    fun getWidgetById(id: Long): Widget? {
        val widget: Optional<WidgetEntity> = repository.findById(id)
        return if (widget.isPresent) Widget.fromDAO(widget.get()) else null
    }
}