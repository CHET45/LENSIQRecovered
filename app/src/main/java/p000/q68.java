package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class q68 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public int[] f73324a;

    /* JADX INFO: renamed from: b */
    @un8
    public int f73325b;

    public /* synthetic */ q68(int i, jt3 jt3Var) {
        this(i);
    }

    @yjd
    public static /* synthetic */ void getContent$annotations() {
    }

    @yjd
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(q68 q68Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return q68Var.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(int i) {
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@yfb q68 q68Var) {
        md8.checkNotNullParameter(q68Var, "elements");
        f78 f78VarUntil = kpd.until(0, q68Var.f73325b);
        int first = f78VarUntil.getFirst();
        int last = f78VarUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(q68Var.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count() {
        return this.f73325b;
    }

    public final int elementAt(@h78(from = 0) int i) {
        if (i >= 0 && i < this.f73325b) {
            return this.f73324a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f73325b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int elementAtOrElse(@h78(from = 0) int i, @yfb qy6<? super Integer, Integer> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= this.f73325b) ? qy6Var.invoke(Integer.valueOf(i)).intValue() : this.f73324a[i];
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof q68) {
            q68 q68Var = (q68) obj;
            int i = q68Var.f73325b;
            int i2 = this.f73325b;
            if (i == i2) {
                int[] iArr = this.f73324a;
                int[] iArr2 = q68Var.f73324a;
                f78 f78VarUntil = kpd.until(0, i2);
                int first = f78VarUntil.getFirst();
                int last = f78VarUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
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

    public final int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f73324a[0];
    }

    public final <R> R fold(R r, @yfb gz6<? super R, ? super Integer, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            r = gz6Var.invoke(r, Integer.valueOf(iArr[i2]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, @yfb kz6<? super Integer, ? super R, ? super Integer, ? extends R> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "operation");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            R r2 = r;
            r = kz6Var.invoke(Integer.valueOf(i2), r2, Integer.valueOf(iArr[i2]));
        }
        return r;
    }

    public final <R> R foldRight(R r, @yfb gz6<? super Integer, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = gz6Var.invoke(Integer.valueOf(iArr[i]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, @yfb kz6<? super Integer, ? super Integer, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "operation");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = kz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]), r);
        }
    }

    public final void forEach(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            qy6Var.invoke(Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachIndexed(@yfb gz6<? super Integer, ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            gz6Var.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]));
        }
    }

    public final void forEachReversed(@yfb qy6<? super Integer, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                qy6Var.invoke(Integer.valueOf(iArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@yfb gz6<? super Integer, ? super Integer, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                gz6Var.invoke(Integer.valueOf(i), Integer.valueOf(iArr[i]));
            }
        }
    }

    public final int get(@h78(from = 0) int i) {
        if (i >= 0 && i < this.f73325b) {
            return this.f73324a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f73325b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @yfb
    public final f78 getIndices() {
        return kpd.until(0, this.f73325b);
    }

    @h78(from = -1)
    public final int getLastIndex() {
        return this.f73325b - 1;
    }

    @h78(from = 0)
    public final int getSize() {
        return this.f73325b;
    }

    public int hashCode() {
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(int i) {
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i == iArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            if (qy6Var.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(@yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!qy6Var.invoke(Integer.valueOf(iArr[i])).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this.f73325b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f73325b != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final int last() {
        if (isEmpty()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f73324a[this.f73325b - 1];
    }

    public final int lastIndexOf(int i) {
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        do {
            i2--;
            if (-1 >= i2) {
                return -1;
            }
        } while (iArr[i2] != i);
        return i2;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        for (int i = this.f73325b - 1; -1 < i; i--) {
            if (qy6Var.invoke(Integer.valueOf(iArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private q68(int i) {
        this.f73324a = i == 0 ? q78.getEmptyIntArray() : new int[i];
    }

    public final boolean any(@yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            if (qy6Var.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (qy6Var.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final int first(@yfb qy6<? super Integer, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (qy6Var.invoke(Integer.valueOf(i3)).booleanValue()) {
                return i3;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(q68 q68Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                charSequence = ", ";
            }
            if ((i2 & 2) != 0) {
                charSequence2 = "";
            }
            if ((i2 & 4) != 0) {
                charSequence3 = "";
            }
            if ((i2 & 8) != 0) {
                i = -1;
            }
            if ((i2 & 16) != 0) {
                charSequence4 = "...";
            }
            md8.checkNotNullParameter(charSequence, "separator");
            md8.checkNotNullParameter(charSequence2, "prefix");
            md8.checkNotNullParameter(charSequence3, "postfix");
            md8.checkNotNullParameter(charSequence4, "truncated");
            md8.checkNotNullParameter(qy6Var, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            int[] iArr = q68Var.f73324a;
            int i3 = q68Var.f73325b;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    int i5 = iArr[i4];
                    if (i4 == i) {
                        sb.append(charSequence4);
                        break;
                    }
                    if (i4 != 0) {
                        sb.append(charSequence);
                    }
                    sb.append((CharSequence) qy6Var.invoke(Integer.valueOf(i5)));
                    i4++;
                } else {
                    sb.append(charSequence3);
                    break;
                }
            }
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    public final int last(@yfb qy6<? super Integer, Boolean> qy6Var) {
        int i;
        md8.checkNotNullParameter(qy6Var, "predicate");
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        do {
            i2--;
            if (-1 < i2) {
                i = iArr[i2];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!qy6Var.invoke(Integer.valueOf(i)).booleanValue());
        return i;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(i4);
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

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @yfb qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Integer.valueOf(i4)));
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

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f73324a;
        int i2 = this.f73325b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i3 == i) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Integer.valueOf(i4)));
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

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, @yfb qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @yfb
    @yn8
    public final String joinToString(@yfb qy6<? super Integer, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.f73324a;
        int i = this.f73325b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(qy6Var.invoke(Integer.valueOf(i3)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
