package p000;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ngc<T> {

    /* JADX INFO: renamed from: ngc$a */
    public static final class C9869a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: get-gIAlu-s$default, reason: not valid java name */
        public static /* synthetic */ Object m31156getgIAlus$default(ngc ngcVar, oo8 oo8Var, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
            }
            if ((i & 2) != 0) {
                list = l82.emptyList();
            }
            return ngcVar.mo30879getgIAlus(oo8Var, list);
        }
    }

    @yfb
    /* JADX INFO: renamed from: get-gIAlu-s */
    Object mo30879getgIAlus(@yfb oo8<Object> oo8Var, @yfb List<? extends mp8> list);
}
