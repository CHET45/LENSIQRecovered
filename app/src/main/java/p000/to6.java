package p000;

import android.util.Base64;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class to6 {

    /* JADX INFO: renamed from: a */
    public final String f85452a;

    /* JADX INFO: renamed from: b */
    public final String f85453b;

    /* JADX INFO: renamed from: c */
    public final String f85454c;

    /* JADX INFO: renamed from: d */
    public final List<List<byte[]>> f85455d;

    /* JADX INFO: renamed from: e */
    public final int f85456e;

    /* JADX INFO: renamed from: f */
    public final String f85457f;

    public to6(@efb String str, @efb String str2, @efb String str3, @efb List<List<byte[]>> list) {
        this.f85452a = (String) z7d.checkNotNull(str);
        this.f85453b = (String) z7d.checkNotNull(str2);
        this.f85454c = (String) z7d.checkNotNull(str3);
        this.f85455d = (List) z7d.checkNotNull(list);
        this.f85456e = 0;
        this.f85457f = createIdentifier(str, str2, str3);
    }

    private String createIdentifier(@efb String str, @efb String str2, @efb String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69934a})
    /* JADX INFO: renamed from: a */
    public String m22737a() {
        return this.f85457f;
    }

    @hib
    public List<List<byte[]>> getCertificates() {
        return this.f85455d;
    }

    @d70
    public int getCertificatesArrayResId() {
        return this.f85456e;
    }

    @Deprecated
    @p7e({p7e.EnumC10826a.f69936c})
    public String getIdentifier() {
        return this.f85457f;
    }

    @efb
    public String getProviderAuthority() {
        return this.f85452a;
    }

    @efb
    public String getProviderPackage() {
        return this.f85453b;
    }

    @efb
    public String getQuery() {
        return this.f85454c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f85452a + ", mProviderPackage: " + this.f85453b + ", mQuery: " + this.f85454c + ", mCertificates:");
        for (int i = 0; i < this.f85455d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f85455d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f85456e);
        return sb.toString();
    }

    public to6(@efb String str, @efb String str2, @efb String str3, @d70 int i) {
        this.f85452a = (String) z7d.checkNotNull(str);
        this.f85453b = (String) z7d.checkNotNull(str2);
        this.f85454c = (String) z7d.checkNotNull(str3);
        this.f85455d = null;
        z7d.checkArgument(i != 0);
        this.f85456e = i;
        this.f85457f = createIdentifier(str, str2, str3);
    }
}
