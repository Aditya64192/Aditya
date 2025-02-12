import java.util.*;
class Padi
{

    int en;
    String name;
    Double salary;


    void getData()
    {
        Scanner in=new Scanner(System.in);

        en=in.nextInt();
        name=in.next();
        salary=in.nextDouble();

    }


    void putData()
    {

        System.out.println("Emp no "+en+"  name="+name+"  salary ="+salary);
    }


  public static void main(String[] args) {
      
  
  {

    Padi[]e=new Padi[5];

    for(int i=0;i<5;i++)
    {
    e[i]=new Padi();
    e[i].getData();

    }


    for(Padi a:e)
    a.putData();
    }
  }



}