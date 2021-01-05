public boolean mixStart(String str) {
  boolean strBool;
  String str1 = "ix";
  if (str.length()<3)
  return false;
  String str2 = str.substring(1,3);
  if (str1.equals(str2))
  strBool = true;
  else 
  strBool = false;
  if (strBool)
  return true;
  else 
  return false;
}