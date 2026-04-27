package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class p46 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public float[] f69630a;

    /* JADX INFO: renamed from: b */
    @un8
    public int f69631b;

    public /* synthetic */ p46(int i, jt3 jt3Var) {
        this(i);
    }

    @yjd
    public static /* synthetic */ void getContent$annotations() {
    }

    @yjd
    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(p46 p46Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return p46Var.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(float f) {
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] == f) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@yfb p46 p46Var) {
        md8.checkNotNullParameter(p46Var, "elements");
        f78 f78VarUntil = kpd.until(0, p46Var.f69631b);
        int first = f78VarUntil.getFirst();
        int last = f78VarUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(p46Var.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count() {
        return this.f69631b;
    }

    public final float elementAt(@h78(from = 0) int i) {
        if (i >= 0 && i < this.f69631b) {
            return this.f69630a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f69631b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final float elementAtOrElse(@h78(from = 0) int i, @yfb qy6<? super Integer, Float> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "defaultValue");
        return (i < 0 || i >= this.f69631b) ? qy6Var.invoke(Integer.valueOf(i)).floatValue() : this.f69630a[i];
    }

    public boolean equals(@gib Object obj) {
        if (obj instanceof p46) {
            p46 p46Var = (p46) obj;
            int i = p46Var.f69631b;
            int i2 = this.f69631b;
            if (i == i2) {
                float[] fArr = this.f69630a;
                float[] fArr2 = p46Var.f69630a;
                f78 f78VarUntil = kpd.until(0, i2);
                int first = f78VarUntil.getFirst();
                int last = f78VarUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
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

    public final float first() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.f69630a[0];
    }

    public final <R> R fold(R r, @yfb gz6<? super R, ? super Float, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            r = gz6Var.invoke(r, Float.valueOf(fArr[i2]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, @yfb kz6<? super Integer, ? super R, ? super Float, ? extends R> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "operation");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            R r2 = r;
            r = kz6Var.invoke(Integer.valueOf(i2), r2, Float.valueOf(fArr[i2]));
        }
        return r;
    }

    public final <R> R foldRight(R r, @yfb gz6<? super Float, ? super R, ? extends R> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "operation");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = gz6Var.invoke(Float.valueOf(fArr[i]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, @yfb kz6<? super Integer, ? super Float, ? super R, ? extends R> kz6Var) {
        md8.checkNotNullParameter(kz6Var, "operation");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        while (true) {
            i--;
            if (-1 >= i) {
                return r;
            }
            r = kz6Var.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), r);
        }
    }

    public final void forEach(@yfb qy6<? super Float, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            qy6Var.invoke(Float.valueOf(fArr[i2]));
        }
    }

    public final void forEachIndexed(@yfb gz6<? super Integer, ? super Float, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            gz6Var.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]));
        }
    }

    public final void forEachReversed(@yfb qy6<? super Float, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                qy6Var.invoke(Float.valueOf(fArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@yfb gz6<? super Integer, ? super Float, bth> gz6Var) {
        md8.checkNotNullParameter(gz6Var, "block");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                gz6Var.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]));
            }
        }
    }

    public final float get(@h78(from = 0) int i) {
        if (i >= 0 && i < this.f69631b) {
            return this.f69630a[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f69631b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @yfb
    public final f78 getIndices() {
        return kpd.until(0, this.f69631b);
    }

    @h78(from = -1)
    public final int getLastIndex() {
        return this.f69631b - 1;
    }

    @h78(from = 0)
    public final int getSize() {
        return this.f69631b;
    }

    public int hashCode() {
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(float f) {
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            if (f == fArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            if (qy6Var.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(@yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!qy6Var.invoke(Float.valueOf(fArr[i])).booleanValue());
        return i;
    }

    public final boolean isEmpty() {
        return this.f69631b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f69631b != 0;
    }

    @yfb
    @yn8
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final float last() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.f69630a[this.f69631b - 1];
    }

    public final int lastIndexOf(float f) {
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (fArr[i] != f);
        return i;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(@yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        for (int i = this.f69631b - 1; -1 < i; i--) {
            if (qy6Var.invoke(Float.valueOf(fArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private p46(int i) {
        this.f69630a = i == 0 ? c56.getEmptyFloatArray() : new float[i];
    }

    public final boolean any(@yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            if (qy6Var.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(@yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (qy6Var.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
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

    public final float first(@yfb qy6<? super Float, Boolean> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            if (qy6Var.invoke(Float.valueOf(f)).booleanValue()) {
                return f;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    @yfb
    @yn8
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(p46 p46Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, qy6 qy6Var, int i2, Object obj) {
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
            float[] fArr = p46Var.f69630a;
            int i3 = p46Var.f69631b;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    float f = fArr[i4];
                    if (i4 == i) {
                        sb.append(charSequence4);
                        break;
                    }
                    if (i4 != 0) {
                        sb.append(charSequence);
                    }
                    sb.append((CharSequence) qy6Var.invoke(Float.valueOf(f)));
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

    public final float last(@yfb qy6<? super Float, Boolean> qy6Var) {
        float f;
        md8.checkNotNullParameter(qy6Var, "predicate");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        do {
            i--;
            if (-1 < i) {
                f = fArr[i];
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        } while (!qy6Var.invoke(Float.valueOf(f)).booleanValue());
        return f;
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
        float[] fArr = this.f69630a;
        int i2 = this.f69631b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(f);
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
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb CharSequence charSequence4, @yfb qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(charSequence4, "truncated");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f69630a;
        int i2 = this.f69631b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append(charSequence4);
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Float.valueOf(f)));
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
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, int i, @yfb qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f69630a;
        int i2 = this.f69631b;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Float.valueOf(f)));
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
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb CharSequence charSequence3, @yfb qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(charSequence3, "postfix");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Float.valueOf(f)));
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
    public final String joinToString(@yfb CharSequence charSequence, @yfb CharSequence charSequence2, @yfb qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(charSequence2, "prefix");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Float.valueOf(f)));
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
    public final String joinToString(@yfb CharSequence charSequence, @yfb qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(charSequence, "separator");
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(qy6Var.invoke(Float.valueOf(f)));
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
    public final String joinToString(@yfb qy6<? super Float, ? extends CharSequence> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.f69630a;
        int i = this.f69631b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(qy6Var.invoke(Float.valueOf(f)));
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
