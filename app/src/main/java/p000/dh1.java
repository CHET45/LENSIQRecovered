package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class dh1 {

    /* JADX INFO: renamed from: g */
    public static final int f29622g = 1024;

    /* JADX INFO: renamed from: h */
    public static final Charset f29623h = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final eh1 f29624a;

    /* JADX INFO: renamed from: b */
    public final InputStream f29625b;

    /* JADX INFO: renamed from: c */
    public final InputStreamReader f29626c;

    /* JADX INFO: renamed from: d */
    @hib
    public ah1 f29627d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f29628e;

    /* JADX INFO: renamed from: f */
    public long f29629f;

    public dh1(eh1 eh1Var, InputStream inputStream) {
        this.f29624a = eh1Var;
        this.f29625b = inputStream;
        this.f29626c = new InputStreamReader(inputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
        this.f29628e = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    private IllegalArgumentException abort(String str) throws IOException {
        close();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    private sg1 decodeBundleElement(String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            ah1 ah1VarDecodeBundleMetadata = this.f29624a.decodeBundleMetadata(jSONObject.getJSONObject("metadata"));
            fj9.debug("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return ah1VarDecodeBundleMetadata;
        }
        if (jSONObject.has("namedQuery")) {
            c9b c9bVarDecodeNamedQuery = this.f29624a.decodeNamedQuery(jSONObject.getJSONObject("namedQuery"));
            fj9.debug("BundleElement", "Query loaded: " + c9bVarDecodeNamedQuery.getName(), new Object[0]);
            return c9bVarDecodeNamedQuery;
        }
        if (jSONObject.has("documentMetadata")) {
            nh1 nh1VarDecodeBundledDocumentMetadata = this.f29624a.decodeBundledDocumentMetadata(jSONObject.getJSONObject("documentMetadata"));
            fj9.debug("BundleElement", "Document metadata loaded: " + nh1VarDecodeBundledDocumentMetadata.getKey(), new Object[0]);
            return nh1VarDecodeBundledDocumentMetadata;
        }
        if (!jSONObject.has("document")) {
            throw abort("Cannot decode unknown Bundle element: " + str);
        }
        qg1 qg1VarM9950a = this.f29624a.m9950a(jSONObject.getJSONObject("document"));
        fj9.debug("BundleElement", "Document loaded: " + qg1VarM9950a.getKey(), new Object[0]);
        return qg1VarM9950a;
    }

    private int indexOfOpenBracket() {
        this.f29628e.mark();
        for (int i = 0; i < this.f29628e.remaining(); i++) {
            try {
                if (this.f29628e.get() == 123) {
                    return i;
                }
            } finally {
                this.f29628e.reset();
            }
        }
        this.f29628e.reset();
        return -1;
    }

    private boolean pullMoreData() throws IOException {
        this.f29628e.compact();
        int i = this.f29625b.read(this.f29628e.array(), this.f29628e.arrayOffset() + this.f29628e.position(), this.f29628e.remaining());
        boolean z = i > 0;
        if (z) {
            ByteBuffer byteBuffer = this.f29628e;
            byteBuffer.position(byteBuffer.position() + i);
        }
        this.f29628e.flip();
        return z;
    }

    private String readJsonString(int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i > 0) {
            if (this.f29628e.remaining() == 0 && !pullMoreData()) {
                throw abort("Reached the end of bundle when more data was expected.");
            }
            int iMin = Math.min(i, this.f29628e.remaining());
            byteArrayOutputStream.write(this.f29628e.array(), this.f29628e.arrayOffset() + this.f29628e.position(), iMin);
            ByteBuffer byteBuffer = this.f29628e;
            byteBuffer.position(byteBuffer.position() + iMin);
            i -= iMin;
        }
        return byteArrayOutputStream.toString(f29623h.name());
    }

    @hib
    private String readLengthPrefix() throws IOException {
        int iIndexOfOpenBracket;
        do {
            iIndexOfOpenBracket = indexOfOpenBracket();
            if (iIndexOfOpenBracket != -1) {
                break;
            }
        } while (pullMoreData());
        if (this.f29628e.remaining() == 0) {
            return null;
        }
        if (iIndexOfOpenBracket == -1) {
            throw abort("Reached the end of bundle when a length string is expected.");
        }
        byte[] bArr = new byte[iIndexOfOpenBracket];
        this.f29628e.get(bArr);
        return f29623h.decode(ByteBuffer.wrap(bArr)).toString();
    }

    @hib
    private sg1 readNextElement() throws JSONException, IOException {
        String lengthPrefix = readLengthPrefix();
        if (lengthPrefix == null) {
            return null;
        }
        int i = Integer.parseInt(lengthPrefix);
        String jsonString = readJsonString(i);
        this.f29629f += (long) (lengthPrefix.getBytes(f29623h).length + i);
        return decodeBundleElement(jsonString);
    }

    public void close() throws IOException {
        this.f29625b.close();
    }

    public ah1 getBundleMetadata() throws JSONException, IOException {
        ah1 ah1Var = this.f29627d;
        if (ah1Var != null) {
            return ah1Var;
        }
        sg1 nextElement = readNextElement();
        if (!(nextElement instanceof ah1)) {
            throw abort("Expected first element in bundle to be a metadata object");
        }
        ah1 ah1Var2 = (ah1) nextElement;
        this.f29627d = ah1Var2;
        this.f29629f = 0L;
        return ah1Var2;
    }

    public long getBytesRead() {
        return this.f29629f;
    }

    public sg1 getNextElement() throws JSONException, IOException {
        getBundleMetadata();
        return readNextElement();
    }
}
