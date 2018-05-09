/**
 * 文 件 名:  Practice2
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  HenryGentry
 * 修改时间:  2018/4/18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 有一片1000*1000的草地，小易初始站在(1,1)(最左上角的位置)。
 * 小易在每一秒会横向或者纵向移动到相邻的草地上吃草(小易不会走出边界)。
 * 大反派超超想去捕捉可爱的小易，他手里有n个陷阱。第i个陷阱被安置在横坐标为xi ，纵坐标为yi 的位置上，
 * 小易一旦走入一个陷阱，将会被超超捕捉。
 * 你为了去解救小易，需要知道小易最少多少秒可能会走入一个陷阱，从而提前解救小易。
 *
 * @author HenryGentry
 * @version 2018/4/18
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Practice2
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt ();
		List<Integer> x = new ArrayList<> (n);
		List<Integer> y = new ArrayList<> (n);

		for (int i = 1; i <= n; i++)
		{
			x.add (scanner.nextInt ());
		}

		for (int j = 1; j <= n; j++)
		{
			y.add (scanner.nextInt ());
		}

		int min = (x.get (0) - 1) + (y.get (0) - 1);

		for (int i = 0; i < n; i++)
		{
			if (((x.get (i) - 1) + (y.get (i) - 1)) < min)
			{
				min = (x.get (i) - 1) + (y.get (i) - 1);
			}
		}
		System.out.print (min);
	}
}
