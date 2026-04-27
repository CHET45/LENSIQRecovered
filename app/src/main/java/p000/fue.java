package p000;

import android.widget.SeekBar;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@oe8({@ne8(attribute = "android:progress", type = SeekBar.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class fue {

    /* JADX INFO: renamed from: fue$a */
    public class C5991a implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5992b f37784a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ me8 f37785b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC5993c f37786c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5994d f37787d;

        public C5991a(InterfaceC5992b interfaceC5992b, me8 me8Var, InterfaceC5993c interfaceC5993c, InterfaceC5994d interfaceC5994d) {
            this.f37784a = interfaceC5992b;
            this.f37785b = me8Var;
            this.f37786c = interfaceC5993c;
            this.f37787d = interfaceC5994d;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            InterfaceC5992b interfaceC5992b = this.f37784a;
            if (interfaceC5992b != null) {
                interfaceC5992b.onProgressChanged(seekBar, i, z);
            }
            me8 me8Var = this.f37785b;
            if (me8Var != null) {
                me8Var.onChange();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            InterfaceC5993c interfaceC5993c = this.f37786c;
            if (interfaceC5993c != null) {
                interfaceC5993c.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            InterfaceC5994d interfaceC5994d = this.f37787d;
            if (interfaceC5994d != null) {
                interfaceC5994d.onStopTrackingTouch(seekBar);
            }
        }
    }

    /* JADX INFO: renamed from: fue$b */
    public interface InterfaceC5992b {
        void onProgressChanged(SeekBar seekBar, int i, boolean z);
    }

    /* JADX INFO: renamed from: fue$c */
    public interface InterfaceC5993c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    /* JADX INFO: renamed from: fue$d */
    public interface InterfaceC5994d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @q21(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void setOnSeekBarChangeListener(SeekBar seekBar, InterfaceC5993c interfaceC5993c, InterfaceC5994d interfaceC5994d, InterfaceC5992b interfaceC5992b, me8 me8Var) {
        if (interfaceC5993c == null && interfaceC5994d == null && interfaceC5992b == null && me8Var == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new C5991a(interfaceC5992b, me8Var, interfaceC5993c, interfaceC5994d));
        }
    }

    @q21({"android:progress"})
    public static void setProgress(SeekBar seekBar, int i) {
        if (i != seekBar.getProgress()) {
            seekBar.setProgress(i);
        }
    }
}
