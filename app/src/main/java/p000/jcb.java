package p000;

import com.eyevue.common.bean.guid.NewGuidDataBean;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class jcb {
    public void getGuidList(boolean isNeedCache, boolean isSaveResultData, tg3<NewGuidDataBean> listener) {
        try {
            NewGuidDataBean newGuidDataBean = (NewGuidDataBean) rc7.fromJson(new JSONObject(c1i.getFromAssets("guid_data.json")).optJSONObject("data").toString(), NewGuidDataBean.class);
            hr0<NewGuidDataBean> hr0Var = new hr0<>();
            hr0Var.setCode(200);
            hr0Var.setMsg(FirebaseAnalytics.C3552d.f23173H);
            hr0Var.setData(newGuidDataBean);
            if (hr0Var.isSuccess()) {
                listener.onLoadSuccess(hr0Var, false);
            } else {
                listener.onLoadError(1002, hr0Var.getMsg());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
