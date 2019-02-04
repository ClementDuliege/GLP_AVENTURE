package aventure;

public class Fireball extends Fight {
	
	public Fireball(int damages, int scope) {
		this.damages = damages;
		this.scope = scope;
	}
	
	public Fireball() {
		damages = 50;
		scope = 3;
	}
	
	public int getDamages() {
		return damages;
	}

	public void setDamages(int damages) {
		this.damages = damages;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

}
