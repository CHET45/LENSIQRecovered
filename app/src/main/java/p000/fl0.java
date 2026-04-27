package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class fl0 extends q49 {

    /* JADX INFO: renamed from: a */
    public final String f36985a;

    /* JADX INFO: renamed from: b */
    public final String f36986b;

    public fl0(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f36985a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f36986b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q49)) {
            return false;
        }
        q49 q49Var = (q49) obj;
        return this.f36985a.equals(q49Var.getLibraryName()) && this.f36986b.equals(q49Var.getVersion());
    }

    @Override // p000.q49
    @ofb
    public String getLibraryName() {
        return this.f36985a;
    }

    @Override // p000.q49
    @ofb
    public String getVersion() {
        return this.f36986b;
    }

    public int hashCode() {
        return ((this.f36985a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f36986b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f36985a + ", version=" + this.f36986b + "}";
    }
}
