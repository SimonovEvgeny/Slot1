
package javaapplication1;

public class SimpleOrDifficult {
    public static void main(String[] args){
        
       int schSim = 0;
       int schDiff = 0;
       int schExc = 0;
       
            for(int i=0; i<100; i++){
                if(i==0||i==1){
                    schExc++;
                }
                else if(i==2||i==3||i==5||i==7){ 
                    schSim++;
                }
                else if (i%2!=0&i%3!=0&i%5!=0&i%7!=0){
                    schSim++;  
                }
                else if (i%2==0||i%3==0||i%5==0||i%7==0){
                    schDiff++;
                }
            }
            
        int simple [] = new int[schSim];
        int difficult[] = new int [schDiff]; 
        int exception[] = new int [schExc];
        
        schSim=0;
        schDiff=0;
        schExc=0;
        
            for(int i=0; i<100; i++){
                if(i==0||i==1){
                    exception[i]=i;
                    schExc++;
                }
                else  if(i==2||i==3||i==5||i==7){
                    simple [schSim]=i;
                    schSim++;
                }
                else if (i%2==0||i%3==0||i%5==0||i%7==0){
                    difficult[schDiff]=i;
                    schDiff++;
                }
                else if (i%2!=0&i%3!=0&i%5!=0&i%7!=0){
                    simple [schSim]=i;
                    schSim++;  
                }
            }
            System.out.print("Исключения: ");
            
            for ( int n=0; n<schExc; n++)
                System.out.print(exception[n] + " ");
                System.out.println();
                        
            System.out.print("Простые числа: ");
            
            for ( int n=0; n<schSim; n++)
                System.out.print(simple[n] + " ");
                System.out.println();
                
            System.out.print("Составные числа: ");
            
            for ( int n=0; n<schDiff; n++)
                System.out.print(difficult[n] + " ");
      
    }
}
