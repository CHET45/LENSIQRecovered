package p000;

/* JADX INFO: loaded from: classes7.dex */
public enum w45 {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);


    /* JADX INFO: renamed from: a */
    public final int f93214a;

    /* JADX INFO: renamed from: b */
    public final int f93215b;

    /* JADX INFO: renamed from: c */
    public final int f93216c;

    w45(int i, int i2, int i3) {
        this.f93214a = i;
        this.f93215b = i2;
        this.f93216c = i3;
    }

    public static w45 fromHttp2(int i) {
        for (w45 w45Var : values()) {
            if (w45Var.f93214a == i) {
                return w45Var;
            }
        }
        return null;
    }

    public static w45 fromSpdy3Rst(int i) {
        for (w45 w45Var : values()) {
            if (w45Var.f93215b == i) {
                return w45Var;
            }
        }
        return null;
    }

    public static w45 fromSpdyGoAway(int i) {
        for (w45 w45Var : values()) {
            if (w45Var.f93216c == i) {
                return w45Var;
            }
        }
        return null;
    }
}
