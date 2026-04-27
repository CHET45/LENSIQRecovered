package p000;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public class pv3 implements yp7 {
    private final Context context;

    public pv3(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // p000.yp7
    public String getAppType() {
        throw new UnsupportedOperationException("必须实现 getAppType()");
    }

    @Override // p000.yp7
    public String getAppVersion() {
        throw new UnsupportedOperationException("必须实现 getAppVersion()");
    }

    @Override // p000.yp7
    public String getCustomerId() {
        throw new UnsupportedOperationException("必须实现 getCustomerId()");
    }

    @Override // p000.yp7
    public String getDeviceName() {
        throw new UnsupportedOperationException("必须实现 getDeviceName()");
    }

    @Override // p000.yp7
    public String getIsInChina() {
        throw new UnsupportedOperationException("必须实现 getIsInChina()");
    }

    @Override // p000.yp7
    public String getLanguage() {
        throw new UnsupportedOperationException("必须实现 getLanguage()");
    }

    @Override // p000.yp7
    public String getLatitude() {
        throw new UnsupportedOperationException("必须实现 getLatitude()");
    }

    @Override // p000.yp7
    public String getLongitude() {
        throw new UnsupportedOperationException("必须实现 getLongitude()");
    }

    @Override // p000.yp7
    public String getMacAddress() {
        throw new UnsupportedOperationException("必须实现 getMacAddress()");
    }

    @Override // p000.yp7
    public String getOsType() {
        return "android";
    }

    @Override // p000.yp7
    public String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    @Override // p000.yp7
    public String getPhoneBrand() {
        return Build.BRAND;
    }

    @Override // p000.yp7
    public String getPhoneModel() {
        return Build.MODEL;
    }

    @Override // p000.yp7
    public String getProject() {
        throw new UnsupportedOperationException("必须实现 getProject()");
    }

    @Override // p000.yp7
    public String getToken() {
        throw new UnsupportedOperationException("必须实现 getToken()");
    }

    @Override // p000.yp7
    public String getUid() {
        throw new UnsupportedOperationException("必须实现 getUid()");
    }

    @Override // p000.yp7
    public String getUserId() {
        throw new UnsupportedOperationException("必须实现 getUserId()");
    }
}
