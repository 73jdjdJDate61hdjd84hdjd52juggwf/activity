package com.jumore.supper.mapper;

import com.jumore.supper.model.BillOrder;
import com.jumore.supper.model.BillOrderQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillOrderMapper {
    int countByExample(BillOrderQueryHelper example);

    int deleteByExample(BillOrderQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(BillOrder record);

    int insertSelective(BillOrder record);

    List<BillOrder> selectByExample(BillOrderQueryHelper example);

    BillOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillOrder record, @Param("example") BillOrderQueryHelper example);

    int updateByExample(@Param("record") BillOrder record, @Param("example") BillOrderQueryHelper example);

    int updateByPrimaryKeySelective(BillOrder record);

    int updateByPrimaryKey(BillOrder record);
}