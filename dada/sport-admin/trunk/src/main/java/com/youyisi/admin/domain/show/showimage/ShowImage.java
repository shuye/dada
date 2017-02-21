package com.youyisi.admin.domain.show.showimage;

import java.io.Serializable;
import java.util.Date;

import com.youyisi.lang.annotation.Id;

/**
 * @author yinjunfeng
 * @time 2015-08-03
 */
public class ShowImage implements Serializable{
    
	private static final long serialVersionUID = -4060854368801745351L;
	
	@Id
    private Long imgId; //图片ID
	private Long showId; //秀ID
	private String imgUrl; //图片URL
	private Integer imgOrder; //显示顺序
	private Long creator; //创建人
	private Date createdTime; //创建时间
	private Long modifier; //修改人
	private Date updatedTime; //修改时间
	private String status; //数据状态
	
	public void setImgId(Long imgId){
		this.imgId=imgId;
	}
	public Long getImgId(){
		return imgId;
	}
	public void setShowId(Long showId){
		this.showId=showId;
	}
	public Long getShowId(){
		return showId;
	}
	public void setImgUrl(String imgUrl){
		this.imgUrl=imgUrl;
	}
	public String getImgUrl(){
		return imgUrl;
	}
	public void setImgOrder(Integer imgOrder){
		this.imgOrder=imgOrder;
	}
	public Integer getImgOrder(){
		return imgOrder;
	}
	public void setCreator(Long creator){
		this.creator=creator;
	}
	public Long getCreator(){
		return creator;
	}
	public void setCreatedTime(Date createdTime){
		this.createdTime=createdTime;
	}
	public Date getCreatedTime(){
		return createdTime;
	}
	public void setModifier(Long modifier){
		this.modifier=modifier;
	}
	public Long getModifier(){
		return modifier;
	}
	public void setUpdatedTime(Date updatedTime){
		this.updatedTime=updatedTime;
	}
	public Date getUpdatedTime(){
		return updatedTime;
	}
	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return status;
	}
}

