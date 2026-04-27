package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class zv1 implements Iterable<Character>, uo8 {

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C16261a f106137d = new C16261a(null);

    /* JADX INFO: renamed from: a */
    public final char f106138a;

    /* JADX INFO: renamed from: b */
    public final char f106139b;

    /* JADX INFO: renamed from: c */
    public final int f106140c;

    /* JADX INFO: renamed from: zv1$a */
    public static final class C16261a {
        public /* synthetic */ C16261a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final zv1 fromClosedRange(char c, char c2, int i) {
            return new zv1(c, c2, i);
        }

        private C16261a() {
        }
    }

    public zv1(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f106138a = c;
        this.f106139b = (char) red.getProgressionLastElement((int) c, (int) c2, i);
        this.f106140c = i;
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof zv1) {
            if (!isEmpty() || !((zv1) obj).isEmpty()) {
                zv1 zv1Var = (zv1) obj;
                if (this.f106138a != zv1Var.f106138a || this.f106139b != zv1Var.f106139b || this.f106140c != zv1Var.f106140c) {
                }
            }
            return true;
        }
        return false;
    }

    public final char getFirst() {
        return this.f106138a;
    }

    public final char getLast() {
        return this.f106139b;
    }

    public final int getStep() {
        return this.f106140c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f106138a * zsi.f106019b) + this.f106139b) * 31) + this.f106140c;
    }

    public boolean isEmpty() {
        if (this.f106140c > 0) {
            if (md8.compare((int) this.f106138a, (int) this.f106139b) <= 0) {
                return false;
            }
        } else if (md8.compare((int) this.f106138a, (int) this.f106139b) >= 0) {
            return false;
        }
        return true;
    }

    @yfb
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f106140c > 0) {
            sb = new StringBuilder();
            sb.append(this.f106138a);
            sb.append("..");
            sb.append(this.f106139b);
            sb.append(" step ");
            i = this.f106140c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f106138a);
            sb.append(" downTo ");
            sb.append(this.f106139b);
            sb.append(" step ");
            i = -this.f106140c;
        }
        sb.append(i);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<Character> iterator() {
        return new aw1(this.f106138a, this.f106139b, this.f106140c);
    }
}
