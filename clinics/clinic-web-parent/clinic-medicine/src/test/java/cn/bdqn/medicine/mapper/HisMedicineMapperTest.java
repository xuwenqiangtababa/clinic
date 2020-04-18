package cn.bdqn.medicine.mapper;

import cn.bdqn.medicine.pojo.HisMedicine;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class HisMedicineMapperTest {
    private static HisMedicineMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(HisMedicineMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/HisMedicineMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(HisMedicineMapper.class, builder.openSession(true));
    }

    @Test
    public void testFinHisMedicineTypeAndMedicenName() throws FileNotFoundException {
        List<HisMedicine> list = mapper.finHisMedicineTypeAndMedicenName(1, null);
        System.out.println("list = " + list.toString());
    }

    @Test
    public void testFinHisMedicineTypeAndMedicenName2() throws FileNotFoundException {
        HisMedicine hisMedicine = mapper.selectByPrimaryKey(1L);
        System.out.println("hisMedicine = " + hisMedicine.toString());
    }
}
