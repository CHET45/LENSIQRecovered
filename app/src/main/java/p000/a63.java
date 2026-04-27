package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class a63 extends q53 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C0072a f494d = new C0072a(null);

    /* JADX INFO: renamed from: a63$a */
    public static final class C0072a {
        public /* synthetic */ C0072a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final a63 createFrom$credentials_release(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "data");
            return new a63(bundle, null);
        }

        private C0072a() {
        }
    }

    public /* synthetic */ a63(Bundle bundle, jt3 jt3Var) {
        this(bundle);
    }

    private a63(Bundle bundle) {
        super(oic.f67748g, bundle);
    }

    public a63() {
        this(new Bundle());
    }
}
