package p000;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class s8f implements r2i<r8f> {

    /* JADX INFO: renamed from: a */
    public static final s8f f80953a = new s8f();

    /* JADX INFO: renamed from: b */
    public static final jm8.C7981a f80954b = jm8.C7981a.m14177of("c", "v", "i", "o");

    private s8f() {
    }

    @Override // p000.r2i
    public r8f parse(jm8 jm8Var, float f) throws IOException {
        if (jm8Var.peek() == jm8.EnumC7982b.BEGIN_ARRAY) {
            jm8Var.beginArray();
        }
        jm8Var.beginObject();
        List<PointF> listM26896c = null;
        List<PointF> listM26896c2 = null;
        List<PointF> listM26896c3 = null;
        boolean zNextBoolean = false;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f80954b);
            if (iSelectName == 0) {
                zNextBoolean = jm8Var.nextBoolean();
            } else if (iSelectName == 1) {
                listM26896c = zm8.m26896c(jm8Var, f);
            } else if (iSelectName == 2) {
                listM26896c2 = zm8.m26896c(jm8Var, f);
            } else if (iSelectName != 3) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                listM26896c3 = zm8.m26896c(jm8Var, f);
            }
        }
        jm8Var.endObject();
        if (jm8Var.peek() == jm8.EnumC7982b.END_ARRAY) {
            jm8Var.endArray();
        }
        if (listM26896c == null || listM26896c2 == null || listM26896c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listM26896c.isEmpty()) {
            return new r8f(new PointF(), false, Collections.emptyList());
        }
        int size = listM26896c.size();
        PointF pointF = listM26896c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = listM26896c.get(i);
            int i2 = i - 1;
            arrayList.add(new l93(awa.addPoints(listM26896c.get(i2), listM26896c3.get(i2)), awa.addPoints(pointF2, listM26896c2.get(i)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listM26896c.get(0);
            int i3 = size - 1;
            arrayList.add(new l93(awa.addPoints(listM26896c.get(i3), listM26896c3.get(i3)), awa.addPoints(pointF3, listM26896c2.get(0)), pointF3));
        }
        return new r8f(pointF, zNextBoolean, arrayList);
    }
}
