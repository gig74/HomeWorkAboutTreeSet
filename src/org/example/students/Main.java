package org.example.students;

public class Main {
    public static void main(String[] args) {
        ResultsBoard resultsBoard = new ResultsBoard();
        resultsBoard.addStudent("Игорь", 5.5f);
        resultsBoard.addStudent("Николай", 2.5f);
        resultsBoard.addStudent("Иван", 2.5f);
        resultsBoard.addStudent("Артём", 4.0f);
        resultsBoard.addStudent("Георгий", 3.6f);
//        System.out.println(resultsBoard.getAll()); // Для выдачи всей коллекции
        System.out.println(resultsBoard.top3());
//        System.out.println(resultsBoard.top3());
        System.out.println("---------------------"); // -> [Maria, Ivan]
        ResultsBoard rb = new ResultsBoard();
        rb.addStudent("Ivan", 3.0f);
        rb.addStudent("Maria", 4.0f);
        System.out.println(rb.top3()); // -> [Maria, Ivan]
        rb.addStudent("Vlad", 5.0f);
        System.out.println(rb.top3()); // -> [Vlad, Maria, Ivan]
        rb.addStudent("Anton", 4.5f);
        System.out.println(rb.top3()); // -> [Vlad, Anton, Maria]
        rb.addStudent("Daria", 1.5f);
        System.out.println(rb.top3()); // -> [Vlad, Anton, Maria]
        rb.addStudent("Vasiliy", 5.0f);
        //System.out.println(rb.getAll()); // -> [Vlad, Vasiliy, Anton] или [Vasiliy, Vlad, Anton]
        System.out.println(rb.top3()); // -> [Vlad, Vasiliy, Anton] или [Vasiliy, Vlad, Anton]
    }
}
