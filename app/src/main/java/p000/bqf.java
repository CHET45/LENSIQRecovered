package p000;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public class bqf implements zp9 {

    /* JADX INFO: renamed from: d */
    public static final int f14500d = 8;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f14501e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f14502f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f14503g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f14504h;

    /* JADX INFO: renamed from: i */
    public static final Bitmap.Config[] f14505i;

    /* JADX INFO: renamed from: a */
    public final C2005c f14506a = new C2005c();

    /* JADX INFO: renamed from: b */
    public final tb7<C2004b, Bitmap> f14507b = new tb7<>();

    /* JADX INFO: renamed from: c */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f14508c = new HashMap();

    /* JADX INFO: renamed from: bqf$a */
    public static /* synthetic */ class C2003a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14509a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f14509a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14509a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14509a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14509a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: bqf$c */
    @fdi
    public static class C2005c extends mr0<C2004b> {
        @Override // p000.mr0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C2004b mo3348a() {
            return new C2004b(this);
        }

        public C2004b get(int i, Bitmap.Config config) {
            C2004b c2004bM17523b = m17523b();
            c2004bM17523b.init(i, config);
            return c2004bM17523b;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f14501e = configArr;
        f14502f = configArr;
        f14503g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f14504h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f14505i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: a */
    public static String m3347a(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + c0b.f15434d;
    }

    private void decrementBitmapOfSize(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> sizesForConfig = getSizesForConfig(bitmap.getConfig());
        Integer num2 = sizesForConfig.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                sizesForConfig.remove(num);
                return;
            } else {
                sizesForConfig.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + logBitmap(bitmap) + ", this: " + this);
    }

    private C2004b findBestKey(int i, Bitmap.Config config) {
        C2004b c2004b = this.f14506a.get(i, config);
        for (Bitmap.Config config2 : getInConfigs(config)) {
            Integer numCeilingKey = getSizesForConfig(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return c2004b;
                        }
                    } else if (config2.equals(config)) {
                        return c2004b;
                    }
                }
                this.f14506a.offer(c2004b);
                return this.f14506a.get(numCeilingKey.intValue(), config2);
            }
        }
        return c2004b;
    }

    private static Bitmap.Config[] getInConfigs(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f14502f;
        }
        int i = C2003a.f14509a[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : f14505i : f14504h : f14503g : f14501e;
    }

    private NavigableMap<Integer, Integer> getSizesForConfig(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f14508c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f14508c.put(config, treeMap);
        return treeMap;
    }

    @Override // p000.zp9
    @hib
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        C2004b c2004bFindBestKey = findBestKey(v0i.getBitmapByteSize(i, i2, config), config);
        Bitmap bitmap = this.f14507b.get(c2004bFindBestKey);
        if (bitmap != null) {
            decrementBitmapOfSize(Integer.valueOf(c2004bFindBestKey.f14511b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    @Override // p000.zp9
    public int getSize(Bitmap bitmap) {
        return v0i.getBitmapByteSize(bitmap);
    }

    @Override // p000.zp9
    public String logBitmap(Bitmap bitmap) {
        return m3347a(v0i.getBitmapByteSize(bitmap), bitmap.getConfig());
    }

    @Override // p000.zp9
    public void put(Bitmap bitmap) {
        C2004b c2004b = this.f14506a.get(v0i.getBitmapByteSize(bitmap), bitmap.getConfig());
        this.f14507b.put(c2004b, bitmap);
        NavigableMap<Integer, Integer> sizesForConfig = getSizesForConfig(bitmap.getConfig());
        Integer num = sizesForConfig.get(Integer.valueOf(c2004b.f14511b));
        sizesForConfig.put(Integer.valueOf(c2004b.f14511b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p000.zp9
    @hib
    public Bitmap removeLast() {
        Bitmap bitmapRemoveLast = this.f14507b.removeLast();
        if (bitmapRemoveLast != null) {
            decrementBitmapOfSize(Integer.valueOf(v0i.getBitmapByteSize(bitmapRemoveLast)), bitmapRemoveLast);
        }
        return bitmapRemoveLast;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f14507b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f14508c.entrySet()) {
            sb.append(entry.getKey());
            sb.append(C4584d2.f28242k);
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f14508c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: bqf$b */
    @fdi
    public static final class C2004b implements k4d {

        /* JADX INFO: renamed from: a */
        public final C2005c f14510a;

        /* JADX INFO: renamed from: b */
        public int f14511b;

        /* JADX INFO: renamed from: c */
        public Bitmap.Config f14512c;

        public C2004b(C2005c c2005c) {
            this.f14510a = c2005c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2004b)) {
                return false;
            }
            C2004b c2004b = (C2004b) obj;
            return this.f14511b == c2004b.f14511b && v0i.bothNullOrEqual(this.f14512c, c2004b.f14512c);
        }

        public int hashCode() {
            int i = this.f14511b * 31;
            Bitmap.Config config = this.f14512c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public void init(int i, Bitmap.Config config) {
            this.f14511b = i;
            this.f14512c = config;
        }

        @Override // p000.k4d
        public void offer() {
            this.f14510a.offer(this);
        }

        public String toString() {
            return bqf.m3347a(this.f14511b, this.f14512c);
        }

        @fdi
        public C2004b(C2005c c2005c, int i, Bitmap.Config config) {
            this(c2005c);
            init(i, config);
        }
    }

    @Override // p000.zp9
    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return m3347a(v0i.getBitmapByteSize(i, i2, config), config);
    }
}
