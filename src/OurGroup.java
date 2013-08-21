import java.util.Vector;

public class OurGroup {

private Vector<String> groupMembers;
public OurGroup()
{
groupMembers = new Vector<String>();
groupMembers.add("gittesting Smith");
groupMembers.add("Peter Griffin");
groupMembers.add("Laura"); //PUT YOUR NAME HERE
}
public Vector<String> getGroupMembers () {
return groupMembers;
}

}