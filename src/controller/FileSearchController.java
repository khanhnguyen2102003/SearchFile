package controller;

import java.io.File;
import model.FileSearchModel;
import view.View;

public class FileSearchController {
    private FileSearchModel model;
    private View view;

    public FileSearchController(FileSearchModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void countWordInFile() {
        String path = view.getInputPath();
        String word = view.getInputWord();
        int count = model.countWordInFile(path, word);
        view.displayResult(count);
    }

   public void findFileByWord() {
    String path = view.getInputPath();
    String word = view.getInputWord();
    File folder = new File(path);
    File[] listOfFiles = folder.listFiles();

    if (listOfFiles != null) {
        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".txt")) {
                if (model.countWordInFile(file.getAbsolutePath(), word) != 0) {
                    view.displayFileName(file.getName());
                }
            }
        }
    }
}

}

