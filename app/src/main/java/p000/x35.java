package p000;

import com.iflytek.aikit.core.AiHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class x35 {
    @ihi(markerClass = {rh5.class})
    @jjf(version = AiHelper.f24011i)
    public static final /* synthetic */ <T extends Enum<T>> v35<T> enumEntries() {
        throw new wfb(null, 1, 0 == true ? 1 : 0);
    }

    @jjf(version = "1.8")
    @yfb
    @yjd
    public static final <E extends Enum<E>> v35<E> enumEntries(@yfb ny6<E[]> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "entriesProvider");
        return new y35(ny6Var.invoke());
    }

    @jjf(version = "1.8")
    @yfb
    @yjd
    public static final <E extends Enum<E>> v35<E> enumEntries(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "entries");
        return new y35(eArr);
    }
}
