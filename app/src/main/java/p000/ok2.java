package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n113#1:194,2\n*E\n"})
public final class ok2 implements nk2 {

    /* JADX INFO: renamed from: m */
    public static final int f67884m = 0;

    /* JADX INFO: renamed from: a */
    public final int f67885a;

    /* JADX INFO: renamed from: b */
    public final boolean f67886b;

    /* JADX INFO: renamed from: c */
    public final int f67887c;

    /* JADX INFO: renamed from: d */
    @gib
    public Object f67888d;

    /* JADX INFO: renamed from: e */
    @gib
    public rsd f67889e;

    /* JADX INFO: renamed from: f */
    @gib
    public List<rsd> f67890f;

    /* JADX INFO: renamed from: ok2$a */
    @dwf({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,193:1\n37#2,2:194\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n124#1:194,2\n*E\n"})
    public static final class C10397a extends tt8 implements gz6<zl2, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f67891a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f67892b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ok2 f67893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10397a(Object[] objArr, int i, ok2 ok2Var) {
            super(2);
            this.f67891a = objArr;
            this.f67892b = i;
            this.f67893c = ok2Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(zl2 zl2Var, Integer num) {
            invoke(zl2Var, num.intValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb zl2 zl2Var, int i) {
            Object[] array = e80.slice(this.f67891a, kpd.until(0, this.f67892b)).toArray(new Object[0]);
            Object obj = this.f67891a[this.f67892b + 1];
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            int iUpdateChangedFlags = tsd.updateChangedFlags(((Integer) obj).intValue());
            int length = (this.f67891a.length - this.f67892b) - 2;
            Object[] objArr = new Object[length];
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = this.f67891a[this.f67892b + 2 + i2];
                md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                objArr[i2] = Integer.valueOf(tsd.updateChangedFlags(((Integer) obj2).intValue()));
            }
            ok2 ok2Var = this.f67893c;
            fzf fzfVar = new fzf(4);
            fzfVar.addSpread(array);
            fzfVar.add(zl2Var);
            fzfVar.add(Integer.valueOf(iUpdateChangedFlags | 1));
            fzfVar.addSpread(objArr);
            ok2Var.invoke(fzfVar.toArray(new Object[fzfVar.size()]));
        }
    }

    public ok2(int i, boolean z, int i2) {
        this.f67885a = i;
        this.f67886b = z;
        this.f67887c = i2;
    }

    private final int realParamCount(int i) {
        int i2 = i - 2;
        for (int i3 = 1; i3 * 10 < i2; i3++) {
            i2--;
        }
        return i2;
    }

    private final void trackRead(zl2 zl2Var) {
        rsd recomposeScope;
        if (!this.f67886b || (recomposeScope = zl2Var.getRecomposeScope()) == null) {
            return;
        }
        zl2Var.recordUsed(recomposeScope);
        if (mk2.replacableWith(this.f67889e, recomposeScope)) {
            this.f67889e = recomposeScope;
            return;
        }
        List<rsd> list = this.f67890f;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f67890f = arrayList;
            arrayList.add(recomposeScope);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (mk2.replacableWith(list.get(i), recomposeScope)) {
                list.set(i, recomposeScope);
                return;
            }
        }
        list.add(recomposeScope);
    }

    private final void trackWrite() {
        if (this.f67886b) {
            rsd rsdVar = this.f67889e;
            if (rsdVar != null) {
                rsdVar.invalidate();
                this.f67889e = null;
            }
            List<rsd> list = this.f67890f;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // p000.l07, p000.h07
    public int getArity() {
        return this.f67887c;
    }

    public final int getKey() {
        return this.f67885a;
    }

    @Override // p000.l07
    @gib
    public Object invoke(@yfb Object... objArr) {
        int iRealParamCount = realParamCount(objArr.length);
        Object obj = objArr[iRealParamCount];
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = e80.slice(objArr, kpd.until(0, objArr.length - 1)).toArray(new Object[0]);
        Object obj2 = objArr[objArr.length - 1];
        md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        zl2 zl2VarStartRestartGroup = ((zl2) obj).startRestartGroup(this.f67885a);
        trackRead(zl2VarStartRestartGroup);
        int iDifferentBits = iIntValue | (zl2VarStartRestartGroup.changed(this) ? mk2.differentBits(iRealParamCount) : mk2.sameBits(iRealParamCount));
        Object obj3 = this.f67888d;
        md8.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        fzf fzfVar = new fzf(2);
        fzfVar.addSpread(array);
        fzfVar.add(Integer.valueOf(iDifferentBits));
        Object objInvoke = ((l07) obj3).invoke(fzfVar.toArray(new Object[fzfVar.size()]));
        are areVarEndRestartGroup = zl2VarStartRestartGroup.endRestartGroup();
        if (areVarEndRestartGroup != null) {
            areVarEndRestartGroup.updateScope(new C10397a(objArr, iRealParamCount, this));
        }
        return objInvoke;
    }

    public final void update(@yfb Object obj) {
        if (md8.areEqual(obj, this.f67888d)) {
            return;
        }
        boolean z = this.f67888d == null;
        md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this.f67888d = (l07) obj;
        if (z) {
            return;
        }
        trackWrite();
    }
}
