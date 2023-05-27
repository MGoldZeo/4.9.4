/**
 * Activity 4.9.3
 */
public class Hook extends LakeObject
{
  private int strength;
  public Hook()
  {
    strength = 55;
    super.setCost(15);
    //System.out.println("Hook: " + getCost() + ":" + getWeight());
  }

  /*---------- accessor ----------*/
  public int getStrength() 
  {
    return strength; // This return will be updated in the next activity
    //return strength;
  }
  @Override
  public String say()
  {
    return "You now have a hook!";
  }

  @Override
  public boolean wasCaught()
  {
    return false;
  }

}