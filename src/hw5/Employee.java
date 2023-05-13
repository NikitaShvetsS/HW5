package hw5;

public class Employee {

    private static String fullName;
    private static String position;
    private static String email;
    private static String phone;
    private static int age;

    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email =email;
        this.phone = phone;
        this.age = age;
    }

    public static String getFullName() {
        return fullName;
    }

    public static void setFullName(String fullName) {
        Employee.fullName = fullName;
    }

    public static String getPosition() {
        return position;
    }

    public static void setPosition(String position) {
        Employee.position = position;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Employee.email = email;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Employee.phone = phone;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Employee.age = age;
    }
}
