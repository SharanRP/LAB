import java.util.Scanner;
class Human {
private String name;
private String age;
private String gender;
public Human(String name, String age, String gender) {
this.name = name;
this.age = age;
this.gender = gender;
}
public String getAge() {
return age;
}
public void setAge(String age) {
this.age = age;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}

public String getinfo() {
return "Name: " + getName() + "\nAge: " + getAge() + "\nGender: " +
getGender();
}
}
class Student extends Human {
private String rollno;
private String studentClass;
private String semester;
private String cpi;
public Student(String name, String age, String gender, String rollno,
String studentClass, String semester, String cpi) {
super(name, age, gender);
this.rollno = rollno;
this.studentClass = studentClass;
this.semester = semester;
this.cpi = cpi;
}
public void updateInfo(String name, String age, String gender, String
rollno, String studentClass, String semester, String cpi) {
setName(name);
setAge(age);
setGender(gender);
this.rollno = rollno;
this.studentClass = studentClass;
this.semester = semester;
this.cpi = cpi;
}
@Override
public String getinfo() {
return super.getinfo() + "\nRoll No: " + rollno + "\nClass: " +
studentClass + "\nSemester: " + semester + "\nCPI: " + cpi;
}
}
class Faculty extends Human {
private String emp_id;
private String salary;
private String specialization;

public Faculty(String name, String age, String gender, String emp_id,
String salary, String specialization) {
super(name, age, gender);
this.emp_id = emp_id;
this.salary = salary;
this.specialization = specialization;
}
@Override
public String getinfo() {
return super.getinfo() + "\nEmployee ID: " + emp_id + "\nSalary: " +
salary + "\nSpecialization: " + specialization;
}
}
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Faculty f = new Faculty("Pavan", "25", "male", "23", "100000",
"IoT");
System.out.println(f.getinfo());
System.out.println();
Student s = new Student("Sharan", "19", "male", "58", "IT", "3",
"9.35");
System.out.println(s.getinfo());
System.out.println();
System.out.println("Enter name: ");
String updatedName = sc.nextLine();
System.out.println("Enter age: ");
String updatedAge = sc.nextLine();
System.out.println("Enter gender: ");
String updatedGender = sc.nextLine();
System.out.println("Enter roll no: ");
String updatedRollno = sc.nextLine();
System.out.println("Enter class: ");
String updatedClass = sc.nextLine();
System.out.println("Enter semester: ");
String updatedSemester = sc.nextLine();

System.out.println("Enter CPI: ");
String updatedCpi = sc.nextLine();
s.updateInfo(updatedName, updatedAge, updatedGender, updatedRollno,
updatedClass, updatedSemester, updatedCpi);
System.out.println("\nUpdated Student Information:");
System.out.println(s.getinfo());
}
}