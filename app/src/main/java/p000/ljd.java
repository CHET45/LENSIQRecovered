package p000;

import java.util.Arrays;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class ljd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f57742a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final byte[] f57743b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<String> f57744c;

    public ljd(@yfb String str, @yfb byte[] bArr, @yfb List<String> list) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bArr, "id");
        md8.checkNotNullParameter(list, "transports");
        this.f57742a = str;
        this.f57743b = bArr;
        this.f57744c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ljd copy$default(ljd ljdVar, String str, byte[] bArr, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ljdVar.f57742a;
        }
        if ((i & 2) != 0) {
            bArr = ljdVar.f57743b;
        }
        if ((i & 4) != 0) {
            list = ljdVar.f57744c;
        }
        return ljdVar.copy(str, bArr, list);
    }

    @yfb
    public final String component1() {
        return this.f57742a;
    }

    @yfb
    public final byte[] component2() {
        return this.f57743b;
    }

    @yfb
    public final List<String> component3() {
        return this.f57744c;
    }

    @yfb
    public final ljd copy(@yfb String str, @yfb byte[] bArr, @yfb List<String> list) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bArr, "id");
        md8.checkNotNullParameter(list, "transports");
        return new ljd(str, bArr, list);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljd)) {
            return false;
        }
        ljd ljdVar = (ljd) obj;
        return md8.areEqual(this.f57742a, ljdVar.f57742a) && md8.areEqual(this.f57743b, ljdVar.f57743b) && md8.areEqual(this.f57744c, ljdVar.f57744c);
    }

    @yfb
    public final byte[] getId() {
        return this.f57743b;
    }

    @yfb
    public final List<String> getTransports() {
        return this.f57744c;
    }

    @yfb
    public final String getType() {
        return this.f57742a;
    }

    public int hashCode() {
        return (((this.f57742a.hashCode() * 31) + Arrays.hashCode(this.f57743b)) * 31) + this.f57744c.hashCode();
    }

    @yfb
    public String toString() {
        return "PublicKeyCredentialDescriptor(type=" + this.f57742a + ", id=" + Arrays.toString(this.f57743b) + ", transports=" + this.f57744c + ')';
    }
}
