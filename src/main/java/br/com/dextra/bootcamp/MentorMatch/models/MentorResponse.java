package br.com.dextra.bootcamp.MentorMatch.models;

import java.util.List;

public class MentorResponse {

    private long id;
    private String name;
    private String knowledge;
    private String bio;
    private List<Mentored> linkedList;
    private List<Mentored> mentored;

    public MentorResponse(Mentor mentor) {
        this.id = id;
        this.name = name;
        this.knowledge = knowledge;
        this.bio = bio;
        this.linkedList = mentor.getLinkedList();
        this.mentored = mentor.getMentored();
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
