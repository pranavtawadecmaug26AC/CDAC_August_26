class LeapYear { 
public static void main(String[] args) { 
int y1 = 2024;
int y2 = 1900;

if ( (y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0 ) ) { 
System.out.println(y1 + " is a leap year.");
}
else { 
System.out.println(y1 + " is not a leap year.");
}

if ( (y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0 ) ) { 
System.out.println(y2 + " is a leap year.");
}
else { 
System.out.println(y2 + " is not a leap year.");
}


}

}