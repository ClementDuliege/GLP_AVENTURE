package aventure;

public class Heal extends Fight{
	
	public Heal(int life, int scope) {
		this.life=life;
		this.scope=scope;
	}
		
	public Heal() {
		life = 75;
		scope = 0;
	}
		
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;		
	}
}
