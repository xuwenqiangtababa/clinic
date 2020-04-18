package cn.bdqn.master.service;


import cn.bdqn.master.pojo.ClinicDoctor;

import java.util.List;

public interface ClinicDoctorService {


    int deleteByPrimaryKey(Integer id);

    int insert(ClinicDoctor record);

    int insertSelective(ClinicDoctor record);

    ClinicDoctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClinicDoctor record);

    int updateByPrimaryKey(ClinicDoctor record);

    List<ClinicDoctor> finClinicDoctor();
}

