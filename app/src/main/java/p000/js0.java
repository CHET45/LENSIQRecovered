package p000;

import android.util.SparseIntArray;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class js0<T> {

    /* JADX INFO: renamed from: a */
    public boolean f51646a;

    /* JADX INFO: renamed from: b */
    public boolean f51647b;

    /* JADX INFO: renamed from: c */
    public SparseIntArray f51648c;

    public js0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void checkMode(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Don't mess two register mode");
        }
    }

    private final void registerItemType(int i, @uw8 int i2) {
        this.f51648c.put(i, i2);
    }

    @yfb
    public final js0<T> addItemType(int i, @uw8 int i2) {
        this.f51647b = true;
        checkMode(this.f51646a);
        registerItemType(i, i2);
        return this;
    }

    @yfb
    public final js0<T> addItemTypeAutoIncrease(@uw8 @yfb int... iArr) {
        md8.checkParameterIsNotNull(iArr, "layoutResIds");
        this.f51646a = true;
        checkMode(this.f51647b);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            registerItemType(i, iArr[i]);
        }
        return this;
    }

    public abstract int getItemType(@yfb List<? extends T> list, int i);

    public final int getLayoutId(int i) {
        int i2 = this.f51648c.get(i);
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(("ViewType: " + i + " found layoutResId，please use registerItemType() first!").toString());
    }

    public js0(@yfb SparseIntArray sparseIntArray) {
        md8.checkParameterIsNotNull(sparseIntArray, "layouts");
        this.f51648c = sparseIntArray;
    }

    public /* synthetic */ js0(SparseIntArray sparseIntArray, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? new SparseIntArray() : sparseIntArray);
    }
}
