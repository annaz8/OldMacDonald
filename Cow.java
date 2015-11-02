class Cow implements Animal 
{     
    protected String cowType;
    protected String cowSound;
    public Cow(String type, String sound)
    {
    	cowType = type;
    	cowSound = sound;
    }
    public Cow()
    {
    	cowType ="unknown";
    	cowSound = "unknown";
    }
    public String getSound(){return cowSound;}
    public String getType(){return cowType;}
}	
