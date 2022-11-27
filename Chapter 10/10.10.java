//q1
public String max(String a, String b)
{
return a.compareTo(b) > 0 ? a : b;
}
[5:35 PM]
//q2
--------------------------------------------------
[5:35 PM]
public String min (String aString, String bString, String cString)
{
if (aString.compareTo(bString) < 0 && aString.compareTo(cString) < 0)
{
return aString;
}
else if (bString.compareTo(cString) < 0 && bString.compareTo(aString) < 0)
{
return bString;
}
else
{
return cString;
}
}
[5:35 PM]
//q3
--------------------------------------------------
[5:36 PM]
public static boolean isEmailAddress (String aString)
{
if (aString.indexOf("@") != -1)
{
if (aString.indexOf("@") == aString.lastIndexOf("@"))
{
if (aString.indexOf(" ") == -1)
{
if (aString.indexOf("\n") == -1)
{
if (aString.indexOf("\t") == -1)
{
return true;
}
}
}
}
}
return false;
}
