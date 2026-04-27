package p000;

import p000.nld;

/* JADX INFO: loaded from: classes5.dex */
public class th1 implements sg1 {

    /* JADX INFO: renamed from: a */
    public final kmg f84665a;

    /* JADX INFO: renamed from: b */
    public final nld.EnumC9924a f84666b;

    public th1(kmg kmgVar, nld.EnumC9924a enumC9924a) {
        this.f84665a = kmgVar;
        this.f84666b = enumC9924a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        th1 th1Var = (th1) obj;
        return this.f84665a.equals(th1Var.f84665a) && this.f84666b == th1Var.f84666b;
    }

    public nld.EnumC9924a getLimitType() {
        return this.f84666b;
    }

    public kmg getTarget() {
        return this.f84665a;
    }

    public int hashCode() {
        return (this.f84665a.hashCode() * 31) + this.f84666b.hashCode();
    }
}
