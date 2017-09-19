class Star_Pattern6{
public static void main(String []args){
		for(int i=1;i<=5;i++){

				for(int l=i;l>1;l--){
				System.out.print(" ");
				}
			for(int j=10-i;j>=1;j--){
				if(i<=j){
				System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}
/*
*********
 *******
  *****
   ***
    *
*/