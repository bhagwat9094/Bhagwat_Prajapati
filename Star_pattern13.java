class Star_pattern13{
	public static void main(String []args){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=5;j++){
				if(i-j==2||i+j==4)
					System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
			}
		}
	}
/*

  *  
 * * 
*   *


*/
