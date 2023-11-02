package controller;

import controller.FileSearchController;
import model.FileSearchModel;
import view.View;

public class Main {
    public static void main(String[] args) {
        FileSearchModel model = new FileSearchModel();
        View view = new View();
        FileSearchController controller = new FileSearchController(model, view);

        int choice;
        do {
            choice = view.showMenuAndGetChoice();
            switch (choice) {
                case 1:
                    controller.countWordInFile();
                    break;
                case 2:
                    controller.findFileByWord();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}

