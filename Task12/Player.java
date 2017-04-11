class Player{
	int x,y;
	Player(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void move(int dx,int dy){
		x+=dx;
		y+=dy;
	}
}
