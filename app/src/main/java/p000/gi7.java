package p000;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.t98;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class gi7 implements t98.InterfaceC12958a {

    /* JADX INFO: renamed from: a */
    public static final String f39870a = "HeaderInterceptor";

    @Override // p000.t98.InterfaceC12958a
    @efb
    public zk4.InterfaceC16164a interceptConnect(yk4 yk4Var) throws IOException {
        bd1 info = yk4Var.getInfo();
        zk4 connectionOrCreate = yk4Var.getConnectionOrCreate();
        cn4 task = yk4Var.getTask();
        Map<String, List<String>> headerMapFields = task.getHeaderMapFields();
        if (headerMapFields != null) {
            q0i.addUserRequestHeaderField(headerMapFields, connectionOrCreate);
        }
        if (headerMapFields == null || !headerMapFields.containsKey("User-Agent")) {
            q0i.addDefaultUserAgent(connectionOrCreate);
        }
        int blockIndex = yk4Var.getBlockIndex();
        h61 block = info.getBlock(blockIndex);
        if (block == null) {
            throw new IOException("No block-info found on " + blockIndex);
        }
        connectionOrCreate.addHeader("Range", ("bytes=" + block.getRangeLeft() + "-") + block.getRangeRight());
        q0i.m19913d(f39870a, "AssembleHeaderRange (" + task.getId() + ") block(" + blockIndex + ") downloadFrom(" + block.getRangeLeft() + ") currentOffset(" + block.getCurrentOffset() + c0b.f15434d);
        String etag = info.getEtag();
        if (!q0i.isEmpty(etag)) {
            connectionOrCreate.addHeader("If-Match", etag);
        }
        if (yk4Var.getCache().isInterrupt()) {
            throw nc8.f63949a;
        }
        e0c.with().callbackDispatcher().dispatch().connectStart(task, blockIndex, connectionOrCreate.getRequestProperties());
        zk4.InterfaceC16164a interfaceC16164aProcessConnect = yk4Var.processConnect();
        if (yk4Var.getCache().isInterrupt()) {
            throw nc8.f63949a;
        }
        Map<String, List<String>> responseHeaderFields = interfaceC16164aProcessConnect.getResponseHeaderFields();
        if (responseHeaderFields == null) {
            responseHeaderFields = new HashMap<>();
        }
        e0c.with().callbackDispatcher().dispatch().connectEnd(task, blockIndex, interfaceC16164aProcessConnect.getResponseCode(), responseHeaderFields);
        e0c.with().downloadStrategy().resumeAvailableResponseCheck(interfaceC16164aProcessConnect, blockIndex, info).inspect();
        String responseHeaderField = interfaceC16164aProcessConnect.getResponseHeaderField("Content-Length");
        yk4Var.setResponseContentLength((responseHeaderField == null || responseHeaderField.length() == 0) ? q0i.parseContentLengthFromContentRange(interfaceC16164aProcessConnect.getResponseHeaderField("Content-Range")) : q0i.parseContentLength(responseHeaderField));
        return interfaceC16164aProcessConnect;
    }
}
