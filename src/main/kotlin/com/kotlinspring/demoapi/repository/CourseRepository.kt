package com.kotlinspring.demoapi.repository

import com.kotlinspring.demoapi.entity.Course
import org.springframework.data.repository.CrudRepository

interface CourseRepository:CrudRepository<Course, Int> {

}