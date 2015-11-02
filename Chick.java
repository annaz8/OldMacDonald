class Chick implements Animal 
{     
    private String chickType;
    private String chickSound;
    private String chickSound2;
    public Chick(String type, String sound)
    {
    	chickType = type;
    	chickSound = sound;
    }
    public Chick()
    {
    	chickType = "unknown";
    	chickSound = "unknown";
    }
    public Chick(String type, String sound, String sound2)
    {
        chickType = type;
        chickSound = sound;
        chickSound2 = sound2;
    }
    public String getSound()
    {
        if(Math.random() < .5)
        {
            return chickSound;
        }
        else
        {
            return chickSound2;
        }
    }
    public String getType(){return chickType;}
}