package cn.bdqn.master.mapper;

import cn.bdqn.master.pojo.Patient;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class PatientMapperTest {
    private static PatientMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(PatientMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/PatientMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(PatientMapper.class, builder.openSession(true));
    }

    @Test
    public void testFinPatienAll() throws FileNotFoundException {
        List<Patient> patients = mapper.finPatienAll(null, null);
        System.out.println("patients = " + patients.toString());
        List<Patient> patients1 = mapper.finPatienAll(null, "123456");
        System.out.println("phone = " + patients1.toString());
        List<Patient> patients2 = mapper.finPatienAll("1", null);
        System.out.println("name = " + patients2.toString());
    }
}
