package ecommerce.models;

import java.util.List;

public class BookPagedResponseDTO {
	private List<BookResponseDTO> plist;
	private int current;
	private long total;
	private int pagesize;

	public List<BookResponseDTO> getPlist() {
		return plist;
	}

	public void setPlist(List<BookResponseDTO> plist) {
		this.plist = plist;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	@Override
	public String toString() {
		return "BookPagedResponseDTO [plist=" + plist + ", current=" + current + ", total=" + total + ", pagesize="
				+ pagesize + "]";
	}

}
