package FatherandChild;

public class father {
    private int noiseBar;
    father (int noiseBar){
        this.noiseBar = noiseBar;
    }
    public int getNoiseBar(){
        return noiseBar;
    }
    public void updateNoiseBar(int newNoiseBar){
        this.noiseBar = newNoiseBar;
    }
    // This function stops the game entirely 
    public void wakeup(){
       System.out.println("The Father has woke up! Game over!");
       System.exit(0);
    }
    public void grunt(){
        System.out.println("The Father is grunting! Keep quite!");
    }
    public void sleeping(){
        System.out.println("The Father is currently asleep");
    }
}
