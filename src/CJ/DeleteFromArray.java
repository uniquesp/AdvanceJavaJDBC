package CJ;

public class DeleteFromArray {
	
	public static void main(String[] args) {
	int a[] = {1,2,3,4,5};
	
	int deleteEleIdx = 2;
	
	for(int i=0;i<a.length;i++) {
		if(deleteEleIdx==i) {
			for(int j=i;j<a.length-1;j++) {
				a[j] = a[j+1];
			}
			//break;
		}
	}
	
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ " ");
	}

	}
}
