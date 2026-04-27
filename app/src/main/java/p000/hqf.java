package p000;

import android.graphics.Bitmap;
import java.util.NavigableMap;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
public final class hqf implements zp9 {

    /* JADX INFO: renamed from: d */
    public static final int f44602d = 8;

    /* JADX INFO: renamed from: a */
    public final C6975b f44603a = new C6975b();

    /* JADX INFO: renamed from: b */
    public final tb7<C6974a, Bitmap> f44604b = new tb7<>();

    /* JADX INFO: renamed from: c */
    public final NavigableMap<Integer, Integer> f44605c = new tad();

    /* JADX INFO: renamed from: hqf$a */
    @fdi
    public static final class C6974a implements k4d {

        /* JADX INFO: renamed from: a */
        public final C6975b f44606a;

        /* JADX INFO: renamed from: b */
        public int f44607b;

        public C6974a(C6975b c6975b) {
            this.f44606a = c6975b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C6974a) && this.f44607b == ((C6974a) obj).f44607b;
        }

        public int hashCode() {
            return this.f44607b;
        }

        public void init(int i) {
            this.f44607b = i;
        }

        @Override // p000.k4d
        public void offer() {
            this.f44606a.offer(this);
        }

        public String toString() {
            return hqf.m12576a(this.f44607b);
        }
    }

    /* JADX INFO: renamed from: hqf$b */
    @fdi
    public static class C6975b extends mr0<C6974a> {
        @Override // p000.mr0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C6974a mo3348a() {
            return new C6974a(this);
        }

        public C6974a get(int i) {
            C6974a c6974a = (C6974a) super.m17523b();
            c6974a.init(i);
            return c6974a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12576a(int i) {
        return "[" + i + "]";
    }

    private void decrementBitmapOfSize(Integer num) {
        Integer num2 = this.f44605c.get(num);
        if (num2.intValue() == 1) {
            this.f44605c.remove(num);
        } else {
            this.f44605c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private static String getBitmapString(Bitmap bitmap) {
        return m12576a(v0i.getBitmapByteSize(bitmap));
    }

    @Override // p000.zp9
    @hib
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        int bitmapByteSize = v0i.getBitmapByteSize(i, i2, config);
        C6974a c6974a = this.f44603a.get(bitmapByteSize);
        Integer numCeilingKey = this.f44605c.ceilingKey(Integer.valueOf(bitmapByteSize));
        if (numCeilingKey != null && numCeilingKey.intValue() != bitmapByteSize && numCeilingKey.intValue() <= bitmapByteSize * 8) {
            this.f44603a.offer(c6974a);
            c6974a = this.f44603a.get(numCeilingKey.intValue());
        }
        Bitmap bitmap = this.f44604b.get(c6974a);
        if (bitmap != null) {
            bitmap.reconfigure(i, i2, config);
            decrementBitmapOfSize(numCeilingKey);
        }
        return bitmap;
    }

    @Override // p000.zp9
    public int getSize(Bitmap bitmap) {
        return v0i.getBitmapByteSize(bitmap);
    }

    @Override // p000.zp9
    public String logBitmap(Bitmap bitmap) {
        return getBitmapString(bitmap);
    }

    @Override // p000.zp9
    public void put(Bitmap bitmap) {
        C6974a c6974a = this.f44603a.get(v0i.getBitmapByteSize(bitmap));
        this.f44604b.put(c6974a, bitmap);
        Integer num = this.f44605c.get(Integer.valueOf(c6974a.f44607b));
        this.f44605c.put(Integer.valueOf(c6974a.f44607b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p000.zp9
    @hib
    public Bitmap removeLast() {
        Bitmap bitmapRemoveLast = this.f44604b.removeLast();
        if (bitmapRemoveLast != null) {
            decrementBitmapOfSize(Integer.valueOf(v0i.getBitmapByteSize(bitmapRemoveLast)));
        }
        return bitmapRemoveLast;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f44604b + "\n  SortedSizes" + this.f44605c;
    }

    @Override // p000.zp9
    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return m12576a(v0i.getBitmapByteSize(i, i2, config));
    }
}
