package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_bt_ota.impl.AbstractC3831a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class og3 implements tp7 {

    /* JADX INFO: renamed from: b */
    public final AbstractC3831a f67569b;

    /* JADX INFO: renamed from: c */
    public final kqd f67570c;

    /* JADX INFO: renamed from: e */
    public final HandlerThread f67572e;

    /* JADX INFO: renamed from: f */
    public final Handler f67573f;

    /* JADX INFO: renamed from: g */
    public final Handler f67574g;

    /* JADX INFO: renamed from: a */
    public final String f67568a = og3.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    public final rg3 f67571d = new rg3();

    /* JADX INFO: renamed from: og3$a */
    public class RunnableC10365a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final qg3 f67575a;

        public RunnableC10365a(qg3 qg3Var) {
            this.f67575a = qg3Var;
            qg3Var.setSendTime(System.currentTimeMillis());
        }

        @Override // java.lang.Runnable
        public void run() {
            xs0 basePacket = this.f67575a.getBasePacket();
            dh8.m9160w(og3.this.f67568a, "send data timeout  --> opCode : " + basePacket.getOpCode() + ", sn : " + basePacket.getOpCodeSn() + ", resend Count : " + this.f67575a.getReSendCount());
            if (this.f67575a.getReSendCount() < 3) {
                qg3 qg3Var = this.f67575a;
                qg3Var.setReSendCount(qg3Var.getReSendCount() + 1);
                og3.this.f67571d.remove(this.f67575a);
                og3.this.addSendData(this.f67575a);
                return;
            }
            og3.this.f67571d.remove(this.f67575a);
            og3.this.f67569b.removeCacheCommand(this.f67575a.getDevice(), this.f67575a.getBasePacket());
            og3.this.m18640a(this.f67575a, mjb.buildError(u45.f86791o));
        }
    }

    public og3(@efb AbstractC3831a abstractC3831a) {
        HandlerThread handlerThread = new HandlerThread("DataHandlerModify");
        this.f67572e = handlerThread;
        this.f67574g = new Handler(Looper.getMainLooper());
        this.f67569b = abstractC3831a;
        this.f67570c = new kqd();
        handlerThread.start();
        this.f67573f = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: ng3
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return og3.m18642a(message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m18642a(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof Runnable)) {
            return true;
        }
        ((Runnable) obj).run();
        return true;
    }

    @Override // p000.tp7
    public void addRecvData(final qg3 qg3Var) {
        this.f67573f.post(new Runnable() { // from class: jg3
            @Override // java.lang.Runnable
            public final void run() {
                this.f50464a.m18639a(qg3Var);
            }
        });
    }

    @Override // p000.tp7
    public void addSendData(final qg3 qg3Var) {
        qg3Var.setSendTime(m18638a());
        this.f67573f.post(new Runnable() { // from class: mg3
            @Override // java.lang.Runnable
            public final void run() {
                this.f60932a.m18644b(qg3Var);
            }
        });
    }

    @Override // p000.tp7
    public void release() {
        this.f67573f.removeCallbacksAndMessages(null);
        this.f67570c.release();
        this.f67571d.clear();
        if (this.f67572e.isInterrupted()) {
            return;
        }
        this.f67572e.quitSafely();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m18644b(qg3 qg3Var) {
        if (!m18649c(qg3Var)) {
            m18640a(qg3Var, mjb.buildError(u45.f86787k));
            return;
        }
        if (qg3Var.getBasePacket().getHasResponse() == 1) {
            this.f67571d.add(qg3Var);
            Handler handler = this.f67573f;
            handler.sendMessageDelayed(handler.obtainMessage(m18650d(qg3Var), new RunnableC10365a(qg3Var)), qg3Var.getTimeoutMs());
            return;
        }
        xs0 basePacket = qg3Var.getBasePacket();
        int opCodeSn = basePacket.getOpCodeSn();
        basePacket.setOpCodeSn(256);
        ob2 ob2VarConvert2Command = qhc.convert2Command(basePacket, this.f67569b.getCacheCommand(qg3Var.getDevice(), basePacket));
        if (ob2VarConvert2Command != null) {
            ob2VarConvert2Command.setOpCodeSn(opCodeSn);
        }
        m18641a(qg3Var, ob2VarConvert2Command);
    }

    /* JADX INFO: renamed from: c */
    private boolean m18649c(qg3 qg3Var) {
        byte[] bArrPackSendBasePacket = qhc.packSendBasePacket(qg3Var.getBasePacket());
        if (bArrPackSendBasePacket == null) {
            dh8.m9156i(this.f67568a, "send data :: pack data error.");
            return false;
        }
        int iM18637a = m18637a(qg3Var.getDevice());
        if (bArrPackSendBasePacket.length > iM18637a) {
            dh8.m9154e(this.f67568a, "send data over communication mtu [" + iM18637a + "] limit.");
            return false;
        }
        boolean zSendDataToDevice = false;
        for (int i = 0; i < 3 && !(zSendDataToDevice = this.f67569b.sendDataToDevice(qg3Var.getDevice(), bArrPackSendBasePacket)); i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dh8.m9156i(this.f67568a, "send ret : " + zSendDataToDevice);
        return zSendDataToDevice;
    }

    /* JADX INFO: renamed from: d */
    private int m18650d(qg3 qg3Var) {
        if (qg3Var == null) {
            return Integer.MAX_VALUE;
        }
        return qg3Var.getBasePacket().getOpCode() | (qg3Var.getBasePacket().getOpCodeSn() << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m18639a(qg3 qg3Var) {
        ArrayList<xs0> arrayListFindPacketData = this.f67570c.findPacketData(m18643b(qg3Var.getDevice()), qg3Var.getRecvData());
        if (arrayListFindPacketData != null && !arrayListFindPacketData.isEmpty()) {
            int size = arrayListFindPacketData.size();
            int i = 0;
            while (i < size) {
                xs0 xs0Var = arrayListFindPacketData.get(i);
                i++;
                xs0 xs0Var2 = xs0Var;
                byte[] bArrPackSendBasePacket = qhc.packSendBasePacket(xs0Var2);
                if (xs0Var2.getType() == 1) {
                    this.f67569b.receiveDataFromDevice(qg3Var.getDevice(), bArrPackSendBasePacket);
                } else {
                    qg3 dataInfo = this.f67571d.getDataInfo(xs0Var2);
                    if (dataInfo == null) {
                        dh8.m9160w(this.f67568a, "addRecvData : not found cache data info. " + xs0Var2);
                    } else {
                        ob2 ob2VarConvert2Command = qhc.convert2Command(xs0Var2, this.f67569b.getCacheCommand(qg3Var.getDevice(), xs0Var2));
                        if (ob2VarConvert2Command == null) {
                            cr0 cr0VarBuildError = mjb.buildError(u45.f86790n);
                            cr0VarBuildError.setOpCode(xs0Var2.getOpCode());
                            m18640a(dataInfo, cr0VarBuildError);
                        } else {
                            this.f67569b.receiveDataFromDevice(qg3Var.getDevice(), bArrPackSendBasePacket);
                        }
                        this.f67571d.remove(dataInfo);
                        this.f67573f.removeMessages(m18650d(dataInfo));
                        m18641a(dataInfo, ob2VarConvert2Command);
                        this.f67569b.removeCacheCommand(qg3Var.getDevice(), xs0Var2);
                    }
                }
            }
            return;
        }
        dh8.m9160w(this.f67568a, "addRecvData : not found cmd. " + pk1.byte2HexStr(qg3Var.getRecvData()));
    }

    /* JADX INFO: renamed from: b */
    private int m18643b(BluetoothDevice bluetoothDevice) {
        return this.f67569b.getReceiveMtu(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m18645b(qg3 qg3Var, cr0 cr0Var) {
        if (qg3Var.getCallback() != null) {
            qg3Var.getCallback().onErrCode(cr0Var);
        }
        this.f67569b.errorEventCallback(cr0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18646b(qg3 qg3Var, ob2 ob2Var) {
        qg3Var.getCallback().onCommandResponse(ob2Var);
    }

    /* JADX INFO: renamed from: a */
    private long m18638a() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private int m18637a(BluetoothDevice bluetoothDevice) {
        return this.f67569b.getCommunicationMtu(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m18640a(final qg3 qg3Var, final cr0 cr0Var) {
        if (qg3Var == null) {
            dh8.m9151d(this.f67568a, "callError : param is null");
            return;
        }
        if (qg3Var.getBasePacket() != null) {
            cr0Var.setOpCode(qg3Var.getBasePacket().getOpCode());
        }
        dh8.m9160w(this.f67568a, "callError : " + cr0Var);
        this.f67574g.post(new Runnable() { // from class: lg3
            @Override // java.lang.Runnable
            public final void run() {
                this.f57494a.m18645b(qg3Var, cr0Var);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private void m18641a(final qg3 qg3Var, final ob2 ob2Var) {
        if (qg3Var != null && qg3Var.getCallback() != null && ob2Var != null) {
            this.f67574g.post(new Runnable() { // from class: kg3
                @Override // java.lang.Runnable
                public final void run() {
                    og3.m18646b(qg3Var, ob2Var);
                }
            });
            return;
        }
        dh8.m9151d(this.f67568a, " callbackCmd : param is null. " + qg3Var);
    }
}
