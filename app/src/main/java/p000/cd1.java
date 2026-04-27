package p000;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.t98;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class cd1 implements t98.InterfaceC12958a, t98.InterfaceC12959b {

    /* JADX INFO: renamed from: a */
    public static final String f16272a = "BreakpointInterceptor";

    /* JADX INFO: renamed from: b */
    public static final Pattern f16273b = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    @h78(from = -1)
    /* JADX INFO: renamed from: b */
    public static long m3893b(@efb String str) {
        Matcher matcher = f16273b.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @p000.h78(from = -1)
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long m3894a(@p000.efb p000.zk4.InterfaceC16164a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Content-Range"
            java.lang.String r0 = r7.getResponseHeaderField(r0)
            boolean r1 = p000.q0i.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L1a
            long r0 = m3893b(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            r4 = 1
            long r0 = r0 + r4
            goto L1c
        L1a:
            r0 = -1
        L1c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L30
            java.lang.String r2 = "Content-Length"
            java.lang.String r7 = r7.getResponseHeaderField(r2)
            boolean r2 = p000.q0i.isEmpty(r7)
            if (r2 != 0) goto L30
            long r0 = java.lang.Long.parseLong(r7)
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cd1.m3894a(zk4$a):long");
    }

    @Override // p000.t98.InterfaceC12958a
    @efb
    public zk4.InterfaceC16164a interceptConnect(yk4 yk4Var) throws IOException {
        zk4.InterfaceC16164a interfaceC16164aProcessConnect = yk4Var.processConnect();
        bd1 info = yk4Var.getInfo();
        if (yk4Var.getCache().isInterrupt()) {
            throw nc8.f63949a;
        }
        if (info.getBlockCount() == 1 && !info.isChunked()) {
            long jM3894a = m3894a(interfaceC16164aProcessConnect);
            long totalLength = info.getTotalLength();
            if (jM3894a > 0 && jM3894a != totalLength) {
                q0i.m19913d(f16272a, "SingleBlock special check: the response instance-length[" + jM3894a + "] isn't equal to the instance length from trial-connection[" + totalLength + "]");
                boolean z = info.getBlock(0).getRangeLeft() != 0;
                h61 h61Var = new h61(0L, jM3894a);
                info.resetBlockInfos();
                info.addBlock(h61Var);
                if (z) {
                    q0i.m19916w(f16272a, "Discard breakpoint because of on this special case, we have to download from beginning");
                    throw new p8e("Discard breakpoint because of on this special case, we have to download from beginning");
                }
                e0c.with().callbackDispatcher().dispatch().downloadFromBeginning(yk4Var.getTask(), info, c8e.CONTENT_LENGTH_CHANGED);
            }
        }
        try {
            if (yk4Var.getDownloadStore().update(info)) {
                return interfaceC16164aProcessConnect;
            }
            throw new IOException("Update store failed!");
        } catch (Exception e) {
            throw new IOException("Update store failed!", e);
        }
    }

    @Override // p000.t98.InterfaceC12959b
    public long interceptFetch(yk4 yk4Var) throws IOException {
        long responseContentLength = yk4Var.getResponseContentLength();
        int blockIndex = yk4Var.getBlockIndex();
        boolean z = responseContentLength != -1;
        z2b outputStream = yk4Var.getOutputStream();
        long j = 0;
        while (true) {
            try {
                long jLoopFetch = yk4Var.loopFetch();
                if (jLoopFetch == -1) {
                    break;
                }
                j += jLoopFetch;
            } finally {
                yk4Var.flushNoCallbackIncreaseBytes();
                if (!yk4Var.getCache().isUserCanceled()) {
                    outputStream.done(blockIndex);
                }
            }
        }
        if (z) {
            outputStream.inspectComplete(blockIndex);
            if (j != responseContentLength) {
                throw new IOException("Fetch-length isn't equal to the response content-length, " + j + "!= " + responseContentLength);
            }
        }
        return j;
    }
}
