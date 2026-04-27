package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class nb2 {

    /* JADX INFO: renamed from: a */
    public static final int f63853a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f63854b = 2;

    /* JADX INFO: renamed from: c */
    public static final int f63855c = 3;

    /* JADX INFO: renamed from: d */
    public static final int f63856d = 6;

    /* JADX INFO: renamed from: e */
    public static final int f63857e = 11;

    /* JADX INFO: renamed from: f */
    public static final int f63858f = 255;

    /* JADX INFO: renamed from: g */
    public static final int f63859g = 225;

    /* JADX INFO: renamed from: h */
    public static final int f63860h = 226;

    /* JADX INFO: renamed from: i */
    public static final int f63861i = 227;

    /* JADX INFO: renamed from: j */
    public static final int f63862j = 228;

    /* JADX INFO: renamed from: k */
    public static final int f63863k = 229;

    /* JADX INFO: renamed from: l */
    public static final int f63864l = 230;

    /* JADX INFO: renamed from: m */
    public static final int f63865m = 231;

    /* JADX INFO: renamed from: n */
    public static final int f63866n = 232;

    /* JADX INFO: renamed from: o */
    public static final int f63867o = 209;

    /* JADX INFO: renamed from: p */
    public static final int f63868p = 212;

    /* JADX INFO: renamed from: q */
    public static final int f63869q = 240;

    /* JADX INFO: renamed from: r */
    public static final int f63870r = 194;

    /* JADX INFO: renamed from: s */
    public static final int f63871s = 195;

    /* JADX INFO: renamed from: t */
    public static final int f63872t = 196;

    /* JADX INFO: renamed from: u */
    public static Map<Integer, rp7> f63873u;

    public static Map<Integer, rp7> getValidCommandList() {
        Map<Integer, rp7> map = f63873u;
        if (map == null || map.size() == 0) {
            HashMap map2 = new HashMap();
            f63873u = map2;
            map2.put(1, new sf3());
            f63873u.put(2, new b57());
            f63873u.put(3, new d57());
            f63873u.put(6, new ce4());
            f63873u.put(11, new rhb());
            f63873u.put(225, new w7c());
            f63873u.put(Integer.valueOf(f63860h), new w7c());
            f63873u.put(Integer.valueOf(f63861i), new w7c());
            f63873u.put(Integer.valueOf(f63862j), new w7c());
            f63873u.put(Integer.valueOf(f63863k), new w7c());
            f63873u.put(Integer.valueOf(f63864l), new w7c());
            f63873u.put(231, new w7c());
            f63873u.put(Integer.valueOf(f63866n), new w7c());
            f63873u.put(209, new m7f());
            f63873u.put(Integer.valueOf(f63868p), new f47());
            f63873u.put(240, new iqd());
            f63873u.put(255, new rc3());
            f63873u.put(Integer.valueOf(f63870r), new clh());
            f63873u.put(Integer.valueOf(f63871s), new clh());
            f63873u.put(Integer.valueOf(f63872t), new clh());
        }
        return f63873u;
    }

    public static boolean isValidCmd(int i) {
        return getValidCommandList().containsKey(Integer.valueOf(i));
    }
}
