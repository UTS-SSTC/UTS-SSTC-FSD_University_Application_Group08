package org.group08.service;


import org.group08.entity.Students;

/**
 * @author boosterLEL
 * @apiNote
 * @since 2024/10/17
 */
public interface StudentsService {
    Students loginStudents(String idOrEmail, String password);

    int checkEmail(String email);

    int saveStudent(Students student);
}
