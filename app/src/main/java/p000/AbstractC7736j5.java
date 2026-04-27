package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: j5 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC7736j5 extends jii {
    private ScheduledFuture connectionLostCheckerFuture;
    private ScheduledExecutorService connectionLostCheckerService;
    private boolean reuseAddr;
    private boolean tcpNoDelay;
    private final jj9 log = kj9.getLogger((Class<?>) AbstractC7736j5.class);
    private long connectionLostTimeout = TimeUnit.SECONDS.toNanos(60);
    private boolean websocketRunning = false;
    private final Object syncConnectionLost = new Object();

    /* JADX INFO: renamed from: j5$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public ArrayList<iii> f49533a = new ArrayList<>();

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f49533a.clear();
            try {
                this.f49533a.addAll(AbstractC7736j5.this.getConnections());
                long jNanoTime = (long) (System.nanoTime() - (AbstractC7736j5.this.connectionLostTimeout * 1.5d));
                Iterator<iii> it = this.f49533a.iterator();
                while (it.hasNext()) {
                    AbstractC7736j5.this.executeConnectionLostDetection(it.next(), jNanoTime);
                }
            } catch (Exception unused) {
            }
            this.f49533a.clear();
        }
    }

    private void cancelConnectionLostTimer() {
        ScheduledExecutorService scheduledExecutorService = this.connectionLostCheckerService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.connectionLostCheckerService = null;
        }
        ScheduledFuture scheduledFuture = this.connectionLostCheckerFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.connectionLostCheckerFuture = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeConnectionLostDetection(iii iiiVar, long j) {
        if (iiiVar instanceof mii) {
            mii miiVar = (mii) iiiVar;
            if (miiVar.m17335b() < j) {
                this.log.trace("Closing connection due to no pong received: {}", miiVar);
                miiVar.closeConnection(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (miiVar.isOpen()) {
                miiVar.sendPing();
            } else {
                this.log.trace("Trying to ping a non open connection: {}", miiVar);
            }
        }
    }

    private void restartConnectionLostTimer() {
        cancelConnectionLostTimer();
        this.connectionLostCheckerService = Executors.newSingleThreadScheduledExecutor(new f9b("connectionLostChecker"));
        a aVar = new a();
        ScheduledExecutorService scheduledExecutorService = this.connectionLostCheckerService;
        long j = this.connectionLostTimeout;
        this.connectionLostCheckerFuture = scheduledExecutorService.scheduleAtFixedRate(aVar, j, j, TimeUnit.NANOSECONDS);
    }

    public int getConnectionLostTimeout() {
        int seconds;
        synchronized (this.syncConnectionLost) {
            seconds = (int) TimeUnit.NANOSECONDS.toSeconds(this.connectionLostTimeout);
        }
        return seconds;
    }

    public abstract Collection<iii> getConnections();

    public boolean isReuseAddr() {
        return this.reuseAddr;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setConnectionLostTimeout(int i) {
        synchronized (this.syncConnectionLost) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(i);
                this.connectionLostTimeout = nanos;
                if (nanos <= 0) {
                    this.log.trace("Connection lost timer stopped");
                    cancelConnectionLostTimer();
                    return;
                }
                if (this.websocketRunning) {
                    this.log.trace("Connection lost timer restarted");
                    try {
                        for (iii iiiVar : new ArrayList(getConnections())) {
                            if (iiiVar instanceof mii) {
                                ((mii) iiiVar).updateLastPong();
                            }
                        }
                    } catch (Exception e) {
                        this.log.error("Exception during connection lost restart", (Throwable) e);
                    }
                    restartConnectionLostTimer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setReuseAddr(boolean z) {
        this.reuseAddr = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    public void startConnectionLostTimer() {
        synchronized (this.syncConnectionLost) {
            try {
                if (this.connectionLostTimeout <= 0) {
                    this.log.trace("Connection lost timer deactivated");
                    return;
                }
                this.log.trace("Connection lost timer started");
                this.websocketRunning = true;
                restartConnectionLostTimer();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopConnectionLostTimer() {
        synchronized (this.syncConnectionLost) {
            try {
                if (this.connectionLostCheckerService != null || this.connectionLostCheckerFuture != null) {
                    this.websocketRunning = false;
                    this.log.trace("Connection lost timer stopped");
                    cancelConnectionLostTimer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
