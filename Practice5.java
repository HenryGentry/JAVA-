/**
 * 文 件 名:  Practice5
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  HenryGentry
 * 修改时间:  2018/5/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */

import java.util.Scanner;

/**
 * 小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,
 * 但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
 * 魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
 * 魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
 * 小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,
 * 小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。
 *
 * @author HenryGentry
 * @version 2018/5/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Practice5
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		while (scanner.hasNext ())
		{
			int n = scanner.nextInt ();
			StringBuilder stringBuilder = new StringBuilder ();
			while (n > 0)
			{
				if (n % 2 == 0)
				{
					n = (n - 2) / 2;
					stringBuilder.append ("2");
				}
				else
				{
					n = (n - 1) / 2;
					stringBuilder.append ("1");
				}
			}
			System.out.println (stringBuilder.reverse ().toString ());
		}
	}
}
