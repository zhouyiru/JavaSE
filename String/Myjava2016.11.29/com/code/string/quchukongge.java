package com.code.string;

public class quchukongge {

	public static String mytrim(String str) {
		// TODO Auto-generated method stub

		int start = 0;
	    int end = str.length()-1;
	    for (int i = 0; i<str.length() ; i++ )
	    {
	         if ( str.charAt(i) == ' ' )
	         {
	              start++;
	         }else{
	 		     break;
	 		}
	    }
	   // System.out.println( start );
	    for (; end<str.length() && end >= 0;  )
	    {
	         if ( str.charAt(end) == ' ' )
	         {
	              end--;
	         }else{
	 		     break;
	 		}
	    }
	    //System.out.println( end );
	    // 2. ���Ӵ�
	    if( start < end ){
	      
	 	 return str.substring( start , (end+1) ); //��ͷ����β
	    }else{
	      
	 	 return ""; 
	    }
	}
	public static void main(String[] args) {
		String str=" nb a  ";
		System.out.println(mytrim(str)); 
	}
}
