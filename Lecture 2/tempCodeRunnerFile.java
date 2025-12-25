int x[]={1,2,3,4,5,6,7,89,0};
int even=0;
int odd=0;
for(int i=0;i<x.length;i++){
    if(x[i]%2==0)
    even++;
    else
    odd++;
}
System.out.println("Even nos:"+even);
System.out.println("Odd nos:"+odd);