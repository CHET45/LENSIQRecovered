package p000;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import p000.bx2;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
public class vqi {

    /* JADX INFO: renamed from: vqi$a */
    public static /* synthetic */ class C14219a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92020a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f92021b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f92022c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f92023d;

        static {
            int[] iArr = new int[h8c.values().length];
            f92023d = iArr;
            try {
                iArr[h8c.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92023d[h8c.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[wbb.values().length];
            f92022c = iArr2;
            try {
                iArr2[wbb.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92022c[wbb.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92022c[wbb.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92022c[wbb.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92022c[wbb.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[oo0.values().length];
            f92021b = iArr3;
            try {
                iArr3[oo0.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f92021b[oo0.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[tpi.EnumC13161a.values().length];
            f92020a = iArr4;
            try {
                iArr4[tpi.EnumC13161a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f92020a[tpi.EnumC13161a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f92020a[tpi.EnumC13161a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f92020a[tpi.EnumC13161a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f92020a[tpi.EnumC13161a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f92020a[tpi.EnumC13161a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: vqi$b */
    public interface InterfaceC14220b {

        /* JADX INFO: renamed from: a */
        public static final int f92024a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f92025b = 1;
    }

    /* JADX INFO: renamed from: vqi$c */
    public interface InterfaceC14221c {

        /* JADX INFO: renamed from: a */
        public static final int f92026a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f92027b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f92028c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f92029d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f92030e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f92031f = 5;
    }

    /* JADX INFO: renamed from: vqi$d */
    public interface InterfaceC14222d {

        /* JADX INFO: renamed from: a */
        public static final int f92032a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f92033b = 1;
    }

    /* JADX INFO: renamed from: vqi$e */
    public interface InterfaceC14223e {

        /* JADX INFO: renamed from: a */
        public static final int f92034a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f92035b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f92036c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f92037d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f92038e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f92039f = 5;

        /* JADX INFO: renamed from: g */
        public static final String f92040g = "(2, 3, 5)";
    }

    private vqi() {
    }

    @nlh
    public static int backoffPolicyToInt(oo0 backoffPolicy) {
        int i = C14219a.f92021b[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @p000.nlh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.bx2 byteArrayToContentUriTriggers(byte[] r6) throws java.lang.Throwable {
        /*
            bx2 r0 = new bx2
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.add(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.vqi.byteArrayToContentUriTriggers(byte[]):bx2");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0053 -> B:34:0x006a). Please report as a decompilation issue!!! */
    @nlh
    public static byte[] contentUriTriggersToByteArray(bx2 triggers) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        if (triggers.size() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(triggers.size());
                        for (bx2.C2095a c2095a : triggers.getTriggers()) {
                            objectOutputStream2.writeUTF(c2095a.getUri().toString());
                            objectOutputStream2.writeBoolean(c2095a.shouldTriggerForDescendants());
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    @nlh
    public static oo0 intToBackoffPolicy(int value) {
        if (value == 0) {
            return oo0.EXPONENTIAL;
        }
        if (value == 1) {
            return oo0.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @nlh
    public static wbb intToNetworkType(int value) {
        if (value == 0) {
            return wbb.NOT_REQUIRED;
        }
        if (value == 1) {
            return wbb.CONNECTED;
        }
        if (value == 2) {
            return wbb.UNMETERED;
        }
        if (value == 3) {
            return wbb.NOT_ROAMING;
        }
        if (value == 4) {
            return wbb.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return wbb.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @efb
    @nlh
    public static h8c intToOutOfQuotaPolicy(int value) {
        if (value == 0) {
            return h8c.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return h8c.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @nlh
    public static tpi.EnumC13161a intToState(int value) {
        if (value == 0) {
            return tpi.EnumC13161a.ENQUEUED;
        }
        if (value == 1) {
            return tpi.EnumC13161a.RUNNING;
        }
        if (value == 2) {
            return tpi.EnumC13161a.SUCCEEDED;
        }
        if (value == 3) {
            return tpi.EnumC13161a.FAILED;
        }
        if (value == 4) {
            return tpi.EnumC13161a.BLOCKED;
        }
        if (value == 5) {
            return tpi.EnumC13161a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    @nlh
    public static int networkTypeToInt(wbb networkType) {
        int i = C14219a.f92022c[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == wbb.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @nlh
    public static int outOfQuotaPolicyToInt(@efb h8c policy) {
        int i = C14219a.f92023d[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + policy + " to int");
    }

    @nlh
    public static int stateToInt(tpi.EnumC13161a state) {
        switch (C14219a.f92020a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }
}
