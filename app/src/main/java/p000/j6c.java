package p000;

import java.util.Arrays;
import java.util.NoSuchElementException;
import p000.w5c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,475:1\n294#1,7:490\n283#1:497\n294#1,7:498\n284#1,2:505\n294#1,7:507\n33#2,7:476\n50#2,7:483\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n283#1:490,7\n307#1:497\n307#1:498,7\n307#1:505,2\n406#1:507,7\n146#1:476,7\n173#1:483,7\n*E\n"})
@e0g(parameters = 0)
public final class j6c extends k6c {

    /* JADX INFO: renamed from: j */
    @yfb
    public static final C7757a f49629j = new C7757a(null);

    /* JADX INFO: renamed from: k */
    public static final int f49630k = 8;

    /* JADX INFO: renamed from: l */
    public static final int f49631l = 1024;

    /* JADX INFO: renamed from: m */
    public static final int f49632m = 16;

    /* JADX INFO: renamed from: c */
    public int f49634c;

    /* JADX INFO: renamed from: e */
    public int f49636e;

    /* JADX INFO: renamed from: g */
    public int f49638g;

    /* JADX INFO: renamed from: h */
    public int f49639h;

    /* JADX INFO: renamed from: i */
    public int f49640i;

    /* JADX INFO: renamed from: b */
    @yfb
    public w5c[] f49633b = new w5c[16];

    /* JADX INFO: renamed from: d */
    @yfb
    public int[] f49635d = new int[16];

    /* JADX INFO: renamed from: f */
    @yfb
    public Object[] f49637f = new Object[16];

    /* JADX INFO: renamed from: j6c$a */
    public static final class C7757a {
        public /* synthetic */ C7757a(jt3 jt3Var) {
            this();
        }

        private C7757a() {
        }
    }

    /* JADX INFO: renamed from: j6c$b */
    public final class C7758b implements a6c {

        /* JADX INFO: renamed from: a */
        public int f49641a;

        /* JADX INFO: renamed from: b */
        public int f49642b;

        /* JADX INFO: renamed from: c */
        public int f49643c;

        public C7758b() {
        }

        @Override // p000.a6c
        /* JADX INFO: renamed from: getInt-w8GmfQM */
        public int mo27190getIntw8GmfQM(int i) {
            return j6c.this.f49635d[this.f49642b + i];
        }

        @Override // p000.a6c
        /* JADX INFO: renamed from: getObject-31yXWZQ */
        public <T> T mo27191getObject31yXWZQ(int i) {
            return (T) j6c.this.f49637f[this.f49643c + i];
        }

        @yfb
        public final w5c getOperation() {
            w5c w5cVar = j6c.this.f49633b[this.f49641a];
            md8.checkNotNull(w5cVar);
            return w5cVar;
        }

        public final boolean next() {
            if (this.f49641a >= j6c.this.f49634c) {
                return false;
            }
            w5c operation = getOperation();
            this.f49642b += operation.getInts();
            this.f49643c += operation.getObjects();
            int i = this.f49641a + 1;
            this.f49641a = i;
            return i < j6c.this.f49634c;
        }
    }

    /* JADX INFO: renamed from: j6c$c */
    @vn8
    @dwf({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,475:1\n50#2,7:476\n50#2,7:483\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations$WriteScope\n*L\n335#1:476,7\n344#1:483,7\n*E\n"})
    public static final class C7759c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final j6c f49645a;

        private /* synthetic */ C7759c(j6c j6cVar) {
            this.f49645a = j6cVar;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ C7759c m30464boximpl(j6c j6cVar) {
            return new C7759c(j6cVar);
        }

        @yfb
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static j6c m30465constructorimpl(@yfb j6c j6cVar) {
            return j6cVar;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m30466equalsimpl(j6c j6cVar, Object obj) {
            return (obj instanceof C7759c) && md8.areEqual(j6cVar, ((C7759c) obj).m30473unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m30467equalsimpl0(j6c j6cVar, j6c j6cVar2) {
            return md8.areEqual(j6cVar, j6cVar2);
        }

        @yfb
        /* JADX INFO: renamed from: getOperation-impl, reason: not valid java name */
        public static final w5c m30468getOperationimpl(j6c j6cVar) {
            return j6cVar.peekOperation();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m30469hashCodeimpl(j6c j6cVar) {
            return j6cVar.hashCode();
        }

        /* JADX INFO: renamed from: setInt-A6tL2VI, reason: not valid java name */
        public static final void m30470setIntA6tL2VI(j6c j6cVar, int i, int i2) {
            int i3 = 1 << i;
            if (!((j6cVar.f49639h & i3) == 0)) {
                a8d.throwIllegalStateException("Already pushed argument " + m30468getOperationimpl(j6cVar).mo32877intParamNamew8GmfQM(i));
            }
            j6cVar.f49639h |= i3;
            j6cVar.f49635d[j6cVar.m30462topIntIndexOfw8GmfQM(i)] = i2;
        }

        /* JADX INFO: renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m30471setObjectDKhxnng(j6c j6cVar, int i, T t) {
            int i2 = 1 << i;
            if (!((j6cVar.f49640i & i2) == 0)) {
                a8d.throwIllegalStateException("Already pushed argument " + m30468getOperationimpl(j6cVar).mo32878objectParamName31yXWZQ(i));
            }
            j6cVar.f49640i |= i2;
            j6cVar.f49637f[j6cVar.m30463topObjectIndexOf31yXWZQ(i)] = t;
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m30472toStringimpl(j6c j6cVar) {
            return "WriteScope(stack=" + j6cVar + ')';
        }

        public boolean equals(Object obj) {
            return m30466equalsimpl(this.f49645a, obj);
        }

        public int hashCode() {
            return m30469hashCodeimpl(this.f49645a);
        }

        public String toString() {
            return m30472toStringimpl(this.f49645a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ j6c m30473unboximpl() {
            return this.f49645a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: j6c$d */
    public static final class C7760d<T> extends tt8 implements qy6<T, CharSequence> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f49647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7760d(String str) {
            super(1);
            this.f49647b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final CharSequence invoke(T t) {
            return j6c.this.formatOpArgumentToString(t, this.f49647b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int createExpectedArgMask(int i) {
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    private final String currentOpToDebugString(C7758b c7758b, String str) {
        w5c operation = c7758b.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String strIndent = indent(str);
        int ints = operation.getInts();
        boolean z = true;
        for (int i = 0; i < ints; i++) {
            int iM32916constructorimpl = w5c.C14424q.m32916constructorimpl(i);
            String strMo32877intParamNamew8GmfQM = operation.mo32877intParamNamew8GmfQM(iM32916constructorimpl);
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            md8.checkNotNullExpressionValue(sb, "append('\\n')");
            sb.append(strIndent);
            sb.append(strMo32877intParamNamew8GmfQM);
            sb.append(" = ");
            sb.append(c7758b.mo27190getIntw8GmfQM(iM32916constructorimpl));
        }
        int objects = operation.getObjects();
        for (int i2 = 0; i2 < objects; i2++) {
            int iM32927constructorimpl = w5c.C14427t.m32927constructorimpl(i2);
            String strMo32878objectParamName31yXWZQ = operation.mo32878objectParamName31yXWZQ(iM32927constructorimpl);
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            md8.checkNotNullExpressionValue(sb, "append('\\n')");
            sb.append(strIndent);
            sb.append(strMo32878objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(c7758b.mo27191getObject31yXWZQ(iM32927constructorimpl), strIndent));
        }
        sb.append('\n');
        md8.checkNotNullExpressionValue(sb, "append('\\n')");
        sb.append(str);
        sb.append(c0b.f15434d);
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private final int determineNewSize(int i, int i2) {
        return kpd.coerceAtLeast(i + kpd.coerceAtMost(i, 1024), i2);
    }

    private final void ensureIntArgsSizeAtLeast(int i) {
        int[] iArr = this.f49635d;
        int length = iArr.length;
        if (i > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, determineNewSize(length, i));
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f49635d = iArrCopyOf;
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i) {
        Object[] objArr = this.f49637f;
        int length = objArr.length;
        if (i > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, determineNewSize(length, i));
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49637f = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatOpArgumentToString(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? toCollectionString(e80.asIterable((Object[]) obj), str) : obj instanceof int[] ? toCollectionString(e80.asIterable((int[]) obj), str) : obj instanceof long[] ? toCollectionString(e80.asIterable((long[]) obj), str) : obj instanceof float[] ? toCollectionString(e80.asIterable((float[]) obj), str) : obj instanceof double[] ? toCollectionString(e80.asIterable((double[]) obj), str) : obj instanceof Iterable ? toCollectionString((Iterable) obj, str) : obj instanceof k6c ? ((k6c) obj).toDebugString(str) : obj.toString();
    }

    private final String indent(String str) {
        return str + pl8.f71328a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w5c peekOperation() {
        w5c w5cVar = this.f49633b[this.f49634c - 1];
        md8.checkNotNull(w5cVar);
        return w5cVar;
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, String str) {
        return v82.joinToString$default(iterable, ", ", "[", "]", 0, null, new C7760d(str), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: topIntIndexOf-w8GmfQM, reason: not valid java name */
    public final int m30462topIntIndexOfw8GmfQM(int i) {
        return (this.f49636e - peekOperation().getInts()) + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    public final int m30463topObjectIndexOf31yXWZQ(int i) {
        return (this.f49638g - peekOperation().getObjects()) + i;
    }

    public final void clear() {
        this.f49634c = 0;
        this.f49636e = 0;
        u70.fill(this.f49637f, (Object) null, 0, this.f49638g);
        this.f49638g = 0;
    }

    public final void drain(@yfb qy6<? super C7758b, bth> qy6Var) {
        if (isNotEmpty()) {
            C7758b c7758b = new C7758b();
            do {
                qy6Var.invoke(c7758b);
            } while (c7758b.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(@yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
        if (isNotEmpty()) {
            C7758b c7758b = new C7758b();
            do {
                c7758b.getOperation().execute(c7758b, p40Var, prfVar, dydVar);
            } while (c7758b.next());
        }
        clear();
    }

    public final void forEach(@yfb qy6<? super C7758b, bth> qy6Var) {
        if (isNotEmpty()) {
            C7758b c7758b = new C7758b();
            do {
                qy6Var.invoke(c7758b);
            } while (c7758b.next());
        }
    }

    public final int getSize() {
        return this.f49634c;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        w5c[] w5cVarArr = this.f49633b;
        int i = this.f49634c - 1;
        this.f49634c = i;
        w5c w5cVar = w5cVarArr[i];
        md8.checkNotNull(w5cVar);
        this.f49633b[this.f49634c] = null;
        int objects = w5cVar.getObjects();
        for (int i2 = 0; i2 < objects; i2++) {
            Object[] objArr = this.f49637f;
            int i3 = this.f49638g - 1;
            this.f49638g = i3;
            objArr[i3] = null;
        }
        int ints = w5cVar.getInts();
        for (int i4 = 0; i4 < ints; i4++) {
            int[] iArr = this.f49635d;
            int i5 = this.f49636e - 1;
            this.f49636e = i5;
            iArr[i5] = 0;
        }
    }

    public final void popInto(@yfb j6c j6cVar) {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        w5c[] w5cVarArr = this.f49633b;
        int i = this.f49634c - 1;
        this.f49634c = i;
        w5c w5cVar = w5cVarArr[i];
        md8.checkNotNull(w5cVar);
        this.f49633b[this.f49634c] = null;
        j6cVar.pushOp(w5cVar);
        int i2 = this.f49638g;
        int i3 = j6cVar.f49638g;
        int objects = w5cVar.getObjects();
        for (int i4 = 0; i4 < objects; i4++) {
            i3--;
            i2--;
            Object[] objArr = j6cVar.f49637f;
            Object[] objArr2 = this.f49637f;
            objArr[i3] = objArr2[i2];
            objArr2[i2] = null;
        }
        int i5 = this.f49636e;
        int i6 = j6cVar.f49636e;
        int ints = w5cVar.getInts();
        for (int i7 = 0; i7 < ints; i7++) {
            i6--;
            i5--;
            int[] iArr = j6cVar.f49635d;
            int[] iArr2 = this.f49635d;
            iArr[i6] = iArr2[i5];
            iArr2[i5] = 0;
        }
        this.f49638g -= w5cVar.getObjects();
        this.f49636e -= w5cVar.getInts();
    }

    public final void push(@yfb w5c w5cVar) {
        if (!(w5cVar.getInts() == 0 && w5cVar.getObjects() == 0)) {
            a8d.throwIllegalArgumentException("Cannot push " + w5cVar + " without arguments because it expects " + w5cVar.getInts() + " ints and " + w5cVar.getObjects() + " objects.");
        }
        pushOp(w5cVar);
    }

    @ga8
    public final void pushOp(@yfb w5c w5cVar) {
        this.f49639h = 0;
        this.f49640i = 0;
        int i = this.f49634c;
        if (i == this.f49633b.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f49633b, this.f49634c + kpd.coerceAtMost(i, 1024));
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f49633b = (w5c[]) objArrCopyOf;
        }
        ensureIntArgsSizeAtLeast(this.f49636e + w5cVar.getInts());
        ensureObjectArgsSizeAtLeast(this.f49638g + w5cVar.getObjects());
        w5c[] w5cVarArr = this.f49633b;
        int i2 = this.f49634c;
        this.f49634c = i2 + 1;
        w5cVarArr[i2] = w5cVar;
        this.f49636e += w5cVar.getInts();
        this.f49638g += w5cVar.getObjects();
    }

    @Override // p000.k6c
    @yfb
    public String toDebugString(@yfb String str) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            C7758b c7758b = new C7758b();
            int i = 1;
            while (true) {
                sb.append(str);
                int i2 = i + 1;
                sb.append(i);
                sb.append(". ");
                sb.append(currentOpToDebugString(c7758b, str));
                md8.checkNotNullExpressionValue(sb, "append(value)");
                sb.append('\n');
                md8.checkNotNullExpressionValue(sb, "append('\\n')");
                if (!c7758b.next()) {
                    break;
                }
                i = i2;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @yfb
    @q64(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @i2e(expression = "toDebugString()", imports = {}))
    public String toString() {
        return super.toString();
    }

    public final void push(@yfb w5c w5cVar, @yfb qy6<? super C7759c, bth> qy6Var) {
        pushOp(w5cVar);
        qy6Var.invoke(C7759c.m30464boximpl(C7759c.m30465constructorimpl(this)));
        if (this.f49639h == createExpectedArgMask(w5cVar.getInts()) && this.f49640i == createExpectedArgMask(w5cVar.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = w5cVar.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & this.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(w5cVar.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = w5cVar.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & this.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(w5cVar.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + w5cVar + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }
}
