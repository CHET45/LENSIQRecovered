package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class nk1 implements i15 {

    /* JADX INFO: renamed from: c */
    public static final String f64791c = "cct";

    /* JADX INFO: renamed from: d */
    public static final String f64792d;

    /* JADX INFO: renamed from: e */
    public static final String f64793e;

    /* JADX INFO: renamed from: f */
    public static final String f64794f;

    /* JADX INFO: renamed from: g */
    public static final String f64795g = "1$";

    /* JADX INFO: renamed from: h */
    public static final String f64796h = "\\";

    /* JADX INFO: renamed from: i */
    public static final Set<q15> f64797i;

    /* JADX INFO: renamed from: j */
    public static final nk1 f64798j;

    /* JADX INFO: renamed from: k */
    public static final nk1 f64799k;

    /* JADX INFO: renamed from: a */
    @efb
    public final String f64800a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f64801b;

    static {
        String strM8982a = d8g.m8982a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f64792d = strM8982a;
        String strM8982a2 = d8g.m8982a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f64793e = strM8982a2;
        String strM8982a3 = d8g.m8982a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f64794f = strM8982a3;
        f64797i = Collections.unmodifiableSet(new HashSet(Arrays.asList(q15.m19986of("proto"), q15.m19986of("json"))));
        f64798j = new nk1(strM8982a, null);
        f64799k = new nk1(strM8982a2, strM8982a3);
    }

    public nk1(@efb String str, @hib String str2) {
        this.f64800a = str;
        this.f64801b = str2;
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static String m17976a(@efb byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static byte[] m17977b(@efb String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @efb
    public static nk1 fromByteArray(@efb byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith(f64795g)) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote(f64796h), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new nk1(str2, str3);
    }

    @hib
    public byte[] asByteArray() {
        String str = this.f64801b;
        if (str == null && this.f64800a == null) {
            return null;
        }
        String str2 = this.f64800a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", f64795g, str2, f64796h, str).getBytes(Charset.forName("UTF-8"));
    }

    @hib
    public String getAPIKey() {
        return this.f64801b;
    }

    @efb
    public String getEndPoint() {
        return this.f64800a;
    }

    @Override // p000.w74
    @hib
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // p000.w74
    @efb
    public String getName() {
        return "cct";
    }

    @Override // p000.i15
    public Set<q15> getSupportedEncodings() {
        return f64797i;
    }
}
