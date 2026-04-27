package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public enum ts5 {
    JSON(".json"),
    ZIP(zyb.f106510h);


    /* JADX INFO: renamed from: a */
    public final String f85705a;

    ts5(String str) {
        this.f85705a = str;
    }

    public String tempExtension() {
        return ".temp" + this.f85705a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f85705a;
    }
}
