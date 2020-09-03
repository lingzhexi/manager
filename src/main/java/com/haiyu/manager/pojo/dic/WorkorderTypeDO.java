package com.haiyu.manager.pojo.dic;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 工单类型字典表。有故障申报工单，采购工单，设备更换工单，设备维修工单，设备维修工单，报废工单，返厂工单等
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-08-27 16:52:22
 */
@Data
@Table(name="DIC_WORKORDER_TYPE")
public class WorkorderTypeDO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 工单类型编码
	 */
	private String code;
	/**
	 */
	private String name;
	/**
	 * 类型状态.默认0不可用，1可用
	 */
	private Integer status;
	/**
	 * 附加说明
	 */
	private String remark;

}
