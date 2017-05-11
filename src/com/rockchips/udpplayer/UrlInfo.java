/**
 * 
 */
package com.rockchips.udpplayer;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * @author GaoFei
 * Url��Ϣ
 */
@Table(name="UrlInfo")
public class UrlInfo {
	@Column(name="id", isId=true, autoGen=true)
	private int id;
	@Column(name="url", property="UNIQUE")
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return url;
	}
	
}
