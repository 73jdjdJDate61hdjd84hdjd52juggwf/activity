package com.jumore.supper.api;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.supper.mapper.OrderLgCompanyMapper;
import com.jumore.supper.model.OrderLgCompany;
import com.jumore.supper.model.OrderLgCompanyQueryHelper;

@Service
public class OrderLgCompanyApi implements IOrderLgCompanyApi {

	@Resource
	OrderLgCompanyMapper orderLgCompanyMapper;

	@Override
	public int countByExample(OrderLgCompanyQueryHelper example) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OrderLgCompanyQueryHelper example) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(BigDecimal id) {
		return orderLgCompanyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OrderLgCompany record) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int insertSelective(OrderLgCompany record) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public List<OrderLgCompany> selectByExample(OrderLgCompanyQueryHelper example) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public OrderLgCompany selectByPrimaryKey(BigDecimal id) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int updateByExampleSelective(OrderLgCompany record, OrderLgCompanyQueryHelper example) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int updateByExample(OrderLgCompany record, OrderLgCompanyQueryHelper example) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderLgCompany record) {
		return orderLgCompanyMapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKey(OrderLgCompany record) {
		return orderLgCompanyMapper.countByExample(example);
	}

}