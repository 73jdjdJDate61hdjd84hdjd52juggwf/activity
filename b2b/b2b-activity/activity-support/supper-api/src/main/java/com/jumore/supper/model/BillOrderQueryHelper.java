package com.jumore.supper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillOrderQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillOrderQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("ORDER_NO like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("ORDER_NO not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andBillSellIdIsNull() {
            addCriterion("BILL_SELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillSellIdIsNotNull() {
            addCriterion("BILL_SELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillSellIdEqualTo(Long value) {
            addCriterion("BILL_SELL_ID =", value, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdNotEqualTo(Long value) {
            addCriterion("BILL_SELL_ID <>", value, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdGreaterThan(Long value) {
            addCriterion("BILL_SELL_ID >", value, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_SELL_ID >=", value, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdLessThan(Long value) {
            addCriterion("BILL_SELL_ID <", value, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdLessThanOrEqualTo(Long value) {
            addCriterion("BILL_SELL_ID <=", value, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdIn(List<Long> values) {
            addCriterion("BILL_SELL_ID in", values, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdNotIn(List<Long> values) {
            addCriterion("BILL_SELL_ID not in", values, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdBetween(Long value1, Long value2) {
            addCriterion("BILL_SELL_ID between", value1, value2, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillSellIdNotBetween(Long value1, Long value2) {
            addCriterion("BILL_SELL_ID not between", value1, value2, "billSellId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdIsNull() {
            addCriterion("BILL_WISHIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdIsNotNull() {
            addCriterion("BILL_WISHIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdEqualTo(Long value) {
            addCriterion("BILL_WISHIN_ID =", value, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdNotEqualTo(Long value) {
            addCriterion("BILL_WISHIN_ID <>", value, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdGreaterThan(Long value) {
            addCriterion("BILL_WISHIN_ID >", value, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_WISHIN_ID >=", value, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdLessThan(Long value) {
            addCriterion("BILL_WISHIN_ID <", value, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdLessThanOrEqualTo(Long value) {
            addCriterion("BILL_WISHIN_ID <=", value, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdIn(List<Long> values) {
            addCriterion("BILL_WISHIN_ID in", values, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdNotIn(List<Long> values) {
            addCriterion("BILL_WISHIN_ID not in", values, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdBetween(Long value1, Long value2) {
            addCriterion("BILL_WISHIN_ID between", value1, value2, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andBillWishinIdNotBetween(Long value1, Long value2) {
            addCriterion("BILL_WISHIN_ID not between", value1, value2, "billWishinId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(Long value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(Long value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(Long value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(Long value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<Long> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<Long> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdIsNull() {
            addCriterion("PAY_FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdIsNotNull() {
            addCriterion("PAY_FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdEqualTo(Long value) {
            addCriterion("PAY_FLOW_ID =", value, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdNotEqualTo(Long value) {
            addCriterion("PAY_FLOW_ID <>", value, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdGreaterThan(Long value) {
            addCriterion("PAY_FLOW_ID >", value, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_FLOW_ID >=", value, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdLessThan(Long value) {
            addCriterion("PAY_FLOW_ID <", value, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("PAY_FLOW_ID <=", value, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdIn(List<Long> values) {
            addCriterion("PAY_FLOW_ID in", values, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdNotIn(List<Long> values) {
            addCriterion("PAY_FLOW_ID not in", values, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdBetween(Long value1, Long value2) {
            addCriterion("PAY_FLOW_ID between", value1, value2, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andPayFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("PAY_FLOW_ID not between", value1, value2, "payFlowId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdIsNull() {
            addCriterion("DELIVERY_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdIsNotNull() {
            addCriterion("DELIVERY_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdEqualTo(Long value) {
            addCriterion("DELIVERY_RECORD_ID =", value, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdNotEqualTo(Long value) {
            addCriterion("DELIVERY_RECORD_ID <>", value, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdGreaterThan(Long value) {
            addCriterion("DELIVERY_RECORD_ID >", value, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_RECORD_ID >=", value, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdLessThan(Long value) {
            addCriterion("DELIVERY_RECORD_ID <", value, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_RECORD_ID <=", value, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdIn(List<Long> values) {
            addCriterion("DELIVERY_RECORD_ID in", values, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdNotIn(List<Long> values) {
            addCriterion("DELIVERY_RECORD_ID not in", values, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_RECORD_ID between", value1, value2, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andDeliveryRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_RECORD_ID not between", value1, value2, "deliveryRecordId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerIsNull() {
            addCriterion("COMPANY_ID_SELLER is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerIsNotNull() {
            addCriterion("COMPANY_ID_SELLER is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerEqualTo(Long value) {
            addCriterion("COMPANY_ID_SELLER =", value, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerNotEqualTo(Long value) {
            addCriterion("COMPANY_ID_SELLER <>", value, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerGreaterThan(Long value) {
            addCriterion("COMPANY_ID_SELLER >", value, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID_SELLER >=", value, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerLessThan(Long value) {
            addCriterion("COMPANY_ID_SELLER <", value, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID_SELLER <=", value, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerIn(List<Long> values) {
            addCriterion("COMPANY_ID_SELLER in", values, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerNotIn(List<Long> values) {
            addCriterion("COMPANY_ID_SELLER not in", values, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID_SELLER between", value1, value2, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdSellerNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID_SELLER not between", value1, value2, "companyIdSeller");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(Long value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(Long value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<Long> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<Long> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPriceBaseIsNull() {
            addCriterion("PRICE_BASE is null");
            return (Criteria) this;
        }

        public Criteria andPriceBaseIsNotNull() {
            addCriterion("PRICE_BASE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceBaseEqualTo(Long value) {
            addCriterion("PRICE_BASE =", value, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseNotEqualTo(Long value) {
            addCriterion("PRICE_BASE <>", value, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseGreaterThan(Long value) {
            addCriterion("PRICE_BASE >", value, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE_BASE >=", value, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseLessThan(Long value) {
            addCriterion("PRICE_BASE <", value, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseLessThanOrEqualTo(Long value) {
            addCriterion("PRICE_BASE <=", value, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseIn(List<Long> values) {
            addCriterion("PRICE_BASE in", values, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseNotIn(List<Long> values) {
            addCriterion("PRICE_BASE not in", values, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseBetween(Long value1, Long value2) {
            addCriterion("PRICE_BASE between", value1, value2, "priceBase");
            return (Criteria) this;
        }

        public Criteria andPriceBaseNotBetween(Long value1, Long value2) {
            addCriterion("PRICE_BASE not between", value1, value2, "priceBase");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("SKU_ID =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("SKU_ID <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("SKU_ID >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SKU_ID >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("SKU_ID <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("SKU_ID <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("SKU_ID in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("SKU_ID not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("SKU_ID between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("SKU_ID not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerIsNull() {
            addCriterion("USER_ID_SELLER is null");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerIsNotNull() {
            addCriterion("USER_ID_SELLER is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerEqualTo(Long value) {
            addCriterion("USER_ID_SELLER =", value, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerNotEqualTo(Long value) {
            addCriterion("USER_ID_SELLER <>", value, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerGreaterThan(Long value) {
            addCriterion("USER_ID_SELLER >", value, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID_SELLER >=", value, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerLessThan(Long value) {
            addCriterion("USER_ID_SELLER <", value, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID_SELLER <=", value, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerIn(List<Long> values) {
            addCriterion("USER_ID_SELLER in", values, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerNotIn(List<Long> values) {
            addCriterion("USER_ID_SELLER not in", values, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerBetween(Long value1, Long value2) {
            addCriterion("USER_ID_SELLER between", value1, value2, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andUserIdSellerNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID_SELLER not between", value1, value2, "userIdSeller");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerIsNull() {
            addCriterion("COMPANY_ID_BUYER is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerIsNotNull() {
            addCriterion("COMPANY_ID_BUYER is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerEqualTo(Long value) {
            addCriterion("COMPANY_ID_BUYER =", value, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerNotEqualTo(Long value) {
            addCriterion("COMPANY_ID_BUYER <>", value, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerGreaterThan(Long value) {
            addCriterion("COMPANY_ID_BUYER >", value, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID_BUYER >=", value, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerLessThan(Long value) {
            addCriterion("COMPANY_ID_BUYER <", value, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID_BUYER <=", value, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerIn(List<Long> values) {
            addCriterion("COMPANY_ID_BUYER in", values, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerNotIn(List<Long> values) {
            addCriterion("COMPANY_ID_BUYER not in", values, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID_BUYER between", value1, value2, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBuyerNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID_BUYER not between", value1, value2, "companyIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerIsNull() {
            addCriterion("USER_ID_BUYER is null");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerIsNotNull() {
            addCriterion("USER_ID_BUYER is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerEqualTo(Long value) {
            addCriterion("USER_ID_BUYER =", value, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerNotEqualTo(Long value) {
            addCriterion("USER_ID_BUYER <>", value, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerGreaterThan(Long value) {
            addCriterion("USER_ID_BUYER >", value, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID_BUYER >=", value, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerLessThan(Long value) {
            addCriterion("USER_ID_BUYER <", value, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID_BUYER <=", value, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerIn(List<Long> values) {
            addCriterion("USER_ID_BUYER in", values, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerNotIn(List<Long> values) {
            addCriterion("USER_ID_BUYER not in", values, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerBetween(Long value1, Long value2) {
            addCriterion("USER_ID_BUYER between", value1, value2, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andUserIdBuyerNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID_BUYER not between", value1, value2, "userIdBuyer");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNull() {
            addCriterion("CATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCateIdIsNotNull() {
            addCriterion("CATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCateIdEqualTo(Long value) {
            addCriterion("CATE_ID =", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotEqualTo(Long value) {
            addCriterion("CATE_ID <>", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThan(Long value) {
            addCriterion("CATE_ID >", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CATE_ID >=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThan(Long value) {
            addCriterion("CATE_ID <", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdLessThanOrEqualTo(Long value) {
            addCriterion("CATE_ID <=", value, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdIn(List<Long> values) {
            addCriterion("CATE_ID in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotIn(List<Long> values) {
            addCriterion("CATE_ID not in", values, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdBetween(Long value1, Long value2) {
            addCriterion("CATE_ID between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andCateIdNotBetween(Long value1, Long value2) {
            addCriterion("CATE_ID not between", value1, value2, "cateId");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioIsNull() {
            addCriterion("PRICE_SPOT_AGIO is null");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioIsNotNull() {
            addCriterion("PRICE_SPOT_AGIO is not null");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioEqualTo(Long value) {
            addCriterion("PRICE_SPOT_AGIO =", value, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioNotEqualTo(Long value) {
            addCriterion("PRICE_SPOT_AGIO <>", value, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioGreaterThan(Long value) {
            addCriterion("PRICE_SPOT_AGIO >", value, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE_SPOT_AGIO >=", value, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioLessThan(Long value) {
            addCriterion("PRICE_SPOT_AGIO <", value, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioLessThanOrEqualTo(Long value) {
            addCriterion("PRICE_SPOT_AGIO <=", value, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioIn(List<Long> values) {
            addCriterion("PRICE_SPOT_AGIO in", values, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioNotIn(List<Long> values) {
            addCriterion("PRICE_SPOT_AGIO not in", values, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioBetween(Long value1, Long value2) {
            addCriterion("PRICE_SPOT_AGIO between", value1, value2, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSpotAgioNotBetween(Long value1, Long value2) {
            addCriterion("PRICE_SPOT_AGIO not between", value1, value2, "priceSpotAgio");
            return (Criteria) this;
        }

        public Criteria andPriceSettleIsNull() {
            addCriterion("PRICE_SETTLE is null");
            return (Criteria) this;
        }

        public Criteria andPriceSettleIsNotNull() {
            addCriterion("PRICE_SETTLE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceSettleEqualTo(Long value) {
            addCriterion("PRICE_SETTLE =", value, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleNotEqualTo(Long value) {
            addCriterion("PRICE_SETTLE <>", value, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleGreaterThan(Long value) {
            addCriterion("PRICE_SETTLE >", value, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE_SETTLE >=", value, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleLessThan(Long value) {
            addCriterion("PRICE_SETTLE <", value, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleLessThanOrEqualTo(Long value) {
            addCriterion("PRICE_SETTLE <=", value, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleIn(List<Long> values) {
            addCriterion("PRICE_SETTLE in", values, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleNotIn(List<Long> values) {
            addCriterion("PRICE_SETTLE not in", values, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleBetween(Long value1, Long value2) {
            addCriterion("PRICE_SETTLE between", value1, value2, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andPriceSettleNotBetween(Long value1, Long value2) {
            addCriterion("PRICE_SETTLE not between", value1, value2, "priceSettle");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdIsNull() {
            addCriterion("BILL_BUY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdIsNotNull() {
            addCriterion("BILL_BUY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdEqualTo(Long value) {
            addCriterion("BILL_BUY_ID =", value, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdNotEqualTo(Long value) {
            addCriterion("BILL_BUY_ID <>", value, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdGreaterThan(Long value) {
            addCriterion("BILL_BUY_ID >", value, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_BUY_ID >=", value, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdLessThan(Long value) {
            addCriterion("BILL_BUY_ID <", value, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdLessThanOrEqualTo(Long value) {
            addCriterion("BILL_BUY_ID <=", value, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdIn(List<Long> values) {
            addCriterion("BILL_BUY_ID in", values, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdNotIn(List<Long> values) {
            addCriterion("BILL_BUY_ID not in", values, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdBetween(Long value1, Long value2) {
            addCriterion("BILL_BUY_ID between", value1, value2, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillBuyIdNotBetween(Long value1, Long value2) {
            addCriterion("BILL_BUY_ID not between", value1, value2, "billBuyId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdIsNull() {
            addCriterion("BILL_WISHOU_ID is null");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdIsNotNull() {
            addCriterion("BILL_WISHOU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdEqualTo(Long value) {
            addCriterion("BILL_WISHOU_ID =", value, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdNotEqualTo(Long value) {
            addCriterion("BILL_WISHOU_ID <>", value, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdGreaterThan(Long value) {
            addCriterion("BILL_WISHOU_ID >", value, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_WISHOU_ID >=", value, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdLessThan(Long value) {
            addCriterion("BILL_WISHOU_ID <", value, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdLessThanOrEqualTo(Long value) {
            addCriterion("BILL_WISHOU_ID <=", value, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdIn(List<Long> values) {
            addCriterion("BILL_WISHOU_ID in", values, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdNotIn(List<Long> values) {
            addCriterion("BILL_WISHOU_ID not in", values, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdBetween(Long value1, Long value2) {
            addCriterion("BILL_WISHOU_ID between", value1, value2, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andBillWishouIdNotBetween(Long value1, Long value2) {
            addCriterion("BILL_WISHOU_ID not between", value1, value2, "billWishouId");
            return (Criteria) this;
        }

        public Criteria andStatusSellerIsNull() {
            addCriterion("STATUS_SELLER is null");
            return (Criteria) this;
        }

        public Criteria andStatusSellerIsNotNull() {
            addCriterion("STATUS_SELLER is not null");
            return (Criteria) this;
        }

        public Criteria andStatusSellerEqualTo(Long value) {
            addCriterion("STATUS_SELLER =", value, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerNotEqualTo(Long value) {
            addCriterion("STATUS_SELLER <>", value, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerGreaterThan(Long value) {
            addCriterion("STATUS_SELLER >", value, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS_SELLER >=", value, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerLessThan(Long value) {
            addCriterion("STATUS_SELLER <", value, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerLessThanOrEqualTo(Long value) {
            addCriterion("STATUS_SELLER <=", value, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerIn(List<Long> values) {
            addCriterion("STATUS_SELLER in", values, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerNotIn(List<Long> values) {
            addCriterion("STATUS_SELLER not in", values, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerBetween(Long value1, Long value2) {
            addCriterion("STATUS_SELLER between", value1, value2, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusSellerNotBetween(Long value1, Long value2) {
            addCriterion("STATUS_SELLER not between", value1, value2, "statusSeller");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerIsNull() {
            addCriterion("STATUS_BUYER is null");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerIsNotNull() {
            addCriterion("STATUS_BUYER is not null");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerEqualTo(Long value) {
            addCriterion("STATUS_BUYER =", value, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerNotEqualTo(Long value) {
            addCriterion("STATUS_BUYER <>", value, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerGreaterThan(Long value) {
            addCriterion("STATUS_BUYER >", value, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS_BUYER >=", value, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerLessThan(Long value) {
            addCriterion("STATUS_BUYER <", value, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerLessThanOrEqualTo(Long value) {
            addCriterion("STATUS_BUYER <=", value, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerIn(List<Long> values) {
            addCriterion("STATUS_BUYER in", values, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerNotIn(List<Long> values) {
            addCriterion("STATUS_BUYER not in", values, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerBetween(Long value1, Long value2) {
            addCriterion("STATUS_BUYER between", value1, value2, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusBuyerNotBetween(Long value1, Long value2) {
            addCriterion("STATUS_BUYER not between", value1, value2, "statusBuyer");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("HOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("HOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Long value) {
            addCriterion("HOUSE_ID =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Long value) {
            addCriterion("HOUSE_ID <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Long value) {
            addCriterion("HOUSE_ID >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HOUSE_ID >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Long value) {
            addCriterion("HOUSE_ID <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Long value) {
            addCriterion("HOUSE_ID <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Long> values) {
            addCriterion("HOUSE_ID in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Long> values) {
            addCriterion("HOUSE_ID not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Long value1, Long value2) {
            addCriterion("HOUSE_ID between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Long value1, Long value2) {
            addCriterion("HOUSE_ID not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("CLOSE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("CLOSE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("CLOSE_TIME =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("CLOSE_TIME <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("CLOSE_TIME >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("CLOSE_TIME <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLOSE_TIME <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("CLOSE_TIME in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("CLOSE_TIME not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLOSE_TIME not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Long value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Long value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Long value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Long value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Long value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Long> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Long> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Long value1, Long value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Long value1, Long value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIsNull() {
            addCriterion("PAYER_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIsNotNull() {
            addCriterion("PAYER_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdEqualTo(Long value) {
            addCriterion("PAYER_USER_ID =", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotEqualTo(Long value) {
            addCriterion("PAYER_USER_ID <>", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdGreaterThan(Long value) {
            addCriterion("PAYER_USER_ID >", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PAYER_USER_ID >=", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLessThan(Long value) {
            addCriterion("PAYER_USER_ID <", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("PAYER_USER_ID <=", value, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdIn(List<Long> values) {
            addCriterion("PAYER_USER_ID in", values, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotIn(List<Long> values) {
            addCriterion("PAYER_USER_ID not in", values, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdBetween(Long value1, Long value2) {
            addCriterion("PAYER_USER_ID between", value1, value2, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("PAYER_USER_ID not between", value1, value2, "payerUserId");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("PAY_TIME =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("PAY_TIME <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("PAY_TIME >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_TIME >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("PAY_TIME <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("PAY_TIME <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("PAY_TIME in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("PAY_TIME not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("PAY_TIME between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("PAY_TIME not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdIsNull() {
            addCriterion("ADUIT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdIsNotNull() {
            addCriterion("ADUIT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdEqualTo(Long value) {
            addCriterion("ADUIT_USER_ID =", value, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdNotEqualTo(Long value) {
            addCriterion("ADUIT_USER_ID <>", value, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdGreaterThan(Long value) {
            addCriterion("ADUIT_USER_ID >", value, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ADUIT_USER_ID >=", value, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdLessThan(Long value) {
            addCriterion("ADUIT_USER_ID <", value, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ADUIT_USER_ID <=", value, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdIn(List<Long> values) {
            addCriterion("ADUIT_USER_ID in", values, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdNotIn(List<Long> values) {
            addCriterion("ADUIT_USER_ID not in", values, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdBetween(Long value1, Long value2) {
            addCriterion("ADUIT_USER_ID between", value1, value2, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ADUIT_USER_ID not between", value1, value2, "aduitUserId");
            return (Criteria) this;
        }

        public Criteria andAduitTimeIsNull() {
            addCriterion("ADUIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAduitTimeIsNotNull() {
            addCriterion("ADUIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAduitTimeEqualTo(Date value) {
            addCriterion("ADUIT_TIME =", value, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeNotEqualTo(Date value) {
            addCriterion("ADUIT_TIME <>", value, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeGreaterThan(Date value) {
            addCriterion("ADUIT_TIME >", value, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADUIT_TIME >=", value, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeLessThan(Date value) {
            addCriterion("ADUIT_TIME <", value, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADUIT_TIME <=", value, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeIn(List<Date> values) {
            addCriterion("ADUIT_TIME in", values, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeNotIn(List<Date> values) {
            addCriterion("ADUIT_TIME not in", values, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeBetween(Date value1, Date value2) {
            addCriterion("ADUIT_TIME between", value1, value2, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andAduitTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADUIT_TIME not between", value1, value2, "aduitTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdIsNull() {
            addCriterion("SIGN_BUY_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdIsNotNull() {
            addCriterion("SIGN_BUY_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdEqualTo(Long value) {
            addCriterion("SIGN_BUY_USER_ID =", value, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdNotEqualTo(Long value) {
            addCriterion("SIGN_BUY_USER_ID <>", value, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdGreaterThan(Long value) {
            addCriterion("SIGN_BUY_USER_ID >", value, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SIGN_BUY_USER_ID >=", value, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdLessThan(Long value) {
            addCriterion("SIGN_BUY_USER_ID <", value, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdLessThanOrEqualTo(Long value) {
            addCriterion("SIGN_BUY_USER_ID <=", value, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdIn(List<Long> values) {
            addCriterion("SIGN_BUY_USER_ID in", values, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdNotIn(List<Long> values) {
            addCriterion("SIGN_BUY_USER_ID not in", values, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdBetween(Long value1, Long value2) {
            addCriterion("SIGN_BUY_USER_ID between", value1, value2, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyUserIdNotBetween(Long value1, Long value2) {
            addCriterion("SIGN_BUY_USER_ID not between", value1, value2, "signBuyUserId");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeIsNull() {
            addCriterion("SIGN_BUY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeIsNotNull() {
            addCriterion("SIGN_BUY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeEqualTo(Date value) {
            addCriterion("SIGN_BUY_TIME =", value, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeNotEqualTo(Date value) {
            addCriterion("SIGN_BUY_TIME <>", value, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeGreaterThan(Date value) {
            addCriterion("SIGN_BUY_TIME >", value, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGN_BUY_TIME >=", value, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeLessThan(Date value) {
            addCriterion("SIGN_BUY_TIME <", value, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeLessThanOrEqualTo(Date value) {
            addCriterion("SIGN_BUY_TIME <=", value, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeIn(List<Date> values) {
            addCriterion("SIGN_BUY_TIME in", values, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeNotIn(List<Date> values) {
            addCriterion("SIGN_BUY_TIME not in", values, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeBetween(Date value1, Date value2) {
            addCriterion("SIGN_BUY_TIME between", value1, value2, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignBuyTimeNotBetween(Date value1, Date value2) {
            addCriterion("SIGN_BUY_TIME not between", value1, value2, "signBuyTime");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdIsNull() {
            addCriterion("SIGN_SELL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdIsNotNull() {
            addCriterion("SIGN_SELL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdEqualTo(Long value) {
            addCriterion("SIGN_SELL_USER_ID =", value, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdNotEqualTo(Long value) {
            addCriterion("SIGN_SELL_USER_ID <>", value, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdGreaterThan(Long value) {
            addCriterion("SIGN_SELL_USER_ID >", value, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SIGN_SELL_USER_ID >=", value, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdLessThan(Long value) {
            addCriterion("SIGN_SELL_USER_ID <", value, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdLessThanOrEqualTo(Long value) {
            addCriterion("SIGN_SELL_USER_ID <=", value, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdIn(List<Long> values) {
            addCriterion("SIGN_SELL_USER_ID in", values, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdNotIn(List<Long> values) {
            addCriterion("SIGN_SELL_USER_ID not in", values, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdBetween(Long value1, Long value2) {
            addCriterion("SIGN_SELL_USER_ID between", value1, value2, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellUserIdNotBetween(Long value1, Long value2) {
            addCriterion("SIGN_SELL_USER_ID not between", value1, value2, "signSellUserId");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeIsNull() {
            addCriterion("SIGN_SELL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeIsNotNull() {
            addCriterion("SIGN_SELL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeEqualTo(Date value) {
            addCriterion("SIGN_SELL_TIME =", value, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeNotEqualTo(Date value) {
            addCriterion("SIGN_SELL_TIME <>", value, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeGreaterThan(Date value) {
            addCriterion("SIGN_SELL_TIME >", value, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGN_SELL_TIME >=", value, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeLessThan(Date value) {
            addCriterion("SIGN_SELL_TIME <", value, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeLessThanOrEqualTo(Date value) {
            addCriterion("SIGN_SELL_TIME <=", value, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeIn(List<Date> values) {
            addCriterion("SIGN_SELL_TIME in", values, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeNotIn(List<Date> values) {
            addCriterion("SIGN_SELL_TIME not in", values, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeBetween(Date value1, Date value2) {
            addCriterion("SIGN_SELL_TIME between", value1, value2, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignSellTimeNotBetween(Date value1, Date value2) {
            addCriterion("SIGN_SELL_TIME not between", value1, value2, "signSellTime");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNull() {
            addCriterion("SIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSignTypeIsNotNull() {
            addCriterion("SIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSignTypeEqualTo(Long value) {
            addCriterion("SIGN_TYPE =", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotEqualTo(Long value) {
            addCriterion("SIGN_TYPE <>", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThan(Long value) {
            addCriterion("SIGN_TYPE >", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("SIGN_TYPE >=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThan(Long value) {
            addCriterion("SIGN_TYPE <", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeLessThanOrEqualTo(Long value) {
            addCriterion("SIGN_TYPE <=", value, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeIn(List<Long> values) {
            addCriterion("SIGN_TYPE in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotIn(List<Long> values) {
            addCriterion("SIGN_TYPE not in", values, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeBetween(Long value1, Long value2) {
            addCriterion("SIGN_TYPE between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andSignTypeNotBetween(Long value1, Long value2) {
            addCriterion("SIGN_TYPE not between", value1, value2, "signType");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdIsNull() {
            addCriterion("DELIVERY_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdIsNotNull() {
            addCriterion("DELIVERY_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdEqualTo(Long value) {
            addCriterion("DELIVERY_USER_ID =", value, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdNotEqualTo(Long value) {
            addCriterion("DELIVERY_USER_ID <>", value, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdGreaterThan(Long value) {
            addCriterion("DELIVERY_USER_ID >", value, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_USER_ID >=", value, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdLessThan(Long value) {
            addCriterion("DELIVERY_USER_ID <", value, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_USER_ID <=", value, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdIn(List<Long> values) {
            addCriterion("DELIVERY_USER_ID in", values, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdNotIn(List<Long> values) {
            addCriterion("DELIVERY_USER_ID not in", values, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_USER_ID between", value1, value2, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryUserIdNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_USER_ID not between", value1, value2, "deliveryUserId");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("DELIVERY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("DELIVERY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("DELIVERY_TIME =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("DELIVERY_TIME <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("DELIVERY_TIME >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_TIME >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("DELIVERY_TIME <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERY_TIME <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("DELIVERY_TIME in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("DELIVERY_TIME not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_TIME between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERY_TIME not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdIsNull() {
            addCriterion("RECEIPT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdIsNotNull() {
            addCriterion("RECEIPT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdEqualTo(Long value) {
            addCriterion("RECEIPT_USER_ID =", value, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdNotEqualTo(Long value) {
            addCriterion("RECEIPT_USER_ID <>", value, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdGreaterThan(Long value) {
            addCriterion("RECEIPT_USER_ID >", value, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("RECEIPT_USER_ID >=", value, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdLessThan(Long value) {
            addCriterion("RECEIPT_USER_ID <", value, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdLessThanOrEqualTo(Long value) {
            addCriterion("RECEIPT_USER_ID <=", value, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdIn(List<Long> values) {
            addCriterion("RECEIPT_USER_ID in", values, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdNotIn(List<Long> values) {
            addCriterion("RECEIPT_USER_ID not in", values, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdBetween(Long value1, Long value2) {
            addCriterion("RECEIPT_USER_ID between", value1, value2, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptUserIdNotBetween(Long value1, Long value2) {
            addCriterion("RECEIPT_USER_ID not between", value1, value2, "receiptUserId");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("RECEIPT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("RECEIPT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Date value) {
            addCriterion("RECEIPT_TIME =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Date value) {
            addCriterion("RECEIPT_TIME <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Date value) {
            addCriterion("RECEIPT_TIME >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIPT_TIME >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Date value) {
            addCriterion("RECEIPT_TIME <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIPT_TIME <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Date> values) {
            addCriterion("RECEIPT_TIME in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Date> values) {
            addCriterion("RECEIPT_TIME not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("RECEIPT_TIME between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIPT_TIME not between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNull() {
            addCriterion("LAST_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIsNotNull() {
            addCriterion("LAST_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE =", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <>", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_DATE >", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE >=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThan(Date value) {
            addCriterion("LAST_MODIFY_DATE <", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_DATE <=", value, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_DATE not in", values, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_DATE not between", value1, value2, "lastModifyDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentIsNull() {
            addCriterion("LAST_UPDATE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentIsNotNull() {
            addCriterion("LAST_UPDATE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentEqualTo(String value) {
            addCriterion("LAST_UPDATE_CONTENT =", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_CONTENT <>", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentGreaterThan(String value) {
            addCriterion("LAST_UPDATE_CONTENT >", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_CONTENT >=", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentLessThan(String value) {
            addCriterion("LAST_UPDATE_CONTENT <", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_CONTENT <=", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentLike(String value) {
            addCriterion("LAST_UPDATE_CONTENT like", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentNotLike(String value) {
            addCriterion("LAST_UPDATE_CONTENT not like", value, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentIn(List<String> values) {
            addCriterion("LAST_UPDATE_CONTENT in", values, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_CONTENT not in", values, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_CONTENT between", value1, value2, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_CONTENT not between", value1, value2, "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Long value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Long value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Long value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Long value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Long value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Long> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Long> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Long value1, Long value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Long value1, Long value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdIsNull() {
            addCriterion("CLOSE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdIsNotNull() {
            addCriterion("CLOSE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdEqualTo(Long value) {
            addCriterion("CLOSE_USER_ID =", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdNotEqualTo(Long value) {
            addCriterion("CLOSE_USER_ID <>", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdGreaterThan(Long value) {
            addCriterion("CLOSE_USER_ID >", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CLOSE_USER_ID >=", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdLessThan(Long value) {
            addCriterion("CLOSE_USER_ID <", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CLOSE_USER_ID <=", value, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdIn(List<Long> values) {
            addCriterion("CLOSE_USER_ID in", values, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdNotIn(List<Long> values) {
            addCriterion("CLOSE_USER_ID not in", values, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdBetween(Long value1, Long value2) {
            addCriterion("CLOSE_USER_ID between", value1, value2, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andCloseUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CLOSE_USER_ID not between", value1, value2, "closeUserId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("INDUSTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("INDUSTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(Long value) {
            addCriterion("INDUSTRY_ID =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(Long value) {
            addCriterion("INDUSTRY_ID <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(Long value) {
            addCriterion("INDUSTRY_ID >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INDUSTRY_ID >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(Long value) {
            addCriterion("INDUSTRY_ID <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(Long value) {
            addCriterion("INDUSTRY_ID <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<Long> values) {
            addCriterion("INDUSTRY_ID in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<Long> values) {
            addCriterion("INDUSTRY_ID not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(Long value1, Long value2) {
            addCriterion("INDUSTRY_ID between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(Long value1, Long value2) {
            addCriterion("INDUSTRY_ID not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneIsNull() {
            addCriterion("LINK_BUYER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneIsNotNull() {
            addCriterion("LINK_BUYER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneEqualTo(String value) {
            addCriterion("LINK_BUYER_PHONE =", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneNotEqualTo(String value) {
            addCriterion("LINK_BUYER_PHONE <>", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneGreaterThan(String value) {
            addCriterion("LINK_BUYER_PHONE >", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_BUYER_PHONE >=", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneLessThan(String value) {
            addCriterion("LINK_BUYER_PHONE <", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINK_BUYER_PHONE <=", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneLike(String value) {
            addCriterion("LINK_BUYER_PHONE like", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneNotLike(String value) {
            addCriterion("LINK_BUYER_PHONE not like", value, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneIn(List<String> values) {
            addCriterion("LINK_BUYER_PHONE in", values, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneNotIn(List<String> values) {
            addCriterion("LINK_BUYER_PHONE not in", values, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneBetween(String value1, String value2) {
            addCriterion("LINK_BUYER_PHONE between", value1, value2, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneNotBetween(String value1, String value2) {
            addCriterion("LINK_BUYER_PHONE not between", value1, value2, "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneIsNull() {
            addCriterion("LINK_SELLER_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneIsNotNull() {
            addCriterion("LINK_SELLER_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneEqualTo(String value) {
            addCriterion("LINK_SELLER_PHONE =", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneNotEqualTo(String value) {
            addCriterion("LINK_SELLER_PHONE <>", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneGreaterThan(String value) {
            addCriterion("LINK_SELLER_PHONE >", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_SELLER_PHONE >=", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneLessThan(String value) {
            addCriterion("LINK_SELLER_PHONE <", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINK_SELLER_PHONE <=", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneLike(String value) {
            addCriterion("LINK_SELLER_PHONE like", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneNotLike(String value) {
            addCriterion("LINK_SELLER_PHONE not like", value, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneIn(List<String> values) {
            addCriterion("LINK_SELLER_PHONE in", values, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneNotIn(List<String> values) {
            addCriterion("LINK_SELLER_PHONE not in", values, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneBetween(String value1, String value2) {
            addCriterion("LINK_SELLER_PHONE between", value1, value2, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneNotBetween(String value1, String value2) {
            addCriterion("LINK_SELLER_PHONE not between", value1, value2, "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryIsNull() {
            addCriterion("LINK_FACTORY is null");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryIsNotNull() {
            addCriterion("LINK_FACTORY is not null");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryEqualTo(String value) {
            addCriterion("LINK_FACTORY =", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryNotEqualTo(String value) {
            addCriterion("LINK_FACTORY <>", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryGreaterThan(String value) {
            addCriterion("LINK_FACTORY >", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_FACTORY >=", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryLessThan(String value) {
            addCriterion("LINK_FACTORY <", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryLessThanOrEqualTo(String value) {
            addCriterion("LINK_FACTORY <=", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryLike(String value) {
            addCriterion("LINK_FACTORY like", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryNotLike(String value) {
            addCriterion("LINK_FACTORY not like", value, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryIn(List<String> values) {
            addCriterion("LINK_FACTORY in", values, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryNotIn(List<String> values) {
            addCriterion("LINK_FACTORY not in", values, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryBetween(String value1, String value2) {
            addCriterion("LINK_FACTORY between", value1, value2, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryNotBetween(String value1, String value2) {
            addCriterion("LINK_FACTORY not between", value1, value2, "linkFactory");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyIsNull() {
            addCriterion("LINK_DELIVERY_BUY is null");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyIsNotNull() {
            addCriterion("LINK_DELIVERY_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyEqualTo(Long value) {
            addCriterion("LINK_DELIVERY_BUY =", value, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyNotEqualTo(Long value) {
            addCriterion("LINK_DELIVERY_BUY <>", value, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyGreaterThan(Long value) {
            addCriterion("LINK_DELIVERY_BUY >", value, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_DELIVERY_BUY >=", value, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyLessThan(Long value) {
            addCriterion("LINK_DELIVERY_BUY <", value, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyLessThanOrEqualTo(Long value) {
            addCriterion("LINK_DELIVERY_BUY <=", value, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyIn(List<Long> values) {
            addCriterion("LINK_DELIVERY_BUY in", values, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyNotIn(List<Long> values) {
            addCriterion("LINK_DELIVERY_BUY not in", values, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyBetween(Long value1, Long value2) {
            addCriterion("LINK_DELIVERY_BUY between", value1, value2, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkDeliveryBuyNotBetween(Long value1, Long value2) {
            addCriterion("LINK_DELIVERY_BUY not between", value1, value2, "linkDeliveryBuy");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysIsNull() {
            addCriterion("LINK_PAY_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysIsNotNull() {
            addCriterion("LINK_PAY_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysEqualTo(Long value) {
            addCriterion("LINK_PAY_DAYS =", value, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysNotEqualTo(Long value) {
            addCriterion("LINK_PAY_DAYS <>", value, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysGreaterThan(Long value) {
            addCriterion("LINK_PAY_DAYS >", value, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_PAY_DAYS >=", value, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysLessThan(Long value) {
            addCriterion("LINK_PAY_DAYS <", value, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysLessThanOrEqualTo(Long value) {
            addCriterion("LINK_PAY_DAYS <=", value, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysIn(List<Long> values) {
            addCriterion("LINK_PAY_DAYS in", values, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysNotIn(List<Long> values) {
            addCriterion("LINK_PAY_DAYS not in", values, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysBetween(Long value1, Long value2) {
            addCriterion("LINK_PAY_DAYS between", value1, value2, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andLinkPayDaysNotBetween(Long value1, Long value2) {
            addCriterion("LINK_PAY_DAYS not between", value1, value2, "linkPayDays");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateIsNull() {
            addCriterion("IS_ADMIN_CREATE is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateIsNotNull() {
            addCriterion("IS_ADMIN_CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateEqualTo(Long value) {
            addCriterion("IS_ADMIN_CREATE =", value, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateNotEqualTo(Long value) {
            addCriterion("IS_ADMIN_CREATE <>", value, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateGreaterThan(Long value) {
            addCriterion("IS_ADMIN_CREATE >", value, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_ADMIN_CREATE >=", value, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateLessThan(Long value) {
            addCriterion("IS_ADMIN_CREATE <", value, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateLessThanOrEqualTo(Long value) {
            addCriterion("IS_ADMIN_CREATE <=", value, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateIn(List<Long> values) {
            addCriterion("IS_ADMIN_CREATE in", values, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateNotIn(List<Long> values) {
            addCriterion("IS_ADMIN_CREATE not in", values, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateBetween(Long value1, Long value2) {
            addCriterion("IS_ADMIN_CREATE between", value1, value2, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andIsAdminCreateNotBetween(Long value1, Long value2) {
            addCriterion("IS_ADMIN_CREATE not between", value1, value2, "isAdminCreate");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNull() {
            addCriterion("DELIVERY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNotNull() {
            addCriterion("DELIVERY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceEqualTo(Long value) {
            addCriterion("DELIVERY_PRICE =", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotEqualTo(Long value) {
            addCriterion("DELIVERY_PRICE <>", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThan(Long value) {
            addCriterion("DELIVERY_PRICE >", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_PRICE >=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThan(Long value) {
            addCriterion("DELIVERY_PRICE <", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERY_PRICE <=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIn(List<Long> values) {
            addCriterion("DELIVERY_PRICE in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotIn(List<Long> values) {
            addCriterion("DELIVERY_PRICE not in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_PRICE between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERY_PRICE not between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(Long value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(Long value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(Long value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(Long value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(Long value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<Long> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<Long> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(Long value1, Long value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(Long value1, Long value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNull() {
            addCriterion("CURRENCY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIsNotNull() {
            addCriterion("CURRENCY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeEqualTo(Long value) {
            addCriterion("CURRENCY_TYPE =", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotEqualTo(Long value) {
            addCriterion("CURRENCY_TYPE <>", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThan(Long value) {
            addCriterion("CURRENCY_TYPE >", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENCY_TYPE >=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThan(Long value) {
            addCriterion("CURRENCY_TYPE <", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeLessThanOrEqualTo(Long value) {
            addCriterion("CURRENCY_TYPE <=", value, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeIn(List<Long> values) {
            addCriterion("CURRENCY_TYPE in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotIn(List<Long> values) {
            addCriterion("CURRENCY_TYPE not in", values, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeBetween(Long value1, Long value2) {
            addCriterion("CURRENCY_TYPE between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andCurrencyTypeNotBetween(Long value1, Long value2) {
            addCriterion("CURRENCY_TYPE not between", value1, value2, "currencyType");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameIsNull() {
            addCriterion("USER_SELLER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameIsNotNull() {
            addCriterion("USER_SELLER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameEqualTo(String value) {
            addCriterion("USER_SELLER_NAME =", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameNotEqualTo(String value) {
            addCriterion("USER_SELLER_NAME <>", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameGreaterThan(String value) {
            addCriterion("USER_SELLER_NAME >", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SELLER_NAME >=", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameLessThan(String value) {
            addCriterion("USER_SELLER_NAME <", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameLessThanOrEqualTo(String value) {
            addCriterion("USER_SELLER_NAME <=", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameLike(String value) {
            addCriterion("USER_SELLER_NAME like", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameNotLike(String value) {
            addCriterion("USER_SELLER_NAME not like", value, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameIn(List<String> values) {
            addCriterion("USER_SELLER_NAME in", values, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameNotIn(List<String> values) {
            addCriterion("USER_SELLER_NAME not in", values, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameBetween(String value1, String value2) {
            addCriterion("USER_SELLER_NAME between", value1, value2, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameNotBetween(String value1, String value2) {
            addCriterion("USER_SELLER_NAME not between", value1, value2, "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameIsNull() {
            addCriterion("USER_BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameIsNotNull() {
            addCriterion("USER_BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameEqualTo(String value) {
            addCriterion("USER_BUYER_NAME =", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameNotEqualTo(String value) {
            addCriterion("USER_BUYER_NAME <>", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameGreaterThan(String value) {
            addCriterion("USER_BUYER_NAME >", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_BUYER_NAME >=", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameLessThan(String value) {
            addCriterion("USER_BUYER_NAME <", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("USER_BUYER_NAME <=", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameLike(String value) {
            addCriterion("USER_BUYER_NAME like", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameNotLike(String value) {
            addCriterion("USER_BUYER_NAME not like", value, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameIn(List<String> values) {
            addCriterion("USER_BUYER_NAME in", values, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameNotIn(List<String> values) {
            addCriterion("USER_BUYER_NAME not in", values, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameBetween(String value1, String value2) {
            addCriterion("USER_BUYER_NAME between", value1, value2, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameNotBetween(String value1, String value2) {
            addCriterion("USER_BUYER_NAME not between", value1, value2, "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoIsNull() {
            addCriterion("OWN_TRADE_USER_SELLER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoIsNotNull() {
            addCriterion("OWN_TRADE_USER_SELLER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_SELLER_NO =", value, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoNotEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_SELLER_NO <>", value, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoGreaterThan(Long value) {
            addCriterion("OWN_TRADE_USER_SELLER_NO >", value, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoGreaterThanOrEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_SELLER_NO >=", value, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoLessThan(Long value) {
            addCriterion("OWN_TRADE_USER_SELLER_NO <", value, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoLessThanOrEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_SELLER_NO <=", value, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoIn(List<Long> values) {
            addCriterion("OWN_TRADE_USER_SELLER_NO in", values, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoNotIn(List<Long> values) {
            addCriterion("OWN_TRADE_USER_SELLER_NO not in", values, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoBetween(Long value1, Long value2) {
            addCriterion("OWN_TRADE_USER_SELLER_NO between", value1, value2, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserSellerNoNotBetween(Long value1, Long value2) {
            addCriterion("OWN_TRADE_USER_SELLER_NO not between", value1, value2, "ownTradeUserSellerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoIsNull() {
            addCriterion("OWN_TRADE_USER_BUYER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoIsNotNull() {
            addCriterion("OWN_TRADE_USER_BUYER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_BUYER_NO =", value, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoNotEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_BUYER_NO <>", value, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoGreaterThan(Long value) {
            addCriterion("OWN_TRADE_USER_BUYER_NO >", value, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoGreaterThanOrEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_BUYER_NO >=", value, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoLessThan(Long value) {
            addCriterion("OWN_TRADE_USER_BUYER_NO <", value, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoLessThanOrEqualTo(Long value) {
            addCriterion("OWN_TRADE_USER_BUYER_NO <=", value, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoIn(List<Long> values) {
            addCriterion("OWN_TRADE_USER_BUYER_NO in", values, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoNotIn(List<Long> values) {
            addCriterion("OWN_TRADE_USER_BUYER_NO not in", values, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoBetween(Long value1, Long value2) {
            addCriterion("OWN_TRADE_USER_BUYER_NO between", value1, value2, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andOwnTradeUserBuyerNoNotBetween(Long value1, Long value2) {
            addCriterion("OWN_TRADE_USER_BUYER_NO not between", value1, value2, "ownTradeUserBuyerNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Long value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Long value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Long value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Long value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Long value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Long> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Long> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Long value1, Long value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Long value1, Long value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("SPECIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("SPECIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("SPECIFICATION =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("SPECIFICATION <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("SPECIFICATION >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("SPECIFICATION <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("SPECIFICATION like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("SPECIFICATION not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("SPECIFICATION in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("SPECIFICATION not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("SPECIFICATION between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("SPECIFICATION not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andOrderStyleIsNull() {
            addCriterion("ORDER_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStyleIsNotNull() {
            addCriterion("ORDER_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStyleEqualTo(Long value) {
            addCriterion("ORDER_STYLE =", value, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleNotEqualTo(Long value) {
            addCriterion("ORDER_STYLE <>", value, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleGreaterThan(Long value) {
            addCriterion("ORDER_STYLE >", value, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_STYLE >=", value, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleLessThan(Long value) {
            addCriterion("ORDER_STYLE <", value, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_STYLE <=", value, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleIn(List<Long> values) {
            addCriterion("ORDER_STYLE in", values, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleNotIn(List<Long> values) {
            addCriterion("ORDER_STYLE not in", values, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleBetween(Long value1, Long value2) {
            addCriterion("ORDER_STYLE between", value1, value2, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andOrderStyleNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_STYLE not between", value1, value2, "orderStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleIsNull() {
            addCriterion("PAY_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andPayStyleIsNotNull() {
            addCriterion("PAY_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andPayStyleEqualTo(Long value) {
            addCriterion("PAY_STYLE =", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotEqualTo(Long value) {
            addCriterion("PAY_STYLE <>", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleGreaterThan(Long value) {
            addCriterion("PAY_STYLE >", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_STYLE >=", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLessThan(Long value) {
            addCriterion("PAY_STYLE <", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleLessThanOrEqualTo(Long value) {
            addCriterion("PAY_STYLE <=", value, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleIn(List<Long> values) {
            addCriterion("PAY_STYLE in", values, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotIn(List<Long> values) {
            addCriterion("PAY_STYLE not in", values, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleBetween(Long value1, Long value2) {
            addCriterion("PAY_STYLE between", value1, value2, "payStyle");
            return (Criteria) this;
        }

        public Criteria andPayStyleNotBetween(Long value1, Long value2) {
            addCriterion("PAY_STYLE not between", value1, value2, "payStyle");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("ACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("ACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Long value) {
            addCriterion("ACT_ID =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Long value) {
            addCriterion("ACT_ID <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Long value) {
            addCriterion("ACT_ID >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACT_ID >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Long value) {
            addCriterion("ACT_ID <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Long value) {
            addCriterion("ACT_ID <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Long> values) {
            addCriterion("ACT_ID in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Long> values) {
            addCriterion("ACT_ID not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Long value1, Long value2) {
            addCriterion("ACT_ID between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Long value1, Long value2) {
            addCriterion("ACT_ID not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("CONTRACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("CONTRACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("CONTRACT_NO =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("CONTRACT_NO <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("CONTRACT_NO >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("CONTRACT_NO <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("CONTRACT_NO like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("CONTRACT_NO not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("CONTRACT_NO in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("CONTRACT_NO not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxIsNull() {
            addCriterion("PRICE_BASE_TAX is null");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxIsNotNull() {
            addCriterion("PRICE_BASE_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxEqualTo(Long value) {
            addCriterion("PRICE_BASE_TAX =", value, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxNotEqualTo(Long value) {
            addCriterion("PRICE_BASE_TAX <>", value, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxGreaterThan(Long value) {
            addCriterion("PRICE_BASE_TAX >", value, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE_BASE_TAX >=", value, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxLessThan(Long value) {
            addCriterion("PRICE_BASE_TAX <", value, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxLessThanOrEqualTo(Long value) {
            addCriterion("PRICE_BASE_TAX <=", value, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxIn(List<Long> values) {
            addCriterion("PRICE_BASE_TAX in", values, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxNotIn(List<Long> values) {
            addCriterion("PRICE_BASE_TAX not in", values, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxBetween(Long value1, Long value2) {
            addCriterion("PRICE_BASE_TAX between", value1, value2, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceBaseTaxNotBetween(Long value1, Long value2) {
            addCriterion("PRICE_BASE_TAX not between", value1, value2, "priceBaseTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxIsNull() {
            addCriterion("PRICE_TOTAL_TAX is null");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxIsNotNull() {
            addCriterion("PRICE_TOTAL_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX =", value, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxNotEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX <>", value, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxGreaterThan(Long value) {
            addCriterion("PRICE_TOTAL_TAX >", value, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX >=", value, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxLessThan(Long value) {
            addCriterion("PRICE_TOTAL_TAX <", value, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxLessThanOrEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX <=", value, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxIn(List<Long> values) {
            addCriterion("PRICE_TOTAL_TAX in", values, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxNotIn(List<Long> values) {
            addCriterion("PRICE_TOTAL_TAX not in", values, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxBetween(Long value1, Long value2) {
            addCriterion("PRICE_TOTAL_TAX between", value1, value2, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxNotBetween(Long value1, Long value2) {
            addCriterion("PRICE_TOTAL_TAX not between", value1, value2, "priceTotalTax");
            return (Criteria) this;
        }

        public Criteria andTaxTateIsNull() {
            addCriterion("TAX_TATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxTateIsNotNull() {
            addCriterion("TAX_TATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTateEqualTo(Long value) {
            addCriterion("TAX_TATE =", value, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateNotEqualTo(Long value) {
            addCriterion("TAX_TATE <>", value, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateGreaterThan(Long value) {
            addCriterion("TAX_TATE >", value, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateGreaterThanOrEqualTo(Long value) {
            addCriterion("TAX_TATE >=", value, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateLessThan(Long value) {
            addCriterion("TAX_TATE <", value, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateLessThanOrEqualTo(Long value) {
            addCriterion("TAX_TATE <=", value, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateIn(List<Long> values) {
            addCriterion("TAX_TATE in", values, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateNotIn(List<Long> values) {
            addCriterion("TAX_TATE not in", values, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateBetween(Long value1, Long value2) {
            addCriterion("TAX_TATE between", value1, value2, "taxTate");
            return (Criteria) this;
        }

        public Criteria andTaxTateNotBetween(Long value1, Long value2) {
            addCriterion("TAX_TATE not between", value1, value2, "taxTate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateIsNull() {
            addCriterion("PRICE_TOTAL_TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateIsNotNull() {
            addCriterion("PRICE_TOTAL_TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX_RATE =", value, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateNotEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX_RATE <>", value, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateGreaterThan(Long value) {
            addCriterion("PRICE_TOTAL_TAX_RATE >", value, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX_RATE >=", value, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateLessThan(Long value) {
            addCriterion("PRICE_TOTAL_TAX_RATE <", value, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateLessThanOrEqualTo(Long value) {
            addCriterion("PRICE_TOTAL_TAX_RATE <=", value, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateIn(List<Long> values) {
            addCriterion("PRICE_TOTAL_TAX_RATE in", values, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateNotIn(List<Long> values) {
            addCriterion("PRICE_TOTAL_TAX_RATE not in", values, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateBetween(Long value1, Long value2) {
            addCriterion("PRICE_TOTAL_TAX_RATE between", value1, value2, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andPriceTotalTaxRateNotBetween(Long value1, Long value2) {
            addCriterion("PRICE_TOTAL_TAX_RATE not between", value1, value2, "priceTotalTaxRate");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountIsNull() {
            addCriterion("CURR_STOCK_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountIsNotNull() {
            addCriterion("CURR_STOCK_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountEqualTo(Long value) {
            addCriterion("CURR_STOCK_AMOUNT =", value, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountNotEqualTo(Long value) {
            addCriterion("CURR_STOCK_AMOUNT <>", value, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountGreaterThan(Long value) {
            addCriterion("CURR_STOCK_AMOUNT >", value, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("CURR_STOCK_AMOUNT >=", value, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountLessThan(Long value) {
            addCriterion("CURR_STOCK_AMOUNT <", value, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountLessThanOrEqualTo(Long value) {
            addCriterion("CURR_STOCK_AMOUNT <=", value, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountIn(List<Long> values) {
            addCriterion("CURR_STOCK_AMOUNT in", values, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountNotIn(List<Long> values) {
            addCriterion("CURR_STOCK_AMOUNT not in", values, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountBetween(Long value1, Long value2) {
            addCriterion("CURR_STOCK_AMOUNT between", value1, value2, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andCurrStockAmountNotBetween(Long value1, Long value2) {
            addCriterion("CURR_STOCK_AMOUNT not between", value1, value2, "currStockAmount");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdIsNull() {
            addCriterion("SELF_CONTRACT_TEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdIsNotNull() {
            addCriterion("SELF_CONTRACT_TEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdEqualTo(Long value) {
            addCriterion("SELF_CONTRACT_TEMP_ID =", value, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdNotEqualTo(Long value) {
            addCriterion("SELF_CONTRACT_TEMP_ID <>", value, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdGreaterThan(Long value) {
            addCriterion("SELF_CONTRACT_TEMP_ID >", value, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SELF_CONTRACT_TEMP_ID >=", value, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdLessThan(Long value) {
            addCriterion("SELF_CONTRACT_TEMP_ID <", value, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdLessThanOrEqualTo(Long value) {
            addCriterion("SELF_CONTRACT_TEMP_ID <=", value, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdIn(List<Long> values) {
            addCriterion("SELF_CONTRACT_TEMP_ID in", values, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdNotIn(List<Long> values) {
            addCriterion("SELF_CONTRACT_TEMP_ID not in", values, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdBetween(Long value1, Long value2) {
            addCriterion("SELF_CONTRACT_TEMP_ID between", value1, value2, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSelfContractTempIdNotBetween(Long value1, Long value2) {
            addCriterion("SELF_CONTRACT_TEMP_ID not between", value1, value2, "selfContractTempId");
            return (Criteria) this;
        }

        public Criteria andSyncStockIsNull() {
            addCriterion("SYNC_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andSyncStockIsNotNull() {
            addCriterion("SYNC_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStockEqualTo(Long value) {
            addCriterion("SYNC_STOCK =", value, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockNotEqualTo(Long value) {
            addCriterion("SYNC_STOCK <>", value, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockGreaterThan(Long value) {
            addCriterion("SYNC_STOCK >", value, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockGreaterThanOrEqualTo(Long value) {
            addCriterion("SYNC_STOCK >=", value, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockLessThan(Long value) {
            addCriterion("SYNC_STOCK <", value, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockLessThanOrEqualTo(Long value) {
            addCriterion("SYNC_STOCK <=", value, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockIn(List<Long> values) {
            addCriterion("SYNC_STOCK in", values, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockNotIn(List<Long> values) {
            addCriterion("SYNC_STOCK not in", values, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockBetween(Long value1, Long value2) {
            addCriterion("SYNC_STOCK between", value1, value2, "syncStock");
            return (Criteria) this;
        }

        public Criteria andSyncStockNotBetween(Long value1, Long value2) {
            addCriterion("SYNC_STOCK not between", value1, value2, "syncStock");
            return (Criteria) this;
        }

        public Criteria andContractPathIsNull() {
            addCriterion("CONTRACT_PATH is null");
            return (Criteria) this;
        }

        public Criteria andContractPathIsNotNull() {
            addCriterion("CONTRACT_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andContractPathEqualTo(String value) {
            addCriterion("CONTRACT_PATH =", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotEqualTo(String value) {
            addCriterion("CONTRACT_PATH <>", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathGreaterThan(String value) {
            addCriterion("CONTRACT_PATH >", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PATH >=", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathLessThan(String value) {
            addCriterion("CONTRACT_PATH <", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PATH <=", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathLike(String value) {
            addCriterion("CONTRACT_PATH like", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotLike(String value) {
            addCriterion("CONTRACT_PATH not like", value, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathIn(List<String> values) {
            addCriterion("CONTRACT_PATH in", values, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotIn(List<String> values) {
            addCriterion("CONTRACT_PATH not in", values, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathBetween(String value1, String value2) {
            addCriterion("CONTRACT_PATH between", value1, value2, "contractPath");
            return (Criteria) this;
        }

        public Criteria andContractPathNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_PATH not between", value1, value2, "contractPath");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdIsNull() {
            addCriterion("DELIVERYADDR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdIsNotNull() {
            addCriterion("DELIVERYADDR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdEqualTo(Long value) {
            addCriterion("DELIVERYADDR_ID =", value, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdNotEqualTo(Long value) {
            addCriterion("DELIVERYADDR_ID <>", value, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdGreaterThan(Long value) {
            addCriterion("DELIVERYADDR_ID >", value, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DELIVERYADDR_ID >=", value, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdLessThan(Long value) {
            addCriterion("DELIVERYADDR_ID <", value, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdLessThanOrEqualTo(Long value) {
            addCriterion("DELIVERYADDR_ID <=", value, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdIn(List<Long> values) {
            addCriterion("DELIVERYADDR_ID in", values, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdNotIn(List<Long> values) {
            addCriterion("DELIVERYADDR_ID not in", values, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdBetween(Long value1, Long value2) {
            addCriterion("DELIVERYADDR_ID between", value1, value2, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryaddrIdNotBetween(Long value1, Long value2) {
            addCriterion("DELIVERYADDR_ID not between", value1, value2, "deliveryaddrId");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrIsNull() {
            addCriterion("DELIVERY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrIsNotNull() {
            addCriterion("DELIVERY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrEqualTo(String value) {
            addCriterion("DELIVERY_ADDR =", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrNotEqualTo(String value) {
            addCriterion("DELIVERY_ADDR <>", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrGreaterThan(String value) {
            addCriterion("DELIVERY_ADDR >", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADDR >=", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrLessThan(String value) {
            addCriterion("DELIVERY_ADDR <", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADDR <=", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrLike(String value) {
            addCriterion("DELIVERY_ADDR like", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrNotLike(String value) {
            addCriterion("DELIVERY_ADDR not like", value, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrIn(List<String> values) {
            addCriterion("DELIVERY_ADDR in", values, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrNotIn(List<String> values) {
            addCriterion("DELIVERY_ADDR not in", values, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADDR between", value1, value2, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADDR not between", value1, value2, "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDisableTimeIsNull() {
            addCriterion("DISABLE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDisableTimeIsNotNull() {
            addCriterion("DISABLE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDisableTimeEqualTo(Long value) {
            addCriterion("DISABLE_TIME =", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeNotEqualTo(Long value) {
            addCriterion("DISABLE_TIME <>", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeGreaterThan(Long value) {
            addCriterion("DISABLE_TIME >", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("DISABLE_TIME >=", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeLessThan(Long value) {
            addCriterion("DISABLE_TIME <", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeLessThanOrEqualTo(Long value) {
            addCriterion("DISABLE_TIME <=", value, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeIn(List<Long> values) {
            addCriterion("DISABLE_TIME in", values, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeNotIn(List<Long> values) {
            addCriterion("DISABLE_TIME not in", values, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeBetween(Long value1, Long value2) {
            addCriterion("DISABLE_TIME between", value1, value2, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDisableTimeNotBetween(Long value1, Long value2) {
            addCriterion("DISABLE_TIME not between", value1, value2, "disableTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarIsNull() {
            addCriterion("DELIVERY_TIME_VAR is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarIsNotNull() {
            addCriterion("DELIVERY_TIME_VAR is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarEqualTo(String value) {
            addCriterion("DELIVERY_TIME_VAR =", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarNotEqualTo(String value) {
            addCriterion("DELIVERY_TIME_VAR <>", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarGreaterThan(String value) {
            addCriterion("DELIVERY_TIME_VAR >", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TIME_VAR >=", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarLessThan(String value) {
            addCriterion("DELIVERY_TIME_VAR <", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TIME_VAR <=", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarLike(String value) {
            addCriterion("DELIVERY_TIME_VAR like", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarNotLike(String value) {
            addCriterion("DELIVERY_TIME_VAR not like", value, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarIn(List<String> values) {
            addCriterion("DELIVERY_TIME_VAR in", values, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarNotIn(List<String> values) {
            addCriterion("DELIVERY_TIME_VAR not in", values, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarBetween(String value1, String value2) {
            addCriterion("DELIVERY_TIME_VAR between", value1, value2, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_TIME_VAR not between", value1, value2, "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andIsFavorableIsNull() {
            addCriterion("IS_FAVORABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsFavorableIsNotNull() {
            addCriterion("IS_FAVORABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsFavorableEqualTo(Long value) {
            addCriterion("IS_FAVORABLE =", value, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableNotEqualTo(Long value) {
            addCriterion("IS_FAVORABLE <>", value, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableGreaterThan(Long value) {
            addCriterion("IS_FAVORABLE >", value, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableGreaterThanOrEqualTo(Long value) {
            addCriterion("IS_FAVORABLE >=", value, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableLessThan(Long value) {
            addCriterion("IS_FAVORABLE <", value, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableLessThanOrEqualTo(Long value) {
            addCriterion("IS_FAVORABLE <=", value, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableIn(List<Long> values) {
            addCriterion("IS_FAVORABLE in", values, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableNotIn(List<Long> values) {
            addCriterion("IS_FAVORABLE not in", values, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableBetween(Long value1, Long value2) {
            addCriterion("IS_FAVORABLE between", value1, value2, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andIsFavorableNotBetween(Long value1, Long value2) {
            addCriterion("IS_FAVORABLE not between", value1, value2, "isFavorable");
            return (Criteria) this;
        }

        public Criteria andInformationIsNull() {
            addCriterion("INFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andInformationIsNotNull() {
            addCriterion("INFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andInformationEqualTo(String value) {
            addCriterion("INFORMATION =", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotEqualTo(String value) {
            addCriterion("INFORMATION <>", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThan(String value) {
            addCriterion("INFORMATION >", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThanOrEqualTo(String value) {
            addCriterion("INFORMATION >=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThan(String value) {
            addCriterion("INFORMATION <", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThanOrEqualTo(String value) {
            addCriterion("INFORMATION <=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLike(String value) {
            addCriterion("INFORMATION like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotLike(String value) {
            addCriterion("INFORMATION not like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationIn(List<String> values) {
            addCriterion("INFORMATION in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotIn(List<String> values) {
            addCriterion("INFORMATION not in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationBetween(String value1, String value2) {
            addCriterion("INFORMATION between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotBetween(String value1, String value2) {
            addCriterion("INFORMATION not between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedIsNull() {
            addCriterion("AMOUNT_ADVANCED is null");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedIsNotNull() {
            addCriterion("AMOUNT_ADVANCED is not null");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedEqualTo(Long value) {
            addCriterion("AMOUNT_ADVANCED =", value, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedNotEqualTo(Long value) {
            addCriterion("AMOUNT_ADVANCED <>", value, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedGreaterThan(Long value) {
            addCriterion("AMOUNT_ADVANCED >", value, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_ADVANCED >=", value, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedLessThan(Long value) {
            addCriterion("AMOUNT_ADVANCED <", value, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_ADVANCED <=", value, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedIn(List<Long> values) {
            addCriterion("AMOUNT_ADVANCED in", values, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedNotIn(List<Long> values) {
            addCriterion("AMOUNT_ADVANCED not in", values, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_ADVANCED between", value1, value2, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andAmountAdvancedNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_ADVANCED not between", value1, value2, "amountAdvanced");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdIsNull() {
            addCriterion("SELF_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdIsNotNull() {
            addCriterion("SELF_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdEqualTo(Long value) {
            addCriterion("SELF_COMPANY_ID =", value, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdNotEqualTo(Long value) {
            addCriterion("SELF_COMPANY_ID <>", value, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdGreaterThan(Long value) {
            addCriterion("SELF_COMPANY_ID >", value, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SELF_COMPANY_ID >=", value, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdLessThan(Long value) {
            addCriterion("SELF_COMPANY_ID <", value, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("SELF_COMPANY_ID <=", value, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdIn(List<Long> values) {
            addCriterion("SELF_COMPANY_ID in", values, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdNotIn(List<Long> values) {
            addCriterion("SELF_COMPANY_ID not in", values, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdBetween(Long value1, Long value2) {
            addCriterion("SELF_COMPANY_ID between", value1, value2, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andSelfCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("SELF_COMPANY_ID not between", value1, value2, "selfCompanyId");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerIsNull() {
            addCriterion("EARNEST_MONEY_PER is null");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerIsNotNull() {
            addCriterion("EARNEST_MONEY_PER is not null");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER =", value, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerNotEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER <>", value, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerGreaterThan(Long value) {
            addCriterion("EARNEST_MONEY_PER >", value, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerGreaterThanOrEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER >=", value, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerLessThan(Long value) {
            addCriterion("EARNEST_MONEY_PER <", value, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerLessThanOrEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER <=", value, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerIn(List<Long> values) {
            addCriterion("EARNEST_MONEY_PER in", values, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerNotIn(List<Long> values) {
            addCriterion("EARNEST_MONEY_PER not in", values, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerBetween(Long value1, Long value2) {
            addCriterion("EARNEST_MONEY_PER between", value1, value2, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerNotBetween(Long value1, Long value2) {
            addCriterion("EARNEST_MONEY_PER not between", value1, value2, "earnestMoneyPer");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Long value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Long value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Long value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Long value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Long value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Long> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Long> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Long value1, Long value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Long value1, Long value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNull() {
            addCriterion("REFUND_REASON is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNotNull() {
            addCriterion("REFUND_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualTo(String value) {
            addCriterion("REFUND_REASON =", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualTo(String value) {
            addCriterion("REFUND_REASON <>", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThan(String value) {
            addCriterion("REFUND_REASON >", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_REASON >=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThan(String value) {
            addCriterion("REFUND_REASON <", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualTo(String value) {
            addCriterion("REFUND_REASON <=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLike(String value) {
            addCriterion("REFUND_REASON like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotLike(String value) {
            addCriterion("REFUND_REASON not like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIn(List<String> values) {
            addCriterion("REFUND_REASON in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotIn(List<String> values) {
            addCriterion("REFUND_REASON not in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonBetween(String value1, String value2) {
            addCriterion("REFUND_REASON between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotBetween(String value1, String value2) {
            addCriterion("REFUND_REASON not between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNull() {
            addCriterion("REFUND_APPLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIsNotNull() {
            addCriterion("REFUND_APPLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME =", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME <>", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThan(Date value) {
            addCriterion("REFUND_APPLY_TIME >", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME >=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThan(Date value) {
            addCriterion("REFUND_APPLY_TIME <", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_APPLY_TIME <=", value, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeIn(List<Date> values) {
            addCriterion("REFUND_APPLY_TIME in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotIn(List<Date> values) {
            addCriterion("REFUND_APPLY_TIME not in", values, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_APPLY_TIME between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_APPLY_TIME not between", value1, value2, "refundApplyTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeIsNull() {
            addCriterion("REFUND_AGREE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeIsNotNull() {
            addCriterion("REFUND_AGREE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeEqualTo(Date value) {
            addCriterion("REFUND_AGREE_TIME =", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeNotEqualTo(Date value) {
            addCriterion("REFUND_AGREE_TIME <>", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeGreaterThan(Date value) {
            addCriterion("REFUND_AGREE_TIME >", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUND_AGREE_TIME >=", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeLessThan(Date value) {
            addCriterion("REFUND_AGREE_TIME <", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("REFUND_AGREE_TIME <=", value, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeIn(List<Date> values) {
            addCriterion("REFUND_AGREE_TIME in", values, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeNotIn(List<Date> values) {
            addCriterion("REFUND_AGREE_TIME not in", values, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeBetween(Date value1, Date value2) {
            addCriterion("REFUND_AGREE_TIME between", value1, value2, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andRefundAgreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("REFUND_AGREE_TIME not between", value1, value2, "refundAgreeTime");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("CONTRACT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("CONTRACT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(Long value) {
            addCriterion("CONTRACT_STATUS =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(Long value) {
            addCriterion("CONTRACT_STATUS <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(Long value) {
            addCriterion("CONTRACT_STATUS >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_STATUS >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(Long value) {
            addCriterion("CONTRACT_STATUS <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_STATUS <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<Long> values) {
            addCriterion("CONTRACT_STATUS in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<Long> values) {
            addCriterion("CONTRACT_STATUS not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_STATUS between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_STATUS not between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusIsNull() {
            addCriterion("CONTRACT_SELL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusIsNotNull() {
            addCriterion("CONTRACT_SELL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusEqualTo(Long value) {
            addCriterion("CONTRACT_SELL_STATUS =", value, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusNotEqualTo(Long value) {
            addCriterion("CONTRACT_SELL_STATUS <>", value, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusGreaterThan(Long value) {
            addCriterion("CONTRACT_SELL_STATUS >", value, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_SELL_STATUS >=", value, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusLessThan(Long value) {
            addCriterion("CONTRACT_SELL_STATUS <", value, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACT_SELL_STATUS <=", value, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusIn(List<Long> values) {
            addCriterion("CONTRACT_SELL_STATUS in", values, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusNotIn(List<Long> values) {
            addCriterion("CONTRACT_SELL_STATUS not in", values, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_SELL_STATUS between", value1, value2, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andContractSellStatusNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACT_SELL_STATUS not between", value1, value2, "contractSellStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusIsNull() {
            addCriterion("EARNEST_MONEY_PER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusIsNotNull() {
            addCriterion("EARNEST_MONEY_PER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER_STATUS =", value, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusNotEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER_STATUS <>", value, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusGreaterThan(Long value) {
            addCriterion("EARNEST_MONEY_PER_STATUS >", value, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER_STATUS >=", value, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusLessThan(Long value) {
            addCriterion("EARNEST_MONEY_PER_STATUS <", value, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusLessThanOrEqualTo(Long value) {
            addCriterion("EARNEST_MONEY_PER_STATUS <=", value, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusIn(List<Long> values) {
            addCriterion("EARNEST_MONEY_PER_STATUS in", values, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusNotIn(List<Long> values) {
            addCriterion("EARNEST_MONEY_PER_STATUS not in", values, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusBetween(Long value1, Long value2) {
            addCriterion("EARNEST_MONEY_PER_STATUS between", value1, value2, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andEarnestMoneyPerStatusNotBetween(Long value1, Long value2) {
            addCriterion("EARNEST_MONEY_PER_STATUS not between", value1, value2, "earnestMoneyPerStatus");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoIsNull() {
            addCriterion("BILL_ORDER_OWN_TRADE_NO is null");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoIsNotNull() {
            addCriterion("BILL_ORDER_OWN_TRADE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoEqualTo(Long value) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO =", value, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoNotEqualTo(Long value) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO <>", value, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoGreaterThan(Long value) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO >", value, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoGreaterThanOrEqualTo(Long value) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO >=", value, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoLessThan(Long value) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO <", value, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoLessThanOrEqualTo(Long value) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO <=", value, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoIn(List<Long> values) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO in", values, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoNotIn(List<Long> values) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO not in", values, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoBetween(Long value1, Long value2) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO between", value1, value2, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andBillOrderOwnTradeNoNotBetween(Long value1, Long value2) {
            addCriterion("BILL_ORDER_OWN_TRADE_NO not between", value1, value2, "billOrderOwnTradeNo");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNull() {
            addCriterion("OLD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNotNull() {
            addCriterion("OLD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOldStatusEqualTo(Long value) {
            addCriterion("OLD_STATUS =", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotEqualTo(Long value) {
            addCriterion("OLD_STATUS <>", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThan(Long value) {
            addCriterion("OLD_STATUS >", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("OLD_STATUS >=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThan(Long value) {
            addCriterion("OLD_STATUS <", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThanOrEqualTo(Long value) {
            addCriterion("OLD_STATUS <=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusIn(List<Long> values) {
            addCriterion("OLD_STATUS in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotIn(List<Long> values) {
            addCriterion("OLD_STATUS not in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusBetween(Long value1, Long value2) {
            addCriterion("OLD_STATUS between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotBetween(Long value1, Long value2) {
            addCriterion("OLD_STATUS not between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsIsNull() {
            addCriterion("UPDATE_LABELS is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsIsNotNull() {
            addCriterion("UPDATE_LABELS is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsEqualTo(Long value) {
            addCriterion("UPDATE_LABELS =", value, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsNotEqualTo(Long value) {
            addCriterion("UPDATE_LABELS <>", value, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsGreaterThan(Long value) {
            addCriterion("UPDATE_LABELS >", value, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_LABELS >=", value, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsLessThan(Long value) {
            addCriterion("UPDATE_LABELS <", value, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_LABELS <=", value, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsIn(List<Long> values) {
            addCriterion("UPDATE_LABELS in", values, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsNotIn(List<Long> values) {
            addCriterion("UPDATE_LABELS not in", values, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsBetween(Long value1, Long value2) {
            addCriterion("UPDATE_LABELS between", value1, value2, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andUpdateLabelsNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_LABELS not between", value1, value2, "updateLabels");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndIsNull() {
            addCriterion("ACTIVE_TIME_END is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndIsNotNull() {
            addCriterion("ACTIVE_TIME_END is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndEqualTo(Date value) {
            addCriterion("ACTIVE_TIME_END =", value, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndNotEqualTo(Date value) {
            addCriterion("ACTIVE_TIME_END <>", value, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndGreaterThan(Date value) {
            addCriterion("ACTIVE_TIME_END >", value, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIVE_TIME_END >=", value, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndLessThan(Date value) {
            addCriterion("ACTIVE_TIME_END <", value, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("ACTIVE_TIME_END <=", value, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndIn(List<Date> values) {
            addCriterion("ACTIVE_TIME_END in", values, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndNotIn(List<Date> values) {
            addCriterion("ACTIVE_TIME_END not in", values, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndBetween(Date value1, Date value2) {
            addCriterion("ACTIVE_TIME_END between", value1, value2, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("ACTIVE_TIME_END not between", value1, value2, "activeTimeEnd");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("PAY_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("PAY_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(Long value) {
            addCriterion("PAY_CHANNEL =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(Long value) {
            addCriterion("PAY_CHANNEL <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(Long value) {
            addCriterion("PAY_CHANNEL >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_CHANNEL >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(Long value) {
            addCriterion("PAY_CHANNEL <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(Long value) {
            addCriterion("PAY_CHANNEL <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<Long> values) {
            addCriterion("PAY_CHANNEL in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<Long> values) {
            addCriterion("PAY_CHANNEL not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(Long value1, Long value2) {
            addCriterion("PAY_CHANNEL between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(Long value1, Long value2) {
            addCriterion("PAY_CHANNEL not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoIsNull() {
            addCriterion("FOREIGN_PAY_NO is null");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoIsNotNull() {
            addCriterion("FOREIGN_PAY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoEqualTo(String value) {
            addCriterion("FOREIGN_PAY_NO =", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotEqualTo(String value) {
            addCriterion("FOREIGN_PAY_NO <>", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoGreaterThan(String value) {
            addCriterion("FOREIGN_PAY_NO >", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_PAY_NO >=", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLessThan(String value) {
            addCriterion("FOREIGN_PAY_NO <", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_PAY_NO <=", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLike(String value) {
            addCriterion("FOREIGN_PAY_NO like", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotLike(String value) {
            addCriterion("FOREIGN_PAY_NO not like", value, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoIn(List<String> values) {
            addCriterion("FOREIGN_PAY_NO in", values, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotIn(List<String> values) {
            addCriterion("FOREIGN_PAY_NO not in", values, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoBetween(String value1, String value2) {
            addCriterion("FOREIGN_PAY_NO between", value1, value2, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_PAY_NO not between", value1, value2, "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateIsNull() {
            addCriterion("FOREIGN_SETTLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateIsNotNull() {
            addCriterion("FOREIGN_SETTLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateEqualTo(String value) {
            addCriterion("FOREIGN_SETTLE_DATE =", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateNotEqualTo(String value) {
            addCriterion("FOREIGN_SETTLE_DATE <>", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateGreaterThan(String value) {
            addCriterion("FOREIGN_SETTLE_DATE >", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_SETTLE_DATE >=", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateLessThan(String value) {
            addCriterion("FOREIGN_SETTLE_DATE <", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_SETTLE_DATE <=", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateLike(String value) {
            addCriterion("FOREIGN_SETTLE_DATE like", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateNotLike(String value) {
            addCriterion("FOREIGN_SETTLE_DATE not like", value, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateIn(List<String> values) {
            addCriterion("FOREIGN_SETTLE_DATE in", values, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateNotIn(List<String> values) {
            addCriterion("FOREIGN_SETTLE_DATE not in", values, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateBetween(String value1, String value2) {
            addCriterion("FOREIGN_SETTLE_DATE between", value1, value2, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_SETTLE_DATE not between", value1, value2, "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIsNull() {
            addCriterion("ORDER_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIsNotNull() {
            addCriterion("ORDER_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME =", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME <>", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeGreaterThan(Date value) {
            addCriterion("ORDER_SEND_TIME >", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME >=", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeLessThan(Date value) {
            addCriterion("ORDER_SEND_TIME <", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_SEND_TIME <=", value, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeIn(List<Date> values) {
            addCriterion("ORDER_SEND_TIME in", values, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotIn(List<Date> values) {
            addCriterion("ORDER_SEND_TIME not in", values, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeBetween(Date value1, Date value2) {
            addCriterion("ORDER_SEND_TIME between", value1, value2, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andOrderSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_SEND_TIME not between", value1, value2, "orderSendTime");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeIsNull() {
            addCriterion("SPDB_PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeIsNotNull() {
            addCriterion("SPDB_PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeEqualTo(Long value) {
            addCriterion("SPDB_PAY_TYPE =", value, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeNotEqualTo(Long value) {
            addCriterion("SPDB_PAY_TYPE <>", value, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeGreaterThan(Long value) {
            addCriterion("SPDB_PAY_TYPE >", value, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("SPDB_PAY_TYPE >=", value, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeLessThan(Long value) {
            addCriterion("SPDB_PAY_TYPE <", value, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeLessThanOrEqualTo(Long value) {
            addCriterion("SPDB_PAY_TYPE <=", value, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeIn(List<Long> values) {
            addCriterion("SPDB_PAY_TYPE in", values, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeNotIn(List<Long> values) {
            addCriterion("SPDB_PAY_TYPE not in", values, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeBetween(Long value1, Long value2) {
            addCriterion("SPDB_PAY_TYPE between", value1, value2, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbPayTypeNotBetween(Long value1, Long value2) {
            addCriterion("SPDB_PAY_TYPE not between", value1, value2, "spdbPayType");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnIsNull() {
            addCriterion("SPDB_IMPACQSSN is null");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnIsNotNull() {
            addCriterion("SPDB_IMPACQSSN is not null");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnEqualTo(String value) {
            addCriterion("SPDB_IMPACQSSN =", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnNotEqualTo(String value) {
            addCriterion("SPDB_IMPACQSSN <>", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnGreaterThan(String value) {
            addCriterion("SPDB_IMPACQSSN >", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnGreaterThanOrEqualTo(String value) {
            addCriterion("SPDB_IMPACQSSN >=", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnLessThan(String value) {
            addCriterion("SPDB_IMPACQSSN <", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnLessThanOrEqualTo(String value) {
            addCriterion("SPDB_IMPACQSSN <=", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnLike(String value) {
            addCriterion("SPDB_IMPACQSSN like", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnNotLike(String value) {
            addCriterion("SPDB_IMPACQSSN not like", value, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnIn(List<String> values) {
            addCriterion("SPDB_IMPACQSSN in", values, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnNotIn(List<String> values) {
            addCriterion("SPDB_IMPACQSSN not in", values, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnBetween(String value1, String value2) {
            addCriterion("SPDB_IMPACQSSN between", value1, value2, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnNotBetween(String value1, String value2) {
            addCriterion("SPDB_IMPACQSSN not between", value1, value2, "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceIsNull() {
            addCriterion("REFUND_REASON_CHOICE is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceIsNotNull() {
            addCriterion("REFUND_REASON_CHOICE is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceEqualTo(String value) {
            addCriterion("REFUND_REASON_CHOICE =", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceNotEqualTo(String value) {
            addCriterion("REFUND_REASON_CHOICE <>", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceGreaterThan(String value) {
            addCriterion("REFUND_REASON_CHOICE >", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND_REASON_CHOICE >=", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceLessThan(String value) {
            addCriterion("REFUND_REASON_CHOICE <", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceLessThanOrEqualTo(String value) {
            addCriterion("REFUND_REASON_CHOICE <=", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceLike(String value) {
            addCriterion("REFUND_REASON_CHOICE like", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceNotLike(String value) {
            addCriterion("REFUND_REASON_CHOICE not like", value, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceIn(List<String> values) {
            addCriterion("REFUND_REASON_CHOICE in", values, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceNotIn(List<String> values) {
            addCriterion("REFUND_REASON_CHOICE not in", values, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceBetween(String value1, String value2) {
            addCriterion("REFUND_REASON_CHOICE between", value1, value2, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceNotBetween(String value1, String value2) {
            addCriterion("REFUND_REASON_CHOICE not between", value1, value2, "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("REFUND_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("REFUND_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Long value) {
            addCriterion("REFUND_AMOUNT >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Long value) {
            addCriterion("REFUND_AMOUNT <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Long value) {
            addCriterion("REFUND_AMOUNT <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Long> values) {
            addCriterion("REFUND_AMOUNT in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Long> values) {
            addCriterion("REFUND_AMOUNT not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Long value1, Long value2) {
            addCriterion("REFUND_AMOUNT between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Long value1, Long value2) {
            addCriterion("REFUND_AMOUNT not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andExplainReasonIsNull() {
            addCriterion("EXPLAIN_REASON is null");
            return (Criteria) this;
        }

        public Criteria andExplainReasonIsNotNull() {
            addCriterion("EXPLAIN_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andExplainReasonEqualTo(String value) {
            addCriterion("EXPLAIN_REASON =", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonNotEqualTo(String value) {
            addCriterion("EXPLAIN_REASON <>", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonGreaterThan(String value) {
            addCriterion("EXPLAIN_REASON >", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonGreaterThanOrEqualTo(String value) {
            addCriterion("EXPLAIN_REASON >=", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonLessThan(String value) {
            addCriterion("EXPLAIN_REASON <", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonLessThanOrEqualTo(String value) {
            addCriterion("EXPLAIN_REASON <=", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonLike(String value) {
            addCriterion("EXPLAIN_REASON like", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonNotLike(String value) {
            addCriterion("EXPLAIN_REASON not like", value, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonIn(List<String> values) {
            addCriterion("EXPLAIN_REASON in", values, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonNotIn(List<String> values) {
            addCriterion("EXPLAIN_REASON not in", values, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonBetween(String value1, String value2) {
            addCriterion("EXPLAIN_REASON between", value1, value2, "explainReason");
            return (Criteria) this;
        }

        public Criteria andExplainReasonNotBetween(String value1, String value2) {
            addCriterion("EXPLAIN_REASON not between", value1, value2, "explainReason");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNull() {
            addCriterion("PAY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andPayModeIsNotNull() {
            addCriterion("PAY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayModeEqualTo(Long value) {
            addCriterion("PAY_MODE =", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotEqualTo(Long value) {
            addCriterion("PAY_MODE <>", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThan(Long value) {
            addCriterion("PAY_MODE >", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_MODE >=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThan(Long value) {
            addCriterion("PAY_MODE <", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeLessThanOrEqualTo(Long value) {
            addCriterion("PAY_MODE <=", value, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeIn(List<Long> values) {
            addCriterion("PAY_MODE in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotIn(List<Long> values) {
            addCriterion("PAY_MODE not in", values, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeBetween(Long value1, Long value2) {
            addCriterion("PAY_MODE between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andPayModeNotBetween(Long value1, Long value2) {
            addCriterion("PAY_MODE not between", value1, value2, "payMode");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusIsNull() {
            addCriterion("CFCA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusIsNotNull() {
            addCriterion("CFCA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusEqualTo(int value) {
            addCriterion("CFCA_STATUS =", value, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusNotEqualTo(int value) {
            addCriterion("CFCA_STATUS <>", value, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusGreaterThan(int value) {
            addCriterion("CFCA_STATUS >", value, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusGreaterThanOrEqualTo(int value) {
            addCriterion("CFCA_STATUS >=", value, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusLessThan(int value) {
            addCriterion("CFCA_STATUS <", value, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusLessThanOrEqualTo(int value) {
            addCriterion("CFCA_STATUS <=", value, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusIn(List<Integer> values) {
            addCriterion("CFCA_STATUS in", values, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusNotIn(List<Integer> values) {
            addCriterion("CFCA_STATUS not in", values, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusBetween(int value1, int value2) {
            addCriterion("CFCA_STATUS between", value1, value2, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaStatusNotBetween(int value1, int value2) {
            addCriterion("CFCA_STATUS not between", value1, value2, "cfcaStatus");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeIsNull() {
            addCriterion("CFCA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeIsNotNull() {
            addCriterion("CFCA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeEqualTo(int value) {
            addCriterion("CFCA_TYPE =", value, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeNotEqualTo(int value) {
            addCriterion("CFCA_TYPE <>", value, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeGreaterThan(int value) {
            addCriterion("CFCA_TYPE >", value, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeGreaterThanOrEqualTo(int value) {
            addCriterion("CFCA_TYPE >=", value, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeLessThan(int value) {
            addCriterion("CFCA_TYPE <", value, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeLessThanOrEqualTo(int value) {
            addCriterion("CFCA_TYPE <=", value, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeIn(List<Integer> values) {
            addCriterion("CFCA_TYPE in", values, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeNotIn(List<Integer> values) {
            addCriterion("CFCA_TYPE not in", values, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeBetween(int value1, int value2) {
            addCriterion("CFCA_TYPE between", value1, value2, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andCfcaTypeNotBetween(int value1, int value2) {
            addCriterion("CFCA_TYPE not between", value1, value2, "cfcaType");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdIsNull() {
            addCriterion("LG_NEEDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdIsNotNull() {
            addCriterion("LG_NEEDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdEqualTo(Long value) {
            addCriterion("LG_NEEDS_ID =", value, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdNotEqualTo(Long value) {
            addCriterion("LG_NEEDS_ID <>", value, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdGreaterThan(Long value) {
            addCriterion("LG_NEEDS_ID >", value, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LG_NEEDS_ID >=", value, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdLessThan(Long value) {
            addCriterion("LG_NEEDS_ID <", value, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdLessThanOrEqualTo(Long value) {
            addCriterion("LG_NEEDS_ID <=", value, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdIn(List<Long> values) {
            addCriterion("LG_NEEDS_ID in", values, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdNotIn(List<Long> values) {
            addCriterion("LG_NEEDS_ID not in", values, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdBetween(Long value1, Long value2) {
            addCriterion("LG_NEEDS_ID between", value1, value2, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgNeedsIdNotBetween(Long value1, Long value2) {
            addCriterion("LG_NEEDS_ID not between", value1, value2, "lgNeedsId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdIsNull() {
            addCriterion("LG_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdIsNotNull() {
            addCriterion("LG_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdEqualTo(Long value) {
            addCriterion("LG_ORDER_ID =", value, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdNotEqualTo(Long value) {
            addCriterion("LG_ORDER_ID <>", value, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdGreaterThan(Long value) {
            addCriterion("LG_ORDER_ID >", value, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LG_ORDER_ID >=", value, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdLessThan(Long value) {
            addCriterion("LG_ORDER_ID <", value, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("LG_ORDER_ID <=", value, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdIn(List<Long> values) {
            addCriterion("LG_ORDER_ID in", values, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdNotIn(List<Long> values) {
            addCriterion("LG_ORDER_ID not in", values, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdBetween(Long value1, Long value2) {
            addCriterion("LG_ORDER_ID between", value1, value2, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("LG_ORDER_ID not between", value1, value2, "lgOrderId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdIsNull() {
            addCriterion("LG_WILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLgWillIdIsNotNull() {
            addCriterion("LG_WILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLgWillIdEqualTo(Long value) {
            addCriterion("LG_WILL_ID =", value, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdNotEqualTo(Long value) {
            addCriterion("LG_WILL_ID <>", value, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdGreaterThan(Long value) {
            addCriterion("LG_WILL_ID >", value, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LG_WILL_ID >=", value, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdLessThan(Long value) {
            addCriterion("LG_WILL_ID <", value, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdLessThanOrEqualTo(Long value) {
            addCriterion("LG_WILL_ID <=", value, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdIn(List<Long> values) {
            addCriterion("LG_WILL_ID in", values, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdNotIn(List<Long> values) {
            addCriterion("LG_WILL_ID not in", values, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdBetween(Long value1, Long value2) {
            addCriterion("LG_WILL_ID between", value1, value2, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andLgWillIdNotBetween(Long value1, Long value2) {
            addCriterion("LG_WILL_ID not between", value1, value2, "lgWillId");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(ORDER_NO) like", value.toUpperCase(), "orderNo");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andLastUpdateContentLikeInsensitive(String value) {
            addCriterion("upper(LAST_UPDATE_CONTENT) like", value.toUpperCase(), "lastUpdateContent");
            return (Criteria) this;
        }

        public Criteria andLinkBuyerPhoneLikeInsensitive(String value) {
            addCriterion("upper(LINK_BUYER_PHONE) like", value.toUpperCase(), "linkBuyerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkSellerPhoneLikeInsensitive(String value) {
            addCriterion("upper(LINK_SELLER_PHONE) like", value.toUpperCase(), "linkSellerPhone");
            return (Criteria) this;
        }

        public Criteria andLinkFactoryLikeInsensitive(String value) {
            addCriterion("upper(LINK_FACTORY) like", value.toUpperCase(), "linkFactory");
            return (Criteria) this;
        }

        public Criteria andUserSellerNameLikeInsensitive(String value) {
            addCriterion("upper(USER_SELLER_NAME) like", value.toUpperCase(), "userSellerName");
            return (Criteria) this;
        }

        public Criteria andUserBuyerNameLikeInsensitive(String value) {
            addCriterion("upper(USER_BUYER_NAME) like", value.toUpperCase(), "userBuyerName");
            return (Criteria) this;
        }

        public Criteria andIdNoLikeInsensitive(String value) {
            addCriterion("upper(ID_NO) like", value.toUpperCase(), "idNo");
            return (Criteria) this;
        }

        public Criteria andSpecificationLikeInsensitive(String value) {
            addCriterion("upper(SPECIFICATION) like", value.toUpperCase(), "specification");
            return (Criteria) this;
        }

        public Criteria andContractNoLikeInsensitive(String value) {
            addCriterion("upper(CONTRACT_NO) like", value.toUpperCase(), "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractPathLikeInsensitive(String value) {
            addCriterion("upper(CONTRACT_PATH) like", value.toUpperCase(), "contractPath");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddrLikeInsensitive(String value) {
            addCriterion("upper(DELIVERY_ADDR) like", value.toUpperCase(), "deliveryAddr");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeVarLikeInsensitive(String value) {
            addCriterion("upper(DELIVERY_TIME_VAR) like", value.toUpperCase(), "deliveryTimeVar");
            return (Criteria) this;
        }

        public Criteria andInformationLikeInsensitive(String value) {
            addCriterion("upper(INFORMATION) like", value.toUpperCase(), "information");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLikeInsensitive(String value) {
            addCriterion("upper(REFUND_REASON) like", value.toUpperCase(), "refundReason");
            return (Criteria) this;
        }

        public Criteria andForeignPayNoLikeInsensitive(String value) {
            addCriterion("upper(FOREIGN_PAY_NO) like", value.toUpperCase(), "foreignPayNo");
            return (Criteria) this;
        }

        public Criteria andForeignSettleDateLikeInsensitive(String value) {
            addCriterion("upper(FOREIGN_SETTLE_DATE) like", value.toUpperCase(), "foreignSettleDate");
            return (Criteria) this;
        }

        public Criteria andSpdbImpacqssnLikeInsensitive(String value) {
            addCriterion("upper(SPDB_IMPACQSSN) like", value.toUpperCase(), "spdbImpacqssn");
            return (Criteria) this;
        }

        public Criteria andRefundReasonChoiceLikeInsensitive(String value) {
            addCriterion("upper(REFUND_REASON_CHOICE) like", value.toUpperCase(), "refundReasonChoice");
            return (Criteria) this;
        }

        public Criteria andExplainReasonLikeInsensitive(String value) {
            addCriterion("upper(EXPLAIN_REASON) like", value.toUpperCase(), "explainReason");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}