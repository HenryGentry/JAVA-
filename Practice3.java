/**
 * 文 件 名:  Practice3
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  HenryGentry
 * 修改时间:  2018/4/18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */

import java.util.Scanner;

/**
 * 游戏里面有很多各式各样的任务，其中有一种任务玩家只能做一次，这类任务一共有1024个，任务ID范围[1,1024]。
 * 请用32个unsigned int类型来记录着1024个任务是否已经完成。初始状态都是未完成。
 * 输入两个参数，都是任务ID，需要设置第一个ID的任务为已经完成；并检查第二个ID的任务是否已经完成。
 * 输出一个参数，如果第二个ID的任务已经完成输出1，如果未完成输出0。
 * 如果第一或第二个ID不在[1,1024]范围，则输出-1。
 *
 * @author HenryGentry
 * @version 2018/4/18
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Practice3
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt ();
		int j = sc.nextInt ();
		if (i < 1 || i > 1024)
		{
			System.out.print ("-1");
			return;
		}
		if (j < 1 || j > 1024)
		{
			System.out.print ("-1");
			return;
		}
		System.out.print (i == j ? "1" : "0");
	}
}
