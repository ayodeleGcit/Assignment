public class Assignment2 {
    public static void main(String[]arg){
         String name1,name2;
         Integer sec,sec1,palyer1=0,player2=0,x;
         Scanner input1=new Scanner(System.in);
          Scanner input2=new Scanner(System.in);
          System.out.println("Enter your name player 1");
           name1=input1.nextLine();
           System.out.println("Enter your name player2 ");
         name2=input1.nextLine();
         while(true){
         while(check(name1,name2)){
             System.out.println("The name as been entered before please enter your name again ");
             System.out.println("Enter your for player2 ");
         name2=input1.nextLine();
         }
         System.out.println("How many chips does the initial pile contain : ");
         Integer y=input2.nextInt();
         while(check1(y)){
             if(y<3){
                 System.out.println("You have to start with at least 3 chips. Choose another number: ");
                 y=input2.nextInt();
             }else{
                 System.out.println("You have to start with an odd number of chips. Choose another number: ");
                  y=input2.nextInt();
             }
         }
         
        while(turnCheck(y)){
            System.out.println(name1+" has "+palyer1+" chips ");
            System.out.println(name2+" has "+player2+" chips ");
            System.out.println("It is your turn, "+name1);
            
            System.out.println("There are "+y+" remaining ");
            if (y==1){
                x=y;
            }else{
                x=y/2;
            }
            System.out.println("You may take any number of chips from  1 "+"to "+ x +" How many will you take, "+name1+" ? ");
            sec=input2.nextInt();
            while(!checkIllegal(sec, x)){
                if(sec<1){
                System.out.println("Illegal move: you must take at least one chip. ");
                System.out.println("You may take any number of chips from  1 "+"to "+ x +" How many will you take, "+name1+" ? ");
                sec=input2.nextInt();
            }else{
                    System.out.println("Illegal move: you may not take more than "+x+" chips");
                    System.out.println("You may take any number of chips from  1 "+"to "+ x +" How many will you take, "+name1+" ? ");
                    sec=input2.nextInt();
                }
            }
            palyer1=palyer1+sec;
            y=y-sec;
             if(!turnCheck(y)){
                 break;
             }
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            System.out.println(name2+" has "+player2+" chips ");
            System.out.println(name1+" has "+palyer1+" chips ");
            System.out.println("It is your turn, "+name2);
            System.out.println("There are "+y+" remaining ");
            if (y==1){
                x=y;
            }else{
                x=y/2;
            }
            System.out.println("You may take any number of chips from  1 "+"to "+ x +" How many will you take, "+name2+" ? ");
            
            sec1=input2.nextInt();
             while(!checkIllegal(sec1, x)){
                if(sec1<1){
                System.out.println("Illegal move: you must take at least one chip. ");
                System.out.println("You may take any number of chips from  1 "+"to "+ x +" How many will you take, "+name2+" ? ");
                sec1=input2.nextInt();
            }else{
                    System.out.println("Illegal move: you may not take more than "+x+" chips");
                    System.out.println("You may take any number of chips from  1 "+"to "+ x +" How many will you take, "+name2+" ? ");
                    sec1=input2.nextInt();
                }
            }
            
            player2=player2+sec1;
            y=y-sec1;
           
        }

        if(winner(palyer1, player2)){
            System.out.println(name1+" has "+palyer1+" chips");
             System.out.println(name2+" has "+player2+" chips");
             System.out.println(name1+" wins! ");
        }else{
            System.out.println(name2+" has "+player2+" chips");
            System.out.println(name1+" has "+palyer1+" chips");
             System.out.println(name2+" wins! ");
        }
        System.out.println(" Play another game? (y/n): ");
         String a=input1.next();
         if(!a.equalsIgnoreCase("y")){
             break;
         }
        palyer1=0;
        player2=0;
        sec=0;
        sec1=0;
    }
    }
    static boolean check(String name1,String name2){
        return name1.equalsIgnoreCase(name2);
    }
    static boolean check1(Integer x){
        return(x<3||x%2==0);
    }
    static boolean turnCheck(Integer y){
        return y>0||y==1;
    }
    static boolean checkIllegal(Integer i,Integer k){
        return i>=1&&i<=k;
    }
    static boolean validate(Integer player1,Integer player2){
        if((player1%2==0&&player2%2==0)||(player1%2!=0&&player2%2!=0)){
            return true;
        }else{
        return false;
    }
    }
    static boolean winner(Integer player1,Integer player2){
        if(player1%2==0&&player2%2!=0){
            return true;
        }else{
            return false;
        }
    }
   

}
