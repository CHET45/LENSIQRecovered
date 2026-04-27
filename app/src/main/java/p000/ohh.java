package p000;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import p000.dj2;

/* JADX INFO: loaded from: classes4.dex */
@qpf
@dj2(modules = {vn0.class, v65.class, n85.class, rpe.class, ppe.class, f0h.class})
public abstract class ohh implements Closeable {

    /* JADX INFO: renamed from: ohh$a */
    @dj2.InterfaceC4802a
    public interface InterfaceC10382a {
        ohh build();

        @b31
        InterfaceC10382a setApplicationContext(Context context);
    }

    /* JADX INFO: renamed from: a */
    public abstract t65 mo18709a();

    /* JADX INFO: renamed from: b */
    public abstract nhh mo18710b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo18709a().close();
    }
}
