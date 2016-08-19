package com.jumore.supper.api;

import java.math.BigDecimal;
import java.util.List;

import com.jumore.supper.model.OrderLgCompany;
import com.jumore.supper.model.OrderLgCompanyQueryHelper;

public interface IOrderLgCompanyApi {
	int countByExample(OrderLgCompanyQueryHelper example);

	int deleteByExample(OrderLgCompanyQueryHelper example);

	int deleteByPrimaryKey(BigDecimal id);

	int insert(OrderLgCompany record);

	int insertSelective(OrderLgCompany record);

	List<OrderLgCompany> selectByExample(OrderLgCompanyQueryHelper example);

	OrderLgCompany selectByPrimaryKey(BigDecimal id);

	int updateByExampleSelective(OrderLgCompany record, OrderLgCompanyQueryHelper example);

	int updateByExample(OrderLgCompany record, OrderLgCompanyQueryHelper example);

	int updateByPrimaryKeySelective(OrderLgCompany record);

	int updateByPrimaryKey(OrderLgCompany record);
}