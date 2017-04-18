class Player{
	int x,y;
	Player(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void move(String direction){
		if (direction.equals("north")){
			y-=1;	
		}
		else if (direction.equals("south")){
			y+=1;
		}
		else if (direction.equals("west")){
			x+=1;
		}
		else if (direction.equals("east")){
			x-=1;
		}
	}
}
