package jp.co.internous.ecsite.model.dto;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
    private int id;
    private int userId;
    private int goodsId;
    private String goodsName;
    private int itemCount;
    private int totalCount;
    private Timestamp createdAt;

    public HistoryDto() {}
    
    public HistoryDto(TblPurchase entity) {
    	 this.id = entity.getId();
         this.userId = entity.getUserId();       
         this.goodsId = entity.getGoodsId();     
         this.goodsName = entity.getGoodsName();  
         this.itemCount = entity.getItemCount();
         this.totalCount = entity.getTotal();
    	
    	Timestamp d = entity.getCreatedAt();
    	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.createdAt = f.format(d);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getFormattedCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
    	this.createdAt = createdAt;
    }
}