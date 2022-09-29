public class StudentManagement {
    private Student[] students = new Student[100];
    private int arrLength = 0;

    /**
     * Check two students same group.
     * 
     * @param s1 Student
     * @param s2 Student
     * @return boolean
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup() == s2.getGroup();
    }

    /**
     * Add new student.
     * 
     * @param newStudent Student
     */
    public void addStudent(Student newStudent) {
        students[arrLength] = new Student(newStudent);
        arrLength++;
    }

    /**
     * Print students by group.
     * 
     * @return String
     */
    public String studentsByGroup() {
        String sortStudents = "";
        boolean[] isPrint = new boolean[100];
        for (int i = 0; i < arrLength; i++) {
            if (!isPrint[i]) {
                sortStudents += students[i].getGroup() + "\n";
                for (int j = i; j < arrLength; j++) {
                    if (sameGroup(students[i], students[j])) {
                        isPrint[j] = true;
                        sortStudents += students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return sortStudents;
    }

    /**
     * Remove a student.
     * 
     * @param id String
     */
    public void removeStudent(String id) {
        for (int i = 0; i < arrLength; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < arrLength - 1; j++) {
                    students[j] = new Student(students[j + 1]);
                }
                arrLength--;
            }
        }
    }
}
 