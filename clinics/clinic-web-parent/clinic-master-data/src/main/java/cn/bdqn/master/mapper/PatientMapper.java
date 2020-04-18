package cn.bdqn.master.mapper;

import cn.bdqn.master.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    List<Patient> finPatienAll(@Param("username") String username, @Param("phone") String phone);
}