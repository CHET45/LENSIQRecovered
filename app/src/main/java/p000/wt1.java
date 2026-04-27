package p000;

import java.util.List;
import p000.j6c;
import p000.w5c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 8 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,326:1\n166#2,5:327\n174#2,2:333\n173#2:335\n177#2,25:341\n203#2:367\n166#2,5:368\n174#2,2:375\n173#2:377\n177#2,25:383\n203#2:409\n166#2,5:410\n174#2,2:418\n173#2:420\n177#2,25:426\n203#2:452\n166#2,5:453\n174#2,2:460\n173#2:462\n177#2,25:468\n203#2:494\n166#2,5:495\n174#2,2:501\n173#2:503\n177#2,25:509\n203#2:535\n166#2,5:536\n174#2,2:542\n173#2:544\n177#2,25:550\n203#2:576\n166#2,5:577\n174#2,2:583\n173#2:585\n177#2,25:591\n203#2:617\n166#2,5:618\n174#2,2:625\n173#2:627\n177#2,25:633\n203#2:659\n166#2,5:660\n174#2,2:668\n173#2:670\n177#2,25:676\n203#2:702\n166#2,5:703\n174#2,2:709\n173#2:711\n177#2,25:717\n203#2:743\n166#2,5:744\n174#2,2:751\n173#2:753\n177#2,25:759\n203#2:785\n166#2,5:786\n174#2,2:793\n173#2:795\n177#2,25:801\n203#2:827\n166#2,5:828\n174#2,2:835\n173#2:837\n177#2,25:843\n203#2:869\n166#2,5:870\n174#2,2:878\n173#2:880\n177#2,25:886\n203#2:912\n166#2,5:913\n174#2,2:919\n173#2:921\n177#2,25:927\n203#2:953\n166#2,5:954\n174#2,2:960\n173#2:962\n177#2,25:968\n203#2:994\n166#2,5:995\n174#2,2:1001\n173#2:1003\n177#2,25:1009\n203#2:1035\n166#2,5:1036\n174#2,2:1042\n173#2:1044\n177#2,25:1050\n203#2:1076\n166#2,5:1077\n174#2,2:1084\n173#2:1086\n177#2,25:1092\n203#2:1118\n166#2,5:1119\n174#2,2:1126\n173#2:1128\n177#2,25:1134\n203#2:1160\n166#2,5:1161\n174#2,2:1170\n173#2:1172\n177#2,25:1178\n203#2:1204\n166#2,5:1205\n174#2,2:1213\n173#2:1215\n177#2,25:1221\n203#2:1247\n166#2,5:1248\n174#2,2:1255\n173#2:1257\n177#2,25:1263\n203#2:1289\n152#3:332\n50#4,5:336\n56#4:366\n50#4,5:378\n56#4:408\n50#4,5:421\n56#4:451\n50#4,5:463\n56#4:493\n50#4,5:504\n56#4:534\n50#4,5:545\n56#4:575\n50#4,5:586\n56#4:616\n50#4,5:628\n56#4:658\n50#4,5:671\n56#4:701\n50#4,5:712\n56#4:742\n50#4,5:754\n56#4:784\n50#4,5:796\n56#4:826\n50#4,5:838\n56#4:868\n50#4,5:881\n56#4:911\n50#4,5:922\n56#4:952\n50#4,5:963\n56#4:993\n50#4,5:1004\n56#4:1034\n50#4,5:1045\n56#4:1075\n50#4,5:1087\n56#4:1117\n50#4,5:1129\n56#4:1159\n50#4,5:1173\n56#4:1203\n50#4,5:1216\n56#4:1246\n50#4,5:1258\n56#4:1288\n223#5:373\n224#5:374\n262#6:415\n263#6:416\n264#6:417\n169#7:458\n170#7:459\n193#8:500\n310#9:541\n337#10:582\n501#11:623\n502#11:624\n529#12:665\n530#12:666\n531#12:667\n364#13:708\n401#14:749\n402#14:750\n433#15:791\n434#15:792\n454#16:833\n455#16:834\n477#17:875\n476#17:876\n478#17:877\n116#18:918\n77#19:959\n94#20:1000\n135#21:1041\n646#22:1082\n647#22:1083\n675#23:1124\n674#23:1125\n701#24:1166\n702#24:1167\n704#24:1168\n703#24:1169\n762#25:1210\n763#25:1211\n764#25:1212\n788#26:1253\n789#26:1254\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n84#1:327,5\n84#1:333,2\n84#1:335\n84#1:341,25\n84#1:367\n90#1:368,5\n90#1:375,2\n90#1:377\n90#1:383,25\n90#1:409\n97#1:410,5\n97#1:418,2\n97#1:420\n97#1:426,25\n97#1:452\n105#1:453,5\n105#1:460,2\n105#1:462\n105#1:468,25\n105#1:494\n112#1:495,5\n112#1:501,2\n112#1:503\n112#1:509,25\n112#1:535\n126#1:536,5\n126#1:542,2\n126#1:544\n126#1:550,25\n126#1:576\n136#1:577,5\n136#1:583,2\n136#1:585\n136#1:591,25\n136#1:617\n157#1:618,5\n157#1:625,2\n157#1:627\n157#1:633,25\n157#1:659\n168#1:660,5\n168#1:668,2\n168#1:670\n168#1:676,25\n168#1:702\n178#1:703,5\n178#1:709,2\n178#1:711\n178#1:717,25\n178#1:743\n187#1:744,5\n187#1:751,2\n187#1:753\n187#1:759,25\n187#1:785\n200#1:786,5\n200#1:793,2\n200#1:795\n200#1:801,25\n200#1:827\n208#1:828,5\n208#1:835,2\n208#1:837\n208#1:843,25\n208#1:869\n215#1:870,5\n215#1:878,2\n215#1:880\n215#1:886,25\n215#1:912\n223#1:913,5\n223#1:919,2\n223#1:921\n223#1:927,25\n223#1:953\n229#1:954,5\n229#1:960,2\n229#1:962\n229#1:968,25\n229#1:994\n236#1:995,5\n236#1:1001,2\n236#1:1003\n236#1:1009,25\n236#1:1035\n243#1:1036,5\n243#1:1042,2\n243#1:1044\n243#1:1050,25\n243#1:1076\n252#1:1077,5\n252#1:1084,2\n252#1:1086\n252#1:1092,25\n252#1:1118\n263#1:1119,5\n263#1:1126,2\n263#1:1128\n263#1:1134,25\n263#1:1160\n277#1:1161,5\n277#1:1170,2\n277#1:1172\n277#1:1178,25\n277#1:1204\n291#1:1205,5\n291#1:1213,2\n291#1:1215\n291#1:1221,25\n291#1:1247\n307#1:1248,5\n307#1:1255,2\n307#1:1257\n307#1:1263,25\n307#1:1289\n85#1:332\n84#1:336,5\n84#1:366\n90#1:378,5\n90#1:408\n97#1:421,5\n97#1:451\n105#1:463,5\n105#1:493\n112#1:504,5\n112#1:534\n126#1:545,5\n126#1:575\n136#1:586,5\n136#1:616\n157#1:628,5\n157#1:658\n168#1:671,5\n168#1:701\n178#1:712,5\n178#1:742\n187#1:754,5\n187#1:784\n200#1:796,5\n200#1:826\n208#1:838,5\n208#1:868\n215#1:881,5\n215#1:911\n223#1:922,5\n223#1:952\n229#1:963,5\n229#1:993\n236#1:1004,5\n236#1:1034\n243#1:1045,5\n243#1:1075\n252#1:1087,5\n252#1:1117\n263#1:1129,5\n263#1:1159\n277#1:1173,5\n277#1:1203\n291#1:1216,5\n291#1:1246\n307#1:1258,5\n307#1:1288\n91#1:373\n92#1:374\n98#1:415\n99#1:416\n100#1:417\n106#1:458\n107#1:459\n113#1:500\n127#1:541\n137#1:582\n158#1:623\n159#1:624\n169#1:665\n170#1:666\n171#1:667\n179#1:708\n188#1:749\n189#1:750\n201#1:791\n203#1:792\n209#1:833\n210#1:834\n216#1:875\n217#1:876\n218#1:877\n224#1:918\n230#1:959\n237#1:1000\n244#1:1041\n253#1:1082\n254#1:1083\n264#1:1124\n265#1:1125\n278#1:1166\n279#1:1167\n280#1:1168\n281#1:1169\n292#1:1210\n293#1:1211\n294#1:1212\n308#1:1253\n309#1:1254\n*E\n"})
@e0g(parameters = 0)
public final class wt1 extends k6c {

    /* JADX INFO: renamed from: c */
    public static final int f95468c = 8;

    /* JADX INFO: renamed from: b */
    @yfb
    public final j6c f95469b = new j6c();

    public static /* synthetic */ void pushExecuteOperationsIn$default(wt1 wt1Var, wt1 wt1Var2, n78 n78Var, int i, Object obj) {
        if ((i & 2) != 0) {
            n78Var = null;
        }
        wt1Var.pushExecuteOperationsIn(wt1Var2, n78Var);
    }

    public final void clear() {
        this.f95469b.clear();
    }

    public final void executeAndFlushAllPendingChanges(@yfb p40<?> p40Var, @yfb prf prfVar, @yfb dyd dydVar) {
        this.f95469b.executeAndFlushAllPendingOperations(p40Var, prfVar, dydVar);
    }

    public final int getSize() {
        return this.f95469b.getSize();
    }

    public final boolean isEmpty() {
        return this.f95469b.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.f95469b.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int i) {
        j6c j6cVar = this.f95469b;
        w5c.C14398a c14398a = w5c.C14398a.f93297d;
        j6cVar.pushOp(c14398a);
        j6c.C7759c.m30470setIntA6tL2VI(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14424q.m32916constructorimpl(0), i);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14398a.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14398a.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14398a.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & j6cVar.f49639h) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(c14398a.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14398a.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & j6cVar.f49640i) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14398a.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14398a + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushAppendValue(@yfb C5897fo c5897fo, @gib Object obj) {
        j6c j6cVar = this.f95469b;
        w5c.C14400b c14400b = w5c.C14400b.f93301d;
        j6cVar.pushOp(c14400b);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), c5897fo);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), obj);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14400b.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14400b.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14400b.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14400b.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14400b.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14400b.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14400b + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushCopyNodesToNewAnchorLocation(@yfb List<? extends Object> list, @yfb n78 n78Var) {
        if (list.isEmpty()) {
            return;
        }
        j6c j6cVar = this.f95469b;
        w5c.C14404d c14404d = w5c.C14404d.f93312d;
        j6cVar.pushOp(c14404d);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), list);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), n78Var);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14404d.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14404d.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14404d.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14404d.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14404d.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14404d.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14404d + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushCopySlotTableToAnchorLocation(@gib h0b h0bVar, @yfb dn2 dn2Var, @yfb i0b i0bVar, @yfb i0b i0bVar2) {
        j6c j6cVar = this.f95469b;
        w5c.C14406e c14406e = w5c.C14406e.f93316d;
        j6cVar.pushOp(c14406e);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), h0bVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), dn2Var);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(3), i0bVar2);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(2), i0bVar);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14406e.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14406e.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14406e.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14406e.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14406e.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14406e.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14406e + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushDeactivateCurrentGroup() {
        this.f95469b.push(w5c.C14408f.f93320d);
    }

    public final void pushDetermineMovableContentNodeIndex(@yfb n78 n78Var, @yfb C5897fo c5897fo) {
        j6c j6cVar = this.f95469b;
        w5c.C14410g c14410g = w5c.C14410g.f93324d;
        j6cVar.pushOp(c14410g);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), n78Var);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), c5897fo);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14410g.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14410g.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14410g.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14410g.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14410g.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14410g.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14410g + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushDowns(@yfb Object[] objArr) {
        if (objArr.length == 0) {
            return;
        }
        j6c j6cVar = this.f95469b;
        w5c.C14412h c14412h = w5c.C14412h.f93328d;
        j6cVar.pushOp(c14412h);
        j6c.C7759c.m30471setObjectDKhxnng(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14427t.m32927constructorimpl(0), objArr);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14412h.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14412h.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14412h.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14412h.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14412h.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14412h.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14412h + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushEndCompositionScope(@yfb qy6<? super cn2, bth> qy6Var, @yfb cn2 cn2Var) {
        j6c j6cVar = this.f95469b;
        w5c.C14414i c14414i = w5c.C14414i.f93332d;
        j6cVar.pushOp(c14414i);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), qy6Var);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), cn2Var);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14414i.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14414i.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14414i.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14414i.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14414i.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14414i.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14414i + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushEndCurrentGroup() {
        this.f95469b.push(w5c.C14416j.f93336d);
    }

    public final void pushEndMovableContentPlacement() {
        this.f95469b.push(w5c.C14418k.f93340d);
    }

    public final void pushEnsureGroupStarted(@yfb C5897fo c5897fo) {
        j6c j6cVar = this.f95469b;
        w5c.C14419l c14419l = w5c.C14419l.f93342d;
        j6cVar.pushOp(c14419l);
        j6c.C7759c.m30471setObjectDKhxnng(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14427t.m32927constructorimpl(0), c5897fo);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14419l.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14419l.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14419l.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14419l.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14419l.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14419l.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14419l + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushEnsureRootStarted() {
        this.f95469b.push(w5c.C14420m.f93344d);
    }

    public final void pushExecuteOperationsIn(@yfb wt1 wt1Var, @gib n78 n78Var) {
        if (wt1Var.isNotEmpty()) {
            j6c j6cVar = this.f95469b;
            w5c.C14402c c14402c = w5c.C14402c.f93305d;
            j6cVar.pushOp(c14402c);
            j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
            j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), wt1Var);
            j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), n78Var);
            if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14402c.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14402c.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = c14402c.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & j6cVar.f49639h) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(c14402c.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                    i++;
                }
            }
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder();
            int objects = c14402c.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & j6cVar.f49640i) != 0) {
                    if (i > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c14402c.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                    i3++;
                }
            }
            String string2 = sb2.toString();
            md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            a8d.throwIllegalStateException("Error while pushing " + c14402c + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
        }
    }

    public final void pushInsertSlots(@yfb C5897fo c5897fo, @yfb mrf mrfVar) {
        j6c j6cVar = this.f95469b;
        w5c.C14422o c14422o = w5c.C14422o.f93348d;
        j6cVar.pushOp(c14422o);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), c5897fo);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), mrfVar);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14422o.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14422o.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14422o.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14422o.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14422o.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14422o.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14422o + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushMoveCurrentGroup(int i) {
        j6c j6cVar = this.f95469b;
        w5c.C14425r c14425r = w5c.C14425r.f93353d;
        j6cVar.pushOp(c14425r);
        j6c.C7759c.m30470setIntA6tL2VI(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14424q.m32916constructorimpl(0), i);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14425r.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14425r.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14425r.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & j6cVar.f49639h) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(c14425r.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14425r.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & j6cVar.f49640i) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14425r.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14425r + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushMoveNode(int i, int i2, int i3) {
        j6c j6cVar = this.f95469b;
        w5c.C14426s c14426s = w5c.C14426s.f93355d;
        j6cVar.pushOp(c14426s);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(1), i);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(0), i2);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(2), i3);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14426s.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14426s.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14426s.getInts();
        int i4 = 0;
        for (int i5 = 0; i5 < ints; i5++) {
            if (((1 << i5) & j6cVar.f49639h) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(c14426s.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i5)));
                i4++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14426s.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            if (((1 << i7) & j6cVar.f49640i) != 0) {
                if (i4 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14426s.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i7)));
                i6++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14426s + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + string + ") and " + i6 + " object arguments (" + string2 + ").");
    }

    public final void pushReleaseMovableGroupAtCurrent(@yfb sz2 sz2Var, @yfb dn2 dn2Var, @yfb i0b i0bVar) {
        j6c j6cVar = this.f95469b;
        w5c.C14429v c14429v = w5c.C14429v.f93360d;
        j6cVar.pushOp(c14429v);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), sz2Var);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), dn2Var);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(2), i0bVar);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14429v.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14429v.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14429v.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14429v.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14429v.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14429v.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14429v + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushRemember(@yfb eyd eydVar) {
        j6c j6cVar = this.f95469b;
        w5c.C14430w c14430w = w5c.C14430w.f93362d;
        j6cVar.pushOp(c14430w);
        j6c.C7759c.m30471setObjectDKhxnng(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14427t.m32927constructorimpl(0), eydVar);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14430w.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14430w.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14430w.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14430w.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14430w.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14430w.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14430w + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushRemoveCurrentGroup() {
        this.f95469b.push(w5c.C14431x.f93364d);
    }

    public final void pushRemoveNode(int i, int i2) {
        j6c j6cVar = this.f95469b;
        w5c.C14432y c14432y = w5c.C14432y.f93366d;
        j6cVar.pushOp(c14432y);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(0), i);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(1), i2);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14432y.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14432y.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14432y.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if (((1 << i4) & j6cVar.f49639h) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(c14432y.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i4)));
                i3++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14432y.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            if (((1 << i6) & j6cVar.f49640i) != 0) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14432y.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i6)));
                i5++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14432y + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + string + ") and " + i5 + " object arguments (" + string2 + ").");
    }

    public final void pushResetSlots() {
        this.f95469b.push(w5c.C14433z.f93368d);
    }

    public final void pushSideEffect(@yfb ny6<bth> ny6Var) {
        j6c j6cVar = this.f95469b;
        w5c.C14399a0 c14399a0 = w5c.C14399a0.f93299d;
        j6cVar.pushOp(c14399a0);
        j6c.C7759c.m30471setObjectDKhxnng(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14427t.m32927constructorimpl(0), ny6Var);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14399a0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14399a0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14399a0.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14399a0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14399a0.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14399a0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14399a0 + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.f95469b.push(w5c.C14401b0.f93303d);
    }

    public final void pushTrimValues(int i) {
        j6c j6cVar = this.f95469b;
        w5c.C14405d0 c14405d0 = w5c.C14405d0.f93314d;
        j6cVar.pushOp(c14405d0);
        j6c.C7759c.m30470setIntA6tL2VI(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14424q.m32916constructorimpl(0), i);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14405d0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14405d0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14405d0.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & j6cVar.f49639h) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(c14405d0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14405d0.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & j6cVar.f49640i) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14405d0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14405d0 + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushUpdateAnchoredValue(@gib Object obj, @yfb C5897fo c5897fo, int i) {
        j6c j6cVar = this.f95469b;
        w5c.C14407e0 c14407e0 = w5c.C14407e0.f93318d;
        j6cVar.pushOp(c14407e0);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), obj);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), c5897fo);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(0), i);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14407e0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14407e0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14407e0.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & j6cVar.f49639h) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(c14407e0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14407e0.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & j6cVar.f49640i) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14407e0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14407e0 + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushUpdateAuxData(@gib Object obj) {
        j6c j6cVar = this.f95469b;
        w5c.C14409f0 c14409f0 = w5c.C14409f0.f93322d;
        j6cVar.pushOp(c14409f0);
        j6c.C7759c.m30471setObjectDKhxnng(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14427t.m32927constructorimpl(0), obj);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14409f0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14409f0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14409f0.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14409f0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14409f0.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14409f0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14409f0 + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }

    public final <T, V> void pushUpdateNode(V v, @yfb gz6<? super T, ? super V, bth> gz6Var) {
        j6c j6cVar = this.f95469b;
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

    public final void pushUpdateValue(@gib Object obj, int i) {
        j6c j6cVar = this.f95469b;
        w5c.C14413h0 c14413h0 = w5c.C14413h0.f93330d;
        j6cVar.pushOp(c14413h0);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), obj);
        j6c.C7759c.m30470setIntA6tL2VI(j6cVarM30465constructorimpl, w5c.C14424q.m32916constructorimpl(0), i);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14413h0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14413h0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14413h0.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & j6cVar.f49639h) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(c14413h0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14413h0.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & j6cVar.f49640i) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14413h0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14413h0 + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushUps(int i) {
        j6c j6cVar = this.f95469b;
        w5c.C14415i0 c14415i0 = w5c.C14415i0.f93334d;
        j6cVar.pushOp(c14415i0);
        j6c.C7759c.m30470setIntA6tL2VI(j6c.C7759c.m30465constructorimpl(j6cVar), w5c.C14424q.m32916constructorimpl(0), i);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14415i0.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14415i0.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14415i0.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & j6cVar.f49639h) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(c14415i0.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14415i0.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & j6cVar.f49640i) != 0) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14415i0.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14415i0 + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + string + ") and " + i4 + " object arguments (" + string2 + ").");
    }

    public final void pushUseNode(@gib Object obj) {
        if (obj instanceof pl2) {
            this.f95469b.push(w5c.C14417j0.f93338d);
        }
    }

    @Override // p000.k6c
    @yfb
    public String toDebugString(@yfb String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.f95469b.toDebugString(str));
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void pushInsertSlots(@yfb C5897fo c5897fo, @yfb mrf mrfVar, @yfb l26 l26Var) {
        j6c j6cVar = this.f95469b;
        w5c.C14423p c14423p = w5c.C14423p.f93350d;
        j6cVar.pushOp(c14423p);
        j6c j6cVarM30465constructorimpl = j6c.C7759c.m30465constructorimpl(j6cVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(0), c5897fo);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(1), mrfVar);
        j6c.C7759c.m30471setObjectDKhxnng(j6cVarM30465constructorimpl, w5c.C14427t.m32927constructorimpl(2), l26Var);
        if (j6cVar.f49639h == j6cVar.createExpectedArgMask(c14423p.getInts()) && j6cVar.f49640i == j6cVar.createExpectedArgMask(c14423p.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = c14423p.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & j6cVar.f49639h) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(c14423p.mo32877intParamNamew8GmfQM(w5c.C14424q.m32916constructorimpl(i2)));
                i++;
            }
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder();
        int objects = c14423p.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & j6cVar.f49640i) != 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(c14423p.mo32878objectParamName31yXWZQ(w5c.C14427t.m32927constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        md8.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        a8d.throwIllegalStateException("Error while pushing " + c14423p + ". Not all arguments were provided. Missing " + i + " int arguments (" + string + ") and " + i3 + " object arguments (" + string2 + ").");
    }
}
