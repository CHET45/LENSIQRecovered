package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.Map;
import p000.yoe;

/* JADX INFO: loaded from: classes4.dex */
public final class rl0 extends yoe {

    /* JADX INFO: renamed from: e */
    public final g52 f78599e;

    /* JADX INFO: renamed from: f */
    public final Map<acd, yoe.AbstractC15748b> f78600f;

    public rl0(g52 g52Var, Map<acd, yoe.AbstractC15748b> map) {
        if (g52Var == null) {
            throw new NullPointerException("Null clock");
        }
        this.f78599e = g52Var;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f78600f = map;
    }

    @Override // p000.yoe
    /* JADX INFO: renamed from: b */
    public g52 mo21416b() {
        return this.f78599e;
    }

    @Override // p000.yoe
    /* JADX INFO: renamed from: c */
    public Map<acd, yoe.AbstractC15748b> mo21417c() {
        return this.f78600f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yoe)) {
            return false;
        }
        yoe yoeVar = (yoe) obj;
        return this.f78599e.equals(yoeVar.mo21416b()) && this.f78600f.equals(yoeVar.mo21417c());
    }

    public int hashCode() {
        return ((this.f78599e.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f78600f.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f78599e + ", values=" + this.f78600f + "}";
    }
}
