public class HangingMan {

    private int chance = 11;
    private int maxChance = 11;
    String[] HangmanImage = {
    	"",
    	"(",
	   	"(╯",
	    "(╯°",
	    "(╯°□",
	    "(╯°□°",
	    "(╯°□°)",
	    "(╯°□°)╯",
	    "(╯°□°)╯︵",
	    "(╯°□°)╯︵┻",
	    "(╯°□°)╯︵┻━",
	    "(╯°□°)╯︵┻━┻"};
    public boolean isntDead(){
        return chance > 0;
    }
    public void show(){
        System.out.println(HangmanImage[maxChance - chance]);
    }
    public void dieSomeMore(){
        chance --;
    }
}
