/*program to accept 10 std details like ..
1. Std ID-String-All stdID start with S and followed by 3 digit
2. Std name-String
3. Std age-int-value entered by user must not be greater than 100.
4. Std city-String-
5. Std country-Sting-only India is allowed
TASK:-
1. Store all data inside txt file.
2. Read data from txt file and count the number of stds whose age >21;
3. Read data from txt file and display details of all stds whose Namess are starting with "A".
*/
import java.util.*;
import java.io.*;
class StudentDetails
{
	public static void main(String[] aa)
	{
		try
		{ 
			FileWriter fw=new FileWriter("E:\\Program\\StudentDetails.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			FileReader fr=new FileReader("E:\\Program\\StudentDetails.txt");
			BufferedReader br=new BufferedReader(fr);
			ArrayList<String> al= new ArrayList<>();
			Scanner scn=new Scanner(System.in);
			String stdID,stdName,stdCity,stdCountry,str;
			int stdAge,j=0,count=0;
			System.out.println("Enter number of students");
			int n=scn.nextInt();
			scn.nextLine();
			//Writing data to file 
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Student ID");
				stdID=scn.nextLine();
				if(((stdID.charAt(0)=='S')||(stdID.charAt(0)=='s')) &&(stdID.length()==4)&&(stdID.charAt(1)>='0' && stdID.charAt(1)<='9')&&(stdID.charAt(2)>='0' && stdID.charAt(2)<='9')&&(stdID.charAt(3)>='0' && stdID.charAt(3)<='9'))
				{
				bw.write(stdID);
				bw.append(",");
				}
				else
				{
				System.out.println("Enter Correct ID format");
				stdID=scn.nextLine();
				bw.write(stdID);
				bw.append(",");
				}
				System.out.println("Enter Student Name");
				stdName=scn.nextLine();
				bw.write(stdName);
				bw.append(",");
				System.out.println("Enter Student Age");
				stdAge=scn.nextInt();
				scn.nextLine();
				if(stdAge<100) {
					bw.write(new Integer(stdAge).toString());
					bw.append(",");
				}
				else {
					System.out.println("Enter Age less than 100");
					stdAge=scn.nextInt();
					scn.nextLine();
					bw.write(new Integer(stdAge).toString());
					bw.append(",");
				}
				System.out.println("Enter Student City");
				stdCity=scn.nextLine();
				bw.write(stdCity);
				bw.append(",");
				System.out.println("Enter Student Country");
				stdCountry=scn.nextLine();
				if(stdCountry.equalsIgnoreCase("India")) {
					
					bw.write(stdCountry);
					bw.newLine();
				}
				else {
					System.out.println("Enter country as India only");
					stdCountry=scn.nextLine();
					bw.write(stdCountry);
					bw.newLine();
				}
			}
			bw.close();
			fw.close();
			System.out.println("Written Successfully");
			//Reading data from file 
			while((str=br.readLine())!=null)
			{
				StringTokenizer st=new StringTokenizer(str,",");
				while(st.hasMoreTokens()) {
				al.add(st.nextToken());
				}
			}
			System.out.println(al);
			//count the number of stds whose age >21
			while(j<n)
			{
				int age=Integer.parseInt(al.get((5*j)+2));
				if(age>21)
				{
				count++;
				}
				j++;
			}
			System.out.println("Number of Students greater than 21:"+count);
			j=0;
			//display details of all stds whose Namess are starting with "A"
			while(j<n)
			{
				String name=al.get((5*j)+1);
				if((name.charAt(0)=='A')||(name.charAt(0)=='a'))
				{
				System.out.println("Student Name starting with A "+name);
				}
				j++;
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println("Exception Occured");
		}
	}
}