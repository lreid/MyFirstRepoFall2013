import java.util.Vector;

public class OurGroup {

private Vector<String> groupMembers;
public OurGroup()
{
groupMembers = new Vector<String>();
groupMembers.add("Stan Smith");
groupMembers.add("Ned Flanders");
groupMembers.add("Todd"); //PUT YOUR NAME HERE
}
public Vector<String> getGroupMembers () {
return groupMembers;
}

}