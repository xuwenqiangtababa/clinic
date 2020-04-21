package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeInspectTemplate;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class RecipeInspectTemplateMapperTest {
    private static RecipeInspectTemplateMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(RecipeInspectTemplateMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/RecipeInspectTemplateMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(RecipeInspectTemplateMapper.class, builder.openSession(true));
    }

    @Test
    public void testFinRecipeInspectTemplateAll() throws FileNotFoundException {
        List<RecipeInspectTemplate> recipeInspectTemplates = mapper.finRecipeInspectTemplateAll(null, null, null, null);
    }

}
