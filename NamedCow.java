class NamedCow extends Cow
{
	public String myName;
	NamedCow()
	{
		myName = "unknown";
	}
	public NamedCow (String type, String name, String sound)
	{
		myName = name;
	}
	public String getName() {return myName;}
}