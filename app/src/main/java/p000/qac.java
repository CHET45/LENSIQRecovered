package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.1")
public final class qac implements u02 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Class<?> f73751a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f73752b;

    public qac(@yfb Class<?> cls, @yfb String str) {
        md8.checkNotNullParameter(cls, "jClass");
        md8.checkNotNullParameter(str, "moduleName");
        this.f73751a = cls;
        this.f73752b = str;
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof qac) && md8.areEqual(getJClass(), ((qac) obj).getJClass());
    }

    @Override // p000.u02
    @yfb
    public Class<?> getJClass() {
        return this.f73751a;
    }

    @Override // p000.so8
    @yfb
    public Collection<no8<?>> getMembers() {
        throw new xs8();
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    @yfb
    public String toString() {
        return getJClass() + vvd.f92391b;
    }
}
