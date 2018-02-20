/* Program to accept movie details like..
1. MovieId
2. MovieName
3. MovieDirector
4. MovieActor
5. MovieRating
6. MovieType
7. MovieRelease
TASK:-
1. Accept 50 details and store the data inside the file using proper delimiter.
2. Read data from file and perform 
Display list of all movies released in year 2015
Display list of all movies having type as "U".
Display list of all movies having rating greater than 4 star
Display list of all movies having Actor as "Khans".
*/
import java.util.*;
import java.io.*;
class MovieDetails
{
	public static void main(String[] aa)
	{
		try
		{ 
			FileWriter fw=new FileWriter("E:\\Program\\MovieDetails.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			FileReader fr=new FileReader("E:\\Program\\MovieDetails.txt");
			BufferedReader br=new BufferedReader(fr);
			ArrayList<String> al= new ArrayList<>();
			Scanner scn=new Scanner(System.in);
			String movieID,movieName,movieDirector,movieActor,movieType;
			String str;
			int movieRating,movieRelease;
			int j=0,count=0;
			System.out.println("Enter number of Movie details");
			int n=scn.nextInt();
			scn.nextLine();
			//Writing data to file
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Movie ID");
				movieID=scn.nextLine();
				bw.write(movieID);
				bw.append(",");
				System.out.println("Enter Movie Name");
				movieName=scn.nextLine();
				bw.write(movieName);
				bw.append(",");
				System.out.println("Enter Movie Director");
				movieDirector=scn.nextLine();
				bw.write(movieDirector);
				bw.append(",");
				System.out.println("Enter Movie Actor");
				movieActor=scn.nextLine();
				bw.write(movieActor);
				bw.append(",");
				System.out.println("Enter Movie Rating");
				movieRating=scn.nextInt();
				scn.nextLine();
				bw.write(new Integer(movieRating).toString());
				bw.append(",");
				System.out.println("Enter Movie Type");
				movieType=scn.nextLine();
				bw.write(movieType);
				bw.append(",");
				System.out.println("Enter Movie Release Year");
				movieRelease=scn.nextInt();
				scn.nextLine();
				bw.write(new Integer(movieRelease).toString());
				bw.newLine();
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
			//To Display list of all movies released in year 2015
			System.out.println("Movies released in 2015");
			for(j=0;j<n;j++)
			{
				int year=Integer.parseInt(al.get((7*j)+6));
				if(year==2015) {
				String movies=al.get((7*j)+1);
				System.out.println(movies);
				count++;
				}
			}
			System.out.println("Movies released in 2015:"+count);
			//Display list of all movies having type as "U"
			count=0;
			System.out.println("Movies with U certificate");
			for(j=0;j<n;j++)
			{
				String type=al.get((7*j)+5);
				if(type.equalsIgnoreCase("U")) {
				String movies=al.get((7*j)+1);
				System.out.println(movies);
				count++;
				}
			}
			System.out.println("Movies with U certificate:"+count);
			//Display list of all movies having rating greater than 4 star
			count=0;
			System.out.println("Movies with rating greater than 4");
			for(j=0;j<n;j++)
			{
				int star=Integer.parseInt(al.get((7*j)+4));
				if(star>4) {
				String movies=al.get((7*j)+1);
				System.out.println(movies);
				count++;
				}
			}
			System.out.println("Movies with rating greater than 4:"+count);
			//Display list of all movies having Actor as "Khans"
			count=0;
			System.out.println("Movies having Actor as Khans");
			for(j=0;j<n;j++)
			{
				String name=al.get((7*j)+3);
				if(name.contains("khan")) {
				String movies=al.get((7*j)+1);
				System.out.println(movies);
				count++;
				}
			}
			System.out.println("movies having Actor as Khans:"+count);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}