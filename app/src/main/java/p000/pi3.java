package p000;

import android.database.SQLException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pi3 extends IOException {
    public pi3(SQLException sQLException) {
        super(sQLException);
    }

    public pi3(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
