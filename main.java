package tugas;

public class main {
  

    public static void main(String[] args) {
        main main = new main();
       

        System.out.println("\n****** student *******\n");
        student student1 = new student("miftah","20210040044","Teknik Informatika", 3.90);
        student1.display();
        student student2 = new student("rizal","20210040049","Teknik Informatika", 3.50);
        student2.display();
        student student3 = new student("irfan","20210040033","Teknik Informatika", 3.68);
        student3.display();

        System.out.println("\n******** teacher ********\n");
        teacher teacher1 = new teacher("galih","21094239","Rekayasa Perangkat Lunak");
        teacher1.display();
        teacher teacher2 = new teacher("ali","21094239","Organisasi Komputer");
        teacher2.display();
        teacher teacher3 = new teacher("adam","21094239","Basis Data");
        teacher3.display();



}
}