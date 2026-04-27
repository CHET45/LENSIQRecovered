package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
public final class wwd {

    /* JADX INFO: renamed from: wwd$a */
    public static final class C14816a implements Iterator<Rect>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final RegionIterator f95621a;

        /* JADX INFO: renamed from: b */
        @yfb
        public final Rect f95622b;

        /* JADX INFO: renamed from: c */
        public boolean f95623c;

        public C14816a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f95621a = regionIterator;
            Rect rect = new Rect();
            this.f95622b = rect;
            this.f95623c = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f95623c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @yfb
        public Rect next() {
            if (!this.f95623c) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.f95622b);
            this.f95623c = this.f95621a.next(this.f95622b);
            return rect;
        }
    }

    @yfb
    public static final Region and(@yfb Region region, @yfb Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(@yfb Region region, @yfb Point point) {
        return region.contains(point.x, point.y);
    }

    public static final void forEach(@yfb Region region, @yfb qy6<? super Rect, bth> qy6Var) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                qy6Var.invoke(rect);
            }
        }
    }

    @yfb
    public static final Iterator<Rect> iterator(@yfb Region region) {
        return new C14816a(region);
    }

    @yfb
    public static final Region minus(@yfb Region region, @yfb Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @yfb
    public static final Region not(@yfb Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @yfb
    /* JADX INFO: renamed from: or */
    public static final Region m24848or(@yfb Region region, @yfb Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @yfb
    public static final Region plus(@yfb Region region, @yfb Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @yfb
    public static final Region unaryMinus(@yfb Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @yfb
    public static final Region xor(@yfb Region region, @yfb Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @yfb
    public static final Region and(@yfb Region region, @yfb Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    @yfb
    public static final Region minus(@yfb Region region, @yfb Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @yfb
    /* JADX INFO: renamed from: or */
    public static final Region m24849or(@yfb Region region, @yfb Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @yfb
    public static final Region plus(@yfb Region region, @yfb Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @yfb
    public static final Region xor(@yfb Region region, @yfb Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
