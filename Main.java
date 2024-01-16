import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lesson[] lessonsArray = new Lesson[2];
        for (int i = 0; i < 2; i++) {
            lessonsArray[i] = new Lesson();
            lessonsArray[i].input();
            lessonsArray[i].print();
        }
        lessonsArray[0].setPaymentStatus(2);
        lessonsArray[0].print();

        Client[] clientsArray = new Client[2];
        clientsArray[0] = new Client();
        clientsArray[0].input();
        clientsArray[0].print();
        clientsArray[0].setTotalLess(25);
        clientsArray[0].print();
        clientsArray[1] = new Client();
        clientsArray[1].print();
    }
}