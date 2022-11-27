//Q1
Comparable temp;
temp = x[k];
x[k] = x[j];
x[j] = temp;
happy ending
-------------------------
//Q2
public static boolean isSorted(Comparable[] x, boolean y) {
boolean isAscending = true;
if (x.length == 0 || x.length == 1) return true;
else if (y) {
for (int i = 0; isAscending && i < x.length - 1; i++)
if (x[i].compareTo(x[i + 1]) > 0) isAscending = false; // descending
} else {
for (int i = 0; isAscending && i < x.length - 1; i++)
if (x[i].compareTo(x[i + 1]) < 0) isAscending = false; // ascending
}
return isAscending;
}
-------------------------
//Q3
java.util.Arrays.sort(x);
if (x.length % 2 == 0) {
if (x[x.length / 2].compareTo(x[x.length / 2 - 1]) > 0) {
m = x[x.length / 2];
} else {
m = x[x.length / 2 - 1];
}
} else {
m = x[x.length / 2];
}
