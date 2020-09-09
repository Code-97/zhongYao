package cn.azh.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.azh.bean.ZhongYao;
import cn.azh.dao.ZhongYaoMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application*.xml"})
public class Test {

	@Autowired
	ZhongYaoMapper zhongYaoMapper;
	@Autowired
	SqlSessionFactory ssf;
	
	@org.junit.Test
	public void test01() {
		ZhongYao selectByPrimaryKey = zhongYaoMapper.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
	}

	@org.junit.Test
	public void testSelect() { 

		SqlSession session = ssf.openSession(); 
		ZhongYaoMapper mapper = session.getMapper(ZhongYaoMapper.class);
		ZhongYao key = mapper.selectByPrimaryKey(1);
		System.out.println(key);
		
	}
}