package cn.bdqn.prescription.mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

public class RecipeInspectTemplateDetailsMapperTest {
    private static RecipeInspectTemplateDetailsMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(RecipeInspectTemplateDetailsMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/RecipeInspectTemplateDetailsMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(RecipeInspectTemplateDetailsMapper.class, builder.openSession(true));
    }

    @Test
    public void testFinRecipeInspectTemplateDetailsAndInspet() throws FileNotFoundException {
        mapper.finRecipeInspectTemplateDetailsAndInspet(1);
    }
}
