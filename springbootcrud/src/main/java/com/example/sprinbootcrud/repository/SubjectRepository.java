package com.example.sprinbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.sprinbootcrud.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}
