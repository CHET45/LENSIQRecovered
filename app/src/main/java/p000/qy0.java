package p000;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialRequest;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qy0 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C11762b f76286c = new C11762b(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<py0> f76287a;

    /* JADX INFO: renamed from: b */
    @gib
    public final so1 f76288b;

    /* JADX INFO: renamed from: qy0$a */
    @c5e(34)
    public static final class C11761a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C11761a f76289a = new C11761a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f76290b = "androidx.credentials.provider.BeginGetCredentialRequest";

        private C11761a() {
        }

        @do8
        @ih4
        public static final void asBundle(@yfb Bundle bundle, @yfb qy0 qy0Var) {
            md8.checkNotNullParameter(bundle, "bundle");
            md8.checkNotNullParameter(qy0Var, "request");
            bundle.putParcelable(f76290b, c01.f15399a.convertToFrameworkRequest(qy0Var));
        }

        @do8
        @gib
        @ih4
        public static final qy0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            BeginGetCredentialRequest beginGetCredentialRequest = (BeginGetCredentialRequest) bundle.getParcelable(f76290b, BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return c01.f15399a.convertToJetpackRequest$credentials_release(beginGetCredentialRequest);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: qy0$b */
    public static final class C11762b {
        public /* synthetic */ C11762b(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final Bundle asBundle(@yfb qy0 qy0Var) {
            md8.checkNotNullParameter(qy0Var, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                C11761a.asBundle(bundle, qy0Var);
            }
            return bundle;
        }

        @do8
        @gib
        public final qy0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return C11761a.fromBundle(bundle);
            }
            return null;
        }

        private C11762b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public qy0(@yfb List<? extends py0> list) {
        this(list, null, 2, 0 == true ? 1 : 0);
        md8.checkNotNullParameter(list, "beginGetCredentialOptions");
    }

    @do8
    @yfb
    public static final Bundle asBundle(@yfb qy0 qy0Var) {
        return f76286c.asBundle(qy0Var);
    }

    @do8
    @gib
    public static final qy0 fromBundle(@yfb Bundle bundle) {
        return f76286c.fromBundle(bundle);
    }

    @yfb
    public final List<py0> getBeginGetCredentialOptions() {
        return this.f76287a;
    }

    @gib
    public final so1 getCallingAppInfo() {
        return this.f76288b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yn8
    public qy0(@yfb List<? extends py0> list, @gib so1 so1Var) {
        md8.checkNotNullParameter(list, "beginGetCredentialOptions");
        this.f76287a = list;
        this.f76288b = so1Var;
    }

    public /* synthetic */ qy0(List list, so1 so1Var, int i, jt3 jt3Var) {
        this(list, (i & 2) != 0 ? null : so1Var);
    }
}
