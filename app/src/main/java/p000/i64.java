package p000;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import im.zego.zegoexpress.ZegoExpressErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public final class i64 {

    /* JADX INFO: renamed from: a */
    public final pkd<?> f45822a;

    /* JADX INFO: renamed from: b */
    public final int f45823b;

    /* JADX INFO: renamed from: c */
    public final int f45824c;

    private i64(Class<?> cls, int i, int i2) {
        this((pkd<?>) pkd.unqualified(cls), i, i2);
    }

    public static i64 deferred(Class<?> cls) {
        return new i64(cls, 0, 2);
    }

    private static String describeInjection(int i) {
        if (i == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    public static i64 optional(Class<?> cls) {
        return new i64(cls, 0, 0);
    }

    public static i64 optionalProvider(Class<?> cls) {
        return new i64(cls, 0, 1);
    }

    public static i64 required(Class<?> cls) {
        return new i64(cls, 1, 0);
    }

    public static i64 requiredProvider(Class<?> cls) {
        return new i64(cls, 1, 1);
    }

    public static i64 setOf(Class<?> cls) {
        return new i64(cls, 2, 0);
    }

    public static i64 setOfProvider(Class<?> cls) {
        return new i64(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i64)) {
            return false;
        }
        i64 i64Var = (i64) obj;
        return this.f45822a.equals(i64Var.f45822a) && this.f45823b == i64Var.f45823b && this.f45824c == i64Var.f45824c;
    }

    public pkd<?> getInterface() {
        return this.f45822a;
    }

    public int hashCode() {
        return ((((this.f45822a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f45823b) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ this.f45824c;
    }

    public boolean isDeferred() {
        return this.f45824c == 2;
    }

    public boolean isDirectInjection() {
        return this.f45824c == 0;
    }

    public boolean isRequired() {
        return this.f45823b == 1;
    }

    public boolean isSet() {
        return this.f45823b == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f45822a);
        sb.append(", type=");
        int i = this.f45823b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(describeInjection(this.f45824c));
        sb.append("}");
        return sb.toString();
    }

    private i64(pkd<?> pkdVar, int i, int i2) {
        this.f45822a = (pkd) w7d.checkNotNull(pkdVar, "Null dependency anInterface.");
        this.f45823b = i;
        this.f45824c = i2;
    }

    public static i64 deferred(pkd<?> pkdVar) {
        return new i64(pkdVar, 0, 2);
    }

    public static i64 optionalProvider(pkd<?> pkdVar) {
        return new i64(pkdVar, 0, 1);
    }

    public static i64 required(pkd<?> pkdVar) {
        return new i64(pkdVar, 1, 0);
    }

    public static i64 requiredProvider(pkd<?> pkdVar) {
        return new i64(pkdVar, 1, 1);
    }

    public static i64 setOf(pkd<?> pkdVar) {
        return new i64(pkdVar, 2, 0);
    }

    public static i64 setOfProvider(pkd<?> pkdVar) {
        return new i64(pkdVar, 2, 1);
    }
}
