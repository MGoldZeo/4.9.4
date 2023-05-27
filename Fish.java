/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    @Override
    public String say()
    {
        return "You now have a fish!";
    }
    @Override
    public boolean wasCaught()
    {
        return false;
    }
    @Override
    public int getCost()
    {
        return (super.getWeight()*super.getCost());
    }
}