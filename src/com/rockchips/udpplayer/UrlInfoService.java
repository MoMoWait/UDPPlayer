/**
 * 
 */
package com.rockchips.udpplayer;

import java.util.List;

import org.xutils.ex.DbException;

/**
 * @author GaoFei
 *
 */
public class UrlInfoService extends AppBeanService<UrlInfo>{

	@Override
	public boolean isExist(UrlInfo object) {
		return false;
	}

	public List<UrlInfo> getAll(){
		return getAll(UrlInfo.class);
	}
	
	public void deleteAll(){
		try {
			UdpPlayerApplication.mDBManager.delete(UrlInfo.class);
		} catch (DbException e) {
			e.printStackTrace();
		}
	}
}
