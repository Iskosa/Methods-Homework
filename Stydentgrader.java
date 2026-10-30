public class Stydentgrader {
    public static void main(String[] args) {
        System.out.println(StudentGrade(100));
    }
    public static String StudentGrade(int n){
        if (n<0){
            return "Invalid score";
        }
        else if (n>100){
            return "Invalid score";
        }
        else if (n>=90){
            return "A";
        }
        else if(n>=80){
            return "B";
        }
        else if (n>=70){
            return "C";
        }
        else if (n>=60){
            return "D";
        }
        else {
            return "F";
        }

    }
}
