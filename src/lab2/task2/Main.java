package lab2.task2;

public class Main {
    public static void main (String[] args) {
        Student student1 = new Student (42, "Decebal", "Popescu");
        /*
            noi dorim sa facem o copie a obiectului student1, numita student2
            apoi sa modificam copia respectiva
        /
        Student student2 = student1;

        student2.setName("Cezar");
        student2.setSurname("Ghiu");

        // Sunt la mare, prima modificare

        /
            trebuie sa afiseze
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        /
        student1.show();
        /
            trebuie sa afiseze
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();
    }
}
