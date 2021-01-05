public boolean startHi(String str) {
  String str1 = "hi";
  if (str.length()<2)
  return false;
  if (str1.equals(str.substring(0, 2)))
  return true;
  else
  return false;
}