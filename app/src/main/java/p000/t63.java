package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t63 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C12921a f83775g = new C12921a(null);

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f83776h = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f83777a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bundle f83778b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Bundle f83779c;

    /* JADX INFO: renamed from: d */
    public final boolean f83780d;

    /* JADX INFO: renamed from: e */
    public final boolean f83781e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final Set<ComponentName> f83782f;

    /* JADX INFO: renamed from: t63$a */
    public static final class C12921a {
        public /* synthetic */ C12921a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final t63 createFrom(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @yfb Set<ComponentName> set) {
            md8.checkNotNullParameter(str, "type");
            md8.checkNotNullParameter(bundle, "requestData");
            md8.checkNotNullParameter(bundle2, "candidateQueryData");
            md8.checkNotNullParameter(set, "allowedProviders");
            try {
                if (md8.areEqual(str, oic.f67748g)) {
                    return t47.f83690j.createFrom$credentials_release(bundle, set, bundle2);
                }
                if (!md8.areEqual(str, jjd.f50722f)) {
                    throw new qv6();
                }
                String string = bundle.getString(jjd.f50723g);
                if (string != null && string.hashCode() == -613058807 && string.equals(w47.f93220n)) {
                    return w47.f93217k.createFrom$credentials_release(bundle, set, bundle2);
                }
                throw new qv6();
            } catch (qv6 unused) {
                return new d47(str, bundle, bundle2, z, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set);
            }
        }

        public final boolean extractAutoSelectValue$credentials_release(@yfb Bundle bundle) {
            md8.checkNotNullParameter(bundle, "data");
            return bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        }

        private C12921a() {
        }
    }

    public t63(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, boolean z2, @yfb Set<ComponentName> set) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "requestData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(set, "allowedProviders");
        this.f83777a = str;
        this.f83778b = bundle;
        this.f83779c = bundle2;
        this.f83780d = z;
        this.f83781e = z2;
        this.f83782f = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final t63 createFrom(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @yfb Set<ComponentName> set) {
        return f83775g.createFrom(str, bundle, bundle2, z, set);
    }

    @yfb
    public final Set<ComponentName> getAllowedProviders() {
        return this.f83782f;
    }

    @yfb
    public final Bundle getCandidateQueryData() {
        return this.f83779c;
    }

    @yfb
    public final Bundle getRequestData() {
        return this.f83778b;
    }

    @yfb
    public final String getType() {
        return this.f83777a;
    }

    public final boolean isAutoSelectAllowed() {
        return this.f83781e;
    }

    public final boolean isSystemProviderRequired() {
        return this.f83780d;
    }
}
