package com.haiyu.manager.pojo.dic;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 自动检票机灯光显示代码，定义包括灯光显示的颜色、
闪动频率、次数的信息。
 * 
 * @author lzx
 * @email sunlightcs@gmail.com
 * @date 2020-09-08 15:02:08
 */
@Data
@Table(name="dic_concessional_lamp")
public class ConcessionalLampDO implements Serializable {
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
	 * 定义描述
	 */
	private String description;
	/**
	 * 逻辑删除
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
