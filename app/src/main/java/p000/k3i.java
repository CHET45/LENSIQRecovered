package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class k3i extends m3i implements Iterable<m3i>, uo8 {

    /* JADX INFO: renamed from: M */
    public static final int f52537M = 0;

    /* JADX INFO: renamed from: C */
    public final float f52538C;

    /* JADX INFO: renamed from: F */
    public final float f52539F;

    /* JADX INFO: renamed from: H */
    @yfb
    public final List<qjc> f52540H;

    /* JADX INFO: renamed from: L */
    @yfb
    public final List<m3i> f52541L;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f52542b;

    /* JADX INFO: renamed from: c */
    public final float f52543c;

    /* JADX INFO: renamed from: d */
    public final float f52544d;

    /* JADX INFO: renamed from: e */
    public final float f52545e;

    /* JADX INFO: renamed from: f */
    public final float f52546f;

    /* JADX INFO: renamed from: m */
    public final float f52547m;

    /* JADX INFO: renamed from: k3i$a */
    public static final class C8189a implements Iterator<m3i>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Iterator<m3i> f52548a;

        public C8189a(k3i k3iVar) {
            this.f52548a = k3iVar.f52541L.iterator();
        }

        @yfb
        public final Iterator<m3i> getIt() {
            return this.f52548a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52548a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        @yfb
        public m3i next() {
            return this.f52548a.next();
        }
    }

    public k3i() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k3i)) {
            k3i k3iVar = (k3i) obj;
            return md8.areEqual(this.f52542b, k3iVar.f52542b) && this.f52543c == k3iVar.f52543c && this.f52544d == k3iVar.f52544d && this.f52545e == k3iVar.f52545e && this.f52546f == k3iVar.f52546f && this.f52547m == k3iVar.f52547m && this.f52538C == k3iVar.f52538C && this.f52539F == k3iVar.f52539F && md8.areEqual(this.f52540H, k3iVar.f52540H) && md8.areEqual(this.f52541L, k3iVar.f52541L);
        }
        return false;
    }

    @yfb
    public final m3i get(int i) {
        return this.f52541L.get(i);
    }

    @yfb
    public final List<qjc> getClipPathData() {
        return this.f52540H;
    }

    @yfb
    public final String getName() {
        return this.f52542b;
    }

    public final float getPivotX() {
        return this.f52544d;
    }

    public final float getPivotY() {
        return this.f52545e;
    }

    public final float getRotation() {
        return this.f52543c;
    }

    public final float getScaleX() {
        return this.f52546f;
    }

    public final float getScaleY() {
        return this.f52547m;
    }

    public final int getSize() {
        return this.f52541L.size();
    }

    public final float getTranslationX() {
        return this.f52538C;
    }

    public final float getTranslationY() {
        return this.f52539F;
    }

    public int hashCode() {
        return (((((((((((((((((this.f52542b.hashCode() * 31) + Float.hashCode(this.f52543c)) * 31) + Float.hashCode(this.f52544d)) * 31) + Float.hashCode(this.f52545e)) * 31) + Float.hashCode(this.f52546f)) * 31) + Float.hashCode(this.f52547m)) * 31) + Float.hashCode(this.f52538C)) * 31) + Float.hashCode(this.f52539F)) * 31) + this.f52540H.hashCode()) * 31) + this.f52541L.hashCode();
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<m3i> iterator() {
        return new C8189a(this);
    }

    public /* synthetic */ k3i(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? l3i.getEmptyPath() : list, (i & 512) != 0 ? l82.emptyList() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k3i(@yfb String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @yfb List<? extends qjc> list, @yfb List<? extends m3i> list2) {
        super(null);
        this.f52542b = str;
        this.f52543c = f;
        this.f52544d = f2;
        this.f52545e = f3;
        this.f52546f = f4;
        this.f52547m = f5;
        this.f52538C = f6;
        this.f52539F = f7;
        this.f52540H = list;
        this.f52541L = list2;
    }
}
