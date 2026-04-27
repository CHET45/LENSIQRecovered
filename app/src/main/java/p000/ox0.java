package p000;

import android.os.Build;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ox0 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10701c f69126c = new C10701c(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<x53> f69127a;

    /* JADX INFO: renamed from: b */
    @gib
    public final lyd f69128b;

    /* JADX INFO: renamed from: ox0$a */
    @c5e(34)
    public static final class C10699a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C10699a f69129a = new C10699a();

        /* JADX INFO: renamed from: b */
        @yfb
        public static final String f69130b = "androidx.credentials.provider.BeginCreateCredentialResponse";

        private C10699a() {
        }

        @do8
        @ih4
        public static final void asBundle(@yfb Bundle bundle, @yfb ox0 ox0Var) {
            md8.checkNotNullParameter(bundle, "bundle");
            md8.checkNotNullParameter(ox0Var, "response");
            bundle.putParcelable(f69130b, ly0.f59191a.convertToFrameworkResponse(ox0Var));
        }

        @do8
        @gib
        @ih4
        public static final ox0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            BeginCreateCredentialResponse beginCreateCredentialResponse = (BeginCreateCredentialResponse) bundle.getParcelable(f69130b, BeginCreateCredentialResponse.class);
            if (beginCreateCredentialResponse != null) {
                return ly0.f59191a.convertToJetpackResponse(beginCreateCredentialResponse);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ox0$b */
    public static final class C10700b {

        /* JADX INFO: renamed from: a */
        @yfb
        public List<x53> f69131a = new ArrayList();

        /* JADX INFO: renamed from: b */
        @gib
        public lyd f69132b;

        @yfb
        public final C10700b addCreateEntry(@yfb x53 x53Var) {
            md8.checkNotNullParameter(x53Var, "createEntry");
            this.f69131a.add(x53Var);
            return this;
        }

        @yfb
        public final ox0 build() {
            return new ox0(v82.toList(this.f69131a), this.f69132b);
        }

        @yfb
        public final C10700b setCreateEntries(@yfb List<x53> list) {
            md8.checkNotNullParameter(list, "createEntries");
            this.f69131a = v82.toMutableList((Collection) list);
            return this;
        }

        @yfb
        public final C10700b setRemoteEntry(@gib lyd lydVar) {
            this.f69132b = lydVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: ox0$c */
    public static final class C10701c {
        public /* synthetic */ C10701c(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final Bundle asBundle(@yfb ox0 ox0Var) {
            md8.checkNotNullParameter(ox0Var, "response");
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                C10699a.asBundle(bundle, ox0Var);
            }
            return bundle;
        }

        @do8
        @gib
        public final ox0 fromBundle(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "bundle");
            if (Build.VERSION.SDK_INT >= 34) {
                return C10699a.fromBundle(bundle);
            }
            return null;
        }

        private C10701c() {
        }
    }

    public ox0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @do8
    @yfb
    public static final Bundle asBundle(@yfb ox0 ox0Var) {
        return f69126c.asBundle(ox0Var);
    }

    @do8
    @gib
    public static final ox0 fromBundle(@yfb Bundle bundle) {
        return f69126c.fromBundle(bundle);
    }

    @yfb
    public final List<x53> getCreateEntries() {
        return this.f69127a;
    }

    @gib
    public final lyd getRemoteEntry() {
        return this.f69128b;
    }

    public ox0(@yfb List<x53> list, @gib lyd lydVar) {
        md8.checkNotNullParameter(list, "createEntries");
        this.f69127a = list;
        this.f69128b = lydVar;
    }

    public /* synthetic */ ox0(List list, lyd lydVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? l82.emptyList() : list, (i & 2) != 0 ? null : lydVar);
    }
}
