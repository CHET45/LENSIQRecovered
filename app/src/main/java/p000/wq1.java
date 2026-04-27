package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class wq1 {

    /* JADX INFO: renamed from: wq1$a */
    public interface InterfaceC14743a {
        void run(@efb Canvas canvas);
    }

    private wq1() {
    }

    public static int saveLayerAlpha(@efb Canvas canvas, @hib RectF rectF, int i) {
        return canvas.saveLayerAlpha(rectF, i);
    }

    public static int saveLayerAlpha(@efb Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }
}
