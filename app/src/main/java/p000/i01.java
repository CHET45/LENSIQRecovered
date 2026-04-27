package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i01 extends py0 {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C7093a f45356f = new C7093a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public final Set<String> f45357e;

    /* JADX INFO: renamed from: i01$a */
    public static final class C7093a {
        public /* synthetic */ C7093a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @fdi
        public final i01 createForTest(@yfb Bundle bundle, @yfb String str) {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(str, "id");
            return createFrom$credentials_release(bundle, str);
        }

        @yfb
        public final i01 createFrom$credentials_release(@yfb Bundle bundle, @yfb String str) {
            Set setEmptySet;
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(str, "id");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(t47.f83691k);
            if (stringArrayList == null || (setEmptySet = v82.toSet(stringArrayList)) == null) {
                setEmptySet = w6f.emptySet();
            }
            return new i01(setEmptySet, bundle, str);
        }

        private C7093a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(@yfb Set<String> set, @yfb Bundle bundle, @yfb String str) {
        super(str, oic.f67748g, bundle);
        md8.checkNotNullParameter(set, "allowedUserIds");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        md8.checkNotNullParameter(str, "id");
        this.f45357e = set;
    }

    @do8
    @yfb
    @fdi
    public static final i01 createForTest(@yfb Bundle bundle, @yfb String str) {
        return f45356f.createForTest(bundle, str);
    }

    @yfb
    public final Set<String> getAllowedUserIds() {
        return this.f45357e;
    }
}
