package try3.hello.src.exercise_7_copy;

public class player {
	
	private int play1_sco;
    private String name;
	
	
	public player(int play1_sco, String name) {
		this.play1_sco=play1_sco;
        this.name=name;
	}
    
    public int getPlay1_sco() {
        return play1_sco;
    }

    public void setPlay1_sco(int sco) {
        this.play1_sco = sco+play1_sco;
    }

	public void reset_sco() {
        play1_sco = play1_sco-play1_sco;
    }

    public String getname(){
        return name;
    }

    public void setname(int score1, int score2){
        name+=String.format("%3s %3s %s %-3s %4s","",score1,"/",score2,"|");
    }


    public void resetname(int num){
        name="Player "+num+"        |";
    }


}
