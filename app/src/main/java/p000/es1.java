package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p000.obe;

/* JADX INFO: loaded from: classes.dex */
@c5e(17)
public class es1 extends gs1 {

    /* JADX INFO: renamed from: es1$a */
    public class C5455a implements obe.InterfaceC10290a {
        public C5455a() {
        }

        @Override // p000.obe.InterfaceC10290a
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // p000.gs1, p000.js1
    public void initStatic() {
        obe.f67078s = new C5455a();
    }
}
