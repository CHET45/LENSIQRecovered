package p000;

import java.security.MessageDigest;
import p000.gii;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(28)
@p7e({p7e.EnumC10826a.f69934a})
public final class hii {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C6866a f43776a = new C6866a(null);

    /* JADX INFO: renamed from: hii$a */
    public static final class C6866a {
        public /* synthetic */ C6866a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final String appInfoToOrigin(@yfb so1 so1Var) {
            md8.checkNotNullParameter(so1Var, ocd.f67211j);
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(so1Var.getSigningInfo().getApkContentsSigners()[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            sb.append("android:apk-key-hash:");
            gii.C6332a c6332a = gii.f39918a;
            md8.checkNotNullExpressionValue(bArrDigest, "certHash");
            sb.append(c6332a.b64Encode(bArrDigest));
            return sb.toString();
        }

        private C6866a() {
        }
    }
}
