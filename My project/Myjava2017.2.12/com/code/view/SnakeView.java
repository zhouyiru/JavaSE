package com.code.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.code.snake.SnakeGame;
import com.code.util.FrameUtil;

@SuppressWarnings("serial")
public class SnakeView extends JPanel {

	//��
	public static final int WIDTH = 30;
	
	//��
	public static final int HEIGHT = 30;
	
	
	//ÿ����Ԫ��Ŀ�
	public static final int CELLWIDTH = 20;
	
	//ÿ����Ԫ��ĸ�
	public static final int CELLHEIGHT = 20;
	
	Point food;
	
	//��ͼ
	boolean[][] background = new boolean[HEIGHT][WIDTH];
	
	//��
	private LinkedList<Point> snake = new LinkedList<Point>();
	
	public boolean isGameOver = false;
	
	public void moveUp(){//�����ƶ�
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x,head.y-1));
		snake.removeLast();
	}
	
	public void moveDown(){//�����ƶ�
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x,head.y+1));
		snake.removeLast();
	}
	
	public void moveLeft(){//�����ƶ�
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x-1,head.y));
		snake.removeLast();
	}
	
	public void moveRight(){//�����ƶ�
		Point head = snake.getFirst();
		snake.addFirst(new Point(head.x+1,head.y));
		snake.removeLast();
	}
	

    public  void createFood(){//����ʳ��
    	Random random = new Random();
    	while(true){
    	int x = random.nextInt(WIDTH);
    	int y = random.nextInt(HEIGHT);
    	if(background[y][x]!= true){
    		food = new Point(x,y);
    		break;
    	}
    }
  }
	public void initSnake(){//��ʼ����
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snake.addFirst(new Point(x-1, y));
		snake.addFirst(new Point(x, y));
		snake.addFirst(new Point(x+1, y));
	}
	
	
	//��ʼ����ͼ
	public void initBackground(){
		for(int rows = 0 ; rows<HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				//��һ�С����һ�С� ��һ�С����һ��
				if(rows==0||rows==(HEIGHT-1)||cols==0||cols==(WIDTH-1)){
					background[rows][cols] =true;
				}else{
					background[rows][cols] = false;
				}
			}
		}
	}
	
	public  void isGameOver(){//��Ϸ����
		Point head = snake.getFirst();
		if(background[head.y][head.x]==true){
			isGameOver = true;
		}
		for(int i=1 ; i<snake.size() ; i++){
			Point body = snake.get(i);
			if(body.equals(head)){
			isGameOver = true;
			}
		}
	}
		
	@Override
	public void paint(Graphics g) {
		//��ͼ
		for(int rows = 0 ; rows< HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				if(background[rows][cols]){
					g.setColor(Color.GRAY);
				}else{
					g.setColor(Color.WHITE);
				}
				g.fill3DRect(cols*CELLWIDTH, rows*CELLHEIGHT, CELLWIDTH, CELLHEIGHT, true);
			}
		}
	
		//����
		//����ͷ
		Point head = snake.getFirst();
		g.setColor(Color.RED);
		g.fill3DRect(head.x*CELLWIDTH, head.y*CELLHEIGHT, CELLWIDTH, CELLHEIGHT, true);
	
		//������
		g.setColor(Color.GREEN);
		for(int i = 1 ; i < snake.size() ; i++){
			Point body = snake.get(i);
			g.fill3DRect(body.x*CELLWIDTH, body.y*CELLHEIGHT, CELLWIDTH, CELLHEIGHT, true);
		}
		//��ʳ��
		
		g.setColor(Color.BLUE);
		g.fill3DRect(food.x*CELLWIDTH, food.y*CELLHEIGHT, CELLWIDTH, CELLHEIGHT, true);
		
	}
	

	public static void main(String[] args) {
		final SnakeGame game = new SnakeGame();
		JFrame frame = new JFrame("̰����");
		final SnakeView snakeView = new SnakeView();
		snakeView.initBackground();
		snakeView.initSnake();
		frame.add(snakeView);
		frame.addKeyListener(new KeyAdapter() {

			@SuppressWarnings("static-access")
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				switch (keyCode) {
				case KeyEvent.VK_UP:
					snakeView.moveUp();
					//�����Ϸ��״̬�����˱仯  �� ��ôӦ��Ҫ���»�����
					//ע��Ҫ���»�������ֱ�ӵ���paint����������Ҫ����repaint����������repaint��ʵ���ǵ�����paint������
					snakeView.repaint();
					break;
				case KeyEvent.VK_DOWN:
					snakeView.moveDown();
					snakeView.repaint();
					break;
				case KeyEvent.VK_LEFT:
					snakeView.moveLeft();
					snakeView.repaint();
					break;
				case KeyEvent.VK_RIGHT:
					snakeView.moveRight();
					snakeView.repaint();
					break;
				
				}game.isGameOver();
				if(game.isGameOver==true){
					System.out.println("��Ϸ����");
					game.refresh();
					System.exit(0);
				}
			}
			
		});
		
		
		FrameUtil.initFrame(frame, CELLWIDTH*WIDTH+30, CELLHEIGHT*HEIGHT+50);
		
	}
}

