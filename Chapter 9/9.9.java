//q1
[9:35 PM]
public class Clock { private int hours; }
[9:35 PM]
-----------------------------------------------------
//q2
[9:35 PM]
public class Clock
{
private int hours;
private boolean isTicking;

}
[9:35 PM]
//q3
-----------------------------------------------------
[9:35 PM]
public class WeatherForecast{
private String skies = "";
private int high = 0;
private int low = 0;
public void setSkies(String theSkies){
skies = theSkies;
}

public void setHigh(int theHigh){
high = theHigh;
}

public void setLow(int theLow){
low = theLow;
}

public String getSkies(){
return skies;
}

public int getHigh(){
return high;
}

public int getLow(){
return low;
}
}
[9:35 PM]
-----------------------------------------------------
//q4
[9:35 PM]
public class Player{
private String name = "";
private int score = 0;
public void setName(String nm){
name = nm;
}

public void setScore(int sc){
score = sc;
}

public String getName(){
return name;
}

public int getScore(){
return score;
}
}
[9:35 PM]
//q5
-----------------------------------------------------
[9:36 PM]
public class ContestResult{
private String winner = "";
private String secondPlace = "";
private String thirdPlace = "";
public void setWinner(String win){
winner = win;
}

public void setSecondPlace(String second){
secondPlace = second;
}

public void setThirdPlace(String third){
thirdPlace = third;
}

public String getWinner(){
return winner;
}

public String getSecondPlace(){
return secondPlace;
}

public String getThirdPlace(){
return thirdPlace;
}
}
[9:36 PM]
//a6
-----------------------------------------------------
[9:36 PM]
public class Telephone {
public static void printNumber(String s) {
System.out.print(s);
}
}
[9:36 PM]
//q7
-----------------------------------------------------
[9:36 PM]
public class Telephone {
public static String getFullNumber(String a) {
return ("718-" + a);
}
}
[9:36 PM]
//q8
-----------------------------------------------------
[9:36 PM]
public class Telephone {

private String number;
private static int quantity;
private static double total;

public static String makeFullNumber(String a, int b) {
return (b + "-" + a);
}
}
[9:36 PM]
//q9
-----------------------------------------------------
[9:36 PM]
public class ParkingMeter {
private int timeLeft = 0;

public boolean add(int i) {
timeLeft = i == 25 ? timeLeft + 30 : timeLeft;
return i == 25 ? true : false;
}
public void tick() { timeLeft--; }
public boolean isExpired() { return timeLeft == 0 ? true : false; }
}
[9:37 PM]
//q10
-----------------------------------------------------
[9:37 PM]
public class PlayListEntry {
private String title = "";
private String artist = "";
private int playCount = 0;

public void setTitle(String t) {
title = t;
}
public void setArtist(String a) {
artist = a;
}
public void setPlayCount(int t) {
playCount = t;
}

public String getTitle() {
return title;
}
public String getArtist() {
return artist;
}
public int getPlayCount() {
return playCount;
}
}
[9:37 PM]
//q11
-----------------------------------------------------
[9:37 PM]
public class Acc2 {
private int sum = 0;
public int getSum() { return sum; }
}
[9:37 PM]
//q12
-----------------------------------------------------
[9:37 PM]
public class Counter{
   private int counter = 0;
 
   public void increment(){
      counter++;
   }
 
   public int getValue(){
      return counter;
   }
}
[9:37 PM]
13
[9:38 PM]
public class Accumulator{
private int sum = 0;
public int getSum(){
return sum;
}

public void add(int number){
sum += number;
}
}
[9:38 PM]
//q14
-----------------------------------------------------
[9:38 PM]
public class Averager{

private int sum = 0;

private int count = 0;

public int getSum(){ return sum;}

public void add(int in)

{ sum = sum + in; count ++;}

public int getCount(){return count;}

public double getAverage(){

return (double)sum/count;

}
}
[9:38 PM]
//q15
-----------------------------------------------------
[9:39 PM]
public class GasTank {
private double amount = 0;

public void addGas(double i) { amount+=i; }
public void useGas(double i) { amount-=i; }
public double getGasLevel() { return amount; }
}
[9:39 PM]
//q16
-----------------------------------------------------
[9:39 PM]
public class GasTank {
private double amount = 0;

public void addGas(double i) { amount+=i; }
public void useGas(double i) { amount = (amount < 0) ? 0 : amount-i; }

public boolean isEmpty() { return (amount < 0.1) ? true : false; }
public double getGasLevel() { return amount; }
}
[9:39 PM]
//q17
-----------------------------------------------------
[9:39 PM]
public class Clock {
private int hours = 0;
private boolean isTicking;
private Integer diff;

public Clock(int i, boolean b, int j) {
hours = i;
isTicking = b;
diff = new Integer(j);
}
}
[9:39 PM]
//q18
-----------------------------------------------------
[9:40 PM]
public class Value {
private boolean modified = false;
private int val;

public Value(int i) { val = i; }

public int getVal() { return val; }
public void setVal(int i) { val = i; modified = true; }
public boolean wasModified() { return modified; }
}
[9:40 PM]
//q19
-----------------------------------------------------
[9:40 PM]
public class Value {
private boolean modified = false;
private int val;

public Value(int i) { val = i; }
public Value() {}

public int getVal() { return val; }
public void setVal(int i) { val = i; modified = true; }
public boolean wasModified() { return modified; }
}
[9:40 PM]
//q20
-----------------------------------------------------
[9:40 PM]
public class Counter {
private int counter = 0;
private int limit = 0;

public Counter(int i, int j) {
counter = i; limit = j;
}

public void increment() { counter = counter < limit ? counter+=1 : counter; }
public void decrement() { counter = counter > 0 ? counter-=1 : counter; }
public int getValue() { return counter; }
}
[9:40 PM]
//q21
-----------------------------------------------------
[9:40 PM]
public class Counter {
private int counter = 0;

public Counter(int i) {
counter = i;
}

public void increment() { counter++; }
public void decrement() { counter--; }
public int getValue() { return counter; }
}
[9:40 PM]
//q22
-----------------------------------------------------
[9:40 PM]
public class Accumulator {
private int sum = 0;

public Accumulator(int i) {
sum = i;
}

public int getSum() { return sum; }
public void add(int i) { sum+=i; }
}
[9:40 PM]
//q23
-----------------------------------------------------
[9:40 PM]
public class GasTank {
private double amount;
private double capacity;
public GasTank(double capacity) {this.capacity = capacity;}
public void addGas(double a) {this.amount += a; if (this.amount>capacity) this.amount = capacity;}
public void useGas(double a) {this.amount -= a; if (this.amount<0.0) this.amount=0.0;}
public boolean isEmpty() {return amount<0.1;}
public boolean isFull() {return amount>capacity-0.1;}
public double fillUp() {double x=capacity-amount; amount = capacity; return x;}
public double getGasLevel() {return amount;}
}
[9:41 PM]
//q24
-----------------------------------------------------
[9:41 PM]
public class GasTank {
private double amount;
private double capacity;
public GasTank(double capacity) {this.capacity = capacity;}
public void addGas(double a) {this.amount += a; if (this.amount>capacity) this.amount = capacity;}
public void useGas(double a) {this.amount -= a; if (amount<0.0) amount=0.0;}
public boolean isEmpty() {return amount<0.1;}
public boolean isFull() {return amount>capacity-0.1;}
public double getGasLevel() {return amount;}
}
[9:41 PM]
//q25
-----------------------------------------------------
[9:41 PM]
public class Book {
private String title, author;

public Book(String a, String b) {
title = a; author = b;
}

public String toString() { return title + "\n" + author; }
}
[9:41 PM]
//q26
-----------------------------------------------------
[9:41 PM]
public class Book {
private String title, author, tableOfContents = "";
private int nextPage = 1;

public Book(String a, String b) {
title = a; author = b;
}

public void addChapter(String title, int pages) { tableOfContents += "\n" + title + "..." + nextPage; nextPage += pages; }
public int getPages() { return nextPage-1; }
public String getTableOfContents() { return tableOfContents; }
public String toString() { return title + "\n" + author; }
}
[9:41 PM]
//q27
-----------------------------------------------------
[9:41 PM]
public class ParkingMeter {
private int maxTime, timeLeft = 0;

public ParkingMeter(int i) {
maxTime = i;
}

public boolean add(int i) { timeLeft = (30 + timeLeft) > maxTime ? timeLeft : i == 25 ? timeLeft + 30 : timeLeft; return (30 + timeLeft < maxTime) && i == 25 ? true : false; }

public void tick() { timeLeft = timeLeft > 0 ? timeLeft-1 : timeLeft; }
public boolean isExpired(){ return timeLeft == 0 ? true : false; }
}
[9:41 PM]
//q28
-----------------------------------------------------
[9:41 PM]
public class Telephone {
private String number;

private static int quantity = 250;
private static double total = 1565.92;
}
[9:41 PM]
//q29
-----------------------------------------------------
[9:41 PM]
public class Telephone {
private String number;

private static int quantity;
}
[9:42 PM]
//q30
-----------------------------------------------------
[9:42 PM]
public class Counter {
private int counter = 0,
limit = 0;
private static int nCounters=0;

public Counter(int c, int l) {
counter = c;
limit = l;
nCounters++;
}

public void increment() {
if (counter < limit)
counter++;
}

public void decrement() {
if (counter > 0)
counter--;
}

public int getValue() {return counter;}

public static int getNCounters() { return nCounters; }
}
NEW
[9:42 PM]
q31
[9:42 PM]
public class Counter {
private int counter = 0,
counterID;
private static int nCounters=0;

public Counter(int c) {
counter = c;
counterID = ++nCounters;
}

public void increment() { counter++; }

public void decrement() { counter--; }

public int getValue() {return counter;}

public int getCounterID() { return counterID; }
}
-----------------------------------------------------
//The end

