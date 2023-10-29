public class lastwordlengthinstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String h[]=a.split(" ");
		String d=h[h.length-1];
		System.out.print("length of the last word is "+d.length());

	}

} 

INPUT:
hii hello whitedevil

OUTPUT:
length of the last word is 10