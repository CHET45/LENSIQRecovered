package p000;

import java.util.Arrays;
import p000.AbstractC9123m4;
import p000.v7e;

/* JADX INFO: renamed from: k4 */
/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n27#2:131\n27#2:133\n27#2:136\n16#3:132\n16#3:134\n16#3:137\n1#4:135\n13346#5,2:138\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n27#1:131\n42#1:133\n73#1:136\n27#1:132\n42#1:134\n73#1:137\n92#1:138,2\n*E\n"})
public abstract class AbstractC8190k4<S extends AbstractC9123m4<?>> {

    /* JADX INFO: renamed from: a */
    @gib
    public S[] f52549a;

    /* JADX INFO: renamed from: b */
    public int f52550b;

    /* JADX INFO: renamed from: c */
    public int f52551c;

    /* JADX INFO: renamed from: d */
    @gib
    public idg f52552d;

    @yfb
    /* JADX INFO: renamed from: a */
    public final S m14486a() {
        S s;
        idg idgVar;
        synchronized (this) {
            try {
                S[] sArr = this.f52549a;
                if (sArr == null) {
                    sArr = (S[]) createSlotArray(2);
                    this.f52549a = sArr;
                } else if (this.f52550b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f52549a = (S[]) ((AbstractC9123m4[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC9123m4[]) objArrCopyOf);
                }
                int i = this.f52551c;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) createSlot();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    md8.checkNotNull(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s.allocateLocked(this));
                this.f52551c = i;
                this.f52550b++;
                idgVar = this.f52552d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (idgVar != null) {
            idgVar.increment(1);
        }
        return s;
    }

    /* JADX INFO: renamed from: b */
    public final void m14487b(@yfb qy6<? super S, bth> qy6Var) {
        AbstractC9123m4[] abstractC9123m4Arr;
        if (this.f52550b == 0 || (abstractC9123m4Arr = this.f52549a) == null) {
            return;
        }
        for (AbstractC9123m4 abstractC9123m4 : abstractC9123m4Arr) {
            if (abstractC9123m4 != null) {
                qy6Var.invoke(abstractC9123m4);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14488c(@yfb S s) {
        idg idgVar;
        int i;
        zy2<bth>[] zy2VarArrFreeLocked;
        synchronized (this) {
            try {
                int i2 = this.f52550b - 1;
                this.f52550b = i2;
                idgVar = this.f52552d;
                if (i2 == 0) {
                    this.f52551c = 0;
                }
                md8.checkNotNull(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                zy2VarArrFreeLocked = s.freeLocked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (zy2<bth> zy2Var : zy2VarArrFreeLocked) {
            if (zy2Var != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            }
        }
        if (idgVar != null) {
            idgVar.increment(-1);
        }
    }

    @yfb
    public abstract S createSlot();

    @yfb
    public abstract S[] createSlotArray(int i);

    /* JADX INFO: renamed from: d */
    public final int m14489d() {
        return this.f52550b;
    }

    @gib
    /* JADX INFO: renamed from: e */
    public final S[] m14490e() {
        return this.f52549a;
    }

    @yfb
    public final l2g<Integer> getSubscriptionCount() {
        idg idgVar;
        synchronized (this) {
            idgVar = this.f52552d;
            if (idgVar == null) {
                idgVar = new idg(this.f52550b);
                this.f52552d = idgVar;
            }
        }
        return idgVar;
    }
}
