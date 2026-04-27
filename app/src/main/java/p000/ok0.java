package p000;

import android.content.Context;
import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class ok0 extends h63 {

    /* JADX INFO: renamed from: b */
    public final Context f67880b;

    /* JADX INFO: renamed from: c */
    public final g52 f67881c;

    /* JADX INFO: renamed from: d */
    public final g52 f67882d;

    /* JADX INFO: renamed from: e */
    public final String f67883e;

    public ok0(Context context, g52 g52Var, g52 g52Var2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f67880b = context;
        if (g52Var == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f67881c = g52Var;
        if (g52Var2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f67882d = g52Var2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f67883e = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return this.f67880b.equals(h63Var.getApplicationContext()) && this.f67881c.equals(h63Var.getWallClock()) && this.f67882d.equals(h63Var.getMonotonicClock()) && this.f67883e.equals(h63Var.getBackendName());
    }

    @Override // p000.h63
    public Context getApplicationContext() {
        return this.f67880b;
    }

    @Override // p000.h63
    @efb
    public String getBackendName() {
        return this.f67883e;
    }

    @Override // p000.h63
    public g52 getMonotonicClock() {
        return this.f67882d;
    }

    @Override // p000.h63
    public g52 getWallClock() {
        return this.f67881c;
    }

    public int hashCode() {
        return ((((((this.f67880b.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67881c.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67882d.hashCode()) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f67883e.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f67880b + ", wallClock=" + this.f67881c + ", monotonicClock=" + this.f67882d + ", backendName=" + this.f67883e + "}";
    }
}
