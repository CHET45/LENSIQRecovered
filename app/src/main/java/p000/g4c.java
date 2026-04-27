package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,98:1\n1208#2:99\n1187#2,2:100\n728#3,2:102\n728#3,2:104\n523#3:106\n460#3,11:108\n203#4:107\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:99\n26#1:100,2\n32#1:102,2\n42#1:104,2\n61#1:106\n79#1:108,11\n79#1:107\n*E\n"})
@e0g(parameters = 0)
public final class g4c {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C6124a f38720c = new C6124a(null);

    /* JADX INFO: renamed from: d */
    public static final int f38721d = 8;

    /* JADX INFO: renamed from: e */
    public static final int f38722e = 16;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<lw8> f38723a = new f7b<>(new lw8[16], 0);

    /* JADX INFO: renamed from: b */
    @gib
    public lw8[] f38724b;

    /* JADX INFO: renamed from: g4c$a */
    public static final class C6124a {

        /* JADX INFO: renamed from: g4c$a$a */
        public static final class a implements Comparator<lw8> {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final a f38725a = new a();

            private a() {
            }

            @Override // java.util.Comparator
            public int compare(@yfb lw8 lw8Var, @yfb lw8 lw8Var2) {
                int iCompare = md8.compare(lw8Var2.getDepth$ui_release(), lw8Var.getDepth$ui_release());
                return iCompare != 0 ? iCompare : md8.compare(lw8Var.hashCode(), lw8Var2.hashCode());
            }
        }

        public /* synthetic */ C6124a(jt3 jt3Var) {
            this();
        }

        private C6124a() {
        }
    }

    private final void dispatchHierarchy(lw8 lw8Var) {
        lw8Var.dispatchOnPositionedCallbacks$ui_release();
        int i = 0;
        lw8Var.setNeedsOnPositionedDispatch$ui_release(false);
        f7b<lw8> f7bVar = lw8Var.get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            do {
                dispatchHierarchy(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void dispatch() {
        this.f38723a.sortWith(C6124a.a.f38725a);
        int size = this.f38723a.getSize();
        lw8[] lw8VarArr = this.f38724b;
        if (lw8VarArr == null || lw8VarArr.length < size) {
            lw8VarArr = new lw8[Math.max(16, this.f38723a.getSize())];
        }
        this.f38724b = null;
        for (int i = 0; i < size; i++) {
            lw8VarArr[i] = this.f38723a.getContent()[i];
        }
        this.f38723a.clear();
        while (true) {
            size--;
            if (-1 >= size) {
                this.f38724b = lw8VarArr;
                return;
            }
            lw8 lw8Var = lw8VarArr[size];
            md8.checkNotNull(lw8Var);
            if (lw8Var.getNeedsOnPositionedDispatch$ui_release()) {
                dispatchHierarchy(lw8Var);
            }
        }
    }

    public final boolean isNotEmpty() {
        return this.f38723a.isNotEmpty();
    }

    public final void onNodePositioned(@yfb lw8 lw8Var) {
        this.f38723a.add(lw8Var);
        lw8Var.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(@yfb lw8 lw8Var) {
        this.f38723a.clear();
        this.f38723a.add(lw8Var);
        lw8Var.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void remove(@yfb lw8 lw8Var) {
        this.f38723a.remove(lw8Var);
    }
}
