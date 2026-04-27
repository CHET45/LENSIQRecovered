package p000;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class mhc {

    /* JADX INFO: renamed from: a */
    public Object f61020a;

    /* JADX INFO: renamed from: b */
    public final mhc f61021b;

    /* JADX INFO: renamed from: c */
    public final Object f61022c;

    /* JADX INFO: renamed from: d */
    public Type f61023d;

    /* JADX INFO: renamed from: e */
    public transient String f61024e;

    public mhc(mhc mhcVar, Object obj, Object obj2) {
        this.f61021b = mhcVar;
        this.f61020a = obj;
        this.f61022c = obj2;
    }

    public String toString() {
        if (this.f61024e == null) {
            if (this.f61021b == null) {
                this.f61024e = "$";
            } else if (this.f61022c instanceof Integer) {
                this.f61024e = this.f61021b.toString() + "[" + this.f61022c + "]";
            } else {
                this.f61024e = this.f61021b.toString() + "." + this.f61022c;
            }
        }
        return this.f61024e;
    }
}
