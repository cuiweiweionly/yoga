package com.yoga.user.dept.dto;

import com.yoga.user.basic.TenantDto;

import javax.validation.constraints.NotNull;

public class UpdateDeptDto extends TenantDto {

	@NotNull(message = "未指定部门ID")
	private Long id;
	private String name;
	private String remark;
	private Long[] roleIds;

	public Long[] getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(Long[] roleIds) {
		this.roleIds = roleIds;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
