package p000;

import android.os.Bundle;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l63 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C8639a f56329c = new C8639a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f56330a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bundle f56331b;

    /* JADX INFO: renamed from: l63$a */
    public static final class C8639a {
        public /* synthetic */ C8639a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final l63 createFrom(@yfb String str, @yfb Bundle bundle) {
            md8.checkNotNullParameter(str, "type");
            md8.checkNotNullParameter(bundle, "data");
            try {
                if (md8.areEqual(str, oic.f67748g)) {
                    return oic.f67747f.createFrom$credentials_release(bundle);
                }
                if (md8.areEqual(str, jjd.f50722f)) {
                    return jjd.f50721e.createFrom$credentials_release(bundle);
                }
                throw new qv6();
            } catch (qv6 unused) {
                return new tc3(str, bundle);
            }
        }

        private C8639a() {
        }
    }

    public l63(@yfb String str, @yfb Bundle bundle) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "data");
        this.f56330a = str;
        this.f56331b = bundle;
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final l63 createFrom(@yfb String str, @yfb Bundle bundle) {
        return f56329c.createFrom(str, bundle);
    }

    @yfb
    public final Bundle getData() {
        return this.f56331b;
    }

    @yfb
    public final String getType() {
        return this.f56330a;
    }
}
