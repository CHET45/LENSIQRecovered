package p000;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class oo4 {

    /* JADX INFO: renamed from: a */
    public final View f68222a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10479a f68223b;

    /* JADX INFO: renamed from: c */
    public int f68224c;

    /* JADX INFO: renamed from: d */
    public int f68225d;

    /* JADX INFO: renamed from: e */
    public boolean f68226e;

    /* JADX INFO: renamed from: f */
    public final View.OnLongClickListener f68227f = new View.OnLongClickListener() { // from class: mo4
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return this.f61608a.onLongClick(view);
        }
    };

    /* JADX INFO: renamed from: g */
    public final View.OnTouchListener f68228g = new View.OnTouchListener() { // from class: no4
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f65135a.onTouch(view, motionEvent);
        }
    };

    /* JADX INFO: renamed from: oo4$a */
    public interface InterfaceC10479a {
        boolean onDragStart(@efb View view, @efb oo4 oo4Var);
    }

    public oo4(@efb View view, @efb InterfaceC10479a interfaceC10479a) {
        this.f68222a = view;
        this.f68223b = interfaceC10479a;
    }

    public void attach() {
        this.f68222a.setOnLongClickListener(this.f68227f);
        this.f68222a.setOnTouchListener(this.f68228g);
    }

    public void detach() {
        this.f68222a.setOnLongClickListener(null);
        this.f68222a.setOnTouchListener(null);
    }

    public void getTouchPosition(@efb Point point) {
        point.set(this.f68224c, this.f68225d);
    }

    public boolean onLongClick(@efb View view) {
        if (this.f68226e) {
            return true;
        }
        boolean zOnDragStart = this.f68223b.onDragStart(view, this);
        this.f68226e = zOnDragStart;
        return zOnDragStart;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(@p000.efb android.view.View r7, @p000.efb android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = p000.iza.isFromSource(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f68226e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f68224c
            if (r8 != r0) goto L39
            int r8 = r6.f68225d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f68224c = r0
            r6.f68225d = r1
            oo4$a r8 = r6.f68223b
            boolean r7 = r8.onDragStart(r7, r6)
            r6.f68226e = r7
            return r7
        L46:
            r6.f68226e = r3
            goto L4d
        L49:
            r6.f68224c = r0
            r6.f68225d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oo4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
