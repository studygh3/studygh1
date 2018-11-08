
/** 
* Project Name:gitstudy <br/> 
* File Name:HenHappy.java <br/>
* Package Name:com.study.git <br/>
* Date:2018年10月31日下午1:03:54 *<br/>
* Copyright (c) 2018, HC., LTD. All Rights Reserved.<br/>
* */
package com.study.git;


/** 
* ClassName: HenHappy <br/>
* Function: TODO (这里描述这个类提供什么功能/服务/能力 – 可选).<br/> 
* Reason: TODO (这里描述这个类的必要性 – 可选).<br/>
* date: 2018年10月31日 下午1:03:54 *<br/>
* @author whk00196 
* @version  
* @since JDK 1.8
**/
import java.util.Scanner;

/** 
* ClassName: HenHappy <br/>
* Function: TODO (这里描述这个类提供什么功能/服务/能力 – 可选).<br/> 
* Reason: TODO (这里描述这个类的必要性 – 可选).<br/>
* date: 2018年10月31日 下午1:03:54 *<br/>
* @author whk00196 
* @version  
* @since JDK 1.8
**/
public class HenHappy {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("输入数字进行累加");
		String s = null;
		int t = 0;
		int total = 0;
		while(true) {
			System.out.println("本次输入的为:");
			s = input.nextLine();
			if("n".equalsIgnoreCase(s)) {
				break;
			}
			System.out.println(s);
			t = Integer.valueOf(s);
			total += t;
			System.out.println("目前总计为:"+total);
		};
		System.out.println("本次计算结束!总数为:"+total);
	}
}
