package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public class k0c {

    /* JADX INFO: renamed from: c */
    public static final int f52331c = 64;

    /* JADX INFO: renamed from: a */
    public final Logger f52332a;

    /* JADX INFO: renamed from: b */
    public final Level f52333b;

    /* JADX INFO: renamed from: k0c$a */
    public enum EnumC8155a {
        INBOUND,
        OUTBOUND
    }

    /* JADX INFO: renamed from: k0c$b */
    public enum EnumC8156b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: a */
        public final int f52344a;

        EnumC8156b(int i) {
            this.f52344a = i;
        }

        public int getBit() {
            return this.f52344a;
        }
    }

    public k0c(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean isEnabled() {
        return this.f52332a.isLoggable(this.f52333b);
    }

    private static String toString(b7f b7fVar) {
        EnumMap enumMap = new EnumMap(EnumC8156b.class);
        for (EnumC8156b enumC8156b : EnumC8156b.values()) {
            if (b7fVar.isSet(enumC8156b.getBit())) {
                enumMap.put(enumC8156b, Integer.valueOf(b7fVar.get(enumC8156b.getBit())));
            }
        }
        return enumMap.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m14427a(EnumC8155a enumC8155a, int i, Buffer buffer, int i2, boolean z) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + toString(buffer));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14428b(EnumC8155a enumC8155a, int i, w45 w45Var, ByteString byteString) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " GO_AWAY: lastStreamId=" + i + " errorCode=" + w45Var + " length=" + byteString.size() + " bytes=" + toString(new Buffer().write(byteString)));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14429c(EnumC8155a enumC8155a, int i, List<ei7> list, boolean z) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " HEADERS: streamId=" + i + " headers=" + list + " endStream=" + z);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14430d(EnumC8155a enumC8155a, long j) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " PING: ack=false bytes=" + j);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14431e(EnumC8155a enumC8155a, long j) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " PING: ack=true bytes=" + j);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14432f(EnumC8155a enumC8155a, int i, int i2, List<ei7> list) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14433g(EnumC8155a enumC8155a, int i, w45 w45Var) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " RST_STREAM: streamId=" + i + " errorCode=" + w45Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m14434h(EnumC8155a enumC8155a, b7f b7fVar) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " SETTINGS: ack=false settings=" + toString(b7fVar));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m14435i(EnumC8155a enumC8155a) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " SETTINGS: ack=true");
        }
    }

    /* JADX INFO: renamed from: j */
    public void m14436j(EnumC8155a enumC8155a, int i, long j) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }

    public void logPriority(EnumC8155a enumC8155a, int i, int i2, int i3, boolean z) {
        if (isEnabled()) {
            this.f52332a.log(this.f52333b, enumC8155a + " PRIORITY: streamId=" + i + " streamDependency=" + i2 + " weight=" + i3 + " exclusive=" + z);
        }
    }

    @gdi
    public k0c(Level level, Logger logger) {
        this.f52333b = (Level) v7d.checkNotNull(level, FirebaseAnalytics.C3552d.f23228t);
        this.f52332a = (Logger) v7d.checkNotNull(logger, "logger");
    }

    private static String toString(Buffer buffer) {
        if (buffer.size() <= 64) {
            return buffer.snapshot().hex();
        }
        return buffer.snapshot((int) Math.min(buffer.size(), 64L)).hex() + "...";
    }
}
