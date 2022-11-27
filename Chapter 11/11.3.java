//Q1
public ApartmentBuilding(Address address, int squareFootage, int totalUnits) {
super(address, squareFootage);
this.totalUnits = totalUnits;
}
--------------------------------------------------
  
//Q2
public SavingsAccount(String name, int socSecNum, double interestRate){
super(name, socSecNum);
this.interestRate = interestRate;
}
--------------------------------------------------
  
//Q3
public class CheckingAccount extends BankAccount{
private boolean overdraft;
public CheckingAccount(String s, boolean b){
super(s);
overdraft = b;
}

public boolean hasOverdraft(){
return overdraft;
}

public boolean clearCheck(double d){
if(d < getBalance() || overdraft) {
withdraw(d);
return true;
}
else return false;
}

}
--------------------------------------------------
  
//Q4
public MP3Phone(String phoneNumber, int memorySize, boolean playsAAC){
super(phoneNumber, true);
this.memorySize = memorySize;
this.playsAAC = playsAAC;
}
--------------------------------------------------
  
//Q5
public class ReadWrite extends ReadOnly {
private boolean modified;
public ReadWrite(int arg) {
super(arg);
modified = false;
}

public void setVal(int arg) {
val = arg;
modified = true;
}

public boolean isDirty() {
return modified;
}
}
--------------------------------------------------
  
//Q6
TitledWindow(int w, int h, String s, int i) {
super(w, h);
text = s;
if (i > h / 2)
i = h / 2;
titleBarHeight = i;

}
--------------------------------------------------
//Q7
public class AlphaChannelColor extends Color {
private int alpha;
public AlphaChannelColor(int r, int g, int b, int a) {
super(r,g,b);
alpha = a;
}

public int getAlpha(){
return alpha;
}
}    
