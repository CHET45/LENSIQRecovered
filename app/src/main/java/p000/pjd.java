package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class pjd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f71111a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f71112b;

    public pjd(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(str2, "id");
        this.f71111a = str;
        this.f71112b = str2;
    }

    public static /* synthetic */ pjd copy$default(pjd pjdVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pjdVar.f71111a;
        }
        if ((i & 2) != 0) {
            str2 = pjdVar.f71112b;
        }
        return pjdVar.copy(str, str2);
    }

    @yfb
    public final String component1() {
        return this.f71111a;
    }

    @yfb
    public final String component2() {
        return this.f71112b;
    }

    @yfb
    public final pjd copy(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(str2, "id");
        return new pjd(str, str2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjd)) {
            return false;
        }
        pjd pjdVar = (pjd) obj;
        return md8.areEqual(this.f71111a, pjdVar.f71111a) && md8.areEqual(this.f71112b, pjdVar.f71112b);
    }

    @yfb
    public final String getId() {
        return this.f71112b;
    }

    @yfb
    public final String getName() {
        return this.f71111a;
    }

    public int hashCode() {
        return (this.f71111a.hashCode() * 31) + this.f71112b.hashCode();
    }

    @yfb
    public String toString() {
        return "PublicKeyCredentialRpEntity(name=" + this.f71111a + ", id=" + this.f71112b + ')';
    }
}
