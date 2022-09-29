public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Get name method.
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Get id method.
     * 
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Get group method.
     * 
     * @return String
     */
    public String getGroup() {
        return group;
    }

    /**
     * Get email method.
     * 
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set name method.
     * 
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set id method.
     * 
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Set group method.
     * 
     * @param group String
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Set email method.
     * 
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }

    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Construct 1.
     * 
     * @param name  String
     * @param id    String
     * @param email String
     */
    Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Construct 2.
     * 
     * @param s String
     */
    Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    /**
     * Get information of a student.
     * 
     * @return String
     */
    String getInfo() {
        String info = "";
        info = name + " - " + id + " - " + group + " - " + email;
        return info;
    }
}