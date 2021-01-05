public String delDel(String str) {
  boolean strBool;
  if (str.indexOf("del")==1) {
    strBool = true;
  }
  else strBool = false;
  if (strBool) {
  return str.replaceFirst("del", "");
  }
  return str;
}