package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class py0 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C11179a f72475d = new C11179a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f72476a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f72477b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Bundle f72478c;

    /* JADX INFO: renamed from: py0$a */
    public static final class C11179a {
        public /* synthetic */ C11179a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final py0 createFrom$credentials_release(@yfb String str, @yfb String str2, @yfb Bundle bundle) {
            md8.checkNotNullParameter(str, "id");
            md8.checkNotNullParameter(str2, "type");
            md8.checkNotNullParameter(bundle, "candidateQueryData");
            return md8.areEqual(str2, oic.f67748g) ? i01.f45356f.createFrom$credentials_release(bundle, str) : md8.areEqual(str2, jjd.f50722f) ? j01.f49203g.createFrom$credentials_release(bundle, str) : new h01(str, str2, bundle);
        }

        private C11179a() {
        }
    }

    public py0(@yfb String str, @yfb String str2, @yfb Bundle bundle) {
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "type");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        this.f72476a = str;
        this.f72477b = str2;
        this.f72478c = bundle;
    }

    @yfb
    public final Bundle getCandidateQueryData() {
        return this.f72478c;
    }

    @yfb
    public final String getId() {
        return this.f72476a;
    }

    @yfb
    public final String getType() {
        return this.f72477b;
    }
}
