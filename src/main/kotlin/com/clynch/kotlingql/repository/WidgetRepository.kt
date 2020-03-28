package com.clynch.kotlingql.repository

import com.clynch.kotlingql.sql.WidgetEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface WidgetRepository : CrudRepository<WidgetEntity, Long>