package org.example.assignment;

public class Student {
    private int id;
    private String fullName;
    private String gender;
    private Double score;

    public Student() {}

    public Student(int id, String fullName, String gender, Double score) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.score = score;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public Double getScore() { return score; }
    public void setScore(Double score) { this.score = score; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }
}
