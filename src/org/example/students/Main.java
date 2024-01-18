package org.example.students;

public class Main {
    public static void main(String args[]) {
        ResultsBoard resultsBoard = new ResultsBoard();
        resultsBoard.addStudent("Николай", 2.5f);
        resultsBoard.addStudent("Иван", 2.5f);
        resultsBoard.addStudent("Георгий", 3.6f);
        resultsBoard.addStudent("Артём", 4.0f);
        resultsBoard.addStudent("Игорь", 5.5f);
        //System.out.println(resultsBoard.getAll()); // Для выдачи всей коллекции
        System.out.println(resultsBoard.top3());
    }
}
