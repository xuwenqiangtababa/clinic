package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeWestTemplate;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class RecipeWestTemplateMapperTest {
    private static RecipeWestTemplateMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(RecipeWestTemplateMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/RecipeWestTemplateMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(RecipeWestTemplateMapper.class, builder.openSession(true));
    }

    @Test
    public void testFinRecipeWestTemplateAll() throws FileNotFoundException {
        List<RecipeWestTemplate> list = mapper.finRecipeWestTemplateAll(2, "公", "0", null);
        System.out.println("list = " + list.toString());
    }
}
