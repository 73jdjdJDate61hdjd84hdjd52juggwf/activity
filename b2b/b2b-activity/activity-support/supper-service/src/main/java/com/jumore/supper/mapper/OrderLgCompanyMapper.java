package com.jumore.supper.mapper;

import com.jumore.supper.model.OrderLgCompany;
import com.jumore.supper.model.OrderLgCompanyQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderLgCompanyMapper {
    int countByExample(OrderLgCompanyQueryHelper example);

    int deleteByExample(OrderLgCompanyQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderLgCompany record);

    int insertSelective(OrderLgCompany record);

    List<OrderLgCompany> selectByExample(OrderLgCompanyQueryHelper example);

    OrderLgCompany selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderLgCompany record, @Param("example") OrderLgCompanyQueryHelper example);

    int updateByExample(@Param("record") OrderLgCompany record, @Param("example") OrderLgCompanyQueryHelper example);

    int updateByPrimaryKeySelective(OrderLgCompany record);

    int updateByPrimaryKey(OrderLgCompany record);
}