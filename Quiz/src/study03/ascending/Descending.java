package study03.ascending;

import java.util.Arrays;

public class Descending extends Ascending{

	public Descending(int num) {

		super(num);

	}

	public void cSortMethod() {

		for(int i = 0; i < this.d.length-1; i++) {

			for(int j = i+1; j < this.d.length; j++) {

				if(this.d[i] < this.d[j]) {

					char temp = this.d[i];
					this.d[i] = this.d[j];
					this.d[j] = temp;

				}

			}

		}

		System.out.println("내림차순");
		System.out.println(Arrays.toString(d));

	}

	public void iSortMethod() {

		for(int i = 0; i < d.length-1; i++) {

			for(int j = i+1; j < d.length; j++) {

				if(a[i] < a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		System.out.println("내림차순");
		System.out.println(Arrays.toString(a));

	}
}