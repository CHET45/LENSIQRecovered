package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.watchfun.callvideo.bean.CallTransMessage;
import p000.wn1;

/* JADX INFO: loaded from: classes6.dex */
public class s99 {

    /* JADX INFO: renamed from: a */
    public static Integer f81007a;

    /* JADX INFO: renamed from: b */
    public static float f81008b;

    /* JADX INFO: renamed from: c */
    public static boolean f81009c;

    /* JADX INFO: renamed from: s99$a */
    public class ViewOnTouchListenerC12493a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f81010a;

        public ViewOnTouchListenerC12493a(RecyclerView recyclerView) {
            this.f81010a = recyclerView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                float unused = s99.f81008b = motionEvent.getY();
                return false;
            }
            if (action != 1) {
                if (action == 2) {
                    boolean unused2 = s99.f81009c = Math.abs(motionEvent.getY() - s99.f81008b) < ((float) s99.f81007a.intValue());
                }
            } else if (s99.f81009c) {
                s99.changeListVisible(this.f81010a, "RecyclerView.ACTION_UP");
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: s99$b */
    public class C12494b implements wn1.InterfaceC14696a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f81011a;

        public C12494b(RecyclerView recyclerView) {
            this.f81011a = recyclerView;
        }

        @Override // p000.wn1.InterfaceC14696a
        public void onItemLongClick(View view, int i, CallTransMessage callTransMessage, boolean z) {
            s99.changeListVisible(this.f81011a, "Adapter.setOnItemClickListener");
        }
    }

    /* JADX INFO: renamed from: s99$c */
    public class ViewOnClickListenerC12495c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView f81012a;

        public ViewOnClickListenerC12495c(RecyclerView recyclerView) {
            this.f81012a = recyclerView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s99.changeListVisible(this.f81012a, "touchView.setOnClickListener");
        }
    }

    @igg({"ClickableViewAccessibility"})
    public static void bindingRecyclerView(RecyclerView recyclerView, View view) {
        if (f81007a == null) {
            f81007a = Integer.valueOf(ViewConfiguration.get(recyclerView.getContext()).getScaledEdgeSlop());
        }
        recyclerView.setOnTouchListener(new ViewOnTouchListenerC12493a(recyclerView));
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof wn1) {
            ((wn1) adapter).setOnItemClickListener(new C12494b(recyclerView));
        }
        recyclerView.getParent();
        view.setOnClickListener(new ViewOnClickListenerC12495c(recyclerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void changeListVisible(RecyclerView recyclerView, String str) {
        recyclerView.setVisibility(recyclerView.getVisibility() != 0 ? 0 : 8);
    }
}
