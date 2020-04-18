package cn.bdqn.master.service.impl;

import cn.bdqn.master.mapper.PatientMapper;
import cn.bdqn.master.pojo.Patient;
import cn.bdqn.master.service.PatientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Resource
    private PatientMapper patientMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return patientMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Patient record) {
        return patientMapper.insert(record);
    }

    @Override
    public int insertSelective(Patient record) {
        return patientMapper.insertSelective(record);
    }

    @Override
    public Patient selectByPrimaryKey(Integer id) {
        return patientMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Patient record) {
        return patientMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Patient record) {
        return patientMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Patient> finPatienAll(String username, String phone) {
        return patientMapper.finPatienAll(username, phone);
    }

}

