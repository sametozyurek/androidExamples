package com.sametozyurek.methodsandclass;

public class Students {
    public String name;
    public int age;
    public String department;

    public Students(String name, int age, String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDepartment(){
        return department;
    }
    public  void setDepartment(String department){
        this.department=department;
    }

}
