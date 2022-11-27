//Q1
public Clock()
{

hours = 12;

}

//Q2
public Clock ( int hours, boolean isTicking, int diff) {
this.hours = hours; this.isTicking = isTicking; this.diff = diff;
}


//Q3
Clock(Clock c) {
hours = c.hours;
isTicking = c.isTicking;
}
