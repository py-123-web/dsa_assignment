package boundary;

import java.util.Scanner;
//import entity.Course;
//import adt.*;
//import java.util.Iterator;
import utility.*;

public class CourseUI {
    
    //ListInterface<Course> courseList = new SortedArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public int getMenuChoice() {
        System.out.println("\nCourse Management Subsystem\n");
        System.out.println("Main Menu");
        System.out.println("1. Add a new programme to courses");
        System.out.println("2. Remove a programme from a course");
        System.out.println("3. Add a new course to programmes");
        System.out.println("4. Remove a course from a programme");
        System.out.println("5. Search courses offered in a semester");
        System.out.println("6. Amend course details for a programme");
        System.out.println("7. List courses taken by different faculties");
        System.out.println("8. List all courses for a programme");
        System.out.println("9. Generate summary reports");
        System.out.println("0. Quit");
        
        System.out.print("\nEnter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println();
        return choice;
    }
    
//    public void printCourseDetails(Course programme) {
//    System.out.println("Course Details");
//    System.out.println("Programme Name:" + programme.getProgramme());
//    
//  }
    
    
//    public String inputCourseCode(){
//        
//    }
//    
//    public String inputCourseName(){
//        
//    }
//    
//    //class type
//    
//    public String inputCourseName(){
//        
//    }
//    
//    public String inputCourseType(){
//        
//    }
//    
//    public String inputProgramme(){
//        System.out.print("Please enter new programme: ");
//        String programme = scanner.nextLine();
//        return programme;
//        
//    }
//    
//    public String inputSemester(){
////        System.out.print("Please enter new programme: ");
////        String programme = scanner.nextLine();
////        return programme;
//        
//    }
//    
//     public int inputCreditHour(){
////        System.out.print("Please enter new programme: ");
////        String programme = scanner.nextLine();
////        return programme;
//        
//    }
//     
//     public String inputFaculty(){
////        System.out.print("Please enter new programme: ");
////        String programme = scanner.nextLine();
////        return programme;
//        
//    }
//
//   public Course inputCourseDetails(){
//    String courseCode = inputCourseCode();
//    String courseName = inputCourseName();
//    String couseType = inputCourseType();
//    String programme = inputProgramme();
//    String semester = inputSemester();
//    int creditHour = inputCreditHour();
//    String faculty = inputFaculty();
//    
//    return new Course(courseCode,courseName,couseType,programme,semester,creditHour,faculty);
//   }
   
    public void getAddProgHeader() {
        System.out.println("-------------------------------------------------");
        System.out.println("        Add a new programme");
        System.out.println("-------------------------------------------------");
    }
    
    public void getAddCourseHeader() {
        System.out.println("-------------------------------------------------");
        System.out.println("        Add a new course");
        System.out.println("-------------------------------------------------");
    }
    
    //for input the programme
    public String getProgrammeName() {
        System.out.print("Enter new prorgamme : ");
        String programmeName = scanner.nextLine();
        return programmeName;
    }
    
  //for input the programme name to add the course
    public String getProgrammeForCourse(){
        System.out.print("Enter programme to add course : ");
        String stu_programme = scanner.nextLine();
        return stu_programme;
    }
    
    //to get new course code
     public String getCourseCode(){
        System.out.print("Enter a new course code : ");
        String course_code = scanner.nextLine();
        return course_code;
    }
     
     //to get new course name
     public String getCourseName(){
          System.out.print("Enter a new course name : ");
        String course_name = scanner.nextLine();
        return course_name;
     }
     
    public void printProgramme(String programme){
         System.out.println("List of programme :" + programme );
         DateTime.currentDateTime();
    }
    
    public void printCourse(String courseCode,String courseName){
         System.out.println("List of course :" + courseCode + ","+ courseName );
        DateTime.currentDateTime();
    }
    
    //list all courses for a programme
    public void printCoursesProgramme(String programme, String courseCode, String courseName){
        
        System.out.println("List of programme : " + programme );
          System.out.println("-------------------------------------------------");
           System.out.println("List of course :" + courseCode + ","+ courseName );
        System.out.println();
           DateTime.currentDateTime();
    }
         
     public static void displayAddProgrammeExist(String programme){
        System.out.println("Programme "+ programme +" already existed");    
    }
    
      public void displayAddCourseExist(String course_code){
        System.out.println("Programme "+ course_code +" already existed");    
    }
    
     public static void printProgNotExisted(){
        System.out.println("\u001B[31mThe programme is not existed.\u001B[0m");
        System.out.println("\u001B[31mPlease enter programme in the programme function.\u001B[0m");
    }
    
     public static void displayListProgNotFound(String Programme) {
        System.out.println("Programme " + Programme + " not found.");
    }
     
    }
    
    
    
    
    
    

     

        
       
        
    

