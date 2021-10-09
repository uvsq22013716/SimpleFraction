
public class Fraction {
	protected int numerateur;
	protected int denominateur;
	
	public Fraction(int numerateur, int denominateur)
	{
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}

	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}
	
	
}
