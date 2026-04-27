package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ug5
@e0g(parameters = 0)
public final class lm0 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C8893a f58196e = new C8893a(null);

    /* JADX INFO: renamed from: f */
    public static final int f58197f = 8;

    /* JADX INFO: renamed from: g */
    public static int f58198g;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<nm0> f58199a;

    /* JADX INFO: renamed from: b */
    @gib
    public rud f58200b;

    /* JADX INFO: renamed from: c */
    @gib
    public final qy6<String, bth> f58201c;

    /* JADX INFO: renamed from: d */
    public final int f58202d;

    /* JADX INFO: renamed from: lm0$a */
    @dwf({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,105:1\n36#2:106\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:106\n*E\n"})
    public static final class C8893a {
        public /* synthetic */ C8893a(jt3 jt3Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i;
            synchronized (this) {
                C8893a c8893a = lm0.f58196e;
                lm0.f58198g++;
                i = lm0.f58198g;
            }
            return i;
        }

        private C8893a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lm0(@yfb List<? extends nm0> list, @gib rud rudVar, @gib qy6<? super String, bth> qy6Var) {
        this.f58199a = list;
        this.f58200b = rudVar;
        this.f58201c = qy6Var;
        this.f58202d = f58196e.generateId();
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm0)) {
            return false;
        }
        lm0 lm0Var = (lm0) obj;
        return md8.areEqual(this.f58199a, lm0Var.f58199a) && md8.areEqual(this.f58200b, lm0Var.f58200b) && this.f58201c == lm0Var.f58201c;
    }

    @yfb
    public final List<nm0> getAutofillTypes() {
        return this.f58199a;
    }

    @gib
    public final rud getBoundingBox() {
        return this.f58200b;
    }

    public final int getId() {
        return this.f58202d;
    }

    @gib
    public final qy6<String, bth> getOnFill() {
        return this.f58201c;
    }

    public int hashCode() {
        int iHashCode = this.f58199a.hashCode() * 31;
        rud rudVar = this.f58200b;
        int iHashCode2 = (iHashCode + (rudVar != null ? rudVar.hashCode() : 0)) * 31;
        qy6<String, bth> qy6Var = this.f58201c;
        return iHashCode2 + (qy6Var != null ? qy6Var.hashCode() : 0);
    }

    public final void setBoundingBox(@gib rud rudVar) {
        this.f58200b = rudVar;
    }

    public /* synthetic */ lm0(List list, rud rudVar, qy6 qy6Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? l82.emptyList() : list, (i & 2) != 0 ? null : rudVar, qy6Var);
    }
}
