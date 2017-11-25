package cn.itcast.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cn.itcast.frame.util.FrameUtil;

public class SnakeView extends JPanel {

	//宽
	public static final int WIDTH = 30;
	
	//高
	public static final int HEIGHT = 30;
	
	
	//每个单元格的宽
	public static final int CELLWITH = 20;
	
	//每个单元格的高
	public static final int CELLHEIGHT = 20;
	
	
	//地图
	boolean[][] background = new boolean[HEIGHT][WIDTH];
	

	
	//蛇
	private LinkedList<Point> snakes = new LinkedList<Point>();
	
	
	//向上移动
	public void moveUP(){
		//获取原始头的位置
		Point head = snakes.getFirst();
		//添加新头
		snakes.addFirst(new Point(head.x,head.y-1));
		//删除蛇尾
		snakes.removeLast();
	}
	
	
	
	public void initSnake(){
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snakes.addFirst(new Point(x-1, y));
		snakes.addFirst(new Point(x, y));
		snakes.addFirst(new Point(x+1, y));
	}
	
	
	//初始化地图
	public void initBackground(){
		for(int rows = 0 ; rows<HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				//第一行、最后一行、 第一列、最后一列
				if(rows==0||rows==(HEIGHT-1)||cols==0||cols==(WIDTH-1)){
					background[rows][cols] =true;
				}else{
					background[rows][cols] = false;
				}
			}
		}
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		//地图
		for(int rows = 0 ; rows< HEIGHT ; rows++){
			for(int cols = 0 ; cols<WIDTH ; cols++){
				if(background[rows][cols]){
					g.setColor(Color.GRAY);
				}else{
					g.setColor(Color.WHITE);
				}
				g.fill3DRect(cols*CELLWITH, rows*CELLHEIGHT, CELLWITH, CELLHEIGHT, true);
			}
		}
		
		
		//画蛇
		//画蛇头
		Point head = snakes.getFirst();
		g.setColor(Color.RED);
		g.fill3DRect(head.x*CELLWITH, head.y*CELLHEIGHT, CELLWITH, CELLHEIGHT, true);
	
		//画蛇蛇
		g.setColor(Color.GREEN);
		for(int i = 1 ; i < snakes.size() ; i++){
			Point body = snakes.get(i);
			g.fill3DRect(body.x*CELLWITH, body.y*CELLHEIGHT, CELLWITH, CELLHEIGHT, true);
		}
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("贪吃蛇");
		final SnakeView snakeView = new SnakeView();
		snakeView.initBackground();
		snakeView.initSnake();
		frame.add(snakeView);
		frame.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode==KeyEvent.VK_UP){
					snakeView.moveUP();
					//如果游戏的状态发生了变化  。 那么应该要重新画画。
					//注意要重新画画不能直接调用paint方法，是需要调用repaint方法，调用repaint其实就是调用了paint方法。
					snakeView.repaint();
				}
			}
			
		});
		
		
		FrameUtil.initFrame(frame, CELLWITH*WIDTH+30, CELLHEIGHT*HEIGHT+50);
		
	}
}
