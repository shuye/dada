package com.youyisi.sports.domain.medal;

import com.youyisi.sports.domain.BaseEntity;

/**
 * @author shuye
 * @time 2016-09-05
 */


public class UserMedal extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7885597080856310926L;
	private Long medalId; //
	private Long userId; //
	private Long createTime; //

	public void setMedalId(Long medalId){
		this.medalId=medalId;
	}
	public Long getMedalId(){
		return medalId;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}
	public Long getUserId(){
		return userId;
	}
	public void setCreateTime(Long createTime){
		this.createTime=createTime;
	}
	public Long getCreateTime(){
		return createTime;
	}
}

