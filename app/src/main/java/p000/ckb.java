package p000;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
public abstract class ckb<E> {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public Object[] f16823a;

    /* JADX INFO: renamed from: b */
    @un8
    public int f16824b;

    /* JADX INFO: renamed from: ckb$a */
    public static final class C2366a extends tt8 implements qy6<E, CharSequence> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ckb<E> f16825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2366a(ckb<E> ckbVar) {
            super(1);
            this.f16825a = ckbVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(E e) {
            return e == this.f16825a ? "(this)" : String.valueOf(e);
        }
    }

    public /* synthetic */ ckb(int i, jt3 jt3Var) {
        this(i);
    }

    @yjd
    public static /* synthetic */ void getContent$annotations() {
    }

    @yjd
    public static /* synthetic */ void get_size$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ckb ckbVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            qy6Var = null;
        }
        return ckbVar.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence7, qy6Var);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    @yfb
    public abstract List<E> asList();

    public final boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public final boolean containsAll(@yfb E[] eArr) {
        md8.checkNotNullParameter(eArr, "elements");
        for (E e : eArr) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this.f16824b;
    }

    public final E elementAt(@h78(from = 0) int i) {
        if (i >= 0 && i < this.f16824b) {
            return (E) this.f16823a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f16824b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final E elementAtOrElse(@h78(from = 0) int i, @yfb qy6<? super Integer, ? extends E> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= this.f16824b) ? qy6Var.invoke(Integer.valueOf(i)) : (E) this.f16823a[i];
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof ckb) {
            ckb ckbVar = (ckb) obj;
            int i = ckbVar.f16824b;
            int i2 = this.f16824b;
            if (i == i2) {
                Object[] objArr = this.f16823a;
                Object[] objArr2 = ckbVar.f16823a;
                f78 f78VarUntil = kpd.until(0, i2);
                int first = f78VarUntil.getFirst();
                int last = f78VarUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (md8.areEqual(objArr[first], objArr2[first])) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.f16823a[0];
    }

    @gib
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r, @yfb gz6<? super R, ? super E, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            r = gz6Var.invoke(r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, @yfb kz6<? super Integer, ? super R, ? super E, ? extends R> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "operation");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            r = kz6Var.invoke(Integer.valueOf(i2), r, objArr[i2]);
        }
        return r;
    }

    public final <R> R foldRight(R r, @yfb gz6<? super E, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = gz6Var.invoke(objArr[i], r);
        }
    }

    public final <R> R foldRightIndexed(R r, @yfb kz6<? super Integer, ? super E, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "operation");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = kz6Var.invoke(Integer.valueOf(i), objArr[i], r);
        }
    }

    public final void forEach(@yfb qy6<? super E, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            qy6Var.invoke(objArr[i2]);
        }
    }

    public final void forEachIndexed(@yfb gz6<? super Integer, ? super E, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            gz6Var.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachReversed(@yfb qy6<? super E, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                qy6Var.invoke(objArr[i]);
            }
        }
    }

    public final void forEachReversedIndexed(@yfb gz6<? super Integer, ? super E, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                gz6Var.invoke(Integer.valueOf(i), objArr[i]);
            }
        }
    }

    public final E get(@h78(from = 0) int i) {
        if (i >= 0 && i < this.f16824b) {
            return (E) this.f16823a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f16824b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @yfb
    public final f78 getIndices() {
        return kpd.until(0, this.f16824b);
    }

    @h78(from = -1)
    public final int getLastIndex() {
        return this.f16824b - 1;
    }

    @h78(from = 0)
    public final int getSize() {
        return this.f16824b;
    }

    public int hashCode() {
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e) {
        int i = 0;
        if (e == null) {
            Object[] objArr = this.f16823a;
            int i2 = this.f16824b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f16823a;
        int i3 = this.f16824b;
        while (i < i3) {
            if (e.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int indexOfFirst(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            if (qy6Var.invoke(objArr[i2]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!qy6Var.invoke(objArr[i]).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this.f16824b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f16824b != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.f16823a[this.f16824b - 1];
    }

    public final int lastIndexOf(E e) {
        if (e == null) {
            Object[] objArr = this.f16823a;
            for (int i = this.f16824b - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = this.f16823a;
            for (int i2 = this.f16824b - 1; -1 < i2; i2--) {
                if (e.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @gib
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f16823a[this.f16824b - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        for (int i = this.f16824b - 1; -1 < i; i--) {
            if (qy6Var.invoke(objArr[i]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new C2366a(this), 25, null);
    }

    private ckb(int i) {
        this.f16823a = i == 0 ? dkb.f29881a : new Object[i];
    }

    public final boolean any(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            if (qy6Var.invoke(objArr[i2]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (qy6Var.invoke(objArr[i3]).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    @gib
    public final E firstOrNull(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (Object) objArr[i2];
            if (qy6Var.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        return null;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(@yfb List<? extends E> list) {
        md8.checkNotNullParameter(list, "elements");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    @gib
    public final E lastOrNull(@yfb qy6<? super E, Boolean> qy6Var) {
        ?? r2;
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        do {
            i--;
            if (-1 >= i) {
                return null;
            }
            r2 = (Object) objArr[i];
        } while (!qy6Var.invoke(r2).booleanValue());
        return r2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E first(@yfb qy6<? super E, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            ?? r3 = (Object) objArr[i2];
            if (qy6Var.invoke(r3).booleanValue()) {
                return r3;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final boolean containsAll(@yfb Iterable<? extends E> iterable) {
        md8.checkNotNullParameter(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, null, 48, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E last(@yfb qy6<? super E, Boolean> qy6Var) {
        ?? r2;
        md8.checkNotNullParameter(qy6Var, "predicate");
        Object[] objArr = this.f16823a;
        int i = this.f16824b;
        do {
            i--;
            if (-1 < i) {
                r2 = (Object) objArr[i];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!qy6Var.invoke(r2).booleanValue());
        return r2;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(@yfb ckb<E> ckbVar) {
        md8.checkNotNullParameter(ckbVar, "elements");
        Object[] objArr = ckbVar.f16823a;
        int i = ckbVar.f16824b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!contains(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @gib qy6<? super E, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.f16823a;
        int i2 = this.f16824b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                Object obj = objArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                if (qy6Var == null) {
                    sb.append(obj);
                } else {
                    sb.append(qy6Var.invoke(obj));
                }
                i3++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
