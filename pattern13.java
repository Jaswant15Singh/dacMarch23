class pattern13{
public static void main(String args[]){
	int variable=64;
for(int i=1;i<=5;i++){
for(int k=5;k>i;k--){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print(" "+(char)(variable + i));
//System.out.print(j +" ");
}
System.out.println();
}
}}


/*

     A
    B B
   C C C
  D D D D
 E E E E E
 
 */