package cqeec;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeec.is.config.ApplicationConfig;
import com.cqeec.is.dal.StudentMapper;
import com.cqeec.is.dml.Student;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class TestStudentMapper {

	@Autowired
	private StudentMapper studentMapper;
	
	@Test
	public void testInsertStudent() {
		Student s =new Student();
		s.setId(UUID.randomUUID().toString());
		s.setName("学生22222222222222");
		studentMapper.insertStudent(s);
	}
	
	@Test
	public void testInsert() {
		Student s =new Student();
		s.setId(UUID.randomUUID().toString());
		s.setName("学生11111111111111");
		studentMapper.insert(s);
	}

	@Test
	public void testFindById() {
		Student s = studentMapper.findStudentById("04a3e6c5-bd36-11e8-9178-680715c018da");
		System.out.println(s);
	}

	@Test
	public void testFindAll() {
		List<Student> list = studentMapper.findAll3();
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
