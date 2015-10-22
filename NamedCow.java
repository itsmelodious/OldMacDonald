class NamedCow extends Cow
{
	private String name;
	public NamedCow(String type, String cowName, String sound)
	{
		name = cowName;
	}
	public String getName()
	{
		return name;
	}
}