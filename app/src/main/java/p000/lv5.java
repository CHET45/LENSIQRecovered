package p000;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p000.av5;
import p000.dic;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class lv5<T extends av5<T>> implements dic.InterfaceC4797a<T> {

    /* JADX INFO: renamed from: a */
    public final dic.InterfaceC4797a<? extends T> f58871a;

    /* JADX INFO: renamed from: b */
    @hib
    public final List<StreamKey> f58872b;

    public lv5(dic.InterfaceC4797a<? extends T> interfaceC4797a, @hib List<StreamKey> list) {
        this.f58871a = interfaceC4797a;
        this.f58872b = list;
    }

    @Override // p000.dic.InterfaceC4797a
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t = this.f58871a.parse(uri, inputStream);
        List<StreamKey> list = this.f58872b;
        return (list == null || list.isEmpty()) ? t : (T) t.copy(this.f58872b);
    }
}
