package p000;

import java.util.List;
import java.util.Map;
import p000.sle;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class hg4 implements sle {

    /* JADX INFO: renamed from: c */
    public static final int f43410c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<bth> f43411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sle f43412b;

    public hg4(@yfb sle sleVar, @yfb ny6<bth> ny6Var) {
        this.f43411a = ny6Var;
        this.f43412b = sleVar;
    }

    @Override // p000.sle
    public boolean canBeSaved(@yfb Object obj) {
        return this.f43412b.canBeSaved(obj);
    }

    @Override // p000.sle
    @gib
    public Object consumeRestored(@yfb String str) {
        return this.f43412b.consumeRestored(str);
    }

    public final void dispose() {
        this.f43411a.invoke();
    }

    @Override // p000.sle
    @yfb
    public Map<String, List<Object>> performSave() {
        return this.f43412b.performSave();
    }

    @Override // p000.sle
    @yfb
    public sle.InterfaceC12651a registerProvider(@yfb String str, @yfb ny6<? extends Object> ny6Var) {
        return this.f43412b.registerProvider(str, ny6Var);
    }
}
