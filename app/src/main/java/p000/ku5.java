package p000;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class ku5 extends ju5 {
    @yfb
    public static final mt5 walk(@yfb File file, @yfb cu5 cu5Var) {
        md8.checkNotNullParameter(file, "<this>");
        md8.checkNotNullParameter(cu5Var, "direction");
        return new mt5(file, cu5Var);
    }

    public static /* synthetic */ mt5 walk$default(File file, cu5 cu5Var, int i, Object obj) {
        if ((i & 1) != 0) {
            cu5Var = cu5.f27617a;
        }
        return walk(file, cu5Var);
    }

    @yfb
    public static final mt5 walkBottomUp(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        return walk(file, cu5.f27618b);
    }

    @yfb
    public static final mt5 walkTopDown(@yfb File file) {
        md8.checkNotNullParameter(file, "<this>");
        return walk(file, cu5.f27617a);
    }
}
