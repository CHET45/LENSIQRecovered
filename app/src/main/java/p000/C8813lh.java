package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: lh */
/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.4")
public class C8813lh implements h07, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f57533a;

    /* JADX INFO: renamed from: b */
    public final Class f57534b;

    /* JADX INFO: renamed from: c */
    public final String f57535c;

    /* JADX INFO: renamed from: d */
    public final String f57536d;

    /* JADX INFO: renamed from: e */
    public final boolean f57537e;

    /* JADX INFO: renamed from: f */
    public final int f57538f;

    /* JADX INFO: renamed from: m */
    public final int f57539m;

    public C8813lh(int i, Class cls, String str, String str2, int i2) {
        this(i, xn1.NO_RECEIVER, cls, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8813lh)) {
            return false;
        }
        C8813lh c8813lh = (C8813lh) obj;
        return this.f57537e == c8813lh.f57537e && this.f57538f == c8813lh.f57538f && this.f57539m == c8813lh.f57539m && md8.areEqual(this.f57533a, c8813lh.f57533a) && md8.areEqual(this.f57534b, c8813lh.f57534b) && this.f57535c.equals(c8813lh.f57535c) && this.f57536d.equals(c8813lh.f57536d);
    }

    @Override // p000.h07
    public int getArity() {
        return this.f57538f;
    }

    public so8 getOwner() {
        Class cls = this.f57534b;
        if (cls == null) {
            return null;
        }
        return this.f57537e ? vvd.getOrCreateKotlinPackage(cls) : vvd.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.f57533a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f57534b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f57535c.hashCode()) * 31) + this.f57536d.hashCode()) * 31) + (this.f57537e ? 1231 : 1237)) * 31) + this.f57538f) * 31) + this.f57539m;
    }

    public String toString() {
        return vvd.renderLambdaToString(this);
    }

    public C8813lh(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f57533a = obj;
        this.f57534b = cls;
        this.f57535c = str;
        this.f57536d = str2;
        this.f57537e = (i2 & 1) == 1;
        this.f57538f = i;
        this.f57539m = i2 >> 1;
    }
}
