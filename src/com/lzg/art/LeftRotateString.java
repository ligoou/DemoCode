package com.lzg.art;

/**
 * 说明
 *
 * @author  lizg
 * @version V1.0  创建时间：2014-1-20 下午5:14:53
 */
public class LeftRotateString {
	
	public static String retateString(String str,int num){
		byte[] newStrArr=str.getBytes().clone();
		while(num!=0){
			num--;
			byte tem=newStrArr[str.length()-1];
			for(int i=str.length()-1;i>0;i--){
				newStrArr[i]=newStrArr[i-1];
			}
			newStrArr[0]=tem;
		}
		return new String(newStrArr);
	}
	
	public static void main(String[] args) {
		System.out.println(LeftRotateString.retateString("abcdef", 2));
	}

}
