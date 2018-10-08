package cqeec;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeec.is.config.ApplicationConfig;
import com.cqeec.is.dal.RoleMapper;
import com.cqeec.is.dal.TutorMapper;
import com.cqeec.is.dml.Role;
import com.cqeec.is.dml.Tutor;
import com.cqeec.is.dml.TutorCourse;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class TestTutorMapper {

	@Autowired
	private TutorMapper tutorMapper;

	@Test
	public void test() {
		//Tutor tutor = tutorMapper.findById("a1328b9a-c1f5-11e8-bd45-680715c018da");
		Tutor tutor = tutorMapper.findById("a2d8ba17-c1f5-11e8-bd45-680715c018da");
		System.out.println(tutor.getName());
		List<TutorCourse> list = tutor.getTutorCourse();
		for (TutorCourse tc : list) {
			System.out.println("\t"+tc.getName());
		}
	}

}
