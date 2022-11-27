//Q1
public String toString() {
return "#(" + red + "," + green + "," + blue + ")";
}
--------------------------------------------------
//Q2
public String toString() {
return "A " + width + "x" + height + " window at (" + xPos + "," + yPos + ")";
}
--------------------------------------------------
//Q3
public class HighSchoolStudent extends Student {
public HighSchoolStudent(String s) {
super(s);

}

public String toString() {
return "high school " + super.toString();
}
}
--------------------------------------------------
