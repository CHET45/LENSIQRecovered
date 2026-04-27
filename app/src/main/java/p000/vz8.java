package p000;

import androidx.compose.foundation.lazy.layout.C0663e;

/* JADX INFO: loaded from: classes.dex */
@f0g
@ah5
public interface vz8 {
    @hk2
    void Item(int i, @yfb Object obj, @gib zl2 zl2Var, int i2);

    @gib
    default Object getContentType(int i) {
        return null;
    }

    default int getIndex(@yfb Object obj) {
        return -1;
    }

    int getItemCount();

    @yfb
    default Object getKey(int i) {
        return C0663e.getDefaultLazyLayoutKey(i);
    }
}
