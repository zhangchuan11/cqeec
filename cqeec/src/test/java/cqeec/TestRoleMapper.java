package cqeec;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeec.is.config.ApplicationConfig;
import com.cqeec.is.dal.RoleMapper;
import com.cqeec.is.dml.Role;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class TestRoleMapper {

	@Autowired
	private RoleMapper roleMapper;

	@Test
	public void testFindAll() {
		List<Role> list = roleMapper.findAll();
		for (Role r : list) {
			System.out.println(r.getName());
		}
	}

	@Test
	public void test() {
		Role role = roleMapper.findById("92B0A794-73D3-11E8-B278-C85B764C5D47");
		System.out.println(role.getName());
	}

}
