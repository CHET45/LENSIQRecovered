package p000;

/* JADX INFO: loaded from: classes6.dex */
public class r94 {

    /* JADX INFO: renamed from: a */
    public int f77440a;

    /* JADX INFO: renamed from: b */
    public boolean f77441b;

    /* JADX INFO: renamed from: c */
    public boolean f77442c;

    /* JADX INFO: renamed from: d */
    public boolean f77443d;

    /* JADX INFO: renamed from: e */
    public cng f77444e;

    /* JADX INFO: renamed from: f */
    public String f77445f;

    public String getDevMD5() {
        return this.f77445f;
    }

    public int getStatus() {
        return this.f77440a;
    }

    public cng getTargetInfo() {
        return this.f77444e;
    }

    public boolean isAuthDevice() {
        return this.f77441b;
    }

    public boolean isEnterLowPowerMode() {
        return this.f77442c;
    }

    public boolean isMandatoryUpgrade() {
        return this.f77443d;
    }

    public r94 setAuthDevice(boolean z) {
        this.f77441b = z;
        return this;
    }

    public r94 setDevMD5(String str) {
        this.f77445f = str;
        return this;
    }

    public r94 setEnterLowPowerMode(boolean z) {
        this.f77442c = z;
        return this;
    }

    public r94 setMandatoryUpgrade(boolean z) {
        this.f77443d = z;
        return this;
    }

    public r94 setStatus(int i) {
        this.f77440a = i;
        return this;
    }

    public r94 setTargetInfo(cng cngVar) {
        this.f77444e = cngVar;
        return this;
    }

    public String toString() {
        return "DeviceStatus{status=" + this.f77440a + ", isAuthDevice=" + this.f77441b + ", isEnterLowPowerMode=" + this.f77442c + ", isMandatoryUpgrade=" + this.f77443d + ", mTargetInfo=" + this.f77444e + ", mDevMD5='" + this.f77445f + "'}";
    }
}
