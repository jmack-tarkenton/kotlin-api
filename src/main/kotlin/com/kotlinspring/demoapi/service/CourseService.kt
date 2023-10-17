package com.kotlinspring.demoapi.service

import com.kotlinspring.demoapi.dto.CourseDTO
import com.kotlinspring.demoapi.entity.Course
import com.kotlinspring.demoapi.repository.CourseRepository
import mu.KLogger
import mu.KLogging
import org.springframework.stereotype.Service

@Service
class CourseService(val courseRepository: CourseRepository) {
    companion object:KLogging()

    fun createCourse(courseDTO: CourseDTO):CourseDTO {
        val courseEntity = courseDTO.let {
            Course(null, it.name, it.category);
        }
        courseRepository.save(courseEntity);
        logger.info("Saved course is: $courseEntity")
        return courseEntity.let{
                CourseDTO(it.id,it.name,it.category)
        }

    }
}