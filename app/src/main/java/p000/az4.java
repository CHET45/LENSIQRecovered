package p000;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class az4 {

    /* JADX INFO: renamed from: az4$a */
    @c5e(34)
    public static class C1668a {
        private C1668a() {
        }

        @efb
        @ih4
        /* JADX INFO: renamed from: a */
        public static Set<int[]> m2761a() {
            return C1669b.m2762a();
        }
    }

    /* JADX INFO: renamed from: az4$b */
    public static class C1669b {
        private C1669b() {
        }

        @efb
        @igg({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: a */
        public static Set<int[]> m2762a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    private az4() {
    }

    @efb
    /* JADX INFO: renamed from: a */
    public static Set<int[]> m2760a() {
        return Build.VERSION.SDK_INT >= 34 ? C1668a.m2761a() : C1669b.m2762a();
    }
}
