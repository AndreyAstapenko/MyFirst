public String startOz(String str) {
  if ((str.length()<1) || ((str.length()==1) & (str.substring(0,1).equals("o"))))
  return str;
  String str1 = str.substring(0,1);
  String str2 = str.substring(1,2);
  String str3 = "";
  if (str1.equals("o"))
  str3 = str3+str1;
  if (str2.equals("z"))
  str3 = str3+str2;
  return str3;
}