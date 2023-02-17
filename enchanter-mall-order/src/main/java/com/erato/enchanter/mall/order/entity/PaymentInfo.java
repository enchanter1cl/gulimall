package com.erato.enchanter.mall.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * (PaymentInfo)实体类
 *
 * @author zhangyuan
 * @since 2023-02-17 23:35:19
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfo implements Serializable {
    private static final long serialVersionUID = 542101543103539278L;
    /**
     * id
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 支付宝交易流水号
     */
    private String alipayTradeNo;
    /**
     * 支付总金额
     */
    private BigDecimal totalAmount;
    /**
     * 支付状态
     */
    private String paymentStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 回调内容
     */
    private String callbackContent;
    /**
     * 回调时间
     */
    private Date callbackTime;
}

