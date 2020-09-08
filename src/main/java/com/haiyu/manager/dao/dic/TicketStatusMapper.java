package com.haiyu.manager.dao.dic;

import com.haiyu.manager.pojo.dic.TicketStatusDO;
import org.apache.ibatis.annotations.Mapper;
import tk.mapper.MyMapper;

/**
 * 票卡状态，十六进制表示
 * 
 * @author lzx
 * @date 2020-09-08 15:02:08
 */
@Mapper
public interface TicketStatusMapper extends MyMapper<TicketStatusDO> {
	
}
