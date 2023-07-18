package com.example.sprinbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprinbootcrud.model.Subject;
import com.example.sprinbootcrud.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/getSubjects")
	public List<Subject> getAllSubjects() {
		return subjectService.getAllSubjects();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addsubjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
		subjectService.updateSubject(id, subject);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deletesubjects/{id}")
	public void deleteSubject(@PathVariable String id) {
		subjectService.deleteSubject(id);
	}

}
