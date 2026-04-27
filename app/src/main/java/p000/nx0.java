package p000;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nx0 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C10100b f65932d = new C10100b(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f65933a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bundle f65934b;

    /* JADX INFO: renamed from: c */
    @gib
    public final so1 f65935c;

    /* JADX INFO: renamed from: nx0$a */
    @c5e(34)
    public static final class C10099a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C10099a f65936a = new C10099a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f65937b = "androidx.credentials.provider.BeginCreateCredentialRequest";

        private C10099a() {
        }

        @do8
        @ih4
        public static final void asBundle(@yfb Bundle bundle, @yfb nx0 nx0Var) {
            md8.checkNotNullParameter(bundle, "bundle");
            md8.checkNotNullParameter(nx0Var, "request");
            bundle.putParcelable(f65937b, ly0.f59191a.convertToFrameworkRequest(nx0Var));
        }

        @do8
        @gib
        @ih4
        public static final nx0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            BeginCreateCredentialRequest beginCreateCredentialRequest = (BeginCreateCredentialRequest) bundle.getParcelable(f65937b, BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return ly0.f59191a.convertToJetpackRequest$credentials_release(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: nx0$b */
    public static final class C10100b {
        public /* synthetic */ C10100b(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final Bundle asBundle(@yfb nx0 nx0Var) {
            md8.checkNotNullParameter(nx0Var, "request");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                C10099a.asBundle(bundle, nx0Var);
            }
            return bundle;
        }

        @do8
        @gib
        public final nx0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return C10099a.fromBundle(bundle);
            }
            return null;
        }

        private C10100b() {
        }
    }

    public nx0(@yfb String str, @yfb Bundle bundle, @gib so1 so1Var) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        this.f65933a = str;
        this.f65934b = bundle;
        this.f65935c = so1Var;
    }

    @do8
    @yfb
    public static final Bundle asBundle(@yfb nx0 nx0Var) {
        return f65932d.asBundle(nx0Var);
    }

    @do8
    @gib
    public static final nx0 fromBundle(@yfb Bundle bundle) {
        return f65932d.fromBundle(bundle);
    }

    @gib
    public final so1 getCallingAppInfo() {
        return this.f65935c;
    }

    @yfb
    public final Bundle getCandidateQueryData() {
        return this.f65934b;
    }

    @yfb
    public final String getType() {
        return this.f65933a;
    }
}
