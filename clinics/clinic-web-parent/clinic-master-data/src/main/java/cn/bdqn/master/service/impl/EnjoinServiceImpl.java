package cn.bdqn.master.service.impl;

import cn.bdqn.master.mapper.EnjoinMapper;
import cn.bdqn.master.pojo.Enjoin;
import cn.bdqn.master.service.EnjoinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnjoinServiceImpl implements EnjoinService {

    @Resource
    private EnjoinMapper enjoinMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return enjoinMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Enjoin record) {
        return enjoinMapper.insert(record);
    }

    @Override
    public int insertSelective(Enjoin record) {
        return enjoinMapper.insertSelective(record);
    }

    @Override
    public Enjoin selectByPrimaryKey(Integer id) {
        return enjoinMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Enjoin record) {
        return enjoinMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Enjoin record) {
        return enjoinMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Enjoin> finEnjoin() {
        return enjoinMapper.finEnjoin();
    }

}

