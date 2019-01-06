public class Player {

    private String name;
    private int damage = 1;
    private int helth = 10;
    private String chose;
    private Item item=null;
	
    public Player(String name) {
	this.name = name;
    }
	
    public Boolean hasKey(){
        Boolean key = false;
        if(item != null){
            if(item.getType()=="Key"){
                key = true;
            }
        }
        return key;
    }

    public void setChose(String chose){
        this.chose = chose;
    }

    public String getChose(){
        return chose;
    }

    public String getName(){
        return this.name;
    }
    
    public void reciveItem(Item item){
        this.item = item;
    }
	
}