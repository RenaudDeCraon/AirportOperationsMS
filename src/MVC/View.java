package MVC;

import UserPack.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class View {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel label1 = new JLabel("PMSpas");
    JLabel label2 = new JLabel("PMSpla");
    JLabel label3 = new JLabel("FMS");
    JTabbedPane Pages = new JTabbedPane();
    JTabbedPane Pages1 = new JTabbedPane();
    JTabbedPane Airports = new JTabbedPane();
    JButton addUserBut = new JButton("Add User");
    JButton removeUserBut = new JButton("Remove User");
    JButton updateUserBut = new JButton("Update User");
    JLabel pasManagementLabel = new JLabel("Passenger Management");
    JLabel planeManLabel = new JLabel("Plane Management");
    JLabel flightManLabel = new JLabel("Flight Management");
    JLabel allPasLabel = new JLabel("All Passangers");
    DefaultListModel<passanger> passangerlistmodel = new DefaultListModel<>();
    JList<passanger> pasangerTField = new JList(passangerlistmodel);
    JLabel bookTicketLabel = new JLabel("Book Ticket");
    JLabel createUserLabel = new JLabel("Create a new user");
JButton bookFlightBut = new JButton("Book Flight");
DefaultListModel<flight> flightlistmodel = new DefaultListModel<>();
JList<flight> bookFlightTField = new JList<flight>(flightlistmodel);
JButton cancelFlightBut = new JButton("Cancel Flight");
DefaultListModel<passanger> cancelpaslistmodel = new DefaultListModel<>();
JList<passanger> cancelFlightTField = new JList<passanger>(cancelpaslistmodel);
JButton refresh = new JButton("Refresh Lists");
JLabel nameLabel = new JLabel("Name                Surname              is VIP?                        Luggage Count        Year Of Birth ");
JTextField nameTField = new JTextField();
JTextField surnameTField = new JTextField();
JCheckBox isVIPCbox = new JCheckBox();
JTextField luggageCountTField = new JTextField();
JTextField YOBTfield = new JTextField();
JButton addPlaneBut = new JButton("Add Plane");
JTextField addPlaneTF = new JTextField();
JButton removePlaneBut = new JButton("Remove Plane");
JButton addHangarBut = new JButton("Add Hangar");
JButton removeHangarBut = new JButton("Remove Hangar");
JButton addRunwayBut = new JButton("Add Runway");
JButton removeRunwayBut = new JButton("Remove Runway");
JButton reserveHangarBut = new JButton("Reserve Hangar");
JButton resetHangarBut = new JButton("Reset Hangar");
JButton reserveRunwayBut = new JButton("Reserve Runway");
JButton resetRunwayBut = new JButton("Reset Runway");
DefaultListModel<Hangar> hangarDefaultListModel = new DefaultListModel();
JTextField  airportTF1 = new JTextField();
JTextField airportTF2 = new JTextField();
JList<Hangar> airportTF3 = new JList<Hangar>(hangarDefaultListModel);
DefaultListModel<plane> planeListModel = new DefaultListModel<>();
DefaultListModel<runway> runwayDefaultListModel = new DefaultListModel<runway>();
JList<runway> airportTF4 = new JList<runway>(runwayDefaultListModel);
JList<plane> planesLS = new JList(planeListModel);
   JTextField departureTF = new JTextField();
   JTextField landingTF = new JTextField();
   JTextField departuredateTF = new JTextField();
   JTextField returndateTF = new JTextField();
   JList currentFlightsList = new JList(flightlistmodel) ;
   JLabel currentflightLabel = new JLabel("Current Flights");
   JList manageTicketsList = new JList(cancelpaslistmodel);
   JLabel passangerIDlabel = new JLabel("Passanger ID");
   TextField passangerIDTF = new TextField();
   JButton butTicketsBut = new JButton("Buy Ticket");
   JButton cancelTicketsBut = new JButton("Cancel Ticket");
   JLabel manageTicketsBut = new JLabel("Manage Tickets");
    JButton addFlightBut = new JButton("Add Flight");
    JButton removeFlightBut = new JButton("Remove Flight");
    JSpinner comboBox = new JSpinner();
JScrollPane scrollPane = new JScrollPane(manageTicketsList);





    View() {
        frame.setSize(1600, 800);
        panel.setSize(1600, 800);
        panel.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel.add(label1);
        panel1.add(label2);
        panel2.add(label3);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);



        Pages.addTab("Passenger Management System ", panel);
        Pages.addTab("Plane Management System ", panel1);
        Pages.addTab("Flight Management System ", panel2);
        Airports.addTab("Sabiha Gökçen", Pages);
        Airports.addTab("Atatürk Havalimanı",Pages1);
        addUserBut.setBounds(750, 400, 700, 70);
        removeUserBut.setBounds(750, 470, 700, 70);
        updateUserBut.setBounds(750, 540, 700, 70);
        pasManagementLabel.setBounds(100, 0, 180, 30);
        planeManLabel.setBounds(100,0,180,30);
        flightManLabel.setBounds(100,0,180,30);
        allPasLabel.setBounds(100,50,180,30);
        pasangerTField.setBounds(100,80,500,300);
        bookTicketLabel.setBounds(100,350,180,30);
        bookFlightBut.setBounds(100,400,250,50);
        bookFlightTField.setBounds(100,450 , 250,350);
        cancelFlightBut.setBounds(350,400,250,50);
        cancelFlightBut.getDisabledSelectedIcon();
        cancelFlightTField.setBounds(360,450,250,350);
        createUserLabel.setBounds(750,50,180,30);
        nameLabel.setBounds(750,150,800,30);
        nameTField.setBounds(750,180,100,30);
        surnameTField.setBounds(850,180,100,30);
isVIPCbox.setBounds(950,180,30,20);
luggageCountTField.setBounds(1090,180,120,30);
YOBTfield.setBounds(1220,180,120,30);
refresh.setBounds(750,620,150,50);
addPlaneBut.setBounds(400,400,100,30);
addPlaneTF.setBounds(300,400,100,30);
removePlaneBut.setBounds(900,400,200,30);
planesLS.setBounds(20,30,1300,300);
addHangarBut.setBounds(700,450,300,50);
removeHangarBut.setBounds(1000,450,350,50);
addRunwayBut.setBounds(700,500,300,50);
removeRunwayBut.setBounds(1000,500,350,50);
reserveHangarBut.setBounds(700,550,300,50);
resetHangarBut.setBounds(1000,550,350,50);
reserveRunwayBut.setBounds(700,600,300,50);
resetRunwayBut.setBounds(1000,600,350,50);
airportTF1.setBounds(200,450,500,50);
airportTF2.setBounds(200,500,500,50);
airportTF3.setBounds(200,550,250,100);
airportTF4.setBounds(450,550,250,100);

        panel.add(addUserBut);
        panel.add(removeUserBut);
        panel.add(updateUserBut);
        panel.add(pasManagementLabel);
        panel.add(allPasLabel);
        panel.add(pasangerTField);
        panel.add(bookTicketLabel);
        panel.add(bookFlightBut);
        panel.add(cancelFlightBut);
        panel.add(bookFlightTField);
        panel.add(cancelFlightTField);
        panel.add(createUserLabel);
        panel.add(nameLabel);
        panel.add(nameTField);
        panel.add(surnameTField);
        panel.add(isVIPCbox);
        panel.add(luggageCountTField);
        panel.add(YOBTfield);
        panel.add(refresh);





        panel1.add(planeManLabel);
        panel1.add(addPlaneBut);
        panel1.add(addPlaneTF);
        panel1.add(planesLS);
        panel1.add(removePlaneBut);
        panel1.add(addHangarBut);
        panel1.add(removeHangarBut);
        panel1.add(addRunwayBut);
        panel1.add(removeRunwayBut);
        panel1.add(reserveHangarBut);
        panel1.add(resetHangarBut);
        panel1.add(reserveRunwayBut);
        panel1.add(resetRunwayBut);
        panel1.add(airportTF1);
        panel1.add(airportTF2);
        panel1.add(airportTF3);
        panel1.add(airportTF4);


       departureTF = new JTextField();
       departureTF.setBounds(126, 282, 130, 26);
       panel2.add(departureTF);
       departureTF.setColumns(10);

       landingTF = new JTextField();
       landingTF.setBounds(269, 282, 130, 26);
       panel2.add(landingTF);
       landingTF.setColumns(10);

       departuredateTF = new JTextField();
       departuredateTF.setBounds(411, 282, 130, 26);
       panel2.add(departuredateTF);
       departuredateTF.setColumns(10);

       returndateTF = new JTextField();
       returndateTF.setBounds(553, 282, 130, 26);
       panel2.add(returndateTF);
       returndateTF.setColumns(10);


       comboBox.setBounds(695, 283, 99, 27);
       panel2.add(comboBox);


       addFlightBut.setBounds(126, 320, 349, 29);
       panel2.add(addFlightBut);


       removeFlightBut.setBounds(475, 320, 319, 29);
       panel2.add(removeFlightBut);

       JLabel departureLabel = new JLabel("Departure");
       departureLabel.setBounds(126, 254, 104, 16);
       panel2.add(departureLabel);

       JLabel landingLabel = new JLabel("Landing");
       landingLabel.setBounds(269, 254, 61, 16);
       panel2.add(landingLabel);

       JLabel departureDateLabel = new JLabel("Departure Date");
       departureDateLabel.setBounds(411, 254, 135, 16);
       panel2.add(departureDateLabel);

       JLabel returnDateLabel = new JLabel("Return Date ");
       returnDateLabel.setBounds(553, 254, 130, 16);
       panel2.add(returnDateLabel);

       JLabel capacityLabel = new JLabel("Capacity");
       capacityLabel.setBounds(695, 254, 61, 16);
       panel2.add(capacityLabel);
       currentFlightsList.setBounds(819, 216, 252, 227);

       panel2.add(currentFlightsList);
       currentflightLabel.setBounds(819, 188, 180, 16);

       panel2.add(currentflightLabel);
       manageTicketsList.setBounds(1121, 68, 331, 180);



       panel2.add(manageTicketsList);
       passangerIDlabel.setBounds(1121, 287, 162, 16);

       panel2.add(passangerIDlabel);


       passangerIDTF.setBounds(1120, 320, 163, 123);
       panel2.add(passangerIDTF);
       passangerIDTF.setColumns(10);


       butTicketsBut.setBounds(1286, 320, 166, 49);
       panel2.add(butTicketsBut);


       cancelTicketsBut.setBounds(1286, 381, 166, 49);
       panel2.add(cancelTicketsBut);


       manageTicketsBut.setBounds(1118, 40, 186, 16);
       panel2.add(manageTicketsBut);







        panel2.add(flightManLabel);
        frame.add(Airports);

        frame.setVisible(true);
    }
    public void displayPassengersList(ArrayList<passanger> passengers) {
        passangerlistmodel.removeAllElements();
        for (int i = 0; i < passengers.size(); i++) {
            passangerlistmodel.addElement(passengers.get(i));
        }

    }
    public void displayFlightList(ArrayList<flight> flight) {
        flightlistmodel.removeAllElements();
        for (int i = 0; i < flight.size(); i++) {
            flightlistmodel.addElement(flight.get(i));
        }

    }
    public void displayPasPlaneList(ArrayList<passanger> passangers) {
        cancelpaslistmodel.removeAllElements();
        for (int i = 0; i < passangers.size(); i++) {
            cancelpaslistmodel.addElement(passangers.get(i));
        }

    }
    public void displaymanageList(ArrayList<passanger> passangers) {
        cancelpaslistmodel.removeAllElements();
        for (int i = 0; i < passangers.size(); i++) {
            cancelpaslistmodel.addElement(passangers.get(i));
        }

    }
    public void displayPlaneList(ArrayList<plane> planes){
        planeListModel.removeAllElements();
        for (int i = 0; i<planes.size();i++){
            planeListModel.addElement(planes.get(i));
        }
    }
    public void displayHangarList(ArrayList<Hangar> hangar){
hangarDefaultListModel.removeAllElements();
for(int i = 0 ; i<hangar.size();i++){
    hangarDefaultListModel.addElement(hangar.get(i));
}
    }
    public void displayRunwayList(ArrayList<runway> runways){
        runwayDefaultListModel.removeAllElements();
        for (int i = 0 ; i< runways.size();i++){
            runwayDefaultListModel.addElement(runways.get(i));
        }

    }
}

