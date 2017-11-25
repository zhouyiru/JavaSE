package com.code.snake;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame1 {
	
	public static final int WIDTH=40;
	
	public static final int HIGTH=12;
	
	char[][] background = new char[HIGTH][WIDTH];//地图
	LinkedList<Point> snake = new LinkedList<Point>();//蛇
	Point food;
	
	
	public void moveUp(){//向上移动
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x,head.y-1));
		snake.removeLast();
	}
	
	public void moveDown(){//向下移动
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x,head.y+1));
		snake.removeLast();
	}
	
	public void moveLeft(){//向左移动
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x-1,head.y));
		snake.removeLast();
	}
	
	public void moveRight(){//向右移动
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x+1,head.y));
		snake.removeLast();
	}
	
    public void createFood(){//生成食物
    	Random random = new Random();
    	while(true){
    	int x = random.nextInt(WIDTH);
    	int y = random.nextInt(HIGTH);
    	if(background[y][x]!='*'){
    		food = new Point(x,y);
    		break;
    	}
    }
  }
    
    public void showFood(){//显示事物
    	background[food.y][food.x] = '@';
    }
	
	
	public void initSnake(){//初始化蛇
		int x=WIDTH/2;
		int y=HIGTH/2;
		snake.addFirst(new Point(x-1,y));
		snake.addFirst(new Point(x,y));
		snake.addFirst(new Point(x+1,y));
	}
	
	public void showSnake(){//显示蛇
		Point head = snake.getFirst();
		background[head.y][head.x] = '$';
		for(int i=1 ; i<snake.size() ; i++){
			Point body = snake.get(i);
			background[body.y][body.x] = '#';
		}
	}

	public void initbackground(){//初始化地图
		for(int rows=0 ; rows<HIGTH ; rows++){
			for(int cols=0 ; cols<WIDTH ; cols++){
				if(rows==0||rows==(HIGTH-1)||cols==0||cols==(WIDTH-1)){
					background[rows][cols] = '*';
				}else{
					background[rows][cols] = ' ';
				}
			}
		}
	}
	
	public void showbackground(){//显示地图
		for(int rows=0 ; rows<HIGTH ; rows++){
			for(int cols=0 ; cols<WIDTH ; cols++){
				System.out.print(background[rows][cols]);
			}
			System.out.println();
	}
}
	public void refresh(){//刷新游戏
		initbackground();
		showSnake();
		showFood();
		showbackground();
	}
	
	public static void main(String[] args) throws Exception {
		SnakeGame1 game = new SnakeGame1();
		game.initbackground();
		game.initSnake();
		game.showSnake();
		game.createFood();
		game.showFood();
		
		game.showbackground();
		
		for(int i=0 ; i<3 ; i++){
			game.moveUp();
		    game.refresh();
			Thread.sleep(1000);
		}
		for(int i=0 ; i<3 ; i++){
			game.moveLeft();
		    game.refresh();
			Thread.sleep(1000);
		}
		for(int i=0 ; i<3 ; i++){
			game.moveDown();
		    game.refresh();
			Thread.sleep(1000);
		}
		for(int i=0 ; i<3 ; i++){
			game.moveRight();
		    game.refresh();
			Thread.sleep(1000);
		}
	}
}
