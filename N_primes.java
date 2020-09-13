import java.util.*;
class sample
{
    public int next_prime(int num)
    {
        while(true)
        {
            num+=1;
            for(int i=2; i<num;i++)
            {
                if (num%i==0)
                {
                    break;
                }
                else{
                    return num;
                }
            }
        }
    }
    public ArrayList<Integer> n_prime(int N)
    {
        ArrayList<Integer> prime_list = new ArrayList<>();
        int num=0;
        int count=0; 
        while(count<N)
        {
            num= next_prime(num);
            prime_list.add(num);
            count+=1;
        }
        return prime_list;
    }

    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt()-1;
       sample t1 = new sample();
       ArrayList<Integer> li= t1.n_prime(n);
       li.add(0,2);
       System.out.println(li);
    }
}