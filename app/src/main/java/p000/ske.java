package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p000.ko5;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class ske {

    /* JADX INFO: renamed from: a */
    public final op9<eq8, String> f82128a = new op9<>(1000);

    /* JADX INFO: renamed from: b */
    public final p4d.InterfaceC10791a<C12638b> f82129b = ko5.threadSafe(10, new C12637a());

    /* JADX INFO: renamed from: ske$a */
    public class C12637a implements ko5.InterfaceC8470d<C12638b> {
        public C12637a() {
        }

        @Override // p000.ko5.InterfaceC8470d
        public C12638b create() {
            try {
                return new C12638b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ske$b */
    public static final class C12638b implements ko5.InterfaceC8472f {

        /* JADX INFO: renamed from: a */
        public final MessageDigest f82131a;

        /* JADX INFO: renamed from: b */
        public final b3g f82132b = b3g.newInstance();

        public C12638b(MessageDigest messageDigest) {
            this.f82131a = messageDigest;
        }

        @Override // p000.ko5.InterfaceC8472f
        @efb
        public b3g getVerifier() {
            return this.f82132b;
        }
    }

    private String calculateHexStringDigest(eq8 eq8Var) {
        C12638b c12638b = (C12638b) t7d.checkNotNull(this.f82129b.acquire());
        try {
            eq8Var.updateDiskCacheKey(c12638b.f82131a);
            return v0i.sha256BytesToHex(c12638b.f82131a.digest());
        } finally {
            this.f82129b.release(c12638b);
        }
    }

    public String getSafeKey(eq8 eq8Var) {
        String strCalculateHexStringDigest;
        synchronized (this.f82128a) {
            strCalculateHexStringDigest = this.f82128a.get(eq8Var);
        }
        if (strCalculateHexStringDigest == null) {
            strCalculateHexStringDigest = calculateHexStringDigest(eq8Var);
        }
        synchronized (this.f82128a) {
            this.f82128a.put(eq8Var, strCalculateHexStringDigest);
        }
        return strCalculateHexStringDigest;
    }
}
