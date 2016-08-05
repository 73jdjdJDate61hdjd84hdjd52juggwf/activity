package com.jumore.b2b.activity;

import java.util.List;

/**
 * 
 * 查询 范类
 * 
 * @author rabbit create by 2016-08-05
 */
public class BaseModel<T extends IRequest, E extends IResponse> {

	/**
	 * 是否分页
	 */
	private boolean doPage = true;

	/**
	 * 当前页面
	 */
	private Integer currentPage;
	/**
	 * 总记录条数
	 */
	private Integer total;
	/**
	 * 总页数
	 */
	private Integer pages;

	/**
	 * 分页起始位置
	 */
	private Integer start;
	/**
	 * 单页显示记录数量
	 */
	private Integer limit;

	/**
	 * 排序条件（自定义，如 ： id desc）
	 */
	private String orderBy;

	/**
	 * 查询条件类
	 */
	private T model;

	/**
	 * 查询结果
	 */
	private List<E> rows;

	/**
	 * 版本号
	 */
	private String version;
	/**
	 * sessionid
	 */
	private String sid;
	/**
	 * 查询数据签名
	 */
	private String sign;

	public BaseModel(Integer start, Integer limit, T model) {
		this.start = 0;
		this.limit = limit;
		this.model = model;
	}

	/**
	 * 取消分页
	 */
	public void cancelPage() {
		this.doPage = false;
	}

	public boolean isDoPage() {
		return doPage;
	}

	public void setDoPage(boolean doPage) {
		this.doPage = doPage;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public T getModel() {
		return model;
	}

	public void setModel(T model) {
		this.model = model;
	}

	public List<E> getRows() {
		return rows;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getPages() {
		return pages;
	}

	public void setRows(List<E> rows) {
		this.rows = rows;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	
	
}
