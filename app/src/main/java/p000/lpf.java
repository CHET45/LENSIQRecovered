package p000;

import androidx.mediarouter.media.C1340j;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n1223#2,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:112,6\n*E\n"})
public final class lpf {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final mzf<w82> f58430a = C11760qy.spring$default(0.0f, 0.0f, null, 7, null);

    @yfb
    /* JADX INFO: renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final C13257tw<w82, C15879yy> m30880Animatable8_81llA(long j) {
        return new C13257tw<>(w82.m32941boximpl(j), za2.getVectorConverter(w82.f93556b).invoke(w82.m32955getColorSpaceimpl(j)), null, null, 12, null);
    }

    @hk2
    @q64(level = u64.f86867c, message = "animate*AsState APIs now have a new label parameter added.")
    /* JADX INFO: renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ i2g m30881animateColorAsStateKTwxG1Y(long j, InterfaceC11178py interfaceC11178py, qy6 qy6Var, zl2 zl2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC11178py = f58430a;
        }
        InterfaceC11178py interfaceC11178py2 = interfaceC11178py;
        if ((i2 & 4) != 0) {
            qy6Var = null;
        }
        qy6 qy6Var2 = qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-1942442407, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:79)");
        }
        i2g<w82> i2gVarM30882animateColorAsStateeuL9pac = m30882animateColorAsStateeuL9pac(j, interfaceC11178py2, null, qy6Var2, zl2Var, (i & 126) | ((i << 3) & 7168), 4);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarM30882animateColorAsStateeuL9pac;
    }

    @yfb
    @hk2
    /* JADX INFO: renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final i2g<w82> m30882animateColorAsStateeuL9pac(long j, @gib InterfaceC11178py<w82> interfaceC11178py, @gib String str, @gib qy6<? super w82, bth> qy6Var, @gib zl2 zl2Var, int i, int i2) {
        InterfaceC11178py<w82> interfaceC11178py2 = (i2 & 2) != 0 ? f58430a : interfaceC11178py;
        String str2 = (i2 & 4) != 0 ? "ColorAnimation" : str;
        qy6<? super w82, bth> qy6Var2 = (i2 & 8) != 0 ? null : qy6Var;
        if (gm2.isTraceInProgress()) {
            gm2.traceEventStart(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean zChanged = zl2Var.changed(w82.m32955getColorSpaceimpl(j));
        Object objRememberedValue = zl2Var.rememberedValue();
        if (zChanged || objRememberedValue == zl2.f105372a.getEmpty()) {
            objRememberedValue = (alh) za2.getVectorConverter(w82.f93556b).invoke(w82.m32955getColorSpaceimpl(j));
            zl2Var.updateRememberedValue(objRememberedValue);
        }
        int i3 = i << 6;
        i2g<w82> i2gVarAnimateValueAsState = C11168px.animateValueAsState(w82.m32941boximpl(j), (alh) objRememberedValue, interfaceC11178py2, null, str2, qy6Var2, zl2Var, (i & 14) | ((i << 3) & C1340j.f10444b) | (57344 & i3) | (i3 & 458752), 8);
        if (gm2.isTraceInProgress()) {
            gm2.traceEventEnd();
        }
        return i2gVarAnimateValueAsState;
    }
}
