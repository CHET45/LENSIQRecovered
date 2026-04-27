package p000;

import android.database.Cursor;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public class zfe implements mg1 {

    /* JADX INFO: renamed from: a */
    public final yie f105023a;

    /* JADX INFO: renamed from: b */
    public final ud9 f105024b;

    public zfe(yie yieVar, ud9 ud9Var) {
        this.f105023a = yieVar;
        this.f105024b = ud9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ah1 lambda$getBundleMetadata$0(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new ah1(str, cursor.getInt(0), new euf(new Timestamp(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c9b lambda$getNamedQuery$1(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            return new c9b(str, this.f105024b.decodeBundledQuery(sh1.parseFrom(cursor.getBlob(2))), new euf(new Timestamp(cursor.getLong(0), cursor.getInt(1))));
        } catch (ce8 e) {
            throw r80.fail("NamedQuery failed to parse: %s", e);
        }
    }

    @Override // p000.mg1
    @hib
    public ah1 getBundleMetadata(final String str) {
        return (ah1) this.f105023a.m26113t("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").m26119b(str).m26121d(new pz6() { // from class: xfe
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return zfe.lambda$getBundleMetadata$0(str, (Cursor) obj);
            }
        });
    }

    @Override // p000.mg1
    @hib
    public c9b getNamedQuery(final String str) {
        return (c9b) this.f105023a.m26113t("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").m26119b(str).m26121d(new pz6() { // from class: yfe
            @Override // p000.pz6
            public final Object apply(Object obj) {
                return this.f101407a.lambda$getNamedQuery$1(str, (Cursor) obj);
            }
        });
    }

    @Override // p000.mg1
    public void saveBundleMetadata(ah1 ah1Var) {
        this.f105023a.m26109p("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", ah1Var.getBundleId(), Integer.valueOf(ah1Var.getSchemaVersion()), Long.valueOf(ah1Var.getCreateTime().getTimestamp().getSeconds()), Integer.valueOf(ah1Var.getCreateTime().getTimestamp().getNanoseconds()), Integer.valueOf(ah1Var.getTotalDocuments()), Long.valueOf(ah1Var.getTotalBytes()));
    }

    @Override // p000.mg1
    public void saveNamedQuery(c9b c9bVar) {
        this.f105023a.m26109p("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", c9bVar.getName(), Long.valueOf(c9bVar.getReadTime().getTimestamp().getSeconds()), Integer.valueOf(c9bVar.getReadTime().getTimestamp().getNanoseconds()), this.f105024b.encodeBundledQuery(c9bVar.getBundledQuery()).toByteArray());
    }
}
