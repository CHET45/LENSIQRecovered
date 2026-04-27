package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import p000.z3g;

/* JADX INFO: loaded from: classes5.dex */
public final class xl0 extends z3g.AbstractC15979a {

    /* JADX INFO: renamed from: a */
    public final String f98337a;

    /* JADX INFO: renamed from: b */
    public final String f98338b;

    /* JADX INFO: renamed from: c */
    public final String f98339c;

    /* JADX INFO: renamed from: d */
    public final String f98340d;

    /* JADX INFO: renamed from: e */
    public final int f98341e;

    /* JADX INFO: renamed from: f */
    public final b84 f98342f;

    public xl0(String str, String str2, String str3, String str4, int i, b84 b84Var) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f98337a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f98338b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f98339c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f98340d = str4;
        this.f98341e = i;
        if (b84Var == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f98342f = b84Var;
    }

    @Override // p000.z3g.AbstractC15979a
    public String appIdentifier() {
        return this.f98337a;
    }

    @Override // p000.z3g.AbstractC15979a
    public int deliveryMechanism() {
        return this.f98341e;
    }

    @Override // p000.z3g.AbstractC15979a
    public b84 developmentPlatformProvider() {
        return this.f98342f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z3g.AbstractC15979a)) {
            return false;
        }
        z3g.AbstractC15979a abstractC15979a = (z3g.AbstractC15979a) obj;
        return this.f98337a.equals(abstractC15979a.appIdentifier()) && this.f98338b.equals(abstractC15979a.versionCode()) && this.f98339c.equals(abstractC15979a.versionName()) && this.f98340d.equals(abstractC15979a.installUuid()) && this.f98341e == abstractC15979a.deliveryMechanism() && this.f98342f.equals(abstractC15979a.developmentPlatformProvider());
    }

    public int hashCode() {
        return ((((((((((this.f98337a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98338b.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98339c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98340d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98341e) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f98342f.hashCode();
    }

    @Override // p000.z3g.AbstractC15979a
    public String installUuid() {
        return this.f98340d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f98337a + ", versionCode=" + this.f98338b + ", versionName=" + this.f98339c + ", installUuid=" + this.f98340d + ", deliveryMechanism=" + this.f98341e + ", developmentPlatformProvider=" + this.f98342f + "}";
    }

    @Override // p000.z3g.AbstractC15979a
    public String versionCode() {
        return this.f98338b;
    }

    @Override // p000.z3g.AbstractC15979a
    public String versionName() {
        return this.f98339c;
    }
}
