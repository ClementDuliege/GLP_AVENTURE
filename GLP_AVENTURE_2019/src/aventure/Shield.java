package aventure;

public class Shield extends Fight{
	private int life;
	private int scope;
	
	public Shield(int life, int scope) {
		this.life = life;
		this.scope = scope;
	}
	
	public Shield() {
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
