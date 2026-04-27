package p000;

import android.database.SQLException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class oi3 extends IOException {
    public oi3(SQLException sQLException) {
        super(sQLException);
    }

    public oi3(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
