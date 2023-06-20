package com.company;

public class Main {
    public static void main(String[] args) {
        //System.out.println("\\");
        //File file = new File("/Library");
        //file.list();
        //for (int i = 0; i < file.list().length; i++) {
          //  System.out.println(file.list()[i]);
        //}

        View view = new View();
        Controller controller = new Controller();
        view.setController(controller);
        controller.setView(view);

        controller.start();
    }
}

// MVC without M app with 1 JFrame, navigate through system files
// by selecting and opening folders, include back button, open button