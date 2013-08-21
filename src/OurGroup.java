import java.util.Vector;

public class OurGroup {

private Vector<String> groupMembers;
public OurGroup()
{
groupMembers = new Vector<String>();
groupMembers.add("laurakreidproject");
groupMembers.add("Bart Simpson");
groupMembers.add("laurakreid@yahoo.com"); //PUT YOUR NAME HERE
}
public Vector<String> getGroupMembers () {
return groupMembers;
}

}