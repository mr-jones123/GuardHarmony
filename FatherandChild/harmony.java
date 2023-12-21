package FatherandChild;

public class harmony {
    private int newNoiseBar = 0;
    father Father = new father(newNoiseBar);
    public void cry(){
        System.out.println("The Child is CRYING!");
        newNoiseBar = newNoiseBar + 30;

    }
    public void mischief(){
        System.out.println("The Child is doing mischiev ous acts!");
        newNoiseBar = newNoiseBar + 10;
    }
    public void scream(){
        System.out.println("The Child is crying!!");
        newNoiseBar = newNoiseBar + 20;
    }
    

}
     

