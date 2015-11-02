class Pig implements Animal 
{     
    private String pigSound;
    private String pigType;
    public Pig(String type, String sound)
    {
    	pigSound = sound;
    	pigType = type;
    }
    public Pig()
    {
    	pigSound = "unknown";
    	pigType = "unknown";
    }
    public String getSound(){return pigSound;}
    public String getType(){return pigType;}
}