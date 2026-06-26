void main() {

    Student a = new Student();
    a.setName("Mariia");

    a.setAge(18);

    Group SHI11 = new Group();
    SHI11.addStudent(a);

    System.out.println(a.getAge());

}
