package cse364.group10.project.Grade;

class GradeNotFoundException extends RuntimeException {

    GradeNotFoundException(Long id) {
        super("Could not find grade " + id);
    }
}