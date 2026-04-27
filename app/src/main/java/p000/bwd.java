package p000;

import android.view.View;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
public interface bwd extends u4c {
    boolean autoOpen(int i, float f, boolean z);

    @efb
    jyf getSpinnerStyle();

    @efb
    View getView();

    boolean isSupportHorizontalDrag();

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    int onFinish(@efb hwd hwdVar, boolean z);

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    void onHorizontalDrag(float f, int i, int i2);

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    void onInitialized(@efb gwd gwdVar, int i, int i2);

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    void onMoving(boolean z, float f, int i, int i2, int i3);

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    void onReleased(@efb hwd hwdVar, int i, int i2);

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    void onStartAnimator(@efb hwd hwdVar, int i, int i2);

    @p7e({p7e.EnumC10826a.f69934a, p7e.EnumC10826a.f69935b, p7e.EnumC10826a.f69939f})
    void setPrimaryColors(@g92 int... iArr);
}
