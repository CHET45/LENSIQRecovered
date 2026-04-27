package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,408:1\n171#1,16:409\n171#1,16:425\n171#1,16:441\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n121#1:409,16\n148#1:425,16\n160#1:441,16\n*E\n"})
@p7e({p7e.EnumC10826a.f69936c})
public final class yc8<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final yc8<T>.C15614a f101100a;

    /* JADX INFO: renamed from: b */
    @yfb
    public yc8<T>.C15614a f101101b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ArrayList<yc8<T>.C15614a> f101102c;

    /* JADX INFO: renamed from: yc8$a */
    public final class C15614a extends vc8<T> {

        /* JADX INFO: renamed from: d */
        @yfb
        public EnumC15615b f101103d;

        /* JADX INFO: renamed from: e */
        public float f101104e;

        /* JADX INFO: renamed from: f */
        public float f101105f;

        /* JADX INFO: renamed from: g */
        @yfb
        public yc8<T>.C15614a f101106g;

        /* JADX INFO: renamed from: h */
        @yfb
        public yc8<T>.C15614a f101107h;

        /* JADX INFO: renamed from: i */
        @yfb
        public yc8<T>.C15614a f101108i;

        public C15614a(float f, float f2, @gib T t, @yfb EnumC15615b enumC15615b) {
            super(f, f2, t);
            this.f101103d = enumC15615b;
            this.f101104e = f;
            this.f101105f = f2;
            this.f101106g = yc8.this.f101100a;
            this.f101107h = yc8.this.f101100a;
            this.f101108i = yc8.this.f101100a;
        }

        @yfb
        public final EnumC15615b getColor() {
            return this.f101103d;
        }

        @yfb
        public final yc8<T>.C15614a getLeft() {
            return this.f101106g;
        }

        public final float getMax() {
            return this.f101105f;
        }

        public final float getMin() {
            return this.f101104e;
        }

        @yfb
        public final yc8<T>.C15614a getParent() {
            return this.f101108i;
        }

        @yfb
        public final yc8<T>.C15614a getRight() {
            return this.f101107h;
        }

        @yfb
        public final yc8<T>.C15614a lowestNode() {
            C15614a c15614a = this;
            while (c15614a.f101106g != yc8.this.f101100a) {
                c15614a = c15614a.f101106g;
            }
            return c15614a;
        }

        @yfb
        public final yc8<T>.C15614a next() {
            if (this.f101107h != yc8.this.f101100a) {
                return this.f101107h.lowestNode();
            }
            yc8<T>.C15614a c15614a = this.f101108i;
            C15614a c15614a2 = this;
            while (c15614a != yc8.this.f101100a && c15614a2 == c15614a.f101107h) {
                c15614a2 = c15614a;
                c15614a = c15614a.f101108i;
            }
            return c15614a;
        }

        public final void setColor(@yfb EnumC15615b enumC15615b) {
            this.f101103d = enumC15615b;
        }

        public final void setLeft(@yfb yc8<T>.C15614a c15614a) {
            this.f101106g = c15614a;
        }

        public final void setMax(float f) {
            this.f101105f = f;
        }

        public final void setMin(float f) {
            this.f101104e = f;
        }

        public final void setParent(@yfb yc8<T>.C15614a c15614a) {
            this.f101108i = c15614a;
        }

        public final void setRight(@yfb yc8<T>.C15614a c15614a) {
            this.f101107h = c15614a;
        }
    }

    /* JADX INFO: renamed from: yc8$b */
    public enum EnumC15615b {
        Red,
        Black
    }

    /* JADX INFO: renamed from: yc8$c */
    public static final class C15616c implements Iterator<vc8<T>>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public yc8<T>.C15614a f101113a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ yc8<T> f101114b;

        public C15616c(yc8<T> yc8Var) {
            this.f101114b = yc8Var;
            this.f101113a = yc8Var.f101101b.lowestNode();
        }

        @yfb
        public final yc8<T>.C15614a getNext() {
            return this.f101113a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f101113a != this.f101114b.f101100a;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNext(@yfb yc8<T>.C15614a c15614a) {
            this.f101113a = c15614a;
        }

        @Override // java.util.Iterator
        @yfb
        public vc8<T> next() {
            yc8<T>.C15614a c15614a = this.f101113a;
            this.f101113a = c15614a.next();
            return c15614a;
        }
    }

    public yc8() {
        yc8<T>.C15614a c15614a = new C15614a(Float.MAX_VALUE, Float.MIN_VALUE, null, EnumC15615b.Black);
        this.f101100a = c15614a;
        this.f101101b = c15614a;
        this.f101102c = new ArrayList<>();
    }

    public static /* synthetic */ vc8 findFirstOverlap$default(yc8 yc8Var, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return yc8Var.findFirstOverlap(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(yc8 yc8Var, z52 z52Var, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        return yc8Var.findOverlaps(z52Var, list);
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(yc8 yc8Var, float f, float f2, qy6 qy6Var, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        if (yc8Var.f101101b != yc8Var.f101100a) {
            ArrayList arrayList = yc8Var.f101102c;
            arrayList.add(yc8Var.f101101b);
            while (arrayList.size() > 0) {
                C15614a c15614a = (C15614a) q82.removeLast(arrayList);
                if (c15614a.overlaps(f, f2)) {
                    qy6Var.invoke(c15614a);
                }
                if (c15614a.getLeft() != yc8Var.f101100a && c15614a.getLeft().getMax() >= f) {
                    arrayList.add(c15614a.getLeft());
                }
                if (c15614a.getRight() != yc8Var.f101100a && c15614a.getRight().getMin() <= f2) {
                    arrayList.add(c15614a.getRight());
                }
            }
            arrayList.clear();
        }
    }

    private final void rebalance(yc8<T>.C15614a c15614a) {
        while (c15614a != this.f101101b) {
            EnumC15615b color = c15614a.getParent().getColor();
            EnumC15615b enumC15615b = EnumC15615b.Red;
            if (color != enumC15615b) {
                break;
            }
            yc8<T>.C15614a parent = c15614a.getParent().getParent();
            if (c15614a.getParent() == parent.getLeft()) {
                yc8<T>.C15614a right = parent.getRight();
                if (right.getColor() == enumC15615b) {
                    EnumC15615b enumC15615b2 = EnumC15615b.Black;
                    right.setColor(enumC15615b2);
                    c15614a.getParent().setColor(enumC15615b2);
                    parent.setColor(enumC15615b);
                    c15614a = parent;
                } else {
                    if (c15614a == c15614a.getParent().getRight()) {
                        c15614a = c15614a.getParent();
                        rotateLeft(c15614a);
                    }
                    c15614a.getParent().setColor(EnumC15615b.Black);
                    parent.setColor(enumC15615b);
                    rotateRight(parent);
                }
            } else {
                yc8<T>.C15614a left = parent.getLeft();
                if (left.getColor() == enumC15615b) {
                    EnumC15615b enumC15615b3 = EnumC15615b.Black;
                    left.setColor(enumC15615b3);
                    c15614a.getParent().setColor(enumC15615b3);
                    parent.setColor(enumC15615b);
                    c15614a = parent;
                } else {
                    if (c15614a == c15614a.getParent().getLeft()) {
                        c15614a = c15614a.getParent();
                        rotateRight(c15614a);
                    }
                    c15614a.getParent().setColor(EnumC15615b.Black);
                    parent.setColor(enumC15615b);
                    rotateLeft(parent);
                }
            }
        }
        this.f101101b.setColor(EnumC15615b.Black);
    }

    private final void rotateLeft(yc8<T>.C15614a c15614a) {
        yc8<T>.C15614a right = c15614a.getRight();
        c15614a.setRight(right.getLeft());
        if (right.getLeft() != this.f101100a) {
            right.getLeft().setParent(c15614a);
        }
        right.setParent(c15614a.getParent());
        if (c15614a.getParent() == this.f101100a) {
            this.f101101b = right;
        } else if (c15614a.getParent().getLeft() == c15614a) {
            c15614a.getParent().setLeft(right);
        } else {
            c15614a.getParent().setRight(right);
        }
        right.setLeft(c15614a);
        c15614a.setParent(right);
        updateNodeData(c15614a);
    }

    private final void rotateRight(yc8<T>.C15614a c15614a) {
        yc8<T>.C15614a left = c15614a.getLeft();
        c15614a.setLeft(left.getRight());
        if (left.getRight() != this.f101100a) {
            left.getRight().setParent(c15614a);
        }
        left.setParent(c15614a.getParent());
        if (c15614a.getParent() == this.f101100a) {
            this.f101101b = left;
        } else if (c15614a.getParent().getRight() == c15614a) {
            c15614a.getParent().setRight(left);
        } else {
            c15614a.getParent().setLeft(left);
        }
        left.setRight(c15614a);
        c15614a.setParent(left);
        updateNodeData(c15614a);
    }

    private final void updateNodeData(yc8<T>.C15614a c15614a) {
        while (c15614a != this.f101100a) {
            c15614a.setMin(Math.min(c15614a.getStart(), Math.min(c15614a.getLeft().getMin(), c15614a.getRight().getMin())));
            c15614a.setMax(Math.max(c15614a.getEnd(), Math.max(c15614a.getLeft().getMax(), c15614a.getRight().getMax())));
            c15614a = c15614a.getParent();
        }
    }

    public final void addInterval(float f, float f2, @gib T t) {
        yc8<T>.C15614a c15614a = new C15614a(f, f2, t, EnumC15615b.Red);
        yc8<T>.C15614a c15614a2 = this.f101100a;
        for (yc8<T>.C15614a left = this.f101101b; left != this.f101100a; left = c15614a.getStart() <= left.getStart() ? left.getLeft() : left.getRight()) {
            c15614a2 = left;
        }
        c15614a.setParent(c15614a2);
        if (c15614a2 == this.f101100a) {
            this.f101101b = c15614a;
        } else if (c15614a.getStart() <= c15614a2.getStart()) {
            c15614a2.setLeft(c15614a);
        } else {
            c15614a2.setRight(c15614a);
        }
        updateNodeData(c15614a);
        rebalance(c15614a);
    }

    public final void clear() {
        this.f101101b = this.f101100a;
    }

    public final boolean contains(float f) {
        return findFirstOverlap(f, f) != zc8.getEmptyInterval();
    }

    @yfb
    public final vc8<T> findFirstOverlap(@yfb z52<Float> z52Var) {
        return findFirstOverlap(z52Var.getStart().floatValue(), z52Var.getEndInclusive().floatValue());
    }

    @yfb
    public final List<vc8<T>> findOverlaps(@yfb z52<Float> z52Var, @yfb List<vc8<T>> list) {
        return findOverlaps(z52Var.getStart().floatValue(), z52Var.getEndInclusive().floatValue(), list);
    }

    public final void forEach$ui_graphics_release(@yfb z52<Float> z52Var, @yfb qy6<? super vc8<T>, bth> qy6Var) {
        float fFloatValue = z52Var.getStart().floatValue();
        float fFloatValue2 = z52Var.getEndInclusive().floatValue();
        if (this.f101101b != this.f101100a) {
            ArrayList arrayList = this.f101102c;
            arrayList.add(this.f101101b);
            while (arrayList.size() > 0) {
                C15614a c15614a = (C15614a) q82.removeLast(arrayList);
                if (c15614a.overlaps(fFloatValue, fFloatValue2)) {
                    qy6Var.invoke(c15614a);
                }
                if (c15614a.getLeft() != this.f101100a && c15614a.getLeft().getMax() >= fFloatValue) {
                    arrayList.add(c15614a.getLeft());
                }
                if (c15614a.getRight() != this.f101100a && c15614a.getRight().getMin() <= fFloatValue2) {
                    arrayList.add(c15614a.getRight());
                }
            }
            arrayList.clear();
        }
    }

    @yfb
    public final Iterator<vc8<T>> iterator() {
        return new C15616c(this);
    }

    public final void plusAssign(@yfb vc8<T> vc8Var) {
        addInterval(vc8Var.getStart(), vc8Var.getEnd(), vc8Var.getData());
    }

    public final boolean contains(@yfb z52<Float> z52Var) {
        return findFirstOverlap(z52Var.getStart().floatValue(), z52Var.getEndInclusive().floatValue()) != zc8.getEmptyInterval();
    }

    @yfb
    public final vc8<T> findFirstOverlap(float f, float f2) {
        if (this.f101101b != this.f101100a && this.f101101b != this.f101100a) {
            ArrayList arrayList = this.f101102c;
            arrayList.add(this.f101101b);
            while (arrayList.size() > 0) {
                C15614a c15614a = (C15614a) q82.removeLast(arrayList);
                if (c15614a.overlaps(f, f2)) {
                    return c15614a;
                }
                if (c15614a.getLeft() != this.f101100a && c15614a.getLeft().getMax() >= f) {
                    arrayList.add(c15614a.getLeft());
                }
                if (c15614a.getRight() != this.f101100a && c15614a.getRight().getMin() <= f2) {
                    arrayList.add(c15614a.getRight());
                }
            }
            arrayList.clear();
        }
        vc8<T> vc8Var = (vc8<T>) zc8.getEmptyInterval();
        md8.checkNotNull(vc8Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
        return vc8Var;
    }

    @yfb
    public final List<vc8<T>> findOverlaps(float f, float f2, @yfb List<vc8<T>> list) {
        if (this.f101101b != this.f101100a) {
            ArrayList arrayList = this.f101102c;
            arrayList.add(this.f101101b);
            while (arrayList.size() > 0) {
                C15614a c15614a = (C15614a) q82.removeLast(arrayList);
                if (c15614a.overlaps(f, f2)) {
                    list.add(c15614a);
                }
                if (c15614a.getLeft() != this.f101100a && c15614a.getLeft().getMax() >= f) {
                    arrayList.add(c15614a.getLeft());
                }
                if (c15614a.getRight() != this.f101100a && c15614a.getRight().getMin() <= f2) {
                    arrayList.add(c15614a.getRight());
                }
            }
            arrayList.clear();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(yc8 yc8Var, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        return yc8Var.findOverlaps(f, f2, list);
    }

    public final void forEach$ui_graphics_release(float f, float f2, @yfb qy6<? super vc8<T>, bth> qy6Var) {
        if (this.f101101b != this.f101100a) {
            ArrayList arrayList = this.f101102c;
            arrayList.add(this.f101101b);
            while (arrayList.size() > 0) {
                C15614a c15614a = (C15614a) q82.removeLast(arrayList);
                if (c15614a.overlaps(f, f2)) {
                    qy6Var.invoke(c15614a);
                }
                if (c15614a.getLeft() != this.f101100a && c15614a.getLeft().getMax() >= f) {
                    arrayList.add(c15614a.getLeft());
                }
                if (c15614a.getRight() != this.f101100a && c15614a.getRight().getMin() <= f2) {
                    arrayList.add(c15614a.getRight());
                }
            }
            arrayList.clear();
        }
    }
}
