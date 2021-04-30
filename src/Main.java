public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Mahmut");
        student1.setLastName("çevik");
        student1.setLessons("Java");
        student1.setEmail("mmm@ggg.com");

        Student student2 = new Student();
        student2.setId(2);
        student2.setLastName("Eyup");
        student2.setLastName("çevik");
        student2.setEmail("eee@ggg.com");

        StudentManager studentManager = new StudentManager();
        Student[] students = {student1,student2};

        studentManager.add(student1);
        studentManager.add(student2);

        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("halid");
        instructor1.setLastName("cevik");
        instructor1.setInstructerLesson("Java ve Python");
        instructor1.setEditor("Yönetici");
        instructor1.setEmail("hhh@ggg.com");
        instructor1.setPassword(1234);

        Instructor instructor2 = new Instructor();
        instructor2.setId(2);
        instructor2.setFirstName("harun");
        instructor2.setLastName("çevik");
        instructor2.setInstructerLesson("C#");
        instructor2.setEditor("Yönetici");
        instructor2.setEmail("hhh@ggg.com");
        instructor2.setPassword(12345);

        InstructorManager instructorManager = new InstructorManager();
        Instructor[] instructors = {instructor1, instructor2};

        instructorManager.add(instructor1);
        instructorManager.add(instructor2);


    }
}
