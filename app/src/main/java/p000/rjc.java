package p000;

import java.nio.file.Path;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class rjc {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Path f78471a;

    /* JADX INFO: renamed from: b */
    @gib
    public final Object f78472b;

    /* JADX INFO: renamed from: c */
    @gib
    public final rjc f78473c;

    /* JADX INFO: renamed from: d */
    @gib
    public Iterator<rjc> f78474d;

    public rjc(@yfb Path path, @gib Object obj, @gib rjc rjcVar) {
        md8.checkNotNullParameter(path, "path");
        this.f78471a = path;
        this.f78472b = obj;
        this.f78473c = rjcVar;
    }

    @gib
    public final Iterator<rjc> getContentIterator() {
        return this.f78474d;
    }

    @gib
    public final Object getKey() {
        return this.f78472b;
    }

    @gib
    public final rjc getParent() {
        return this.f78473c;
    }

    @yfb
    public final Path getPath() {
        return this.f78471a;
    }

    public final void setContentIterator(@gib Iterator<rjc> it) {
        this.f78474d = it;
    }
}
