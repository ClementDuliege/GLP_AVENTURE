package aventure;

public class Freeze extends Fight {
	
	public Freeze(int damages, int scope) {
		this.damages = damages;
		this.scope = scope;
	}
	
	public Freeze() {
		damages = 30;
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
