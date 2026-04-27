package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kid {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C8383a f54228c = new C8383a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<t63> f54229a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final so1 f54230b;

    /* JADX INFO: renamed from: kid$a */
    public static final class C8383a {
        public /* synthetic */ C8383a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final kid createFrom$credentials_release(@yfb List<? extends t63> list, @yfb so1 so1Var) {
            md8.checkNotNullParameter(list, "options");
            md8.checkNotNullParameter(so1Var, "callingAppInfo");
            return new kid(list, so1Var);
        }

        private C8383a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kid(@yfb List<? extends t63> list, @yfb so1 so1Var) {
        md8.checkNotNullParameter(list, "credentialOptions");
        md8.checkNotNullParameter(so1Var, "callingAppInfo");
        this.f54229a = list;
        this.f54230b = so1Var;
    }

    @yfb
    public final so1 getCallingAppInfo() {
        return this.f54230b;
    }

    @yfb
    public final List<t63> getCredentialOptions() {
        return this.f54229a;
    }
}
