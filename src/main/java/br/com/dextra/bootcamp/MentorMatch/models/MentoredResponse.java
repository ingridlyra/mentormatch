package br.com.dextra.bootcamp.MentorMatch.models;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

public class MentoredResponse {
    private long id;
    private String name;
    private String knowledge;
    private String bio;
    private List<Mentored> linkedList;
    private Mentor mentor;

    public MentoredResponse(Mentored mentored) {
        this.id = mentored.getId();
        this.name = mentored.getName();
        this.knowledge = mentored.getKnowledge();
        this.bio = mentored.getBio();
        this.linkedList = mentored.getLinkedList();
        this.mentor = mentored.getMentor();
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

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}
