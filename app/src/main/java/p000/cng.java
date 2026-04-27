package p000;

/* JADX INFO: loaded from: classes6.dex */
public class cng extends jc2 {

    /* JADX INFO: renamed from: A */
    public boolean f17093A;

    /* JADX INFO: renamed from: B */
    public int f17094B;

    /* JADX INFO: renamed from: C */
    public int f17095C;

    /* JADX INFO: renamed from: D */
    public int f17096D;

    /* JADX INFO: renamed from: E */
    public String f17097E;

    /* JADX INFO: renamed from: F */
    public String f17098F;

    /* JADX INFO: renamed from: G */
    public String f17099G;

    /* JADX INFO: renamed from: H */
    public boolean f17100H;

    /* JADX INFO: renamed from: I */
    public boolean f17101I;

    /* JADX INFO: renamed from: J */
    public int f17102J;

    /* JADX INFO: renamed from: K */
    public int f17103K;

    /* JADX INFO: renamed from: c */
    public String f17104c;

    /* JADX INFO: renamed from: d */
    public int f17105d;

    /* JADX INFO: renamed from: e */
    public String f17106e;

    /* JADX INFO: renamed from: f */
    public String f17107f;

    /* JADX INFO: renamed from: i */
    public String f17110i;

    /* JADX INFO: renamed from: j */
    public boolean f17111j;

    /* JADX INFO: renamed from: k */
    public int f17112k;

    /* JADX INFO: renamed from: l */
    public int f17113l;

    /* JADX INFO: renamed from: m */
    public int f17114m;

    /* JADX INFO: renamed from: o */
    public int f17116o;

    /* JADX INFO: renamed from: p */
    public byte f17117p;

    /* JADX INFO: renamed from: q */
    public int f17118q;

    /* JADX INFO: renamed from: r */
    public String f17119r;

    /* JADX INFO: renamed from: s */
    public int f17120s;

    /* JADX INFO: renamed from: t */
    public int f17121t;

    /* JADX INFO: renamed from: u */
    public int f17122u;

    /* JADX INFO: renamed from: v */
    public int f17123v;

    /* JADX INFO: renamed from: w */
    public int f17124w;

    /* JADX INFO: renamed from: x */
    public int f17125x;

    /* JADX INFO: renamed from: y */
    public String f17126y;

    /* JADX INFO: renamed from: z */
    public boolean f17127z;

    /* JADX INFO: renamed from: g */
    public int f17108g = 0;

    /* JADX INFO: renamed from: h */
    public int f17109h = 0;

    /* JADX INFO: renamed from: n */
    public int f17115n = 30;

    public int getAllowConnectFlag() {
        return this.f17096D;
    }

    public String getAuthKey() {
        return this.f17097E;
    }

    public String getBleAddr() {
        return this.f17110i;
    }

    public int getCommunicationMtu() {
        return this.f17102J;
    }

    public byte getCurFunction() {
        return this.f17117p;
    }

    public String getCustomVersionMsg() {
        return this.f17099G;
    }

    public String getEdrAddr() {
        return this.f17107f;
    }

    public int getEdrProfile() {
        return this.f17109h;
    }

    public int getEdrStatus() {
        return this.f17108g;
    }

    public int getExpandMode() {
        return this.f17095C;
    }

    public int getFunctionMask() {
        return this.f17116o;
    }

    public int getLowPowerLimit() {
        return this.f17115n;
    }

    public int getMandatoryUpgradeFlag() {
        return this.f17123v;
    }

    public int getMaxVol() {
        return this.f17113l;
    }

    public String getName() {
        return this.f17119r;
    }

    public int getPid() {
        return this.f17120s;
    }

    public String getProjectCode() {
        return this.f17098F;
    }

    public String getProtocolVersion() {
        return this.f17106e;
    }

    public int getQuantity() {
        return this.f17114m;
    }

    public int getReceiveMtu() {
        return this.f17103K;
    }

    public int getRequestOtaFlag() {
        return this.f17124w;
    }

    public int getSdkType() {
        return this.f17118q;
    }

    public int getSingleBackupOtaWay() {
        return this.f17094B;
    }

    public int getUbootVersionCode() {
        return this.f17125x;
    }

    public String getUbootVersionName() {
        return this.f17126y;
    }

    public int getUid() {
        return this.f17122u;
    }

    public int getVersionCode() {
        return this.f17105d;
    }

    public String getVersionName() {
        return this.f17104c;
    }

    public int getVid() {
        return this.f17121t;
    }

    public int getVolume() {
        return this.f17112k;
    }

    public boolean isBleOnly() {
        return this.f17111j;
    }

    public boolean isGameMode() {
        return this.f17101I;
    }

    public boolean isMandatoryUpgrade() {
        return getMandatoryUpgradeFlag() == 1;
    }

    public boolean isNeedBootLoader() {
        return this.f17093A;
    }

    public boolean isSupportDoubleBackup() {
        return this.f17127z;
    }

    public boolean isSupportMD5() {
        return this.f17100H;
    }

    public cng setAllowConnectFlag(int i) {
        this.f17096D = i;
        return this;
    }

    public cng setAuthKey(String str) {
        this.f17097E = str;
        return this;
    }

    public cng setBleAddr(String str) {
        this.f17110i = str;
        return this;
    }

    public cng setBleOnly(boolean z) {
        this.f17111j = z;
        return this;
    }

    public cng setCommunicationMtu(int i) {
        this.f17102J = i;
        return this;
    }

    public cng setCurFunction(byte b) {
        this.f17117p = b;
        return this;
    }

    public cng setCustomVersionMsg(String str) {
        this.f17099G = str;
        return this;
    }

    public cng setEdrAddr(String str) {
        this.f17107f = str;
        return this;
    }

    public cng setEdrProfile(int i) {
        this.f17109h = i;
        return this;
    }

    public cng setEdrStatus(int i) {
        this.f17108g = i;
        return this;
    }

    public cng setExpandMode(int i) {
        this.f17095C = i;
        return this;
    }

    public cng setFunctionMask(int i) {
        this.f17116o = i;
        return this;
    }

    public cng setGameMode(boolean z) {
        this.f17101I = z;
        return this;
    }

    public cng setLowPowerLimit(int i) {
        this.f17115n = i;
        return this;
    }

    public cng setMandatoryUpgradeFlag(int i) {
        this.f17123v = i;
        return this;
    }

    public cng setMaxVol(int i) {
        this.f17113l = i;
        return this;
    }

    public cng setName(String str) {
        this.f17119r = str;
        return this;
    }

    public cng setNeedBootLoader(boolean z) {
        this.f17093A = z;
        return this;
    }

    public cng setPid(int i) {
        this.f17120s = i;
        return this;
    }

    public cng setProjectCode(String str) {
        this.f17098F = str;
        return this;
    }

    public cng setProtocolVersion(String str) {
        this.f17106e = str;
        return this;
    }

    public cng setQuantity(int i) {
        this.f17114m = i;
        return this;
    }

    public cng setReceiveMtu(int i) {
        this.f17103K = i;
        return this;
    }

    public void setRequestOtaFlag(int i) {
        this.f17124w = i;
    }

    public cng setSdkType(int i) {
        this.f17118q = i;
        return this;
    }

    public cng setSingleBackupOtaWay(int i) {
        this.f17094B = i;
        return this;
    }

    public cng setSupportDoubleBackup(boolean z) {
        this.f17127z = z;
        return this;
    }

    public cng setSupportMD5(boolean z) {
        this.f17100H = z;
        return this;
    }

    public cng setUbootVersionCode(int i) {
        this.f17125x = i;
        return this;
    }

    public cng setUbootVersionName(String str) {
        this.f17126y = str;
        return this;
    }

    public cng setUid(int i) {
        this.f17122u = i;
        return this;
    }

    public cng setVersionCode(int i) {
        this.f17105d = i;
        return this;
    }

    public cng setVersionName(String str) {
        this.f17104c = str;
        return this;
    }

    public cng setVid(int i) {
        this.f17121t = i;
        return this;
    }

    public cng setVolume(int i) {
        this.f17112k = i;
        return this;
    }

    @Override // p000.jc2
    @efb
    public String toString() {
        return "TargetInfoResponse{versionName='" + this.f17104c + "', versionCode=" + this.f17105d + ", protocolVersion='" + this.f17106e + "', edrAddr='" + this.f17107f + "', edrStatus=" + this.f17108g + ", edrProfile=" + this.f17109h + ", bleAddr='" + this.f17110i + "', volume=" + this.f17112k + ", maxVol=" + this.f17113l + ", quantity=" + this.f17114m + ", lowPowerLimit=" + this.f17115n + ", functionMask=" + this.f17116o + ", curFunction=" + ((int) this.f17117p) + ", sdkType=" + this.f17118q + ", name='" + this.f17119r + "', pid=" + this.f17120s + ", vid=" + this.f17121t + ", uid=" + this.f17122u + ", mandatoryUpgradeFlag=" + this.f17123v + ", requestOtaFlag=" + this.f17124w + ", ubootVersionCode=" + this.f17125x + ", ubootVersionName='" + this.f17126y + "', isSupportDoubleBackup=" + this.f17127z + ", isNeedBootLoader=" + this.f17093A + ", singleBackupOtaWay=" + this.f17094B + ", allowConnectFlag=" + this.f17096D + ", authKey='" + this.f17097E + "', projectCode='" + this.f17098F + "', customVersionMsg='" + this.f17099G + "', bleOnly=" + this.f17111j + ", isSupportMD5=" + this.f17100H + ", isGameMode=" + this.f17101I + ", expandMode=" + this.f17095C + ", communicationMtu=" + this.f17102J + ", receiveMtu=" + this.f17103K + "} ";
    }
}
