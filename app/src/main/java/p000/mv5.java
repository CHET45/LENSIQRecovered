package p000;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p000.bv5;
import p000.cic;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class mv5<T extends bv5<T>> implements cic.InterfaceC2324a<T> {

    /* JADX INFO: renamed from: a */
    public final cic.InterfaceC2324a<? extends T> f62373a;

    /* JADX INFO: renamed from: b */
    @hib
    public final List<StreamKey> f62374b;

    public mv5(cic.InterfaceC2324a<? extends T> interfaceC2324a, @hib List<StreamKey> list) {
        this.f62373a = interfaceC2324a;
        this.f62374b = list;
    }

    @Override // p000.cic.InterfaceC2324a
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t = this.f62373a.parse(uri, inputStream);
        List<StreamKey> list = this.f62374b;
        return (list == null || list.isEmpty()) ? t : (T) t.copy(this.f62374b);
    }
}
