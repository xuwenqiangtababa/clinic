package cn.bdqn.master.service.impl;

import cn.bdqn.master.mapper.ClinicDoctorMapper;
import cn.bdqn.master.pojo.ClinicDoctor;
import cn.bdqn.master.service.ClinicDoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClinicDoctorServiceImpl implements ClinicDoctorService {

    @Resource
    private ClinicDoctorMapper clinicDoctorMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return clinicDoctorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ClinicDoctor record) {
        return clinicDoctorMapper.insert(record);
    }

    @Override
    public int insertSelective(ClinicDoctor record) {
        return clinicDoctorMapper.insertSelective(record);
    }

    @Override
    public ClinicDoctor selectByPrimaryKey(Integer id) {
        return clinicDoctorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ClinicDoctor record) {
        return clinicDoctorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ClinicDoctor record) {
        return clinicDoctorMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ClinicDoctor> finClinicDoctor() {
        return clinicDoctorMapper.finClinicDoctor();
    }

}

