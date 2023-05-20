package MVC;

import UserPack.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    ArrayList<passanger> PasList = new ArrayList<passanger>();
    ArrayList<flight> flightList = new ArrayList<flight>();
    ArrayList<plane> planelist = new ArrayList<plane>();
    ArrayList<Hangar> hangars = new ArrayList<Hangar>();
    ArrayList<runway> runwayList = new ArrayList<runway>();




    public Model() throws FileNotFoundException {
        while(input.hasNext()){
            PasList.add(new passanger(input.next(),input.next(), input.next(), input.next(),input.next()));
        }while(input1.hasNext()){
            flightList.add(new flight(input1.next(),input1.next(),input1.next(),input1.next(),input1.nextInt()));

        }
        while(input2.hasNext()){
            planelist.add((new plane(input2.next(),input2.next())));
        }
        while (input3.hasNext()){
            hangars.add(new Hangar(input3.next()));
            input3.nextLine();
        }
        while (input4.hasNext()){
            runwayList.add(new runway(input4.next()));
            input4.nextLine();

        }
    }
    File f = new File("/Users/umutmurat/Documents/database.txt");
    File f1 = new File("/Users/umutmurat/Documents/flights.txt");
    File f2 = new File("/Users/umutmurat/Documents/planes.txt");
    File f3 = new File("/Users/umutmurat/Documents/hangars.txt");
    File f4 = new File("/Users/umutmurat/Documents/runway.txt");
private PrintStream ps;
Scanner input = new Scanner(f);
Scanner input1 = new Scanner(f1);
Scanner input2 = new Scanner(f2);
Scanner input3 = new Scanner(f3);
Scanner input4 = new Scanner(f4);


    public void printList(ArrayList<passanger> print){
        for(int i = 0; i < print.size(); i++) {
          System.out.println(print.get(i).toString());
        }
    }
    public String ObjToStr(ArrayList<passanger> Alist){
       String result = "";
        for(int i = 0 ; i<Alist.size();i++){
          result = result + "\n" + Alist.get(i).toString() + "\n";

        }
return result;
    }


public void writeToDatabasePasList(){
    PrintStream ps = null;
    try {
        ps = new PrintStream(f);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    for(int i = 0 ; i< PasList.size();i++){
            ps.println(PasList.get(i).toString());
        }
}
public void writeToDatabaseFlightList(){
    PrintStream ps = null;
    try {
        ps = new PrintStream(f1);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    for(int i = 0 ; i< flightList.size();i++){
        ps.println(flightList.get(i).toString());
    }
}
public void writeToDatabasePlane(){
        PrintStream ps = null;
    try {
        ps = new PrintStream(f2);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    for (int i = 0 ; i<planelist.size();i++){
        ps.println(planelist.get(i).toString());
    }


}
public void writeToDatabaseHangar(){
        PrintStream ps = null;
    try {
        ps = new PrintStream(f3);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    for(int i = 0 ; i<hangars.size();i++){
        ps.println(hangars.get(i).toString());
    }

}
public void writeToDatabaseRunways(){
        PrintStream ps = null;
    try {
        ps = new PrintStream(f4);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    for (int i = 0 ; i<runwayList.size();i++){
        ps.println(runwayList.get(i));
    }

}

}
