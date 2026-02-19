package patterns;

public class Patterns {
    public static void main(String[] args){
        print11(4);
    }
    public static void print1(int n){
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void print2(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println("");
        }
    }
    public static void print3(int n){
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }
    public static void print4(int n){
        for(int i=n;i>=0;i--){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }
    public static void print5(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch + " ");
            }
            ch ++;
            System.out.println("");
        }
    }
    public static void print6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int b = (2*i +1)/2;
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<b) ch++;
                else ch--;
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void print7(int n){
        for(int i=0;i<n;i++){
            for(char ch = (char) ('E' - i); ch<='E'; ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
    public static void print8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(n-i-1)*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void print9(int n){
        int b = (2*n-1)/2;
        int k=0;
        int m=(2*n)-2;
        for(int i=0;i<(n*2)-1;i++){

            for(int j=0;j<=k;j++){
                System.out.print("*");;
            }
            for(int j=0;j<m;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=k;j++){
                System.out.print("*");;
            }
            if(i<b){
                k++;
                m -= 2;
            }
            else{
                k--;
                m += 2;
            }
            System.out.println("");
        }

    }
    public static void print10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(i==0 || i==n-1 || j==0 || j==n-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void print11(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                System.out.print(n - Math.min(Math.min(i,j),Math.min((2*n-2)-j,(2*n-2)-i)));
            }
            System.out.println("");
        }
    }
}
