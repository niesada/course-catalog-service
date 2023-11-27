package com.kotlinspring.dto

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

data class InstructorDTO(
    val id: Int?,
    @get:NotBlank(message = "instructorDTO.name must not be blank")
    var name: String
)