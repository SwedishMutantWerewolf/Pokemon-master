package pokemon.model;

public class Eelithe extends Pokemon implements Normal, Fire
{
	public Eelithe()
	{
		super("Eelithe", 918);
	}
	public Eelithe(String name)
	{
		super(name, 918);
	}
	public Eelithe (int number, String name)
	{
		super(name, number);
		
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(false);
		this.setEnchanceModifier(.89);
		this.setHealthPoints(123);
	}
	private void setHealthPoints(int i) {
		// TODO Auto-generated method stub
		
	}
	private void setEnchanceModifier(double d) {
		// TODO Auto-generated method stub
		
	}
	public void setCanEvolve(boolean b) {
		// TODO Auto-generated method stub
		
	}
	private void setAttackPoints(int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fireType() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void normalType() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int attackMove(int amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String sayName() {
		// TODO Auto-generated method stub
		return null;
	}
}