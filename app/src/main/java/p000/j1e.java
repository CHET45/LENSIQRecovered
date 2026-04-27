package p000;

import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
@c5e(28)
public final class j1e {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final j1e f49359a = new j1e();

    private j1e() {
    }

    @ih4
    public final int getAmbientShadowColor(@yfb RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    @ih4
    public final int getSpotShadowColor(@yfb RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    @ih4
    public final void setAmbientShadowColor(@yfb RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    @ih4
    public final void setSpotShadowColor(@yfb RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }
}
