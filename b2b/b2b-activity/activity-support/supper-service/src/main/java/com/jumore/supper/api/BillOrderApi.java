package com.jumore.supper.api;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.supper.mapper.BillOrderMapper;
import com.jumore.supper.model.BillOrder;
import com.jumore.supper.model.BillOrderQueryHelper;

@Service
public class BillOrderApi implements IBillOrderApi {

	@Resource
	BillOrderMapper billOrderMapper;

	@Override
	public int countByExample(BillOrderQueryHelper example) {
		return billOrderMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(BillOrderQueryHelper example) {
		return billOrderMapper.countByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(BigDecimal id) {
		return billOrderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(BillOrder record) {
		return billOrderMapper.insert(record);
	}

	@Override
	public int insertSelective(BillOrder record) {
		return billOrderMapper.insertSelective(record);
	}

	@Override
	public List<BillOrder> selectByExample(BillOrderQueryHelper example) {
		return billOrderMapper.selectByExample(example);
	}

	@Override
	public BillOrder selectByPrimaryKey(BigDecimal id) {
		return billOrderMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(BillOrder record, BillOrderQueryHelper example) {
		return billOrderMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(BillOrder record, BillOrderQueryHelper example) {
		return billOrderMapper.countByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(BillOrder record) {
		return billOrderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BillOrder record) {
		return billOrderMapper.updateByPrimaryKey(record);
	}

}