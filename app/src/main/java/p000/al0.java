package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class al0 extends ej7 {

    /* JADX INFO: renamed from: a */
    public final String f1942a;

    /* JADX INFO: renamed from: b */
    public final List<String> f1943b;

    public al0(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f1942a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f1943b = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ej7)) {
            return false;
        }
        ej7 ej7Var = (ej7) obj;
        return this.f1942a.equals(ej7Var.getUserAgent()) && this.f1943b.equals(ej7Var.getUsedDates());
    }

    @Override // p000.ej7
    public List<String> getUsedDates() {
        return this.f1943b;
    }

    @Override // p000.ej7
    public String getUserAgent() {
        return this.f1942a;
    }

    public int hashCode() {
        return ((this.f1942a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f1943b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f1942a + ", usedDates=" + this.f1943b + "}";
    }
}
