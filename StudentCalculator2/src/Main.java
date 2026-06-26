void main() {

    Student a = new Student();
    a.setName("Mariia");


    Group SHI11 = new Group();
    SHI11.addStudent(a);

    a.id = "1234";

    System.out.println(a.id);

}
