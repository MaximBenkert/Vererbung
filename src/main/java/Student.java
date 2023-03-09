import java.util.Objects;

public  class Student {
    protected String name;
    protected String adress;
    protected int identityCardNumber;
    protected String degree;

    public Student() {
    }

    public Student(String name, String adress, int identityCardNumber, String degree) {
        this.name = name;
        this.adress = adress;
        this.identityCardNumber = identityCardNumber;
        this.degree = degree;
    }

    //public abstract String isBachelorStudent (int semesterCount);

    public String studienfach (){
        return "allgemeines Studienfach";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return identityCardNumber == student.identityCardNumber && Objects.equals(name, student.name) && Objects.equals(adress, student.adress) && Objects.equals(degree, student.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress, identityCardNumber, degree);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", degree='" + degree + '\'' +
                '}';
    }
}
