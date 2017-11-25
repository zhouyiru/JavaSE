package cn.itcast.snake;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;
/*
 
 ʳ����ʵ����һ�����꣬ 
 */










import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import cn.itcast.frame.util.FrameUtil;

public class SnakeGame {
	
	//��
	public static final int WIDTH = 40;
	
	//��
	public static final int HEIGHT = 10;
	
	
	//��ͼ
	char[][] background = new char[HEIGHT][WIDTH];
	
	
	//��
	private LinkedList<Point> snakes = new LinkedList<Point>();
	
	//ʳ��
	private Point food; 
	
	
	//�ĸ������������ĸ�����
	public static final int DIRECTION_UP = 1;  //��
	
	public static final int DIRECTION_DOWN = -1;  //��
	
	public static final int DIRECTION_LEFT = 2;  //��
	
	public static final int DIRECTION_RIGHT = -2; // ��
	
	//��ǰ�ķ���
	private int currentDirecion =-2;
	
	
	private boolean isGameOver = false; //Ĭ��û�н���
	
	
	//���ƶ�Ӧ���Ǹ��ݵ�ǰ�ķ�������ƶ��ġ�
	public void move(){
		//��ȡԭʼͷ��λ��
		Point head = snakes.getFirst();
		switch (currentDirecion) {
			case DIRECTION_UP:
					snakes.addFirst(new Point(head.x,head.y-1));
				break;
			case DIRECTION_DOWN:
				snakes.addFirst(new Point(head.x,head.y+1));			
				break;
			case DIRECTION_LEFT:
				snakes.addFirst(new Point(head.x-1,head.y));
				break;
			case DIRECTION_RIGHT:
				snakes.addFirst(new Point(head.x+1,head.y));
				break;
		}
		
		if(eatFood()){
			createFood();
			
		}else{
			//ɾ����β
			snakes.removeLast();
		}
	}
	
	
	 //�ı��߷���ķ���
	public void changeDirection(int newDirection){
		if(newDirection+currentDirecion!=0){
			//���Ƿ�����
			 this.currentDirecion = newDirection;
			
		}
		
	}
	
	


	
	
	//����ʳ��
	public void createFood(){
		Random random = new Random();
		while(true){
			int x = random.nextInt(WIDTH); //
			int y = random.nextInt(HEIGHT);
			if(background[y][x]!='*'){
				food = new Point(x, y);
				break;
			}
		}
	}
	
	
	//��ʾʳ��--- ��ʳ������귴������ͼ�ϣ��ڵ�ͼ�ϻ�����Ӧ���ַ�
	public void showFood(){
		background[food.y][food.x] = '@';
		
	}
	
	//��ʼ���߽ڵ�
	public void initSnake(){
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snakes.addFirst(new Point(x-1, y));
		snakes.addFirst(new Point(x, y));
		snakes.addFirst(new Point(x+1, y));
	}
	
	
	//��ʾ�ߣ����ߵ����귴������ͼ�ϣ��ڵ�ͼ�϶�Ӧ��λ�û��϶�Ӧ�ķ��Ŷ��ѣ�
	public void showSnake(){
		//����ͷ
		Point head  = snakes.getFirst();
		background[head.y][head.x] = '$';
		
		//������
		for(int i =1 ; i< snakes.size() ; i++){
			Point body = snakes.get(i);
			background[body.y][body.x] = '#';
		}	
	}
	
	
	//��ʼ����ͼ
	public void initBackground(){
		for(int rows = 0 ; rows<HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				//��һ�С����һ�С� ��һ�С����һ��
				if(rows==0||rows==(HEIGHT-1)||cols==0||cols==(WIDTH-1)){
					background[rows][cols] = '*';
				}else{
					background[rows][cols] = ' ';
				}
			}
		}
	}
	
	
	//��ʾ��ͼ�ķ���
	public void showBackground(){
		for(int rows = 0 ; rows<HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				System.out.print(background[rows][cols]);
			}
			System.out.println();
		}
		
	}
	
	
	//ˢ����Ϸ������״̬
	public void refresh(){
		 //����Ϸ ֮ǰ��״̬�����
		 initBackground();
		 //������ �µ�״̬��ʾ
		 showSnake();
		 //��ʾʳ��
		 showFood();
		 //��ʾ��ͼ
		 showBackground();
	}
	
	
	//��ʳ��
	public boolean eatFood(){
		//��ȡ��ͷ
		Point head = snakes.getFirst();
		if(head.equals(food)){
			return true;
		}else{
			return false;
		}
	}
	
	
	//��Ϸ��������
	public void  isGameOver(){
		//ײǽ
		Point head = snakes.getFirst();
		if(background[head.y][head.x] =='*'){
			isGameOver = true;
		}
		
		//ҧ�����Լ�
		for(int i = 1; i<snakes.size() ; i++){
			Point body = snakes.get(i);
			if(body.equals(head)){
				isGameOver = true;
			}
		}
		
	}
	
	
	 public static void main(String[] args) throws Exception {
		 final SnakeGame game = new SnakeGame();
		 game.initBackground();
		 //��ʼ����
		 game.initSnake();
		 //���ߵĽڵ㷴������ͼ�ϣ��ڶ�Ӧ��λ���ϻ��϶�Ӧ�ķ���
		 game.showSnake();
		 ;
		 //��ʼ��ʳ��
		 game.createFood();
		 //��ʾʳ��
		 game.showFood();
		 
		 //�ѵ�ͼ��ӡ����
		 game.showBackground();
		 
		 JFrame frame = new JFrame("���������");
		 frame.add(new JButton("��"),BorderLayout.NORTH);
		 frame.add(new JButton("��"),BorderLayout.SOUTH);
		 frame.add(new JButton("��"),BorderLayout.WEST);
		 frame.add(new JButton("�� "),BorderLayout.EAST);
		 JButton button = new JButton("���������") ; 
		 frame.add(button);
		 
		 //����ť���һ���¼�������
		  button.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode  =	e.getKeyCode();
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

				default:
					break;
				}
				
				game.move();
				game.isGameOver(); //ÿ����һ����Ӧ���ж������Ѿ�����
				if(game.isGameOver==true){
					game.refresh();
					System.out.println("��Ϸ�Ѿ�����~88");
					System.exit(0);
				}
				game.refresh();
			}			  
		});
		 
		 
		 FrameUtil.initFrame(frame, 300, 300);
	}

}
