/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{
    public Bait()
    {
        super.setCost(10);
    }
    @Override
    public String say()
    {
        return "You now have bait!";
    }
    @Override
    public boolean wasCaught()
    {
        return true;
    }

}