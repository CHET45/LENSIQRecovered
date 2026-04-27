package p000;

import android.content.Context;
import android.text.TextUtils;
import com.eyevue.glassapp.BuildConfig;
import java.util.Locale;
import p000.vfe;

/* JADX INFO: loaded from: classes4.dex */
public class g30 extends pv3 {
    public g30(Context context) {
        super(context);
    }

    @Override // p000.pv3, p000.yp7
    public String getAppType() {
        return t77.f83943v;
    }

    @Override // p000.pv3, p000.yp7
    public String getAppVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // p000.pv3, p000.yp7
    public String getCustomerId() {
        return t77.f83942u;
    }

    @Override // p000.pv3, p000.yp7
    public String getDeviceName() {
        return t77.f83922a;
    }

    @Override // p000.pv3, p000.yp7
    public String getIsInChina() {
        return a43.f347l;
    }

    @Override // p000.pv3, p000.yp7
    public String getLanguage() {
        String string = vfe.getInstance().getString(vfe.C14037b.f90986p);
        return (TextUtils.isEmpty(string) || vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", true)) ? Locale.getDefault().toString() : string;
    }

    @Override // p000.pv3, p000.yp7
    public String getLatitude() {
        return vfe.getInstance().getString("SP_KEY_LOCATION_LATITUDE");
    }

    @Override // p000.pv3, p000.yp7
    public String getLongitude() {
        return vfe.getInstance().getString("SP_KEY_LOCATION_LONGITUDE");
    }

    @Override // p000.pv3, p000.yp7
    public String getMacAddress() {
        return t77.f83923b;
    }

    @Override // p000.pv3, p000.yp7
    public String getProject() {
        return "";
    }

    @Override // p000.pv3, p000.yp7
    public String getToken() {
        return vfe.getInstance().getString("KEY_TOKEN");
    }

    @Override // p000.pv3, p000.yp7
    public String getUid() {
        return vfe.getInstance().getString("KEY_UID");
    }

    @Override // p000.pv3, p000.yp7
    public String getUserId() {
        return vfe.getInstance().getString("SP_USER_ID");
    }
}
