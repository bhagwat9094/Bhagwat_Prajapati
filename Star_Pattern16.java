class Star_Pattern16{
	public static void main(String []args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==3||j==1||j==5||i+j==6||i==j){
					System.out.print("*");
					}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		}
	}
   
