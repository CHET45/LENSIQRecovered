package p000;

import android.os.Bundle;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q53 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C11310a f73260c = new C11310a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f73261a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bundle f73262b;

    /* JADX INFO: renamed from: q53$a */
    public static final class C11310a {
        public /* synthetic */ C11310a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final q53 createFrom(@yfb String str, @yfb Bundle bundle) {
            md8.checkNotNullParameter(str, "type");
            md8.checkNotNullParameter(bundle, "data");
            try {
                if (md8.areEqual(str, oic.f67748g)) {
                    return a63.f494d.createFrom$credentials_release(bundle);
                }
                if (md8.areEqual(str, jjd.f50722f)) {
                    return e63.f31893e.createFrom$credentials_release(bundle);
                }
                throw new qv6();
            } catch (qv6 unused) {
                return new u53(str, bundle);
            }
        }

        private C11310a() {
        }
    }

    public q53(@yfb String str, @yfb Bundle bundle) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "data");
        this.f73261a = str;
        this.f73262b = bundle;
    }

    @do8
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final q53 createFrom(@yfb String str, @yfb Bundle bundle) {
        return f73260c.createFrom(str, bundle);
    }

    @yfb
    public final Bundle getData() {
        return this.f73262b;
    }

    @yfb
    public final String getType() {
        return this.f73261a;
    }
}
