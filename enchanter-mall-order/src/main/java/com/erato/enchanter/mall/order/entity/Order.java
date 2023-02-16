package com.erato.enchanter.mall.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(Order)实体类
 *
 * @author zhangyuan
 * @since 2023-02-16 23:17:16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    private static final long serialVersionUID = -62896844145924198L;
    /**
     * id
     */
    private Long id;
    /**
     * member_id
     */
    private Long memberId;
    /**
     * 订单号
     */
    private String orderSn;
    /**
     * 使用的优惠券
     */
    private Long couponId;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * 用户名
     */
    private String memberUsername;
    /**
     * 订单总额
     */
    private Double totalAmount;
    /**
     * 应付总额
     */
    private Double payAmount;
    /**
     * 运费金额
     */
    private Double freightAmount;
    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    private Double promotionAmount;
    /**
     * 优惠券抵扣金额
     */
    private Double couponAmount;
    /**
     * 支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】
     */
    private Integer payType;
    /**
     * 订单来源[0->PC订单；1->app订单]
     */
    private Integer sourceType;
    /**
     * 订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】
     */
    private Integer status;
    /**
     * 物流单号
     */
    private String deliverySn;
    /**
     * 收货人姓名
     */
    private String receiverName;
    /**
     * 收货人电话
     */
    private String receiverPhone;
    /**
     * 地址
     */
    private String receiverAddress;
    /**
     * 订单备注
     */
    private String note;
    /**
     * 删除状态【0->未删除；1->已删除】
     */
    private Integer deleteStatus;
    /**
     * 支付时间
     */
    private Date paymentTime;
    /**
     * 发货时间
     */
    private Date deliveryTime;
    /**
     * 确认收货时间
     */
    private Date receiveTime;
    
}

