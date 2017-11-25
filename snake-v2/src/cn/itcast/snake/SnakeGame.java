package cn.itcast.snake;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;
/*
 
 食物其实就是一个坐标， 
 */










import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import cn.itcast.frame.util.FrameUtil;

public class SnakeGame {
	
	//宽
	public static final int WIDTH = 40;
	
	//高
	public static final int HEIGHT = 10;
	
	
	//地图
	char[][] background = new char[HEIGHT][WIDTH];
	
	
	//蛇
	private LinkedList<Point> snakes = new LinkedList<Point>();
	
	//食物
	private Point food; 
	
	
	//四个常量代表了四个方向
	public static final int DIRECTION_UP = 1;  //上
	
	public static final int DIRECTION_DOWN = -1;  //下
	
	public static final int DIRECTION_LEFT = 2;  //左
	
	public static final int DIRECTION_RIGHT = -2; // 右
	
	//当前的方向
	private int currentDirecion =-2;
	
	
	private boolean isGameOver = false; //默认没有结束
	
	
	//蛇移动应该是根据当前的方向进行移动的。
	public void move(){
		//获取原始头的位置
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
			//删除蛇尾
			snakes.removeLast();
		}
	}
	
	
	 //改变蛇方向的方法
	public void changeDirection(int newDirection){
		if(newDirection+currentDirecion!=0){
			//不是反方向
			 this.currentDirecion = newDirection;
			
		}
		
	}
	
	


	
	
	//生成食物
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
	
	
	//显示食物--- 把食物的坐标反馈到地图上，在地图上画上相应的字符
	public void showFood(){
		background[food.y][food.x] = '@';
		
	}
	
	//初始化蛇节点
	public void initSnake(){
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snakes.addFirst(new Point(x-1, y));
		snakes.addFirst(new Point(x, y));
		snakes.addFirst(new Point(x+1, y));
	}
	
	
	//显示蛇（把蛇的坐标反馈到地图上，在地图上对应的位置画上对应的符号而已）
	public void showSnake(){
		//画蛇头
		Point head  = snakes.getFirst();
		background[head.y][head.x] = '$';
		
		//画蛇身
		for(int i =1 ; i< snakes.size() ; i++){
			Point body = snakes.get(i);
			background[body.y][body.x] = '#';
		}	
	}
	
	
	//初始化地图
	public void initBackground(){
		for(int rows = 0 ; rows<HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				//第一行、最后一行、 第一列、最后一列
				if(rows==0||rows==(HEIGHT-1)||cols==0||cols==(WIDTH-1)){
					background[rows][cols] = '*';
				}else{
					background[rows][cols] = ' ';
				}
			}
		}
	}
	
	
	//显示地图的方法
	public void showBackground(){
		for(int rows = 0 ; rows<HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				System.out.print(background[rows][cols]);
			}
			System.out.println();
		}
		
	}
	
	
	//刷新游戏的最新状态
	public void refresh(){
		 //把游戏 之前的状态先清空
		 initBackground();
		 //把蛇最 新的状态显示
		 showSnake();
		 //显示食物
		 showFood();
		 //显示地图
		 showBackground();
	}
	
	
	//吃食物
	public boolean eatFood(){
		//获取蛇头
		Point head = snakes.getFirst();
		if(head.equals(food)){
			return true;
		}else{
			return false;
		}
	}
	
	
	//游戏结束方法
	public void  isGameOver(){
		//撞墙
		Point head = snakes.getFirst();
		if(background[head.y][head.x] =='*'){
			isGameOver = true;
		}
		
		//咬到了自己
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
		 //初始化蛇
		 game.initSnake();
		 //把蛇的节点反馈到地图上，在对应的位置上画上对应的符号
		 game.showSnake();
		 ;
		 //初始化食物
		 game.createFood();
		 //显示食物
		 game.showFood();
		 
		 //把地图打印出来
		 game.showBackground();
		 
		 JFrame frame = new JFrame("方向控制器");
		 frame.add(new JButton("↑"),BorderLayout.NORTH);
		 frame.add(new JButton("↓"),BorderLayout.SOUTH);
		 frame.add(new JButton("←"),BorderLayout.WEST);
		 frame.add(new JButton("→ "),BorderLayout.EAST);
		 JButton button = new JButton("方向控制器") ; 
		 frame.add(button);
		 
		 //给按钮添加一个事件监听器
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
				game.isGameOver(); //每行走一步都应该判断蛇是已经死亡
				if(game.isGameOver==true){
					game.refresh();
					System.out.println("游戏已经结束~88");
					System.exit(0);
				}
				game.refresh();
			}			  
		});
		 
		 
		 FrameUtil.initFrame(frame, 300, 300);
	}

}
