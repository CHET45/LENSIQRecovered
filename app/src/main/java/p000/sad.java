package p000;

import java.util.ArrayList;
import java.util.List;
import p000.rad;
import p000.zl2;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPressInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,99:1\n1223#2,6:100\n1223#2,6:106\n*S KotlinDebug\n*F\n+ 1 PressInteraction.kt\nandroidx/compose/foundation/interaction/PressInteractionKt\n*L\n85#1:100,6\n86#1:106,6\n*E\n"})
public final class sad {

    /* JADX INFO: renamed from: sad$a */
    @ck3(m4009c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", m4010f = "PressInteraction.kt", m4011i = {}, m4012l = {88}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C12500a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f81055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ q98 f81056b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z6b<Boolean> f81057c;

        /* JADX INFO: renamed from: sad$a$a */
        public static final class a<T> implements t66 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ List<rad.C11972b> f81058a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ z6b<Boolean> f81059b;

            public a(List<rad.C11972b> list, z6b<Boolean> z6bVar) {
                this.f81058a = list;
                this.f81059b = z6bVar;
            }

            @Override // p000.t66
            public /* bridge */ /* synthetic */ Object emit(Object obj, zy2 zy2Var) {
                return emit((p98) obj, (zy2<? super bth>) zy2Var);
            }

            @gib
            public final Object emit(@yfb p98 p98Var, @yfb zy2<? super bth> zy2Var) {
                if (p98Var instanceof rad.C11972b) {
                    this.f81058a.add(p98Var);
                } else if (p98Var instanceof rad.C11973c) {
                    this.f81058a.remove(((rad.C11973c) p98Var).getPress());
                } else if (p98Var instanceof rad.C11971a) {
                    this.f81058a.remove(((rad.C11971a) p98Var).getPress());
                }
                this.f81059b.setValue(wc1.boxBoolean(!this.f81058a.isEmpty()));
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12500a(q98 q98Var, z6b<Boolean> z6bVar, zy2<? super C12500a> zy2Var) {
            super(2, zy2Var);
            this.f81056b = q98Var;
            this.f81057c = z6bVar;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            return new C12500a(this.f81056b, this.f81057c, zy2Var);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
            return ((C12500a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f81055a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                y56<p98> interactions = this.f81056b.getInteractions();
                a aVar = new a(arrayList, this.f81057c);
                this.f81055a = 1;
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
    public static final i2g<Boolean> collectIsPressedAsState(@yfb q98 q98Var, @gib zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1692965168, i, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
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
            objRememberedValue2 = new C12500a(q98Var, z6bVar, null);
            zl2Var.updateRememberedValue(objRememberedValue2);
        }
        jx4.LaunchedEffect(q98Var, (gz6<? super x13, ? super zy2<? super bth>, ? extends Object>) objRememberedValue2, zl2Var, i2);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return z6bVar;
    }
}
