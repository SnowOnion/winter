package hello;

public class Fakebook {

    private final String name;
    private final String about;
    private final String uselessStr;
    private final Integer uselessInt;

    public Fakebook(String name,String about,String uselessStr,Integer uselessInt){
	this.name=name;
	this.about=about;
	this.uselessStr=uselessStr;
	this.uselessInt=uselessInt;
    }

    public String getName(){
	return name;
    }

    public String getAbout(){
	return about;
    }

    public String getUselessStr(){
	return uselessStr;
    }

    public Integer getUselessInt(){
	return uselessInt;
    }

}
