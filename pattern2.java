
class pattern2{
public static void main(String args[]){
int variable=64;
for(int i=1;i<=5;i++){

for(int j=1;j<=i;j++){

System.out.print((char)(j + variable)+" ");


}
System.out.println(" ");
}
}
}

/*
A
A B
A B C
A B C D
A B C D E
*/