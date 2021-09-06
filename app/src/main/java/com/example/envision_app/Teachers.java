package com.example.envision_app;

public class Teachers {
    String teacher;
    int number;

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Teachers(String teacher, int number) {
        this.teacher = teacher;
        this.number = number;
    }
}
