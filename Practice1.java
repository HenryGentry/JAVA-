/**
 * 文 件 名:  Practice1
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
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，
 * 则删除之后的第一个字符串变成”Thy r stdnts.”
 *
 * @author HenryGentry
 * @version 2018/4/18
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Practice1
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner (System.in);
		String s1 = scanner.nextLine ();
		String s2 = scanner.nextLine ();
		StringBuilder stringBuilder = new StringBuilder ();
		for (int i = 0; i < s1.length (); i++)
		{
			if (s2.indexOf (s1.charAt (i)) == - 1)
			{
				stringBuilder.append (s1.charAt (i));
			}
		}
		System.out.println (stringBuilder);
	}
}
