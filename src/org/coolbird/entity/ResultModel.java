package org.coolbird.entity;

import java.util.List;

public class ResultModel {

	// ��Ʒ�б�
	private List<ProductModel> productList;
	// ��Ʒ����
	private Long recordCount;
	// ��ҳ��
	private Long pageCount;
	// ��ǰҳ
	private Long curPage;
	
	
	public List<ProductModel> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductModel> productList) {
		this.productList = productList;
	}
	public Long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(Long recordCount) {
		this.recordCount = recordCount;
	}
	public Long getPageCount() {
		return pageCount;
	}
	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}
	public Long getCurPage() {
		return curPage;
	}
	public void setCurPage(Long curPage) {
		this.curPage = curPage;
	}
	
	

	
	
}
