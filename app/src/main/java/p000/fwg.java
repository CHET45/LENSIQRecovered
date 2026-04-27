package p000;

import java.util.List;
import p000.hsh;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n81#2:267\n107#2,2:268\n602#3,8:270\n602#3,8:278\n1#4:286\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager\n*L\n46#1:267\n46#1:268,2\n72#1:270,8\n97#1:278,8\n*E\n"})
@e0g(parameters = 0)
public final class fwg {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C6010a f37893c = new C6010a(null);

    /* JADX INFO: renamed from: d */
    public static final int f37894d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final hsh<hwg> f37895a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f37896b;

    /* JADX INFO: renamed from: fwg$a */
    public static final class C6010a {

        /* JADX INFO: renamed from: fwg$a$a */
        @dwf({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n+ 2 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion\n*L\n1#1,266:1\n125#2:267\n171#2:268\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text/input/TextUndoManager$Companion$Saver\n*L\n104#1:267\n104#1:268\n*E\n"})
        @e0g(parameters = 0)
        public static final class a implements dme<fwg, Object> {

            /* JADX INFO: renamed from: a */
            @yfb
            public static final a f37897a = new a();

            /* JADX INFO: renamed from: b */
            @yfb
            public static final dme<hsh<hwg>, Object> f37898b;

            /* JADX INFO: renamed from: c */
            public static final int f37899c;

            /* JADX INFO: renamed from: fwg$a$a$a, reason: collision with other inner class name */
            @dwf({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n33#2,6:175\n33#2,6:181\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n140#1:175,6\n145#1:181,6\n*E\n"})
            public static final class C16448a implements dme<hsh<hwg>, Object> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ dme f37900a;

                public C16448a(dme dmeVar) {
                    this.f37900a = dmeVar;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p000.dme
                @yfb
                public hsh<hwg> restore(@yfb Object obj) {
                    md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    dme dmeVar = this.f37900a;
                    List listCreateListBuilder = k82.createListBuilder();
                    int i = 3;
                    while (i < iIntValue2 + 3) {
                        Object objRestore = dmeVar.restore(list.get(i));
                        md8.checkNotNull(objRestore);
                        listCreateListBuilder.add(objRestore);
                        i++;
                    }
                    List listBuild = k82.build(listCreateListBuilder);
                    dme dmeVar2 = this.f37900a;
                    List listCreateListBuilder2 = k82.createListBuilder();
                    while (i < iIntValue2 + iIntValue3 + 3) {
                        Object objRestore2 = dmeVar2.restore(list.get(i));
                        md8.checkNotNull(objRestore2);
                        listCreateListBuilder2.add(objRestore2);
                        i++;
                    }
                    return new hsh<>(listBuild, k82.build(listCreateListBuilder2), iIntValue);
                }

                @Override // p000.dme
                @yfb
                public Object save(@yfb fme fmeVar, @yfb hsh<hwg> hshVar) {
                    dme dmeVar = this.f37900a;
                    List listCreateListBuilder = k82.createListBuilder();
                    listCreateListBuilder.add(Integer.valueOf(hshVar.f44793a));
                    listCreateListBuilder.add(Integer.valueOf(hshVar.f44794b.size()));
                    listCreateListBuilder.add(Integer.valueOf(hshVar.f44795c.size()));
                    ytf ytfVar = hshVar.f44794b;
                    int size = ytfVar.size();
                    for (int i = 0; i < size; i++) {
                        listCreateListBuilder.add(dmeVar.save(fmeVar, ytfVar.get(i)));
                    }
                    ytf ytfVar2 = hshVar.f44795c;
                    int size2 = ytfVar2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        listCreateListBuilder.add(dmeVar.save(fmeVar, ytfVar2.get(i2)));
                    }
                    return k82.build(listCreateListBuilder);
                }
            }

            static {
                hsh.C7003a c7003a = hsh.f44791d;
                f37898b = new C16448a(hwg.f45167i.getSaver());
                f37899c = 8;
            }

            private a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.dme
            @gib
            public fwg restore(@yfb Object obj) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                hwg hwgVarRestore = obj2 != null ? hwg.f45167i.getSaver().restore(obj2) : null;
                dme<hsh<hwg>, Object> dmeVar = f37898b;
                md8.checkNotNull(obj3);
                hsh<hwg> hshVarRestore = dmeVar.restore(obj3);
                md8.checkNotNull(hshVarRestore);
                return new fwg(hwgVarRestore, hshVarRestore);
            }

            @Override // p000.dme
            @yfb
            public Object save(@yfb fme fmeVar, @yfb fwg fwgVar) {
                hwg stagingUndo = fwgVar.getStagingUndo();
                return l82.listOf(stagingUndo != null ? hwg.f45167i.getSaver().save(fmeVar, stagingUndo) : null, f37898b.save(fmeVar, fwgVar.f37895a));
            }
        }

        public /* synthetic */ C6010a(jt3 jt3Var) {
            this();
        }

        private C6010a() {
        }
    }

    public fwg() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void flush() {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            hwg stagingUndo = getStagingUndo();
            if (stagingUndo != null) {
                this.f37895a.record(stagingUndo);
            }
            setStagingUndo(null);
        } finally {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final hwg getStagingUndo() {
        return (hwg) this.f37896b.getValue();
    }

    private final void setStagingUndo(hwg hwgVar) {
        this.f37896b.setValue(hwgVar);
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.f37895a.clearHistory();
    }

    public final boolean getCanRedo() {
        return this.f37895a.getCanRedo$foundation_release() && getStagingUndo() == null;
    }

    public final boolean getCanUndo() {
        return this.f37895a.getCanUndo$foundation_release() || getStagingUndo() != null;
    }

    public final void record(@yfb hwg hwgVar) {
        ssf.C12771a c12771a = ssf.f82790e;
        ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
        qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            hwg stagingUndo = getStagingUndo();
            if (stagingUndo == null) {
                setStagingUndo(hwgVar);
                return;
            }
            hwg hwgVarMerge = gwg.merge(stagingUndo, hwgVar);
            if (hwgVarMerge != null) {
                setStagingUndo(hwgVarMerge);
            } else {
                flush();
                setStagingUndo(hwgVar);
            }
        } finally {
            c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
        }
    }

    public final void redo(@yfb wsg wsgVar) {
        if (getCanRedo()) {
            iwg.redo(wsgVar, this.f37895a.redo());
        }
    }

    public final void undo(@yfb wsg wsgVar) {
        if (getCanUndo()) {
            flush();
            iwg.undo(wsgVar, this.f37895a.undo());
        }
    }

    public fwg(@gib hwg hwgVar, @yfb hsh<hwg> hshVar) {
        this.f37895a = hshVar;
        this.f37896b = xtf.mutableStateOf$default(hwgVar, null, 2, null);
    }

    public /* synthetic */ fwg(hwg hwgVar, hsh hshVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : hwgVar, (i & 2) != 0 ? new hsh(null, null, 100, 3, null) : hshVar);
    }
}
