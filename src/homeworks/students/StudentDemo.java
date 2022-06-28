package homeworks.students;

import java.util.Scanner;

import static homeworks.students.Commands.*;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print all student's");
            System.out.println("Please input 3 for delete student by index");
            System.out.println("Please input 4 for print student by lesson");
            System.out.println("Please input 5 for print student's count");
            System.out.println("Please input 6 for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {

                case EXIT:
                    run = false;
                    break;

                case ADD_STUDENT:
                    addStudent();
                    break;

                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;

                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;

                case PRINT_STUDENT_BY_LESSON:
                    System.out.println("Please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentByLessonName(lessonName);
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println("Student's count");
                    System.out.println(studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }


    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("Please chosse student index:");
        int studentIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input new lesson name:");
        String lesson = scanner.nextLine();
        studentStorage.add(studentIndex,lesson);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {

        System.out.println("Pleace input student's name");
        String name = scanner.nextLine();
        System.out.println("Pleace input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Pleace input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Pleace input student's phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Pleace input student's city");
        String city = scanner.nextLine();
        System.out.println("Pleace input student's lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Student created");

    }
}