package p000;

import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes7.dex */
public interface v2i {
    uhd getProtocol();

    gv6 newReader(BufferedSource bufferedSource, boolean z);

    kv6 newWriter(BufferedSink bufferedSink, boolean z);
}
