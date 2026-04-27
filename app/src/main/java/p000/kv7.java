package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kv7 {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f55436a = new ArrayList();

    public synchronized void add(@efb ImageHeaderParser imageHeaderParser) {
        this.f55436a.add(imageHeaderParser);
    }

    @efb
    public synchronized List<ImageHeaderParser> getParsers() {
        return this.f55436a;
    }
}
