package com.young.xshop.entity;

/**
 * Database Table Remarks:
 *   购物车信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table cart_info
 */
public class CartInfo {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   所属商品
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.goods_id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     * Database Column Remarks:
     *   数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.count
     *
     * @mbg.generated
     */
    private Integer count;

    /**
     * Database Column Remarks:
     *   所属用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * Database Column Remarks:
     *   用户等级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart_info.createTime
     *
     * @mbg.generated
     */
    private String createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.id
     *
     * @return the value of cart_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.id
     *
     * @param id the value for cart_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.goods_id
     *
     * @return the value of cart_info.goods_id
     *
     * @mbg.generated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.goods_id
     *
     * @param goodsId the value for cart_info.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.count
     *
     * @return the value of cart_info.count
     *
     * @mbg.generated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.count
     *
     * @param count the value for cart_info.count
     *
     * @mbg.generated
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.user_id
     *
     * @return the value of cart_info.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.user_id
     *
     * @param userId the value for cart_info.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.level
     *
     * @return the value of cart_info.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.level
     *
     * @param level the value for cart_info.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart_info.createTime
     *
     * @return the value of cart_info.createTime
     *
     * @mbg.generated
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart_info.createTime
     *
     * @param createtime the value for cart_info.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }
}