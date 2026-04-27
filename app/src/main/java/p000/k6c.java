package p000;

import p000.a77;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public abstract class k6c {

    /* JADX INFO: renamed from: a */
    public static final int f52686a = 0;

    public static /* synthetic */ String toDebugString$default(k6c k6cVar, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i & 1) != 0) {
            str = a77.C0077a.f542d;
        }
        return k6cVar.toDebugString(str);
    }

    @yfb
    public abstract String toDebugString(@yfb String str);
}
