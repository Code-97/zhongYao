package cn.azh.dao;

import cn.azh.bean.ZhongYao;
import cn.azh.bean.ZhongYaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhongYaoMapper {
    int countByExample(ZhongYaoExample example);

    int deleteByExample(ZhongYaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZhongYao record);

    int insertSelective(ZhongYao record);

    List<ZhongYao> selectByExample(ZhongYaoExample example);

    ZhongYao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZhongYao record, @Param("example") ZhongYaoExample example);

    int updateByExample(@Param("record") ZhongYao record, @Param("example") ZhongYaoExample example);

    int updateByPrimaryKeySelective(ZhongYao record);

    int updateByPrimaryKey(ZhongYao record);
}