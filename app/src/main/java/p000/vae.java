package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class vae {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final vae f90476a = new vae();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f90477b = "room_master_table";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f90478c = "room_master_table";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f90479d = "id";

    /* JADX INFO: renamed from: e */
    @yfb
    public static final String f90480e = "identity_hash";

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f90481f = "42";

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f90482g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f90483h = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    private vae() {
    }

    @do8
    @yfb
    public static final String createInsertQuery(@yfb String str) {
        md8.checkNotNullParameter(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
