package MVC;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       Model model = new Model();
        View view = new View();
        Controller control = new Controller(view,model);



    }
    }



