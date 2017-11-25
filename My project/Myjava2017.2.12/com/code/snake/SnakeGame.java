package com.code.snake;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.code.util.FrameUtil;

public class SnakeGame {
	
	public static final int WIDTH=40;
	
	public static final int HIGTH=12;
	
	static char[][] background = new char[HIGTH][WIDTH];//��ͼ
	private static LinkedList<Point> snake = new LinkedList<Point>();//��
	private static Point food;
	
	public static final int DIRECTION_UP = 1;
	public static final int DIRECTION_DOWN = -1;
	public static final int DIRECTION_LEFT = 2;
	public static final int DIRECTION_RIGHT = -2;
	
	private int currentDirection = -2;
	
	public static boolean isGameOver = false;
	
	public void move(){//�ƶ�
		Point head = snake.getFirst();
		switch (currentDirection) {
		case DIRECTION_UP:
			snake.addFirst(new Point(head.x,head.y-1));
			break;
		case DIRECTION_DOWN:
			snake.addFirst(new Point(head.x,head.y+1));
			break;
		case DIRECTION_LEFT:
			snake.addFirst(new Point(head.x-1,head.y));
			break;
		case DIRECTION_RIGHT:
			snake.addFirst(new Point(head.x+1,head.y));
			break;
		}
		if(eatFood()){
		     createFood();
		}else{
			snake.removeLast();
		}
		
		
	}
	
	public void changeDirection(int newDirection){//�ı��߷���
		if(newDirection+currentDirection!=0){
			this.currentDirection = newDirection;
		}
	}
	
	
    public  void createFood(){//����ʳ��
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
    
    public  void showFood(){//��ʾʳ��
    	background[food.y][food.x] = '@';
    }
	
	
	public  void initSnake(){//��ʼ����
		int x=WIDTH/2;
		int y=HIGTH/2;
		snake.addFirst(new Point(x-1,y));
		snake.addFirst(new Point(x,y));
		snake.addFirst(new Point(x+1,y));
	}
	
	public void showSnake(){//��ʾ��
		Point head = snake.getFirst();
		background[head.y][head.x] = '$';
		for(int i=1 ; i<snake.size() ; i++){
			Point body = snake.get(i);
			background[body.y][body.x] = '#';
		}
	}

	public  void initbackground(){//��ʼ����ͼ
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
	
	public  void showbackground(){//��ʾ��ͼ
		for(int rows=0 ; rows<HIGTH ; rows++){
			for(int cols=0 ; cols<WIDTH ; cols++){
				System.out.print(background[rows][cols]);
			}
			System.out.println();
	}
}
	public  void refresh(){//ˢ����Ϸ
		initbackground();
		showSnake();
		showFood();
		showbackground();
	}
	
	public  boolean eatFood(){//��ʳ��
		Point head = snake.getFirst();
		if(head.equals(food)){
			return true;
		}else
			return false;
	}
	
	public  void isGameOver(){//��Ϸ����
		Point head = snake.getFirst();
		if(background[head.y][head.x]=='*'){
			isGameOver = true;
		}
		for(int i=1 ; i<snake.size() ; i++){
			Point body = snake.get(i);
			if(body.equals(head)){
			isGameOver = true;
			}
		}
		
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		final SnakeGame game = new SnakeGame();
		game.initbackground();
		game.initSnake();
		game.showSnake();
		game.createFood();
		game.showFood();	
		game.showbackground();
	
		JFrame frame = new JFrame("���������");
		frame.add(new JButton("��"),BorderLayout.NORTH);
		frame.add(new JButton("��"),BorderLayout.SOUTH);
		frame.add(new JButton("��"),BorderLayout.WEST);
		frame.add(new JButton("��"),BorderLayout.EAST);
		JButton button = new JButton("���������");
		frame.add(button);
		button.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					game.changeDirection(DIRECTION_UP);
					break;
				case KeyEvent.VK_DOWN:
					game.changeDirection(DIRECTION_DOWN);
					break;
				case KeyEvent.VK_LEFT:
					game.changeDirection(DIRECTION_LEFT);
					break;
				case KeyEvent.VK_RIGHT:
					game.changeDirection(DIRECTION_RIGHT);
					break;
				
				}game.move();
				game.isGameOver();
				if(game.isGameOver==true){
					System.out.println("��Ϸ����");
					game.refresh();
					System.exit(0);
				}
				game.refresh();
				
			}

		
		});
		
		FrameUtil.initFrame(frame, 300, 300);
	}
}
