package com.fq.common.util;
/**
*类说明
*@author jingkun.chen
*/
public class IntegerUtil {

	/**
	 * 
	 * @Title: getExeAmountByLvNo
	 * @Description: 通过等级计算升级到改级别所需要的经验值  
	 * @param @param lvNo 
	 * @param @return    设定文件
	 * @return Integer    返回类型
	 */
	public static Integer getExeAmountByLvNo( Integer lvNo ){
		if ( lvNo == null || lvNo < 0) {
			return 0 ; 
		}
		// 经验四舍五入
		Integer exeAmount = (int) Math.rint( Math.pow(lvNo ,2.5 ) ) ;
		return exeAmount ;
	}
	/**
	 * 
	 * @Title: getLvNoByExeAmount
	 * @Description: 根据经验值计算等级 
	 * @param @param exeAmount
	 * @param @return    设定文件
	 * @return Integer    返回类型
	 */
	public static Integer getLvNoByExeAmount( Integer exeAmount ){
		if ( exeAmount == null || exeAmount <= 0 ) {
			return 1 ; 
		}
		// 进一法计算
		int newLv = (int) Math.ceil( Math.pow(exeAmount,0.4) ) ;
		return newLv ;
	}
	/**
	 * 
	 * @Title: getLvExeDiffValue
	 * @Description: 计算等级之间差值 
	 * @param @param lvNo 
	 * @param @param nextLvNo
	 * @param @return    设定文件
	 * @return Integer    返回类型
	 */
	public static Integer getLvExeDiffValue(Integer lvNo , Integer nextLvNo){
		Integer currentExeAmt =  getExeAmountByLvNo(lvNo) ; 
		Integer nextExeAmt =  getExeAmountByLvNo(nextLvNo) ; 
		return (nextExeAmt- currentExeAmt)<=0 ? 1 : (nextExeAmt- currentExeAmt); 
		
	}
	public static void main(String[] args) {
		System.out.println(getLvExeDiffValue(-1  ,0) );
		System.out.println(getExeAmountByLvNo(0) );
		System.out.println(getExeAmountByLvNo(1) );
		
		System.out.println(getExeAmountByLvNo(26) );
		System.out.println(getExeAmountByLvNo(27) );
		System.out.println(getLvExeDiffValue(26  ,27) );
	}
}
