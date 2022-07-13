package StringMethods;

public class StringMethodUse {

	public static void main(String[] args) {

		String name = "Velocity";
		
		//1.length() method use
		System.out.println(name.length());
		
		int lengthOfString = name.length(); //To use Referenced Variable
		System.out.println(lengthOfString);
		System.out.println("================");
		
		//2.toUpperCase method use
		System.out.println(name);
		System.out.println(name.toUpperCase()); //without any reference
		String m = name.toUpperCase();  //with reference
		System.out.println(m);
		System.out.println("================");

		//3.toLowerCase
		System.out.println(m.toLowerCase());
		String n = m.toLowerCase();  //reference to reference
		System.out.println(n);
		System.out.println("================");

		//4.equals() method use
		String a="velocity";
		String b="velocity";
		String c=new String("velocity");
		String d=new String("velocity");
		String e=new String("VELOCITY");
		
		//This is not method..This is condition operator
		//===Compares memory locations of two operands==
		System.out.println(a==b); //to check memory location
		System.out.println(c==d);
		System.out.println("================");
		
		//This is equals method
		//equals method compare character sequence of two objects
		System.out.println(a.equals(b)); //to check sequence of character
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		boolean result = a.equals(c);
		System.out.println("a and c are equal:"+result);
		
		System.out.println(d.equals(e)); //checking character along with case sensitivity 
		System.out.println("================");

		//5.equalsIgnoreCase() method use
		String city="Pune";
		String locality="Pune";
		String dist="pune";
		
		System.out.println(city.equals(dist));
		System.out.println(city.equalsIgnoreCase(dist));
		System.out.println("================");

		//6.contains method use
		String k="katraj";
		System.out.println(k.contains("ka"));
		System.out.println(k.contains("ar"));
		System.out.println(k.contains("Aj"));
		System.out.println("================");

		//7.isEmpty() method use
		String p="Test";
		String q=" ";
		String r=null; //NullPointerException
		String s="";
		
		System.out.println(q.length());
		//System.out.println(r.length());NullPointerException
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		System.out.println(s.isEmpty());
		System.out.println("================");

		//8.isBlank() method use 
		System.out.println(s.isBlank());
		System.out.println(q.isBlank());
		System.out.println(p.isBlank());
		System.out.println("================");

		//9.charAt() method use
		String country="INDIA";
		System.out.println(country.charAt(0));
		char requiredChar = country.charAt(0);
		System.out.println(requiredChar);
		//System.out.println();country.charAt(9)); StringIndexOutOfBoundsException
		System.out.println("================");

		//10.endsWith() method use
		System.out.println(country.endsWith("IND"));
		System.out.println(country.endsWith("IA"));
		System.out.println(country.endsWith("INDIA"));
		System.out.println(country.endsWith("A"));
		System.out.println(country.endsWith("a")); //case-sensitive
		System.out.println("================");

		//11.startsWith() method use
		System.out.println(country.startsWith("IND"));
		System.out.println(country.startsWith("I"));
		System.out.println(country.startsWith("i"));
		
		System.out.println(country.startsWith("A", 4));
		System.out.println(country.startsWith("A", 2));
		System.out.println(country.startsWith("ND", 1));
		System.out.println("================");

		//12.substring() method use
		String testing="VELOCITY CORPORATE TRAINING CENTER";
		
		String results = testing.substring(9);
		System.out.println(results);
		System.out.println(testing.substring(9, 18));  //endIndex-1
		System.out.println("================");

		//13.concat() method use
		String x="Pune";
		String y=" City";
		
		System.out.println(x.concat(y));
		System.out.println(x.concat(y).concat(" Katraj")); //We can pass string as well as object
		System.out.println("================");

		//14.indexOf() method use
		String state="Maharashtra";
		
		System.out.println(state.indexOf('a'));
		System.out.println(state.indexOf('a', 4));
		System.out.println(state.lastIndexOf('a'));//last occurrence index
		System.out.println("================");
		
		//15.replace() method use
		String tal="Pune Mumbai Nagpur";
		
		System.out.println(tal.replace('P', ' '));
		System.out.println(tal.replace('P', 'M'));
		System.out.println(tal.replace("Pu", "Ru"));
		System.out.println(tal.replaceAll(" ", "x")); //replaceAll
		System.out.println(tal.replaceFirst("M", "s")); //replaceFirst
		System.out.println("================");
		
		//16.split() method use
		
		String s1 ="I LOVE MY INDIA";
		String arr[]=s1.split(" ");
		//String arr[]={"I","LOVE","MY","INDIA"};
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		
		String name1="THIS_IS_MY_COUNTRY";
		String arr2[]=name1.split("_");
		
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.println(arr2[i]);
		}
	}

} 
