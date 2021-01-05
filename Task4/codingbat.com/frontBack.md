public String frontBack(String str) {
  if (str.length()>1) {
  String str1 = str.substring(str.length()-1);
  String str2 = str.substring(1, str.length()-1);
  String str3 = str.substring(0,1);
  return (str1 + str2 + str3);
  }
  return str;
}