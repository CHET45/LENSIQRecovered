package p000;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class gq8 {

    /* JADX INFO: renamed from: a */
    public HashMap<Object, HashMap<String, float[]>> f40793a = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.f40793a.containsKey(obj) && (map = this.f40793a.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i, float f) {
        if (!this.f40793a.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i + 1];
            fArr[i] = f;
            map.put(str, fArr);
            this.f40793a.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.f40793a.get(obj);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i + 1];
            fArr2[i] = f;
            map2.put(str, fArr2);
            this.f40793a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i + 1);
        }
        fArrCopyOf[i] = f;
        map2.put(str, fArrCopyOf);
    }
}
