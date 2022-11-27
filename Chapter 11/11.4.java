//Q1
public String getColorName() {
String name = super.getColorName();
if (name == null) name = "color";
if (alpha < 100)
return "opaque " + name;
else if (alpha < 200)
return "semi-transparent " + name;
return "transparent " + name;
}
--------------------------------------------------
  
//Q2
public int getAvailable() {return super.getAvailable() + (overdraftLimit - overdraftAmount);}
--------------------------------------------------
  
//Q3
public int getRequiredEmptySpace() {
return super.getRequiredEmptySpace() + totalUnits * maxOccupantsPerUnit;
}
--------------------------------------------------
  
//Q4
public int getClientAreaHeight() {return super.getClientAreaHeight() - 2 * borderSize;}
--------------------------------------------------
  
//Q5
public class ICalculator3 extends ICalculator {
public int div(int x) {
if (x!=0) return super.div(x);
System.out.println("ZERO DIVIDE ATTEMPTED");
return getCurrentValue();
}
}
--------------------------------------------------
  
//Q6
public void clear() {
super.clear();
album.clear();
}
--------------------------------------------------
//Q7
public class LawSchool extends EducationalInstitution {

public LawSchool(){
super(3);
}

public String graduationRequirements(){
return super.graduationRequirements() + " and passing the bar";
}

}
--------------------------------------------------
  
//Q8

--------------------------------------------------
   
