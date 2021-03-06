package player_Monster;

public class Item {
	
	private String name;                           // *       0 : Default (None) 
	private int itemcode;                          // *  1 ~ 10 : Helmet
	private int att,hp,def;                        // *  11~ 20 : Weapon
	private int requiredLevel;                     // *  21~ 30 : Armor
	private int amount;                            // *  31~ 40 : Shield
	private int price; // never used yet           // *  41~ 50 : Boots
	private boolean isEquipped = false;            // *  51~ 60 : Consumables  
	
	Item(int itemcode,int att, int hp, int def){
		AllText text = null;
		switch(GameMain.language){
		case 1:
			text = new AllText_ENG();
			break;
		case 2:
			text = new AllText_KOR();
			break;
		}
		
		this.setName(text.getItemName(itemcode));
		this.setItemcode(itemcode);
		this.setRequiredLevel(text.getItemLevel(itemcode));
		this.att= att;
		this.hp = hp;
		this.def = def;
	}
	
	String statsToString(){
		String stats="";
		if(att > 0){
			stats += "[att +";stats += att;	stats += "]";
		}
		if(hp > 0){
			stats += "[hp +";stats += hp;stats += "]";
		}
		if(def > 0){
			stats += "[def +";stats += def;stats += "]";
		}
		return stats;
	}

	public int getItemcode() {
		return itemcode;
	}

	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}

	public int getRequiredLevel() {
		return requiredLevel;
	}

	public void setRequiredLevel(int requiredLevel) {
		this.requiredLevel = requiredLevel;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isEquipped() {
		return isEquipped;
	}

	public void setEquipped(boolean isEquipped) {
		this.isEquipped = isEquipped;
	}
	
	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
