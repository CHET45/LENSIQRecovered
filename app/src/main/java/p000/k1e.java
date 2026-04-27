package p000;

import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class k1e {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final k1e f52387a = new k1e();

    private k1e() {
    }

    @ih4
    public final void setRenderEffect(@yfb RenderNode renderNode, @gib ozd ozdVar) {
        renderNode.setRenderEffect(ozdVar != null ? ozdVar.asAndroidRenderEffect() : null);
    }
}
