package com.jumore.supper.api;

import java.math.BigDecimal;
import java.util.List;

import com.jumore.supper.model.BillOrder;
import com.jumore.supper.model.BillOrderQueryHelper;

public interface IBillOrderApi {
	int countByExample(BillOrderQueryHelper example);

	int deleteByExample(BillOrderQueryHelper example);

	int deleteByPrimaryKey(BigDecimal id);

	int insert(BillOrder record);

	int insertSelective(BillOrder record);

	List<BillOrder> selectByExample(BillOrderQueryHelper example);

	BillOrder selectByPrimaryKey(BigDecimal id);

	int updateByExampleSelective(BillOrder record, BillOrderQueryHelper example);

	int updateByExample(BillOrder record, BillOrderQueryHelper example);

	int updateByPrimaryKeySelective(BillOrder record);

	int updateByPrimaryKey(BillOrder record);
}