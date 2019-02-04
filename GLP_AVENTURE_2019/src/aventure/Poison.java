package aventure;

public class Poison extends Fight {

	
	public Poison(int damages, int scope) {
		this.damages = damages;
		this.scope = scope;
	}
	
	public Poison() {
		damages = 20;
		scope = 2;
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
