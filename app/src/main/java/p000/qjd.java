package p000;

import androidx.core.content.FileProvider;
import java.util.Arrays;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class qjd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f74686a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final byte[] f74687b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f74688c;

    public qjd(@yfb String str, @yfb byte[] bArr, @yfb String str2) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(bArr, "id");
        md8.checkNotNullParameter(str2, FileProvider.f7405Y);
        this.f74686a = str;
        this.f74687b = bArr;
        this.f74688c = str2;
    }

    public static /* synthetic */ qjd copy$default(qjd qjdVar, String str, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qjdVar.f74686a;
        }
        if ((i & 2) != 0) {
            bArr = qjdVar.f74687b;
        }
        if ((i & 4) != 0) {
            str2 = qjdVar.f74688c;
        }
        return qjdVar.copy(str, bArr, str2);
    }

    @yfb
    public final String component1() {
        return this.f74686a;
    }

    @yfb
    public final byte[] component2() {
        return this.f74687b;
    }

    @yfb
    public final String component3() {
        return this.f74688c;
    }

    @yfb
    public final qjd copy(@yfb String str, @yfb byte[] bArr, @yfb String str2) {
        md8.checkNotNullParameter(str, "name");
        md8.checkNotNullParameter(bArr, "id");
        md8.checkNotNullParameter(str2, FileProvider.f7405Y);
        return new qjd(str, bArr, str2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjd)) {
            return false;
        }
        qjd qjdVar = (qjd) obj;
        return md8.areEqual(this.f74686a, qjdVar.f74686a) && md8.areEqual(this.f74687b, qjdVar.f74687b) && md8.areEqual(this.f74688c, qjdVar.f74688c);
    }

    @yfb
    public final String getDisplayName() {
        return this.f74688c;
    }

    @yfb
    public final byte[] getId() {
        return this.f74687b;
    }

    @yfb
    public final String getName() {
        return this.f74686a;
    }

    public int hashCode() {
        return (((this.f74686a.hashCode() * 31) + Arrays.hashCode(this.f74687b)) * 31) + this.f74688c.hashCode();
    }

    @yfb
    public String toString() {
        return "PublicKeyCredentialUserEntity(name=" + this.f74686a + ", id=" + Arrays.toString(this.f74687b) + ", displayName=" + this.f74688c + ')';
    }
}
