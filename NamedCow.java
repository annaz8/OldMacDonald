class NamedCow extends Cow 
{
	private String cowName;
	public NamedCow(String type, String sound, String name)
	{
		cowType = type;
		cowSound = sound;
		cowName = name;
	}
	public String getName()
	{
		return cowName;
	}
}