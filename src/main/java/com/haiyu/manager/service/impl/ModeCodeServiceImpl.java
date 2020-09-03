package com.haiyu.manager.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiyu.manager.dao.dic.ModeCodeMapper;
import com.haiyu.manager.pojo.dic.ModeCodeDO;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.ModeCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeCodeServiceImpl implements ModeCodeService {

    @Autowired
    private ModeCodeMapper modeCodeMapper;

    @Override
    public PageDataResult getModeCodeList() {
        PageDataResult pageDataResult = new PageDataResult();
        int pageNum = 0;
        int pageSize = 10;
        List<ModeCodeDO> list = modeCodeMapper.selectAll();
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<ModeCodeDO> pageInfo = new PageInfo<>(list);
        pageDataResult.setTotals((int) pageInfo.getTotal());
        pageDataResult.setList(list);
        pageDataResult.setTotals(list.size());
        return pageDataResult;
    }
}