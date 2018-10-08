package cqeec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cqeec.is.config.ApplicationConfig;
import com.cqeec.is.dal.StudentCourseScoreMapper;
import com.cqeec.is.dml.StudentCourseScore;
import com.cqeec.is.dml.StudentCourseScore2;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
public class TestSCS {
	@Autowired
	private StudentCourseScoreMapper studentCourseScoreMapper;

	@Test
	public void testFindById2() {
		StudentCourseScore2 obj = studentCourseScoreMapper.findById2("65836610-bd36-11e8-9178-680715c018da");
		obj.print();
	}

	@Test
	public void test() {
		StudentCourseScore obj = studentCourseScoreMapper.findById("65836610-bd36-11e8-9178-680715c018da");
		obj.print();
	}

}
