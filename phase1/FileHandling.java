
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class FileHandling {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String in,cont = "s";
while( cont.equalsIgnoreCase("s") ) {
	System.out.println("Employee information system \n 1.Add new employee \n 2.View records \n 3.Delete record \n 4.search record \n 5.Update record \n \n Select your chioces");
	
 in = sc.nextLine();
if( in.equals("1") ) {
try {
AddRecord();
} catch (IOException e) {
e.printStackTrace();
}
} else if( in.equals("2") ) {
try {
ViewAllRecord();
} catch (IOException e) {
e.printStackTrace();
}
} else if( in.equals("3") ) {
try {
DeleteRecordByID();
} catch (IOException e) {
e.printStackTrace();
}
} else if( in.equals("4") ) {
try {
SearchRecordbyID();
} catch (IOException e) {
e.printStackTrace();
}
} else if( in.equals("5") ) {
try {
updateRecordbyID();
} catch (IOException e) {
e.printStackTrace();
}
}
System.out.println("Do you want to continue? Yes/No");
cont = sc.nextLine();
}
}
public static void AddRecord() throws IOException {
BufferedWriter bw = new BufferedWriter( new FileWriter("records.txt",true) );
Scanner sc = new Scanner(System.in);
String ID, name, age, adr;
System.out.print("Enter Employee ID: ");
ID = sc.nextLine();
System.out.print("Enter Employee Name: ");
name = sc.nextLine();
System.out.print("Enter Employee Age: ");
age = sc.nextLine();
System.out.print("Enter Employee Address: ");
adr = sc.nextLine();
bw.write(ID+","+name+","+age+","+adr);
bw.flush();
bw.newLine();
bw.close();
}
public static void ViewAllRecord() throws IOException {
BufferedReader br = new BufferedReader( new FileReader("records.txt") );
String record;
System.out.println(" ------------------------------------------------------------- ");
System.out.println("| ID Name Age Address |");
System.out.println(" ------------------------------------------------------------- ");
while( ( record = br.readLine() ) != null ) {
StringTokenizer st = new StringTokenizer(record,",");
System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
}
System.out.println("| |");
System.out.println(" ------------------------------------------------------------- ");
br.close();
}
public static void DeleteRecordByID() throws IOException {
Scanner scInput = new Scanner(System.in);
String ID, record;
File tempDB = new File("records_temp.txt");
File db = new File("records.txt");
BufferedReader br = new BufferedReader( new FileReader( db ) );
BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
System.out.println("\t\t Delete Employee Record\n");
System.out.println("Enter the Employee ID: ");
ID = scInput.nextLine();
while( ( record = br.readLine() ) != null ) {
if( record.contains(ID) )
continue;
bw.write(record);
bw.flush();
bw.newLine();
}
br.close();
bw.close();
db.delete();
tempDB.renameTo(db);
}
public static void SearchRecordbyID() throws IOException {
String ID,record;
Scanner scInput = new Scanner(System.in);
BufferedReader br = new BufferedReader( new FileReader("records.txt") );
System.out.println("\t\t Search Employee Record\n");
System.out.println("Enter the Employee ID: ");
ID = scInput.nextLine();
System.out.println(" ------------------------------------------------------------- ");
System.out.println("| ID Name Age Address |");
System.out.println(" ------------------------------------------------------------- ");
while( ( record = br.readLine() ) != null ) {
StringTokenizer st = new StringTokenizer(record,",");
if( record.contains(ID) ) {
System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
}
}
System.out.println("| |");
System.out.println(" ------------------------------------------------------------- ");
br.close();
}
public static void updateRecordbyID() throws IOException {
String newName, newAge, newAddr, record, ID,record2;
File db = new File("records.txt");
File tempDB = new File("records_temp.txt");
BufferedReader br = new BufferedReader( new FileReader(db) );
BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
Scanner scInput = new Scanner(System.in);
System.out.println("\t\t Update Employee Record\n\n");
/**/
System.out.println("Enter the Employee ID: ");
ID = scInput.nextLine();
System.out.println(" ------------------------------------------------------------- ");
System.out.println("| ID Name Age Address |");
System.out.println(" ------------------------------------------------------------- ");
while( ( record = br.readLine() ) != null ) {
StringTokenizer st = new StringTokenizer(record,",");
if( record.contains(ID) ) {
System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
}
}
System.out.println("| |");
System.out.println(" ------------------------------------------------------------- ");
br.close();
/**/
System.out.println("Enter the new Name: ");
newName = scInput.nextLine();
System.out.println("Enter the new Age: ");
newAge = scInput.nextLine();
System.out.println("Enter the new Address: ");
newAddr = scInput.nextLine();
BufferedReader br2 = new BufferedReader( new FileReader(db) );
while( (record2 = br2.readLine() ) != null ) {
if(record2.contains(ID)) {
bw.write(ID+","+newName+","+newAge+","+newAddr);
} else {
bw.write(record2);
}
bw.flush();
bw.newLine();
}
bw.close();
br2.close();
db.delete();
boolean success = tempDB.renameTo(db);
System.out.println(success);
}
}