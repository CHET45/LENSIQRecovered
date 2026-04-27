package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class s09 extends qz8<r09> implements h19 {

    /* JADX INFO: renamed from: d */
    public static final int f80273d = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final n5b<r09> f80274b = new n5b<>();

    /* JADX INFO: renamed from: c */
    @gib
    public List<Integer> f80275c;

    /* JADX INFO: renamed from: s09$a */
    public static final class C12383a extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f80276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12383a(Object obj) {
            super(1);
            this.f80276a = obj;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @yfb
        public final Object invoke(int i) {
            return this.f80276a;
        }
    }

    /* JADX INFO: renamed from: s09$b */
    public static final class C12384b extends tt8 implements qy6<Integer, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f80277a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12384b(Object obj) {
            super(1);
            this.f80277a = obj;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        @gib
        public final Object invoke(int i) {
            return this.f80277a;
        }
    }

    /* JADX INFO: renamed from: s09$c */
    public static final class C12385c extends tt8 implements oz6<fz8, Integer, zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kz6<fz8, zl2, Integer, bth> f80278a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C12385c(kz6<? super fz8, ? super zl2, ? super Integer, bth> kz6Var) {
            super(4);
            this.f80278a = kz6Var;
        }

        @Override // p000.oz6
        public /* bridge */ /* synthetic */ bth invoke(fz8 fz8Var, Integer num, zl2 zl2Var, Integer num2) {
            invoke(fz8Var, num.intValue(), zl2Var, num2.intValue());
            return bth.f14751a;
        }

        @hk2
        public final void invoke(@yfb fz8 fz8Var, int i, @gib zl2 zl2Var, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= zl2Var.changed(fz8Var) ? 4 : 2;
            }
            if ((i2 & 131) == 130 && zl2Var.getSkipping()) {
                zl2Var.skipToGroupEnd();
                return;
            }
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1010194746, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f80278a.invoke(fz8Var, zl2Var, Integer.valueOf(i2 & 14));
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
        }
    }

    public s09(@yfb qy6<? super h19, bth> qy6Var) {
        qy6Var.invoke(this);
    }

    @yfb
    public final List<Integer> getHeaderIndexes() {
        List<Integer> list = this.f80275c;
        return list == null ? l82.emptyList() : list;
    }

    @Override // p000.h19
    public void item(@gib Object obj, @gib Object obj2, @yfb kz6<? super fz8, ? super zl2, ? super Integer, bth> kz6Var) {
        getIntervals().addInterval(1, new r09(obj != null ? new C12383a(obj) : null, new C12384b(obj2), mk2.composableLambdaInstance(-1010194746, true, new C12385c(kz6Var))));
    }

    @Override // p000.h19
    public void items(int i, @gib qy6<? super Integer, ? extends Object> qy6Var, @yfb qy6<? super Integer, ? extends Object> qy6Var2, @yfb oz6<? super fz8, ? super Integer, ? super zl2, ? super Integer, bth> oz6Var) {
        getIntervals().addInterval(i, new r09(qy6Var, qy6Var2, oz6Var));
    }

    @Override // p000.h19
    @ah5
    public void stickyHeader(@gib Object obj, @gib Object obj2, @yfb kz6<? super fz8, ? super zl2, ? super Integer, bth> kz6Var) {
        List arrayList = this.f80275c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f80275c = arrayList;
        }
        arrayList.add(Integer.valueOf(getIntervals().getSize()));
        item(obj, obj2, kz6Var);
    }

    @Override // p000.qz8
    @yfb
    public n5b<r09> getIntervals() {
        return this.f80274b;
    }
}
