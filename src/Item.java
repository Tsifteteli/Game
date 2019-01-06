public class Item {
    
    private String itemType;
    
    public void Item(){
        itemType="Key";
    }
    public void Item(String itemType){
        this.itemType=itemType;
    }
    
    public String getType(){
        return itemType;
    }
    
}
