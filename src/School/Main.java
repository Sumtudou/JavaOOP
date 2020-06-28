package School;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student("张三",12,6,"421083");
        String result = stu.toString();
        System.out.println(result);
    }
}
