package p000;

import java.util.ArrayList;
import java.util.List;
import p000.rm6;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFocusInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInteraction.kt\nandroidx/compose/foundation/interaction/FocusInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,79:1\n1223#2,6:80\n1223#2,6:86\n*S KotlinDebug\n*F\n+ 1 FocusInteraction.kt\nandroidx/compose/foundation/interaction/FocusInteractionKt\n*L\n66#1:80,6\n67#1:86,6\n*E\n"})
public final class sm6 {

    /* JADX INFO: renamed from: sm6$a */
    @ck3(m4009c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", m4010f = "FocusInteraction.kt", m4011i = {}, m4012l = {69}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12656a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f82226a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ q98 f82227b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z6b<Boolean> f82228c;

        /* JADX INFO: renamed from: sm6$a$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<rm6.C12153a> f82229a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z6b<Boolean> f82230b;

            public a(List<rm6.C12153a> list, z6b<Boolean> z6bVar) {
                this.f82229a = list;
                this.f82230b = z6bVar;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit((p98) obj, (zy2<? super bth>) zy2Var);
            }

            @gib
            public final Object emit(@yfb p98 p98Var, @yfb zy2<? super bth> zy2Var) {
                if (p98Var instanceof rm6.C12153a) {
                    this.f82229a.add(p98Var);
                } else if (p98Var instanceof rm6.C12154b) {
                    this.f82229a.remove(((rm6.C12154b) p98Var).getFocus());
                }
                this.f82230b.setValue(wc1.boxBoolean(!this.f82229a.isEmpty()));
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12656a(q98 q98Var, z6b<Boolean> z6bVar, zy2<? super C12656a> zy2Var) {
            super(2, zy2Var);
            this.f82227b = q98Var;
            this.f82228c = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12656a(this.f82227b, this.f82228c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12656a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f82226a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                y56<p98> interactions = this.f82227b.getInteractions();
                a aVar = new a(arrayList, this.f82228c);
                this.f82226a = 1;
                if (interactions.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    @yfb
    @hk2
    public static final i2g<Boolean> collectIsFocusedAsState(@yfb q98 q98Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1805515472, i, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        zl2.C16170a c16170a = zl2.f105372a;
        if (objRememberedValue == c16170a.getEmpty()) {
            objRememberedValue = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        z6b z6bVar = (z6b) objRememberedValue;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && zl2Var.changed(q98Var)) || (i & 6) == 4;
        Object objRememberedValue2 = zl2Var.rememberedValue();
        if (z || objRememberedValue2 == c16170a.getEmpty()) {
            objRememberedValue2 = new C12656a(q98Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(q98Var, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue2, zl2Var, i2);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }
}
