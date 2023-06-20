package com.company;

import java.io.File;

public class Controller {
    private View view;
    private File file;

    public void start() {
        view.create();
        file = new File("/Library");
        setListData();
    }

    public void setView(View view) {
        this.view = view;
    }

    public void handleBackButtonClick() {
        if (file.getParentFile() == null) {
            return;
        }
        file = file.getParentFile();
        setListData();
    }

    public void handleOpenButtonClick() {
        String selectedPath = view.getNextPath();
        if (selectedPath == null) {
            return;
        }
        File selectedFile = new File(file, selectedPath);
        if (selectedFile.isDirectory()) {
            file = selectedFile;
            setListData();
        }
    }

    public void setListData() {
        view.setListData(file.list());
        view.setLabelText(file.getPath());
        view.enableBackButton(file.getParentFile() != null);
    }
}
