package com.clynch.kotlingql.model

import com.clynch.kotlingql.sql.WidgetEntity


data class Widget(
        val id: Long,
        var description: String
) { companion object {
    fun fromDAO(widgetDAO: WidgetEntity) = Widget(
            widgetDAO.id!!,
            widgetDAO.description)
}}