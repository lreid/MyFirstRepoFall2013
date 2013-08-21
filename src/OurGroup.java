import java.util.Vector;

public class OurGroup {

private Vector<String> groupMembers;
public OurGroup()
{
groupMembers = new Vector<String>();

groupMembers.add("Stan Smith");

}
public Vector<String> getGroupMembers () {
return groupMembers;
}

}