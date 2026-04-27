package p000;

import androidx.mediarouter.media.C1340j;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import p000.yeh;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n1223#2,6:125\n1223#2,6:138\n1882#3,7:131\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125,6\n103#1:138,6\n74#1:131,7\n*E\n"})
public final class hfh {

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: hfh$a */
    @dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$1\n*L\n1#1,124:1\n*E\n"})
    public static final class C6838a<S> extends tt8 implements kz6<yeh.InterfaceC15636b<S>, zl2, Integer, mzf<w82>> {

        /* JADX INFO: renamed from: a */
        public static final C6838a f43400a = new C6838a();

        public C6838a() {
            super(3);
        }

        @yfb
        @hk2
        public final mzf<w82> invoke(@yfb yeh.InterfaceC15636b<S> interfaceC15636b, @gib zl2 zl2Var, int i) {
            zl2Var.startReplaceGroup(-1457805428);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventStart(-1457805428, i, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
            }
            mzf<w82> mzfVarSpring$default = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);
            if (gm2.isTraceInProgress()) {
                gm2.traceEventEnd();
            }
            zl2Var.endReplaceGroup();
            return mzfVarSpring$default;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ mzf<w82> invoke(Object obj, zl2 zl2Var, Integer num) {
            return invoke((yeh.InterfaceC15636b) obj, zl2Var, num.intValue());
        }
    }

    @yfb
    @hk2
    @ik2(scheme = "[0[0][0]]")
    public static final <S> i2g<w82> animateColor(@yfb yeh<S> yehVar, @gib kz6<? super yeh.InterfaceC15636b<S>, ? super zl2, ? super Integer, ? extends fw5<w82>> kz6Var, @gib String str, @yfb kz6<? super S, ? super zl2, ? super Integer, w82> kz6Var2, @gib zl2 zl2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            kz6Var = C6838a.f43400a;
        }
        if ((i2 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ia2 ia2VarM32955getColorSpaceimpl = w82.m32955getColorSpaceimpl(kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf((i >> 6) & 112)).m32961unboximpl());
        boolean zChanged = zl2Var.changed(ia2VarM32955getColorSpaceimpl);
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = (alh) za2.getVectorConverter(w82.f93556b).invoke(ia2VarM32955getColorSpaceimpl);
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        alh alhVar = (alh) objRememberedValue;
        int i3 = i & 14;
        int i4 = i << 3;
        int i5 = i3 | (i4 & C1340j.f10444b) | (i4 & 7168) | (i4 & 57344);
        int i6 = (i5 >> 9) & 112;
        return ffh.createTransitionAnimation(yehVar, kz6Var2.invoke(yehVar.getCurrentState(), zl2Var, Integer.valueOf(i6)), kz6Var2.invoke(yehVar.getTargetState(), zl2Var, Integer.valueOf(i6)), kz6Var.invoke(yehVar.getSegment(), zl2Var, Integer.valueOf((i5 >> 3) & 112)), alhVar, str2, zl2Var, (i5 & 14) | ((i5 << 6) & 458752));
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final i2g<w82> m30050animateColorDTcfvLk(@yfb g18 g18Var, long j, long j2, @yfb f18<w82> f18Var, @gib String str, @gib zl2 zl2Var, int i, int i2) {
        String str2 = (i2 & 8) != 0 ? "ColorAnimation" : str;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1901963533, i, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        Object objRememberedValue = zl2Var.rememberedValue();
        if (objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = (alh) za2.getVectorConverter(w82.f93556b).invoke(w82.m32955getColorSpaceimpl(j2));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        int i3 = i << 3;
        i2g<w82> i2gVarAnimateValue = h18.animateValue(g18Var, w82.m32941boximpl(j), w82.m32941boximpl(j2), (alh) objRememberedValue, f18Var, str2, zl2Var, g18.f38219f | (i & 14) | (i & 112) | (i & C1340j.f10444b) | (f18.f34663d << 12) | (57344 & i3) | (i3 & 458752), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValue;
    }

    @hk2
    @q64(level = u64.f86867c, message = "animateColor APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ i2g m30051animateColorRIQooxk(g18 g18Var, long j, long j2, f18 f18Var, zl2 zl2Var, int i) {
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(1400583834, i, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        i2g<w82> i2gVarM30050animateColorDTcfvLk = m30050animateColorDTcfvLk(g18Var, j, j2, f18Var, "ColorAnimation", zl2Var, g18.f38219f | CpioConstants.C_ISBLK | (i & 14) | (i & 112) | (i & C1340j.f10444b) | (f18.f34663d << 9) | (i & 7168), 0);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarM30050animateColorDTcfvLk;
    }
}
