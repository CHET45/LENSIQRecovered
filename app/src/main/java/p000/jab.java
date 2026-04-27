package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class jab implements hab {

    /* JADX INFO: renamed from: d */
    public static final int f50110d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final View f50111a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final sab f50112b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final int[] f50113c;

    public jab(@yfb View view) {
        this.f50111a = view;
        sab sabVar = new sab(view);
        sabVar.setNestedScrollingEnabled(true);
        this.f50112b = sabVar;
        this.f50113c = new int[2];
        o8i.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.f50112b.hasNestedScrollingParent(0)) {
            this.f50112b.stopNestedScroll(0);
        }
        if (this.f50112b.hasNestedScrollingParent(1)) {
            this.f50112b.stopNestedScroll(1);
        }
    }

    @Override // p000.hab
    @gib
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo29969onPostFlingRZ2iAVY(long j, long j2, @yfb zy2<? super i4i> zy2Var) {
        if (!this.f50112b.dispatchNestedFling(kab.toViewVelocity(i4i.m30157getXimpl(j2)), kab.toViewVelocity(i4i.m30158getYimpl(j2)), true)) {
            j2 = i4i.f45754b.m30168getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return i4i.m30148boximpl(j2);
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo29970onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.f50112b.startNestedScroll(kab.m30654getScrollAxesk4lQ0M(j2), kab.m30656toViewTypeGyEprt8(i))) {
            return izb.f49009b.m30445getZeroF1C5BW0();
        }
        u70.fill$default(this.f50113c, 0, 0, 0, 6, (Object) null);
        this.f50112b.dispatchNestedScroll(kab.composeToViewOffset(izb.m30429getXimpl(j)), kab.composeToViewOffset(izb.m30430getYimpl(j)), kab.composeToViewOffset(izb.m30429getXimpl(j2)), kab.composeToViewOffset(izb.m30430getYimpl(j2)), null, kab.m30656toViewTypeGyEprt8(i), this.f50113c);
        return kab.m30655toOffsetUv8p0NA(this.f50113c, j2);
    }

    @Override // p000.hab
    @gib
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo29971onPreFlingQWom1Mo(long j, @yfb zy2<? super i4i> zy2Var) {
        if (!this.f50112b.dispatchNestedPreFling(kab.toViewVelocity(i4i.m30157getXimpl(j)), kab.toViewVelocity(i4i.m30158getYimpl(j)))) {
            j = i4i.f45754b.m30168getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return i4i.m30148boximpl(j);
    }

    @Override // p000.hab
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo29972onPreScrollOzD1aCk(long j, int i) {
        if (!this.f50112b.startNestedScroll(kab.m30654getScrollAxesk4lQ0M(j), kab.m30656toViewTypeGyEprt8(i))) {
            return izb.f49009b.m30445getZeroF1C5BW0();
        }
        u70.fill$default(this.f50113c, 0, 0, 0, 6, (Object) null);
        this.f50112b.dispatchNestedPreScroll(kab.composeToViewOffset(izb.m30429getXimpl(j)), kab.composeToViewOffset(izb.m30430getYimpl(j)), this.f50113c, null, kab.m30656toViewTypeGyEprt8(i));
        return kab.m30655toOffsetUv8p0NA(this.f50113c, j);
    }
}
