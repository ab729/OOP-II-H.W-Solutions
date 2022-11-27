//q1
[6:31 PM]
public abstract void onClicked();
[6:32 PM]
--------------------------------------------------
//q2
[6:32 PM]
public abstract class Account {
private static int nextId = 10001;
private int id;
private String name;
public Account(String a) {
name = a;
id = nextId++;
}
public int getId() { return id; }
public String getName() { return name; }
public abstract Cash getValue();
}
[6:33 PM]
--------------------------------------------------
//q3
[6:33 PM]
public abstract class Vehicle {
private double maxSpeed;
protected double currentSpeed;

public Vehicle(double a) { maxSpeed = a; }

public abstract void accelerate();

public double getCurrentSpeed() { return currentSpeed; }
public double getMaxSpeed() { return maxSpeed; }
public void pedalToTheMetal() { while(currentSpeed < maxSpeed) accelerate(); }
}
[6:33 PM]
--------------------------------------------------
//q4
[6:33 PM]
public class ApartmentHouse extends RentableDwelling {
public ApartmentHouse(double rentPerUnit, int numberOfApartments) {
super(rentPerUnit);
this.numberOfApartments = numberOfApartments;
}
public double getRentalIncome() {
return getRentPerUnit() * numberOfApartments;
}
private int numberOfApartments;
}
[6:34 PM]
--------------------------------------------------
//q5

[6:34 PM]
public abstract class Phone {
private String phoneNumber;
public Phone(String a) {phoneNumber=a;}
public String getPhoneNumber() {return phoneNumber;}
public String toString() { return "#(" + phoneNumber + ")"; }
public abstract boolean createConnection(Network a);
public abstract void closeConnection();
}
[6:35 PM]
--------------------------------------------------
//q6
[6:35 PM]
public abstract class DesktopComponent {
public abstract void onClicked();
private String type;
public DesktopComponent(String a) {
type = a;
}
}
