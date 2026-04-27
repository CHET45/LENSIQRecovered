package p000;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class vie implements o9c {

    /* JADX INFO: renamed from: a */
    public final yie f91264a;

    public vie(yie yieVar) {
        this.f91264a = yieVar;
    }

    private void buildOverlays() {
        this.f91264a.mo14250j("build overlays", new Runnable() { // from class: sie
            @Override // java.lang.Runnable
            public final void run() {
                this.f81939a.lambda$buildOverlays$0();
            }
        });
    }

    private Set<String> getAllUserIds() {
        final HashSet hashSet = new HashSet();
        this.f91264a.m26113t("SELECT DISTINCT uid FROM mutation_queues").m26122e(new su2() { // from class: uie
            @Override // p000.su2
            public final void accept(Object obj) {
                vie.lambda$getAllUserIds$1(hashSet, (Cursor) obj);
            }
        });
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$buildOverlays$0() {
        if (m23995d()) {
            Set<String> allUserIds = getAllUserIds();
            kyd kydVarMo14247g = this.f91264a.mo14247g();
            Iterator<String> it = allUserIds.iterator();
            while (it.hasNext()) {
                syh syhVar = new syh(it.next());
                yie yieVar = this.f91264a;
                s7b s7bVarMo14245e = yieVar.mo14245e(syhVar, yieVar.mo14244d(syhVar));
                HashSet hashSet = new HashSet();
                Iterator<n7b> it2 = s7bVarMo14245e.getAllMutationBatches().iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(it2.next().getKeys());
                }
                new ld9(kydVarMo14247g, s7bVarMo14245e, this.f91264a.mo14242b(syhVar), this.f91264a.mo14244d(syhVar)).m16105k(hashSet);
            }
            removePendingOverlayMigrations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAllUserIds$1(Set set, Cursor cursor) {
        set.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hasPendingOverlayMigration$2(Boolean[] boolArr, Cursor cursor) {
        try {
            if (jqc.f51485b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e) {
            throw r80.fail("SQLitePersistence.DataMigration failed to parse: %s", e);
        }
    }

    private void removePendingOverlayMigrations() {
        this.f91264a.m26109p("DELETE FROM data_migrations WHERE migration_name = ?", jqc.f51485b);
    }

    @fdi
    /* JADX INFO: renamed from: d */
    public boolean m23995d() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f91264a.m26113t("SELECT migration_name FROM data_migrations").m26122e(new su2() { // from class: tie
            @Override // p000.su2
            public final void accept(Object obj) {
                vie.lambda$hasPendingOverlayMigration$2(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    @Override // p000.o9c
    public void run() {
        buildOverlays();
    }
}
