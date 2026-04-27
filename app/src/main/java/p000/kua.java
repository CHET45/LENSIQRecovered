package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import p000.nja;
import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kua {

    /* JADX INFO: renamed from: kua$b */
    public static final class C8527b {

        /* JADX INFO: renamed from: e */
        public static final int f55346e = 0;

        /* JADX INFO: renamed from: f */
        public static final int f55347f = 1;

        /* JADX INFO: renamed from: g */
        public static final int f55348g = 2;

        /* JADX INFO: renamed from: h */
        public static final int f55349h = 3;

        /* JADX INFO: renamed from: a */
        public final vna.InterfaceC14174a f55350a;

        /* JADX INFO: renamed from: b */
        public final HandlerThread f55351b;

        /* JADX INFO: renamed from: c */
        public final pe7 f55352c;

        /* JADX INFO: renamed from: d */
        public final y6f<m6h> f55353d;

        /* JADX INFO: renamed from: kua$b$a */
        public final class a implements Handler.Callback {

            /* JADX INFO: renamed from: e */
            public static final int f55354e = 100;

            /* JADX INFO: renamed from: a */
            public final C16458a f55355a = new C16458a();

            /* JADX INFO: renamed from: b */
            public vna f55356b;

            /* JADX INFO: renamed from: c */
            public nja f55357c;

            /* JADX INFO: renamed from: kua$b$a$a, reason: collision with other inner class name */
            public final class C16458a implements vna.InterfaceC14176c {

                /* JADX INFO: renamed from: a */
                public final C16459a f55359a = new C16459a();

                /* JADX INFO: renamed from: b */
                public final InterfaceC6430gn f55360b = new mm3(true, 65536);

                /* JADX INFO: renamed from: c */
                public boolean f55361c;

                /* JADX INFO: renamed from: kua$b$a$a$a, reason: collision with other inner class name */
                public final class C16459a implements nja.InterfaceC9906a {
                    private C16459a() {
                    }

                    @Override // p000.nja.InterfaceC9906a
                    public void onPrepared(nja njaVar) {
                        C8527b.this.f55353d.set(njaVar.getTrackGroups());
                        C8527b.this.f55352c.obtainMessage(3).sendToTarget();
                    }

                    @Override // p000.zye.InterfaceC16321a
                    public void onContinueLoadingRequested(nja njaVar) {
                        C8527b.this.f55352c.obtainMessage(2).sendToTarget();
                    }
                }

                public C16458a() {
                }

                @Override // p000.vna.InterfaceC14176c
                public void onSourceInfoRefreshed(vna vnaVar, t1h t1hVar) {
                    if (this.f55361c) {
                        return;
                    }
                    this.f55361c = true;
                    a.this.f55357c = vnaVar.createPeriod(new vna.C14175b(t1hVar.getUidOfPeriod(0)), this.f55360b, 0L);
                    a.this.f55357c.prepare(this.f55359a, 0L);
                }
            }

            public a() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    vna vnaVarCreateMediaSource = C8527b.this.f55350a.createMediaSource((aga) message.obj);
                    this.f55356b = vnaVarCreateMediaSource;
                    vnaVarCreateMediaSource.prepareSource(this.f55355a, null, k0d.f52345b);
                    C8527b.this.f55352c.sendEmptyMessage(1);
                    return true;
                }
                if (i == 1) {
                    try {
                        nja njaVar = this.f55357c;
                        if (njaVar == null) {
                            ((vna) u80.checkNotNull(this.f55356b)).maybeThrowSourceInfoRefreshError();
                        } else {
                            njaVar.maybeThrowPrepareError();
                        }
                        C8527b.this.f55352c.sendEmptyMessageDelayed(1, 100);
                    } catch (Exception e) {
                        C8527b.this.f55353d.setException(e);
                        C8527b.this.f55352c.obtainMessage(3).sendToTarget();
                    }
                    return true;
                }
                if (i == 2) {
                    ((nja) u80.checkNotNull(this.f55357c)).continueLoading(0L);
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                if (this.f55357c != null) {
                    ((vna) u80.checkNotNull(this.f55356b)).releasePeriod(this.f55357c);
                }
                ((vna) u80.checkNotNull(this.f55356b)).releaseSource(this.f55355a);
                C8527b.this.f55352c.removeCallbacksAndMessages(null);
                C8527b.this.f55351b.quit();
                return true;
            }
        }

        public C8527b(vna.InterfaceC14174a interfaceC14174a, h52 h52Var) {
            this.f55350a = interfaceC14174a;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.f55351b = handlerThread;
            handlerThread.start();
            this.f55352c = h52Var.createHandler(handlerThread.getLooper(), new a());
            this.f55353d = y6f.create();
        }

        public ja9<m6h> retrieveMetadata(aga agaVar) {
            this.f55352c.obtainMessage(0, agaVar).sendToTarget();
            return this.f55353d;
        }
    }

    private kua() {
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static ja9<m6h> m15000a(Context context, aga agaVar, h52 h52Var) {
        return retrieveMetadata(new ix3(context, new dv3().setMp4ExtractorFlags(6)), agaVar, h52Var);
    }

    public static ja9<m6h> retrieveMetadata(Context context, aga agaVar) {
        return m15000a(context, agaVar, h52.f42390a);
    }

    public static ja9<m6h> retrieveMetadata(vna.InterfaceC14174a interfaceC14174a, aga agaVar) {
        return retrieveMetadata(interfaceC14174a, agaVar, h52.f42390a);
    }

    private static ja9<m6h> retrieveMetadata(vna.InterfaceC14174a interfaceC14174a, aga agaVar, h52 h52Var) {
        return new C8527b(interfaceC14174a, h52Var).retrieveMetadata(agaVar);
    }
}
