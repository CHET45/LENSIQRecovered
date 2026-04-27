package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import p000.yie;

/* JADX INFO: loaded from: classes5.dex */
public class lge implements gi4 {

    /* JADX INFO: renamed from: a */
    public final yie f57505a;

    /* JADX INFO: renamed from: b */
    public final ud9 f57506b;

    /* JADX INFO: renamed from: c */
    public final String f57507c;

    public lge(yie yieVar, ud9 ud9Var, syh syhVar) {
        this.f57505a = yieVar;
        this.f57506b = ud9Var;
        this.f57507c = syhVar.isAuthenticated() ? syhVar.getUid() : "";
    }

    private n9c decodeOverlay(byte[] bArr, int i) {
        try {
            return n9c.create(i, this.f57506b.decodeMutation(yri.parseFrom(bArr)));
        } catch (ce8 e) {
            throw r80.fail("Overlay failed to parse: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n9c lambda$getOverlay$0(Cursor cursor) {
        return decodeOverlay(cursor.getBlob(0), cursor.getInt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOverlays$3(int[] iArr, String[] strArr, String[] strArr2, fo0 fo0Var, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        lambda$processSingleCollection$1(fo0Var, map, cursor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processOverlaysInBackground$5(byte[] bArr, int i, Map map) {
        n9c n9cVarDecodeOverlay = decodeOverlay(bArr, i);
        synchronized (map) {
            map.put(n9cVarDecodeOverlay.getKey(), n9cVarDecodeOverlay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: processOverlaysInBackground, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$processSingleCollection$1(fo0 fo0Var, final Map<ci4, n9c> map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i = cursor.getInt(1);
        Runnable runnable = new Runnable() { // from class: gge
            @Override // java.lang.Runnable
            public final void run() {
                this.f39776a.lambda$processOverlaysInBackground$5(blob, i, map);
            }
        };
        if (cursor.isFirst() && cursor.isLast()) {
            runnable.run();
        } else {
            fo0Var.submit(runnable);
        }
    }

    private void processSingleCollection(final Map<ci4, n9c> map, final fo0 fo0Var, s6e s6eVar, List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        yie.C15683b c15683b = new yie.C15683b(this.f57505a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f57507c, j15.m13678c(s6eVar)), list, c0b.f15434d);
        while (c15683b.m26116c()) {
            c15683b.m26117d().m26122e(new su2() { // from class: kge
                @Override // p000.su2
                public final void accept(Object obj) {
                    this.f54021a.lambda$processSingleCollection$1(fo0Var, map, (Cursor) obj);
                }
            });
        }
    }

    private void saveOverlay(int i, ci4 ci4Var, m7b m7bVar) {
        this.f57505a.m26109p("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f57507c, ci4Var.getCollectionGroup(), j15.m13678c(ci4Var.getPath().popLast()), ci4Var.getPath().getLastSegment(), Integer.valueOf(i), this.f57506b.encodeMutation(m7bVar).toByteArray());
    }

    @Override // p000.gi4
    @hib
    public n9c getOverlay(ci4 ci4Var) {
        return (n9c) this.f57505a.m26113t("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").m26119b(this.f57507c, j15.m13678c(ci4Var.getPath().popLast()), ci4Var.getPath().getLastSegment()).m26121d(new pz6() { // from class: jge
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return this.f50499a.lambda$getOverlay$0((Cursor) obj);
            }
        });
    }

    @Override // p000.gi4
    public Map<ci4, n9c> getOverlays(SortedSet<ci4> sortedSet) {
        r80.hardAssert(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        fo0 fo0Var = new fo0();
        s6e collectionPath = s6e.f80844b;
        ArrayList arrayList = new ArrayList();
        for (ci4 ci4Var : sortedSet) {
            if (!collectionPath.equals(ci4Var.getCollectionPath())) {
                processSingleCollection(map, fo0Var, collectionPath, arrayList);
                collectionPath = ci4Var.getCollectionPath();
                arrayList.clear();
            }
            arrayList.add(ci4Var.getDocumentId());
        }
        processSingleCollection(map, fo0Var, collectionPath, arrayList);
        fo0Var.drain();
        return map;
    }

    @Override // p000.gi4
    public void removeOverlaysForBatchId(int i) {
        this.f57505a.m26109p("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f57507c, Integer.valueOf(i));
    }

    @Override // p000.gi4
    public void saveOverlays(int i, Map<ci4, m7b> map) {
        for (Map.Entry<ci4, m7b> entry : map.entrySet()) {
            ci4 key = entry.getKey();
            saveOverlay(i, key, (m7b) x7d.checkNotNull(entry.getValue(), "null value for key: %s", key));
        }
    }

    @Override // p000.gi4
    public Map<ci4, n9c> getOverlays(s6e s6eVar, int i) {
        final HashMap map = new HashMap();
        final fo0 fo0Var = new fo0();
        this.f57505a.m26113t("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").m26119b(this.f57507c, j15.m13678c(s6eVar), Integer.valueOf(i)).m26122e(new su2() { // from class: fge
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f36533a.lambda$getOverlays$2(fo0Var, map, (Cursor) obj);
            }
        });
        fo0Var.drain();
        return map;
    }

    @Override // p000.gi4
    public Map<ci4, n9c> getOverlays(String str, int i, int i2) {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final fo0 fo0Var = new fo0();
        this.f57505a.m26113t("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").m26119b(this.f57507c, str, Integer.valueOf(i), Integer.valueOf(i2)).m26122e(new su2() { // from class: hge
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f43600a.lambda$getOverlays$3(iArr, strArr, strArr2, fo0Var, map, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        yie.C15685d c15685dM26113t = this.f57505a.m26113t("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = this.f57507c;
        String str3 = strArr[0];
        c15685dM26113t.m26119b(str2, str, str3, str3, strArr2[0], Integer.valueOf(iArr[0])).m26122e(new su2() { // from class: ige
            @Override // p000.su2
            public final void accept(Object obj) {
                this.f46975a.lambda$getOverlays$4(fo0Var, map, (Cursor) obj);
            }
        });
        fo0Var.drain();
        return map;
    }
}
