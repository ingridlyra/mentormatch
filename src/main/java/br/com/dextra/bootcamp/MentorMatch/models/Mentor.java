package br.com.dextra.bootcamp.MentorMatch.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String knowledge;
	private String bio;
	
	@ManyToMany
	private List<Mentored>linkedList;
	
	@OneToMany(mappedBy = "mentor")
	private List<Mentored>mentored;

	public Mentor() {
	}

	public Mentor(long id, String name, String knowledge, String bio, List<Mentored> linkedList, List<Mentored> mentored) {
		this.id = id;
		this.name = name;
		this.knowledge = knowledge;
		this.bio = bio;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKnowledge() {
		return knowledge;
	}
	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public List<Mentored> getLinkedList() {
		return linkedList;
	}
	public void setLinkedList(List<Mentored> linkedList) {
		this.linkedList = linkedList;
	}
	public List<Mentored> getMentored() {
		return mentored;
	}
	public void setMentored(List<Mentored> mentored) {
		this.mentored = mentored;
	}
}
