/**
 * 文 件 名:  Practice4
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
 * 为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。
 * 例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,
 * 之后再加上原先的数,我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。
 * 例如n = 100, 颠倒之后是1.
 *
 * @author HenryGentry
 * @version 2018/5/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Practice4
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		while (scanner.hasNext ())
		{
			int n = scanner.nextInt ();
			StringBuilder stringBuilder = new StringBuilder ();
			stringBuilder.append (n);
			int reverseNumber = Integer.valueOf (stringBuilder.reverse ().toString ());
			System.out.println (n + reverseNumber);
		}
	}
}
