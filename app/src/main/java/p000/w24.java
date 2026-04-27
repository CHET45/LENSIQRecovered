package p000;

import androidx.lifecycle.C1137f0;

/* JADX INFO: loaded from: classes3.dex */
public final class w24 implements C1137f0.c {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final w24 f93124b = new w24();

    private w24() {
    }

    @Override // androidx.lifecycle.C1137f0.c
    @yfb
    public <T extends cai> T create(@yfb oo8<T> oo8Var, @yfb k63 k63Var) {
        md8.checkNotNullParameter(oo8Var, "modelClass");
        md8.checkNotNullParameter(k63Var, "extras");
        return (T) ho8.f44404a.createViewModel(hn8.getJavaClass((oo8) oo8Var));
    }
}
