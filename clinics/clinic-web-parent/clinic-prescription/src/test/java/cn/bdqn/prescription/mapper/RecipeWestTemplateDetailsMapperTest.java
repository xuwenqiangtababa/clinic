package cn.bdqn.prescription.mapper;

import cn.bdqn.prescription.pojo.RecipeWestTemplateDetails;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class RecipeWestTemplateDetailsMapperTest {
    private static RecipeWestTemplateDetailsMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(RecipeWestTemplateDetailsMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/RecipeWestTemplateDetailsMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(RecipeWestTemplateDetailsMapper.class, builder.openSession(true));
    }

    @Test
    public void testFinRecipeWestTemplateDetailsPage() throws FileNotFoundException {
        List<RecipeWestTemplateDetails> recipeWestTemplateDetails = mapper.finRecipeWestTemplateDetailsPage(1);
        System.out.println("recipeWestTemplateDetails = " + recipeWestTemplateDetails.size());
    }
}
