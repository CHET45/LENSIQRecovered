package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nGetCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCredentialRequest.kt\nandroidx/credentials/GetCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
public final class z37 {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C15971b f103968f = new C15971b(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f103969g = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f103970h = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f103971i = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<t63> f103972a;

    /* JADX INFO: renamed from: b */
    @gib
    public final String f103973b;

    /* JADX INFO: renamed from: c */
    public final boolean f103974c;

    /* JADX INFO: renamed from: d */
    @gib
    public final ComponentName f103975d;

    /* JADX INFO: renamed from: e */
    public final boolean f103976e;

    /* JADX INFO: renamed from: z37$a */
    public static final class C15970a {

        /* JADX INFO: renamed from: a */
        @yfb
        public List<t63> f103977a = new ArrayList();

        /* JADX INFO: renamed from: b */
        @gib
        public String f103978b;

        /* JADX INFO: renamed from: c */
        public boolean f103979c;

        /* JADX INFO: renamed from: d */
        public boolean f103980d;

        /* JADX INFO: renamed from: e */
        @gib
        public ComponentName f103981e;

        @yfb
        public final C15970a addCredentialOption(@yfb t63 t63Var) {
            md8.checkNotNullParameter(t63Var, "credentialOption");
            this.f103977a.add(t63Var);
            return this;
        }

        @yfb
        public final z37 build() {
            return new z37(v82.toList(this.f103977a), this.f103978b, this.f103979c, this.f103981e, this.f103980d);
        }

        @yfb
        public final C15970a setCredentialOptions(@yfb List<? extends t63> list) {
            md8.checkNotNullParameter(list, "credentialOptions");
            this.f103977a = v82.toMutableList((Collection) list);
            return this;
        }

        @yfb
        public final C15970a setOrigin(@yfb String str) {
            md8.checkNotNullParameter(str, "origin");
            this.f103978b = str;
            return this;
        }

        @yfb
        public final C15970a setPreferIdentityDocUi(boolean z) {
            this.f103979c = z;
            return this;
        }

        @yfb
        public final C15970a setPreferImmediatelyAvailableCredentials(boolean z) {
            this.f103980d = z;
            return this;
        }

        @yfb
        public final C15970a setPreferUiBrandingComponentName(@gib ComponentName componentName) {
            this.f103981e = componentName;
            return this;
        }
    }

    /* JADX INFO: renamed from: z37$b */
    public static final class C15971b {
        public /* synthetic */ C15971b(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final z37 createFrom(@yfb List<? extends t63> list, @gib String str, @yfb Bundle bundle) throws qv6 {
            md8.checkNotNullParameter(list, "credentialOptions");
            md8.checkNotNullParameter(bundle, "data");
            try {
                boolean z = bundle.getBoolean(z37.f103970h);
                C15970a preferImmediatelyAvailableCredentials = new C15970a().setCredentialOptions(list).setPreferIdentityDocUi(z).setPreferUiBrandingComponentName((ComponentName) bundle.getParcelable(z37.f103971i)).setPreferImmediatelyAvailableCredentials(bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (str != null) {
                    preferImmediatelyAvailableCredentials.setOrigin(str);
                }
                return preferImmediatelyAvailableCredentials.build();
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final Bundle toRequestDataBundle(@yfb z37 z37Var) {
            md8.checkNotNullParameter(z37Var, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean(z37.f103970h, z37Var.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z37Var.preferImmediatelyAvailableCredentials());
            bundle.putParcelable(z37.f103971i, z37Var.getPreferUiBrandingComponentName());
            return bundle;
        }

        private C15971b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z37(@yfb List<? extends t63> list) {
        this(list, null, false, null, false, 30, null);
        md8.checkNotNullParameter(list, "credentialOptions");
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final z37 createFrom(@yfb List<? extends t63> list, @gib String str, @yfb Bundle bundle) {
        return f103968f.createFrom(list, str, bundle);
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final Bundle toRequestDataBundle(@yfb z37 z37Var) {
        return f103968f.toRequestDataBundle(z37Var);
    }

    @yfb
    public final List<t63> getCredentialOptions() {
        return this.f103972a;
    }

    @gib
    public final String getOrigin() {
        return this.f103973b;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.f103974c;
    }

    @gib
    public final ComponentName getPreferUiBrandingComponentName() {
        return this.f103975d;
    }

    @xn8(name = "preferImmediatelyAvailableCredentials")
    public final boolean preferImmediatelyAvailableCredentials() {
        return this.f103976e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z37(@yfb List<? extends t63> list, @gib String str) {
        this(list, str, false, null, false, 28, null);
        md8.checkNotNullParameter(list, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z37(@yfb List<? extends t63> list, @gib String str, boolean z) {
        this(list, str, z, null, false, 24, null);
        md8.checkNotNullParameter(list, "credentialOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z37(@yfb List<? extends t63> list, @gib String str, boolean z, @gib ComponentName componentName) {
        this(list, str, z, componentName, false, 16, null);
        md8.checkNotNullParameter(list, "credentialOptions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yn8
    public z37(@yfb List<? extends t63> list, @gib String str, boolean z, @gib ComponentName componentName, boolean z2) {
        md8.checkNotNullParameter(list, "credentialOptions");
        this.f103972a = list;
        this.f103973b = str;
        this.f103974c = z;
        this.f103975d = componentName;
        this.f103976e = z2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }

    public /* synthetic */ z37(List list, String str, boolean z, ComponentName componentName, boolean z2, int i, jt3 jt3Var) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : componentName, (i & 16) != 0 ? false : z2);
    }
}
