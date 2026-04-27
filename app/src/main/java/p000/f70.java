package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes3.dex */
public final class f70 implements lkb {

    /* JADX INFO: renamed from: a */
    public final Class<?> f35548a;

    /* JADX INFO: renamed from: b */
    public final lkb f35549b;

    public f70(Class<?> cls, lkb lkbVar) {
        this.f35548a = cls;
        this.f35549b = lkbVar;
    }

    @Override // p000.lkb
    public final void write(ph8 ph8Var, Object obj, Object obj2, Type type) throws IOException {
        i1f i1fVar = ph8Var.f70792b;
        if (obj == null) {
            if ((i1fVar.f45448c & a2f.WriteNullListAsEmpty.f216a) != 0) {
                i1fVar.write(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            } else {
                i1fVar.writeNull();
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            i1fVar.write(91);
            while (i < zArr.length) {
                if (i != 0) {
                    i1fVar.write(44);
                }
                i1fVar.write(zArr[i]);
                i++;
            }
            i1fVar.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            i1fVar.writeByteArray((byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            i1fVar.writeString(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length - 1;
            if (length == -1) {
                i1fVar.append((CharSequence) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            }
            i1fVar.write(91);
            while (i < length) {
                double d = dArr[i];
                if (Double.isNaN(d)) {
                    i1fVar.writeNull();
                } else {
                    i1fVar.append((CharSequence) Double.toString(d));
                }
                i1fVar.write(44);
                i++;
            }
            double d2 = dArr[length];
            if (Double.isNaN(d2)) {
                i1fVar.writeNull();
            } else {
                i1fVar.append((CharSequence) Double.toString(d2));
            }
            i1fVar.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length - 1;
            if (length2 == -1) {
                i1fVar.append((CharSequence) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            }
            i1fVar.write(91);
            while (i < length2) {
                float f = fArr[i];
                if (Float.isNaN(f)) {
                    i1fVar.writeNull();
                } else {
                    i1fVar.append((CharSequence) Float.toString(f));
                }
                i1fVar.write(44);
                i++;
            }
            float f2 = fArr[length2];
            if (Float.isNaN(f2)) {
                i1fVar.writeNull();
            } else {
                i1fVar.append((CharSequence) Float.toString(f2));
            }
            i1fVar.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            i1fVar.write(91);
            while (i < iArr.length) {
                if (i != 0) {
                    i1fVar.write(44);
                }
                i1fVar.writeInt(iArr[i]);
                i++;
            }
            i1fVar.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            i1fVar.write(91);
            while (i < jArr.length) {
                if (i != 0) {
                    i1fVar.write(44);
                }
                i1fVar.writeLong(jArr[i]);
                i++;
            }
            i1fVar.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            i1fVar.write(91);
            while (i < sArr.length) {
                if (i != 0) {
                    i1fVar.write(44);
                }
                i1fVar.writeInt(sArr[i]);
                i++;
            }
            i1fVar.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length3 = objArr.length;
        e0f e0fVar = ph8Var.f70803m;
        ph8Var.setContext(e0fVar, obj, obj2, 0);
        try {
            i1fVar.write(91);
            while (i < length3) {
                if (i != 0) {
                    i1fVar.write(44);
                }
                Object obj3 = objArr[i];
                if (obj3 == null) {
                    i1fVar.append((CharSequence) "null");
                } else if (obj3.getClass() == this.f35548a) {
                    this.f35549b.write(ph8Var, obj3, Integer.valueOf(i), null);
                } else {
                    ph8Var.f70791a.get(obj3.getClass()).write(ph8Var, obj3, Integer.valueOf(i), null);
                }
                i++;
            }
            i1fVar.write(93);
            ph8Var.f70803m = e0fVar;
        } catch (Throwable th) {
            ph8Var.f70803m = e0fVar;
            throw th;
        }
    }
}
