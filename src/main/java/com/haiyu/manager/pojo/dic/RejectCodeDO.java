package com.haiyu.manager.pojo.dic;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 拒绝码字典表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-08-27 16:52:23
 */
@Data
@Table(name="DIC_REJECT_CODE")
public class RejectCodeDO implements Serializable {
	private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 取值
     */
	private String code;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 是否删除
	 */
	private Integer logicDelete;
	/**
	 * 创建时间
	 */
	private String createTime;

}
