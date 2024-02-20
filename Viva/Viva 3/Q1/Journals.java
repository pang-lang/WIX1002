
package viva3;

public class Journals {
    private String Title;
    private String Volume;
    
    Journals(String Title,String Volume){
        this.Title=Title;
        this.Volume=Volume;
    }
    
    public String getTitle(){
        return this.Title;
    }
    
    public String getVolume(){
        return this.Volume;
    }
    
    public void setTitle(String title){
        this.Title=title;
    }
    public void setVolume(String Volume){
        this.Volume=Volume;
    }
}