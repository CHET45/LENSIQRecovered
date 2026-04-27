package p000;

import p000.j6c;
import p000.w5c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFixupList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 4 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertNodeFixup\n+ 5 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n*L\n1#1,91:1\n4551#2,7:92\n4551#2,7:184\n166#3,5:99\n174#3,2:107\n173#3:109\n177#3,25:115\n203#3:141\n166#3,5:142\n174#3,2:149\n173#3:151\n177#3,25:157\n203#3:183\n166#3,5:191\n174#3,2:198\n173#3:200\n177#3,25:206\n203#3:232\n563#4:104\n564#4:105\n565#4:106\n50#5,5:110\n56#5:140\n50#5,5:152\n56#5:182\n50#5,5:201\n56#5:231\n595#6:147\n596#6:148\n433#7:196\n434#7:197\n*S KotlinDebug\n*F\n+ 1 FixupList.kt\nandroidx/compose/runtime/changelist/FixupList\n*L\n46#1:92,7\n71#1:184,7\n58#1:99,5\n58#1:107,2\n58#1:109\n58#1:115,25\n58#1:141\n64#1:142,5\n64#1:149,2\n64#1:151\n64#1:157,25\n64#1:183\n78#1:191,5\n78#1:198,2\n78#1:200\n78#1:206,25\n78#1:232\n59#1:104\n60#1:105\n61#1:106\n58#1:110,5\n58#1:140\n64#1:152,5\n64#1:182\n78#1:201,5\n78#1:231\n65#1:147\n66#1:148\n79#1:196\n80#1:197\n*E\n"})
@e0g(parameters = 0)
public final class l26 extends k6c {

    /* JADX INFO: renamed from: d */
    public static final int f55991d = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final j6c f55992b = new j6c();

    /* JADX INFO: renamed from: c */
    @yfb
    public final j6c f55993c = new j6c();

    public final void clear() {
        this.f55993c.clear();
        this.f55992b.clear();
    }

    public final void createAndInsertNode(@yfb ny6<? extends Object> ny6Var, int i, @yfb C5897fo c5897fo) {
        j6c j6cVar;
        j6c j6cVar2;
        j6c j6cVar3 = this.f55992b;
        w5c.C14421n c14421n = w5c.C14421n.f93346d;
        j6cVar3.pushOp(c14421n);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar3);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), ny6Var);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(0), i);
        int i2 = 1;
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), c5897fo);
        if (!(j6cVar3.f49639h == j6cVar3.createExpectedArgMask(c14421n.getInts()) && j6cVar3.f49640i == j6cVar3.createExpectedArgMask(c14421n.getObjects()))) {
            StringBuilder sb = new StringBuilder();
            int ints = c14421n.getInts();
            int i3 = 0;
            int i4 = 0;
            while (i4 < ints) {
                if (((i2 << i4) & j6cVar3.f49639h) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c14421n.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i4)));
                    i3++;
                }
                i4++;
                i2 = 1;
            }
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int objects = c14421n.getObjects();
            int i5 = 0;
            int i6 = 0;
            while (i6 < objects) {
                if (((1 << i6) & j6cVar3.f49640i) != 0) {
                    if (i3 > 0) {
                        sb2.append(", ");
                    }
                    j6cVar2 = j6cVar3;
                    sb2.append(c14421n.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i6)));
                    i5++;
                } else {
                    j6cVar2 = j6cVar3;
                }
                i6++;
                j6cVar3 = j6cVar2;
            }
            String string2 = sb2.toString();
            md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            a8d.throwIllegalStateException("Error while pushing " + c14421n + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
        }
        j6c j6cVar4 = this.f55993c;
        w5c.C14428u c14428u = w5c.C14428u.f93358d;
        j6cVar4.pushOp(c14428u);
        j6c j6cVarM30465constructorimpl2 = j6c.C7759c.m30465constructorimpl(j6cVar4);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl2, w5c.C14424q.m32916constructorimpl(0), i);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl2, w5c.C14427t.m32927constructorimpl(0), c5897fo);
        if (j6cVar4.f49639h == j6cVar4.createExpectedArgMask(c14428u.getInts()) && j6cVar4.f49640i == j6cVar4.createExpectedArgMask(c14428u.getObjects())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int ints2 = c14428u.getInts();
        int i7 = 0;
        for (int i8 = 0; i8 < ints2; i8++) {
            if (((1 << i8) & j6cVar4.f49639h) != 0) {
                if (i7 > 0) {
                    sb3.append(", ");
                }
                sb3.append(c14428u.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i8)));
                i7++;
            }
        }
        String string3 = sb3.toString();
        md8.checkNotNullExpressionValue(string3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder();
        int objects2 = c14428u.getObjects();
        int i9 = 0;
        int i10 = 0;
        while (i10 < objects2) {
            if (((1 << i10) & j6cVar4.f49640i) != 0) {
                if (i7 > 0) {
                    sb4.append(", ");
                }
                j6cVar = j6cVar4;
                sb4.append(c14428u.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i10)));
                i9++;
            } else {
                j6cVar = j6cVar4;
            }
            i10++;
            j6cVar4 = j6cVar;
        }
        String string4 = sb4.toString();
        md8.checkNotNullExpressionValue(string4, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14428u + ". Not all arguments were provided. Missing " + i7 + " int arguments (" + string3 + ") and " + i9 + " object arguments (" + string4 + ").");
    }

    public final void endNodeInsert() {
        if (!this.f55993c.isNotEmpty()) {
            gm2.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.f55993c.popInto(this.f55992b);
    }

    public final void executeAndFlushAllPendingFixups(@yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
        if (!this.f55993c.isEmpty()) {
            gm2.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.f55992b.executeAndFlushAllPendingOperations(p40Var, prfVar, dydVar);
    }

    public final int getSize() {
        return this.f55992b.getSize();
    }

    public final boolean isEmpty() {
        return this.f55992b.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.f55992b.isNotEmpty();
    }

    @Override // p000.k6c
    @yfb
    public String toDebugString(@yfb String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.f55992b.toDebugString(str));
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final <V, T> void updateNode(V v, @yfb gz6<? super T, ? super V, bth> gz6Var) {
        j6c j6cVar = this.f55992b;
        w5c.C14411g0 c14411g0 = w5c.C14411g0.f93326d;
        j6cVar.pushOp(c14411g0);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), v);
        int iM32927constructorimpl = w5c.C14427t.m32927constructorimpl(1);
        md8.checkNotNull(gz6Var, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, iM32927constructorimpl, (gz6) qlh.beforeCheckcastToFunctionOfArity(gz6Var, 2));
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14411g0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14411g0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14411g0.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14411g0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14411g0.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14411g0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14411g0 + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }
}
