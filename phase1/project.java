import  java.io.File;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class project {
	public static class LockedMe{
		static String  Directory;
		File Folder_name;
		
		public LockedMe()
		{
			Directory =System.getProperty("user.dir");
			Folder_name =new File(Directory+ "/file");
			if(!Folder_name.exists())
				Folder_name.mkdir();
			System.out.println("Directory : "+Folder_name.getAbsolutePath());
			
			
			
			}

		private static final String SECONDARY_MENU =
		"   \nSelect any of the following: \n"+
		"   a -> Add a file\n"+
		"   b -> Delete a file\n"+
		"   c -> Search a file\n"+
		"   d ->GoBack";
		void showPrimaryMenu() {
			System.out.println("Main Menu \n Select any one \n 1.List of files availabel in directory \n 2.Add,Delete or Search Files in directroty \n 3.Exit Program ");
			try {
				Scanner sc =new Scanner(System.in);
				int in =sc.nextInt();
				if (in ==1)
				{
					showFiles();
					showPrimaryMenu();
				}
				else if (in ==2)
				{
					showSecondaryMenu();
				}
				else if(in== 3)
				{
					System.out.println("Thank You for using LockedMe");
					System.exit(0);
					
				}
			} catch (Exception e) {
				System.out.println("Please Enter 1,2 or 3");
				showPrimaryMenu();
				
			}
		}
	

	private void showSecondaryMenu() {
		System.out.println(SECONDARY_MENU);
		try{
		            Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toLowerCase().trim().toCharArray();
		char option = input[0];
	
		switch (option){
		case'a' : {
		System.out.print("Want to Add a file...Please Enter a File Name : ");
		                    String filename = sc.next().toLowerCase().trim();
		addFile(filename);
		break;
		                }
		case'b' : {
		System.out.print("Want to Delete a file...Please Enter a File Name : ");
		                    String filename = sc.next().trim();
		deleteFile(filename);
		break;
		                }
		case'c' : {
		System.out.print("Want to Search a file...Please Enter a File Name : ");
		                    String filename = sc.next().trim();
		searchFile(filename);
		break;
		                }
		case'd' : {
		System.out.println("Going Back to Main menu");
		showPrimaryMenu();
		break;
		                }
		default :System.out.println("Please enter a, b, c or d");
		            }
		showSecondaryMenu();
		        }
		catch (Exception e){
		System.out.println("Please enter a, b, c or d");
		showSecondaryMenu();}
		}
	void showFiles() {
		if (Folder_name.list().length==0)
		System.out.println("Folder Dose not contain any File");
		else {
		String[] list = Folder_name.list();
		System.out.println("The Available files in "+ Folder_name +" are :");
		Arrays.sort(list);
		for (String str:list) {
		System.out.println(str);
		            }
		        }
		    }
	
		void addFile(String filename) throws IOException {
		        File filepath = new File(Folder_name +"/"+filename);
		String[] list = Folder_name.list();
		for (String file: list) {
		if (filename.equalsIgnoreCase(file)) {
		System.out.println("File " + filename + " already exists at " + Folder_name);
		return;
		            }
		        }
		filepath.createNewFile();
		System.out.println("File "+filename+" added to "+ Folder_name);
		    }
	
		void deleteFile(String filename) {
		        File filepath = new File(Folder_name +"/"+filename);
		String[] list = Folder_name.list();
		for (String file: list) {
		if (filename.equals(file) &&filepath.delete()) {
		System.out.println("File Deleted Sucssesfully Named " + filename + " deleted from " + Folder_name);
		return;
		            }
		        }
		System.out.println("Delete Operation failed. FILE NOT FOUND");
		    }
	
		void searchFile(String filename) {
		String[] list = Folder_name.list();
		for (String file: list) {
		if (filename.equals(file)) {
		System.out.println("FOUND : File " + filename + " exists at " + Folder_name);
		return;
		            }
		        }
		System.out.println("File NOT found ");
		    }
	
		public static void main(String[] args) {
		LockedMe menu = new LockedMe();
		menu.showPrimaryMenu();
		}}}
		
	