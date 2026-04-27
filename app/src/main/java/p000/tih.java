package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tih {

    /* JADX INFO: renamed from: a */
    public static final int f85003a = 32;

    /* JADX INFO: renamed from: b */
    public static final int f85004b = 5;

    /* JADX INFO: renamed from: c */
    public static final int f85005c = 31;

    /* JADX INFO: renamed from: d */
    public static final int f85006d = 30;

    /* JADX INFO: renamed from: tih$a */
    @dwf({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n*L\n1#1,851:1\n*E\n"})
    public static final class C13065a extends tt8 implements qy6<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C13065a f85007a = new C13065a();

        public C13065a() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@gib Object obj) {
            return Boolean.valueOf(obj != oih.f67755d.getEMPTY$runtime_release());
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m22678a(Object[] objArr, Object[] objArr2, int i, qy6 qy6Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            qy6Var = C13065a.f85007a;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < objArr.length) {
            ec2.m28824assert(i4 <= i3);
            if (((Boolean) qy6Var.invoke(objArr[i3])).booleanValue()) {
                objArr2[i + i4] = objArr[i3];
                i4++;
                ec2.m28824assert(i + i4 <= objArr2.length);
            }
            i3++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i, E e) {
        Object[] objArr2 = new Object[objArr.length + 1];
        u70.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
        u70.copyInto(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = e;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i, qy6<Object, Boolean> qy6Var) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            ec2.m28824assert(i3 <= i2);
            if (qy6Var.invoke(objArr[i2]).booleanValue()) {
                objArr2[i + i3] = objArr[i2];
                i3++;
                ec2.m28824assert(i + i3 <= objArr2.length);
            }
            i2++;
        }
        return i3;
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        u70.copyInto$default(objArr, objArr2, 0, 0, i, 6, (Object) null);
        u70.copyInto(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
