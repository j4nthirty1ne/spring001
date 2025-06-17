package org.example.assignment;

public class Student {
    private int id;
    private String uuid;
    private String fullName;
    private double score;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getUuid() { return uuid; }
    public void setUuid(String uuid) { this.uuid = uuid; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
}