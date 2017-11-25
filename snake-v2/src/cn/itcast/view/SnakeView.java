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

	//��
	public static final int WIDTH = 30;
	
	//��
	public static final int HEIGHT = 30;
	
	
	//ÿ����Ԫ��Ŀ�
	public static final int CELLWITH = 20;
	
	//ÿ����Ԫ��ĸ�
	public static final int CELLHEIGHT = 20;
	
	
	//��ͼ
	boolean[][] background = new boolean[HEIGHT][WIDTH];
	

	
	//��
	private LinkedList<Point> snakes = new LinkedList<Point>();
	
	
	//�����ƶ�
	public void moveUP(){
		//��ȡԭʼͷ��λ��
		Point head = snakes.getFirst();
		//�����ͷ
		snakes.addFirst(new Point(head.x,head.y-1));
		//ɾ����β
		snakes.removeLast();
	}
	
	
	
	public void initSnake(){
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snakes.addFirst(new Point(x-1, y));
		snakes.addFirst(new Point(x, y));
		snakes.addFirst(new Point(x+1, y));
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
				g.fill3DRect(cols*CELLWITH, rows*CELLHEIGHT, CELLWITH, CELLHEIGHT, true);
			}
		}
		
		
		//����
		//����ͷ
		Point head = snakes.getFirst();
		g.setColor(Color.RED);
		g.fill3DRect(head.x*CELLWITH, head.y*CELLHEIGHT, CELLWITH, CELLHEIGHT, true);
	
		//������
		g.setColor(Color.GREEN);
		for(int i = 1 ; i < snakes.size() ; i++){
			Point body = snakes.get(i);
			g.fill3DRect(body.x*CELLWITH, body.y*CELLHEIGHT, CELLWITH, CELLHEIGHT, true);
		}
		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("̰����");
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
					//�����Ϸ��״̬�����˱仯  �� ��ôӦ��Ҫ���»�����
					//ע��Ҫ���»�������ֱ�ӵ���paint����������Ҫ����repaint����������repaint��ʵ���ǵ�����paint������
					snakeView.repaint();
				}
			}
			
		});
		
		
		FrameUtil.initFrame(frame, CELLWITH*WIDTH+30, CELLHEIGHT*HEIGHT+50);
		
	}
}
