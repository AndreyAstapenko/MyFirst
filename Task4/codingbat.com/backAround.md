public String backAround(String str) {
  str = str.substring(str.length()-1) + str + str.substring(str.length()-1);
  return str;
}