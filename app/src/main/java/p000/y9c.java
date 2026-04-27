package p000;

import androidx.compose.p002ui.graphics.C0737d;

/* JADX INFO: loaded from: classes.dex */
public interface y9c {
    void destroy();

    void drawLayer(@yfb vq1 vq1Var, @gib u97 u97Var);

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    void mo27753inverseTransform58bKbWc(@yfb float[] fArr);

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    boolean mo27754isInLayerk4lQ0M(long j);

    void mapBounds(@yfb q6b q6bVar, boolean z);

    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    long mo27755mapOffset8S9VItk(long j, boolean z);

    /* JADX INFO: renamed from: move--gyyYBs */
    void mo27756movegyyYBs(long j);

    /* JADX INFO: renamed from: resize-ozmzZPI */
    void mo27757resizeozmzZPI(long j);

    void reuseLayer(@yfb gz6<? super vq1, ? super u97, bth> gz6Var, @yfb ny6<bth> ny6Var);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo27758transform58bKbWc(@yfb float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(@yfb C0737d c0737d);
}
