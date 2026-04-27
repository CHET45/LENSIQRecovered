package p000;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr8 extends dq8 {

    /* JADX INFO: renamed from: E */
    public static final float f51603E = 20.0f;

    /* JADX INFO: renamed from: D */
    public int f51604D = dq8.f30366f;

    /* JADX INFO: renamed from: e */
    public abstract void mo13347e(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y);

    /* JADX INFO: renamed from: f */
    public abstract float mo13348f();

    /* JADX INFO: renamed from: g */
    public abstract float mo13349g();

    @Override // p000.dq8
    public void getAttributeNames(HashSet<String> attributes) {
    }

    public abstract boolean intersects(int layoutWidth, int layoutHeight, RectF start, RectF end, float x, float y);

    public abstract void positionAttributes(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value);
}
