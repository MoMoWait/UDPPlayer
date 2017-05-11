/**
 * 
 */
package com.rockchips.udpplayer;
import org.xutils.x;
import momo.cn.edu.fjnu.androidutils.base.BaseDialog;
import momo.cn.edu.fjnu.androidutils.utils.DeviceInfoUtils;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author GaoFei
 * App�����Ի���
 */
public abstract class AppBaseDialog extends BaseDialog {
	/**
	 * �Ի�������ͼ
	 */
	private View mView;
	private Context mContext;
	private boolean isCreated = false;
	public AppBaseDialog(Context context) {
		super(context);
		mContext = context;
	}

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT);
		isCreated = true;
	}
	
	
	@Override
	public void initView() {
		LayoutInflater inflater = LayoutInflater.from(mContext);
		mView = inflater.inflate(getLayoutRes(), null);
		setContentView(mView, new LinearLayout.LayoutParams(DeviceInfoUtils.getDeviceInfo(mContext).getScreenWidth() / 2, LinearLayout.LayoutParams.WRAP_CONTENT));
		x.view().inject(this, mView);
	}
	
	
	/**
	 * ������ԴID
	 * @return
	 */
	public abstract int getLayoutRes();
	
	
	/**
	 * ��ȡ�Ի��������ͼ
	 * @return
	 */
	public View getMainView(){
		return mView;
	}
	
	
	/**
	 * �ж϶Ի����Ƿ��Ѿ�����
	 * @return
	 */
	public boolean isCreated(){
		return isCreated;
	}
	

}
