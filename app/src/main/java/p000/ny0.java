package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ny0 extends nx0 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C10114a f65995e = new C10114a(null);

    /* JADX INFO: renamed from: ny0$a */
    public static final class C10114a {
        public /* synthetic */ C10114a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final ny0 createFrom$credentials_release(@yfb Bundle bundle, @gib so1 so1Var) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                return new ny0(so1Var, bundle);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        private C10114a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(@gib so1 so1Var, @yfb Bundle bundle) {
        super(oic.f67748g, bundle, so1Var);
        md8.checkNotNullParameter(bundle, "candidateQueryData");
    }
}
