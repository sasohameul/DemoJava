package study03.ascending;

import java.util.Arrays;

public class Ascending {

	int num;
	char[] d;
	int[] a;

	public Ascending(int num) {

		this.num = num;

		d = new char[num];
		a = new int [num];

		for(int i = 0; i < d.length; i++) {
			
			d [i] =  ((char) ((int) (Math.random() * 26) + 65));
			a [i] = (int)(Math.random()*100 + 1);
		}
	}

	
	public void cSortMethod() {
			
					
		System.out.println(Arrays.toString(d));


		for(int i = 0; i < d.length-1; i++) {

			for(int j = i+1; j < d.length; j++) {

				if(d[i] > d[j]) {

					char temp = d[i];
					d[i] = d[j];
					d[j] = temp;

				}

			}

		}
		System.out.println("오름차순");
		System.out.println(Arrays.toString(d));

	}

	

	public void iSortMethod() {


		
		System.out.println(Arrays.toString(a));

		for(int i = 0; i < a.length-1; i++) {

			for(int j = i+1; j <a.length; j++) {

				if(a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		
		System.out.println("오름차순");
		System.out.println(Arrays.toString(a));

	}

}