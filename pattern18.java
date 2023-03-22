class pattern18{
public static void main(String args[]){
int variable=70;
for(int i=1;i<=5;i++){

for(int j=5;j>=i;j--){
System.out.print((char)(variable-j)+" ");
}
System.out.println();
}
}
}

/*

ABCDE
ABCD
ABC
AB
A

*/