package p000;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.jm8;

/* JADX INFO: loaded from: classes3.dex */
public class zm8 {

    /* JADX INFO: renamed from: a */
    public static final jm8.C7981a f105476a = jm8.C7981a.m14177of("x", "y");

    /* JADX INFO: renamed from: zm8$a */
    public static /* synthetic */ class C16186a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105477a;

        static {
            int[] iArr = new int[jm8.EnumC7982b.values().length];
            f105477a = iArr;
            try {
                iArr[jm8.EnumC7982b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105477a[jm8.EnumC7982b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105477a[jm8.EnumC7982b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private zm8() {
    }

    @g92
    /* JADX INFO: renamed from: a */
    public static int m26894a(jm8 jm8Var) throws IOException {
        jm8Var.beginArray();
        int iNextDouble = (int) (jm8Var.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jm8Var.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jm8Var.nextDouble() * 255.0d);
        while (jm8Var.hasNext()) {
            jm8Var.skipValue();
        }
        jm8Var.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m26895b(jm8 jm8Var, float f) throws IOException {
        int i = C16186a.f105477a[jm8Var.peek().ordinal()];
        if (i == 1) {
            return jsonNumbersToPoint(jm8Var, f);
        }
        if (i == 2) {
            return jsonArrayToPoint(jm8Var, f);
        }
        if (i == 3) {
            return jsonObjectToPoint(jm8Var, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jm8Var.peek());
    }

    /* JADX INFO: renamed from: c */
    public static List<PointF> m26896c(jm8 jm8Var, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jm8Var.beginArray();
        while (jm8Var.peek() == jm8.EnumC7982b.BEGIN_ARRAY) {
            jm8Var.beginArray();
            arrayList.add(m26895b(jm8Var, f));
            jm8Var.endArray();
        }
        jm8Var.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m26897d(jm8 jm8Var) throws IOException {
        jm8.EnumC7982b enumC7982bPeek = jm8Var.peek();
        int i = C16186a.f105477a[enumC7982bPeek.ordinal()];
        if (i == 1) {
            return (float) jm8Var.nextDouble();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + enumC7982bPeek);
        }
        jm8Var.beginArray();
        float fNextDouble = (float) jm8Var.nextDouble();
        while (jm8Var.hasNext()) {
            jm8Var.skipValue();
        }
        jm8Var.endArray();
        return fNextDouble;
    }

    private static PointF jsonArrayToPoint(jm8 jm8Var, float f) throws IOException {
        jm8Var.beginArray();
        float fNextDouble = (float) jm8Var.nextDouble();
        float fNextDouble2 = (float) jm8Var.nextDouble();
        while (jm8Var.peek() != jm8.EnumC7982b.END_ARRAY) {
            jm8Var.skipValue();
        }
        jm8Var.endArray();
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF jsonNumbersToPoint(jm8 jm8Var, float f) throws IOException {
        float fNextDouble = (float) jm8Var.nextDouble();
        float fNextDouble2 = (float) jm8Var.nextDouble();
        while (jm8Var.hasNext()) {
            jm8Var.skipValue();
        }
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF jsonObjectToPoint(jm8 jm8Var, float f) throws IOException {
        jm8Var.beginObject();
        float fM26897d = 0.0f;
        float fM26897d2 = 0.0f;
        while (jm8Var.hasNext()) {
            int iSelectName = jm8Var.selectName(f105476a);
            if (iSelectName == 0) {
                fM26897d = m26897d(jm8Var);
            } else if (iSelectName != 1) {
                jm8Var.skipName();
                jm8Var.skipValue();
            } else {
                fM26897d2 = m26897d(jm8Var);
            }
        }
        jm8Var.endObject();
        return new PointF(fM26897d * f, fM26897d2 * f);
    }
}
