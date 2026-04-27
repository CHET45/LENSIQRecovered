package p000;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ry0 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C12367c f80085e = new C12367c(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<o63> f80086a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<C12942t7> f80087b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final List<bi0> f80088c;

    /* JADX INFO: renamed from: d */
    @gib
    public final lyd f80089d;

    /* JADX INFO: renamed from: ry0$a */
    @c5e(34)
    public static final class C12365a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C12365a f80090a = new C12365a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f80091b = "androidx.credentials.provider.BeginGetCredentialResponse";

        private C12365a() {
        }

        @do8
        @ih4
        public static final void asBundle(@yfb Bundle bundle, @yfb ry0 ry0Var) {
            md8.checkNotNullParameter(bundle, "bundle");
            md8.checkNotNullParameter(ry0Var, "response");
            bundle.putParcelable(f80091b, c01.f15399a.convertToFrameworkResponse(ry0Var));
        }

        @do8
        @gib
        @ih4
        public static final ry0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            BeginGetCredentialResponse beginGetCredentialResponse = (BeginGetCredentialResponse) bundle.getParcelable(f80091b, BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return c01.f15399a.convertToJetpackResponse(beginGetCredentialResponse);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ry0$b */
    public static final class C12366b {

        /* JADX INFO: renamed from: a */
        @yfb
        public List<o63> f80092a = new ArrayList();

        /* JADX INFO: renamed from: b */
        @yfb
        public List<C12942t7> f80093b = new ArrayList();

        /* JADX INFO: renamed from: c */
        @yfb
        public List<bi0> f80094c = new ArrayList();

        /* JADX INFO: renamed from: d */
        @gib
        public lyd f80095d;

        @yfb
        public final C12366b addAction(@yfb C12942t7 c12942t7) {
            md8.checkNotNullParameter(c12942t7, "action");
            this.f80093b.add(c12942t7);
            return this;
        }

        @yfb
        public final C12366b addAuthenticationAction(@yfb bi0 bi0Var) {
            md8.checkNotNullParameter(bi0Var, "authenticationAction");
            this.f80094c.add(bi0Var);
            return this;
        }

        @yfb
        public final C12366b addCredentialEntry(@yfb o63 o63Var) {
            md8.checkNotNullParameter(o63Var, "entry");
            this.f80092a.add(o63Var);
            return this;
        }

        @yfb
        public final ry0 build() {
            return new ry0(v82.toList(this.f80092a), v82.toList(this.f80093b), v82.toList(this.f80094c), this.f80095d);
        }

        @yfb
        public final C12366b setActions(@yfb List<C12942t7> list) {
            md8.checkNotNullParameter(list, "actions");
            this.f80093b = v82.toMutableList((Collection) list);
            return this;
        }

        @yfb
        public final C12366b setAuthenticationActions(@yfb List<bi0> list) {
            md8.checkNotNullParameter(list, "authenticationEntries");
            this.f80094c = v82.toMutableList((Collection) list);
            return this;
        }

        @yfb
        public final C12366b setCredentialEntries(@yfb List<? extends o63> list) {
            md8.checkNotNullParameter(list, "entries");
            this.f80092a = v82.toMutableList((Collection) list);
            return this;
        }

        @yfb
        public final C12366b setRemoteEntry(@gib lyd lydVar) {
            this.f80095d = lydVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: ry0$c */
    public static final class C12367c {
        public /* synthetic */ C12367c(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final Bundle asBundle(@yfb ry0 ry0Var) {
            md8.checkNotNullParameter(ry0Var, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                C12365a.asBundle(bundle, ry0Var);
            }
            return bundle;
        }

        @do8
        @gib
        public final ry0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return C12365a.fromBundle(bundle);
            }
            return null;
        }

        private C12367c() {
        }
    }

    public ry0() {
        this(null, null, null, null, 15, null);
    }

    @do8
    @yfb
    public static final Bundle asBundle(@yfb ry0 ry0Var) {
        return f80085e.asBundle(ry0Var);
    }

    @do8
    @gib
    public static final ry0 fromBundle(@yfb Bundle bundle) {
        return f80085e.fromBundle(bundle);
    }

    @yfb
    public final List<C12942t7> getActions() {
        return this.f80087b;
    }

    @yfb
    public final List<bi0> getAuthenticationActions() {
        return this.f80088c;
    }

    @yfb
    public final List<o63> getCredentialEntries() {
        return this.f80086a;
    }

    @gib
    public final lyd getRemoteEntry() {
        return this.f80089d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ry0(@yfb List<? extends o63> list, @yfb List<C12942t7> list2, @yfb List<bi0> list3, @gib lyd lydVar) {
        md8.checkNotNullParameter(list, "credentialEntries");
        md8.checkNotNullParameter(list2, "actions");
        md8.checkNotNullParameter(list3, "authenticationActions");
        this.f80086a = list;
        this.f80087b = list2;
        this.f80088c = list3;
        this.f80089d = lydVar;
    }

    public /* synthetic */ ry0(List list, List list2, List list3, lyd lydVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? l82.emptyList() : list, (i & 2) != 0 ? l82.emptyList() : list2, (i & 4) != 0 ? l82.emptyList() : list3, (i & 8) != 0 ? null : lydVar);
    }
}
