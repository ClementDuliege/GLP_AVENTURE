package aventure;

public class Melee extends Fight {

	public Melee(int damages, int scope) {
		this.damages = damages;
		this.scope = scope;
	}
	
	public Melee() {
		damages = 40;
		scope = 1;
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
