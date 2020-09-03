package com.haiyu.manager.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiyu.manager.dao.dic.WorkOrderTypeMapper;
import com.haiyu.manager.pojo.dic.WorkorderTypeDO;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.WorkOrderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkOrderTypeServiceImpl implements WorkOrderTypeService {

    @Autowired
    private WorkOrderTypeMapper workOrderTypeMapper;

    @Override
    public PageDataResult getWorkOrderTypeList() {
        PageDataResult pageDataResult = new PageDataResult();
        int pageNum = 0;
        int pageSize = 10;
        List<WorkorderTypeDO> list = workOrderTypeMapper.selectAll();
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<WorkorderTypeDO> pageInfo = new PageInfo<>(list);
        pageDataResult.setTotals((int) pageInfo.getTotal());
        pageDataResult.setList(list);
        pageDataResult.setTotals(list.size());
        return pageDataResult;
    }
}