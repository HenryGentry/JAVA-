/**
 * 文 件 名:  Sort
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  zhouhaofeng
 * 修改时间:  2018/4/2
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */

/**
 * 排序算法
 *
 * @author zhouhaofeng
 * @version 2018/4/2
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Sort
{
	/**
	 * 冒泡排序
	 *
	 * @param numberList 号码列表
	 */
	public static void bubbleSort (int[] numberList)
	{
		for (int j = numberList.length; j > 0; j--)
		{
			for (int i = 0; i < j-1; i++)
			{
				if (numberList[i] > numberList[i + 1])
				{
					int temp = numberList[i + 1];
					numberList[i + 1] = numberList[i];
					numberList[i] = temp;
				}
			}
		}
	}
}
