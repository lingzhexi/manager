package com.haiyu.manager.pojo.dic;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 交易状态
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-08-27 16:52:23
 */
@Data
@Table(name="dic_trans_status")
public class TransStatusDO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * 子类型
	 */
	private String code;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 逻辑删除标识 0:删除 1:未删除
	 */
	private Integer logicDelete;
	/**
	 * 创建时间
	 */
	private String createTime;
    /**
     * 地标
     */
    @Column(name = "land_mark")
    private String landMark;

}
