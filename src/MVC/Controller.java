package MVC;


import UserPack.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

public class Controller implements ActionListener, ListSelectionListener {
    View view;


    Model model;
    File f = new File("/Users/umutmurat/Documents/database.txt");
    Scanner file;

    {
        try {
            file = new Scanner(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public Controller(View view,Model model) throws IOException {
this.view = view;
this.model = model;

        view.addUserBut.addActionListener(this);
view.removeUserBut.addActionListener(this);
view.updateUserBut.addActionListener(this);
view.isVIPCbox.addActionListener(this);
view.bookFlightBut.addActionListener(this);
view.cancelFlightBut.addActionListener(this);
view.refresh.addActionListener(this);
view.bookFlightTField.addListSelectionListener(this);
view.addFlightBut.addActionListener(this);
view.removeFlightBut.addActionListener(this);
view.butTicketsBut.addActionListener(this);
view.cancelTicketsBut.addActionListener(this);
view.currentFlightsList.addListSelectionListener(this);
view.bookFlightTField.addListSelectionListener(this);
view.addPlaneBut.addActionListener(this);
view.removePlaneBut.addActionListener(this);
view.addHangarBut.addActionListener(this);
view.resetHangarBut.addActionListener(this);
view.addRunwayBut.addActionListener(this);
view.resetRunwayBut.addActionListener(this);
view.reserveHangarBut.addActionListener(this);
view.removeHangarBut.addActionListener(this);
view.reserveRunwayBut.addActionListener(this);
view.removeRunwayBut.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.addUserBut){
            if(view.isVIPCbox.isSelected()){
               model.PasList.add(new passanger(view.nameTField.getText(),view.surnameTField.getText(),view.luggageCountTField.getText(),view.YOBTfield.getText(),"(VIP)"));
               model.writeToDatabasePasList();

            }if(!(view.isVIPCbox.isSelected())) {
                model.PasList.add(new passanger(view.nameTField.getText(), view.surnameTField.getText(), view.luggageCountTField.getText(), view.YOBTfield.getText(), "non-(VIP)"));
                model.writeToDatabasePasList();

            }
            view.displayPassengersList(model.PasList);

        }if (e.getSource()==view.refresh){
            view.displayPassengersList(model.PasList);
            view.displayFlightList(model.flightList);
            view.displayPlaneList(model.planelist);
            view.displayHangarList(model.hangars);
            view.displayRunwayList(model.runwayList);
        }
        if(e.getSource()==view.updateUserBut){
            int a = view.pasangerTField.getSelectedIndex();
            model.PasList.set(a,new passanger(view.nameTField.getText(),view.surnameTField.getText(),view.luggageCountTField.getText(),view.YOBTfield.getText(),view.isVIPCbox.getText()));
            model.writeToDatabasePasList();
            view.displayPassengersList(model.PasList);

        }if(e.getSource()==view.removeUserBut){
            int a = view.pasangerTField.getSelectedIndex();
           model.PasList.remove(a);
           model.writeToDatabasePasList();
           view.displayPassengersList(model.PasList);


        }if(e.getSource()==view.bookFlightBut){
        int a = view.pasangerTField.getSelectedIndex();
        int b = view.bookFlightTField.getSelectedIndex();
        int c =view.cancelFlightTField.getSelectedIndex();
       model.flightList.get(b).getPassengers().set(c,model.PasList.get(a));
        model.PasList.get(a).setDestination(model.flightList.get(b));
view.displayPasPlaneList(model.flightList.get(b).getPassengers());
view.displayFlightList(model.flightList);

        }if(e.getSource()==view.cancelFlightBut){
           int a = view.bookFlightTField.getSelectedIndex();
            int b = view.cancelFlightTField.getSelectedIndex();
model.flightList.get(a).getPassengers().remove(b);
            view.displayPasPlaneList(model.flightList.get(b).getPassengers());

        }if (e.getSource()==view.addFlightBut){
            model.flightList.add(new flight(view.departureTF.getText(),view.landingTF.getText(),view.departuredateTF.getText(),view.returndateTF.getText(),(int)view.comboBox.getNextValue()));
           model.writeToDatabaseFlightList();
            view.displayFlightList(model.flightList);

        }if(e.getSource()==view.removeFlightBut){
            int a = view.currentFlightsList.getSelectedIndex();
            model.flightList.remove(a);
            model.writeToDatabaseFlightList();
            view.displayFlightList(model.flightList);
        }if (e.getSource()==view.butTicketsBut){
            int a = Integer.parseInt(view.passangerIDTF.getText());
            int b = view.currentFlightsList.getSelectedIndex();
            int c = view.manageTicketsList.getSelectedIndex();
            model.flightList.get(b).getPassengers().set(c,model.PasList.get(a));
            view.displayFlightList(model.flightList);
            view.displayPasPlaneList(model.flightList.get(b).getPassengers());
        }if (e.getSource()==view.cancelTicketsBut){
            int a = view.manageTicketsList.getSelectedIndex();
            int b = view.currentFlightsList.getSelectedIndex();
            model.flightList.get(b).getPassengers().remove(a);
            view.displayFlightList(model.flightList);
            view.displayPasPlaneList(model.flightList.get(b).getPassengers());

        }if(e.getSource()==view.addPlaneBut){
String a = view.addPlaneTF.getText();
model.planelist.add(new plane(a,"Available"));
model.writeToDatabasePlane();
view.displayPlaneList(model.planelist);

        }if(e.getSource()==view.removePlaneBut){
            int a = view.planesLS.getSelectedIndex();
            model.planelist.remove(a);
            model.writeToDatabasePlane();
            view.displayPlaneList(model.planelist);
        }
        if(e.getSource()==view.addHangarBut){
            model.hangars.add(new Hangar(view.airportTF1.getText()));
            model.writeToDatabaseHangar();
            view.displayHangarList(model.hangars);
        }
        if (e.getSource()==view.removeHangarBut){
            int a = view.airportTF3.getSelectedIndex();
            model.hangars.remove(a);
            model.writeToDatabaseHangar();
            view.displayHangarList(model.hangars);
        }
        if (e.getSource()==view.addRunwayBut){
        String a = view.airportTF2.getText();
        model.runwayList.add(new runway(a));
        model.writeToDatabaseRunways();
        view.displayRunwayList(model.runwayList);
        }
        if (e.getSource()==view.removeRunwayBut){
        int a = view.airportTF4.getSelectedIndex();
        model.runwayList.remove(a);
        model.writeToDatabaseRunways();
        view.displayRunwayList(model.runwayList);

        }if (e.getSource()==view.reserveHangarBut){
            int a = view.planesLS.getSelectedIndex();
            int b = view.airportTF3.getSelectedIndex();
            model.planelist.get(a).setHangar(model.hangars.get(b));
            model.hangars.get(b).setEmpty("Occupied");
            view.displayHangarList(model.hangars);
        }if (e.getSource()==view.resetHangarBut){
            int a = view.airportTF3.getSelectedIndex();
            model.hangars.get(a).setEmpty("empty");
            view.displayHangarList(model.hangars);
        }if(e.getSource()==view.reserveRunwayBut){
            int a = view.planesLS.getSelectedIndex();
            int b = view.airportTF4.getSelectedIndex();
            model.planelist.get(a).setRunway(model.runwayList.get(b));
            model.runwayList.get(b).setEmpty("Occupied");
            view.displayRunwayList(model.runwayList);
        }if(e.getSource()==view.resetRunwayBut){
            int a = view.airportTF4.getSelectedIndex();
            model.runwayList.get(a).setEmpty("empty");
            view.displayRunwayList(model.runwayList);
        }


    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource()==view.bookFlightTField){
            int selectedIndex = view.bookFlightTField.getSelectedIndex();
            if(selectedIndex != -1){
                view.displayPasPlaneList(model.flightList.get(selectedIndex).getPassengers());

            }
        }
        if (e.getSource()==view.currentFlightsList){
            int selectedIndex = view.currentFlightsList.getSelectedIndex();
            if(selectedIndex != -1){
view.displaymanageList(model.flightList.get(selectedIndex).getPassengers());

            }
        }
    }
}
