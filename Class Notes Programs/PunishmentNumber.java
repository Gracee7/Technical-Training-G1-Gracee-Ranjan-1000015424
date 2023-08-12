public class PunishmentNumber {
    public static int findPunishmentNum(int num){

        int sum=0;
        int pro;
        for(int i=1;i<=num;i++)
        {
            pro=i*i;
            while(pro>0){
                pro=pro%10;
                sum=sum+pro;
                pro=pro/10;
            }
            if(sum<num){
                System.out.print(sum);
            }
        }
        return 0;
    }

    public static void main(String[] args){

        findPunishmentNum(10);
    }
}