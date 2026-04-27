package p000;

import java.nio.charset.Charset;
import okhttp3.internal.http2.Header;
import p000.AbstractC9063m0;
import p000.fb8;
import p000.fta;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vm7 extends AbstractC9063m0.c {

    /* JADX INFO: renamed from: x */
    public static final fb8.InterfaceC5712a<Integer> f91729x;

    /* JADX INFO: renamed from: y */
    public static final fta.AbstractC5971i<Integer> f91730y;

    /* JADX INFO: renamed from: t */
    public n4g f91731t;

    /* JADX INFO: renamed from: u */
    public fta f91732u;

    /* JADX INFO: renamed from: v */
    public Charset f91733v;

    /* JADX INFO: renamed from: w */
    public boolean f91734w;

    /* JADX INFO: renamed from: vm7$a */
    public class C14167a implements fb8.InterfaceC5712a<Integer> {
        @Override // p000.fta.InterfaceC5975m
        public Integer parseAsciiString(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, fb8.f36008a));
        }

        @Override // p000.fta.InterfaceC5975m
        public byte[] toAsciiString(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C14167a c14167a = new C14167a();
        f91729x = c14167a;
        f91730y = fb8.keyOf(Header.RESPONSE_STATUS_UTF8, c14167a);
    }

    public vm7(int i, k4g k4gVar, rhh rhhVar) {
        super(i, k4gVar, rhhVar);
        this.f91733v = yw1.f103176c;
    }

    private static Charset extractCharset(fta ftaVar) {
        String str = (String) ftaVar.get(oc7.f67141j);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return yw1.f103176c;
    }

    private n4g statusFromTrailers(fta ftaVar) {
        n4g n4gVar = (n4g) ftaVar.get(tb8.f84152b);
        if (n4gVar != null) {
            return n4gVar.withDescription((String) ftaVar.get(tb8.f84151a));
        }
        if (this.f91734w) {
            return n4g.f63260g.withDescription("missing GRPC status in response");
        }
        Integer num = (Integer) ftaVar.get(f91730y);
        return (num != null ? oc7.httpStatusToGrpcStatus(num.intValue()) : n4g.f63272s.withDescription("missing HTTP status code")).augmentDescription("missing GRPC status, inferred error from HTTP status code");
    }

    private static void stripTransportDetails(fta ftaVar) {
        ftaVar.discardAll(f91730y);
        ftaVar.discardAll(tb8.f84152b);
        ftaVar.discardAll(tb8.f84151a);
    }

    @eib
    private n4g validateInitialMetadata(fta ftaVar) {
        Integer num = (Integer) ftaVar.get(f91730y);
        if (num == null) {
            return n4g.f63272s.withDescription("Missing HTTP status code");
        }
        String str = (String) ftaVar.get(oc7.f67141j);
        if (oc7.isGrpcContentType(str)) {
            return null;
        }
        return oc7.httpStatusToGrpcStatus(num.intValue()).augmentDescription("invalid content-type: " + str);
    }

    @Override // p000.AbstractC9063m0.c, p000.gsa.InterfaceC6484b
    public /* bridge */ /* synthetic */ void deframerClosed(boolean z) {
        super.deframerClosed(z);
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo12704w(n4g n4gVar, boolean z, fta ftaVar);

    /* JADX INFO: renamed from: x */
    public void m24069x(frd frdVar, boolean z) throws Throwable {
        n4g n4gVar = this.f91731t;
        if (n4gVar != null) {
            this.f91731t = n4gVar.augmentDescription("DATA-----------------------------\n" + grd.readAsString(frdVar, this.f91733v));
            frdVar.close();
            if (this.f91731t.getDescription().length() > 1000 || z) {
                mo12704w(this.f91731t, false, this.f91732u);
                return;
            }
            return;
        }
        if (!this.f91734w) {
            mo12704w(n4g.f63272s.withDescription("headers not received before payload"), false, new fta());
            return;
        }
        int i = frdVar.readableBytes();
        m16532r(frdVar);
        if (z) {
            if (i > 0) {
                this.f91731t = n4g.f63272s.withDescription("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.f91731t = n4g.f63272s.withDescription("Received unexpected EOS on empty DATA frame from server");
            }
            fta ftaVar = new fta();
            this.f91732u = ftaVar;
            transportReportStatus(this.f91731t, false, ftaVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: y */
    public void m24070y(fta ftaVar) {
        v7d.checkNotNull(ftaVar, "headers");
        n4g n4gVar = this.f91731t;
        if (n4gVar != null) {
            this.f91731t = n4gVar.augmentDescription("headers: " + ftaVar);
            return;
        }
        try {
            if (this.f91734w) {
                n4g n4gVarWithDescription = n4g.f63272s.withDescription("Received headers twice");
                this.f91731t = n4gVarWithDescription;
                if (n4gVarWithDescription != null) {
                    this.f91731t = n4gVarWithDescription.augmentDescription("headers: " + ftaVar);
                    this.f91732u = ftaVar;
                    this.f91733v = extractCharset(ftaVar);
                    return;
                }
                return;
            }
            Integer num = (Integer) ftaVar.get(f91730y);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                n4g n4gVar2 = this.f91731t;
                if (n4gVar2 != null) {
                    this.f91731t = n4gVar2.augmentDescription("headers: " + ftaVar);
                    this.f91732u = ftaVar;
                    this.f91733v = extractCharset(ftaVar);
                    return;
                }
                return;
            }
            this.f91734w = true;
            n4g n4gVarValidateInitialMetadata = validateInitialMetadata(ftaVar);
            this.f91731t = n4gVarValidateInitialMetadata;
            if (n4gVarValidateInitialMetadata != null) {
                if (n4gVarValidateInitialMetadata != null) {
                    this.f91731t = n4gVarValidateInitialMetadata.augmentDescription("headers: " + ftaVar);
                    this.f91732u = ftaVar;
                    this.f91733v = extractCharset(ftaVar);
                    return;
                }
                return;
            }
            stripTransportDetails(ftaVar);
            m16533s(ftaVar);
            n4g n4gVar3 = this.f91731t;
            if (n4gVar3 != null) {
                this.f91731t = n4gVar3.augmentDescription("headers: " + ftaVar);
                this.f91732u = ftaVar;
                this.f91733v = extractCharset(ftaVar);
            }
        } catch (Throwable th) {
            n4g n4gVar4 = this.f91731t;
            if (n4gVar4 != null) {
                this.f91731t = n4gVar4.augmentDescription("headers: " + ftaVar);
                this.f91732u = ftaVar;
                this.f91733v = extractCharset(ftaVar);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m24071z(fta ftaVar) {
        v7d.checkNotNull(ftaVar, oc7.f67148q);
        if (this.f91731t == null && !this.f91734w) {
            n4g n4gVarValidateInitialMetadata = validateInitialMetadata(ftaVar);
            this.f91731t = n4gVarValidateInitialMetadata;
            if (n4gVarValidateInitialMetadata != null) {
                this.f91732u = ftaVar;
            }
        }
        n4g n4gVar = this.f91731t;
        if (n4gVar == null) {
            n4g n4gVarStatusFromTrailers = statusFromTrailers(ftaVar);
            stripTransportDetails(ftaVar);
            m16534t(ftaVar, n4gVarStatusFromTrailers);
        } else {
            n4g n4gVarAugmentDescription = n4gVar.augmentDescription("trailers: " + ftaVar);
            this.f91731t = n4gVarAugmentDescription;
            mo12704w(n4gVarAugmentDescription, false, this.f91732u);
        }
    }
}
