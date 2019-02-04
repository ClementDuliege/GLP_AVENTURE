package aventure;

public abstract class Level extends Character {
	protected int experience;
	protected int level;

	
	
 
	public void incrementExperience() {
		int i= 1000;
		for(experience=0; experience<i; experience=experience +100) {
			
		}
	}
	
	public void incrementLevel() {
		if(level < 10) {
			level++;
		}
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setExperience(int xp) {
		experience = xp;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int lvl) {
		level = lvl;
	}
}
