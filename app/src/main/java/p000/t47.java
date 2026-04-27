package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class t47 extends t63 {

    /* JADX INFO: renamed from: j */
    @yfb
    public static final C12909a f83690j = new C12909a(null);

    /* JADX INFO: renamed from: k */
    @yfb
    public static final String f83691k = "androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS";

    /* JADX INFO: renamed from: i */
    @yfb
    public final Set<String> f83692i;

    /* JADX INFO: renamed from: t47$a */
    public static final class C12909a {
        public /* synthetic */ C12909a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final t47 createFrom$credentials_release(@yfb Bundle bundle, @yfb Set<ComponentName> set, @yfb Bundle bundle2) {
            Set setEmptySet;
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(set, "allowedProviders");
            md8.checkNotNullParameter(bundle2, "candidateQueryData");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(t47.f83691k);
            if (stringArrayList == null || (setEmptySet = v82.toSet(stringArrayList)) == null) {
                setEmptySet = w6f.emptySet();
            }
            return new t47(setEmptySet, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle, bundle2, null);
        }

        @do8
        @yfb
        public final Bundle toBundle$credentials_release(@yfb Set<String> set) {
            md8.checkNotNullParameter(set, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(t47.f83691k, new ArrayList<>(set));
            return bundle;
        }

        private C12909a() {
        }
    }

    @yn8
    public t47() {
        this((Set) null, false, (Set) null, 7, (jt3) null);
    }

    @yfb
    public final Set<String> getAllowedUserIds() {
        return this.f83692i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public t47(@yfb Set<String> set) {
        this((Set) set, false, (Set) null, 6, (jt3) null);
        md8.checkNotNullParameter(set, "allowedUserIds");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public t47(@yfb Set<String> set, boolean z) {
        this(set, z, (Set) null, 4, (jt3) null);
        md8.checkNotNullParameter(set, "allowedUserIds");
    }

    public /* synthetic */ t47(Set set, boolean z, Set set2, Bundle bundle, Bundle bundle2, jt3 jt3Var) {
        this((Set<String>) set, z, (Set<ComponentName>) set2, bundle, bundle2);
    }

    private t47(Set<String> set, boolean z, Set<ComponentName> set2, Bundle bundle, Bundle bundle2) {
        super(oic.f67748g, bundle, bundle2, false, z, set2);
        this.f83692i = set;
    }

    public /* synthetic */ t47(Set set, boolean z, Set set2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w6f.emptySet() : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? w6f.emptySet() : set2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yn8
    public t47(@yfb Set<String> set, boolean z, @yfb Set<ComponentName> set2) {
        md8.checkNotNullParameter(set, "allowedUserIds");
        md8.checkNotNullParameter(set2, "allowedProviders");
        C12909a c12909a = f83690j;
        this(set, z, set2, c12909a.toBundle$credentials_release(set), c12909a.toBundle$credentials_release(set));
    }
}
