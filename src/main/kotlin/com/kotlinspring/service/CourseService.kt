package com.kotlinspring.service

import com.kotlinspring.dto.CourseDTO
import com.kotlinspring.entity.Course
import com.kotlinspring.repository.CourseRepository
import mu.KLogging
import org.springframework.stereotype.Service

@Service
class CourseService(val courseRepository: CourseRepository) {

    companion object : KLogging()

    fun addCourse(courseDTO: CourseDTO) : CourseDTO{
        val courseEntiry = courseDTO.let {
            Course(null, it.name, it.category)
        }

        courseRepository.save(courseEntiry)
        logger.info("Saved course is : $courseEntiry")

        return courseEntiry.let {
            CourseDTO(it.id, it.name, it.category)
        }
    }
}
