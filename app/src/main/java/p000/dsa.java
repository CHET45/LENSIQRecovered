package p000;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class dsa {

    /* JADX INFO: renamed from: a */
    public static boolean f30597a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f30598b = true;

    /* JADX INFO: renamed from: dsa$a */
    @c5e(22)
    public static class C4931a {
        private C4931a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m9342a(Message message) {
            return message.isAsynchronous();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m9343b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    private dsa() {
    }

    @igg({"NewApi"})
    public static boolean isAsynchronous(@efb Message message) {
        return C4931a.m9342a(message);
    }

    @igg({"NewApi"})
    public static void setAsynchronous(@efb Message message, boolean z) {
        C4931a.m9343b(message, z);
    }
}
