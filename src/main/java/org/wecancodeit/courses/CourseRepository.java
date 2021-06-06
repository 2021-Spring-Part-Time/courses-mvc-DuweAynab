package org.wecancodeit.courses;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CourseRepository {

    Map<Long, Course> coursesList = new HashMap<>();

    //constructor to handle our database
    public CourseRepository(){
        Course reading = new Course( 1l, "Reading", "I love J.R.R. Tolkien, learn all about about this author in this course.");
        Course music = new Course( 2l, "Music", "Love music? Join us. In this course, we dive deep into music's history and it's many genres.");
        Course art = new Course( 3l, "Art", "Anything can be art. In this course we learn about the art all around us.");
        Course history = new Course( 4l, "History", "American-History: Post-Civil War Era. Reconstruction Era to present-day.");


        coursesList.put(reading.getId(), reading);
        coursesList.put(music.getId(), music);
        coursesList.put(art.getId(), art);
        coursesList.put(history.getId(), history);

    }

    //Constructor for testing purposes only..use varArgs to add none or as many objects as we want.
    public CourseRepository(Course ...coursesToAdd) {
        for(Course course: coursesToAdd) {
            coursesList.put(course.getId(), course);
        }
    }

    public Course findOne(long id) {
        return coursesList.get(id);
    }

    public Collection<Course> findAll() {
        return coursesList.values();
    }
}
