package com.jumore.supper.model;

import java.io.Serializable;
import java.util.Date;

public class BillOrder implements Serializable {
    private Long id;

    private String orderNo;

    private Long billSellId;

    private Long billWishinId;

    private Long contractId;

    private Long payFlowId;

    private Long deliveryRecordId;

    private Long companyIdSeller;

    private Long orderAmount;

    private Long priceBase;

    private Long goodsId;

    private Long skuId;

    private Long userIdSeller;

    private Long companyIdBuyer;

    private Long userIdBuyer;

    private Long cateId;

    private Long priceSpotAgio;

    private Long priceSettle;

    private String remark;

    private Long billBuyId;

    private Long billWishouId;

    private Long statusSeller;

    private Long statusBuyer;

    private Long status;

    private Date createTime;

    private Long createUserId;

    private Long houseId;

    private Date closeTime;

    private Long payType;

    private Long payerUserId;

    private Date payTime;

    private Long aduitUserId;

    private Date aduitTime;

    private Long signBuyUserId;

    private Date signBuyTime;

    private Long signSellUserId;

    private Date signSellTime;

    private Long signType;

    private Long deliveryUserId;

    private Date deliveryTime;

    private Long receiptUserId;

    private Date receiptTime;

    private Date lastModifyDate;

    private String lastUpdateContent;

    private Long deleteFlag;

    private Long closeUserId;

    private Long industryId;

    private String linkBuyerPhone;

    private String linkSellerPhone;

    private String linkFactory;

    private Long linkDeliveryBuy;

    private Long linkPayDays;

    private Long isAdminCreate;

    private Long deliveryPrice;

    private Long areaCode;

    private Long currencyType;

    private String userSellerName;

    private String userBuyerName;

    private String idNo;

    private Long ownTradeUserSellerNo;

    private Long ownTradeUserBuyerNo;

    private Long invoiceType;

    private String specification;

    private Long orderStyle;

    private Long payStyle;

    private Long actId;

    private String contractNo;

    private Long priceBaseTax;

    private Long priceTotalTax;

    private Long taxTate;

    private Long priceTotalTaxRate;

    private Long currStockAmount;

    private Long selfContractTempId;

    private Long syncStock;

    private String contractPath;

    private Long deliveryaddrId;

    private String deliveryAddr;

    private Long disableTime;

    private String deliveryTimeVar;

    private Long isFavorable;

    private String information;

    private Long amountAdvanced;

    private Long selfCompanyId;

    private Long earnestMoneyPer;

    private Long unitId;

    private String refundReason;

    private Date refundApplyTime;

    private Date refundAgreeTime;

    private Long contractStatus;

    private Long contractSellStatus;

    private Long earnestMoneyPerStatus;

    private Long billOrderOwnTradeNo;

    private Long oldStatus;

    private Long updateLabels;

    private Date activeTimeEnd;

    private Long payChannel;

    private String foreignPayNo;

    private String foreignSettleDate;

    private Date orderSendTime;

    private Long spdbPayType;

    private String spdbImpacqssn;

    private String refundReasonChoice;

    private Long refundAmount;

    private String explainReason;

    private Long payMode;

    private int cfcaStatus;

    private int cfcaType;

    private Long lgNeedsId;

    private Long lgOrderId;

    private Long lgWillId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getBillSellId() {
        return billSellId;
    }

    public void setBillSellId(Long billSellId) {
        this.billSellId = billSellId;
    }

    public Long getBillWishinId() {
        return billWishinId;
    }

    public void setBillWishinId(Long billWishinId) {
        this.billWishinId = billWishinId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getPayFlowId() {
        return payFlowId;
    }

    public void setPayFlowId(Long payFlowId) {
        this.payFlowId = payFlowId;
    }

    public Long getDeliveryRecordId() {
        return deliveryRecordId;
    }

    public void setDeliveryRecordId(Long deliveryRecordId) {
        this.deliveryRecordId = deliveryRecordId;
    }

    public Long getCompanyIdSeller() {
        return companyIdSeller;
    }

    public void setCompanyIdSeller(Long companyIdSeller) {
        this.companyIdSeller = companyIdSeller;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(Long priceBase) {
        this.priceBase = priceBase;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getUserIdSeller() {
        return userIdSeller;
    }

    public void setUserIdSeller(Long userIdSeller) {
        this.userIdSeller = userIdSeller;
    }

    public Long getCompanyIdBuyer() {
        return companyIdBuyer;
    }

    public void setCompanyIdBuyer(Long companyIdBuyer) {
        this.companyIdBuyer = companyIdBuyer;
    }

    public Long getUserIdBuyer() {
        return userIdBuyer;
    }

    public void setUserIdBuyer(Long userIdBuyer) {
        this.userIdBuyer = userIdBuyer;
    }

    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long cateId) {
        this.cateId = cateId;
    }

    public Long getPriceSpotAgio() {
        return priceSpotAgio;
    }

    public void setPriceSpotAgio(Long priceSpotAgio) {
        this.priceSpotAgio = priceSpotAgio;
    }

    public Long getPriceSettle() {
        return priceSettle;
    }

    public void setPriceSettle(Long priceSettle) {
        this.priceSettle = priceSettle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getBillBuyId() {
        return billBuyId;
    }

    public void setBillBuyId(Long billBuyId) {
        this.billBuyId = billBuyId;
    }

    public Long getBillWishouId() {
        return billWishouId;
    }

    public void setBillWishouId(Long billWishouId) {
        this.billWishouId = billWishouId;
    }

    public Long getStatusSeller() {
        return statusSeller;
    }

    public void setStatusSeller(Long statusSeller) {
        this.statusSeller = statusSeller;
    }

    public Long getStatusBuyer() {
        return statusBuyer;
    }

    public void setStatusBuyer(Long statusBuyer) {
        this.statusBuyer = statusBuyer;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Long getPayType() {
        return payType;
    }

    public void setPayType(Long payType) {
        this.payType = payType;
    }

    public Long getPayerUserId() {
        return payerUserId;
    }

    public void setPayerUserId(Long payerUserId) {
        this.payerUserId = payerUserId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getAduitUserId() {
        return aduitUserId;
    }

    public void setAduitUserId(Long aduitUserId) {
        this.aduitUserId = aduitUserId;
    }

    public Date getAduitTime() {
        return aduitTime;
    }

    public void setAduitTime(Date aduitTime) {
        this.aduitTime = aduitTime;
    }

    public Long getSignBuyUserId() {
        return signBuyUserId;
    }

    public void setSignBuyUserId(Long signBuyUserId) {
        this.signBuyUserId = signBuyUserId;
    }

    public Date getSignBuyTime() {
        return signBuyTime;
    }

    public void setSignBuyTime(Date signBuyTime) {
        this.signBuyTime = signBuyTime;
    }

    public Long getSignSellUserId() {
        return signSellUserId;
    }

    public void setSignSellUserId(Long signSellUserId) {
        this.signSellUserId = signSellUserId;
    }

    public Date getSignSellTime() {
        return signSellTime;
    }

    public void setSignSellTime(Date signSellTime) {
        this.signSellTime = signSellTime;
    }

    public Long getSignType() {
        return signType;
    }

    public void setSignType(Long signType) {
        this.signType = signType;
    }

    public Long getDeliveryUserId() {
        return deliveryUserId;
    }

    public void setDeliveryUserId(Long deliveryUserId) {
        this.deliveryUserId = deliveryUserId;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Long getReceiptUserId() {
        return receiptUserId;
    }

    public void setReceiptUserId(Long receiptUserId) {
        this.receiptUserId = receiptUserId;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getLastUpdateContent() {
        return lastUpdateContent;
    }

    public void setLastUpdateContent(String lastUpdateContent) {
        this.lastUpdateContent = lastUpdateContent;
    }

    public Long getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Long deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getCloseUserId() {
        return closeUserId;
    }

    public void setCloseUserId(Long closeUserId) {
        this.closeUserId = closeUserId;
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public String getLinkBuyerPhone() {
        return linkBuyerPhone;
    }

    public void setLinkBuyerPhone(String linkBuyerPhone) {
        this.linkBuyerPhone = linkBuyerPhone;
    }

    public String getLinkSellerPhone() {
        return linkSellerPhone;
    }

    public void setLinkSellerPhone(String linkSellerPhone) {
        this.linkSellerPhone = linkSellerPhone;
    }

    public String getLinkFactory() {
        return linkFactory;
    }

    public void setLinkFactory(String linkFactory) {
        this.linkFactory = linkFactory;
    }

    public Long getLinkDeliveryBuy() {
        return linkDeliveryBuy;
    }

    public void setLinkDeliveryBuy(Long linkDeliveryBuy) {
        this.linkDeliveryBuy = linkDeliveryBuy;
    }

    public Long getLinkPayDays() {
        return linkPayDays;
    }

    public void setLinkPayDays(Long linkPayDays) {
        this.linkPayDays = linkPayDays;
    }

    public Long getIsAdminCreate() {
        return isAdminCreate;
    }

    public void setIsAdminCreate(Long isAdminCreate) {
        this.isAdminCreate = isAdminCreate;
    }

    public Long getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Long deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Long getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Long areaCode) {
        this.areaCode = areaCode;
    }

    public Long getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Long currencyType) {
        this.currencyType = currencyType;
    }

    public String getUserSellerName() {
        return userSellerName;
    }

    public void setUserSellerName(String userSellerName) {
        this.userSellerName = userSellerName;
    }

    public String getUserBuyerName() {
        return userBuyerName;
    }

    public void setUserBuyerName(String userBuyerName) {
        this.userBuyerName = userBuyerName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Long getOwnTradeUserSellerNo() {
        return ownTradeUserSellerNo;
    }

    public void setOwnTradeUserSellerNo(Long ownTradeUserSellerNo) {
        this.ownTradeUserSellerNo = ownTradeUserSellerNo;
    }

    public Long getOwnTradeUserBuyerNo() {
        return ownTradeUserBuyerNo;
    }

    public void setOwnTradeUserBuyerNo(Long ownTradeUserBuyerNo) {
        this.ownTradeUserBuyerNo = ownTradeUserBuyerNo;
    }

    public Long getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Long invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Long getOrderStyle() {
        return orderStyle;
    }

    public void setOrderStyle(Long orderStyle) {
        this.orderStyle = orderStyle;
    }

    public Long getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(Long payStyle) {
        this.payStyle = payStyle;
    }

    public Long getActId() {
        return actId;
    }

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Long getPriceBaseTax() {
        return priceBaseTax;
    }

    public void setPriceBaseTax(Long priceBaseTax) {
        this.priceBaseTax = priceBaseTax;
    }

    public Long getPriceTotalTax() {
        return priceTotalTax;
    }

    public void setPriceTotalTax(Long priceTotalTax) {
        this.priceTotalTax = priceTotalTax;
    }

    public Long getTaxTate() {
        return taxTate;
    }

    public void setTaxTate(Long taxTate) {
        this.taxTate = taxTate;
    }

    public Long getPriceTotalTaxRate() {
        return priceTotalTaxRate;
    }

    public void setPriceTotalTaxRate(Long priceTotalTaxRate) {
        this.priceTotalTaxRate = priceTotalTaxRate;
    }

    public Long getCurrStockAmount() {
        return currStockAmount;
    }

    public void setCurrStockAmount(Long currStockAmount) {
        this.currStockAmount = currStockAmount;
    }

    public Long getSelfContractTempId() {
        return selfContractTempId;
    }

    public void setSelfContractTempId(Long selfContractTempId) {
        this.selfContractTempId = selfContractTempId;
    }

    public Long getSyncStock() {
        return syncStock;
    }

    public void setSyncStock(Long syncStock) {
        this.syncStock = syncStock;
    }

    public String getContractPath() {
        return contractPath;
    }

    public void setContractPath(String contractPath) {
        this.contractPath = contractPath;
    }

    public Long getDeliveryaddrId() {
        return deliveryaddrId;
    }

    public void setDeliveryaddrId(Long deliveryaddrId) {
        this.deliveryaddrId = deliveryaddrId;
    }

    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr;
    }

    public Long getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Long disableTime) {
        this.disableTime = disableTime;
    }

    public String getDeliveryTimeVar() {
        return deliveryTimeVar;
    }

    public void setDeliveryTimeVar(String deliveryTimeVar) {
        this.deliveryTimeVar = deliveryTimeVar;
    }

    public Long getIsFavorable() {
        return isFavorable;
    }

    public void setIsFavorable(Long isFavorable) {
        this.isFavorable = isFavorable;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Long getAmountAdvanced() {
        return amountAdvanced;
    }

    public void setAmountAdvanced(Long amountAdvanced) {
        this.amountAdvanced = amountAdvanced;
    }

    public Long getSelfCompanyId() {
        return selfCompanyId;
    }

    public void setSelfCompanyId(Long selfCompanyId) {
        this.selfCompanyId = selfCompanyId;
    }

    public Long getEarnestMoneyPer() {
        return earnestMoneyPer;
    }

    public void setEarnestMoneyPer(Long earnestMoneyPer) {
        this.earnestMoneyPer = earnestMoneyPer;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public Date getRefundApplyTime() {
        return refundApplyTime;
    }

    public void setRefundApplyTime(Date refundApplyTime) {
        this.refundApplyTime = refundApplyTime;
    }

    public Date getRefundAgreeTime() {
        return refundAgreeTime;
    }

    public void setRefundAgreeTime(Date refundAgreeTime) {
        this.refundAgreeTime = refundAgreeTime;
    }

    public Long getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Long contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Long getContractSellStatus() {
        return contractSellStatus;
    }

    public void setContractSellStatus(Long contractSellStatus) {
        this.contractSellStatus = contractSellStatus;
    }

    public Long getEarnestMoneyPerStatus() {
        return earnestMoneyPerStatus;
    }

    public void setEarnestMoneyPerStatus(Long earnestMoneyPerStatus) {
        this.earnestMoneyPerStatus = earnestMoneyPerStatus;
    }

    public Long getBillOrderOwnTradeNo() {
        return billOrderOwnTradeNo;
    }

    public void setBillOrderOwnTradeNo(Long billOrderOwnTradeNo) {
        this.billOrderOwnTradeNo = billOrderOwnTradeNo;
    }

    public Long getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(Long oldStatus) {
        this.oldStatus = oldStatus;
    }

    public Long getUpdateLabels() {
        return updateLabels;
    }

    public void setUpdateLabels(Long updateLabels) {
        this.updateLabels = updateLabels;
    }

    public Date getActiveTimeEnd() {
        return activeTimeEnd;
    }

    public void setActiveTimeEnd(Date activeTimeEnd) {
        this.activeTimeEnd = activeTimeEnd;
    }

    public Long getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Long payChannel) {
        this.payChannel = payChannel;
    }

    public String getForeignPayNo() {
        return foreignPayNo;
    }

    public void setForeignPayNo(String foreignPayNo) {
        this.foreignPayNo = foreignPayNo;
    }

    public String getForeignSettleDate() {
        return foreignSettleDate;
    }

    public void setForeignSettleDate(String foreignSettleDate) {
        this.foreignSettleDate = foreignSettleDate;
    }

    public Date getOrderSendTime() {
        return orderSendTime;
    }

    public void setOrderSendTime(Date orderSendTime) {
        this.orderSendTime = orderSendTime;
    }

    public Long getSpdbPayType() {
        return spdbPayType;
    }

    public void setSpdbPayType(Long spdbPayType) {
        this.spdbPayType = spdbPayType;
    }

    public String getSpdbImpacqssn() {
        return spdbImpacqssn;
    }

    public void setSpdbImpacqssn(String spdbImpacqssn) {
        this.spdbImpacqssn = spdbImpacqssn;
    }

    public String getRefundReasonChoice() {
        return refundReasonChoice;
    }

    public void setRefundReasonChoice(String refundReasonChoice) {
        this.refundReasonChoice = refundReasonChoice;
    }

    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getExplainReason() {
        return explainReason;
    }

    public void setExplainReason(String explainReason) {
        this.explainReason = explainReason;
    }

    public Long getPayMode() {
        return payMode;
    }

    public void setPayMode(Long payMode) {
        this.payMode = payMode;
    }

    public int getCfcaStatus() {
        return cfcaStatus;
    }

    public void setCfcaStatus(int cfcaStatus) {
        this.cfcaStatus = cfcaStatus;
    }

    public int getCfcaType() {
        return cfcaType;
    }

    public void setCfcaType(int cfcaType) {
        this.cfcaType = cfcaType;
    }

    public Long getLgNeedsId() {
        return lgNeedsId;
    }

    public void setLgNeedsId(Long lgNeedsId) {
        this.lgNeedsId = lgNeedsId;
    }

    public Long getLgOrderId() {
        return lgOrderId;
    }

    public void setLgOrderId(Long lgOrderId) {
        this.lgOrderId = lgOrderId;
    }

    public Long getLgWillId() {
        return lgWillId;
    }

    public void setLgWillId(Long lgWillId) {
        this.lgWillId = lgWillId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BillOrder other = (BillOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getBillSellId() == null ? other.getBillSellId() == null : this.getBillSellId().equals(other.getBillSellId()))
            && (this.getBillWishinId() == null ? other.getBillWishinId() == null : this.getBillWishinId().equals(other.getBillWishinId()))
            && (this.getContractId() == null ? other.getContractId() == null : this.getContractId().equals(other.getContractId()))
            && (this.getPayFlowId() == null ? other.getPayFlowId() == null : this.getPayFlowId().equals(other.getPayFlowId()))
            && (this.getDeliveryRecordId() == null ? other.getDeliveryRecordId() == null : this.getDeliveryRecordId().equals(other.getDeliveryRecordId()))
            && (this.getCompanyIdSeller() == null ? other.getCompanyIdSeller() == null : this.getCompanyIdSeller().equals(other.getCompanyIdSeller()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getPriceBase() == null ? other.getPriceBase() == null : this.getPriceBase().equals(other.getPriceBase()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getUserIdSeller() == null ? other.getUserIdSeller() == null : this.getUserIdSeller().equals(other.getUserIdSeller()))
            && (this.getCompanyIdBuyer() == null ? other.getCompanyIdBuyer() == null : this.getCompanyIdBuyer().equals(other.getCompanyIdBuyer()))
            && (this.getUserIdBuyer() == null ? other.getUserIdBuyer() == null : this.getUserIdBuyer().equals(other.getUserIdBuyer()))
            && (this.getCateId() == null ? other.getCateId() == null : this.getCateId().equals(other.getCateId()))
            && (this.getPriceSpotAgio() == null ? other.getPriceSpotAgio() == null : this.getPriceSpotAgio().equals(other.getPriceSpotAgio()))
            && (this.getPriceSettle() == null ? other.getPriceSettle() == null : this.getPriceSettle().equals(other.getPriceSettle()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBillBuyId() == null ? other.getBillBuyId() == null : this.getBillBuyId().equals(other.getBillBuyId()))
            && (this.getBillWishouId() == null ? other.getBillWishouId() == null : this.getBillWishouId().equals(other.getBillWishouId()))
            && (this.getStatusSeller() == null ? other.getStatusSeller() == null : this.getStatusSeller().equals(other.getStatusSeller()))
            && (this.getStatusBuyer() == null ? other.getStatusBuyer() == null : this.getStatusBuyer().equals(other.getStatusBuyer()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getHouseId() == null ? other.getHouseId() == null : this.getHouseId().equals(other.getHouseId()))
            && (this.getCloseTime() == null ? other.getCloseTime() == null : this.getCloseTime().equals(other.getCloseTime()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getPayerUserId() == null ? other.getPayerUserId() == null : this.getPayerUserId().equals(other.getPayerUserId()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getAduitUserId() == null ? other.getAduitUserId() == null : this.getAduitUserId().equals(other.getAduitUserId()))
            && (this.getAduitTime() == null ? other.getAduitTime() == null : this.getAduitTime().equals(other.getAduitTime()))
            && (this.getSignBuyUserId() == null ? other.getSignBuyUserId() == null : this.getSignBuyUserId().equals(other.getSignBuyUserId()))
            && (this.getSignBuyTime() == null ? other.getSignBuyTime() == null : this.getSignBuyTime().equals(other.getSignBuyTime()))
            && (this.getSignSellUserId() == null ? other.getSignSellUserId() == null : this.getSignSellUserId().equals(other.getSignSellUserId()))
            && (this.getSignSellTime() == null ? other.getSignSellTime() == null : this.getSignSellTime().equals(other.getSignSellTime()))
            && (this.getSignType() == null ? other.getSignType() == null : this.getSignType().equals(other.getSignType()))
            && (this.getDeliveryUserId() == null ? other.getDeliveryUserId() == null : this.getDeliveryUserId().equals(other.getDeliveryUserId()))
            && (this.getDeliveryTime() == null ? other.getDeliveryTime() == null : this.getDeliveryTime().equals(other.getDeliveryTime()))
            && (this.getReceiptUserId() == null ? other.getReceiptUserId() == null : this.getReceiptUserId().equals(other.getReceiptUserId()))
            && (this.getReceiptTime() == null ? other.getReceiptTime() == null : this.getReceiptTime().equals(other.getReceiptTime()))
            && (this.getLastModifyDate() == null ? other.getLastModifyDate() == null : this.getLastModifyDate().equals(other.getLastModifyDate()))
            && (this.getLastUpdateContent() == null ? other.getLastUpdateContent() == null : this.getLastUpdateContent().equals(other.getLastUpdateContent()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCloseUserId() == null ? other.getCloseUserId() == null : this.getCloseUserId().equals(other.getCloseUserId()))
            && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getLinkBuyerPhone() == null ? other.getLinkBuyerPhone() == null : this.getLinkBuyerPhone().equals(other.getLinkBuyerPhone()))
            && (this.getLinkSellerPhone() == null ? other.getLinkSellerPhone() == null : this.getLinkSellerPhone().equals(other.getLinkSellerPhone()))
            && (this.getLinkFactory() == null ? other.getLinkFactory() == null : this.getLinkFactory().equals(other.getLinkFactory()))
            && (this.getLinkDeliveryBuy() == null ? other.getLinkDeliveryBuy() == null : this.getLinkDeliveryBuy().equals(other.getLinkDeliveryBuy()))
            && (this.getLinkPayDays() == null ? other.getLinkPayDays() == null : this.getLinkPayDays().equals(other.getLinkPayDays()))
            && (this.getIsAdminCreate() == null ? other.getIsAdminCreate() == null : this.getIsAdminCreate().equals(other.getIsAdminCreate()))
            && (this.getDeliveryPrice() == null ? other.getDeliveryPrice() == null : this.getDeliveryPrice().equals(other.getDeliveryPrice()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getCurrencyType() == null ? other.getCurrencyType() == null : this.getCurrencyType().equals(other.getCurrencyType()))
            && (this.getUserSellerName() == null ? other.getUserSellerName() == null : this.getUserSellerName().equals(other.getUserSellerName()))
            && (this.getUserBuyerName() == null ? other.getUserBuyerName() == null : this.getUserBuyerName().equals(other.getUserBuyerName()))
            && (this.getIdNo() == null ? other.getIdNo() == null : this.getIdNo().equals(other.getIdNo()))
            && (this.getOwnTradeUserSellerNo() == null ? other.getOwnTradeUserSellerNo() == null : this.getOwnTradeUserSellerNo().equals(other.getOwnTradeUserSellerNo()))
            && (this.getOwnTradeUserBuyerNo() == null ? other.getOwnTradeUserBuyerNo() == null : this.getOwnTradeUserBuyerNo().equals(other.getOwnTradeUserBuyerNo()))
            && (this.getInvoiceType() == null ? other.getInvoiceType() == null : this.getInvoiceType().equals(other.getInvoiceType()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getOrderStyle() == null ? other.getOrderStyle() == null : this.getOrderStyle().equals(other.getOrderStyle()))
            && (this.getPayStyle() == null ? other.getPayStyle() == null : this.getPayStyle().equals(other.getPayStyle()))
            && (this.getActId() == null ? other.getActId() == null : this.getActId().equals(other.getActId()))
            && (this.getContractNo() == null ? other.getContractNo() == null : this.getContractNo().equals(other.getContractNo()))
            && (this.getPriceBaseTax() == null ? other.getPriceBaseTax() == null : this.getPriceBaseTax().equals(other.getPriceBaseTax()))
            && (this.getPriceTotalTax() == null ? other.getPriceTotalTax() == null : this.getPriceTotalTax().equals(other.getPriceTotalTax()))
            && (this.getTaxTate() == null ? other.getTaxTate() == null : this.getTaxTate().equals(other.getTaxTate()))
            && (this.getPriceTotalTaxRate() == null ? other.getPriceTotalTaxRate() == null : this.getPriceTotalTaxRate().equals(other.getPriceTotalTaxRate()))
            && (this.getCurrStockAmount() == null ? other.getCurrStockAmount() == null : this.getCurrStockAmount().equals(other.getCurrStockAmount()))
            && (this.getSelfContractTempId() == null ? other.getSelfContractTempId() == null : this.getSelfContractTempId().equals(other.getSelfContractTempId()))
            && (this.getSyncStock() == null ? other.getSyncStock() == null : this.getSyncStock().equals(other.getSyncStock()))
            && (this.getContractPath() == null ? other.getContractPath() == null : this.getContractPath().equals(other.getContractPath()))
            && (this.getDeliveryaddrId() == null ? other.getDeliveryaddrId() == null : this.getDeliveryaddrId().equals(other.getDeliveryaddrId()))
            && (this.getDeliveryAddr() == null ? other.getDeliveryAddr() == null : this.getDeliveryAddr().equals(other.getDeliveryAddr()))
            && (this.getDisableTime() == null ? other.getDisableTime() == null : this.getDisableTime().equals(other.getDisableTime()))
            && (this.getDeliveryTimeVar() == null ? other.getDeliveryTimeVar() == null : this.getDeliveryTimeVar().equals(other.getDeliveryTimeVar()))
            && (this.getIsFavorable() == null ? other.getIsFavorable() == null : this.getIsFavorable().equals(other.getIsFavorable()))
            && (this.getInformation() == null ? other.getInformation() == null : this.getInformation().equals(other.getInformation()))
            && (this.getAmountAdvanced() == null ? other.getAmountAdvanced() == null : this.getAmountAdvanced().equals(other.getAmountAdvanced()))
            && (this.getSelfCompanyId() == null ? other.getSelfCompanyId() == null : this.getSelfCompanyId().equals(other.getSelfCompanyId()))
            && (this.getEarnestMoneyPer() == null ? other.getEarnestMoneyPer() == null : this.getEarnestMoneyPer().equals(other.getEarnestMoneyPer()))
            && (this.getUnitId() == null ? other.getUnitId() == null : this.getUnitId().equals(other.getUnitId()))
            && (this.getRefundReason() == null ? other.getRefundReason() == null : this.getRefundReason().equals(other.getRefundReason()))
            && (this.getRefundApplyTime() == null ? other.getRefundApplyTime() == null : this.getRefundApplyTime().equals(other.getRefundApplyTime()))
            && (this.getRefundAgreeTime() == null ? other.getRefundAgreeTime() == null : this.getRefundAgreeTime().equals(other.getRefundAgreeTime()))
            && (this.getContractStatus() == null ? other.getContractStatus() == null : this.getContractStatus().equals(other.getContractStatus()))
            && (this.getContractSellStatus() == null ? other.getContractSellStatus() == null : this.getContractSellStatus().equals(other.getContractSellStatus()))
            && (this.getEarnestMoneyPerStatus() == null ? other.getEarnestMoneyPerStatus() == null : this.getEarnestMoneyPerStatus().equals(other.getEarnestMoneyPerStatus()))
            && (this.getBillOrderOwnTradeNo() == null ? other.getBillOrderOwnTradeNo() == null : this.getBillOrderOwnTradeNo().equals(other.getBillOrderOwnTradeNo()))
            && (this.getOldStatus() == null ? other.getOldStatus() == null : this.getOldStatus().equals(other.getOldStatus()))
            && (this.getUpdateLabels() == null ? other.getUpdateLabels() == null : this.getUpdateLabels().equals(other.getUpdateLabels()))
            && (this.getActiveTimeEnd() == null ? other.getActiveTimeEnd() == null : this.getActiveTimeEnd().equals(other.getActiveTimeEnd()))
            && (this.getPayChannel() == null ? other.getPayChannel() == null : this.getPayChannel().equals(other.getPayChannel()))
            && (this.getForeignPayNo() == null ? other.getForeignPayNo() == null : this.getForeignPayNo().equals(other.getForeignPayNo()))
            && (this.getForeignSettleDate() == null ? other.getForeignSettleDate() == null : this.getForeignSettleDate().equals(other.getForeignSettleDate()))
            && (this.getOrderSendTime() == null ? other.getOrderSendTime() == null : this.getOrderSendTime().equals(other.getOrderSendTime()))
            && (this.getSpdbPayType() == null ? other.getSpdbPayType() == null : this.getSpdbPayType().equals(other.getSpdbPayType()))
            && (this.getSpdbImpacqssn() == null ? other.getSpdbImpacqssn() == null : this.getSpdbImpacqssn().equals(other.getSpdbImpacqssn()))
            && (this.getRefundReasonChoice() == null ? other.getRefundReasonChoice() == null : this.getRefundReasonChoice().equals(other.getRefundReasonChoice()))
            && (this.getRefundAmount() == null ? other.getRefundAmount() == null : this.getRefundAmount().equals(other.getRefundAmount()))
            && (this.getExplainReason() == null ? other.getExplainReason() == null : this.getExplainReason().equals(other.getExplainReason()))
            && (this.getPayMode() == null ? other.getPayMode() == null : this.getPayMode().equals(other.getPayMode()))
            && (this.getCfcaStatus() == other.getCfcaStatus())
            && (this.getCfcaType() == other.getCfcaType())
            && (this.getLgNeedsId() == null ? other.getLgNeedsId() == null : this.getLgNeedsId().equals(other.getLgNeedsId()))
            && (this.getLgOrderId() == null ? other.getLgOrderId() == null : this.getLgOrderId().equals(other.getLgOrderId()))
            && (this.getLgWillId() == null ? other.getLgWillId() == null : this.getLgWillId().equals(other.getLgWillId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getBillSellId() == null) ? 0 : getBillSellId().hashCode());
        result = prime * result + ((getBillWishinId() == null) ? 0 : getBillWishinId().hashCode());
        result = prime * result + ((getContractId() == null) ? 0 : getContractId().hashCode());
        result = prime * result + ((getPayFlowId() == null) ? 0 : getPayFlowId().hashCode());
        result = prime * result + ((getDeliveryRecordId() == null) ? 0 : getDeliveryRecordId().hashCode());
        result = prime * result + ((getCompanyIdSeller() == null) ? 0 : getCompanyIdSeller().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getPriceBase() == null) ? 0 : getPriceBase().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getUserIdSeller() == null) ? 0 : getUserIdSeller().hashCode());
        result = prime * result + ((getCompanyIdBuyer() == null) ? 0 : getCompanyIdBuyer().hashCode());
        result = prime * result + ((getUserIdBuyer() == null) ? 0 : getUserIdBuyer().hashCode());
        result = prime * result + ((getCateId() == null) ? 0 : getCateId().hashCode());
        result = prime * result + ((getPriceSpotAgio() == null) ? 0 : getPriceSpotAgio().hashCode());
        result = prime * result + ((getPriceSettle() == null) ? 0 : getPriceSettle().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBillBuyId() == null) ? 0 : getBillBuyId().hashCode());
        result = prime * result + ((getBillWishouId() == null) ? 0 : getBillWishouId().hashCode());
        result = prime * result + ((getStatusSeller() == null) ? 0 : getStatusSeller().hashCode());
        result = prime * result + ((getStatusBuyer() == null) ? 0 : getStatusBuyer().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getHouseId() == null) ? 0 : getHouseId().hashCode());
        result = prime * result + ((getCloseTime() == null) ? 0 : getCloseTime().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getPayerUserId() == null) ? 0 : getPayerUserId().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getAduitUserId() == null) ? 0 : getAduitUserId().hashCode());
        result = prime * result + ((getAduitTime() == null) ? 0 : getAduitTime().hashCode());
        result = prime * result + ((getSignBuyUserId() == null) ? 0 : getSignBuyUserId().hashCode());
        result = prime * result + ((getSignBuyTime() == null) ? 0 : getSignBuyTime().hashCode());
        result = prime * result + ((getSignSellUserId() == null) ? 0 : getSignSellUserId().hashCode());
        result = prime * result + ((getSignSellTime() == null) ? 0 : getSignSellTime().hashCode());
        result = prime * result + ((getSignType() == null) ? 0 : getSignType().hashCode());
        result = prime * result + ((getDeliveryUserId() == null) ? 0 : getDeliveryUserId().hashCode());
        result = prime * result + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        result = prime * result + ((getReceiptUserId() == null) ? 0 : getReceiptUserId().hashCode());
        result = prime * result + ((getReceiptTime() == null) ? 0 : getReceiptTime().hashCode());
        result = prime * result + ((getLastModifyDate() == null) ? 0 : getLastModifyDate().hashCode());
        result = prime * result + ((getLastUpdateContent() == null) ? 0 : getLastUpdateContent().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getCloseUserId() == null) ? 0 : getCloseUserId().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getLinkBuyerPhone() == null) ? 0 : getLinkBuyerPhone().hashCode());
        result = prime * result + ((getLinkSellerPhone() == null) ? 0 : getLinkSellerPhone().hashCode());
        result = prime * result + ((getLinkFactory() == null) ? 0 : getLinkFactory().hashCode());
        result = prime * result + ((getLinkDeliveryBuy() == null) ? 0 : getLinkDeliveryBuy().hashCode());
        result = prime * result + ((getLinkPayDays() == null) ? 0 : getLinkPayDays().hashCode());
        result = prime * result + ((getIsAdminCreate() == null) ? 0 : getIsAdminCreate().hashCode());
        result = prime * result + ((getDeliveryPrice() == null) ? 0 : getDeliveryPrice().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getCurrencyType() == null) ? 0 : getCurrencyType().hashCode());
        result = prime * result + ((getUserSellerName() == null) ? 0 : getUserSellerName().hashCode());
        result = prime * result + ((getUserBuyerName() == null) ? 0 : getUserBuyerName().hashCode());
        result = prime * result + ((getIdNo() == null) ? 0 : getIdNo().hashCode());
        result = prime * result + ((getOwnTradeUserSellerNo() == null) ? 0 : getOwnTradeUserSellerNo().hashCode());
        result = prime * result + ((getOwnTradeUserBuyerNo() == null) ? 0 : getOwnTradeUserBuyerNo().hashCode());
        result = prime * result + ((getInvoiceType() == null) ? 0 : getInvoiceType().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getOrderStyle() == null) ? 0 : getOrderStyle().hashCode());
        result = prime * result + ((getPayStyle() == null) ? 0 : getPayStyle().hashCode());
        result = prime * result + ((getActId() == null) ? 0 : getActId().hashCode());
        result = prime * result + ((getContractNo() == null) ? 0 : getContractNo().hashCode());
        result = prime * result + ((getPriceBaseTax() == null) ? 0 : getPriceBaseTax().hashCode());
        result = prime * result + ((getPriceTotalTax() == null) ? 0 : getPriceTotalTax().hashCode());
        result = prime * result + ((getTaxTate() == null) ? 0 : getTaxTate().hashCode());
        result = prime * result + ((getPriceTotalTaxRate() == null) ? 0 : getPriceTotalTaxRate().hashCode());
        result = prime * result + ((getCurrStockAmount() == null) ? 0 : getCurrStockAmount().hashCode());
        result = prime * result + ((getSelfContractTempId() == null) ? 0 : getSelfContractTempId().hashCode());
        result = prime * result + ((getSyncStock() == null) ? 0 : getSyncStock().hashCode());
        result = prime * result + ((getContractPath() == null) ? 0 : getContractPath().hashCode());
        result = prime * result + ((getDeliveryaddrId() == null) ? 0 : getDeliveryaddrId().hashCode());
        result = prime * result + ((getDeliveryAddr() == null) ? 0 : getDeliveryAddr().hashCode());
        result = prime * result + ((getDisableTime() == null) ? 0 : getDisableTime().hashCode());
        result = prime * result + ((getDeliveryTimeVar() == null) ? 0 : getDeliveryTimeVar().hashCode());
        result = prime * result + ((getIsFavorable() == null) ? 0 : getIsFavorable().hashCode());
        result = prime * result + ((getInformation() == null) ? 0 : getInformation().hashCode());
        result = prime * result + ((getAmountAdvanced() == null) ? 0 : getAmountAdvanced().hashCode());
        result = prime * result + ((getSelfCompanyId() == null) ? 0 : getSelfCompanyId().hashCode());
        result = prime * result + ((getEarnestMoneyPer() == null) ? 0 : getEarnestMoneyPer().hashCode());
        result = prime * result + ((getUnitId() == null) ? 0 : getUnitId().hashCode());
        result = prime * result + ((getRefundReason() == null) ? 0 : getRefundReason().hashCode());
        result = prime * result + ((getRefundApplyTime() == null) ? 0 : getRefundApplyTime().hashCode());
        result = prime * result + ((getRefundAgreeTime() == null) ? 0 : getRefundAgreeTime().hashCode());
        result = prime * result + ((getContractStatus() == null) ? 0 : getContractStatus().hashCode());
        result = prime * result + ((getContractSellStatus() == null) ? 0 : getContractSellStatus().hashCode());
        result = prime * result + ((getEarnestMoneyPerStatus() == null) ? 0 : getEarnestMoneyPerStatus().hashCode());
        result = prime * result + ((getBillOrderOwnTradeNo() == null) ? 0 : getBillOrderOwnTradeNo().hashCode());
        result = prime * result + ((getOldStatus() == null) ? 0 : getOldStatus().hashCode());
        result = prime * result + ((getUpdateLabels() == null) ? 0 : getUpdateLabels().hashCode());
        result = prime * result + ((getActiveTimeEnd() == null) ? 0 : getActiveTimeEnd().hashCode());
        result = prime * result + ((getPayChannel() == null) ? 0 : getPayChannel().hashCode());
        result = prime * result + ((getForeignPayNo() == null) ? 0 : getForeignPayNo().hashCode());
        result = prime * result + ((getForeignSettleDate() == null) ? 0 : getForeignSettleDate().hashCode());
        result = prime * result + ((getOrderSendTime() == null) ? 0 : getOrderSendTime().hashCode());
        result = prime * result + ((getSpdbPayType() == null) ? 0 : getSpdbPayType().hashCode());
        result = prime * result + ((getSpdbImpacqssn() == null) ? 0 : getSpdbImpacqssn().hashCode());
        result = prime * result + ((getRefundReasonChoice() == null) ? 0 : getRefundReasonChoice().hashCode());
        result = prime * result + ((getRefundAmount() == null) ? 0 : getRefundAmount().hashCode());
        result = prime * result + ((getExplainReason() == null) ? 0 : getExplainReason().hashCode());
        result = prime * result + ((getPayMode() == null) ? 0 : getPayMode().hashCode());
        result = prime * result + getCfcaStatus();
        result = prime * result + getCfcaType();
        result = prime * result + ((getLgNeedsId() == null) ? 0 : getLgNeedsId().hashCode());
        result = prime * result + ((getLgOrderId() == null) ? 0 : getLgOrderId().hashCode());
        result = prime * result + ((getLgWillId() == null) ? 0 : getLgWillId().hashCode());
        return result;
    }
}