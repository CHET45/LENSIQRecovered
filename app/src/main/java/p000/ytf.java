package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.prc;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,496:1\n170#1:497\n209#1,10:507\n219#1:518\n170#1:519\n220#1,9:521\n166#1:530\n229#1,7:536\n239#1,6:546\n202#1,17:552\n219#1:570\n170#1:571\n220#1,9:573\n166#1:582\n229#1,7:588\n239#1,6:598\n207#1:604\n209#1,10:605\n219#1:616\n170#1:617\n220#1,9:619\n166#1:628\n229#1,7:634\n239#1,6:644\n166#1:650\n209#1,10:661\n219#1:672\n170#1:673\n220#1,9:675\n166#1:684\n229#1,7:690\n239#1,6:700\n209#1,10:706\n219#1:717\n170#1:718\n220#1,9:720\n166#1:729\n229#1,7:735\n239#1,6:745\n202#1,17:752\n219#1:770\n170#1:771\n220#1,9:773\n166#1:782\n229#1,7:788\n239#1,6:798\n207#1:804\n206#1,13:805\n219#1:819\n170#1:820\n220#1,9:822\n166#1:831\n229#1,7:837\n239#1,6:847\n207#1:853\n175#1,5:854\n180#1:860\n170#1:861\n181#1,7:863\n166#1:870\n188#1,7:876\n197#1,3:886\n175#1,5:889\n180#1:895\n170#1:896\n181#1,7:898\n166#1:905\n188#1,7:911\n197#1,3:921\n170#1:924\n175#1,5:936\n180#1:942\n170#1:943\n181#1,7:945\n166#1:952\n188#1,7:958\n197#1,3:968\n170#1:972\n166#1:974\n213#1,6:985\n219#1:992\n170#1:993\n220#1,9:995\n166#1:1004\n229#1,7:1010\n239#1,6:1020\n213#1,7:1026\n170#1:1033\n220#1,9:1035\n166#1:1044\n229#1,7:1050\n239#1,6:1060\n170#1:1067\n166#1:1069\n170#1:1081\n166#1:1083\n2420#2:498\n2420#2:506\n2420#2:520\n2313#2,2:531\n1843#2:533\n2315#2,2:534\n2317#2,3:543\n2420#2:572\n2313#2,2:583\n1843#2:585\n2315#2,2:586\n2317#2,3:595\n2420#2:618\n2313#2,2:629\n1843#2:631\n2315#2,2:632\n2317#2,3:641\n2313#2,2:651\n1843#2:653\n2315#2,2:655\n2317#2,3:658\n2420#2:674\n2313#2,2:685\n1843#2:687\n2315#2,2:688\n2317#2,3:697\n2420#2:719\n2313#2,2:730\n1843#2:732\n2315#2,2:733\n2317#2,3:742\n2420#2:772\n2313#2,2:783\n1843#2:785\n2315#2,2:786\n2317#2,3:795\n2420#2:821\n2313#2,2:832\n1843#2:834\n2315#2,2:835\n2317#2,3:844\n2420#2:862\n2313#2,2:871\n1843#2:873\n2315#2,2:874\n2317#2,3:883\n2420#2:897\n2313#2,2:906\n1843#2:908\n2315#2,2:909\n2317#2,3:918\n2420#2:925\n2313#2,2:926\n1843#2:928\n2315#2,5:930\n2420#2:935\n2420#2:944\n2313#2,2:953\n1843#2:955\n2315#2,2:956\n2317#2,3:965\n2420#2:973\n2313#2,2:975\n1843#2:977\n2315#2,2:979\n2317#2,3:982\n2420#2:994\n2313#2,2:1005\n1843#2:1007\n2315#2,2:1008\n2317#2,3:1017\n2420#2:1034\n2313#2,2:1045\n1843#2:1047\n2315#2,2:1048\n2317#2,3:1057\n2420#2:1068\n2313#2,2:1070\n1843#2:1072\n2315#2,2:1074\n2317#2,3:1077\n2420#2:1082\n2313#2,2:1084\n1843#2:1086\n2315#2,2:1088\n2317#2,3:1091\n33#3,7:499\n89#4:517\n89#4:569\n89#4:615\n89#4:654\n89#4:657\n89#4:671\n89#4:716\n89#4:769\n89#4:818\n89#4:859\n89#4:894\n89#4:929\n89#4:941\n89#4:971\n89#4:978\n89#4:981\n89#4:991\n89#4:1066\n89#4:1073\n89#4:1076\n89#4:1080\n89#4:1087\n89#4:1090\n1#5:751\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n70#1:497\n117#1:507,10\n117#1:518\n117#1:519\n117#1:521,9\n117#1:530\n117#1:536,7\n117#1:546,6\n118#1:552,17\n118#1:570\n118#1:571\n118#1:573,9\n118#1:582\n118#1:588,7\n118#1:598,6\n118#1:604\n123#1:605,10\n123#1:616\n123#1:617\n123#1:619,9\n123#1:628\n123#1:634,7\n123#1:644,6\n125#1:650\n133#1:661,10\n133#1:672\n133#1:673\n133#1:675,9\n133#1:684\n133#1:690,7\n133#1:700,6\n134#1:706,10\n134#1:717\n134#1:718\n134#1:720,9\n134#1:729\n134#1:735,7\n134#1:745,6\n135#1:752,17\n135#1:770\n135#1:771\n135#1:773,9\n135#1:782\n135#1:788,7\n135#1:798,6\n135#1:804\n138#1:805,13\n138#1:819\n138#1:820\n138#1:822,9\n138#1:831\n138#1:837,7\n138#1:847,6\n138#1:853\n142#1:854,5\n142#1:860\n142#1:861\n142#1:863,7\n142#1:870\n142#1:876,7\n142#1:886,3\n149#1:889,5\n149#1:895\n149#1:896\n149#1:898,7\n149#1:905\n149#1:911,7\n149#1:921,3\n162#1:924\n172#1:936,5\n172#1:942\n172#1:943\n172#1:945,7\n172#1:952\n172#1:958,7\n172#1:968,3\n180#1:972\n187#1:974\n206#1:985,6\n206#1:992\n206#1:993\n206#1:995,9\n206#1:1004\n206#1:1010,7\n206#1:1020,6\n206#1:1026,7\n206#1:1033\n206#1:1035,9\n206#1:1044\n206#1:1050,7\n206#1:1060,6\n219#1:1067\n228#1:1069\n219#1:1081\n228#1:1083\n70#1:498\n113#1:506\n117#1:520\n117#1:531,2\n117#1:533\n117#1:534,2\n117#1:543,3\n118#1:572\n118#1:583,2\n118#1:585\n118#1:586,2\n118#1:595,3\n123#1:618\n123#1:629,2\n123#1:631\n123#1:632,2\n123#1:641,3\n125#1:651,2\n125#1:653\n125#1:655,2\n125#1:658,3\n133#1:674\n133#1:685,2\n133#1:687\n133#1:688,2\n133#1:697,3\n134#1:719\n134#1:730,2\n134#1:732\n134#1:733,2\n134#1:742,3\n135#1:772\n135#1:783,2\n135#1:785\n135#1:786,2\n135#1:795,3\n138#1:821\n138#1:832,2\n138#1:834\n138#1:835,2\n138#1:844,3\n142#1:862\n142#1:871,2\n142#1:873\n142#1:874,2\n142#1:883,3\n149#1:897\n149#1:906,2\n149#1:908\n149#1:909,2\n149#1:918,3\n162#1:925\n166#1:926,2\n166#1:928\n166#1:930,5\n170#1:935\n172#1:944\n172#1:953,2\n172#1:955\n172#1:956,2\n172#1:965,3\n180#1:973\n187#1:975,2\n187#1:977\n187#1:979,2\n187#1:982,3\n206#1:994\n206#1:1005,2\n206#1:1007\n206#1:1008,2\n206#1:1017,3\n206#1:1034\n206#1:1045,2\n206#1:1047\n206#1:1048,2\n206#1:1057,3\n219#1:1068\n228#1:1070,2\n228#1:1072\n228#1:1074,2\n228#1:1077,3\n219#1:1082\n228#1:1084,2\n228#1:1086\n228#1:1088,2\n228#1:1091,3\n107#1:499,7\n117#1:517\n118#1:569\n123#1:615\n125#1:654\n126#1:657\n133#1:671\n134#1:716\n135#1:769\n138#1:818\n142#1:859\n149#1:894\n166#1:929\n172#1:941\n179#1:971\n187#1:978\n188#1:981\n206#1:991\n218#1:1066\n228#1:1073\n229#1:1076\n218#1:1080\n228#1:1087\n229#1:1090\n*E\n"})
@f0g
public final class ytf<T> implements x2g, List<T>, RandomAccess, yo8 {

    /* JADX INFO: renamed from: b */
    public static final int f102963b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public z2g f102964a;

    /* JADX INFO: renamed from: ytf$a */
    @dwf({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,496:1\n89#2:497\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n85#1:497\n*E\n"})
    @e0g(parameters = 0)
    public static final class C15805a<T> extends z2g {

        /* JADX INFO: renamed from: g */
        public static final int f102965g = 8;

        /* JADX INFO: renamed from: d */
        @yfb
        public prc<? extends T> f102966d;

        /* JADX INFO: renamed from: e */
        public int f102967e;

        /* JADX INFO: renamed from: f */
        public int f102968f;

        public C15805a(@yfb prc<? extends T> prcVar) {
            this.f102966d = prcVar;
        }

        @Override // p000.z2g
        public void assign(@yfb z2g z2gVar) {
            synchronized (ztf.f106085a) {
                md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f102966d = ((C15805a) z2gVar).f102966d;
                this.f102967e = ((C15805a) z2gVar).f102967e;
                this.f102968f = ((C15805a) z2gVar).f102968f;
                bth bthVar = bth.f14751a;
            }
        }

        @Override // p000.z2g
        @yfb
        public z2g create() {
            return new C15805a(this.f102966d);
        }

        @yfb
        public final prc<T> getList$runtime_release() {
            return this.f102966d;
        }

        public final int getModification$runtime_release() {
            return this.f102967e;
        }

        public final int getStructuralChange$runtime_release() {
            return this.f102968f;
        }

        public final void setList$runtime_release(@yfb prc<? extends T> prcVar) {
            this.f102966d = prcVar;
        }

        public final void setModification$runtime_release(int i) {
            this.f102967e = i;
        }

        public final void setStructuralChange$runtime_release(int i) {
            this.f102968f = i;
        }
    }

    /* JADX INFO: renamed from: ytf$b */
    public static final class C15806b extends tt8 implements qy6<List<T>, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f102969a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collection<T> f102970b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15806b(int i, Collection<? extends T> collection) {
            super(1);
            this.f102969a = i;
            this.f102970b = collection;
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb List<T> list) {
            return Boolean.valueOf(list.addAll(this.f102969a, this.f102970b));
        }
    }

    /* JADX INFO: renamed from: ytf$c */
    public static final class C15807c extends tt8 implements qy6<List<T>, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection<T> f102971a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C15807c(Collection<? extends T> collection) {
            super(1);
            this.f102971a = collection;
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f102971a));
        }
    }

    public ytf() {
        prc prcVarPersistentListOf = hj5.persistentListOf();
        C15805a c15805a = new C15805a(prcVarPersistentListOf);
        if (ssf.f82790e.isInSnapshot()) {
            C15805a c15805a2 = new C15805a(prcVarPersistentListOf);
            c15805a2.setSnapshotId$runtime_release(1);
            c15805a.setNext$runtime_release(c15805a2);
        }
        this.f102964a = c15805a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m26352a(ytf ytfVar, boolean z, qy6 qy6Var, int i, Object obj) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        boolean z2;
        ssf current;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            synchronized (ztf.f106085a) {
                try {
                    z2g firstStateRecord = ytfVar.getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                    modification$runtime_release = c15805a.getModification$runtime_release();
                    list$runtime_release = c15805a.getList$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(list$runtime_release);
            prc<? extends T> prcVar = (prc) qy6Var.invoke(list$runtime_release);
            z2 = false;
            if (md8.areEqual(prcVar, list$runtime_release)) {
                return false;
            }
            z2g firstStateRecord2 = ytfVar.getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, ytfVar, current);
                    synchronized (ztf.f106085a) {
                        try {
                            if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                                c15805a3.setList$runtime_release(prcVar);
                                if (z) {
                                    c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                                }
                                c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                                z2 = true;
                            }
                            o28.finallyStart(1);
                        } catch (Throwable th2) {
                            o28.finallyStart(1);
                            o28.finallyEnd(1);
                            throw th2;
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th3) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th3;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, ytfVar);
        } while (!z2);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26353b(ytf ytfVar, boolean z, qy6 qy6Var, int i, Object obj) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        }
        do {
            synchronized (ztf.f106085a) {
                try {
                    z2g firstStateRecord = ytfVar.getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                    modification$runtime_release = c15805a.getModification$runtime_release();
                    list$runtime_release = c15805a.getList$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(list$runtime_release);
            prc<? extends T> prcVar = (prc) qy6Var.invoke(list$runtime_release);
            if (md8.areEqual(prcVar, list$runtime_release)) {
                return;
            }
            z2g firstStateRecord2 = ytfVar.getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, ytfVar, current);
                    synchronized (ztf.f106085a) {
                        try {
                            if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                                c15805a3.setList$runtime_release(prcVar);
                                if (z) {
                                    c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                                }
                                c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            o28.finallyStart(1);
                        } catch (Throwable th2) {
                            o28.finallyStart(1);
                            o28.finallyEnd(1);
                            throw th2;
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th3) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th3;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, ytfVar);
        } while (!z2);
    }

    private final boolean conditionalUpdate(boolean z, qy6<? super prc<? extends T>, ? extends prc<? extends T>> qy6Var) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        boolean z2;
        ssf current;
        do {
            synchronized (ztf.f106085a) {
                try {
                    z2g firstStateRecord = getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                    modification$runtime_release = c15805a.getModification$runtime_release();
                    list$runtime_release = c15805a.getList$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(list$runtime_release);
            prc<? extends T> prcVarInvoke = qy6Var.invoke(list$runtime_release);
            z2 = false;
            if (md8.areEqual(prcVarInvoke, list$runtime_release)) {
                return false;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                    synchronized (ztf.f106085a) {
                        try {
                            if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                                c15805a3.setList$runtime_release(prcVarInvoke);
                                if (z) {
                                    c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                                }
                                c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                                z2 = true;
                            }
                            o28.finallyStart(1);
                        } catch (Throwable th2) {
                            o28.finallyStart(1);
                            o28.finallyEnd(1);
                            throw th2;
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th3) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th3;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, this);
        } while (!z2);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(qy6<? super List<T>, ? extends R> qy6Var) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        R rInvoke;
        ssf current;
        boolean z;
        do {
            synchronized (ztf.f106085a) {
                try {
                    z2g firstStateRecord = getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                    modification$runtime_release = c15805a.getModification$runtime_release();
                    list$runtime_release = c15805a.getList$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(list$runtime_release);
            prc.InterfaceC11080a<T> interfaceC11080aBuilder = list$runtime_release.builder();
            rInvoke = qy6Var.invoke(interfaceC11080aBuilder);
            prc<T> prcVarBuild = interfaceC11080aBuilder.build();
            if (md8.areEqual(prcVarBuild, list$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                    synchronized (ztf.f106085a) {
                        try {
                            if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                                c15805a3.setList$runtime_release(prcVarBuild);
                                c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                                c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            o28.finallyStart(1);
                        } finally {
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th2) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th2;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, this);
        } while (!z);
        return rInvoke;
    }

    private final boolean mutateBoolean(qy6<? super List<T>, Boolean> qy6Var) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        Boolean boolInvoke;
        ssf current;
        boolean z;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc.InterfaceC11080a<T> interfaceC11080aBuilder = list$runtime_release.builder();
            boolInvoke = qy6Var.invoke(interfaceC11080aBuilder);
            prc<T> prcVarBuild = interfaceC11080aBuilder.build();
            if (md8.areEqual(prcVarBuild, list$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarBuild);
                        z = true;
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return boolInvoke.booleanValue();
    }

    private final void update(boolean z, qy6<? super prc<? extends T>, ? extends prc<? extends T>> qy6Var) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z2;
        do {
            synchronized (ztf.f106085a) {
                try {
                    z2g firstStateRecord = getFirstStateRecord();
                    md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                    modification$runtime_release = c15805a.getModification$runtime_release();
                    list$runtime_release = c15805a.getList$runtime_release();
                    bth bthVar = bth.f14751a;
                    o28.finallyStart(1);
                } catch (Throwable th) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th;
                }
            }
            o28.finallyEnd(1);
            md8.checkNotNull(list$runtime_release);
            prc<? extends T> prcVarInvoke = qy6Var.invoke(list$runtime_release);
            if (md8.areEqual(prcVarInvoke, list$runtime_release)) {
                return;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                try {
                    current = ssf.f82790e.getCurrent();
                    C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                    synchronized (ztf.f106085a) {
                        try {
                            if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                                c15805a3.setList$runtime_release(prcVarInvoke);
                                if (z) {
                                    c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                                }
                                c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            o28.finallyStart(1);
                        } catch (Throwable th2) {
                            o28.finallyStart(1);
                            o28.finallyEnd(1);
                            throw th2;
                        }
                    }
                    o28.finallyEnd(1);
                    o28.finallyStart(1);
                } catch (Throwable th3) {
                    o28.finallyStart(1);
                    o28.finallyEnd(1);
                    throw th3;
                }
            }
            o28.finallyEnd(1);
            gtf.notifyWrite(current, this);
        } while (!z2);
    }

    private final <R> R withCurrent(qy6<? super C15805a<T>, ? extends R> qy6Var) {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return qy6Var.invoke(gtf.current((C15805a) firstStateRecord));
    }

    private final <R> R writable(qy6<? super C15805a<T>, ? extends R> qy6Var) {
        ssf current;
        R rInvoke;
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C15805a c15805a = (C15805a) firstStateRecord;
        gtf.getSnapshotInitializer();
        synchronized (gtf.getLock()) {
            try {
                current = ssf.f82790e.getCurrent();
                rInvoke = qy6Var.invoke(gtf.writableRecord(c15805a, this, current));
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        gtf.notifyWrite(current, this);
        return rInvoke;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        boolean z;
        ssf current;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVarAdd = list$runtime_release.add(t);
            z = false;
            if (md8.areEqual(prcVarAdd, list$runtime_release)) {
                return false;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarAdd);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, @yfb Collection<? extends T> collection) {
        return mutateBoolean(new C15806b(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        ssf current;
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C15805a c15805a = (C15805a) firstStateRecord;
        gtf.getSnapshotInitializer();
        synchronized (gtf.getLock()) {
            current = ssf.f82790e.getCurrent();
            C15805a c15805a2 = (C15805a) gtf.writableRecord(c15805a, this, current);
            synchronized (ztf.f106085a) {
                c15805a2.setList$runtime_release(hj5.persistentListOf());
                c15805a2.setModification$runtime_release(c15805a2.getModification$runtime_release() + 1);
                c15805a2.setStructuralChange$runtime_release(c15805a2.getStructuralChange$runtime_release() + 1);
            }
        }
        gtf.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i) {
        return getReadable$runtime_release().getList$runtime_release().get(i);
    }

    @yfb
    @xn8(name = "getDebuggerDisplayValue")
    public final List<T> getDebuggerDisplayValue() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C15805a) gtf.current((C15805a) firstStateRecord)).getList$runtime_release();
    }

    @Override // p000.x2g
    @yfb
    public z2g getFirstStateRecord() {
        return this.f102964a;
    }

    @yfb
    public final C15805a<T> getReadable$runtime_release() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C15805a) gtf.readable((C15805a) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C15805a) gtf.current((C15805a) firstStateRecord)).getStructuralChange$runtime_release();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<T> listIterator() {
        return new r2g(this, 0);
    }

    @Override // p000.x2g
    public void prependStateRecord(@yfb z2g z2gVar) {
        z2gVar.setNext$runtime_release(getFirstStateRecord());
        md8.checkNotNull(z2gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f102964a = (C15805a) z2gVar;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@yfb Collection<? extends Object> collection) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        boolean z;
        ssf current;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVarRemoveAll = list$runtime_release.removeAll((Collection<? extends T>) collection);
            z = false;
            if (md8.areEqual(prcVarRemoveAll, list$runtime_release)) {
                return false;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarRemoveAll);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    public T removeAt(int i) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z;
        T t = get(i);
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVarRemoveAt = list$runtime_release.removeAt(i);
            if (md8.areEqual(prcVarRemoveAt, list$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarRemoveAt);
                        z = true;
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return t;
    }

    public final void removeRange(int i, int i2) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc.InterfaceC11080a<T> interfaceC11080aBuilder = list$runtime_release.builder();
            interfaceC11080aBuilder.subList(i, i2).clear();
            prc<T> prcVarBuild = interfaceC11080aBuilder.build();
            if (md8.areEqual(prcVarBuild, list$runtime_release)) {
                return;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarBuild);
                        z = true;
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@yfb Collection<? extends Object> collection) {
        return mutateBoolean(new C15807c(collection));
    }

    public final int retainAllInRange$runtime_release(@yfb Collection<? extends T> collection, int i, int i2) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z;
        int size = size();
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc.InterfaceC11080a<T> interfaceC11080aBuilder = list$runtime_release.builder();
            interfaceC11080aBuilder.subList(i, i2).retainAll(collection);
            prc<T> prcVarBuild = interfaceC11080aBuilder.build();
            if (md8.areEqual(prcVarBuild, list$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarBuild);
                        z = true;
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i, T t) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z;
        T t2 = get(i);
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVar = list$runtime_release.set(i, t);
            if (md8.areEqual(prcVar, list$runtime_release)) {
                break;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVar);
                        z = true;
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @yfb
    public List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            a8d.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new dcg(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @yfb
    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    @yfb
    public String toString() {
        z2g firstStateRecord = getFirstStateRecord();
        md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C15805a) gtf.current((C15805a) firstStateRecord)).getList$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@yfb Collection<? extends T> collection) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        boolean z;
        ssf current;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVarAddAll = list$runtime_release.addAll(collection);
            z = false;
            if (md8.areEqual(prcVarAddAll, list$runtime_release)) {
                return false;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarAddAll);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<T> listIterator(int i) {
        return new r2g(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        boolean z;
        ssf current;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVarRemove = list$runtime_release.remove(obj);
            z = false;
            if (md8.areEqual(prcVarRemove, list$runtime_release)) {
                return false;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarRemove);
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        int modification$runtime_release;
        prc<T> list$runtime_release;
        ssf current;
        boolean z;
        do {
            synchronized (ztf.f106085a) {
                z2g firstStateRecord = getFirstStateRecord();
                md8.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C15805a c15805a = (C15805a) gtf.current((C15805a) firstStateRecord);
                modification$runtime_release = c15805a.getModification$runtime_release();
                list$runtime_release = c15805a.getList$runtime_release();
                bth bthVar = bth.f14751a;
            }
            md8.checkNotNull(list$runtime_release);
            prc<T> prcVarAdd = list$runtime_release.add(i, t);
            if (md8.areEqual(prcVarAdd, list$runtime_release)) {
                return;
            }
            z2g firstStateRecord2 = getFirstStateRecord();
            md8.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C15805a c15805a2 = (C15805a) firstStateRecord2;
            gtf.getSnapshotInitializer();
            synchronized (gtf.getLock()) {
                current = ssf.f82790e.getCurrent();
                C15805a c15805a3 = (C15805a) gtf.writableRecord(c15805a2, this, current);
                synchronized (ztf.f106085a) {
                    if (c15805a3.getModification$runtime_release() == modification$runtime_release) {
                        c15805a3.setList$runtime_release(prcVarAdd);
                        z = true;
                        c15805a3.setStructuralChange$runtime_release(c15805a3.getStructuralChange$runtime_release() + 1);
                        c15805a3.setModification$runtime_release(c15805a3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            gtf.notifyWrite(current, this);
        } while (!z);
    }
}
