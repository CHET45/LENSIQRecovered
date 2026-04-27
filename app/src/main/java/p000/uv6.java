package p000;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.credentials.C0939R;
import p000.p53;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(23)
public final class uv6 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C13740a f89228a = new C13740a(null);

    /* JADX INFO: renamed from: uv6$a */
    public static final class C13740a {
        public /* synthetic */ C13740a(jt3 jt3Var) {
            this();
        }

        @c5e(23)
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        @yfb
        public final Bundle getFinalCreateCredentialData(@yfb p53 p53Var, @yfb Context context) {
            md8.checkNotNullParameter(p53Var, "request");
            md8.checkNotNullParameter(context, "context");
            Bundle credentialData = p53Var.getCredentialData();
            Bundle bundle = p53Var.getDisplayInfo().toBundle();
            bundle.putParcelable(p53.C10798b.f69718i, Icon.createWithResource(context, p53Var instanceof z53 ? C0939R.drawable.ic_password : p53Var instanceof d63 ? C0939R.drawable.ic_passkey : C0939R.drawable.ic_other_sign_in));
            credentialData.putBundle(p53.C10798b.f69715f, bundle);
            return credentialData;
        }

        private C13740a() {
        }
    }

    @c5e(23)
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    @yfb
    public static final Bundle getFinalCreateCredentialData(@yfb p53 p53Var, @yfb Context context) {
        return f89228a.getFinalCreateCredentialData(p53Var, context);
    }
}
