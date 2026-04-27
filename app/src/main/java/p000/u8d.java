package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@j35
@p7e({p7e.EnumC10826a.f69935b})
public class u8d {

    /* JADX INFO: renamed from: a */
    @dbd
    @efb
    @ab2(name = "key")
    public String f87068a;

    /* JADX INFO: renamed from: b */
    @hib
    @ab2(name = "long_value")
    public Long f87069b;

    public u8d(@efb String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u8d)) {
            return false;
        }
        u8d u8dVar = (u8d) o;
        if (!this.f87068a.equals(u8dVar.f87068a)) {
            return false;
        }
        Long l = this.f87069b;
        Long l2 = u8dVar.f87069b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f87068a.hashCode() * 31;
        Long l = this.f87069b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public u8d(@efb String key, long value) {
        this.f87068a = key;
        this.f87069b = Long.valueOf(value);
    }
}
