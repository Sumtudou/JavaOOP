package School;

public class Student {

    private String name;
    private Integer age;
    private Integer gender;
    private String idNo;

    Student(String name, Integer age, Integer gender, String idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", idNo='" + idNo + '\'' +
                '}';
    }
}
//names, age, gender and ID NO