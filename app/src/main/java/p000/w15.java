package p000;

import java.util.Arrays;
import java.util.Objects;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15649b
public final class w15 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final byte[] f93057a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f93058b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final byte[] f93059c;

    public w15(@yfb byte[] bArr, @yfb String str, @yfb byte[] bArr2) {
        md8.checkNotNullParameter(bArr, "encryptedTopic");
        md8.checkNotNullParameter(str, "keyIdentifier");
        md8.checkNotNullParameter(bArr2, "encapsulatedKey");
        this.f93057a = bArr;
        this.f93058b = str;
        this.f93059c = bArr2;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w15)) {
            return false;
        }
        w15 w15Var = (w15) obj;
        return Arrays.equals(this.f93057a, w15Var.f93057a) && this.f93058b.contentEquals(w15Var.f93058b) && Arrays.equals(this.f93059c, w15Var.f93059c);
    }

    @yfb
    public final byte[] getEncapsulatedKey() {
        return this.f93059c;
    }

    @yfb
    public final byte[] getEncryptedTopic() {
        return this.f93057a;
    }

    @yfb
    public final String getKeyIdentifier() {
        return this.f93058b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f93057a)), this.f93058b, Integer.valueOf(Arrays.hashCode(this.f93059c)));
    }

    @yfb
    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + h9g.decodeToString(this.f93057a) + ", KeyIdentifier=" + this.f93058b + ", EncapsulatedKey=" + h9g.decodeToString(this.f93059c) + " }");
    }
}
