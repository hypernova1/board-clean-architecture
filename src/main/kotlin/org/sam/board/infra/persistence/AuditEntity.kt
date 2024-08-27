package org.sam.board.infra.persistence

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.Comment
import java.time.LocalDateTime

@MappedSuperclass
abstract class AuditEntity {
    @Comment("생성 시간")
    @Column(columnDefinition = "datetime", nullable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()

    @Comment("수정 시간")
    @Column(columnDefinition = "datetime", nullable = false)
    val updatedAt: LocalDateTime = LocalDateTime.now()

    @Comment("삭제 시간")
    @Column(columnDefinition = "datetime", nullable = true)
    val deletedAt: LocalDateTime? = null
}