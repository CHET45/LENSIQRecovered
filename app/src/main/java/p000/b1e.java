package p000;

import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class b1e {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final b1e f12417a = new b1e();

    private b1e() {
    }

    @ih4
    public final void setRenderEffect(@yfb RenderNode renderNode, @gib ozd ozdVar) {
        renderNode.setRenderEffect(ozdVar != null ? ozdVar.asAndroidRenderEffect() : null);
    }
}
