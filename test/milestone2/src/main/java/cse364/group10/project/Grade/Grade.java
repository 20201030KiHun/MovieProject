package cse364.group10.project.Grade;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import cse364.group10.project.Movie.Movie;

@Entity
class Grade {

    private @Id @GeneratedValue Long id;
    private int overall;

    Grade() {}

    Grade(int overall) { this.overall = overall; }

    public int getGrade() {
        return this.overall; }

    public void setGrade(Int overall) { this.overall = overall; }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Grade))
            return false;
        Grade grade = (grade) o;
        return Objects.equals(this.id, grade.id)
                && Objects.equals(this.overall, grade.overall);
    }

    @Override
    public int hashCode() { return Objects.hash(this.id, this.overall); }

    @Override
    public String toString() {
        return "Grade{" + "id = " + this.id + ", overall = " + this.overall + '}';
    }
}