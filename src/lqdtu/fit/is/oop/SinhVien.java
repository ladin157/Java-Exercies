package lqdtu.fit.is.oop;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public SinhVien() {
        this.id = 0;
        this.name = "";
        this.age = 18;
        this.address = "";
        this.gpa = 0;
    }

    public SinhVien(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public SinhVien(SinhVien sv) {
        this.id = sv.id;
        this.name = sv.name;
        this.age = sv.age;
        this.address = sv.address;
        this.gpa = sv.gpa;
    }

    @Override
    public String toString() {
        return "Id\t|Name\t|Age\t|Address\t|Gpa\n" + this.id + "\t|" + this.name + "\t|" + this.age + "\t|" + this.address + "\t|" + this.gpa;
    }

//    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        System.out.println(sv.toString());
//    }
}
