package br.com.dextra.bootcamp.MentorMatch.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Mentored {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String knowledge;
	private String bio;

	@ManyToMany
	private List<Mentored> linkedList;

	@ManyToOne
	private Mentor mentor;

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

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
}
