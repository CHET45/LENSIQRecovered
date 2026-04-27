package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,158:1\n1#2:159\n33#3,6:160\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n154#1:160,6\n*E\n"})
public final class t2d {
    @yfb
    public static final h2d down(long j, long j2, float f, float f2, @gib List<ak7> list) {
        h2d h2dVar = new h2d(f2d.m28881constructorimpl(j), j2, mzb.Offset(f, f2), true, 1.0f, j2, mzb.Offset(f, f2), false, false, 0, 0L, 1536, (jt3) null);
        List<ak7> list2 = list;
        return (list2 == null || list2.isEmpty()) ? h2dVar : h2dVar.m29906copyOHpmEuE((731 & 1) != 0 ? h2dVar.f42120a : 0L, (731 & 2) != 0 ? h2dVar.f42121b : 0L, (731 & 4) != 0 ? h2dVar.f42122c : 0L, (731 & 8) != 0 ? h2dVar.f42123d : false, (731 & 16) != 0 ? h2dVar.f42125f : 0L, (731 & 32) != 0 ? h2dVar.f42126g : 0L, (731 & 64) != 0 ? h2dVar.f42127h : false, (731 & 128) != 0 ? h2dVar.f42128i : 0, list, (731 & 512) != 0 ? h2dVar.f42129j : 0L);
    }

    public static /* synthetic */ h2d down$default(long j, long j2, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        float f3 = (i & 4) != 0 ? 0.0f : f;
        float f4 = (i & 8) != 0 ? 0.0f : f2;
        if ((i & 16) != 0) {
            list = null;
        }
        return down(j, j3, f3, f4, list);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m32366invokeOverAllPassesH0pRuoY(@yfb kz6<? super t1d, ? super v1d, ? super r78, bth> kz6Var, @yfb t1d t1dVar, long j) {
        m32370invokeOverPasseshUlJWOE(kz6Var, t1dVar, (List<? extends v1d>) l82.listOf((Object[]) new v1d[]{v1d.Initial, v1d.Main, v1d.Final}), j);
    }

    /* JADX INFO: renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m32367invokeOverAllPassesH0pRuoY$default(kz6 kz6Var, t1d t1dVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = s78.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m32366invokeOverAllPassesH0pRuoY(kz6Var, t1dVar, j);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m32368invokeOverPasshUlJWOE(@yfb kz6<? super t1d, ? super v1d, ? super r78, bth> kz6Var, @yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        m32370invokeOverPasseshUlJWOE(kz6Var, t1dVar, (List<? extends v1d>) k82.listOf(v1dVar), j);
    }

    /* JADX INFO: renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m32369invokeOverPasshUlJWOE$default(kz6 kz6Var, t1d t1dVar, v1d v1dVar, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = s78.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m32368invokeOverPasshUlJWOE(kz6Var, t1dVar, v1dVar, j);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m32371invokeOverPasseshUlJWOE(@yfb kz6<? super t1d, ? super v1d, ? super r78, bth> kz6Var, @yfb t1d t1dVar, @yfb v1d[] v1dVarArr, long j) {
        m32370invokeOverPasseshUlJWOE(kz6Var, t1dVar, (List<? extends v1d>) e80.toList(v1dVarArr), j);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m32373invokeOverPasseshUlJWOE$default(kz6 kz6Var, t1d t1dVar, v1d[] v1dVarArr, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = s78.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m32371invokeOverPasseshUlJWOE((kz6<? super t1d, ? super v1d, ? super r78, bth>) kz6Var, t1dVar, v1dVarArr, j);
    }

    @yfb
    public static final h2d moveBy(@yfb h2d h2dVar, long j, float f, float f2) {
        long jM29909getIdJ3iCeTQ = h2dVar.m29909getIdJ3iCeTQ();
        long uptimeMillis = h2dVar.getUptimeMillis();
        boolean pressed = h2dVar.getPressed();
        return new h2d(jM29909getIdJ3iCeTQ, h2dVar.getUptimeMillis() + j, mzb.Offset(izb.m30429getXimpl(h2dVar.m29911getPositionF1C5BW0()) + f, izb.m30430getYimpl(h2dVar.m29911getPositionF1C5BW0()) + f2), true, 1.0f, uptimeMillis, h2dVar.m29911getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (jt3) null);
    }

    public static /* synthetic */ h2d moveBy$default(h2d h2dVar, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveBy(h2dVar, j, f, f2);
    }

    @yfb
    public static final h2d moveTo(@yfb h2d h2dVar, long j, float f, float f2) {
        long jM29909getIdJ3iCeTQ = h2dVar.m29909getIdJ3iCeTQ();
        long uptimeMillis = h2dVar.getUptimeMillis();
        boolean pressed = h2dVar.getPressed();
        return new h2d(jM29909getIdJ3iCeTQ, j, mzb.Offset(f, f2), true, 1.0f, uptimeMillis, h2dVar.m29911getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (jt3) null);
    }

    public static /* synthetic */ h2d moveTo$default(h2d h2dVar, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveTo(h2dVar, j, f, f2);
    }

    @yfb
    /* JADX INFO: renamed from: up */
    public static final h2d m22340up(@yfb h2d h2dVar, long j) {
        long jM29909getIdJ3iCeTQ = h2dVar.m29909getIdJ3iCeTQ();
        long uptimeMillis = h2dVar.getUptimeMillis();
        boolean pressed = h2dVar.getPressed();
        return new h2d(jM29909getIdJ3iCeTQ, j, h2dVar.m29911getPositionF1C5BW0(), false, 1.0f, uptimeMillis, h2dVar.m29911getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (jt3) null);
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m32370invokeOverPasseshUlJWOE(@yfb kz6<? super t1d, ? super v1d, ? super r78, bth> kz6Var, @yfb t1d t1dVar, @yfb List<? extends v1d> list, long j) {
        if (t1dVar.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kz6Var.invoke(t1dVar, list.get(i), r78.m32079boximpl(j));
        }
    }

    /* JADX INFO: renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m32372invokeOverPasseshUlJWOE$default(kz6 kz6Var, t1d t1dVar, List list, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = s78.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m32370invokeOverPasseshUlJWOE((kz6<? super t1d, ? super v1d, ? super r78, bth>) kz6Var, t1dVar, (List<? extends v1d>) list, j);
    }
}
