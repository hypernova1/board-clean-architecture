package org.sam.board.infra.database

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import java.time.LocalDate
import java.time.LocalDateTime

@MappedSuperclass
class AuditEntity {
    @Column(columnDefinition = "datetime", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
    @Column(columnDefinition = "datetime", nullable = false)
    val updatedAt: LocalDateTime = LocalDateTime.now()
    @Column(columnDefinition = "datetime", nullable = true)
    val deletedAt: LocalDateTime? = null
}