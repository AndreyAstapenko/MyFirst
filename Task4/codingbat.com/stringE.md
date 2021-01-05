public boolean stringE(String str) {
  int count = 0;
 char strArray[]=str.toCharArray();
  for (int i = 0; i<strArray.length; i++) {
  if (strArray[i] == 'e')
  count = count+1;
  }
if (count == 0)
return false;
if (count<=3)
return true;
return false;
}