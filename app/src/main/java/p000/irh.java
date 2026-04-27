package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.ove;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1863#2,2:66\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n60#1:66,2\n*E\n"})
@yjd
public class irh<R> extends ove<R> {

    /* JADX INFO: renamed from: m */
    @yfb
    public final List<ove<R>.C10668a> f48110m;

    public irh(@yfb e13 e13Var) {
        super(e13Var);
        this.f48110m = new ArrayList();
    }

    @yjd
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ <R> Object m13357b(irh<R> irhVar, zy2<? super R> zy2Var) {
        irhVar.shuffleAndRegisterClauses();
        return super.doSelect(zy2Var);
    }

    private final void shuffleAndRegisterClauses() {
        try {
            Collections.shuffle(this.f48110m);
            Iterator<T> it = this.f48110m.iterator();
            while (it.hasNext()) {
                ove.register$default(this, (ove.C10668a) it.next(), false, 1, null);
            }
        } finally {
            this.f48110m.clear();
        }
    }

    @Override // p000.ove
    @gib
    @yjd
    public Object doSelect(@yfb zy2<? super R> zy2Var) {
        return m13357b(this, zy2Var);
    }

    @Override // p000.ove, p000.fve
    public void invoke(@yfb hve hveVar, @yfb qy6<? super zy2<? super R>, ? extends Object> qy6Var) {
        this.f48110m.add(new ove.C10668a(hveVar.getClauseObject(), hveVar.getRegFunc(), hveVar.getProcessResFunc(), rve.getPARAM_CLAUSE_0(), qy6Var, hveVar.getOnCancellationConstructor()));
    }

    @Override // p000.ove, p000.fve
    public <Q> void invoke(@yfb jve<? extends Q> jveVar, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var) {
        this.f48110m.add(new ove.C10668a(jveVar.getClauseObject(), jveVar.getRegFunc(), jveVar.getProcessResFunc(), null, gz6Var, jveVar.getOnCancellationConstructor()));
    }

    @Override // p000.ove, p000.fve
    public <P, Q> void invoke(@yfb lve<? super P, ? extends Q> lveVar, P p, @yfb gz6<? super Q, ? super zy2<? super R>, ? extends Object> gz6Var) {
        this.f48110m.add(new ove.C10668a(lveVar.getClauseObject(), lveVar.getRegFunc(), lveVar.getProcessResFunc(), p, gz6Var, lveVar.getOnCancellationConstructor()));
    }
}
