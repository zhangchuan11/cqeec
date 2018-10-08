package cqeec;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeec.is.config.ApplicationConfig;
import com.cqeec.is.dal.SystemUserMapper;
import com.cqeec.is.dml.SystemUser;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class TestSystemUserDao {
	@Autowired
	private SystemUserMapper systemUserMaper;
	
	@Test
	public void testFindAll() {
		List<SystemUser> list = systemUserMaper.findAll();
		for (SystemUser u : list) {
			System.out.println(u.toString());
		}
	}

	@Test
	public void testQuery() {
		SystemUser su = new SystemUser();
		//su.setId("4F31273B-D3DC-473B-85FA-24210EE6C421");
		su.setName("张三1");
		//su.setPassword("123");
		List<SystemUser> list = systemUserMaper.query(su);
		for (SystemUser u : list) {
			System.out.println(u.toString());
		}
	}

	@Test
	public void testDeleteById() {
		systemUserMaper.deleteById("6370D5F2-4C2F-4564-B914-E926FF2148C9");
	}

	@Test
	public void testUpdate() {
		SystemUser su = new SystemUser();
		su.setId("4F31273B-D3DC-473B-85FA-24210EE6C421");
		su.setDescription("测试添加的数据！");
		systemUserMaper.update(su);
	}

	@Test
	public void testUpdatePassword3() {
		// systemUserMaper.updatePassword("6370D5F2-4C2F-4564-B914-E926FF2148C9",
		// "222222222222");
		List<Object> param = new ArrayList<Object>();
		param.add("6370D5F2-4C2F-4564-B914-E926FF2148C9");
		param.add("888888888888888");
		systemUserMaper.updatePassword3(param);
	}

	@Test
	public void testUpdatePassword2() {
		// systemUserMaper.updatePassword("6370D5F2-4C2F-4564-B914-E926FF2148C9",
		// "222222222222");
		Map<String, Object> param = new HashMap();
		param.put("id", "6370D5F2-4C2F-4564-B914-E926FF2148C9");
		param.put("password", "111111111111111111111111");
		systemUserMaper.updatePassword2(param);
	}

	@Test
	public void testInsertDS() {
		SystemUser su = new SystemUser();
		su.setId(UUID.randomUUID().toString().toUpperCase());
		su.setName("测试2222222222");
		su.setLogin_Name("CS2222222222222");
		Date curDate = new Date();
		su.setCreateTime(curDate);
		su.setLastModifyTime(curDate);
		// su.setParent("4F31273B-D3DC-473B-85FA-24210EE6C421");
		systemUserMaper.insertDS(su);
	}

	@Test
	public void testRegister() {
		SystemUser su = new SystemUser();
		su.setId(UUID.randomUUID().toString().toUpperCase());
		su.setName("测试1");
		su.setLogin_Name("CS1");
		Date curDate = new Date();
		su.setCreateTime(curDate);
		su.setLastModifyTime(curDate);
		su.setPassword("123");
		systemUserMaper.register(su);
	}

	@Test
	public void testInsert() {
		SystemUser su = new SystemUser();
		su.setId(UUID.randomUUID().toString().toUpperCase());
		su.setName("张三1");
		su.setLogin_Name("ZS1");
		Date curDate = new Date();
		su.setCreateTime(curDate);
		su.setLastModifyTime(curDate);
		systemUserMaper.insert(su);
	}

	@Test
	public void test() {
		SystemUser su = systemUserMaper.findById("DE06C669-73D9-11E8-B278-C85B764C5D47");
		// SystemUser su = userService.login("DE06C669-73D9-11E8-B278-C85B764C5D47",
		// "1");
		System.out.println(su);
		System.out.println(su.getName());
		System.out.println(su.getLogin_Name());
		System.out.println(su.getPassword());
	}

}
