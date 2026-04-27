package p000;

import p000.e13;
import p000.fza;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,444:1\n76#2:445\n109#2,2:446\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n442#1:445\n442#1:446,2\n*E\n"})
public final class gza implements fza {

    /* JADX INFO: renamed from: a */
    @yfb
    public final b5b f41859a = pbd.mutableFloatStateOf(1.0f);

    @Override // p000.e13.InterfaceC5040b, p000.e13
    public <R> R fold(R r, @yfb gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
        return (R) fza.C6039a.fold(this, r, gz6Var);
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @gib
    public <E extends e13.InterfaceC5040b> E get(@yfb e13.InterfaceC5041c<E> interfaceC5041c) {
        return (E) fza.C6039a.get(this, interfaceC5041c);
    }

    @Override // p000.fza
    public float getScaleFactor() {
        return this.f41859a.getFloatValue();
    }

    @Override // p000.e13.InterfaceC5040b, p000.e13
    @yfb
    public e13 minusKey(@yfb e13.InterfaceC5041c<?> interfaceC5041c) {
        return fza.C6039a.minusKey(this, interfaceC5041c);
    }

    @Override // p000.e13
    @yfb
    public e13 plus(@yfb e13 e13Var) {
        return fza.C6039a.plus(this, e13Var);
    }

    public void setScaleFactor(float f) {
        this.f41859a.setFloatValue(f);
    }
}
