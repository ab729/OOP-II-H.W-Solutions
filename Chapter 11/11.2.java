//q1
public class ICalculator2 extends ICalculator {
public int negate() {
currentValue = -currentValue;
return currentValue;
}
}
[5:38 PM]
--------------------------------------------------
//q2
public class ICalculator1 extends ICalculator {
public int sign() {
return Integer.signum(getCurrentValue());
}
}
--------------------------------------------------
//q3
TitledWindow tWindow=new TitledWindow("My Title");
System.out.println(tWindow.getWidth() + " " + tWindow.getHeight());
--------------------------------------------------
//q4
public void dissolve() {
setRed(getRed()+1);
setGreen(getGreen()+1);
setBlue(getBlue()+1);
alpha+=1;
}
--------------------------------------------------
//q5
public class CameraPhone extends Phone {
private int imageSize;
private int memorySize;
public CameraPhone(int im, int me) {
imageSize = im;
memorySize = me;
}
public int numPictures() {
return memorySize * 1000 / imageSize;
}
}
--------------------------------------------------
//q6
class FancySquare extends Square{
double getDiagonal(){
return side*Math.sqrt(2);
}
}
--------------------------------------------------
//q7
public class SavingsAccount extends BankAccount {
public SavingsAccount(double interestRate) {
this.interestRate = interestRate;
}
private double interestRate;
}
--------------------------------------------------
//q8
AlphaChannelColor gh = new AlphaChannelColor();
System.out.println(gh.getRed()+ " "+ gh.getGreen()+ " "+gh.getBlue());
--------------------------------------------------
//q9
public class ApartmentBuilding extends Building {
private int numFloors, unitsPerFloor;
private boolean hasElevator, hasCentralAir;
private String managingCompany;
public ApartmentBuilding(int numFloors, int unitsPerFloor, boolean hasElevator, boolean hasCentralAir, String managingCompany) {
this.numFloors = numFloors;
this.unitsPerFloor = unitsPerFloor;
this.hasElevator = hasElevator;
this.hasCentralAir = hasCentralAir;
this.managingCompany = managingCompany;
}

public int getTotalUnits() {
return unitsPerFloor * numFloors;
}

public boolean isLuxuryBuilding() {
if (unitsPerFloor <= 2 && hasElevator && hasCentralAir)
return true;
else
return false;
}
}
--------------------------------------------------
//q10
TitledWindow tWindow= new TitledWindow(50,75,"Rectangular Window");
tWindow.widen();
tWindow.setHeight(tWindow.getWidth());
tWindow.setText("Square Window");
--------------------------------------------------
