public String everyNth(String str, int n) {
  String str1 = "";
  for (int i = 0; i<str.length(); i=i+n) 
str1 = str1 + str.charAt(i);
return str1;
}