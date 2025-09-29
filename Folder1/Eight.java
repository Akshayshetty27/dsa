// Student Information
// Build a Student class with private fields name, rollNo, marks. Provide validation in setters (e.g., marks cannot be negative or > 100).
class Eight
{
    public static class Student 
    {
        private String name;
        private int rollNo;
        private int marks;

        public Student(String name, int rollNo, int marks) {
            this.name = name;
            this.rollNo = rollNo;
            setMarks(marks); 
        }

        public String getName() {
            return name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public int getMarks() {
            return marks;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public void setMarks(int marks) {
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            } else {
                this.marks = marks;
            }
        }
    }
    public static void main(String[] args)
    {
        Student student1 = new Student("Sudeep", 52, 87);
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll No: " + student1.getRollNo());
        System.out.println("Marks: " + student1.getMarks());
        System.out.println(" enter invalid number to check validation ");
        // if tries to set more than 100 mark it should be error 
        student1.setMarks(105); 
        System.out.println("Updated Marks: " + student1.getMarks());
    }
}