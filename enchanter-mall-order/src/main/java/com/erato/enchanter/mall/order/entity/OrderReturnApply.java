package com.erato.enchanter.mall.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.io.Serializable;

/**
 * (OrderReturnApply)实体类
 *
 * @author zhangyuan
 * @since 2023-02-17 22:54:59
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderReturnApply implements Serializable {
    private static final long serialVersionUID = -67577963797498381L;
    /**
     * id
     */
    private Long id;
    /**
     * order_id
     */
    private Long orderId;
    /**
     * 退货商品id
     */
    private Long skuId;
    /**
     * 订单编号
     */
    private String orderSn;
    /**
     * 申请时间
     */
    private Date createTime;
    /**
     * 会员用户名
     */
    private String memberUsername;
    /**
     * 退款金额
     */
    private Double returnAmount;
//    /**
//     * 退货人姓名
//     */
//    private String returnName;
//    /**
//     * 退货人电话
//     */
//    private String returnPhone;
    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    private Integer status;
    /**
     * 商品图片
     */
    private String skuImg;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 商品品牌
     */
    private String skuBrand;
    /**
     * 商品销售属性(JSON)
     */
    private String skuAttrsVals;
    /**
     * 退货数量
     */
    private Integer skuCount;
    /**
     * 商品单价
     */
    private Double skuPrice;
    /**
     * 商品实际支付单价
     */
    private Double skuRealPrice;
    /**
     * 原因
     */
    private String reason;
    /**
     * 描述
     */
    private String description;
    /**
     * 公司收货地址
     */
    private String receiveAddress;
    
}

