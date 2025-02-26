public class CH_Cat implements Cat {

    private int age;

    private String sex;

    @Override
    public void Cat_pro(){ CH_Cat  x = new CH_Cat();
    x.age = 10;
    x.sex = "female";

    }

    @Override
     public void MakeNoise(){
        System.out.print("this is a chinese_Cat ");
    }
    //here not to use static interface is instant to

     public static void main(String[]args){
        CH_Cat kally = new CH_Cat();
        kally.MakeNoise();
        System.out.print("kally of sex : " + kally.sex);
    }




}
